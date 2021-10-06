
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int now=0;
        int cnt=0;
        int j=0;
        while(true)
        {
            for(int i=0;i<progresses.length;i++)
            {
                if(progresses[i]==0)
                {
                    continue;
                }
                progresses[i]+=speeds[i];
            }
            
            for(int i=0;i<progresses.length;i++)
            {
                if(progresses[now]>=100)
                {
                    now++;
                    cnt++;
                    progresses[now]=0;
                    if(progresses[now]<100)
                    {
                        break;
                    }
                }
            }
            if(cnt!=0)
            {
                answer[j++]=cnt;
                cnt=0;
            }
            if(now==progresses.length)
            {
                break;
            }
        }
        
        return answer;
    }
}
