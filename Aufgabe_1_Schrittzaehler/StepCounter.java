package Aufgabe_1_Schrittzaehler;

public class StepCounter {
    int schritte;
    String datumZ;

    public StepCounter(String datum) {
        datumZ = datum;
    }

    public void incrementSteps() {
        schritte = schritte + 1;
    }

    public String toString() {
        return "Am " + datumZ + " bin ich " + schritte + " Schritte gegangen.";
    }
}
