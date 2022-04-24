
/*
You are given a 0-indexed binary string s which represents the types of buildings along a street where:

    s[i] = '0' denotes that the ith building is an office and
    s[i] = '1' denotes that the ith building is a restaurant.

As a city official, you would like to select 3 buildings for random inspection. However, to ensure variety, no two consecutive buildings out of the selected buildings can be of the same type.

    For example, given s = "001101", we cannot select the 1st, 3rd, and 5th buildings as that would form "011" which is not allowed due to having two consecutive buildings of the same type.

Return the number of valid ways to select 3 buildings.
*/


fun numberOfWays(s: String): Long {
    val zeroes = s.count { it == '0' }
    val ones = s.count { it == '1' }
    var result = 0L
    var zeroesMet = 0
    var onesMet = 0
    for (bit in s) {
        if (bit == '1') {
            result += (zeroesMet.toLong() * (zeroes - zeroesMet).toLong())
            onesMet++
        } else {
            result += (onesMet.toLong() * (ones - onesMet).toLong())
            zeroesMet++
        }
    }
    
    return result
}