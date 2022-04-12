import java.util.Scanner;
public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rentOfHallForTheParty = Double.parseDouble(scanner.nextLine());

        double priceOfCake = rentOfHallForTheParty * 0.20;
        double priceOfDrinks = priceOfCake * 0.55;
        double wageOfAnimator = rentOfHallForTheParty * 1/3;
        double neededSum = priceOfCake + priceOfDrinks + wageOfAnimator + rentOfHallForTheParty;
        System.out.printf("%.1f",neededSum);
    }
}