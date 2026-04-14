import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        
        int todayDays = getDays(today);
        
        HashMap<String, Integer> termMap = new HashMap<>();
        
        for (String term: terms) {
            String[] split = term.split(" ");
            termMap.put(split[0], Integer.parseInt(split[1]) * 28);
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] arr = privacies[i].split(" ");
            int startDays = getDays(arr[0]);
            int termDays = termMap.get(arr[1]);
            
            if (todayDays >= startDays + termDays) answer.add(i+1);
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    
    private int getDays(String date) {
        String[] split = date.split("\\.");
        int y = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        int d = Integer.parseInt(split[2]);
        return y * 12 * 28 + m * 28 + d;
    }
}