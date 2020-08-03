package com.bouncer77.readbookmaestro;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {

    private static final int LAST_PAGE_THINKING_IN_JAVA = 1170;

    public static void main( String[] args ) {

        String firstLanguage = Locale.getDefault().getCountry().toLowerCase(); // ru
        String secondLanguage = "en";

        /*Book thinkingInJava = new Book(firstLanguage,
                "Философия Java",
                "Брюс Эккель");

        thinkingInJava.addTranslation(secondLanguage, "Thinking in Java", "Bruce Eckel");

        thinkingInJava.setLastPage(LAST_PAGE_THINKING_IN_JAVA);
        thinkingInJava.setEdition(4);
        thinkingInJava.setYearOfPublicationOfTheBook(2015);

        System.out.println(thinkingInJava);

        for (int i = 0; i < 100; i++) {
            System.out.print("#");
        }
        System.out.print(" 100%\n");

        // x% / currentPage  = 100% / allPages   => x% = (100% / allPages) * currentPage
        int interest = (int) ((100.0 / thinkingInJava.getLastPage()) * 98); // проценты
        for (int i = 0; i < interest; i++) {
            System.out.print("$");
        }
        System.out.print(" " + interest + "%\n");*/

        // Инициализация первоначальных данных
        // изменяемый список (mutable) с возможностью пустых элементов (null)
        List<Book> javaCourseList = Arrays.asList(
                new Book("Java Полное руководство", "Шилдт", "10-е", 1500),
                new Book("Java Руководство для начинающих", "Шилдт", "7-е", 818),
                new Book("Java Том 1 Основы", "Хорстманн", "9-е", 855),
                new Book("Алгоритмы на Java", "Седжвик", "4-е", 845),
                new Book("Изучаем Java", "Сьерра", "2-е", 598)
        );

        // immutable без пустых элементов (без null)
        List<Book> sqlCourseList = List.of(
                new Book("A Primer on SQL", "Batra", "3-е", 600),
                new Book("SQL. Сборник рецептов", "Молинаро", "1-е", 500)
        );

        Course javaCourse = new Course("Базовая Java", javaCourseList);
        Course sqlCourse = new Course("Базовый SQL", sqlCourseList);

        Student student1 = new Student("Ivan");
        Student student2 = new Student("Nick");
        Student student3 = new Student("Masha");

        student1.addCourse(javaCourse);
        student1.addCourse(sqlCourse);
        student2.addCourse(javaCourse);
        student3.addCourse(sqlCourse);

        System.out.println(student1.getProgress());
        System.out.println();
        System.out.println(student2.getProgress());
        System.out.println();
        System.out.println(student3.getProgress());


    }
}
