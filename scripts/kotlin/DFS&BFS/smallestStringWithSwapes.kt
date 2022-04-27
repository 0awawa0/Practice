

/*
You are given a string s, and an array of pairs of indices in the string pairs where pairs[i] = [a, b] indicates 2 indices(0-indexed) of the string.

You can swap the characters at any pair of indices in the given pairs any number of times.

Return the lexicographically smallest string that s can be changed to after using the swaps.
*/

fun smallestStringWithSwaps(s: String, pairs: List<List<Int>>): String {
    val adjacent = Array<MutableList<Int>>(s.length) { ArrayList<Int>() }
    val visited = BooleanArray(s.length)
        
    for (edge in pairs) {
        val s = edge[0]
        val d = edge[1]
        adjacent[s].add(d)
        adjacent[d].add(s)
    }
        
    fun dfs(node: Int, chars: MutableList<Char>, indices: MutableList<Int>) {
        chars.add(s[node])
        indices.add(node)
        visited[node] = true
            
        for (a in adjacent[node]) if (!visited[a]) dfs(a, chars, indices)
    }
        
    val result = CharArray(s.length)
    for (node in s.indices) {
        if (!visited[node]) {
            val chars = ArrayList<Char>()
            val indices = ArrayList<Int>()
            dfs(node, chars, indices)
            chars.sort()
            indices.sort()
                
            for (i in chars.indices) result[indices[i]] = chars[i]
        }
    }
        
    return String(result)
}