fun main() {

}

interface A {
    fun print1()
}

class App : A by FirstDelegation(), B by SecondDelegation() {

    override fun print1() {

    }

    override fun print2() {

    }
}

interface B {
    fun print2()
}

open class FirstDelegation() : A {
    override fun print1() {

    }

}

open class SecondDelegation() : B {
    override fun print2() {

    }

}