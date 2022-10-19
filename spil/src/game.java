import java.util.Random;
import java.util.Scanner;
import javax.xml.validation.Validator;
public class game {
    public static void main(String args[]) {

        Random ranNum = new Random();
            System.out.print("Du har slået: ");
            int total = 0;
            int randomNumber = 0;
            int sum = 0;

            for (int i = 0; i <2 ; i++) {

                randomNumber = ranNum.nextInt(6) + 1;
                total = total + randomNumber;
                System.out.print(randomNumber);
                System.out.print(" ");


                System.out.println("");
                System.out.println("Din sum er: " + total);
            }

                Scanner scan = new Scanner(System.in);
                System.out.println("indtast din sum (0 to quit): ");


                for (int ojensum = scan.nextInt(); ojensum != 0; ojensum = scan.nextInt()) {
                    ++total;
                    sum += ojensum;

                    System.out.println("The sum so far is " + sum);
                }
            }
        }









