public class Solution {
    public static void main(String[] args) {
        System.out.println(interval(0,50));}

    public static int interval(int a, int b){
        int c=0;

       if (a<=b){
           while(a<=b){
               if ((Math.sqrt(a))%1 == 0){
                   System.out.println(a);
                   c++;
               }a++;
           }
       }
        System.out.print("Numbers of squares: ");
        return c;
    }
}