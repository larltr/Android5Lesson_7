package com.angelika.android5lesson_7.solid.o

interface Animal {
    fun name(): String
}

class Dog(private val age: Int) : Animal {

    override fun name(): String {
        return age.toString()
    }
}

class Cat(private val color: String) : Animal {
    override fun name(): String {
        return color
    }
}