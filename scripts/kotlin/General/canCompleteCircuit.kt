
/*
There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].

You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.

Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return -1.
*/

fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
  var runningSum = gas[0] - cost[0]
  var minIndex = 0
  var minValue = runningSum
  for (i in 1 until gas.size) {
    runningSum = runningSum + (gas[i] - cost[i])
    if (minValue > runningSum) {
      minValue = runningSum
      minIndex = i
    }
  }
        
  if (runningSum < 0) return -1
  else return (minIndex + 1) % gas.size
}
