package pkg05_homework.model.vo;

public class Cake {
    private double flour;
    private double cream;

    public Cake() {

    }
    public Cake(double flour, double cream) {
        this.flour = flour;
        this.cream = cream;
    }

    public double getFlour() {
        return flour;
    }

    public void setFlour(double flour) {
        this.flour = flour;
    }


    public double getCream() {
        return cream;
    }

    public void setCream(double cream) {
        this.cream = cream;
    }

    public String toString() {
       return "크림 (g) : "+ cream+ "\n"+ "밀가루 (g) : " + flour+ "\n";
    }

}
