package Aufgabe_5_Kopffitness;

public class MulitiplicationQuiz {
    private int zahl1;
    private int zahl2;

    public MulitiplicationQuiz() {
        zahl1 = (int) (Math.random() * 20 + 1);
        zahl2 = (int) (Math.random() * 20 + 1);
    }

    public String getExercise() {
        return zahl1 + " * " + zahl2 + " = ?";
    }

    public String getResult() {
        return "Result: " + zahl1 * zahl2;
    }
}
