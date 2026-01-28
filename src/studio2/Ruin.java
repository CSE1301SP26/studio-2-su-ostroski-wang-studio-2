import java.util.Scanner;

public class Ruin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the amount of money that you start with.");
        double startAmount = in.nextDouble();
        System.out.print("Please enter the probability that you win a single play");
        double winChance = in.nextDouble();
        System.out.print("Please enter your win limit");
        double winLimit = in.nextDouble();
        System.out.println("How many days (simulations) will you go to the casino?");
        int totalSimulations = in.nextInt();

        int wins = 0;
        int losses = 0;
        for (int i = 0; i < totalSimulations; i++) {
            int count=0;
            double Amount = startAmount;
            while (Amount < winLimit && Amount > 0) {
                count++;
                double random = Math.random();
                if (random < winChance) {
                    Amount++;
                } else {
                    Amount--;
                }

               

            }
             if (Amount >= winLimit) {
                    wins++;
                    System.out.println("Simulation " + i + ": "+count+" WIN!");
                } else {
                    losses++;
                    System.out.println("Simulation " + i + ": "+count+" LOSE!");
                }
         
            
        }
        System.out.println("Number of wins: " + wins);
            System.out.println("Number of losses: " + losses);
            System.out.println("Total Simulations: " + totalSimulations);
            System.out.println("Rate of Ruin: " + (losses / totalSimulations);
           double a = (1-winChance) / winChance;
           
            
    }

}
