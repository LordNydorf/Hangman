import kotlin.random.Random

fun setupGame() {
    val wordIndex = Random.nextInt(words.size)
    word = words[wordIndex].toUpperCase()
    for (i in word.indices)
        guesses.add('_')



    var gameOver = false

    do {
        printGameStatus()
        println("Please enter a letter: ")
        val input = readLine() ?: ""

        if (input.isEmpty()) {
            println("That's not a valid input. Please try again")
        } else {
            val letter = input[0].toUpperCase()
            if (word.contains(letter)) {
                for (i in word.indices) {
                    if (word[i] == letter)
                        guesses[i] = letter
                }
                if (!guesses.contains('_'))
                    gameOver = true
            } else {
                println("Sorry, that's not part of the word")
                remainingGuesses--
                mistakes++
                if (mistakes == 6)
                    gameOver = true
            }
        }
    } while (!gameOver)

    if(mistakes == 6) {
        printGameStatus()
        println("Sorry, you lost. Thw word was \n$word")
    } else {
        println("\nCongratulations, you win!")
        println("The word was \n$word")
    }
}