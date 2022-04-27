package ex1;

public class City extends  Population {
  //instance variable for longitude latitude and size
    private double longitude;
    private double latitude;
    private double size;

    //constructor to initialize the instance variable
    public City(double size, double latitude, double longitude) {
        super(size);
    this.size = size;
    this.latitude = latitude;
    this.longitude = longitude;

    }
//returns the latitude value
    public double getLatitude() {
        return latitude;
    }
//returns the longitude value
    public double getLongitude() {
        return longitude;
    }
//returns the size overrides the super class method
    @Override
    public double getSize() {
        return size;
    }
//handles the tostring method for display city object
    public String toString(){
//        NumberFormat.getNumberInstance()
        return String.format("%f million located at %f lat, %f lon", this.size,this.longitude,this.latitude);
    }
}
