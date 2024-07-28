import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class lucka3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
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
}
