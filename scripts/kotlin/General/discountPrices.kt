
/*
A sentence is a string of single-space separated words where each word can contain digits, lowercase letters, and the dollar sign '$'. A word represents a price if it is a non-negative real number preceded by a dollar sign.

    For example, "$100", "$23", and "$6.75" represent prices while "100", "$", and "2$3" do not.

You are given a string sentence representing a sentence and an integer discount. For each word representing a price, apply a discount of discount% on the price and update the word in the sentence. All updated prices should be represented with exactly two decimal places.

Return a string representing the modified sentence.
*/

fun discountPrices(sentence: String, discount: Int): String {
    val reduce = discount / 100.0
        
    val words = sentence.split(" ").toTypedArray()
    for (i in words.indices) {
        val word = words[i]
        val price = word.trim('$').toDoubleOrNull() ?: continue
        val newPrice = price - (price * reduce)
            
        if (word.first() == '$' && word.last() != '$') words[i] = String.format("\$%.02f", newPrice)
    }
    return words.joinToString(separator = " ") { it }
}