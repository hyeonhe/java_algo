import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<Character, Integer> typeMap = new HashMap<>();
        char[] type = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        
        for (int i = 0; i < type.length; i++) {
            typeMap.put(type[i], 0);
        }
        
        for (int i = 0; i < survey.length; i++) {
            char a = survey[i].charAt(0);
            char b = survey[i].charAt(1);
            
            int num = choices[i];
                  
            switch(num) {
                case 4:
                    break;
                case 1:
                    typeMap.put(a, typeMap.get(a) + 3);
                    break;
                case 2:
                    typeMap.put(a, typeMap.get(a) + 2);
                    break;
                case 3:
                    typeMap.put(a, typeMap.get(a) + 1);
                    break;
                case 5:
                    typeMap.put(b, typeMap.get(b) + 1); 
                    break;
                case 6:
                    typeMap.put(b, typeMap.get(b) + 2);
                    break;                    
                case 7:
                    typeMap.put(b, typeMap.get(b) + 3);
                    break;                                         
            }
        }
        
        if (typeMap.get('R') >= typeMap.get('T')) answer += 'R';
        else answer += 'T';
        if (typeMap.get('C') >= typeMap.get('F')) answer += 'C';
        else answer += 'F';
        if (typeMap.get('J') >= typeMap.get('M')) answer += 'J';
        else answer += 'M';
        if (typeMap.get('A') >= typeMap.get('N')) answer += 'A';
        else answer += 'N';
        
        return answer;
    }
}