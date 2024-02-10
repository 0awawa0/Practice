
/*
The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T'.

    For example, "ACGAATTCCG" is a DNA sequence.

When studying DNA, it is useful to identify repeated sequences within the DNA.

Given a string s that represents a DNA sequence, return all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule. You may return the answer in any order.
*/

fun findRepeatedDnaSequences(s: String): List<String> {
    val seen = HashSet<String>()
    val result = HashSet<String>()
    for (i in 0 .. s.length - 10) {
        val substr = s.substring(i until i + 10)
        if (substr in seen) result.add(substr)
        seen.add(substr)
    }
    return result.toList()
}