import java.util.Arrays;
import java.util.LinkedList;

public class Solution2 {
    public int[] solution(int[] answers) {
        int[] sol1 = new int[answers.length];
        int[] sol2 = new int[answers.length];
        int[] sol3 = new int[answers.length];
        int[] tempArr = new int[3];
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;
        LinkedList<Data> list = new LinkedList<>();

        for(int i = 0; i < answers.length; i++){
            sol1[i] = (i % 5) + 1;
        }
        for(int i = 0; i < answers.length; i++){
            if((i + 1) % 2 == 1){
                sol2[i] = 2;
            }
            else {
                if((i + 1) % 8 == 2)
                    sol2[i] = 1;
                if((i + 1) % 8 == 4)
                    sol2[i] = 3;
                if((i + 1) % 8 == 6)
                    sol2[i] = 4;
                if((i + 1) % 8 == 0)
                    sol2[i] = 5;
            }
        }
        for(int i = 0; i < answers.length; i++){
            if(i % 10 == 0 || i % 10 == 1){
                sol3[i] = 3;
            }
            if(i % 10 == 2 || i % 10 == 3){
                sol3[i] = 1;
            }
            if(i % 10 == 4 || i % 10 == 5){
                sol3[i] = 2;
            }
            if(i % 10 == 6 || i % 10 == 7){
                sol3[i] = 4;
            }
            if(i % 10 == 8 || i % 10 == 9){
                sol3[i] = 5;
            }
        }
        for(int i = 0; i < answers.length; i++){
            if(sol1[i] == answers[i])
                score1++;
            if(sol2[i] == answers[i])
                score2++;
            if(sol3[i] == answers[i])
                score3++;
        }
        list.add(new Data(1, score1));
        list.add(new Data(2, score2));
        list.add(new Data(3, score3));

        list.sort((a,b)->{
                if(a.getScore() > b.getScore())
                    return -1;
                else if(a.getScore() < b.getScore())
                    return 1;
                else return 0;
        });
        if(list.get(0).getScore() == list.get(1).getScore()){
            tempArr[0] = list.get(0).getStudent();
            tempArr[1] = list.get(1).getStudent();
            if(list.get(0).getScore() == list.get(2).getScore()){
                tempArr[2] = list.get(2).getStudent();
                answers = Arrays.copyOf(tempArr, 3);
            }
            else
                answers = Arrays.copyOf(tempArr, 2);
        }
        else{
            tempArr[0] = list.get(0).getStudent();
            answers = Arrays.copyOf(tempArr, 1);
        }
        return answers;
    }
}
class Data{
    private int student;
    private int score;
    public Data(int student, int score){
        this.student = student;
        this.score = score;
    }

    public int getStudent() {
        return student;
    }

    public int getScore() {
        return score;
    }
}
