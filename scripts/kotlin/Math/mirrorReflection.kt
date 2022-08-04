
/*
There is a special square room with mirrors on each of the four walls. Except for the southwest corner, there are receptors on each of the remaining corners, numbered 0, 1, and 2.

The square room has walls of length p and a laser ray from the southwest corner first meets the east wall at a distance q from the 0th receptor.

Given the two integers p and q, return the number of the receptor that the ray meets first.

The test cases are guaranteed so that the ray will meet a receptor eventually.
*/

fun mirrorReflection(p: Int, q: Int): Int {
    var x = q
    var bounces = 0
    while (x % p != 0) {
        x += q
        bounces++
    }
    
    if (bounces % 2 == 1) return 2
    else return if ((x / p) % 2 == 0) 0 else 1
}