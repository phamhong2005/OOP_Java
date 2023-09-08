import java.util.Scanner;

public class Studenthihi {
        String name;
        int age;
        int [] arr;
        String skincolor;
        Studenthihi(String name , int age , int [] arr , String skincolor){
            this.name = name;
            this.age = age;
            this.arr = arr;
            this.skincolor = skincolor;
        }
        public void medium (){
            int tong = 0;
            double tb = 1;
            for (int i = 0; i < this.arr.length; i++) {
                tong += this.arr[i];
            }
            tb = tong / this.arr.length;
            System.out.println("điểm tb của sinh viên này là " + tb);
    }
    public void getter(){
        System.out.println(this.name+"tuổi " + this.age + " màu da " + this.skincolor);
    }

}
class Main14{
    public static void main(String[] args) {
        int [] array = {6,7,8,4,6,9};
        int [] arrays = {6,0,8,4,6,9};
        Studenthihi sv1 = new Studenthihi("Em Linh 2k1" , 22 ,array,"Hơi Trắng");
        Studenthihi sv2 = new Studenthihi("Long" , 18,arrays,"da nâu vãil");
        sv1.getter();
        sv1.medium();
        sv2.getter();
        sv2.medium();
    }
}

