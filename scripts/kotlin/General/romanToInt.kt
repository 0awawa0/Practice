/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II.
The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. 
However, the numeral for four is not IIII. Instead, the number four is written as IV. 
Because the one is before the five we subtract it making four. 
The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.
*/

fun romanToInt(s: String): Int {

    if (s.isEmpty()) { return 0 }
    var number = 0
    
    var prevChar: Char = '_'
    for (i in s.length - 1 downTo 0) {
        when (s[i]) {
            'I' -> number += if (prevChar in "VX") -1 else 1
            'V' -> number += 5
            'X' -> number += if (prevChar in "LC") -10 else 10
            'L' -> number += 50
            'C' -> number += if (prevChar in "DM") -100 else 100
            'D' -> number += 500
            'M' -> number += 1000
        }
        prevChar = s[i]
    }
    
    return number
}


fun main() {
    print("Enter roman string >> ")
    var s = readLine() ?: ""
    println("Decimal value: ${romanToInt(s)}")
}
