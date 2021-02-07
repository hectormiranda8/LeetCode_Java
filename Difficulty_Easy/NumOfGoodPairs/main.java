class NumOfGoodPairs {
    public static void main (String[] args){
        int[] nums = {1,2,3,1,1,3};
        int out = numIdenticalPairs(nums);
        System.out.println(out);
        int[] nums2 = {1,1,1,1};
        out = numIdenticalPairs(nums2);
        System.out.println(out);
    }

    public static int numIdenticalPairs(int[] nums) {

        int goodPairs = 0;

        for(int i = 0; i < nums.length-1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j] && i < j)
                    goodPairs++;
            }
        }

        return goodPairs;
    }
}
