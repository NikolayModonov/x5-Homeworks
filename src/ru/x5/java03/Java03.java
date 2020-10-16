package ru.x5.java03;

public class Java03 {
    public static void main(String[] args) {
        // Создайте пример наследования, реализуйте класс Student и класс Aspirant,
        // аспирант отличается от студента наличием некой научной работы.
        // ∎Класс Student содержит переменные: String firstName, lastName, group.
        // А также double averageMark, содержащую среднюю оценку.
        //
        // ∎Создать переменную типа Student, которая ссылается на объект типа Aspirant.
        //
        // ∎Создать метод getScholarship() для класса Student, который возвращает сумму стипендии.
        // Если средняя оценка студента равна 5, то сумма 100, иначе 80.
        // Переопределить этот метод в классе Aspirant.
        // Если средняя оценка аспиранта равна 5, то сумма 200, иначе 180.
        //
        // ∎Создать массив типа Student, содержащий объекты класса Student и Aspirant.
        // Вызвать метод getScholarship() для каждого элемента массива

        Student student = new Aspirant("Vasya", "Ivanov");
        Student[] students = new Student[15];
        for (int i = 0; i < 15; i++) {
            // Каждого нечетного делаю Студентом, остальных - Аспирантами
            if ((i % 2) == 0) {
                students[i] = new Aspirant("N" + (i + 1), "S" + (i + 1));
            } else {
                students[i] = new Student("N" + (i + 1), "S" + (i + 1));
            }

            //Каждый третий получает максимальный средний балл и стипендию, остальные - ниже балл и стипендию.
            if ((i % 3) == 0) {
                students[i].setAverageMark(5.0);
            } else {
                students[i].setAverageMark(5 - i * 0.01);
            }
            System.out.println(i + ". " + students[i].getFirstName() + " " + students[i].getLastName() + " : " + students[i].getScholarship());
        }

    }
}
