package com.xworkz.methodOverriding.languages.kannada;

import com.xworkz.methodOverriding.languages.language.Language;

public class Kannada extends Language {
    @Override
    public void speak() {
        System.out.println("English: Speaking fluently");
    }

    @Override
    public void write() {
        System.out.println("English: Writing with grammar");
    }

    @Override
    public void read() {
        System.out.println("English: Reading fluently");
    }

    @Override
    public void translate() {
        System.out.println("English: Translating into native language");
    }

    @Override
    public void learn() {
        System.out.println("English: Learning through books and media");
    }
}
