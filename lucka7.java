import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;

public class lucka7 {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(new File("L7utomårs.txt")) {
        }));

        HashMap<Integer, Integer> map = new HashMap<>();


        while (read.ready()) {
            String[] namnOCHår = read.readLine().split(", ");
            int year = Integer.parseInt(namnOCHår[1]);
            if (map.containsKey(year)) {
                map.replace(year, map.get(year)+1);
            }

            else {
                map.put(year, 1);
            }
        }
        read.close();
        
        Set<Integer> set = map.keySet();
        int maxYear = 0;
        int maxVal = 0;
        for (Integer year : set) {
            if (map.get(year) > maxVal) {
                maxYear = year;
                maxVal = map.get(year);
            }
        }

        System.out.println("Året med flest röster var " + maxYear + " med " + maxVal + " röster.");

    }
}
