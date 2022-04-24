
/*
You are given an integer total indicating the amount of money you have. You are also given two integers cost1 and cost2 indicating the price of a pen and pencil respectively. You can spend part or all of your money to buy multiple quantities (or none) of each kind of writing utensil. Return the number of distinct ways you can buy some number of pens and pencils.
*/

fun waysToBuyPensPencils(total: Int, cost1: Int, cost2: Int): Long {
    var count = 1L + (total / cost1).toLong() + (total / cost2).toLong()
    for (count1 in 1 .. total / cost1) count += ((total - (cost1 * count1)) / cost2).toLong()
    return count
}