package week1.part2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        MetricsCalculator metricsCalculator = new MetricsCalculator();

        int total;
        int totalResolvedByBot;



            System.out.println("\nEnter the total number of tickets resolved:");
            total = scan.nextInt();

            System.out.println("Enter the total number of tickets resolved by the bot:");
            totalResolvedByBot = scan.nextInt();

        double transferred = total - totalResolvedByBot;

        try {
            double resolvedByBot = metricsCalculator.calculatePercent(total, totalResolvedByBot);
            double transferredByBot = metricsCalculator.calculatePercent(total, transferred);

            System.out.println("\nResolution by bot rate:");
            System.out.printf("%.1f%%", resolvedByBot);

            System.out.println("\nTransfer by bot rate:");
            System.out.printf("%.1f%%", transferredByBot);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}