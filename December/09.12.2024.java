class Solution {
    public static void sortbyColumn(int a[][], int c){      
      Arrays.sort(a, (x, y) -> Integer.compare(x[c],y[c]));  
    }
    static ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
        // code here
        int m=intervals.length;
        
        int[][] arr=new int[m+1][2];
        for(int i=0;i<m;i++){
            arr[i][0]=intervals[i][0];
            arr[i][1]=intervals[i][1];
        }
        arr[m][0]=newInterval[0];
        arr[m][1]=newInterval[1];
        ArrayList<int[]> a=new ArrayList<>();
        int n=arr.length;
        int[] range=new int[2];
        sortbyColumn(arr,0);
        range[0]=arr[0][0];
        range[1]=arr[0][1];
        for(int i=1;i<m+1;i++){
            if (arr[i][0]<=range[1]){
                if(arr[i][1]>range[1]){
                    range[1]=arr[i][1];
                }
            }
            else if(arr[i][0]>range[1]){
                int[] temp=new int[2];
                temp[0]=range[0];
                temp[1]=range[1];
                a.add(temp);
                range[0]=arr[i][0];
                range[1]=arr[i][1];
            }
        }
        a.add(range);
        return a;
    }
}
