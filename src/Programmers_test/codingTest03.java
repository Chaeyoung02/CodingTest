package Programmers_test;

public class codingTest03 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(int i = 0; i< skill_trees.length; i++){
            int idx = 0;
            boolean check = true;

            for(int j = 0; j < skill_trees[i].length(); j++){
                if(skill.indexOf(skill_trees[i].charAt(j)) != -1){
                    if(idx < skill.indexOf(skill_trees[i].charAt(j))){
                        check = false;
                        break;
                    }
                    idx = skill.indexOf(skill_trees[i].charAt(j)) +1 ;
                }
            }
            if(check){
                answer++;
            }
        }

        return answer;
    }
}
