
/*
Design a time-based key-value data structure that can store multiple values for the same key at different time stamps and retrieve the key's value at a certain timestamp.

Implement the TimeMap class:

    TimeMap() Initializes the object of the data structure.
    void set(String key, String value, int timestamp) Stores the key key with the value value at the given time timestamp.
    String get(String key, int timestamp) Returns a value such that set was called previously, with timestamp_prev <= timestamp. If there are multiple such values, it returns the value associated with the largest timestamp_prev. If there are no values, it returns "".
*/

class TimeMap() {
    
    data class TimedValue(val value: String, val timestamp: Int)
    
    private val map = HashMap<String, ArrayList<TimedValue>>()
    
    fun set(key: String, value: String, timestamp: Int) { 
        if (map[key] == null) map[key] = ArrayList<TimedValue>()
        map[key]!!.add(TimedValue(value, timestamp))
    }

    fun get(key: String, timestamp: Int): String {
        val list = map[key] ?: return ""

        var position = -1
        var left = 0
        var right = list.lastIndex
        var middle = 0
        while (left <= right) {
            middle = left + (right - left) / 2
            if (list[middle].timestamp == timestamp) return list[middle].value
            if (list[middle].timestamp < timestamp) {
                left = middle + 1
                position = middle
            } else right = middle - 1
        }
        
        if (position == -1) return ""
        else return list[position].value
    }
}
