import java.util.Scanner;
public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budgetForCard = Double.parseDouble(scanner.nextLine());
        String genderOfAthlete = scanner.nextLine();
        int ageOfTheAthlete = Integer.parseInt(scanner.nextLine());
        String typeOfSportPractising = scanner.nextLine();

            double price = 0;

            switch (genderOfAthlete)
            {
                case "m":
                    if ("Gym".equals(typeOfSportPractising))
                    {
                        price = 42;
                    }
                    else if ("Boxing".equals(typeOfSportPractising))
                    {
                        price = 41;
                    }
                    else if ("Yoga".equals(typeOfSportPractising))
                    {
                        price = 45;
                    }
                    else if ("Zumba".equals(typeOfSportPractising))
                    {
                        price = 34;
                    }
                    else if ("Dances".equals(typeOfSportPractising))
                    {
                        price = 51;
                    }
                    else if ("Pilates".equals(typeOfSportPractising))
                    {
                        price = 39;
                    }
                    break;
                case "f":
                    if ("Gym".equals(typeOfSportPractising))
                    {
                        price = 35;
                    }
                    else if ("Boxing".equals(typeOfSportPractising))
                    {
                        price = 37;
                    }
                    else if ("Yoga".equals(typeOfSportPractising))
                    {
                        price = 42;
                    }
                    else if ("Zumba".equals(typeOfSportPractising))
                    {
                        price = 31;
                    }
                    else if ("Dances".equals(typeOfSportPractising))
                    {
                        price = 53;
                    }
                    else if ("Pilates".equals(typeOfSportPractising))
                    {
                        price = 37;
                    }
                    break;
            }
                if (ageOfTheAthlete <= 19)
                {
                    price *= 0.80;
                }

            if (price <= budgetForCard)
            {
                System.out.printf("You purchased a 1 month pass for %s.",typeOfSportPractising);
            }
            else
            {
                System.out.printf("You don't have enough money! You need $%.2f more.",Math.abs(budgetForCard - price));
            }
    }
}