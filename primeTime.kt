fun main(args: Array<String>)
{
    fun isNumberDivisible(number: Int, divisor: Int): Boolean
    {
        return number % divisor == 0
    }

    fun isPrime(number: Int): Boolean
    {
        if (number < 2) return false
        for (i in 2 until number)
        {
            if (isNumberDivisible(number, i)) return false
        }
        return true
    }
    println(isNumberDivisible(10, 2)) // true
    println(isNumberDivisible(7, 3))  // false

    println(isPrime(5))  // true
    println(isPrime(12)) // false
}
