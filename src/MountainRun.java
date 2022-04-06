import java.util.Scanner;
public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeIntSecondsForWhichClimbsOneMeter = Double.parseDouble(scanner.nextLine());

        double distanceInSeconds = distanceInMeters * timeIntSecondsForWhichClimbsOneMeter;
        double slowingOnEach50Meters = Math.floor((distanceInMeters / 50)) * 30;
        double totalTimeInSeconds = distanceInSeconds + slowingOnEach50Meters;

        if (totalTimeInSeconds >= recordInSeconds)
        {
            System.out.printf("No! He was %.2f seconds slower.",totalTimeInSeconds - recordInSeconds);
        }
        else
        {
            System.out.printf("Yes! The new record is %.2f seconds.",totalTimeInSeconds);
        }
    }
}