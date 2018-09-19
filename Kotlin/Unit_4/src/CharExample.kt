/*
 * Copyright 2018 Makoto Consulting Group, Inc
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 */

/**
 * The main function that drives the program
 */
fun main(args: Array<String>) {
    charExamples()
}

/**
 * Run the example to demonstrate
 */
fun charExamples() {
    // Declare Char variable and initialize to a literal value
    var char: Char = 'a'
    println("The value of char('a') is: $char")

    char = '\"'
    println("The value of char('\"') is: $char")

    char = '\n'
    println("The value of char('\\n') is: $char")

    char = 'Z'
    println("The value of char('Z') is: $char")

    // Unicode symbols!
    char = '\u23f8'
    println("The value of char('\\u23f8') is: $char")

    char = '\u222b'
    println("The value of char('\\u222b') is: $char")

    char = '\u2654'
    println("The value of char('\\u2654') is: $char")

    // Question: Why does this statement not compile?
    //char = 10
}
