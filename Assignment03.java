// Class       :   <CSE 110 Online >
// Assignment  : Assignment03
// Author      : Brandon Worley ID # 1221104768
// Description : Using If Else statements to determine Buy or Sell Shares
import java.util.Scanner;
public class Assignment03 {

    public static void main(String[] args) {
        // declare and instantiate a Scanner
    	Scanner scan = new Scanner(System.in);
        
        // declare and initialize variables
    	int currentShares = 0;
    	int purchasePrice = 0;
    	int marketPrice = 0;
    	int availableFunds = 0;
    	final int TransactionFee = 10;
    	
        
        // prompt for and collect inputs
    	System.out.println(" Enter the number of current shares (in US $): ");
        currentShares = scan.nextInt();
    	
        System.out.println(" Enter the number the purchase price per share (in US $): ");
        purchasePrice = scan.nextInt();
        
        System.out.println(" Enter the market value per share (in US $): ");
        marketPrice = scan.nextInt();
        
        System.out.println(" Enter the available funds to purchase (in US $): ");
        availableFunds = scan.nextInt();
        
        
        /* Each time we sell , it will cost us the $10 transaction fee
         *     final INT transactionFee = 10 will be added to the declared variables
         *     
         * Each time we buy, it will cost us the $10 transaction fee, 
         *  plus the cost of the shares we are buying:
         * 𝑡𝑜𝑡𝑎𝑙𝐵𝑢𝑦𝐶𝑜𝑠𝑡=10+𝑚𝑎𝑟𝑘𝑒𝑡𝑃𝑟𝑖𝑐𝑒∙𝑛𝑢𝑚𝑏𝑒𝑟𝑂𝑓𝑆ℎ𝑎𝑟𝑒𝑠𝑇𝑜𝐵𝑢𝑦 
         * 		This formula was added to the declared variables after asking for input
         * 
         * The number of shares we can afford to buy would be:
         * 	𝑛𝑢𝑚𝑏𝑒𝑟𝑂𝑓𝑆ℎ𝑎𝑟𝑒𝑠𝑇𝑜𝐵𝑢𝑦 = math.𝐹𝐿𝑂𝑂𝑅(𝑎𝑣𝑎𝑖𝑙𝑎𝑏𝑙𝑒𝐹𝑢𝑛𝑑𝑠− (T𝑟𝑎𝑛𝑠𝑎𝑐𝑡𝑖𝑜𝑛𝐹𝑒𝑒 + 𝑚𝑎𝑟𝑘𝑒𝑡𝑃𝑟𝑖𝑐𝑒))
         * 		This formula was added as well after asking for user inputs// had to be first formula 
         * 
         * In order for a purchase (buy) to be considered profitable, the current market price (per share) 
         *   must be lower than the purchase price (per share) paid for current stock in the account. 
         *   	First IF statement should include the decision to buy with the argument pP is greater than mP
         *   	-- IF( purchasePrice > marketPrice) {
         *   		}
         *   		ELSE() {
         *   		}
         *   			
         *   
         * Additionally, the amount the client is willing to spend on a purchase must allow us to buy enough 
         *   shares so that the difference in value will cover the $10 transaction fee.
         *   	A IF statement should be created in addition to the first with || 
         *   	-- if( purchasePrice > marketPrice && totalBuyValue > 10) {
         *   		}
         *   		else  { 
         *   			System.out.println(" Hold Shares ");
         *   		}
         *   		
         * 
         *  In other words, if the current market price (per share) is lower than the purchase price 
         *  	(per share) paid for current stock in the account, then there is a potential per share value 
         * 		that is equal to the price difference:
         *  𝑝𝑒𝑟𝑆ℎ𝑎𝑟𝑒𝐵𝑢𝑦𝑉𝑎𝑙𝑢𝑒=𝑝𝑢𝑟𝑐ℎ𝑎𝑠𝑒𝑃𝑟𝑖𝑐𝑒−𝑚𝑎𝑟𝑘𝑒𝑡𝑃𝑟𝑖𝑐𝑒
         *  
         *  Assuming that we have the available funds to buy enough shares (and pay the $10 transaction fee), 
         *  	we should buy if the total value
         *   	of the shares is greater than the $10 transaction fee. The total value of the 
         *  	shares is the per-share value times the number of shares we can afford to buy:
         *  𝑡𝑜𝑡𝑎𝑙𝐵𝑢𝑦𝑉𝑎𝑙𝑢𝑒=𝑝𝑒𝑟𝑆ℎ𝑎𝑟𝑒𝐵𝑢𝑦𝑉𝑎𝑙𝑢𝑒∙𝑛𝑢𝑚𝑏𝑒𝑟𝑂𝑓𝑆ℎ𝑎𝑟𝑒𝑠𝑇𝑜𝐵𝑢𝑦
         *  
         *  In order for a sale (sell) to be considered profitable, the current market price (per share) 
         *  	must be higher than the purchase price (per share) paid for current stock in the account. 
         *  	Additionally, the value gained by selling the shares must also cover the $10 transaction fee.
         *  		Next IF Statement should include the decision to sell inside the original IF statement
         *  			needed to compare the value of sale (marketPrice * currentShares) is greater than the purchase
         *  			price including TransactionFee (
         *  		ELIF( marketPrice * currentShares > purchasePrice + TransactionFee) {
         *  		}
         *  		else {
         *  		 	System.out.println("Hold Shares");
         *  		}
         *  
         *  In other words, if the current market price (per share) is higher than the purchase price (per share) 
         *  	paid for current stock in the account, 
         *  	then there is a potential per share value that is equal to the price difference:
         *  𝑝𝑒𝑟𝑆ℎ𝑎𝑟𝑒𝑆𝑒𝑙𝑙𝑉𝑎𝑙𝑢𝑒=𝑚𝑎𝑟𝑘𝑒𝑡𝑃𝑟𝑖𝑐𝑒−𝑝𝑢𝑟𝑐ℎ𝑎𝑠𝑒𝑃𝑟𝑖𝑐𝑒
         *  
         *  In this case, we should see if we have enough shares of this stock so that the total value of the shares
         *  	is greater than the $10 transaction fee. The total value of the shares is the per-share value 
         * 		times the number of shares we currently have:
         * 𝑡𝑜𝑡𝑎𝑙𝑆𝑒𝑙𝑙𝑉𝑎𝑙𝑢𝑒=𝑝𝑒𝑟𝑆ℎ𝑎𝑟𝑒𝑆𝑒𝑙𝑙𝑉𝑎𝑙𝑢𝑒∙𝑐𝑢𝑟𝑟𝑒𝑛𝑡𝑆ℎ𝑎𝑟𝑒𝑠
         * 
         * If neither a buy nor a sell would be profitable, then we should simply hold the existing shares.
         */
        // compute required values
       int numberOfSharesToBuy = Math.floorDiv( (availableFunds - TransactionFee) , marketPrice);
       int totalbuyCost = 10 + marketPrice * numberOfSharesToBuy;
       int perShareBuyValue = purchasePrice - marketPrice;
       int TotalBuyValue = perShareBuyValue * numberOfSharesToBuy;
       int perShareSellValue = marketPrice - purchasePrice;
       int totalSellValue = perShareSellValue * currentShares;
       
       
       
        
        
        
        
        // display required outputs
       if( purchasePrice > marketPrice && TotalBuyValue > TransactionFee) {
    	   System.out.println("Buy " + " " + numberOfSharesToBuy + " shares");
    	   
       } else if( marketPrice * currentShares > purchasePrice + TransactionFee) {
        	   System.out.println("Sell " + " " + (totalSellValue - TransactionFee) + " shares");
        	   
       } else {
        	   System.out.println(" Hold shares ");
       }
    	   
   }
       
}
//end of code