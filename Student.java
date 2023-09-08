public class Student {
    String name;
    int age;
    int[] arr;

    Student(String name, int age, int[] arr) {
        this.name = name;
        this.age = age;
        this.arr = arr;
    }

    public void get() {
        System.out.println("Sinh viên có tên là " + this.name + " và có tuổi là " + this.age);
    }

    public int Tb() {
        int tong = 0;
        int tb = 1;
        for (int i = 0; i < this.arr.length; i++) {
            tong += this.arr[i];
        }
        tb = tong / this.arr.length;
        return tb;
    }
}

class Main10 {
    public static void main(String[] args) {
        int[] arr = {6, 7, 8, 4, 6};
        int[] array = {3, 5, 6, 7, 3, 4};
        Student sv1 = new Student("Linh", 22, arr);
        Student sv2 = new Student("Long", 19, array);
        sv1.get();
        int diem1 = sv1.Tb();
        int diem2 = sv2.Tb();
        if (diem1>diem2) {
            System.out.println("Sinh viên có điểm cao hơn là   " + sv1.name );
        }
        else {
            System.out.println("Sinh viên có điểm cao hơn là   " + sv2.name);
        }
    }


}
