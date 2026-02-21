//wap to input radius of circle from user and print its area
import java.util.*;
public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        float rad= sc.nextFloat();
         double area= 3.14*(rad*rad);
        System.out.println(area);
    }
}
