/* Stocks buy and sell to maximise profit */

class Stocks_buy_and_sell
{
    static int maxProfit(int a[])
    {
        int max_profit = 0;
        int minSoFar = a[0];

        for(int i=0; i<a.length; i++)
        {
            minSoFar = Math.min(minSoFar, a[i]);
            int profit = a[i] - minSoFar;
            max_profit = Math.max(max_profit, profit);
        }

        return max_profit;
    }

    public static void main(String[] args)
    {
        // stock prices on consecutive days
        // int price[] = { 5, 2, 6, 1, 4 };
        int price[] = { 7,6,4,3,1 };
 
        System.out.println(maxProfit(price));
    }
}