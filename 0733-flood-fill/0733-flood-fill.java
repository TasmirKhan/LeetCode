class Solution {

    public void helper(int[][] arr, int a, int b, int color){
        if(arr[a][b] == color) return ;
       int orgColor = arr[a][b];
       arr[a][b] = color;
       if(a > 0 && arr[a-1][b] == orgColor){ helper(arr,a-1,b, color);}
       if(b > 0 && arr[a][b-1] == orgColor){ helper(arr,a,b-1, color);}
       if(a < arr.length-1 && arr[a+1][b] == orgColor){ helper(arr,a+1,b, color);}
       if(b < arr[0].length-1 && arr[a][b+1] == orgColor){ helper(arr,a,b+1, color);}
       
    }

    public int[][] floodFill(int[][] img, int sr, int sc, int color) {
        
        helper(img, sr, sc, color);
        return img;
    }
}