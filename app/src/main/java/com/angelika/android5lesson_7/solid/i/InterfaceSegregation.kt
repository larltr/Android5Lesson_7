package com.angelika.android5lesson_7.solid.i

interface CanSwim {
    fun swim()
}

interface CanFly {
    fun fly()
}

class Duck : CanSwim, CanFly {
    override fun swim() {}

    override fun fly() {}
}

class Penguin : CanSwim {
    override fun swim() {}
}