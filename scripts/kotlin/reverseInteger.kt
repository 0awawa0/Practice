/*
Given a 32-bit signed integer, reverse digits of an integer.

Note:
Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. 
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
*/

fun reverseInteger(x: Int): Int {
    var t = x
    var res = 0
        
    while (t != 0) {
        val pop = t % 10
        t /= 10
            
        if (res > Int.MAX_VALUE / 10 || res < Int.MIN_VALUE / 10) {
            return 0
        }
            
        if ((res == Int.MAX_VALUE / 10 || res == Int.MIN_VALUE / 10)
            && pop > 7)
        {
            return 0
        }
            
        res = res * 10 + pop
    }
        
    return if (res > 0 && x < 0) -res else res
}

fun main(args: Array<String>) {
  val num = args[0].toInt()
  println("Reversed number: ${reverseInteger(num)}")
}
