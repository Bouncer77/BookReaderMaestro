package com.bouncer77.readbookmaestro;

import java.util.Locale;

public class ProgressBar {

    private static final int LAST_PAGE_THINKING_IN_JAVA = 1170;

    public static void main( String[] args ) {

        String firstLanguage = Locale.getDefault().getCountry().toLowerCase(); // ru
        String secondLanguage = "en";

        Book thinkingInJava = new Book(firstLanguage,
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
        System.out.print(" " + interest + "%\n");
    }
}
