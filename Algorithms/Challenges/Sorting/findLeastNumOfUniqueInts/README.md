# Find Least Num of Unique Ints

## Challenge
Given an array of integers `arr` and an integer `k`. Find the least number of unique integers after removing exactly `k` elements.

Constraints:

    1 <= arr.length <= 10^5
    1 <= arr[i] <= 10^9
    0 <= k <= arr.length

Example 1:

    Input: arr = [5,5,4], k = 1
    Output: 1
    Explanation: Remove the single 4, only 5 is left.

Example 2:

    Input: arr = [4,3,1,1,3,3,2], k = 3
    Output: 2
    Explanation: Remove 4, 2 and either one of the two 1s or three 3s. 1 and 3 will be left.

## Solution

The idea for solving the challenge is straightforward - let's think of `k` as of tokens that allow us to remove elements from `arr`. And our goal is to remoev as many unique elements from `arr` as we can using those tokens. So it should be pretty obvious, that we must remove numbers that appear less in `arr` than others. Consider example 1, we could either remove all `5`s from the array (nevermind that `k` is `1`, suppose it is `2`), or we could remove just one `4`. Both ways we are left with one unique number in the array, but removing `5`s cost twice as many tokens as removing `4`.

Now, to implement the solution we could go with two approaches, both are valid and fit into constraints.

First approach - count frequencies of each number in `arr`, then sort `arr` by increasing frequencies and then just start removing numbers from the beginning until we have tokens to use. Also, here we could use heap/priority queue, which is basically the same thing as sorting and gives us time complexity of `O(NlogN)`.

The second approach is less intuitive but basically it does the same thing. Only this time we use non comparison based sorting - counting sort. We start the same as the first time - count frequencies of numbers in `arr`. 
And then we create a new array `countOfFrequencies` of size `arr.size + 1`, where `countOfFrequencies[i]` is the count of elements in `arr` that have frequency `i`.
Finally, we can go through frequencies starting from the smallest and remove all elements that have those frequencies. Note that we do not know what elements we remove, and we are not required to. We just know that there are, for example, `m` elements that have frequency `i` in `arr`, and we would need `m * i` tokens to remove them all. Now, what if we do not have as many tokens? Well, then we can at least remove `tokensLeft / i` elements. So we remove `minOf(tokensLeft / i, countOfFrequencies[i])` elements for every frequency `i` from `1..arr.size` until `tokensLeft > i` (i.e. until we can remove at least all occurrences of one number from `arr`).
In this approach we go through `arr` once to count frequencies, then we go through `countOfFrequencies` of the same size, and than again from `1` to `arr.size`, so it is basically `O(3N) = O(N)` time complexity.

## Code

```Kotlin
fun findLeastNumOfUniqueInts(arr: IntArray, k: Int): Int {

    val frequencies = HashMap<Int, Int>()
    for (num in arr) frequencies[num] = (frequencies[num] ?: 0) + 1
    
    val sortedList = arr.sortedBy { frequencies[it]!! }        
    var minNum = frequencies.keys.size
    
    var leftTokens = k
    var i = 0

    while (i < sortedList.size) {
        val count = frequencies[sortedList[i]]!!
        if (count > leftTokens) return minNum

        leftTokens -= count
        minNum--
        i += count
    }

    return minNum
}
```

```Kotlin
fun findLeastNumOfUniqueInts(arr: IntArray, k: Int): Int {
    val frequencies = HashMap<Int, Int>()
    for (num in arr) {
        frequencies[num] = (frequencies[num] ?: 0) + 1
    }

    val countOfFrequencies = IntArray(arr.size + 1)
    for (value in frequencies.values) countOfFrequencies[value]++

    var tokensLeft = k
    var unique = frequencies.size
    for (i in 1..arr.size) {
        val elementsToRemove = minOf(tokensLeft / i, countOfFrequencies[i])
        tokensLeft -= (i * elementsToRemove)
        unique -= elementsToRemove

        if (tokensLeft < i) return unique
    }

    return 0
}
```