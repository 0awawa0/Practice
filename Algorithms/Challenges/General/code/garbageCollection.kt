
/*
You are given a 0-indexed array of strings garbage where garbage[i] represents the assortment of garbage at the ith house. garbage[i] consists only of the characters 'M', 'P' and 'G' representing one unit of metal, paper and glass garbage respectively. Picking up one unit of any type of garbage takes 1 minute.

You are also given a 0-indexed integer array travel where travel[i] is the number of minutes needed to go from house i to house i + 1.

There are three garbage trucks in the city, each responsible for picking up one type of garbage. Each garbage truck starts at house 0 and must visit each house in order; however, they do not need to visit every house.

Only one garbage truck may be used at any given moment. While one truck is driving or picking up garbage, the other two trucks cannot do anything.

Return the minimum number of minutes needed to pick up all the garbage.
*/

fun garbageCollection(garbage: Array<String>, travel: IntArray): Int {
    var total = 0
    val metalGarbage = HashSet<Int>()
    val paperGarbage = HashSet<Int>()
    val glassGarbage = HashSet<Int>()
    
    for (i in garbage.indices) {
        var metal = 0
        var paper = 0
        var glass = 0
        for (g in garbage[i]) {
            when (g) {
                'M' -> metal++
                'P' -> paper++
                'G' -> glass++
            }
        }
        total += metal + paper + glass
        if (metal > 0) metalGarbage.add(i)
        if (paper > 0) paperGarbage.add(i)
        if (glass > 0) glassGarbage.add(i)
    }
    
    
    var i = 0
    while (metalGarbage.isNotEmpty() && i < garbage.size) {
        if (i > 0) total += travel[i - 1]
        metalGarbage.remove(i++)
    }
    
    i = 0
    while (paperGarbage.isNotEmpty() && i < garbage.size) {
        if (i > 0) total += travel[i - 1]
        paperGarbage.remove(i++)
    }
    
    i = 0
    while (glassGarbage.isNotEmpty() && i < garbage.size) {
        if (i > 0) total += travel[i - 1]
        glassGarbage.remove(i++)
    }
    
    return total
}