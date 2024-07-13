# Average Waiting Time
Source: https://leetcode.com/problems/average-waiting-time/description/

## Challenge

There is a restaurant with a single chef. You are given an array `customers`, where `customers[i] = [arrivali, timei]`:

    `arrivali` is the arrival time of the `i`th customer. The arrival times are sorted in non-decreasing order.
    `timei` is the time needed to prepare the order of the `i`th customer.

When a customer arrives, he gives the chef his order, and the chef starts preparing it once he is idle. The customer waits till the chef finishes preparing his order. The chef does not prepare food for more than one customer at a time. The chef prepares food for customers in the order they were given in the input.

Return the average waiting time of all customers. Solutions within `10^-5` from the actual answer are considered accepted.

__Example 1:__

    Input: customers = [[1,2],[2,5],[4,3]]
    Output: 5.00000
    Explanation:
    1) The first customer arrives at time 1, the chef takes his order and starts preparing it immediately at time 1, and finishes at time 3, so the waiting time of the first customer is 3 - 1 = 2.
    2) The second customer arrives at time 2, the chef takes his order and starts preparing it at time 3, and finishes at time 8, so the waiting time of the second customer is 8 - 2 = 6.
    3) The third customer arrives at time 4, the chef takes his order and starts preparing it at time 8, and finishes at time 11, so the waiting time of the third customer is 11 - 4 = 7.
    So the average waiting time = (2 + 6 + 7) / 3 = 5.

__Example 2:__

    Input: customers = [[5,2],[5,4],[10,3],[20,1]]
    Output: 3.25000
    Explanation:
    1) The first customer arrives at time 5, the chef takes his order and starts preparing it immediately at time 5, and finishes at time 7, so the waiting time of the first customer is 7 - 5 = 2.
    2) The second customer arrives at time 5, the chef takes his order and starts preparing it at time 7, and finishes at time 11, so the waiting time of the second customer is 11 - 5 = 6.
    3) The third customer arrives at time 10, the chef takes his order and starts preparing it at time 11, and finishes at time 14, so the waiting time of the third customer is 14 - 10 = 4.
    4) The fourth customer arrives at time 20, the chef takes his order and starts preparing it immediately at time 20, and finishes at time 21, so the waiting time of the fourth customer is 21 - 20 = 1.
    So the average waiting time = (2 + 6 + 4 + 1) / 4 = 3.25.

### Constraints:

    1 <= customers.length <= 105
    1 <= arrivali, timei <= 104
    arrivali <= arrivali+1

## Solution

Because we are given already sorted array, and also are required to process it in the given order, the solution becomes extremely straightforward. We just simulate chef's work.

So, when the first customer arrives, the chef is idle. Chef takes an order and starts preparing it. Next time chef will be idle is `arrivalTime0 + timeToPrepare0`. First customer will have to wait only `timeToPrepare0`.

When the next customer arrives, it either has to wait until chef is idle, if `arrivalTime1 < arrivalTime0 + timeToPrepare0`, or chef will take an order and will start preparing it. Considering this, next time chef will be idle at `maxOf(arrivalTime1 + timeToPrepare1, arrivalTime0 + timeToPrepare0 + timeToPrepare1)`, and the second customer will have to wait `maxOf(arrivalTime0 + timeToPrepare0 - arrivalTime1, 0) + timeToPrepare1`.

We can go on for every customer, sum all this waiting times and just divide by the total count of customers in the end.

## Code

```Kotlin
fun averageWaitingTime(customers: Array<IntArray>): Double {
    var idleAtTime = 0.0 // next time chef will be idle
    var totalWaiting = 0.0

    customers.forEach {
        val arrival = it[0].toDouble()
        val timeToPrepare = it[1].toDouble()

        val waitTillIdle = maxOf(0.0, idleAtTime - arrival) // time the customer has to wait until chef is idle

        totalWaiting += waitTillIdle + timeToPrepare

        idleAtTime = maxOf(idleAtTime, arrival) + timeToPrepare
    }

    return totalWaiting / customers.size.toDouble()
}
```
