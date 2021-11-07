public class application {
    static double a = 5;
    static double b = 0;

    public static void main(String[] args) {
        double x = Math.pow(a, b);
        System.out.println("Cумма чисел: " + (a + b));
        System.out.println("Результат вычитания: " + (a - b));
        System.out.println("Результата умножения: " + (a * b));
        System.out.println(b != 0 ? "Результата деления чисел: " + (a / b) : "Делить на ноль нельзя");
        System.out.println(b != 0 ? "Остаток от деления: " + (a % b) : "Остатка не будет, второе число равно 0");
        System.out.println("Степень числа: " + (x));
    }
}






