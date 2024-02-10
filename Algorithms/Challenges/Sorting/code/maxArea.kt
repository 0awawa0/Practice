
/*
You are given a rectangular cake of size h x w and two arrays of integers horizontalCuts and verticalCuts where:

    horizontalCuts[i] is the distance from the top of the rectangular cake to the ith horizontal cut and similarly, and
    verticalCuts[j] is the distance from the left of the rectangular cake to the jth vertical cut.

Return the maximum area of a piece of cake after you cut at each horizontal and vertical position provided in the arrays horizontalCuts and verticalCuts. Since the answer can be a large number, return this modulo 109 + 7.
*/


fun maxArea(h: Int, w: Int, horizontalCuts: IntArray, verticalCuts: IntArray): Int {
        
    horizontalCuts.sort()
    verticalCuts.sort()
    
    val heightPieces = ArrayList<IntRange>()
    var prevEnd = 0
    for (cut in horizontalCuts) {
        heightPieces.add(prevEnd..cut)
        prevEnd = cut
    }
    heightPieces.add(prevEnd..h)
    
    val widthPieces = ArrayList<IntRange>()
    prevEnd = 0
    for (cut in verticalCuts) {
        widthPieces.add(prevEnd..cut)
        prevEnd = cut
    }
    widthPieces.add(prevEnd..w)
    
    heightPieces.sortBy { it.endInclusive - it.start }
    widthPieces.sortBy { it.endInclusive - it.start }
    
    val hRange = heightPieces.last()
    val vRange = widthPieces.last()
    
    val height = (hRange.endInclusive - hRange.start).toLong()
    val width = (vRange.endInclusive - vRange.start).toLong()
    return ((width * height) % 1_000_000_007L).toInt()
}