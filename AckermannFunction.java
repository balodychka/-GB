public class AckermannFunction {

    // Рекурсивная реализация функции Аккермана
    public static int ackermann(int m, int n) {
        // Базовые случаи
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ackermann(m - 1, 1);
        } else {
            return ackermann(m - 1, ackermann(m, n - 1));
        }
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 4;
        
        // Вызов функции Аккермана
        System.out.println("A(" + m + ", " + n + ") = " + ackermann(m, n));
    }
}