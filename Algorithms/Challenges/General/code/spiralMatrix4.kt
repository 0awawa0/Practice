
/*
You are given two integers m and n, which represent the dimensions of a matrix.

You are also given the head of a linked list of integers.

Generate an m x n matrix that contains the integers in the linked list presented in spiral order (clockwise), starting from the top-left of the matrix. If there are remaining empty spaces, fill them with -1.

Return the generated matrix.
*/


fun spiralMatrix(m: Int, n: Int, head: ListNode?): Array<IntArray> {
    var nextNode = head
    val result = Array<IntArray>(m) { IntArray(n) { -1 }}
    
    var direction = 0
    var iteration = 0
    while(nextNode != null) {
        var i = iteration
        var j = iteration
        while(nextNode != null && j <= result[i].lastIndex - iteration) {
            result[i][j++] = nextNode.`val`
            nextNode = nextNode.next
        }
        j--
        i++
        
        while(nextNode != null && i <= result.lastIndex - iteration) {
            result[i++][j] = nextNode.`val`
            nextNode = nextNode.next
        }
        j--
        i--
        
        while(nextNode != null && j >= iteration) {
            result[i][j--] = nextNode.`val`
            nextNode = nextNode.next
        }
        j++
        i--
        
        while (nextNode != null && i > iteration) {
            result[i--][j] = nextNode.`val`
            nextNode = nextNode.next
        }
        
        iteration++
    }
    
    return result
}