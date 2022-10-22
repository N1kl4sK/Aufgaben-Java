import java.util.Scanner;

import Aufgabe_1_Schrittzaehler.StepCounter;
import Aufgabe_2_BodyMassIndex.Health;
import Aufgabe_3_Songtextsuche.Songtextsuche;
import Aufgabe_4_Passwortklasse.Passwort;
import Aufgabe_5_Kopffitness.MulitiplicationQuiz;
import Aufgabe_6_Fernbedienung.Fernbedienung;
import Aufgabe_7_Stoppuhr.StopWatch;
import Aufgabe_8_Druckerwarteschlange.PrinterQueue;
import Aufgabe_9_TicTacToe.TicTacToe;
import Aufgabe_Nummer_10_Zwischenablage.Zwischenablage;
import Aufgabe_Nummer_11_Temperaturgraph.TemperatureGraph;
import Aufgabe_Nummer_12_AmbientLight.AmbiLight;
import Aufgabe_Nummer_13_Verschluesselung.ShiftCipher;
import Aufgabe_Nummer_14_Mastermind.Mastermind;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        breakLine();
        System.out.println("Willkommen im Java Workout von Niklas K.");
        breakLine();
        System.out.println("Welche Aufgabe möchten Sie sich ansehen? (Zahl von 1-14 eingeben)");
        breakLine();
        String entscheidung = sc.nextLine();
        switch (entscheidung) {
            case "1":
                breakLine();
                aufgabe1();
                breakLine();
                break;
            case "2":
                breakLine();
                aufgabe2();
                breakLine();
                break;
            case "3":
                breakLine();
                aufgabe3();
                breakLine();
                break;
            case "4":
                breakLine();
                aufgabe4();
                breakLine();
                break;
            case "5":
                breakLine();
                aufgabe5();
                breakLine();
                break;
            case "6":
                breakLine();
                aufgabe6();
                breakLine();
                break;
            case "7":
                breakLine();
                aufgabe7();
                breakLine();
                break;
            case "8":
                breakLine();
                aufgabe8();
                breakLine();
                break;
            case "9":
                breakLine();
                aufgabe9();
                breakLine();
                break;
            case "10":
                breakLine();
                aufgabe10();
                breakLine();
                break;
            case "11":
                breakLine();
                aufgabe11();
                breakLine();
                break;
            case "12":
                breakLine();
                aufgabe12();
                breakLine();
                break;
            case "13":
                breakLine();
                aufgabe13();
                breakLine();
                break;
            case "14":
                breakLine();
                aufgabe14();
                breakLine();
                break;
            default:
                breakLine();
                System.out.println("Eingabefehler, Programm wird abgebrochen...");
                breakLine();
        }
        sc.close();
    }

    public static void breakLine() {
        System.out.println("------------------------------");
    }

    // Aufgabe 1
    public static void aufgabe1() {
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
    }

    // Aufgabe 2
    public static void aufgabe2() {
        System.out.println(Health.bmi(57, 1.8));
    }

    // Aufgabe 3
    public static void aufgabe3() {
        System.out.println(Songtextsuche.getURL("MFG", "Die Fantastischen Vier"));
    }

    // Aufgabe 4
    public static void aufgabe4() {
        char[] pwd_first = "PassWD15!!".toCharArray();
        char[] pwd_weak = "1234567890".toCharArray();
        char[] pwd_strong = "NewPWD16!!".toCharArray();

        Passwort pwd = new Passwort(pwd_first);
        System.out.println(pwd.changePassword(pwd_first, pwd_weak));
        pwd_first[0] = 'p';
        System.out.println(pwd.changePassword(pwd_first, pwd_strong));
        pwd_first[0] = 'P';
        System.out.println(pwd.changePassword(pwd_first, pwd_strong));
    }

    // Aufgabe 5
    public static void aufgabe5() {
        MulitiplicationQuiz mq = new MulitiplicationQuiz();
        System.out.println(mq.getExercise());
        System.out.println(mq.getResult());
    }

    // Aufgabe 6
    public static void aufgabe6() {
        Fernbedienung fb = new Fernbedienung();
        fb.senderNamenSpeichern("ARD");
        for (int i = 0; i < 31; i++) {
            System.out.println(fb.getSenderName());
            fb.SenderHoch();
        }
    }

    // Aufgabe 7 (kompliziert)
    public static void aufgabe7() {
        StopWatch sw = new StopWatch();
        sw.start();
        try {
            Thread.sleep(1000);
            sw.stop();
            System.out.println(sw.vergangeneZeit());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // Aufgabe 8 (kompliziert)
    public static void aufgabe8() {
        PrinterQueue pq = new PrinterQueue(1);
        try {
            pq.addJob("Hallo");
            pq.addJob("Weiter");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(pq.nextJob());
        System.out.println(pq.nextJob());
        try {
            pq.addJob("Weiter");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(pq.nextJob());
    }

    // Aufgabe 9
    public static void aufgabe9() {
        TicTacToe ttt = new TicTacToe();
        System.out.println(ttt);
        ttt.setMark(2, 2);
        System.out.println(ttt);
        ttt.setMark(2, 0);
        System.out.println(ttt);
        ttt.setMark(1, 1);
        System.out.println(ttt);
    }

    // Aufgabe 10
    public static void aufgabe10() {
        Zwischenablage za = new Zwischenablage(4);
        za.copy("Die");
        System.out.println(za);
        za.copy("Banane");
        System.out.println(za);
        za.copy("ist");
        System.out.println(za);
        za.copy("krumm");
        System.out.println(za);
    }

    // Aufgabe 11
    public static void aufgabe11() {
        TemperatureGraph tg = new TemperatureGraph(2022);
        tg.addTemperatur(1, 2);
        tg.addTemperatur(2, -3);
        tg.addTemperatur(3, 7);
        tg.addTemperatur(4, 8);
        tg.addTemperatur(5, 14);
        tg.addTemperatur(6, 16);
        tg.addTemperatur(7, 17);
        tg.addTemperatur(8, 18);
        tg.addTemperatur(9, 14);
        tg.addTemperatur(10, 9);
        tg.addTemperatur(11, 5);
        tg.addTemperatur(12, 2);
        tg.ausgabeGraph();
        System.out.println("Das Jahr ist " + TemperatureGraph.jahr);
    }

    // Aufgabe 12
    public static void aufgabe12() {
        AmbiLight al = new AmbiLight(0, 0, 50);
        for (int i = 0; i < 50; i++) {
            al.erhoeheHelligkeit();
            System.out.println(al.getNaechsteFarbe());
        }
    }

    // Aufgabe 13
    public static void aufgabe13() {
        ShiftCipher sc = new ShiftCipher(3);
        String verschluesselt = sc.verschluesseln("abcdefghijklmnopqrstuvwxyz");
        System.out.println(verschluesselt);
        System.out.println(sc.entschluesseln(verschluesselt));
        sc = new ShiftCipher(3);
        verschluesselt = sc.verschluesseln("DieserTextIstVerschluesselt");
        System.out.println(verschluesselt);
        System.out.println(sc.entschluesseln(verschluesselt));
    }

    // Aufgabe 14
    public static void aufgabe14() {
        Mastermind mm = new Mastermind(
                Mastermind.RED,
                Mastermind.BLUE,
                Mastermind.GREY,
                Mastermind.BLUE);
        int[] guess = mm.guess(
                Mastermind.GREEN,
                Mastermind.GREY,
                Mastermind.BLUE,
                Mastermind.BLUE);
        System.out.println("Code: Rot, Blau, Grau, Blau");
        System.err.println("Guess: Grün, Grau, Blau, Blau");
        System.out.println("correctColorsAndPositions: \t" + guess[0]);
        System.out.println("correctColors: \t\t" + guess[1]);
    }
}
