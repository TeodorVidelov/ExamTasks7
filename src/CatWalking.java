import java.util.Scanner;
public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesWalkPerDay = Integer.parseInt(scanner.nextLine());
        int countWalksPerDay = Integer.parseInt(scanner.nextLine());
        int consumedCaloriesPerDay = Integer.parseInt(scanner.nextLine());

        int sumMinutesWalk = minutesWalkPerDay * countWalksPerDay;
        int burnedCaloriesPerDay = sumMinutesWalk * 5;
        double haveToBurnCaloriesPerDay = consumedCaloriesPerDay * 0.50;
        if (burnedCaloriesPerDay >= haveToBurnCaloriesPerDay)
        {
                System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.",burnedCaloriesPerDay);
        }
        else
        {
                System.out.printf( "No, the walk for your cat is not enough. Burned calories per day: %d.",burnedCaloriesPerDay);
        }
    }
}