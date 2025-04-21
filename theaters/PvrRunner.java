package com.xworkz.methodOverriding.theaters;

import com.xworkz.methodOverriding.theaters.pvr.Pvr;
import com.xworkz.methodOverriding.theaters.theater.Theater;

public class PvrRunner {
    public static void main(String[] args) {
        Theater theater = new Theater();
        theater.openShow();
        theater.dimLights();
        theater.playScene();
        theater.takeBreak();
        theater.closeShow();

        Theater theater1 = new Pvr();
        theater1.openShow();
        theater1.dimLights();
        theater1.playScene();
        theater1.takeBreak();
        theater1.closeShow();

        Pvr drama = new Pvr();
        drama.openShow();
        drama.dimLights();
        drama.playScene();
        drama.takeBreak();
        drama.closeShow();
    }
}
