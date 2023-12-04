public class Prac1{
    public int maxProfit(int[] prices) {
        int max=0;
        int n=prices.length;
        int minprice=prices[0];
        for(int i=1; i<n; i++) {
                if(prices[i]<minprice) {
                minprice=prices[i];
            }
                else if(prices[i]-minprice>max){
                    max=prices[i]-minprice;
                }
            }
            return max;
            
        }
    }