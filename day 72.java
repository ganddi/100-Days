package pkg100days;

import java.util.Arrays;

public class day72 {
    public static void main(String[] args) {
        String[] team = {"Man United","Arsenal","Man city","Spurs","Chealsea","Brenford", "Liverpool","Wolves"};
        Arrays.sort(team);
        int i = 0;
        while(i < team.length){
            System.out.println(team[i]);
            i++;
        }
    }
    
}
