import java.util.Scanner;
import java.util.Random;
public class prøvigen {
    static int player1Total = 0;
    static int player2Total = 0;
    static int winner = 0;	//0 = no winner yet;  1 = player 1 wins; 2 = player 2 wins
    static int round = 1; //record the play round;
    public static void main(String [] args)
    {
        while (winner == 0)
        {
            System.out.println("\n------------Dette er runde "+round+"-------------");
            round++;
            rollDice1();
            rollDice2();
        }
    }
    public static void rollDice1()
    {
        if (winner == 0)
        {
            int num1=0;
            int num2=0;
            do
            {
                num1 = (int) (Math.random() * 6)+1;
                num2 = (int) (Math.random() * 6)+1;
                System.out.println("Spiller1 slår: "+num1+" og:  "+num2);
                player1Total = player1Total+num1+num2;

if (num1==6&&num2==6)
{
    System.out.println("Spiller1 har vundet");
    break;
}

                if (num1==num2&&num1==1&&num2==1&&player1Total<40)
                {
                    System.out.println("Spiller1 får fratrukket alle point");
                    player1Total=0;
                    System.out.println("Spiller1 har nu: "+player1Total);

                }
                else if (num1==num2&&player1Total<40)
                {
                    System.out.println("Spiller1 må slå igen");
                    System.out.println("Spiller1 har nu: "+player1Total);

                    if (num1==6&&num2==6)
                {
                    System.out.println("Spiller1 har vundet");

                }

                }
                else
                    System.out.println("Spiller1 har nu: "+player1Total);


            }
            while(num1==num2&&num1!=1&&num2!=1&&player1Total<40);
            if (player1Total>=40)
            {
                winner = 1;
                System.out.println("Spiller1 vinder med en score på: "+player1Total);
                System.out.println("\nDen endelige score er \nSpiller1: "+player1Total+"\nSpiller2: "+player2Total);
            }
        }
    }


    public static void rollDice2()
    {
        if (winner == 0)
        {
            int num1 = (int) (Math.random() * 6)+1;
            int num2 = (int) (Math.random() * 6)+1;
            System.out.println("Spiller2 slår:  "+num1+" og "+num2);
            player2Total = player2Total+num1+num2;
if (num1==6&&num2==6)
        {
            System.out.println("Spiller2 har vundet");

        }

                if (num1 == 1 && num2 == 1) {
                    System.out.println("Spiller2 får fratrukket alle sine point");
                    player2Total = 0;
                    System.out.println("Spiller2 har nu " + player2Total);

                } else if (num1 == num2 && num1 != 1 && num2 != 1) {
                    System.out.println("Spiller2 må slå igen");
                    rollDice2();//recall
                    System.out.println("Spiller2 har nu " + player2Total);

                } else
                    System.out.println("Spiller2 har nu " + player2Total);


            }
            if (player2Total>=40)
            {
                winner = 2;
                System.out.println("Spiller2 vinder med en score på  "+player2Total);
                System.out.println("\nDen endelige score er\nSpiller1: "+player1Total+"\nSpiller2: "+player2Total);
            }
        }
    }
