import java.io.BufferedReader;
import java.io.FileReader;

public class Day6 {
    public static int count=0;
    public static String[][] arr=new String[1272][2];
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/Day6Data.txt"));
            for(int i=0; i<arr.length; i++) {
                String str=reader.readLine();
                arr[i][0]=str.substring(0, 3);
                arr[i][1]=str.substring(4, 7);
            }
        } catch(Exception e){}
        for(int i=0; i<arr.length; i++) {
            recursiveCount(arr[i][1]);
        }
        System.out.println(count);
    }
    public static void recursiveCount(String start) {
        for(int i=0; i<arr.length; i++) {
            if(start.equals(arr[i][1])) {
                recursiveCount(arr[i][0]);
                count++;
            }
        }
    }
}
