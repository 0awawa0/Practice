
/*
There is a broken calculator that has the integer startValue on its display initially. In one operation, you can:

    multiply the number on display by 2, or
    subtract 1 from the number on display.

Given two integers startValue and target, return the minimum number of operations needed to display target on the calculator.
*/

fun brokenCalc(startValue: Int, target: Int): Int {
  var operations = 0
  var t = target
  while (t > startValue) {
    operations++
    if (t % 2 == 0) t = t.shr(1)
    else t++
  }
  return operations + startValue - t
}
