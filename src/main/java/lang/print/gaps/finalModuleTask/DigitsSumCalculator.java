package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int a, b, c, d;
        int sum;
        a = number % 10;
        b = number / 10 % 10;
        c = number / 10 /10 % 10;
        d = number / 10 / 10 / 10 % 10;
        sum = a + b + c +d;

        System.out.println(sum);
    }
}
