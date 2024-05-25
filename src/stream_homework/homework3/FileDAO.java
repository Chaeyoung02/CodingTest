package stream_homework.homework3;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileDAO {
    File dir = new File("\\storage\\practice02");
    public boolean checkName(String file) {
        System.out.println(file);
        File files = new File(dir, file);

        if(!files.exists()) {
            return false;
        }else {
            return true;
        }

    }

    public void fileSave(String file, String s) {
        if(!dir.exists()) {
            dir.mkdirs();
        }
        File fileName = new File(dir, file);
        if(!fileName.exists()) {
            try {
                fileName.createNewFile();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

        FileWriter fw =null;
        try {
            fw = new FileWriter(fileName);
            fw.write(s);

            fw.close();
        }catch (Exception e) {
            e.printStackTrace();
        }


    }

    public StringBuilder fileOpen(String file) {
        File file3 = new File(dir,file);
        StringBuilder sb = new StringBuilder();

        FileReader fr = null;
        BufferedReader br = null;

        try {

            fr = new FileReader(file3);
            br = new BufferedReader(fr);

            String line = null;


            while(true) {
                line = br.readLine();
                if(line == null) {
                    break;
                }

                sb.append(line).append("\n");
            }
            //return sb;

        }catch (Exception e) {
            e.printStackTrace();
        }
        return sb;
    }
    public void fileEdit(String file, String s) {
        File file4 = new File(dir,file);
        System.out.println(file4);
        FileWriter fw1 =null;
        try {
            fw1 = new FileWriter(file4,true);
            fw1.write(s);
            fw1.close();

        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
