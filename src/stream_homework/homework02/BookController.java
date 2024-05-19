package stream_homework.homework02;

import java.io.File;

public class BookController {
    BookDAO bd = new BookDAO();

    public void makeFile(){
        try{
        File dir = new File("\\storage\\practice03");
        File file = new File(dir, "book.txt");

            if (!file.exists()) {
                file.createNewFile();
            }
        }catch (Exception e){
            System.out.println("파일 생성 실패");
        }

    }

    public void fileSave(Book[] bArr){
              bd.fileSave(bArr);
    }
    public Book[] fileRead(){

         return bd.fileRead();

    }
}
