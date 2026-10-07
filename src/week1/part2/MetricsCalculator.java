package week1.part2;

public class MetricsCalculator {
    public double calculatorRetention(int total, int totalResolvedByBot){
        return (double) totalResolvedByBot / total * 100;
    }

    public double calculatorTransfer(int total, int totalResolvedByBot){
        int transferByBot = total - totalResolvedByBot;
        return (double) transferByBot / total * 100;
    }
}
