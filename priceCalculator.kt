fun main(args: Array<String>)
{
    val wholesaleCost = 5.00
    val markupPercentage = 50

    val markupAmount = wholesaleCost * (markupPercentage / 100.0)
    val retailPrice = wholesaleCost + markupAmount
    
    println("The item's retail price is: $retailPrice")
}
