import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

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
        int san=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i][1].equals("SAN")) san=i;
        }
        ArrayList<String> santa=new ArrayList<>();
        while(true) {
            boolean br=true;
            for(int i=0; i<arr.length; i++) {
                if(arr[i][1].equals(arr[san][0])) {
                    santa.add(arr[san][0]);
                    san=i;
                    br=false;
                }
            }
            if(br) break;
        }
        int you=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i][1].equals("YOU")) you=i;
        }
        ArrayList<String> youArr=new ArrayList<>();
        while(true) {
            boolean br=true;
            for(int i=0; i<arr.length; i++) {
                if(arr[i][1].equals(arr[you][0])) {
                    youArr.add(arr[you][0]);
                    you=i;
                    br=false;
                }
            }
            if(br) break;
        }
        boolean br=false;
        for(int i=0; i<youArr.size(); i++) {
            for(int j=0; j<santa.size(); j++) {
                if(santa.get(j).equals(youArr.get(i))) {
                    System.out.println(j+i);
                    br=true;
                }
                if(br) break;
            }
            if(br) break;
        }
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
