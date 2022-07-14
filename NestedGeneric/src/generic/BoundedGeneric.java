package generic;

public class BoundedGeneric<T extends Number> {
    private T t;

    public BoundedGeneric(T t) {
        this.t = t;
    }

    public void run(){
        System.out.println(this.getT());
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
