package com.bouncer77.readbookmaestro;

import java.util.Locale;

/**
 * @author Kosenkov Ivan
 * Created by Kosenkov Ivan on 24.07.2020
 */

public class LocaleTest {

    public static void main(String[] args) {
        int num = 1;
        for (String locale : Locale.getISOLanguages()) {

            System.out.print(num++ + " : ");
            if (locale.equals("en")) {
                System.out.println(Colour.ANSI_BLUE + locale + Colour.ANSI_RESET);
                continue;
            }

            if (locale.equals("ru")) {
                System.out.println(Colour.ANSI_RED + locale + Colour.ANSI_RESET);
                continue;
            }

            System.out.println(locale);
        }

        System.out.println( "Hello, Java!" );
        System.out.println(Locale.getDefault()); // ru_RU
        System.out.println(Locale.getDefault().getDisplayLanguage()); // русский
        System.out.println(Locale.getDefault().getDisplayName()); // русский (Россия)
        System.out.println(Locale.getDefault().getCountry()); // RU
        System.out.println(Locale.getDefault().getCountry()); // RU
        System.out.println(Locale.US); // USA
        System.out.println(Locale.getDefault().getDisplayCountry()); // Россия
    }
}
