import java.util.Scanner;
public class Financial_Forecasting {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter principle Amount : ");
		double amount = sc.nextDouble();
		System.out.print("Enter Ratio (Percentage): ");
		double ratio = sc.nextDouble();
		ratio = ratio /100;
		System.out.print("Enter Time Period : ");
		int time = sc.nextInt();
		
		double predictvalue = futureValue(amount, ratio, time);
		System.out.printf("Future value after %d periods: %.2f\n", time, predictvalue);
	}
	public static double futureValue(double initialValue, double Rate, int time) {
        if (time == 0) {
            return initialValue; // base case
        }
        // Recursive case
        return futureValue(initialValue, Rate, time - 1) * (1 + Rate);
    }
}
