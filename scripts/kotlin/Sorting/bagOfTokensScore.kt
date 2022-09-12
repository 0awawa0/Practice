
/*
You have an initial power of power, an initial score of 0, and a bag of tokens where tokens[i] is the value of the ith token (0-indexed).

Your goal is to maximize your total score by potentially playing each token in one of two ways:

    If your current power is at least tokens[i], you may play the ith token face up, losing tokens[i] power and gaining 1 score.
    If your current score is at least 1, you may play the ith token face down, gaining tokens[i] power and losing 1 score.

Each token may be played at most once and in any order. You do not have to play all the tokens.

Return the largest possible score you can achieve after playing any number of tokens.
*/

fun bagOfTokensScore(tokens: IntArray, power: Int): Int {
    tokens.sort()
    var left = 0
    var right = tokens.lastIndex
    var score = 0
    var pow = power
    var maxScore = 0
    while (left <= right) {
        if (pow >= tokens[left]) {
            score++
            pow -= tokens[left++]
        } else {
            if (score > 0) {
                pow += tokens[right--]
                score--
            } else return maxScore
        }
        maxScore = maxOf(score, maxScore)
    }
    return maxScore
}