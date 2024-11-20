//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Задача 1
//С помощью цикла for выведите в консоль все целые числа от 1 до 10.

        for (int number = 1; number <= 10; number = number + 1) {
            System.out.println(number);
        }

//Задача 2
//С помощью цикла for выведите в консоль все целые числа от 10 до 1.
        for (int number = 10; number >= 1; number = number - 1) {
            System.out.println(number);
        }

//Задача 3
//Выведите в консоль все четные числа от 0 до 17.
        for (int number = 0; number <= 17; number = number + 2) {
            System.out.println(number);
        }

//Задача 4
//Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.
        for (int number = 10; number >= -10; number = number - 1) {
            System.out.println(number);
        }

//Задача 5
//Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096.
//В консоль результат должен выводиться в формате: «… год является високосным».
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + "год является високосным");
        }

//Задача 6
//Напишите программу, которая выводит в консоль последовательность чисел:
//7 14 21 28 35 42 49 56 63 70 77 84 91 98
        for (int number = 7; number <= 98; number = number + 7) {
            System.out.println(number);
        }

//Задача 7
//Напишите программу, которая выводит в консоль последовательность чисел:
//1 2 4 8 16 32 64 128 256 512
        for (int number = 1; number <= 512; number = number * 2) {
            System.out.println(number);
        }

//Задача 8
//Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете откладывать по 29 000 рублей «в банку».
//Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».
        int deposit = 29_000;
        int total = 0;
        for (int month = 1; month <= 12; month = month + 1) {
            total = total + deposit;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println(total);

//Задача 9
//Перепишите решение задачи выше при условии, что деньги вы откладывать будете не «в банку», а в банк под проценты — 12% годовых.
//Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».
        int salary = 29_000;
        double box = 0;

        for (int month = 1; month <= 12; month = month + 1) {
            box = box * 0.01 + box;
            box = box + salary;
            System.out.println("Месяц " + month + " сумма накоплений равна " + box + " рублей");
        }
        System.out.println(box);

//Задача 10
//Напишите программу, которая выводит в консоль таблицу умножения на 2:
//
        int two=2;
        for (int i = 1; i <= 10; i = i +1) {
           System.out.println(i*two);
        }
    }
}
