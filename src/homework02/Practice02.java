package homework02;


public class Practice02 {
    public String takeState(String str) {
        String[] arr = str.split(" ");
        int count = 0;
        for(int i = 0; i < arr.length; i++) {

            int num = arr[i].length();
            String[] s = arr[i].split("");
            if(s[s.length-1].equals("구")) {
                count++;
            }
        }

        if(count > 0) {
            return arr[1];
        }else {
            return null;
        }


    }
}
