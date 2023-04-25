import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework {

  //Задача 1
//Написать метод
//
//public static String decToBin(int number)
//который получит число и вернёт строку с его двоичной записью.
  private static final int RADIX = 2;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Ввидите целое число : ");
    try {
      int number = Integer.parseInt(br.readLine());
      System.out.print("бинарное значение числа " + number + " равно ");
      System.out.println(decToBin(number));
    } catch (NumberFormatException e) {
      System.out.println("Неправильный формат целого числа: " + e.getMessage());
    }

  }


  public static String decToBin(int number) {

    String str = " ";//инициализируем строку

    number = Math.abs(number);// убираем знак
    if (number == 0) {
      return "0";
    }
    while (number != 0) { // пока в числе есть цифры
      int digit = number % RADIX;// // последняя цифра - остаток от деления на основание (2)
      number /= RADIX;// сам остаток от числа делим на основание (2)

      str = digit + str;// digit-вписываем как первую цифру в нашу строку, и это всё повторяем пока number !=0.

    }
    return str;
  }
}