package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int a, b, c;
        a = number % 10;
        b = number / 10 % 10;
        c = number / 10 / 10 % 10;
        System.out.println(a + "" + b + "" + c);
    }
}
