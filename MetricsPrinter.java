import java.util.Scanner;

public class MetricsPrinter {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan_obj = new Scanner(System.in);
        String[] labels = {"first name", "last name", "street address", "city", "zip code"};
        String[] user_input = new String[labels.length];
        String input_holder;

        for (int i=0; i < labels.length; i++){
            System.out.println("Type your " + labels[i]);
            input_holder = scan_obj.nextLine();
            if (input_holder.length() == 0) {
                System.out.println("Input value was empty. Try again...");
                i--;
            } else {
                user_input[i] = input_holder;
            }
        }
        scan_obj.close();
        System.out.println("All inputs gathered. Running turboencabulator algorithm...");
        Thread.sleep(1000);
        System.out.println("Running numbers through Japanese factoring hasher...");
        Thread.sleep(1000);
        System.out.println("Determining distance from nearest Costco...");
        Thread.sleep(1000);
        System.out.println("Discussing AI philosophy with Alan Turing's ghost...");
        Thread.sleep(1000);
        System.out.println("Scheduling garbage collection...");
        Thread.sleep(1000);
        System.out.println("Bashing head against wall...");
        Thread.sleep(2000);
        System.out.println("Stumbling...");
        Thread.sleep(3000);
        System.out.println("Falling...");
        Thread.sleep(4000);
        System.out.println("Checking pulse...");
        Thread.sleep(5000);
        for (int j=0; j < 8; j++){
            System.out.print(". ");
            Thread.sleep(500);
        }
        System.out.println("");
        System.out.println("DONE! Printing output...");
        for (int k=0; k < labels.length; k++){
            System.out.println(labels[k] + " = " + user_input[k]);
        }
    }
}