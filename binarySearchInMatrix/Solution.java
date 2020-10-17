class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix.length==0)return false;

        int row=matrix.length;
        int column=matrix[0].length;
        
        int left=0;
        int right=row*column-1;
        while(left<=right){
            
            int mid=left+(right-left)/2;
           int  element=matrix[mid/column][mid%column];
            
            if(target==element){
                return true;
            }else if(target<element){
                right=mid-1;
            }else if(target>element){
                left=mid+1;
            }
        }
        
        return false;
        
    }

    public static void main(String[] args) {
    	int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
    	int target = 3;
    	System.out.println(searchMatrix(matrix,target));
    }
}