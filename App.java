import Aufgabe_1_Schrittzaehler.StepCounter;
import Aufgabe_2_BodyMassIndex.Health;

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

        Health h1 = new Health();
        System.out.println(h1.bmi(57, 1.8));
    }
}
