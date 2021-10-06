class Solution {
    public String solution(int n) {
        String answer = "";
        int now=0;
        while(true)
        {
            now=n%3;
            if(now==0)
            {
                answer="4"+answer;
                n--;
            }
            else if(now==1)
                answer="1"+answer;
            else
                answer="2"+answer;
            n/=3;
            if(n==0)
                break;
        }
        
        return answer;
    }
}
