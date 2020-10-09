package ru.x5.java02;

import java.util.Arrays;
import java.util.Scanner;

public class Java02 {

    public static void main(String[] args) {
        int mainInt = 456;

        int tempInt;
        boolean flagBool = true;
        //String mainString;

        System.out.println("Урок 2.");
        mainInt = inputInteger();
        System.out.println("Рабочее число: " + mainInt);

        // Задание 1. Последняя цифра введенного числа.
        System.out.print("Задание 1. Последняя цифра числа: ");
        if (mainInt > 0) {
            System.out.println(mainInt % 10);
        } else {
            System.out.println(-1 * mainInt % 10);
        }

        // Задание 2. Сумма цифр трехзначного числа
        System.out.print("Задание 2. ");
        tempInt = mainInt;
        if (tempInt < 0) {
            tempInt *= -1;
        }
        if ((tempInt > 99) && (tempInt < 1000)) {
            System.out.println("Сумма цифр трехзначного числа: " + ((tempInt % 10) + ((tempInt % 100) / 10) + ((tempInt % 1000) / 100)));
        } else {
            System.out.println("Заданное число не трехзначное");
        }

        // Задание 3. Прибавить 1 к положительному числу
        System.out.print("Задание 3. ");
        if (mainInt > 0) {
            System.out.println("Число положительное, его инкремент: " + (mainInt + 1));
        } else {
            System.out.println("Число не положительное и не изменено: " + mainInt);
        }


        // Задание 4. Прибавить 1 к положительному числу, вычесть 2 из отрицательного, заменить 0 на 10
        System.out.print("Задание 4. ");
        if (mainInt > 0) {
            System.out.println("Число положительное, его инкремент: " + (mainInt + 1));
        } else if (mainInt < 0) {
            System.out.println("Число отрицательное и уменьшено на 2: " + (mainInt - 2));
        } else {
            System.out.println("Число равно 0 и заменено на: 10");
        }

        // Задание 5. Меньшее из трех чисел
        System.out.println("Задание 5. Поиск наименьшего из трех чисел.");
        mainInt = 2_147_483_647;
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + ": ");
            tempInt = inputInteger();
            if (mainInt > tempInt)
                mainInt = tempInt;
        }
        System.out.println("Меньшее из введенных чисел: " + mainInt);


        // Задание 7. Стоимость 10 мин разговора по коду города.
        // Москва(905) - 4.15руб. Ростов(194) - 1.98руб.
        // Краснодар(491) - 2.69руб. Киров(800) - 5.00 руб.
        // Пользователь в консоли должен ввести код города и получить ответ. Пример:
        // «Москва. Стоимость разговора: 41.5»

        // Обнуляю флаг выхода из цикла
        flagBool = true;

        System.out.println("Задание 7. Вычисление стоимости звонка.");
        while (flagBool) {
            System.out.println("Необходимо ввести код города. В базе заведены коды: 905, 194, 491, 800.");
            mainInt = inputInteger();
            flagBool = false;
            switch (mainInt) {
                case 905:
                    System.out.println("Код города Москва. Стоимость 10 минут разговора: " + (415 * 10 / 100) + "." + ((415 * 10) % 100));
                    break;
                case 194:
                    System.out.println("Код города Ростов. Стоимость 10 минут разговора: " + (198 * 10 / 100) + "." + ((198 * 10) % 100));
                    break;
                case 491:
                    System.out.println("Код города Краснодар. Стоимость 10 минут разговора: " + (269 * 10 / 100) + "." + ((269 * 10) % 100));
                    break;
                case 800:
                    System.out.println("Код города Киров. Стоимость 10 минут разговора: " + (500 * 10 / 100) + "." + ((500 * 10) % 100));
                    break;
                default:
                    flagBool = true;
                    System.out.println("Код города не распознан. Система работает только с известными кодами городов.");
                    break;
            }
        }


        // Задание 8, поиск в массиве
        // [1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2].
        int[] arrayTask8 = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int maxOfArray = arrayTask8[0];
        int sumOfPositiveNumbers = 0;
        int sumOfNegativeNumbers = 0;
        int sumOfNegativeEvenNumbers = 0;
        int countOfPositiveNumbers = 0;
        int countOfNegativeNumbers = 0;

        System.out.println("Задание 8. Работа с массивом: " + Arrays.toString(arrayTask8));
        for (int i : arrayTask8) {
            if (i < 0) {
                countOfNegativeNumbers++;
                sumOfNegativeNumbers += i;
                if ((i % 2) == 0) {
                    sumOfNegativeEvenNumbers += i;
                }
            } else {
                sumOfPositiveNumbers += i;
                if (i != 0) {
                    countOfPositiveNumbers++;
                }
            }
            if (maxOfArray < i) {
                maxOfArray = i;
            }
        }
        System.out.println("Максимальное значение массива: " + maxOfArray);
        System.out.println("Сумма положительных элементов: " + sumOfPositiveNumbers);
        System.out.println("Сумма четных отрицательных элементов: " + sumOfNegativeEvenNumbers);
        System.out.println("Количество положительных элементов: " + countOfPositiveNumbers);
        System.out.println("Среднее арифметическое отрицательных элементов: " + ((double) sumOfNegativeEvenNumbers / countOfNegativeNumbers));


        // Задание 9. Изменение массива  [15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52].
        // Переставить элементы массива в обратном порядке. Вывести результат в консоль
        int[] arrayTask9 = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        System.out.println("Задание 9. Переставить элементы массива в обратном порядке.");
        System.out.println("Исходный массив:        " + Arrays.toString(arrayTask9));
//        System.out.println(arrayTask9.length);
//        System.out.println(arrayTask9.length / 2);
        for (int i = 0; i < (arrayTask9.length / 2); i++) {
//            System.out.print(i + " " + (arrayTask9.length - i) + " _ ");
            tempInt = arrayTask9[i];
            arrayTask9[i] = arrayTask9[arrayTask9.length - i - 1];
            arrayTask9[arrayTask9.length - i - 1] = tempInt;
        }
        System.out.println("Преобразованный массив: " + Arrays.toString(arrayTask9));


        // Задание 10. Дан массив целых чисел: [15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52].
        // Переместить нули в конец массива. Вывести результат в консоль
        int[] arrayTask10 = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        System.out.println("Задание 10. Переставить нули в конец массива.");
        System.out.println("Исходный массив:        " + Arrays.toString(arrayTask10));
        for (int i = 0; i < arrayTask10.length; i++) {
            if (arrayTask10[i] == 0) {
                for (int j = i; j < (arrayTask10.length - 1); j++) {
                    arrayTask10[j] = arrayTask10[j + 1];
                }
                arrayTask10[arrayTask10.length - 1] = 0;
            }
        }
        System.out.println("Преобразованный массив: " + Arrays.toString(arrayTask10));


    }

    // Ввод данных с клавиатуры и проверка на Integer
    public static Integer inputInteger() {
        Scanner scanInteger = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        while (!scanInteger.hasNextInt()) {
            if (!scanInteger.hasNextInt())
                System.out.println("Ошибка, строку нельзя преобразовать в число Integer.");
            System.out.print("Введите целое число: ");
            scanInteger.nextLine();
        }
        ;
        return scanInteger.nextInt();
    }
}




