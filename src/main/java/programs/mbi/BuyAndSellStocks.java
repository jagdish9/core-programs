package programs.mbi;

public class BuyAndSellStocks {
    public static void main(String[] args) {
        int[] price = {100, 180, 260, 310, 40, 535, 695};

        int totalProfit = 0;
        for(int i = 0; i < price.length - 1; i++) {
            if(price[i] < price[i+1]) {
                totalProfit += price[i+1] - price[i];
            }
        }

        System.out.println(totalProfit);
    }
}
