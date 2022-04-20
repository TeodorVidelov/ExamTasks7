import java.util.Scanner;
public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysDurationOfTheTournament = Integer.parseInt(scanner.nextLine());

        int totalWin = 0;
        int totalLose = 0;
        double totalProfit = 0;

        for (int i = 0; i < daysDurationOfTheTournament; i++)
        {
            String input = scanner.nextLine();
            int dayWin = 0;
            int dayLose = 0;
            double dayProfit = 0;
            while (!"Finish".equals(input))
            {
                String typeOfSport = input;
                String result = scanner.nextLine();
                    int currentProfit = 0;
                    if ("win".equals(result))
                    {
                        totalWin++;
                        dayWin++;
                        currentProfit += 20;
                    }
                    else if ("lose".equals(result))
                    {
                        totalLose++;
                        dayLose++;
                    }
                dayProfit += currentProfit;
                input = scanner.nextLine();
            }
            if (dayWin > dayLose)
            {
                dayProfit *= 1.10;
            }
            totalProfit += dayProfit;
        }
        if (totalWin > totalLose)
        {
            totalProfit *= 1.20;
            System.out.printf("You won the tournament! Total raised money: %.2f",totalProfit);
        }
        else
        {
            System.out.printf("You lost the tournament! Total raised money: %.2f",totalProfit);
        }
    }
}