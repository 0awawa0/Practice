
/*
We are given an array asteroids of integers representing asteroids in a row.

For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.
*/

fun asteroidCollision(asteroids: IntArray): IntArray {
    val stack = LinkedList<Int>()
    val queue = LinkedList<Int>()
    for (a in asteroids) {
        if (a > 0) stack.push(a)
        else {
            var currAsteroid = a
            while (stack.isNotEmpty() && currAsteroid < 0) {
                val topAsteroid = stack.pop()
                if (topAsteroid == abs(currAsteroid)) currAsteroid = 0
                else {
                    if (topAsteroid > abs(currAsteroid)) {
                        currAsteroid = 0
                        stack.push(topAsteroid)
                    }
                }
            }
            if (currAsteroid != 0) queue.add(currAsteroid)
        }
    }
    
    val result = IntArray(stack.size + queue.size)
    for (i in 0 until queue.size) result[i] = queue.poll()
    for (i in result.lastIndex downTo result.size - stack.size) result[i] = stack.pop()
    return  result
}