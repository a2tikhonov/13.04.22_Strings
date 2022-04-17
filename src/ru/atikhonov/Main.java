package ru.atikhonov;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        //Задание 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);
        //Задание 2
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase(Locale.ROOT));
        //Задание 3
        fullName = "Иванов Семён Семёныч";
        if (fullName.contains("ё")) {
            fullName = fullName.replace("ё", "е");
        }
        System.out.println("Данные ФИО сотрудника — " + fullName);
        //Задание 5
        fullName = "Ivanov Ivan Ivanovich";
        lastName = fullName.substring(0, fullName.indexOf(' '));
        firstName = fullName.substring(fullName.indexOf(' ') + 1, fullName.lastIndexOf(' '));
        middleName = fullName.substring(fullName.lastIndexOf(' ') + 1);
        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);
        //Задание 6
        fullName = "ivanov ivan ivanovich";
        char[] fullNameArr = fullName.toCharArray();
        if (Character.isLowerCase(fullNameArr[0])) fullNameArr[0] = Character.toUpperCase(fullNameArr[0]);
        if (Character.isLowerCase(fullNameArr[fullName.indexOf(' ') + 1]))
            fullNameArr[fullName.indexOf(' ') + 1] = Character.toUpperCase(fullNameArr[fullName.indexOf(' ') + 1]);
        if (Character.isLowerCase(fullNameArr[fullName.lastIndexOf(' ') + 1]))
            fullNameArr[fullName.lastIndexOf(' ') + 1] = Character.toUpperCase(fullNameArr[fullName.lastIndexOf(' ') + 1]);
        fullName = String.valueOf(fullNameArr);
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + fullName);
        //Задание 7
        String firstString = "135";
        String secondString = "246";
        StringBuilder tempString = new StringBuilder();
        tempString.append(firstString);
        for (int i = 0; i < secondString.length(); i++) {
            tempString.insert(i + i + 1, secondString.charAt(i));
        }
        System.out.println("Данные строки — " + tempString);
        //Задание 8
        tempString.delete(0, tempString.length());
        tempString.append("aabccddefgghiijjkk");
        for (int i = 1; i < tempString.length(); i++) {
            if (tempString.charAt(i) == tempString.charAt(i - 1)) System.out.print(tempString.charAt(i));
        }
    }
}
