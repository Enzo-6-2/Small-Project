import java.util.Scanner;
import java.util.Random;

public class Time {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int errors = 0,words=0;

        String[] sentences = {"Big Black Bettle Bite Big Black Bear!",
                              "She sells sea shells by the sea shore!"};
        
            Random random = new Random();
            int choice = random.nextInt(sentences.length);

            String original = sentences[choice];

        System.out.println("|=================|");
        System.out.println("|  Write & Speed  |");
        System.out.println("|=================|");
        System.out.println();

        System.out.println("Write the given sentence :- ");
        System.out.println();
        System.out.println("===================================");
        System.out.println(original);
        System.out.println("===================================");
        System.out.print("Type the sentence here! -->");
        long starttime = System.nanoTime();

        String InsertSen = sc.nextLine();

        long Endtime = System.nanoTime();

        double timetakenSeconds = (Endtime - starttime) / 1_000_000_000.0;

        int maxLength = Math.max(original.length(), InsertSen.length());

        for (int i = 0; i < maxLength; i++)
        {
            if (i >= original.length() ||
                i >= InsertSen.length() ||
                original.charAt(i) != InsertSen.charAt(i))
            {
                errors++;
            }
        }

        for (int i = 0; i < original.length(); i++)
        {
            if (original.charAt(i) == ' ')
            {
                words++;
            }
        }

    
        double wpm = (words / timetakenSeconds) * 60;

        double accuracy =
            ((double)(maxLength - errors) / maxLength) * 100;

        if (accuracy < 0)
            accuracy = 0;

        System.out.println();
        System.out.println("|========================================|");
        System.out.println("|             RESULT                     |");
        System.out.println("|========================================|");

        System.out.printf("Time Taken : %.2f seconds%n", timetakenSeconds);
        System.out.println("Words      : " + words);
        System.out.printf("WPM        : %.2f%n", wpm);
        System.out.println("Errors     : " + errors);
        System.out.printf("Accuracy   : %.2f%%%n", accuracy);

        System.out.println("========================================");

        sc.close();

    }
}
