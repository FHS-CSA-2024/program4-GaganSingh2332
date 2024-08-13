//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;
public class Program4 {
    public static void main(String[] args){
    int firstNum = 0;
    int secondNum = 0;
    int thirdNum = 0;
    int fourNum = 0;
    int sum = 0;
    double average = 0.0000000;
    
    Scanner numScanner = new Scanner(System.in);
    System.out.println("Enter First Number");
    firstNum = numScanner.nextInt();
    System.out.println("Enter Second Number");
    secondNum = numScanner.nextInt();
    System.out.println("Enter Third Number");
    thirdNum = numScanner.nextInt();
    System.out.println("Enter Fourth Number");
    fourNum = numScanner.nextInt();
    
    sum = (firstNum + secondNum + thirdNum + fourNum);
    average = sum / 4.0;
    
    System.out.println("The sum of the four numbers is " + sum);
    System.out.println("The average of the four numbers is " + average);
    
    
    }
}


//Paste console output below:
/*
The sum of the four numbers is 2227

The average of the four numbers is 556.75

*/
