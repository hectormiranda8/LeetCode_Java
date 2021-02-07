import java.util.ArrayList;
import java.util.List;

class DecompressRunLength {
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        int[] out = decompressRLElist(nums);
        for(int i : out)
            System.out.println(i);
        nums = new int[]{1,1,2,3};
        out = decompressRLElist(nums);
        for(int i : out)
            System.out.println(i);

    }

    public static int[] decompressRLElist(int[] nums) {
        List<Integer> arr = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(2*i >= nums.length || 2*i+1 >= nums.length)
                break;
            int freq = nums[2*i];
            int val = nums[2*i+1];
            while(freq > 0){
                arr.add(val);
                freq--;
            }
        }

        int[] out = new int[arr.size()];
        int index = 0;
        for(int i : arr)
            out[index++] = i;

        return out;
    }
}