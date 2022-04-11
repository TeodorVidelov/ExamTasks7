import java.util.Scanner;
public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double baggageCapacity = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        int countLoadedSuitCases = 0;
        double suitcaseVolume = 0;

        while (!"End".equals(input))
        {
            suitcaseVolume = Double.parseDouble(input);

            if ((countLoadedSuitCases + 1) % 3 == 0)
            {
                suitcaseVolume *= 1.10;
            }
            if (baggageCapacity < suitcaseVolume)
            {
                System.out.println("No more space!");
                break;
            }
            baggageCapacity -= suitcaseVolume;
            input = scanner.nextLine();
            countLoadedSuitCases++;
        }
        if ("End".equals(input))
        {
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        System.out.printf("Statistic: %d suitcases loaded.",countLoadedSuitCases);
    }
}