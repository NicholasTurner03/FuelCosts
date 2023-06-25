import java.util.Scanner;

public class FuelCosts {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double numberGallon;
        double milesGallon;
        double priceGallon;
        numberGallon=0;
        priceGallon=0;
        milesGallon=0;
        String trashOne;
        String trashTwo;
        String trashThree;
        boolean done = false;
        System.out.println("Please enter the numbers of gallon in your tank:");
        do
        {
            if (in.hasNextDouble()) {
                numberGallon = in.nextDouble();
                in.nextLine();
                done = true;

            }else{
                trashOne=in.nextLine();
                System.out.println("You said your numbers of gallon in your tank was: "+trashOne);
                System.out.println("Invalid entry, try again!");}
        }while(!done);


        System.out.println("Please enter your fuel effienciency in miles per gallon:");

        do
        {
            if (in.hasNextDouble()) {
                milesGallon = in.nextDouble();
                in.nextLine();
                done = true;

            }else{
                trashTwo=in.nextLine();
                System.out.println("You said your fuel effienciey was: " +trashTwo);
                System.out.println("Invalid entry, try again");}
        }while(!done);
        System.out.println("Please enter your price of gas per gallon");
        do
        {
            if (in.hasNextDouble()) {
                priceGallon = in.nextDouble();
                in.nextLine();
                done = true;

            }else{
                trashThree=in.nextLine();
                System.out.println("You said your pricer per gallon was: " +trashThree);
                System.out.println("Invalid entry, try again");}
        }while(!done);
milesGallon=milesGallon*100;
numberGallon=milesGallon/numberGallon;
priceGallon=milesGallon*priceGallon;
        System.out.println("The cost per 100 miles is: $"+priceGallon);
        System.out.println("The distance you can go is: "+milesGallon);
    }
}
