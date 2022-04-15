import java.util.Scanner;
public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfClimbersGroup = Integer.parseInt(scanner.nextLine());

        int Musala = 0;
        int MontBlanc = 0;
        int Kilimanjaro = 0;
        int K2 = 0;
        int Everest = 0;
        int totalPeople = 0;

        for (int i = 0; i < countOfClimbersGroup; i++)
        {
            int climbersInGroup = Integer.parseInt(scanner.nextLine());
                if (climbersInGroup <= 5)
                {
                    Musala += climbersInGroup;
                }
                else if (climbersInGroup >= 6 && climbersInGroup <= 12)
                {
                    MontBlanc += climbersInGroup;
                }
                else if (climbersInGroup >= 13 && climbersInGroup <= 25)
                {
                    Kilimanjaro += climbersInGroup;
                }
                else if (climbersInGroup >= 26 && climbersInGroup <= 40)
                {
                    K2 += climbersInGroup;
                }
                else if (climbersInGroup >= 41)
                {
                    Everest += climbersInGroup;
                }
                totalPeople = Musala + MontBlanc + Kilimanjaro + K2 + Everest;
            }
        System.out.printf("%.2f%%\n",(Musala * 1.0 / totalPeople) * 100);
        System.out.printf("%.2f%%\n",(MontBlanc * 1.0 / totalPeople) * 100);
        System.out.printf("%.2f%%\n",(Kilimanjaro * 1.0 / totalPeople) * 100);
        System.out.printf("%.2f%%\n",(K2 * 1.0 / totalPeople) * 100);
        System.out.printf("%.2f%%",(Everest * 1.0 / totalPeople) * 100);
    }
}