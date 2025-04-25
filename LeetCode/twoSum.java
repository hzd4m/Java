import java.util.*; 

class twoSum {
    public int[] twoSum(int[] nums , int alvo){
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i + 1 ; j < nums.length ; j++){
                if(nums[i] + nums[j] == alvo){
                    return int[]{i,j};
                }
            }
        }

        return new int[0];
    }
}