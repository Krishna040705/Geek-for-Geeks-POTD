class Krishna {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        long product=1;
        int n=arr.length;
        int[]ans=new int[n];
        int zero_count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                zero_count++;
            }
            else{
                product*=arr[i];
            }
        }
        if(zero_count>1)
        {
            
            return ans;
        }
        if(zero_count==1)
        {
            for(int i=0;i<n;i++)
            {
                if(arr[i]==0)
                {
                    ans[i]=(int)product;
                }
            }
        }else{
              for(int i=0;i<n;i++)
            {
               
                    ans[i]=(int)product/arr[i];
                
            }
        }
        
        return ans;
    }
}
