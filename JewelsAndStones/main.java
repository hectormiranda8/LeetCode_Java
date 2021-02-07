import java.util.ArrayList;
import java.util.List;

class JewelsAndStones {
    public static void main (String[] args){
        String jewels = "aA", stones = "aAAbbbb";
        int out = numJewelsInStones(jewels, stones);
        System.out.println(out);
        jewels = "z"; stones = "ZZ";
        out = numJewelsInStones(jewels, stones);
        System.out.println(out);
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int out = 0;

        // identify jewels and add 'em to array
        List<Character> shiny = new ArrayList<>();
        for(int i = 0; i < jewels.length(); i++){
            shiny.add(jewels.charAt(i));
        }

        // check if we have jewels
        for(int i = 0; i < stones.length(); i++){
            if(shiny.contains(stones.charAt(i)))
                out++;
        }

        return out;
    }
}