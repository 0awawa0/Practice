
/*
Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.
*/

fun wordBreak(s: String, wordDict: List<String>): Boolean {
    val mem = HashMap<Int, Boolean>()
        
    fun checkCanSplit(currString: String): Boolean {
        if (currString.isEmpty()) return true
        if (mem[currString.length] != null) return mem[currString.length]!!
            
        wordDict.forEach {
            if (currString.startsWith(it)) {
                if (checkCanSplit(currString.substring(it.length))) {
                    mem[currString.length] = true
                    return true
                }
            }
        }
            
        mem[currString.length] = false
        return false
    }
        
    return checkCanSplit(s)
}