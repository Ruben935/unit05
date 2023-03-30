fun main(args: Array<String>)
{
    fun fibonacci(n: Int): Int
    {
        if (n <= 1) {
            return n
        }
        return fibonacci(n - 1) + fibonacci(n - 2)
    }
    fibonacci(1)  // = 1
    fibonacci(2)  // = 1
    fibonacci(3)  // = 2
    fibonacci(4)  // = 3
    fibonacci(5)  // = 5
    fibonacci(6)  // = 8
    fibonacci(7)  // = 13
    fibonacci(10) // = 55

    println(fibonacci(10))
}
