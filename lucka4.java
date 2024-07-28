import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class lucka4 {
    public static void main(String[] args) throws Exception {
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
        System.out.println("Den rastplats som ligger närmast 106023 km från Nordpolen har avståndet " + ans + " vilket är " + diff + " km ifrån målet.");
    }
}
