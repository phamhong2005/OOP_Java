import javax.xml.namespace.QName;

public class Car {
     public String name;
    public int width;
    public  int number;

    public Car(String name , int width , int number){
        this.name = name;
        this.width = width;
        this.number = number;

    }
    public void go(){
        System.out.println(this.name + " có cân nặng " + this.width + " đang bay");

    }
    public static void main(String[] args) {
        Car a = new Car("G63" , 200,4);
        Car b = new Car("Lamboghini",200,4);

        b.go();

    }

}


