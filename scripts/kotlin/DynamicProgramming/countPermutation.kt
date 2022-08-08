

/*
Given an integer n, your task is to count how many strings of length n can be formed under the following rules:

    Each character is a lower case vowel ('a', 'e', 'i', 'o', 'u')
    Each vowel 'a' may only be followed by an 'e'.
    Each vowel 'e' may only be followed by an 'a' or an 'i'.
    Each vowel 'i' may not be followed by another 'i'.
    Each vowel 'o' may only be followed by an 'i' or a 'u'.
    Each vowel 'u' may only be followed by an 'a'.

Since the answer may be too large, return it modulo 10^9 + 7.
*/

fun countVowelPermutation(n: Int): Int {
    val mem = Array<LongArray>(6) { LongArray(n + 1) }
    val mod = 1_000_000_007L
    if (n == 1) return 5
        
    for (i in 0 until 5) mem[i][0] = 1
        
    fun search(positions: Int, currentVowel: Char): Long {
        if (positions == 0) return 1
            
        var result = 0L
            
        when (currentVowel) {
                
            '_' -> {
                val aRes = search(positions - 1, 'a')
                val eRes = search(positions - 1, 'e')
                val iRes = search(positions - 1, 'i')
                val oRes = search(positions - 1, 'o')
                val uRes = search(positions - 1, 'u')
                result = (
	                result + aRes + eRes + iRes + oRes + uRes
	            ) % mod
                mem[5][positions] = result
            }
                
            'a' -> {
                if (mem[0][positions] != 0L) 
	                return mem[0][positions]
                result = (result + search(positions - 1, 'e')) % mod
                mem[0][positions] = result
            }
                
            'e' -> {
                if (mem[1][positions] != 0L) 
	                return mem[1][positions]
                result = (
	                result + search(positions - 1, 'a') 
	                + search(positions - 1, 'i')
	            ) % mod
                mem[1][positions] = result
            }
                
            'i' -> {
                if (mem[2][positions] != 0L) 
	                return mem[2][positions]
                result = (
	                result + search(positions - 1, 'a') 
	                + search(positions - 1, 'e') 
	                + search(positions - 1, 'o') 
	                + search(positions - 1, 'u')
		        ) % mod
                mem[2][positions] = result
            }
                
            'o' -> {
                if (mem[3][positions] != 0L) 
	                return mem[3][positions]
                result = (
	                result + search(positions - 1, 'i') 
	                + search(positions - 1, 'u')
		        ) % mod
                mem[3][positions] = result
            } else -> {
                if (mem[4][positions] != 0L) 
	                return mem[4][positions]
                result = (
	                result + search(positions - 1, 'a')
	            ) % mod
                mem[4][positions] = result
            }
        }
            
        return result
    }
        
    search(n, '_')
    return mem[5][n].toInt()
}