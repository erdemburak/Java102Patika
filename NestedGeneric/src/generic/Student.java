package generic;

public class Student<T> implements IDatabase<T>{

    @Override
    public boolean insert(T data) {
        System.out.println(data);
        System.out.println("Veri Eklendi");
        return true;
    }

    @Override
    public boolean delete(T data) {
        System.out.println(data);
        System.out.println("Veri silindi");
        return true;
    }

    @Override
    public boolean update(T data) {
        System.out.println(data);
        System.out.println("Veri güncellendi");
        return true;
    }

    @Override
    public T select() {
        System.out.println("Veri çekildi");
        return null;
    }
}
