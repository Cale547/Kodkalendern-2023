import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class lucka2 {
    public static void main(String[] args) throws IOException {
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
}
