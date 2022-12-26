import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Rock Paper Scissor Game!!");
        System.out.println("Rock=0, Paper=1, scissor=2");
        int userInput= sc.nextInt();
        Random rc= new Random();
        int computerInput= rc.nextInt(3);

        if (userInput==computerInput){
            System.out.println("Draw!!");
        }
            else if(userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2 && computerInput==1){
            System.out.println("you win!!");
            }
            else{
            System.out.println("Computer win!!");
            }


        System.out.println("Computer choose: " + computerInput);


        }


    }

