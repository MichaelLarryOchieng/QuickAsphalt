fun main() {

}

interface A {
    fun print()
}

interface B {
    fun print2()
}

class FirstDelegate : A {
    override fun print() {

    }
}

class SecondDelegate : B {
    override fun print2() {

    }
}