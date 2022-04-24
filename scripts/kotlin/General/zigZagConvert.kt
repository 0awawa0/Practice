/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
(you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows.

Example:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"

Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I

*/

fun zigZagConvert(s: String, numRows: Int): String {
    
    if (s.length <= numRows || numRows == 1) { return s }
        
    val result = StringBuilder()
    val loopLength = numRows + numRows - 2
        
    for (row in 0 until numRows) {
       for (i in 0 until s.length - row step loopLength) {
            result.append(s[i + row])
            if (row != 0 
                && row != numRows - 1 
                && i + loopLength - row < s.length) 
            {
                result.append(s[i + loopLength - row])
            }
        }
    }
        
    return result.toString()
}


fun main(args: Array<String>) {
    val s = args[0]
    val numRows = args[1].toInt()
    println("Converted string: ${zigZagConvert(s, numRows)}")
} 
