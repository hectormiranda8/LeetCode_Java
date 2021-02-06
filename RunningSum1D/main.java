class RunningSum1D {
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        int[] ret = runningSum(nums);
        for(int i: ret)
            System.out.println(i);
    }

    public static int[] runningSum(int[] nums) {

        int[] ret = new int[nums.length];

        if(nums.length == 1){
            ret[0] = nums[0];
            return ret;
        }

        ret[0] = nums[0];

        for(int i = 1; i < nums.length; i++){
            ret[i] = ret[i-1] + nums[i];
        }

        return ret;
    }
}