class ParkingSystem {
    int small;
    int midium;
    int big;

    public ParkingSystem(int big, int medium, int small) {
        this.small=small;
        this.big=big;
        this.midium = medium;
    }
    
    public boolean addCar(int carType) {
        if(carType==1){
            if(big>0){
                big--;
                return true;
            }
        } else if(carType==2){
            if(midium>0){
                midium--;
                return true;
            }
        }else{
            if(small > 0){
                small--;
                return true;
            }
        }     
        return false;

    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */