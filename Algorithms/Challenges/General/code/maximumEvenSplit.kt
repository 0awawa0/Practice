
/*
You are given an integer finalSum. Split it into a sum of a maximum number of unique positive even integers.
Return a list of integers that represent a valid split containing a maximum number of integers. If no valid split exists for finalSum, return an empty list. You may return the integers in any order.
*/

fun maximumEvenSplit(finalSum: Long): List<Long> {
  if (finalSum % 2L != 0L) return emptyList()
  
  val result = LinkedList<Long>()
  var currSum = 0L
  var currNumber = 0L
  while (currSum < finalSum) {
    currNumber += 2L
    result.addFirst(currNumber)
    currSum += currNumber
  }
        
  if (currSum == finalSum) return result
        
  val diff = currSum - finalSum
  result.remove(diff)
  return result
}
