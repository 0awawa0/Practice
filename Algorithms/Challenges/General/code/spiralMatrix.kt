
/*
Given an m x n matrix, return all elements of the matrix in spiral order.
*/

fun spiralOrder(matrix: Array<IntArray>): List<Int> {
  var i = 0
  var j = 0
  val elementsCount = matrix.size * matrix[0].size
  var iteration = 0
  var insertIndex = 0
  val result = IntArray(elementsCount) { 0 }
	while (iteration < elementsCount) {
    while (insertIndex < elementsCount && j < matrix[0].size - iteration) {
      result[insertIndex++] = matrix[i][j++]
    }
    j--
    i++
		
		while (insertIndex < elementsCount && i < matrix.size - iteration) {
      result[insertIndex++] = matrix[i++][j]
		}
    i--
    j--
            
    while (insertIndex < elementsCount && j >= iteration) {
      result[insertIndex++] = matrix[i][j--]
    }
    j++
    i--
		
    while (insertIndex < elementsCount && i > iteration + 1) {
      result[insertIndex++] = matrix[i--][j]
		}
        
    iteration++
	}
    
  return result.toList()
}
