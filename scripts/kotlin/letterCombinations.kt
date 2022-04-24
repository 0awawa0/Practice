
/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
*/

private val digitToLettersMap = hashMapOf(
    '2' to "abc",
    '3' to "def",
    '4' to "ghi",
    '5' to "jkl",
    '6' to "mno",
    '7' to "pqrs",
    '8' to "tuv",
    '9' to "wxyz" 
)
    
fun letterCombinations(digits: String): List<String> {
    if (digits.length == 0) return emptyList()
        
    val result = LinkedList<String>()
        
    fun backtrack(currentString: String) {
        if (currentString.length == digits.length) {
            result.add(currentString)
            return
        }
            
        for (letter in digitToLettersMap[digits[currentString.length]]!!) {
            backtrack(currentString + letter)
        }
    }
        
    backtrack("")
    return result
}