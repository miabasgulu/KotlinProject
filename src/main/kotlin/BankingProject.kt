class Account(val accountName: String) {

    private var balance = 0
    private var transactions = mutableListOf<Int>()

    fun deposit(amount: Int) {

        if (amount > 0) {
            transactions.add(amount)
            balance += amount
            println("$amount deposited. Balance is now $balance")

        } else {
            println("Cannot deposit negative amount")
        }
    }

    fun withdraw(withdrawal: Int) {

        if (-withdrawal < 0) {
            transactions.add(-withdrawal)
            balance += -withdrawal
            println("$withdrawal withdrawn. Balance is now $balance")

        } else {
            println("Cannot withdraw negative amount")
        }
    }

    fun calculateBalance(): Int {
        this.balance = 0

        for (transaction in transactions) {
            this.balance += transaction
        }
        return this.balance
    }
}

fun main() {

    val myAccount = Account("MeteCheckingAccount")

    myAccount.deposit(10000)
    myAccount.withdraw(3000)
    myAccount.deposit(-1000)
    myAccount.withdraw(-2000)

    val myBalance = myAccount.calculateBalance()
    println("Current balance is $myBalance")
}