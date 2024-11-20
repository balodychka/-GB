public class NaturalNumbers {
    
    // Рекурсивный метод для вывода чисел от M до N
    public static void printNumbers(int M, int N) {
        // Базовое условие: если M > N, то рекурсия прекращается
        if (M > N) {
            return;
        }
        // Выводим текущее число
        System.out.println(M);
        // Рекурсивный вызов для следующего числа
        printNumbers(M + 1, N);
    }

    public static void main(String[] args) {
        int M = 5;
        int N = 10;
        
        // Вызов рекурсивного метода
        printNumbers(M, N);
    }
}