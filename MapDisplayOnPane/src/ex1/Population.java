package ex1;

public class Population {
    private double size;

    public Population(double size){
        this.size = size;
    }

    public void update(double sizeIncrement){
        this.size =+ sizeIncrement;
    }

    public double getSize(){ return this.size;}

    public  void setSize(double size){this.size = size;}
}
