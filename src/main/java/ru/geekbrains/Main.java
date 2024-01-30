package ru.geekbrains;

//Домашнее задание
//        Условие:
//        Создать проект с использованием Maven или Gradle, добавить в него несколько зависимостей и написать код, использующий эти зависимости.
//        Пример решения:
//        1. Создайте новый Maven или Gradle проект, следуя инструкциям из блока 1 или блока 2.
//        2. Добавьте зависимости org.apache.commons:commons-lang3:3.12.0 и com.google.code.gson:gson:2.8.6.
//        3. Создайте класс Person с полями firstName, lastName и age.
//        4. Используйте библиотеку commons-lang3 для генерации методов toString, equals и hashCode.
//        5. Используйте библиотеку gson для сериализации и десериализации объектов класса Person в формат JSON.

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ru.geekbrains.model.Person;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Dart", "Wader",100);
        System.out.println(person);

        // сериализация с использованием Gson
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        String gsonPerson = gson.toJson(person);
        System.out.println("Результат сериализации: " + gsonPerson);

        //десериализация с использованием Gson
        Person resultPerson = gson.fromJson(gsonPerson,Person.class);
        System.out.println("Результат десериализации: " + resultPerson);
    }
}