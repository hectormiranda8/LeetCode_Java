class SmallerThanCurrent {
    public static void main(String[] args){
        int[] nums = {8,1,2,2,3};
        int[] out = smallerNumbersThanCurrent(nums);
        for(int i : out)
            System.out.println(i);
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] out = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if (j == i)
                    continue;
                if (nums[j] < nums[i])
                    count++;
            }
            out[i] = count;
        }

        return out;
    }
}