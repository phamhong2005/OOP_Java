import java.util.Scanner;

public class Dental {
    int a;
    int b;
    int c;

    Dental(int a , int b , int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void pt2 (){
       double Dental = Math.pow(b,2) - 4 * a * c;
       double n1 = (-b + Math.sqrt(Dental))/2*a;
       double n2 = (-b - Math.sqrt(Dental))/2*a;
       double nk = -b / 2 * a;

       if (Dental>0){
           System.out.println("Phương trình có 2 nghiệm  " + n1 + " và " + n2);
       }
       else if (Dental==0){
           System.out.println(" Phương trình có nghiệm kép" + nk);
       }
       else {
           System.out.println("Vô nghiệm rồi");
       }
    }
}
class Hello{
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int r = Input.nextInt();
        int e = Input.nextInt();
        int f = Input.nextInt();
        Dental sp1 = new Dental(r,e,f);
        sp1.pt2();

    }
}
