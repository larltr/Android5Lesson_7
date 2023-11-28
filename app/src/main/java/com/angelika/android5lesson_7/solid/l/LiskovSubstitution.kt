package com.angelika.android5lesson_7.solid.l

open class Bird {
    open fun feathered(): Boolean = true
}

interface IFlyingBird {
    fun fly(): Boolean
}

class Penguin : Bird() {
    override fun feathered(): Boolean {
        return true
    }
}

class Eagle : Bird(), IFlyingBird {
    override fun fly(): Boolean {
        return true
    }

    override fun feathered(): Boolean {
        return true
    }
}