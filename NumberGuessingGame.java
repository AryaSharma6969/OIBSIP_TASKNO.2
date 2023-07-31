import java.util.Scanner;
public class NumberGuessingGame{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int MyNumber = (int)(Math.random()*100);
        int UserNumber= 0;

        do{
            System.out.print("Guess my number (1-100):- ");
            UserNumber = sc.nextInt();
        
            if(UserNumber == MyNumber){
                System.out.println("You won!!! Your number is correct.");
                break;
            }
            else if(UserNumber>100){
                System.out.println("Your Number is out of the guessing options. Please try a number between 1 to 100");
            }
            
            else if(UserNumber>MyNumber){
                System.out.println("Your number is greater than MyNumber.");
            }
            else if (UserNumber== -1){
                System.out.println("You exit the game.");
            
            }
        
            else{
                System.out.println("Your number is lesser than MyNumber");
            }
            
        } while(UserNumber>=0);
        
            System.out.println("MyNumber was " + MyNumber);
            
        
    }
}
