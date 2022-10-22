package Aufgabe_4_Passwortklasse;

import java.util.Arrays;

public class Passwort {
    private char[] passwort;

    public Passwort(char[] passwort) {
        this.passwort = new char[passwort.length];

        for (int i = 0; i < passwort.length; i++) {
            this.passwort[i] = passwort[i];
        }
    }

    public boolean isStrong(char[] passwort) {
        boolean lower = false;
        boolean upper = false;
        boolean figure = false;
        boolean special = false;

        for (int i = 0; i < passwort.length; i++) {
            if (passwort[i] >= 'a' && passwort[i] <= 'z') {
                lower = true;
            }
            if (passwort[i] >= 'A' && passwort[i] <= 'Z') {
                upper = true;
            }
            if (passwort[i] >= '0' && passwort[i] <= '9') {
                figure = true;
            }
            if (passwort[i] >= '!' && passwort[i] <= '*') {
                special = true;
            }
        }
        if (passwort.length < 8) {
            return false;
        }
        if (lower == true && upper == true && figure == true && special == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean changePassword(char[] altesPW, char[] neuesPW) {
        if (!Arrays.equals(passwort, altesPW)) {
            return false;
        }
        if (!isStrong(neuesPW)) {
            return false;
        }
        this.passwort = neuesPW;
        return true;
    }

    public void deletePassword() {
        this.passwort = null;
    }
}
