package codsoft;
import java.util.Random;
import java.util.Scanner;

public class GUESS_THE_NUMBER {
    public static void main(String[] args) {
        Random rand= new Random();
        Scanner input=new Scanner(System.in);

        int maxattempts=10;
        
        while(true){
            int attempt =0;
        System.out.println("----------------------");
        System.out.println("GAME: GUESS THE NUMBER");
        System.out.println("----------------------");
        int x=rand.nextInt(1,100);

        do{
        System.out.print("Enter the number:");
        int number=input.nextInt();   


        // conditions
        if (x==number) {
            System.out.println("CONGRATZ!!!!!.You have guessed the correst number "+x+" after "+attempt+" attempts.....");
            break;
        }
        else if (number>x) {
            System.out.println("YOU ARE TOO HIGH.try again :(");}
        else {
            System.out.println("YOU ARE TOO LOW.try again :(");}
        attempt++;

        }while(attempt!=maxattempts) ;


        // If the player reached max limit.
        if (attempt==maxattempts) {
            System.out.println("Yoou have reahed the max limit.The correct answer was :"+x);
        }

        // if the player want to play again
        System.out.println("DO YOU WANT TO PLAY AGAIN?(Yes/No)");
        String choise=input.next();
        if(!choise.equalsIgnoreCase("yes")){
            break;
        }
        }

    }

}
