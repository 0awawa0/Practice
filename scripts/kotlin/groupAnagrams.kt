/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
*/

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val map = HashMap<String, MutableList<String>>()
    for (string in strs) {
        val key = string.toCharArray().sorted().toString()
        if (map[key] == null) map[key] = mutableListOf(string)
        else map[key]?.add(string)
    }
        
    return map.values.toList()
}
