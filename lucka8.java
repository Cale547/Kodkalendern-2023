import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class lucka8 {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(new File("L8julkulor.txt")) {
        }));

        int previousKulor = 0;
        while (read.ready()) {
            String[] kullista = read.readLine().split(", ");
            int total = 0;
            for (String kulor : kullista) {
                total += Integer.parseInt(kulor);
            }
            if (total < previousKulor) {
                System.out.println("Här är en nisse som trängt sig i kön! Han har " + previousKulor + " kulor.");
                break;
            }
            previousKulor = total;
        }
        read.close();
    }
}
