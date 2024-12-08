class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]>ans=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            int start=arr[i][0];
            int end=arr[i][1];
            
            if(!ans.isEmpty() && ans.get(ans.size()-1)[1]>=start){
                int []last=ans.get(ans.size()-1);
                last[1]=Math.max(last[1],end);
            }
            else{
                ans.add(new int[]{start,end});
            }
        }
        return ans;
    }
}
