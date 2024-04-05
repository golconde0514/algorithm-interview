class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
//         for(int i = my_string.length(); i > (my_string.length()-n); i--){
//             answer += i;
//         }
        
        answer = my_string.substring(my_string.length()-n, my_string.length());
        
        return answer;
    }
}