

/*
Design a food rating system that can do the following:

    Modify the rating of a food item listed in the system.
    Return the highest-rated food item for a type of cuisine in the system.

Implement the FoodRatings class:

    FoodRatings(String[] foods, String[] cuisines, int[] ratings) Initializes the system. The food items are described by foods, cuisines and ratings, all of which have a length of n.
        foods[i] is the name of the ith food,
        cuisines[i] is the type of cuisine of the ith food, and
        ratings[i] is the initial rating of the ith food.
    void changeRating(String food, int newRating) Changes the rating of the food item with the name food.
    String highestRated(String cuisine) Returns the name of the food item that has the highest rating for the given type of cuisine. If there is a tie, return the item with the lexicographically smaller name.

Note that a string x is lexicographically smaller than string y if x comes before y in dictionary order, that is, either x is a prefix of y, or if i is the first position such that x[i] != y[i], then x[i] comes before y[i] in alphabetic order.
*/


class FoodRatings(foods: Array<String>, cuisines: Array<String>, ratings: IntArray) {

    val comparator = compareByDescending<Triple<String, String, Int>> { it.third }.thenBy { it.first }
    val cuisines = HashMap<String, TreeSet<Triple<String, String, Int>>>()
    val foodRatings = HashMap<String, Triple<String, String, Int>>()

    init {
        for (i in foods.indices) {
            val triple = Triple(foods[i], cuisines[i], ratings[i])
            if (this.cuisines[triple.second] == null) 
                this.cuisines[triple.second] = TreeSet(comparator)
            this.cuisines[triple.second]!!.add(triple)
            foodRatings[triple.first] = triple
        }
    }

    fun changeRating(food: String, newRating: Int) {
        val oldTriple = foodRatings[food]!!
        val newTriple = Triple(food, oldTriple.second, newRating)
        cuisines[oldTriple.second]!!.remove(oldTriple)
        cuisines[oldTriple.second]!!.add(newTriple)
        foodRatings[food] = newTriple
    }

    fun highestRated(cuisine: String): String {
        return cuisines[cuisine]!!.first().first
    }

}