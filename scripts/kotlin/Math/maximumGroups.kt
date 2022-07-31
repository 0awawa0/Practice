

/*
You are given a positive integer array grades which represents the grades of students in a university. You would like to enter all these students into a competition in ordered non-empty groups, such that the ordering meets the following conditions:

    The sum of the grades of students in the ith group is less than the sum of the grades of students in the (i + 1)th group, for all groups (except the last).
    The total number of students in the ith group is less than the total number of students in the (i + 1)th group, for all groups (except the last).

Return the maximum number of groups that can be formed.
*/

fun maximumGroups(grades: IntArray): Int {
    return (sqrt(2 * grades.size.toDouble() + 0.25) - 0.5).toInt()
}