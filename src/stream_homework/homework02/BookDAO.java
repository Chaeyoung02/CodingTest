package stream_homework.homework02;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookDAO {
    Book[] bArr = new Book[10];

    public void fileSave(Book[] bArr){

        try {
            File dir = new File("\\storage\\practice03");
            File file = new File(dir, "book.txt");
            List<Book> books = new ArrayList<>();
            ObjectInputStream ois = null;

            if (file.length() != 0) {
                // 기존 파일 내용 읽어오기
                try {
                    ois = new ObjectInputStream(new FileInputStream(file));
                    //값이 있을때까지 확인하기
                    while (true) {
                        try {
                            //리스트에 값을 넣어주기
                            Book book = (Book) ois.readObject();
                            books.add(book);
                        } catch (EOFException e) {
                            break; // 파일의 끝에 도달했으므로 반복문 종료
                        }
                    }
                } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }
                //만약에 처음 넣는 경우, 값이 없는 상태를 확인하고 다음으로

            }

            // 기존 리스트 값에 새로운 배열을 넣어서 하나로 합치기
            books.addAll(Arrays.asList(bArr));

            // 파일에 새로운 내용 저장하기
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
                for (Book book : books) {
                    oos.writeObject(book);
                    //book을 넣어주기
                }
                System.out.println("파일 저장 성공");
            } catch (IOException e) {
                System.out.println("파일 저장 실패: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("파일 저장 실패: " + e.getMessage());
        }



}
//list 를 두번 다 사용하는 이유는 Stream 특성상 같이 맞춰줘야 함.
    public Book[] fileRead() {
        File dir = new File("\\storage\\practice03");
        File file = new File(dir, "book.txt");
        List<Book> books = new ArrayList<>();
        ObjectInputStream ois = null;
        if(file.length()  != 0) {
            try {
                //위와 같이 값을 확인하기
                ois = new ObjectInputStream(new FileInputStream(file));
                while (true) {
                    try {
                        Book book = (Book) ois.readObject();
                        books.add(book);
                    } catch (EOFException e) {
                        break; // 파일의 끝에 도달했으므로 반복문 종료
                    }
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return books.toArray(new Book[books.size()]);
    }

}
