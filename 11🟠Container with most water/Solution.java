class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int maxArea=Integer.MIN_VALUE;
        int lp=0;
        int rp=n-1;
        while(lp<rp){
            int width=rp-lp;
            int h=Math.min(height[lp],height[rp]);
            int area=width*h;
            maxArea=Math.max(maxArea,area);
            if(height[lp]>height[rp]){
                rp--;
            }
            else{
                lp++;
            }

        }
        return maxArea;
        
    }
}