/**
 * @author sk
 * @version 1.0
 */
public class coins {
    public static void main(String[] args) {
        int coins[] = {1, 5, 56, 10};
        int amount = 10;
        System.out.println(coinsNumIdea1(coins, amount));
    }

    public static int coinsNumIdea1(int[] coins, int amount){
        int[] dp = new int[amount+1];
        dp[0] = 0;
        for(int i=0; i<=amount; i++){
            for(int j=0; j<coins.length; j++){
                if(i >= coins[j]){
                    dp[i] = dp[i-coins[j]] + 1;
                }
            }
        }
        return dp[amount];
    }
}
