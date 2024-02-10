
/*
Given a string s formed by digits ('0' - '9') and '#' . We want to map s to English lowercase characters as follows:

Characters ('a' to 'i') are represented by ('1' to '9') respectively.
Characters ('j' to 'z') are represented by ('10#' to '26#') respectively. 
Return the string formed after mapping.

It's guaranteed that a unique mapping will always exist.
*/


fun freqAlphabets(s: String): String {
        
    val charMap = hashMapOf(
        "1" to "a",
        "2" to "b",
        "3" to "c",
        "4" to "d",
        "5" to "e",
        "6" to "f",
        "7" to "g",
        "8" to "h",
        "9" to "i",    
        "10#" to "j",
        "11#" to "k",
        "12#" to "l",
        "13#" to "m",
        "14#" to "n",
        "15#" to "o",
        "16#" to "p",
        "17#" to "q",
        "18#" to "r",
        "19#" to "s",
        "20#" to "t",
        "21#" to "u",
        "22#" to "v",
        "23#" to "w",
        "24#" to "x",
        "25#" to "y",
        "26#" to "z"
    )
        
    var counter = 0
    var mem1: Char = '-'
    var mem2: Char = '-'
        
    val result = StringBuilder()
        
    for (char in s) {
        when (counter) {
            0 -> {
                if (char in "3456789") {
                    result.append(charMap[char.toString()])
                } else {
                    mem1 = char
                    counter += 1
                }
            }
            1 -> {
                mem2 = char
                counter += 1
            }
            2 -> {
                if (char == '#') {
                    result.append(charMap[mem1.toString() + mem2.toString() + char.toString()])
                    counter = 0
                    mem1 = '-'
                    mem2 = '-'
                } else {
                    result.append(charMap[mem1.toString()])
                    mem1 = mem2
                    mem2 = char
                }
            }
        }
    }
        
    if (mem1 != '-') {
        result.append(charMap[mem1.toString()])
    }
        
    if (mem2 != '-') {
        result.append(charMap[mem2.toString()])
    }
        
    return result.toString()
}

fun main(args: Array<String>) {
    print("Enter the string >> ")
    val s = readLine()!!
    println("Decoded string: ${freqAlphabets(s)}")
}
