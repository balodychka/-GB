public class ReverseArray {
    
    // Рекурсивный метод для вывода массива с конца
    public static void printReverse(int[] arr, int index) {
        // Базовое условие: если индекс меньше 0, рекурсия завершена
        if (index < 0) {
            return;
        }
        // Рекурсивный вызов для следующего элемента
        printReverse(arr, index - 1);
        // Выводим текущий элемент
        System.out.println(arr[index]);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        
        // Вызов рекурсивного метода для печати массива с конца
        printReverse(array, array.length - 1);
    }
}