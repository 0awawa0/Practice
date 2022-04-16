
/*
There is an ATM machine that stores banknotes of 5 denominations: 20, 50, 100, 200, and 500 dollars. Initially the ATM is empty. The user can use the machine to deposit or withdraw any amount of money.

When withdrawing, the machine prioritizes using banknotes of larger values.

    For example, if you want to withdraw $300 and there are 2 $50 banknotes, 1 $100 banknote, and 1 $200 banknote, then the machine will use the $100 and $200 banknotes.
    However, if you try to withdraw $600 and there are 3 $200 banknotes and 1 $500 banknote, then the withdraw request will be rejected because the machine will first try to use the $500 banknote and then be unable to use banknotes to complete the remaining $100. Note that the machine is not allowed to use the $200 banknotes instead of the $500 banknote.

Implement the ATM class:

    ATM() Initializes the ATM object.
    void deposit(int[] banknotesCount) Deposits new banknotes in the order $20, $50, $100, $200, and $500.
    int[] withdraw(int amount) Returns an array of length 5 of the number of banknotes that will be handed to the user in the order $20, $50, $100, $200, and $500, and update the number of banknotes in the ATM after withdrawing. Returns [-1] if it is not possible (do not withdraw any banknotes in this case).

*/

class ATM() {
    
    private val banknotes = LongArray(5) { 0 }
    
    fun deposit(banknotesCount: IntArray) {
        for (i in banknotes.indices) banknotes[i] += banknotesCount[i].toLong()
    }

    fun withdraw(amount: Int): IntArray {
        if (banknotes[4] > 0 && amount >= 500) return withdrawNominal(amount, 500)
        if (banknotes[3] > 0 && amount >= 200) return withdrawNominal(amount, 200)
        if (banknotes[2] > 0 && amount >= 100) return withdrawNominal(amount, 100)
        if (banknotes[1] > 0 && amount >= 50) return withdrawNominal(amount, 50)
        if (banknotes[0] > 0 && amount >= 20) return withdrawNominal(amount, 20)
        return intArrayOf(-1)
    }
    
    private fun withdrawNominal(amount: Int, nominal: Int): IntArray {
        val index = when (nominal) {
            500 -> 4
            200 -> 3
            100 -> 2
            50 -> 1
            20 -> 0
            else -> 0
        }
        
        val count = minOf((amount / nominal).toLong(), banknotes[index])
        val newAmount = (amount - nominal * count).toInt()
        banknotes[index] -= count
        if (newAmount == 0) return IntArray(5) { if (it == index) count.toInt() else 0 }
        
        val recWithdraw = withdraw(newAmount)
        if (recWithdraw.size == 1) {
            banknotes[index] += count
            return recWithdraw
        } else {
            recWithdraw[index] += count.toInt()
            return recWithdraw
        }
    }
}