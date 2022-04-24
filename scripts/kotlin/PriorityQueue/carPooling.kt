/*
There is a car with capacity empty seats. The vehicle only drives east (i.e., it cannot turn around and drive west).

You are given the integer capacity and an array trips where trip[i] = [numPassengersi, fromi, toi] indicates that the ith trip has numPassengersi passengers and the locations to pick them up and drop them off are fromi and toi respectively. The locations are given as the number of kilometers due east from the car's initial location.

Return true if it is possible to pick up and drop off all passengers for all the given trips, or false otherwise.
*/

fun carPooling(trips: Array<IntArray>, capacity: Int): Boolean {
  val pickupDist = HashMap<Int, Int>()
  val dropOffDist = HashMap<Int, Int>()
        
  val stopsSet = HashSet<Int>()
  for (trip in trips) {
    stopsSet.add(trip[1])
    stopsSet.add(trip[2])
    pickupDist[trip[1]] = (pickupDist[trip[1]] ?: 0) + trip[0]
    dropOffDist[trip[2]] = (dropOffDist[trip[2]] ?: 0) + trip[0]
  }
        
  val queue = PriorityQueue<Int>()
  for (stop in stopsSet) queue.add(stop)
        
  var currentCapacity = capacity
  while (queue.isNotEmpty()) {
    val stop = queue.poll()
    val pickupCount = pickupDist[stop] ?: 0
    val dropOffCount = dropOffDist[stop] ?: 0
    currentCapacity += dropOffCount
    if (pickupCount > currentCapacity) return false
    currentCapacity -= pickupCount
  }
        
  return true
}
