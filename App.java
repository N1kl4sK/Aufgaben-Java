import Aufgabe_1_Schrittzaehler.StepCounter;
import Aufgabe_2_BodyMassIndex.Health;
import Aufgabe_3_Songtextsuche.Songtextsuche;
import Aufgabe_4_Passwortklasse.Passwort;
import Aufgabe_5_Kopffitness.MulitiplicationQuiz;

public class App {
    public static void main(String[] args) throws Exception {

        // Aufgabe 1

        StepCounter sc1 = new StepCounter("11.11.2011");
        for (int i = 0; i < 1111; i++) {
            sc1.incrementSteps();
        }
        System.out.println(sc1.toString());
        StepCounter sc2 = new StepCounter("1.9.2017");
        for (int i = 0; i < 10000; i++) {
            sc2.incrementSteps();
        }
        System.out.println(sc2.toString());

        // Aufgabe 2

        System.out.println(Health.bmi(57, 1.8));

        // Aufgabe 3

        System.out.println(Songtextsuche.getURL("MFG", "Die Fantastischen Vier"));

        // Aufgabe 4

        char[] pwd_first = "PassWD15!!".toCharArray();
        char[] pwd_weak = "1234567890".toCharArray();
        char[] pwd_strong = "NewPWD16!!".toCharArray();

        Passwort pwd = new Passwort(pwd_first);
        System.out.println(pwd.changePassword(pwd_first, pwd_weak));
        pwd_first[0] = 'p';
        System.out.println(pwd.changePassword(pwd_first, pwd_strong));
        pwd_first[0] = 'P';
        System.out.println(pwd.changePassword(pwd_first, pwd_strong));

        // Aufgabe 5

        MulitiplicationQuiz mq = new MulitiplicationQuiz();
        System.out.println(mq.getExercise());
        System.out.println(mq.getResult());
    }
}
