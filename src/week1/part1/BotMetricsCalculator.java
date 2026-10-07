package week1.part1;

public class BotMetricsCalculator {
    public static void main(String[] args) {
        double result = calculateRate();
        System.out.printf("\nResolution Rate: %.0f%%\n", result);
    }

    public static double calculateRate() {
        int totalConversations = 200;
        int resolvedByBot = 140;
        int handedOff = 60;

        double resolutionRate;

        resolutionRate = (double) resolvedByBot / totalConversations * 100;
        return resolutionRate;
    }
}