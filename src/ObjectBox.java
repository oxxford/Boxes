import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ObjectBox {
    protected Collection<Object> container;


    public ObjectBox(Collection<Object> container){
        //Здесь может быть любой контейнер
        this.container = container;
    }

    public ObjectBox(Object[] arr){
        //Здесь может быть любой контейнер
        container = new ArrayList<>(Arrays.asList(arr));
    }

    public void addObject(Object obj) {
        container.add(obj);
    }

    public void removeObject(Object obj) {
        //Наличие проверяется автоматически
        container.remove(obj);
    }

    public void dump() {
        System.out.println(container.toString());
    }
}
