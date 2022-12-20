public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);
        int q = calc.abs.apply(2);
        calc.println.accept(c);
        calc.println.accept(b);
        calc.println.accept(a);
        calc.println.accept(q);
    }
}
