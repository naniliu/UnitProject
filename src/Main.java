import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SleepRecord record = new SleepRecord();

        System.out.print("Enter the number of hours you slept last night: ");
        double hoursSlept = scanner.nextDouble();
        record.setHoursSlept(hoursSlept);

        System.out.println("You slept for: " + record.getHoursSlept() + " hours.");
        record.evaluateSleepQuality();

        record.sleepRecommendation();

        if (record.isAdequateSleep()) {
            System.out.println("Good job! You got enough sleep.");
        } else {
            System.out.println("You should adjust your sleep schedule for better health.");
        }

        String sleepMessage = "Sleep well!";
        System.out.println(sleepMessage.substring(0, 11));

        for (int i = 0; i < 2; i++) {
            record.randomSleepFact();
        }
    }
}