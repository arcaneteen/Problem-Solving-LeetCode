class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[i].length;j++){
                int temp=matrix[i][j];
               matrix[i][j]= matrix[j][i];
               matrix[j][i]=temp;

            }
        }
        int l=matrix.length;
        for(int i=0;i<l;i++){
            for(int j=0;j<l/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][l-j-1];
                matrix[i][l-j-1]=temp;
            }
        }
    }
}