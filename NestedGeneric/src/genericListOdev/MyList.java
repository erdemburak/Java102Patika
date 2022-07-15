package genericListOdev;

import java.util.Arrays;

public class MyList<T> {

    private int capacity;
    private Object[] list;

    public MyList() {
        this.list = new Object[10];
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.list = new Object[capacity];
    }

    public int size(){
        int count = 0;
        for (Object o : list) {
            if (o != null) {
                count++;
            }
        }
        return count;
    }

    public void add(T data){
        int elemanSayisi = size();
        if(elemanSayisi >= this.getCapacity() ){
            diziBoyut();
        }

        list[elemanSayisi] = data;
    }

    public void diziBoyut(){
        this.setCapacity(this.getCapacity()*2);
        Object[] newList = new Object[this.getCapacity()];

        for (int i = 0; i<list.length;i++){
            newList[i] = list[i];
        }
        list = newList;
    }

    public void get(int index){
        if(index >= 0 && index < this.getCapacity()){
            System.out.println("Girilen indisteki değer : " + list[index]);
        }else {
            System.out.println("Hatalı indis girdiniz : " + null);
        }
    }

    public void remove(int index){
        if(index >= 0 && index < this.getCapacity()){
            for(int i = index; i<list.length ; i++){
                if(list[i] != null){
                    list[i] = list[i++];
                }
            }
        }else {
            System.out.println("Hatalı indis girdiniz : " + null);
        }
    }

    public int indexOf(T data){
        int veriSayisi = size();
        int index = -1;
        for(int i = 0;i<veriSayisi;i++){
            if(list[i].equals(data)){
                index = i;
                break;
            }
        }
        return index;
    }

    public int lastIndexOf(T data){
        int veriSayisi = size();
        int index = -1;
        for(int i = 0;i<veriSayisi;i++){
            if(list[i].equals(data)){
                index = i;
            }
        }
        return index;
    }

    public void clear(){
        int veriSayisi = size();
        for(int i =0; i<veriSayisi; i++){
            list[i] = null;
        }
    }

    public MyList<Object> sublist(int start,int finish){
        MyList<Object> subList = new MyList<>(finish-start);
        for(int i = start; i<finish;i++){
            subList.add(list[i]);
        }
        return subList;
    }

    public boolean contains(T data){
        int veriSayisi = size();
        for(int i =0; i<veriSayisi; i++){
            if(list[i].equals(data)){
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty(){
        return size() != 0;
    }


    @Override
    public String toString() {
        return "MyList{" +
                "list=" + Arrays.toString(list) +
                '}';
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
