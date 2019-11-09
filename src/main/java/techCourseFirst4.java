public class techCourseFirst4 {
    public boolean[] solution(String[] infos, String[] actions) {
        String[][] actionsData = new String[actions.length][3];
        String[][] infosData = new String[infos.length][2];
        boolean login = false;
        boolean added = false;
        boolean[] answer = new boolean[actions.length];

        for(int i = 0; i < actions.length; i++) {
            actionsData[i] = actions[i].split(" ");
        }

        for(int i = 0; i < infos.length; i++) {
            infosData[i] = infos[i].split(" ");
        }

        for(int i = 0; i < actionsData.length; i++) {
            if(actionsData[i][0].equals("LOGIN")) {
                if(login) {
                    answer[i] = false;
                }
                else {
                    for(int j = 0; j < infos.length; j++) {
                        if(actionsData[i][1].equals(infosData[j][0])) {
                            if(actionsData[i][2].equals(infosData[j][1])) {
                                login = true;
                                answer[i] = true;
                            }
                        }
                    }
                }
            }
            else if(actionsData[i][0].equals("ADD")) {
                if(!login) {
                    answer[i] = false;
                }
                else {
                    answer[i] = true;
                    added = true;
                }
            }
            else if(actionsData[i][0].equals("ORDER")) {
                if(!added) {
                    answer[i] = false;
                }
                else {
                    answer[i] = true;
                    added = false;
                }
            }
            System.out.println(answer[i]);
        }

        return answer;
    }
}
