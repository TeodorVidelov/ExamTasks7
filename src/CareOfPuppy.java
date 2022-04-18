import java.util.Scanner;
public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boughtKgFoodForPuppy = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int kgFoodToGr = boughtKgFoodForPuppy * 1000;
        int totalEatenFood = 0;

        while (!"Adopted".equals(input))
        {
            int grEatenFoodPerDay = Integer.parseInt(input);
                totalEatenFood += grEatenFoodPerDay;

              input = scanner.nextLine();
        }
        if (totalEatenFood <= kgFoodToGr)
        {
            System.out.printf("Food is enough! Leftovers: %d grams.",kgFoodToGr - totalEatenFood);
        }
        else
        {
            System.out.printf("Food is not enough. You need %d grams more.",totalEatenFood - kgFoodToGr);
        }
    }
}