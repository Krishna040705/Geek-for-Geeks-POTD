class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int i=0, idx=0;
        while(i<arr.length){
            boolean f=false;
            while(i<arr.length-1 && arr[i]==0 && arr[i+1]==0){
                i+=1;
                f=true;
            }
            if(f || arr[i]==0)i++;
            if(i<arr.length)
            arr[idx++]=arr[i++];
        }
        while(idx<arr.length)arr[idx++]=0;
        
    }
}
