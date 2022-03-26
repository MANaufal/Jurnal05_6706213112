import java.util.*;

public class tugasQ<E>{
    private Queue<E> queueList;

    public tugasQ(){
        queueList = new LinkedList<E>();
    }

    public void tambahTugas(E object){
        queueList.add(object);
    }

    public void urutanTugas(){
        Iterator<E> iterator = queueList.iterator();
        while(iterator.hasNext()){
            Object value = iterator.next();
            System.out.print(value + " - ");
        }
    }

    public E selesaiTugas() throws NoSuchElementException{
        return queueList.remove();
    }

    public boolean kosong(){
        return queueList.isEmpty();
    }
}