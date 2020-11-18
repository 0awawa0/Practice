/*
Implement atoi which converts a string to an integer.

The function first discards as many whitespace characters as necessary until the first non-whitespace character is found.
Then, starting from this character takes an optional initial plus or minus sign followed by as many numerical digits as possible, 
and interprets them as a numerical value.

The string can contain additional characters after those that form the integral number,
which are ignored and have no effect on the behavior of this function.

If the first sequence of non-whitespace characters in str is not a valid integral number, 
or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.

If no valid conversion could be performed, a zero value is returned.

Note:

Only the space character ' ' is considered a whitespace character.
Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range. 
If the numerical value is out of the range of representable values.
*/

fun atoi(s: String): Int {
        
    var res = 0
    var s = s.trim(' ')
        
    if (s.isEmpty()) return 0
        
    var sign = 1
        
    if (s[0] !in "+-0123456789") return 0
    if (s[0] == '-') sign *= -1
    if (s[0] in "+-") { s = s.substring(1) }
    if (s.isEmpty()) return 0
        
    for (c in s) {
        if (c !in "0123456789") break
            
        if (sign > 0 && res > Int.MAX_VALUE / 10) return Int.MAX_VALUE
        if (sign < 0 && -res < Int.MIN_VALUE / 10) return Int.MIN_VALUE
            
        if (sign > 0 && res == Int.MAX_VALUE / 10 
            && c.toString().toInt() > 7) return Int.MAX_VALUE
        if (sign < 0 && -res == Int.MIN_VALUE / 10 
            && c.toString().toInt() > 7) return Int.MIN_VALUE
            
        res = res * 10 + c.toString().toInt()
    }
        
    return res * sign
}

fun main(args: Array<String>) {
  val s = args[0]
  println("Your number: ${atoi(s)}")
}
