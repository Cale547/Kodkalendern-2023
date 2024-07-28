import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class lucka5 {
    public static void main(String[] args) throws Exception {
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
}
