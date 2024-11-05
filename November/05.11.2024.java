class GFG {
    static void rotate(int mat[][]) {
        // Code Herenew
        int n=mat.length;
        int m=mat[0].length;
        int arr[][]=new int[n][m];
        int k=n-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[j][k]=mat[i][j];
            }
            k--;
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=arr[i][j];
            }
        }
    }
}
