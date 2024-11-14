import java.util.*;

public class A_Quintomania{
    public static void main(String[] args) {

        //preprocess Data
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int[] noteCount = new int[n];
        List<List<Integer>> notes = new ArrayList<>();

        for (int i = 0; i < n; i++){
            noteCount[i] = sc.nextInt();
            sc.nextLine();
            List<Integer> specNotes = new ArrayList<>();
            for (int j = 0; j < noteCount[i]; j++){
                specNotes.add(sc.nextInt());
            }
            notes.add(specNotes);
            sc.nextLine();
        }
        sc.close();

        // solve problem
        boolean perfect;
        for (int i = 0; i < n; i++){
            perfect = checkPerfect(noteCount[i], notes.get(i));
            if (perfect){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

    public static boolean checkPerfect(int n, List<Integer> notes){

        
        //edge case
        if (n==0) return true;

        int dif;

        for (int i = 1; i < n; i++){
            dif = Math.abs(notes.get(i-1)-notes.get(i));
            if (dif == 5 || dif == 7 ){
                continue;
            }
            return false;
        }
        return true;
    } 
}

