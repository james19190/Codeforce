import java.util.*;

public class A_Bit{
    public static void main(String[] args) {
        
        //preprocess input
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String[] commands = new String[n];
        for (int i = 0; i < n; i++){
            commands[i] = input.nextLine();
        }

        //solve problem
        int sum = 0;

        for (int i = 0; i < n; i++){
            if (commands[i].contains("++")) sum++;
            if (commands[i].contains("--")) sum--;
        }

        System.out.println(sum);

        input.close();
    }
}