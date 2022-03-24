
/*
You are given an array people where people[i] is the weight of the ith person, and an infinite number of boats where each boat can carry a maximum weight of limit. Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit.

Return the minimum number of boats to carry every given person.
*/

fun numRescueBoats(people: IntArray, limit: Int): Int {
  people.sort()
  var left = 0
  var right = people.lastIndex
  var boats = 0
  while (left <= right) {
    boats++
    var totalWeight = people[right--]
    if (right >= left) {
      if (limit - totalWeight >= people[right]) right--
      else {
        if (limit - totalWeight >= people[left]) left++
      }
    }
  }
  return boats
}
