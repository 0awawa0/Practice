

/*
On day 1, one person discovers a secret.

You are given an integer delay, which means that each person will share the secret with a new person every day, starting from delay days after discovering the secret. You are also given an integer forget, which means that each person will forget the secret forget days after discovering it. A person cannot share the secret on the same day they forgot it, or on any day afterwards.

Given an integer n, return the number of people who know the secret at the end of day n. Since the answer may be very large, return it modulo 10^9 + 7.
*/

data class Day(val number: Int, val people: Int)
    
fun peopleAwareOfSecret(n: Int, delay: Int, forget: Int): Int {
    val modulo = 1_000_000_007L
    val days = ArrayList<Day>()
    days.add(Day(1, 1))
    
    for (currDay in 2..n) {
        var sum = 0L
        for (day in days) {
            if (currDay - day.number >= delay && currDay - day.number < forget) 
                sum = (sum + day.people.toLong()) % modulo
        }
        days.add(Day(currDay, sum.toInt()))
    }

    var result = 0L
    for (i in days.lastIndex downTo days.lastIndex - forget + 1) 
        result = (result + days[i].people.toLong()) % modulo
    return result.toInt()
}