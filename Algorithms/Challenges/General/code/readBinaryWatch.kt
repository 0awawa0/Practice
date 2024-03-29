
/*
A binary watch has 4 LEDs on the top which represent the hours (0-11), and the 6 LEDs on the bottom represent the minutes (0-59). Each LED represents a zero or one, with the least significant bit on the right.
Given an integer turnedOn which represents the number of LEDs that are currently on, return all possible times the watch could represent. You may return the answer in any order.

The hour must not contain a leading zero.

    For example, "01:00" is not valid. It should be "1:00".

The minute must be consist of two digits and may contain a leading zero.

    For example, "10:2" is not valid. It should be "10:02".

*/

fun readBinaryWatch(turnedOn: Int): List<String> {
  val result = LinkedList<String>()
  for (hours in 0..11) {
    for (minutes in 0..59) {
      if (hours.hammingWeight() + minutes.hammingWeight() == turnedOn)
        result.add("$hours:" + String.format("%02d", minutes))
    }
  }
  return result
}
    
private fun Int.hammingWeight(): Int {
  var count = 0
  var n = this
  while (n > 0) {
    if (n % 2 == 1) count++
    n = n.shr(1)
  }
  return count
}
