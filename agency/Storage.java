package agency;
import java.util.*;
public class Storage<T>{
    private List<T> items=new ArrayList<>();
    public void add(T t){
        items.add(t);
    }
}