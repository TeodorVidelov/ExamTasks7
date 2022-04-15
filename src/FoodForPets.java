import java.util.Scanner;
public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalAmountOfFood = Double.parseDouble(scanner.nextLine());

        int sumFoodEatenByDog = 0;
        int sumFoodEatenByCat = 0;

        double totalEatenBiscuits = 0;
        for (int i = 1; i <= days; i++)
        {
            int foodEatenByDogPerDay = Integer.parseInt(scanner.nextLine());
            int foodEatenByCatPerDay = Integer.parseInt(scanner.nextLine());

            sumFoodEatenByDog += foodEatenByDogPerDay;
            sumFoodEatenByCat += foodEatenByCatPerDay;
            int eatenFoodPerDay = foodEatenByCatPerDay + foodEatenByDogPerDay;

            if (i % 3 == 0)
            {
                double biscuits = eatenFoodPerDay * 0.10;
                totalEatenBiscuits += biscuits;
            }
        }
        
        double totalEatenFood = sumFoodEatenByCat + sumFoodEatenByDog;
        double percentEatenFood = (totalEatenFood / totalAmountOfFood) * 100;
        double percentEatenFoodByDog = (sumFoodEatenByDog / totalEatenFood) * 100;
        double percentEatenFoodByCat = (sumFoodEatenByCat / totalEatenFood) * 100;

        System.out.printf("Total eaten biscuits: %.0fgr.\n",totalEatenBiscuits);
        System.out.printf("%.2f%% of the food has been eaten.\n",percentEatenFood);
        System.out.printf("%.2f%% eaten from the dog.\n",percentEatenFoodByDog);
        System.out.printf("%.2f%% eaten from the cat.",percentEatenFoodByCat);
    }
}