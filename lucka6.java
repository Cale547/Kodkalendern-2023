import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class lucka6 {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(new File("L6önskelistor.txt")) {
        }));

        int antalPaket = 0;
        for (int i = 0; i < 1930; i++) {
            String[] namnOCHnummer = read.readLine().split(" ");
            antalPaket += Integer.parseInt(namnOCHnummer[1]);
        }
        read.close();

        System.out.println("Totala antalet paket i nissarnas undersökning blev " + antalPaket + " stycken.");
    }
}
