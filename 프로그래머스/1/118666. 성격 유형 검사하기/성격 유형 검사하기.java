import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> typeMap = new HashMap<>();
        char[] type = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        
        for (int i = 0; i < type.length; i++) {
            typeMap.put(type[i], 0);
        }
        
        for (int i = 0; i < survey.length; i++) {
            char a = survey[i].charAt(0);
            char b = survey[i].charAt(1);
            
            int num = choices[i];
            int score = Math.abs(num - 4);
        
            if (num < 4) typeMap.put(a, typeMap.get(a) + score);
            if (num > 4) typeMap.put(b, typeMap.get(b) + score);                                       
        }
        
        sb.append(typeMap.get('R') >= typeMap.get('T') ? 'R' : 'T');
        sb.append(typeMap.get('C') >= typeMap.get('F') ? 'C' : 'F');
        sb.append(typeMap.get('J') >= typeMap.get('M') ? 'J' : 'M');
        sb.append(typeMap.get('A') >= typeMap.get('N') ? 'A' : 'N');
        
        return sb.toString();
    }
}