package week1.part2;

public class MetricsCalculator {
    public double calculatePercent(double base, double percentage){
        if (base == 0 && percentage > 0) {
            throw new IllegalArgumentException("Error: The overall resolved total cannot be zero if the total resolved by the bot is greater than zero.");
        }
        if(percentage < 0){
            throw new IllegalArgumentException("Error: The total calculated by the bot cannot be a negative value.");
        }
        if(base == 0 && percentage == 0 ){
            return 0;
        }

        return percentage / base * 100;
    }
}
