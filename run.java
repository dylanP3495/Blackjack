
/**
 * Write a description of class Run here.
 * 
 * @author Dylan 
 * @version 10/3/17
 */
import java.util.Scanner;
import java.lang.Math;
public class run
{
    public static void play(){
        hand dealer = new hand();
        hand player = new hand();

        System.out.println(" You draw a " + player.getCard1() +"and a " + player.getCard2() + ".");
        System.out.println("Your total is "  + player.getTotal() + ".");
        System.out.println("The dealer draws a " + dealer.getCard1() + " and another hidden card.");
        Scanner keyboard = new Scanner(System.in);
        System.out.println();
        System.out.println("Would you like to /hit/ or /stay/?    ");
        String hitStay = keyboard.next();
        while(hitStay.equalsIgnoreCase("hit")){
          System.out.println();    
          System.out.println("You draw a " + player.getRandNum() + ".");
          System.out.println("Your total is " + player.getTotal() + ".");
          System.out.println();
           
          if (player.check() == true){
                System.out.println("You've got blackjack!");
                System.exit(0);
          } 
          if (player.getTotal() > 21) {
            System.out.println("You have busted. Your total was " + player.getTotal());
            System.exit(0);
    	  }
    	  System.out.println("Would you like to /hit/ or /stay/?    ");
          hitStay = keyboard.next();
       }
       System.out.println();
       System.out.println("Dealer's turn");
       System.out.println("The dealer reveals his second card,a " +dealer.getCard2() +".");
       System.out.println("The dealer's total is " + dealer.getTotal() + ".");
       while (dealer.getTotal() <=17){
           System.out.println();
           System.out.println("The dealer has drawn " + dealer.getRandNum() +".");
           System.out.println("The dealer's total is " + dealer.getTotal() + ".");
           System.out.println();
       }
       if (dealer.getTotal() > 21){
           System.out.println("The dealer busted!");
           System.exit(0);
       }
       if (dealer.getTotal() == player.getTotal()){
           System.out.println("Your total and the dealer's total are the same, nobody wins.");
           System.exit(0);
          
       }
       if (dealer.getTotal() > player.getTotal()){
           System.out.println("The dealer has won!");
           System.exit(0);
        }
       if (player.getTotal() > dealer.getTotal()){
           System.out.println("You've won!");
           System.exit(0);
        }
       if (dealer.getTotal() == 21){
           System.out.println("The dealer got blakjack!");
           System.exit(0);
        }
    }
    }

