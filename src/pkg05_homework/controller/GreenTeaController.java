package pkg05_homework.controller;

import pkg05_homework.model.vo.Chocolate;
import pkg05_homework.model.vo.GreenTea;

public class GreenTeaController {
    GreenTea gt = new GreenTea();

    public String bakeGreenCake(double flour, double cream, double powder, int cheese){
        gt.setFlour(flour);
        gt.setCream(cream);
        gt.setPowder(powder);
        gt.setCheese(cheese);

        return gt.toString();
    }
}
