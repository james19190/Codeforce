import java.util.*;

public class B_Startup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numTest = sc.nextInt();
        
        for (int i = 0; i < numTest; i++) {
            int numShelves = sc.nextInt();
            int numBottles = sc.nextInt();
            
            // Map to group total cost by brand
            HashMap<Integer, Integer> brandRevenue = new HashMap<>();
            
            for (int j = 0; j < numBottles; j++) {
                int brand = sc.nextInt();
                int cost = sc.nextInt();
                
                // Sum up revenue for each brand
                brandRevenue.put(brand, brandRevenue.getOrDefault(brand, 0) + cost);
            }

            // Collect all revenues and sort them in descending order
            List<Integer> revenueList = new ArrayList<>(brandRevenue.values());
            revenueList.sort(Collections.reverseOrder());

            // Calculate maximum revenue using the top N (numShelves) values
            int maxRevenue = 0;
            for (int j = 0; j < Math.min(numShelves, revenueList.size()); j++) {
                maxRevenue += revenueList.get(j);
            }

            System.out.println(maxRevenue);
        }
        
        sc.close();
    }
}
