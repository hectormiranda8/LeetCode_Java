class RichestCustomerWealth {
    public static void main (String[] args){
        int[][] accs = {{1,2,3}, {1,2,3}};
        int max = maximumWealth(accs);
        System.out.println(max);
    }

    public static int maximumWealth(int[][] accounts) {

        int record = 0;

        for (int[] account : accounts) {
            int localRec = 0;
            for (int i : account) {
                localRec += i;
                if (localRec > record)
                    record = localRec;
            }
        }

        return record;
    }
}