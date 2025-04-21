package com.xworkz.methodOverriding.languages;

import com.xworkz.methodOverriding.languages.kannada.Kannada;
import com.xworkz.methodOverriding.languages.language.Language;

public class KanRunner {
    public static void main(String[] args) {
        Language lang = new Language();
        lang.speak();
        lang.write();
        lang.read();
        lang.translate();
        lang.learn();

        Language lang1 = new Kannada();
        lang1.speak();
        lang1.write();
        lang1.read();
        lang1.translate();
        lang1.learn();

        Kannada english = new Kannada();
        english.speak();
        english.write();
        english.read();
        english.translate();
        english.learn();
    }
}
