import java.util.Scanner;
public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flavourOfBooster = scanner.nextLine();
        String sizeOfBooster = scanner.nextLine();
        int countOrderedBoosters = Integer.parseInt(scanner.nextLine());

            double price = 0;
            int smallSizeOfBooster = 2;
            int bigSizeOfBooster = 5;
            if ("Watermelon".equals(flavourOfBooster))
            {
                if ("small".equals(sizeOfBooster))
                {
                    price = 56 * smallSizeOfBooster;
                }
                else if ("big".equals(sizeOfBooster))
                {
                    price = 28.70 * bigSizeOfBooster;
                }
            }
            else if ("Mango".equals(flavourOfBooster))
            {
                if ("small".equals(sizeOfBooster))
                {
                price = 36.66 * smallSizeOfBooster;
                }
                else if ("big".equals(sizeOfBooster))
                {
                price = 19.60 * bigSizeOfBooster;
                }
            }
            else if ("Pineapple".equals(flavourOfBooster))
            {
                if ("small".equals(sizeOfBooster))
                {
                    price = 42.10 * smallSizeOfBooster;
                }
                else if ("big".equals(sizeOfBooster))
                {
                    price = 24.80 * bigSizeOfBooster;
                }
            }
            else if ("Raspberry".equals(flavourOfBooster))
            {
                if ("small".equals(sizeOfBooster))
                {
                    price = 20 * smallSizeOfBooster;
                }
                else if ("big".equals(sizeOfBooster))
                {
                    price = 15.20 * bigSizeOfBooster;
                }
            }
            double totalSum = price * countOrderedBoosters;

                  if (totalSum >= 400 && totalSum <= 1000)
                  {
                    totalSum *= 0.85;
                  }
                  else if (totalSum > 1000)
                  {
                totalSum *= 0.50;
                  }
        System.out.printf("%.2f lv.",totalSum);
    }
}