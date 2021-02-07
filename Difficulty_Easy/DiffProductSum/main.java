class DiffProductSum {
    public static void main(String[] args){
        System.out.println(subtractProductAndSum(234));
        System.out.println(subtractProductAndSum(4421));
    }

    public static int subtractProductAndSum(int n) {
        int product = 1, sum = 0;

        String s = String.valueOf(n);
        for(int i = 0; i < s.length(); i++){
            int num = Integer.parseInt(Character.toString(s.charAt(i)));
            product *= num;
            sum += num;
        }

        return product - sum;
    }
}