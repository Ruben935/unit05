fun calculateProfit(
    numShares: Int,
    purchasePrice: Double,
    purchaseCommission: Double,
    salePrice: Double,
    saleCommission: Double
): Double
{
    val totalPurchaseCost = numShares * purchasePrice + purchaseCommission
    val totalSaleRevenue = numShares * salePrice - saleCommission
    return totalSaleRevenue - totalPurchaseCost
}

fun main()
{
    print("Enter number of shares: ")
    val numShares = readLine()?.toIntOrNull() ?: 0

    print("Enter purchase price per share: ")
    val purchasePrice = readLine()?.toDoubleOrNull() ?: 0.0

    print("Enter purchase commission: ")
    val purchaseCommission = readLine()?.toDoubleOrNull() ?: 0.0

    print("Enter sale price per share: ")
    val salePrice = readLine()?.toDoubleOrNull() ?: 0.0

    print("Enter sale commission: ")
    val saleCommission = readLine()?.toDoubleOrNull() ?: 0.0

    val profit = calculateProfit(numShares, purchasePrice, purchaseCommission, salePrice, saleCommission)
    if (profit >= 0)
    {
        println("Profit: $$profit")
    }
    else
    {
        println("Loss: $$profit")
    }
}
