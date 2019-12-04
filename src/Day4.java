public class Day4 {
    public static void main(String[] args) {
        int count=0;
        for(int i=372304; i<847060; i++) {
            boolean fits=false;
            int numInRow=0;
            for(int j=0; j<5; j++) {
                if((int)(i+"").charAt(j)==(int)(i+"").charAt(j+1)) {
                    numInRow++;
                } else {
                    if(numInRow==1) fits=true;
                    numInRow=0;
                }
            }
            if(numInRow==1) fits=true;
            for(int j=0; j<5; j++) {
                if((int)(i+"").charAt(j)>(int)(i+"").charAt(j+1)) fits=false;
            }
            if(fits) count++;
        }
        System.out.println(count);
    }
}
