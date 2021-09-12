import java.util.Scanner;

public class Exercisefive {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("What is the first number? ");
        String first= input.nextLine();
        System.out.print("What is the second number? ");
        String second= input.nextLine();


        int convertedFirst=Integer.parseInt(first);
        int convertedSecond=Integer.parseInt(second);

        int sum=convertedFirst+convertedSecond;

        int subtraction=convertedFirst-convertedSecond;

        int multiplication=convertedFirst*convertedSecond;

        int division=convertedFirst/convertedSecond;


        System.out.println(convertedFirst+" + "+convertedSecond+" = "+sum);
        System.out.println(convertedFirst+" - "+convertedSecond+" = "+subtraction);
        System.out.println(convertedFirst+" * "+convertedSecond+" = "+multiplication);
        System.out.println(convertedFirst+" / "+convertedSecond+" = "+division);
    }
}