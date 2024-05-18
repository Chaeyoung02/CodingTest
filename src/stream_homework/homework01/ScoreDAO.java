package stream_homework.homework01;

import java.io.*;

public class ScoreDAO {
    private java.io.DataInputStream DataInputStream;

    public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
        File dir = new File("\\storage\\practice02");
        if(!dir.exists()) {
            dir.mkdirs();

        }

        File file = new File(dir, "practice.txt");

        DataOutputStream dos = null;
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(file, true);
            dos = new DataOutputStream(fos);

            dos.writeUTF(name);
            dos.writeInt(kor);
            dos.writeInt(eng);
            dos.writeInt(math);
            dos.writeInt(sum);
            dos.writeDouble(avg);


        } catch (Exception e) {
           e.printStackTrace();
        }

    }
    public DataInputStream readScore() throws FileNotFoundException {
        File dir = new File("\\storage\\practice02");
        File file = new File(dir, "practice.txt");

        FileInputStream fis = null;
        DataInputStream dis = null;

        try {
            fis = new FileInputStream(file);
            dis= new DataInputStream(fis);
            System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
//            String name = dis.readUTF();
//            int kor = dis.readInt();
//            int eng = dis.readInt();
//            int math = dis.readInt();
//            int sum = dis.readInt();
//            double avg = dis.readDouble();

            return dis;

        } catch (FileNotFoundException e) {
            throw e;
        }


    }
}
