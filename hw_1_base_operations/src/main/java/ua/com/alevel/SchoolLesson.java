package ua.com.alevel;

import java.util.Scanner;

public class SchoolLesson {

    private static final int Hour = 60;

    public void endLesson() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lesson : ");
        int les = scanner.nextInt();

        if (les < 1 || les > 10) {
            System.out.println("Invalid lesson, try again");
            endLesson();
        }

        int lessonTime = 45;
        int time = 9 * Hour;
        time += les * lessonTime + (les - 1) * 5 + (les - 1) / 2 * 10;
        int hourOfEnd = time / Hour;
        int minutesOfEnd = time - hourOfEnd * Hour;
        String enhancedMinutes = minutesOfEnd < 10 ? "0" + minutesOfEnd : String.valueOf(minutesOfEnd);

        System.out.println("End of the lesson - " + hourOfEnd + ":" + enhancedMinutes);
        System.out.println("The lesson ended at " + hourOfEnd + " hours and " + minutesOfEnd + " minutes");
    }
}
