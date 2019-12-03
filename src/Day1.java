import java.io.BufferedReader;
import java.io.FileReader;

public class Day1 {
    public static void main(String[] args) {
        int total=0;
        try {
            BufferedReader reader=new BufferedReader(new FileReader("src/Day1Data.txt"));
            while(true) {
                total+=(recursiveFuel(Integer.parseInt(reader.readLine())));
            }
        } catch(Exception e) {}
        System.out.println(total);
    }
    public static int recursiveFuel(int n) {
        int x=n/3-2;
        if(x>0) return x+recursiveFuel(x); //remove recursiveFuel(x) to get part a answer
        return 0;
    }
}
