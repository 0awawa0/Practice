
/*
You have a chat log of n messages. You are given two string arrays messages and senders where messages[i] is a message sent by senders[i].

A message is list of words that are separated by a single space with no leading or trailing spaces. The word count of a sender is the total number of words sent by the sender. Note that a sender may send more than one message.

Return the sender with the largest word count. If there is more than one sender with the largest word count, return the one with the lexicographically largest name.

Note:

    Uppercase letters come before lowercase letters in lexicographical order.
    "Alice" and "alice" are distinct.
*/

fun largestWordCount(messages: Array<String>, senders: Array<String>): String {
    val counts = HashMap<String, Int>()
    for (i in messages.indices) {
        counts[senders[i]] = (counts[senders[i]] ?: 0) + messages[i].split(" ").size
    }
        
    var result = senders[0]
    var max = counts[senders[0]]!!
    for (sender in senders) {
        if (counts[sender]!! > max) {
            result = sender
            max = counts[sender]!!
        } else {
            if (counts[sender]!! == max && result < sender) {
                result = sender
                max = counts[sender]!!
            }
        }
    }
        
    return result
}