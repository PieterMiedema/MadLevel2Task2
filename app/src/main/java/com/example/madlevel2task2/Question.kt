package com.example.madlevel2task2

data class Question (
    var question: String,
    var answer: Boolean
) {
    companion object {
        val questions = mapOf<String, Boolean> (
            "1+1=2" to true,
            "monkeys have ears" to true,
            "gas is a liquid" to false,
            "the earth is flat" to false
        )
    }
}