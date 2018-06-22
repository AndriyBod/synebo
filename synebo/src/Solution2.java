// Task 2


public class Solution2 {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int[] t= {-4, -8, -6, 9, 3, 13, 24, 30};
        int[] c=new int[t.length];
        int s=t.length;
        for (int i = 0; i < t.length; i++) {
            a=a+t[i];
        }
        a=a/t.length;// Среднее Значение Температуры(СЗТ) с лужит точкой перехода от зимы к лету
        System.out.println("Temperature: ");

        if(t.length < 1 ){
            s=t.length+1;
        for (int i = 0; i < s; i++)
        {
            System.out.print(t[i]+"\t");}
        System.out.println();
        c[0]=t[0];// так-как год начинается с зимы
        for (int i = 1; i < s; i++)
        {
            if (t[i]<a | t[i]<=0){
                c[b]=t[i];
                b=b+1;

            }if (t[i]>=a){break;}
        }
        for (int i = 0; i < b; i++) {
            System.out.println(c[i]);
        }
        System.out.print("Days in winter:  ");
        System.out.println((b));
        }else if (t.length>300000){
            System.out.println("Array is too big");}
    }
}