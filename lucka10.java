import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class lucka10 {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(new File("L10snörecept.txt")) {
        }));
        int korrektaaddresser = 0;

        String letters = "qwertyuiopåasdfghjklöäzxcvbnm";
        
        while (read.ready()) {
            String next = read.readLine();
            next = next.substring(0, next.length()-1);

            char[] nextC = next.toCharArray();
            int addressLen = 0;
            for (int i = 0; i < nextC.length; i++) {
                if (letters.indexOf(nextC[i]) != -1) addressLen++;
            }
            if (addressLen == 8) {
                korrektaaddresser++;
                System.out.println(next);
            }
        }
        read.close();
        //System.out.println(korrektaaddresser);


    }
}
