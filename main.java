import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class main {

    public static void lucka1() {
        int nr = 0;
        
        for (int i = 127; i <= 267; i++) {
            nr += i;
        }

        for (int i = 1110; i <= 1378; i++) {
            nr += i;
        }

        for (int i = 3239293; i <= 3239330; i++) {
            nr += i;
        }

        System.out.println("Tomtens telefonnummer är: " + nr + ".");
    }

    public static void lucka2() throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(new File("L2grötmängd.txt")) {
        }));

        int goodbarrel = 0;
        int total = 0;
        while (read.ready()) {
            total++;
            int grams = Integer.parseInt(read.readLine())*28;
            if (grams > 2000 && grams < 3000) goodbarrel++;
        }
        read.close();
        System.out.println("Av " + total + " tunnor är " + goodbarrel + " tunnor godkända!");
    }

    public static void lucka3() throws FileNotFoundException, IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(new File("L3rentaggar.txt")) {
        }));
        double sum = 0;
        double numberOfDeer = 0;
        while (read.ready()) {
            numberOfDeer++;
            sum += Integer.parseInt(read.readLine());
        }

        double avg = sum / numberOfDeer;

        read.close();
        read = new BufferedReader(new InputStreamReader(new FileInputStream(new File("L3rentaggar.txt")) {
        }));

        int goodDeer = 0;
        while (read.ready()) {
            if (Double.parseDouble(read.readLine()) == avg) goodDeer++;
        }
        read.close();
        System.out.println("Av " + (int)numberOfDeer + " renar har " + goodDeer + " stycken samma antal taggar som genomsnittet.");
    }

    public static void lucka4() throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(new File("L4rastplats.txt")) {
        }));
        int goal = 106023;
        int ans = -1;
        int diff = Integer.MAX_VALUE;
        while (read.ready()) {
            int distance = Integer.parseInt(read.readLine());
            if (Math.abs(goal - distance) < diff) {
                diff = Math.abs(goal - distance);
                ans = distance;
            }
        }
        read.close();
        System.out.println("Den rastplats som ligger närmast 106023 km från Nordpolen har avståndet " + ans + " vilket är " + diff + " ifrån målet.");
    }

    public static void lucka5() throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(new File("L5plånböcker.txt")) {
        }));
        
        int rikanissar = 0;
        int antalnissar = 0;
        while (read.ready()) {
            antalnissar++;
            String[] plånbokTXT = read.readLine().split(", ");
            int[] plånbok = new int[4];
            for (int i = 0; i < 4; i++) {
                plånbok[i] = Integer.parseInt(plånbokTXT[i]);
            }
            int penningar = plånbok[0]*192 + plånbok[1]*24 + plånbok[2]*8 + plånbok[3];
            
            if (penningar >= 1000) {
                rikanissar++;
            }
        }
        read.close();
        System.out.println(rikanissar + " nissar har lite extra klirr i kassan och ska ge extra till granen.");
    }

    public static void lucka6() throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(new File("L6önskelistor.txt")) {
        }));

        int antalPaket = 0;
        for (int i = 0; i < 1930; i++) {
            String[] namnOCHnummer = read.readLine().split(" ");
            antalPaket += Integer.parseInt(namnOCHnummer[1]);
        }

        System.out.println("Totala antalet paket i nissarnas undersökning blev " + antalPaket + " stycken.");
    }

    



    public static void main (String[] args) throws Exception {
            lucka6();
        
        
    }

}