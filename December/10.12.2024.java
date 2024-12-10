class Solution {
    static int minRemoval(int intervals[][]) {
        // code here
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int cnt=0;
        int min=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]==intervals[i][1]) continue;
            if(intervals[i][0]<min){
                cnt++;
                min=Math.min(min,intervals[i][1]);
            }else
                min=intervals[i][1];
        }
        return cnt;
    }
}
