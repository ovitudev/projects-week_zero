package week1.part2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        MetricsCalculator metricsCalculator = new MetricsCalculator();

        int total;
        int totalResolvedByBot;

        System.out.println("\nEnter a total of resolution in bot:");
        total = scan.nextInt();

        System.out.println("Enter a total of resolved by Bot:");
        totalResolvedByBot = scan.nextInt();

        System.out.println("\nResolution rate:");
        System.out.printf("%.1f%%", metricsCalculator.calculatorRetention(total, totalResolvedByBot));
        System.out.println("\nTransfer By Bot rate:");
        System.out.printf("%.1f%%", metricsCalculator.calculatorTransfer(total, totalResolvedByBot));
    }
}
