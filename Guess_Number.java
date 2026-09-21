import java.util.Random;
import java.util.Scanner;

public class Guess_Number {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6};

        Random rndm = new Random();
        Scanner sc = new Scanner(System.in);

        int choice = rndm.nextInt(number.length);

        System.out.println("Guess the number between 1 and 6: ");


        for(int i=0;i<3;i++){
            System.out.print("Enter the number :- ");
            int Enumber = sc.nextInt();
            if(Enumber == number[choice]){
                System.out.println("Yay!!!!");
                System.out.println("You guess the correct number! --> "+number[choice]);
                System.exit(0);
            }
            else{
                System.out.println("Try again");
            }
        }
        
        System.out.println("All attempts are over: ");
        System.out.println("Try again later!");
        System.out.println();
        System.out.println("Correct answer is ---> "+number[choice]);
        
        sc.close();

    }
}