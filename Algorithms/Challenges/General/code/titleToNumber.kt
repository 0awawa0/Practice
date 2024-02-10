
/*
Given a string columnTitle that represents the column title as appear in an Excel sheet, return its corresponding column number.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
*/

fun titleToNumber(columnTitle: String): Int {
  val baseCode = 'A'.toInt() - 1
  var result = 0
  for (i in columnTitle.indices) result = (result * 26) + columnTitle[i].toInt() - baseCode
  return result
}
