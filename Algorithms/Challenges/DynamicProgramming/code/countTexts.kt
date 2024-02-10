
/*
Alice is texting Bob using her phone. 
In order to add a letter, Alice has to press the key of the corresponding digit i times, where i is the position of the letter in the key.

    For example, to add the letter 's', Alice has to press '7' four times. Similarly, to add the letter 'k', Alice has to press '5' twice.
    Note that the digits '0' and '1' do not map to any letters, so Alice does not use them.

However, due to an error in transmission, Bob did not receive Alice's text message but received a string of pressed keys instead.

    For example, when Alice sent the message "bob", Bob received the string "2266622".

Given a string pressedKeys representing the string received by Bob, return the total number of possible text messages Alice could have sent.

Since the answer may be very large, return it modulo 109 + 7.
*/

fun countTexts(pressedKeys: String): Int {
    val mem = IntArray(pressedKeys.length + 1)
    mem[0] = 1
    val mod = 1000000000 + 7
    for (i in 1 .. pressedKeys.length) {
        mem[i] = mem[i - 1]
            
        if (i - 2 >= 0 && pressedKeys[i - 1] == pressedKeys[i - 2]) {
            mem[i] = (mem[i] + mem[i - 2]) % mod
            if (i - 3 >= 0 && pressedKeys[i - 1] == pressedKeys[i - 3]) {
                mem[i] = (mem[i] + mem[i - 3]) % mod
                val isSevenOrNine = pressedKeys[i - 1] == '7' || pressedKeys[i - 1] == '9'
                if (isSevenOrNine && i - 4 >= 0 && pressedKeys[i - 1] == pressedKeys[i - 4]) 
                    mem[i] = (mem[i] + mem[i - 4]) % mod
            }                
        }
    }
        
    return mem.last()
}