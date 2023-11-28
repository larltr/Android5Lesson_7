package com.angelika.android5lesson_7.solid.d

interface Animal{
    fun voice():String
}

class Dog():Animal{
    override fun voice(): String = "gav gav"
}

class Cat():Animal{
    override fun voice(): String = "may may"
}