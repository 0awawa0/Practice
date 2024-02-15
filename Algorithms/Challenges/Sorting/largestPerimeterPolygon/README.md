# Largest Perimeter Polygon

## Description

You are given an array of positive integers `nums` of length `n`.

A polygon is a closed plane figure that has at least `3` sides. The longest side of a polygon is smaller than the sum of its other sides.

Conversely, if you have `k` (`k >= 3`) positive real numbers `a1, a2, a3, ..., ak` where `a1 <= a2 <= a3 <= ... <= ak` and `a1 + a2 + a3 + ... + ak-1 > ak`, then there always exists a polygon with `k` sides whose lengths are `a1, a2, a3, ..., ak`.

The perimeter of a polygon is the sum of lengths of its sides.

Return the largest possible perimeter of a polygon whose sides can be formed from `nums`, or `-1` if it is not possible to create a polygon.

Example 1:

Input: `nums = [5,5,5]`
Output: `15`
Explanation: The only possible polygon that can be made from `nums` has `3` sides: `5`, `5`, and `5`. The perimeter is `5 + 5 + 5 = 15`.

Example 2:

Input: `nums = [1,12,1,2,5,50,3]`
Output: `12`
Explanation: The polygon with the largest perimeter which can be made from `nums` has `5` sides: `1, 1, 2, 3`, and `5`. The perimeter is `1 + 1 + 2 + 3 + 5 = 12`.
We cannot have a polygon with either `12` or `50` as the longest side because it is not possible to include `2` or more smaller sides that have a greater sum than either of them.
It can be shown that the largest possible perimeter is `12`.

Example 3:

Input: `nums = [5,5,50]`
Output: `-1`
Explanation: There is no possible way to form a polygon from `nums`, as a polygon has at least `3` sides and `50 > 5 + 5`.


## Solution

To find the solution we should think this way. So we have to create a polygon with the largest perimeter wich is the sum of all its sides. So the largest number we can get from `nums` is the sum of all numbers in `nums`. Now, can we create a polygon this big? Yes, if the largest side in it is smaller than the sum of other sides. Let's say the largest number is `a` and sum of all numbers is `S`. Then we can create a polygon if `S - a > a`. If it is not true, then we not only can't create a polygon using all numbers from `nums` but also cannot create any polygon with `a` in it. So we can just drop `a`.
Now we came back to the same problem but with smaller array, so the solution is to repeat this process until we either find first polygon that we can create with perimeter `S`, or drop all numbers from `nums` so there is obviously nothing to create a polygon with and we just return `-1`

## Code

```Kotlin
fun largestPerimeter(nums: IntArray): Long {
    // Sum all numbers in nums
    var totalSum = nums.fold(0L) { acc, value -> acc + value.toLong() }

    // To find consecutive largest sides in polygon sort nums in descending order
    nums.sortDescending()

    // Select the largest side and check if we can create a polygon with it    
    for (num in nums) {
        if (totalSum - num > num) return totalSum
        else totalSum -= num // Drop largest side from sum if cannot create a polygon
    }

    return -1L
}
```