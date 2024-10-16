fun printGameStatus(){
    when(mistakes) {
        0 -> print0Mistakes()
        1 -> print1Mistake()
        2 -> print2Mistakes()
        3 -> print3Mistakes()
        4 -> print4Mistakes()
        5 -> print5Mistakes()
        6 -> print6Mistakes()
    }

    print("Word: ")
    for (element in guesses)
        print("$element ")
    println("\nYou have $remainingGuesses guess(es) left")
}