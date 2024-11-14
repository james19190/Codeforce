import java.util.*;

public class A_Team{
    public static void main(String[] args) {

        //process input
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        int[][] problems = new int[n][3];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < 3; j++){
                problems[i][j] = input.nextInt();
            }
            input.nextLine();
        }

        //solve problem
        int noQ = 0;
        int curr;

        for (int i = 0; i < n; i++){
            curr = 0;
            for (int j = 0; j < 3; j++){
                curr += problems[i][j];
            }
            if (curr > 1) noQ++;
        }

        System.out.println(noQ);

        input.close();
    }
}

