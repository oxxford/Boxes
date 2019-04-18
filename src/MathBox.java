import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class MathBox extends ObjectBox{
    public MathBox(Number[] arr) {
        super(arr);
    }

    public ArrayList<Object> getContainer() {
        return (ArrayList<Object>)container;
    }

    public void remove(Number n) {
        container.remove(n);
    }

    public Number summator() {
        // Нельзя напрямую складывать два значения типа Number
        // Я взял их double представление потому что int кастуется к double, а наоборот - нет
        return (Number) container.stream().reduce((a, b) ->
                ((Number)a).doubleValue() + ((Number)b).doubleValue()).orElse(null);
    }

    public void splitter(double delimiter) {
        // Нельзя напрямую делить Number и double
        ((ArrayList<Object>)container).replaceAll(a -> ((Number)a).doubleValue() / delimiter);
    }

    @Override
    public void addObject(Object obj) {
        if (obj instanceof Number)
            container.add(obj);
        else
            throw new ClassCastException("Required Number!");
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;

        if(obj == null || obj.getClass()!= this.getClass())
            return false;

        MathBox box = (MathBox)obj;

        return container.equals(box.getContainer());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(container.toArray());
    }

    @Override
    public String toString() {
        return container.toString();
    }
}
