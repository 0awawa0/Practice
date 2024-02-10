
/*
Given a list of accounts where each element accounts[i] is a list of strings, where the first element accounts[i][0] is a name, and the rest of the elements are emails representing emails of the account.

Now, we would like to merge these accounts. Two accounts definitely belong to the same person if there is some common email to both accounts. Note that even if two accounts have the same name, they may belong to different people as people could have the same name. A person can have any number of accounts initially, but all of their accounts definitely have the same name.

After merging the accounts, return the accounts in the following format: the first element of each account is the name, and the rest of the elements are emails in sorted order. The accounts themselves can be returned in any order.
*/

fun accountsMerge(accounts: List<List<String>>): List<List<String>> {
	val adjacencyList = HashMap<String, MutableList<String>>()
	val visited = HashSet<String>()

	// account is a merged account, where we add emails that 
	// belong to that account
	fun dfs(account: ArrayList<String>, email: String) {
		if (email in visited) return 

		// Add an email to the merged account and mark it as visited
		visited.add(email)
		account.add(email)

		if (email !in adjacencyList) return

		// Perform DFS for each neighbor
		for (neighbor in adjacencyList[email]!!) 
			dfs(account, neighbor)
	}

	// Creating an adjacency list
	// We do not connect all emails to each other, but rather connect
	// one email to all of others, creating a 
	// star-like connected graph
	for (account in accounts) {

		// We pick the first account email as a center of a graph
		val firstEmail = account[1]
		for (idx in 2 until account.size) {
			val email = account[idx]

			// Connect central node to each other node
			if (firstEmail !in adjacencyList)
				adjacencyList[firstEmail] = ArrayList<String>()
			adjacencyList[firstEmail]!!.add(email)

			// Connect other nodes to the central node
			if (email !in adjacencyList) 
				adjacencyList[email] = ArrayList<String>()
			adjacencyList[email]!!.add(firstEmail)
		}
	}

	val mergedAccounts = ArrayList<List<String>>()

	// Now for each original account we perform DFS which will
	// connect graph components to a single connected component
	// which will represent a merged account
	for (account in accounts) {
		val name = account[0]
		val firstEmail = account[1]
		
		if (firstEmail in visited) continue
		
		val mergedAccount = ArrayList<String>()
		dfs(mergedAccount, firstEmail)
		
		mergedAccount.sort()
		mergedAccount.add(0, name)
		mergedAccounts.add(mergedAccount)
	}

	return mergedAccounts
}