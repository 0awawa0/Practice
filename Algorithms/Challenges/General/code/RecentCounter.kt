

/*
You have a RecentCounter class which counts the number of recent requests within a certain time frame.
Implement the RecentCounter class:

RecentCounter() Initializes the counter with zero recent requests.
int ping(int t) Adds a new request at time t, where t represents some time in milliseconds,
and returns the number of requests that has happened in the past 3000 milliseconds (including the new request). 
Specifically, return the number of requests that have happened in the inclusive range [t - 3000, t].
It is guaranteed that every call to ping uses a strictly larger value of t than the previous call.
*/


class RecentCounter() {

    val pings = LinkedList<Int>()
    
    fun ping(t: Int): Int {
        pings.addLast(t)
        
        while (t - pings.getFirst() > 3000 && pings.size > 0) pings.removeFirst()
        
        return pings.size
    }
}
