import java.util.ArrayList;
import java.util.List;

class ShuffleString{
    public static void main (String[] args){
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString("codeleet", indices));
        indices = new int[]{3, 1, 4, 2, 0};
        System.out.println(restoreString("aiohn", indices));
    }

    public static String restoreString(String s, int[] indices) {
        List<String> arr = new ArrayList<>();
        // Init arr so we can set strings at specific indices
        for(int i = 0; i < indices.length; i++)
            arr.add("");

        for(int i = 0; i < indices.length; i++){
            arr.set(indices[i], Character.toString(s.charAt(i)));
        }

        String ret = "";
        for(String st : arr)
            ret += st;

        return ret;
    }
}