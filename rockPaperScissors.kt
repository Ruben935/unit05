import kotlin.random.Random

fun main()
{
    var playAgain: Boolean
    do
    {
        println("Let's play Rock, Paper, Scissors!")
        val computerChoice = Random.nextInt(1, 4)
        val userChoice = getUserChoice()
        printResult(computerChoice, userChoice)
        playAgain = askToPlayAgain()
    } while (playAgain)
}

fun getUserChoice(): Int
{
    println("Please enter your choice:")
    println("1: Rock")
    println("2: Paper")
    println("3: Scissors")
    return readLine()?.toIntOrNull() ?: 0
}

fun printResult(computerChoice: Int, userChoice: Int)
{
    val choices = listOf("Rock", "Paper", "Scissors")
    val computer = choices[computerChoice - 1]
    val user = choices[userChoice - 1]
    println("Computer chose $computer")
    println("You chose $user")
    when
    {
        computer == user -> println("It's a tie!")
        (computer == "Rock" && user == "Scissors") ||
                (computer == "Paper" && user == "Rock") ||
                (computer == "Scissors" && user == "Paper") -> println("Computer wins!")
        else -> println("You win!")
    }
}

fun askToPlayAgain(): Boolean
{
    println("Do you want to play again? (Y/N)")
    val answer = readLine()
    return answer?.equals("Y", ignoreCase = true) ?: false
}
