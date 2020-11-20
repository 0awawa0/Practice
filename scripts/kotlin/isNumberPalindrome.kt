/*
Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
*/

fun isPalindrome(x: Int): Boolean {
    if (x < 0 || (x % 10 == 0 && x != 0)) { return false }
    
    var x = x
    var rev = 0
        
    while (x > rev) {
        rev = rev * 10 + x % 10
        x /= 10
    }
        
    return x == rev || x == rev / 10
}

fun main(args: Array<String>) {
    print("Enter the number >> ")
    val num = (readLine() ?: "0").toInt()
    println("Is number palindrome: ${isPalindrome(num)}")
}
