import java.util.*;

public class A_Way_Too_Long_Words{
    public static void main(String[] args){

        //get input
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++){
            strings[i] = input.nextLine();
            // System.out.println("-" + strings[i]);
        }
        input.close();

        // solve problem
        String curr;

        for (int i = 0; i < strings.length; i++){
            curr = strings[i]; 
            if (curr.length() > 10){
                strings[i] = String.valueOf(curr.charAt(0)) + String.valueOf(curr.length() -2) + String.valueOf(curr.charAt(curr.length()-1));
            }
            System.out.println(strings[i]);
        }



    }
}