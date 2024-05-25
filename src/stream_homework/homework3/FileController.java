package stream_homework.homework3;
public class FileController {
    FileDAO fd = new FileDAO();

    public boolean checkName(String file) {
        fd.checkName(file);
        return fd.checkName(file);
    }

    public void fileSave(String file, StringBuilder sb) {
        String str = String.valueOf(sb);
        fd.fileSave(file, str);
    }

    public StringBuilder fileOpen(String file) {
        fd.fileOpen(file);
        return fd.fileOpen(file);
    }

    public void fileEdit(String file, StringBuilder sb) {
        String str = String.valueOf(sb);
        fd.fileEdit(file, str);
    }
}
