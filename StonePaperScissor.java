import java.util.Scanner;
import java.util.Random;

class StonePaperScissor
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("          Stone Paper Scissor");
        System.out.println("\n        Game Rules :");
        System.out.println("        0 --> Stone\n        1 --> Paper\n        2 --> Scissor");
        
        System.out.print("   Get 3 points to win, Good Luck!\n\n  Enter your name : ");
        String name = obj.nextLine();

        int yourScore = 0;
        int myScore = 0;

        while(yourScore<3 && myScore<3)
        {
            System.out.print("   " + name + "'s choice : ");
            int yourChoice = obj.nextInt();
            int myChoice = rand.nextInt(3);
            System.out.println("   Computer's choice : " + myChoice);

            if(yourChoice == myChoice + 1)
                yourScore ++;
            else if(myChoice == yourChoice + 1)
                myScore++;
            else if(yourChoice == 0 && myChoice == 2)
                yourScore++;
            else if(yourChoice == 2 && myChoice == 0)
                myScore++;
            
            System.out.println("    Scores : ");
            System.out.println("  " + name + " : " + yourScore);
            System.out.println("  Computer : " + myScore + "\n---------------");
        }

        if(myScore > yourScore)
            System.out.println("        Computer Wins !!\n");
        else
            System.out.println("        " + name + " Wins !!\n");
    }
}