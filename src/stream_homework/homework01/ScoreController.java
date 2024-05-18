package stream_homework.homework01;

import java.io.DataInputStream;
import java.io.FileNotFoundException;

public class ScoreController {
    ScoreDAO sd = new ScoreDAO();

    public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
        System.out.println(avg);
        sd.saveScore(name, kor,eng, math, sum, avg);
    }
    public DataInputStream readScore() throws FileNotFoundException{

        return sd.readScore();
    }
}
