
/*
You are given an array of strings ideas that represents a list of names to be used in the process of naming a company. The process of naming a company is as follows:

    Choose 2 distinct names from ideas, call them ideaA and ideaB.
    Swap the first letters of ideaA and ideaB with each other.
    If both of the new names are not found in the original ideas, then the name ideaA ideaB (the concatenation of ideaA and ideaB, separated by a space) is a valid company name.
    Otherwise, it is not a valid name.

Return the number of distinct valid names for the company.
*/

fun distinctNames(ideas: Array<String>): Long {
	var answer = 0L
	val groups = Array<MutableSet<String>>(26) { HsshSet<String>() }

	for (idea in ideas) {
		val idx = (idea[0] - 'a').toInt()
		groups[idx].add(idea.substring(1))
	}

	for (i in groups.indices) {
		for (j in i + 1 until groups.size) {
			var mutualSuffixes = 0
			for (suffix in groups[i]) {
				if (suffix in groups[j]) mutualSuffixes++
			}
			
			answer += 2L * (groups[i].size - mutualSuffixes).toLong() *
				(groups[j].size - mutualSuffixes).toLong()
		}
	}

	return answer
}