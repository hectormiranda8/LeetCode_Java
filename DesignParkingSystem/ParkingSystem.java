class ParkingSystem {

    int big, medium, small; // 1,2,3 respectively

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1){
            if(big > 0){
                big--;
                return true;
            }
            else
                return false;
        }
        else if(carType == 2){
            if(medium > 0){
                medium--;
                return true;
            }
            else
                return false;
        }
        else if (carType == 3){
            if (small > 0) {
                small--;
                return true;
            }
            else
                return false;
        }

        return false;
    }
}