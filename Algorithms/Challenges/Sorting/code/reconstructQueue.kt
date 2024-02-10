
/*
You are given an array of people, people, which are the attributes of some people in a queue (not necessarily in order). Each people[i] = [hi, ki] represents the ith person of height hi with exactly ki other people in front who have a height greater than or equal to hi.

Reconstruct and return the queue that is represented by the input array people. The returned queue should be formatted as an array queue, where queue[j] = [hj, kj] is the attributes of the jth person in the queue (queue[0] is the person at the front of the queue).
*/

fun reconstructQueue(people: Array<IntArray>): Array<IntArray> {
    val comparator = compareByDescending<IntArray> { it[0] }.thenBy { it[1] }
    people.sortWith(comparator)
    val list = ArrayList<IntArray>()
    for (person in people) list.add(person[1], person)
    return list.toTypedArray()
}