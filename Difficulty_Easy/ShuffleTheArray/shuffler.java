class ShuffleTheArray {
    public static void main (String[] args){
        int[] nums = {2,5,1,3,4,7};
        int[] ret = shuffle(nums, 3);
        for(int i : ret)
            System.out.println(i);
    }

    /*
    Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
    Return the array in the form [x1,y1,x2,y2,...,xn,yn].
     */

    public static int[] shuffle(int[] nums, int n) {

        int[] x = new int[n];
        int[] y = new int[n];
        int[] ret = new int[nums.length];

        for(int i = 0; i < n; i++){
            x[i] = nums[i];
        }
        int index = n;
        for(int i = 0; i < n; i++){
            y[i] = nums[index++];
        }
        int ret_index = 0;
        index = 0;
        for(int i = 0; i < n; i++){
            ret[ret_index++] = x[index];
            ret[ret_index++] = y[index++];
        }

        return ret;
    }
}