import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class lucka11 {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(new File("L11krypterat.txt")) {
        }));

        int önskningar = 0;
        int cyklar = 0;
        String[] keyboardArr = {"q","w","e","r","t","y","u","i","o","p","å,","a","s","d","f","g","h","j","k","l","ö","ä","z","x","c","v","b","n","m"};
        String keyboardStr = "qwertyuiopåasdfghjklöäzxcvbnm";
        while (read.ready()) {
            önskningar++;
            String[] str = read.readLine().split(", ");

            int key = Integer.parseInt(str[2]);
            String decrypted = "";
            char[] encrypted = str[1].toCharArray();
            for (int i = 0; i < encrypted.length; i++) {
                int index = keyboardStr.indexOf(encrypted[i]) - key;
                if (index < 0) index += 29;
                decrypted += keyboardArr[index];
            }
            //System.out.println(decrypted);

            
            if (decrypted.equals("cykel")) cyklar++;
            
        }
        read.close();
        System.out.println("Av " + önskningar + " önskningar var " + cyklar + " stycken cyklar.");
    }
}
