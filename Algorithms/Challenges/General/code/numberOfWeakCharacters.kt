
/*
You are playing a game that contains multiple characters, and each of the characters has two main properties: attack and defense. You are given a 2D integer array properties where properties[i] = [attacki, defensei] represents the properties of the ith character in the game.

A character is said to be weak if any other character has both attack and defense levels strictly greater than this character's attack and defense levels. More formally, a character i is said to be weak if there exists another character j where attackj > attacki and defensej > defensei.

Return the number of weak characters.
*/

fun numberOfWeakCharacters(properties: Array<IntArray>): Int {
    val heights = IntArray(100_002)
    
    for (point in properties) heights[point[0]] = maxOf(heights[point[0]], point[1])
    for (x in 100_000 downTo 0) heights[x] = maxOf(heights[x + 1], heights[x])
    
    var count = 0
    for (point in properties) if (point[1] < heights[point[0] + 1]) count++
    return count
}