public class Test14 {
    public String solution(int n, int t, int m, int p) {
        int say = -1;
        int turn = p;
        String bin;
        String hex;
        String[] split;
        String answer= "";
        if(n == 10) {
            for(int i = 0; i < 10000 ; i++) {
                say++;
                split = Integer.toString(say).split("");
                if(split.length > 1) {
                    for(int j = 0; j < split.length; j++){
                        turn--;
                        if(turn == 0) {
                            answer += split[j];
                            t--;
                            if(t == 0)
                                break;
                            turn = m;
                        }
                    }
                }
                else {
                    turn--;
                    if(turn == 0) {
                        answer += say;
                        t--;
                        if(t == 0)
                            break;
                        turn = m;
                    }
                }
            }
        }
        if(n == 2) {
            for(int i = 0; i < 10000 ; i++) {
                say++;
                bin = Integer.toBinaryString(say);
                split = bin.split("");
                if(split.length > 1) {
                    for(int j = 0; j < split.length; j++){
                        turn--;
                        if(turn == 0) {
                            answer += split[j];
                            t--;
                            if(t == 0)
                                break;
                            turn = m;
                        }
                    }
                }
                else {
                    turn--;
                    if(turn == 0) {
                        answer += bin;
                        t--;
                        if(t == 0)
                            break;
                        turn = m;
                    }
                }
            }
        }
        if(n == 16) {
            for(int i = 0; i < 10000 ; i++) {
                say++;
                hex = Integer.toHexString(say);
                split = hex.split("");
                if(split.length > 1) {
                    for(int j = 0; j < split.length; j++){
                        turn--;
                        if(turn == 0) {
                            if(split[j] == "10")
                                answer += "A";
                            else if(split[j] == "11")
                                answer += "B";
                            else if(split[j] == "12")
                                answer += "C";
                            else if(split[j] == "13")
                                answer += "D";
                            else if(split[j] == "14")
                                answer += "E";
                            else if(split[j] == "15")
                                answer += "F";
                            else
                                answer += split[j];
                            t--;
                            if(t == 0)
                                break;
                            if(turn == 0){
                                turn = m;
                            }
                        }
                    }
                }
                else {
                    turn--;
                    if(turn == 0) {
                        if(hex.equals("a"))
                            answer += "A";
                        else if(hex.equals("b"))
                            answer += "B";
                        else if(hex.equals("c"))
                            answer += "C";
                        else if(hex.equals("d"))
                            answer += "D";
                        else if(hex.equals("e"))
                            answer += "E";
                        else if(hex.equals("f"))
                            answer += "F";
                        else
                            answer += hex;
                        t--;
                        if(t == 0)
                            break;
                        turn = m;
                    }
                }
            }
        }
        return answer;
    }
}
