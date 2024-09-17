import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        NumberFormat formatter = new DecimalFormat("#0.00");
        Scanner s = new Scanner(System.in);

        System.out.println("----------------------------------------------");   //Note for inputs
        System.out.println("| Note: No symbols like $ and % inside date! |");
        System.out.println("----------------------------------------------");
        System.out.print("Enter your bill ($): ");
        String money = s.nextLine();
        double bill = Double.parseDouble(money);    //Gets the bill amount and converts it to a double
        System.out.print("Enter tip (%): ");
        String per = s.nextLine();
        double tip = Double.parseDouble(per);        //gets the tip % and converts it to a double
        System.out.print("Number of people: ");
        String hum = s.nextLine();
        double people = Double.parseDouble(hum);      //gets the num of people and converts it to a double

        double totalTip = tip/100.0 * bill;   //calculate total tip
        double peopleTip = totalTip / people;  //calculate tip/person
        double total = totalTip + bill;           //calculate total cost
        double totalPerson =total / people;   //calculate cost/person

        System.out.println("----------------------------------");
        System.out.println("|Total tip: $" + formatter.format(totalTip) + "                |");
        System.out.println("----------------------------------");
        System.out.println("|Total bill cost: $" + formatter.format(total) + "        |");
        System.out.println("----------------------------------");
        System.out.println("|Tips per person: $" + formatter.format(peopleTip) + "         |");
        System.out.println("----------------------------------");
        System.out.println("|Total bill per person: $" + formatter.format(totalPerson) + "   |");
        System.out.println("----------------------------------");   //prints out the values with the format + the $ signs










    }
}