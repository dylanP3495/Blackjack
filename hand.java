
/**
 * It does a thing.
 * 
 * @author Dylan
 * @version 9/27/17
 */

import java.util.Scanner;
import java.lang.Math;
public class hand
{
    private int card1;
    private int card2;
    private int total;

    public hand(){
        card1 = getRandNum();
        card2 = getRandNum();
        total = (card1 + card2);
    }

    public int getRandNum(){
        int randomNum =((int)(Math.random() * 9)+2);
        total += randomNum;
        return randomNum;
    }

    public int getCard1(){
        return card1;
    }

    public int getCard2(){
        return card2;
    }

    public int getTotal(){
        return total;
    }
}
