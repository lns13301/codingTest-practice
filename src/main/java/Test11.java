import java.util.ArrayList;
import java.util.List;

public class Test11 {
    boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;

        String[] split = s.split("");

        for (String value : split) {
            if (value.equals("p") || value.equals("P")) {
                pCount++;
            }
            if (value.equals("y") || value.equals("Y")) {
                yCount++;
            }
        }

        if(pCount == yCount)
            return true;
        return false;
    }
}
