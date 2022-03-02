
/*
You are given an array of unique integers salary where salary[i] is the salary of the ith employee. Return the average salary of employees excluding the minimum and maximum salary.
*/

fun average(salary: IntArray): Double {
  var total = 0.0
  var maxSalary = salary[0]
  var minSalary = salary[0]
  for (s in salary) {
    total += s
    maxSalary = maxOf(s, maxSalary)
    minSalary = minOf(s, minSalary)
  }
        
  return (total - maxSalary.toDouble() - minSalary.toDouble()) / (salary.size - 2)
}
