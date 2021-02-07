class DecodeXORedArr{
    public static void main(String[] args){
        int[] encoded = {1,2,3};
        int[] out = decode(encoded, 1);
        for(int i : out)
            System.out.println(i);
    }

    public static int[] decode(int[] encoded, int first) {
        int[] out = new int[encoded.length+1];
        out[0] = first;

        for(int i = 0; i < encoded.length; i++){
            out[i+1] = out[i] ^ encoded[i];
        }

        return out;
    }
}