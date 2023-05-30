//convert upper case to lower case and also lower case to upper case
import java.util.*;
class Main{
    void lower(int x){
        int z = x-32;
        char up = (char)z;
        System.out.println(up);
    }
    void upper(int x){
        int z = x+32;
        char lo = (char)z;
        System.out.println(lo);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int x = (int) ch;
        Main m = new Main();
        if(x>=97&&x<=122){
            m.lower(x);
        }
        if(x>=65&&x<=90){
            m.upper(x);
        }
    }
}
