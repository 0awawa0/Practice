
/*
You are given an array of strings equations that represent relationships between variables where each string equations[i] is of length 4 and takes one of two different forms: "xi==yi" or "xi!=yi".Here, xi and yi are lowercase letters (not necessarily different) that represent one-letter variable names.

Return true if it is possible to assign integers to variable names so as to satisfy all the given equations, or false otherwise.
*/

fun equationsPossible(equations: Array<String>): Boolean {
    val parent = IntArray(26) { it }
    val size = IntArray(26) { 1 }
    
    fun findRoot(a: Int): Int {
        var root = a
        while (parent[root] != root) {
            parent[root] = parent[parent[root]]
            root = parent[root]
        }
        return root
    }
    
    fun connect(a: Int, b: Int) {
        val rootA = findRoot(a)
        val rootB = findRoot(b)
        if (rootA == rootB) return
        if (size[rootA] >= size[rootB]) {
            parent[rootB] = rootA
            size[rootA] += size[rootB]
        } else {
            parent[rootA] = rootB
            size[rootB] += size[rootA]
        }
    }
    
    fun checkConnection(a: Int, b: Int): Boolean = findRoot(a) == findRoot(b)
    
    for (eq in equations)
        if (eq[1] == '=') connect(eq[0] - 'a', eq[3] - 'a')
    
    for (eq in equations)
        if (eq[1] == '!')
            if (checkConnection(eq[0] - 'a', eq[3] - 'a')) return false
    return true
}