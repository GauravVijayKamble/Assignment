public class  Gen<T>{
    T ob;
    Gen(T y){
        ob=y;
    }
    T getOb() {
        return ob;
    }
    void showType() {
        System.out.println("Type of Object is " + ob.getClass().getName());
    }

}
​​​