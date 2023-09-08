import java.util.Scanner;

public class Rectangle {

    int height ;

    int weight ;
    int S;
    int V;
    Rectangle(int height , int weight){
        this.height = height;
        this.weight = weight;
    }
    public void Acreage(){
        this.S = (this.height * this.weight);
        System.out.println("Diện tích hình chữ nhật là " + " "+ this.S);
    }
    public void perimeter(){
        this.V = ( this.height + this.weight)*2;
        System.out.println("chu vi hình chữ nhật là" + " " +this.V);
    }

}
 class Main2{
     public static void main(String[] args) {
         Scanner Input = new Scanner(System.in);
         System.out.println("Nhập height");
         int height = Input.nextInt();
         System.out.println("Nhập weight");
         int weight = Input.nextInt();
         Rectangle number2 = new Rectangle(height,weight);
         number2.perimeter();
         number2.Acreage();
//         Rectangle number1 = new Rectangle(3,3);
//         number1.Acreage();
//         number1.perimeter();

     }
 }
