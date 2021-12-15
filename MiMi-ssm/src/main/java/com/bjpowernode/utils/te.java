package com.bjpowernode.utils;

public class te {
    public static void main(String[] args) {
        int[] height={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("=======");
        Solution solution=new Solution();
        int trap = solution.trap(height);
        System.out.println(trap);
    }
    static class Solution {
        public int trap(int[] height) {
            int sum=0;
            int flag=0;
            for(int i=0;i<height.length;i=i+flag){
                if(height[i]!=0){
                    for(int j=i;j<height.length;j++){
                        if(height[j]>=height[i]){
                            flag=j-i;
                            for(int r=i;r<j;r++){
                                sum+=height[i]-height[r];
                            }
                        }
                    }
                }
            }
            return sum;
        }
    }
}
