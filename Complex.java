import java.util.Scanner;
class ComplexNumber {
    int real,img;
    public ComplexNumber(int real){
        this.real=real;
    }
    public ComplexNumber(int real,int img) {
        this(real);
        this.img = img;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ComplexNumber c=new ComplexNumber(7,8);
        c.Print();
        ComplexNumber c1=new ComplexNumber(3,6);
        c1.Print();
        Add(c,c1);
        Sub(c,c1);
    }
    private static void Add(ComplexNumber c,ComplexNumber c1){
        System.out.println("The Addition is: "+(c.real+c1.real)+"+"+(c.img+c1.img)+"i");
    }
    private static void Sub(ComplexNumber c,ComplexNumber c1){
        System.out.println("The difference is: "+(c.real-c1.real)+"+"+(c.img-c1.img)+"i");
    }
    private void Print(){
        System.out.println("The Complex number is: "+real+"+"+img+"i");
    }
}