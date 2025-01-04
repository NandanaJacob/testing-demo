public class interimpl implements inter1, inter2{
    public static void main(String[] args) {
        interimpl c1 = new interimpl();
        c1.method1();
        c1.method2();
        c1.classmethod();
    }
    void classmethod(){
        System.out.println("class method");
    }
    public void method1(){
        System.out.println("method 1");
    }
    public void method2(){
        System.out.println("method 2");
    }
}
