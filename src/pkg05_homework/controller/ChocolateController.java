package pkg05_homework.controller;

import pkg05_homework.model.vo.Chocolate;

public class ChocolateController {
    Chocolate c = new Chocolate();

    public String  bakeChocolateCake(double flour, double cream,int cherry, int chip){

        c.setFlour(flour);
        c.setCream(cream);
        c.setCherry(cherry);
        c.setChip(chip);

        return c.toString();
    }
}
