import java.util.*;

public class B_Everyone_Loves_Tres{
    public static void main(String[] args) {
        
        // preprocess code
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] values = new int[n];
        for (int i = 0; i < n; i++){
            values[i] = sc.nextInt();
            sc.nextLine();
        }
        sc.close();


        int digits;
        long long maxNumber;

        //solution
        for (int i = 0; i < n+1; i++){
            maxNumber = (long long) Math.pow(10, (double)values[i]) - 1;

        }
    }
}


/*

Solution 1 - Brute Force ~ O(10^n)
- iterate through 1 to 10^n and find lowest value that is divisible by 33 and 66. 





 */