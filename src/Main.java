import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in); // Создание объекта Scanner для чтения ввода с клавиатуры
  int count = 0; // Счетчик для подсчета количества введенных чисел
  System.out.println("Ввод  чисел.");
  while (true) { // Бесконечный цикл для чтения чисел
   int number = scanner.nextInt(); // Чтение введенного числа
   if (number < 0) { // Проверка, является ли число отрицательным
    break; // Завершение цикла, если введено отрицательное число
   }
   count++; // Увеличение счетчика для каждого введенного числа
  }
  System.out.println("Количество введенных чисел: " + count); // Вывод количества введенных чисел
 }
}




