public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        while (i < 1000) {

            boolean multiplesOf3 = i % 3 == 0;
            boolean multiplesOf5 = i % 5 == 0;

            if(multiplesOf3 || multiplesOf5){
                count ++;
                i ++;
            }
            else{
                i ++;
            }
        }
        System.out.println(count);
    }
}
