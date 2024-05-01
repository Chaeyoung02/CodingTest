package pkg05_homework.model.vo;

public class GreenTea extends Cake{
    private double powder;
    private int cheese;

    public GreenTea() {}

    public GreenTea(double flour, double cream, double powder, int cheese) {
        super(flour, cream);
        this.powder = powder;
        this.cheese = cheese;
    }


    public int getCheese() {
        return cheese;
    }

    public void setCheese(int cheese) {
        this.cheese = cheese;
    }
    public double getPowder() {
        return powder;
    }

    public void setPowder(double powder) {
        this.powder = powder;
    }

    @Override
    public String toString() {
        return super.toString() + "녹차파우더(g) : " + powder + "\n"+ "치즈(개) : "+ cheese+ "\n";
    }
}
