package week1;

public class BotMetricsCalculator {
    public static void main(String[] args) {
        double result = calculateRate();
        System.out.printf("%f", result);
    }

    public static double calculateRate() {
        int totalConversations = 200;
        int resolvedByBot = 140;
        int handedOff = 60;

        double resolutionRate;

        resolutionRate = totalConversations * ((double) handedOff / 100);
        return resolutionRate;
    }
}