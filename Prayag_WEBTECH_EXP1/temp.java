import java.util.*;
public class temp{
    public static int minSub(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int curr = 0;
        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            curr += nums[r];
            while (curr >= target) {
                ans = Math.min(ans, r - l + 1);
                curr -= nums[l++];
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
    public static void main(String args[]){
        int ary[]={5,6,3,9,2};
        int tar=10;
        System.out.println(minSub(tar,ary));
    
}
}