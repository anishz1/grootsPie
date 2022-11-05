
// Problem: Groot's pie finder

import java.util.*;
 
class Groot {
 
     
    public static void grootsPie(int[] nums, int sweetness)
    {
        
        for (int i = 0; i < nums.length - 1; i++)
        {
             
            for (int j = i + 1; j < nums.length; j++)
            {
                 
                if (nums[i] + nums[j] == sweetness)
                {
                    System.out.printf("Pair found (%d, %d)", nums[i], nums[j]);
                    return;
                }
            }
        }
 
         
        System.out.println("Pair not found");
    }
 
    public static void main (String[] args)
    {
        int[] nums = { 2, 7, 4, 5, 3, 1 };
        int sweetness = nums.length;
 
        grootsPie(nums, sweetness);
    }
}