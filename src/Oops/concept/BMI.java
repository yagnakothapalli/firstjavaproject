package Oops.concept;

public class BMI {
    private double height;
    private int weight;

    public BMI(double height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getBMI(int weight,double height) {
        return(weight/(height*height));
    }
}
