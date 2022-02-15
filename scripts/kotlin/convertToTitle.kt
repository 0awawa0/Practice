
/*
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

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

fun convertToTitle(columnNumber: Int): String {
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  val stringBuilder = StringBuilder()
  var currNumber = columnNumber
  while (currNumber != 0) {
    currNumber = currNumber - 1
    stringBuilder.insert(0, alphabet[currNumber % 26])
    currNumber = currNumber / 26
  } 
  
  return stringBuilder.toString()
}
