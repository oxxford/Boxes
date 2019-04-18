import java.util.ArrayList;
import java.util.Arrays;

public class MathBox {
    private ArrayList<Number> container;

    public MathBox(Number[] arr) {
        container = new ArrayList<>(Arrays.asList(arr));
    }

    public ArrayList<Number> getContainer() {
        return container;
    }

    public void remove(int n) {
        container.remove(n);
    }

    public Number summator() {
        // Нельзя напрямую складывать два значения типа Number
        // Я взял их double представление потому что int кастуется к double, а наоборот - нет
        return container.stream().reduce((a, b) -> a.doubleValue() + b.doubleValue()).orElse(null);
    }

    public void splitter(double delimiter) {
        // Нельзя напрямую делить Number и double
        container.replaceAll(a -> a.doubleValue() / delimiter);
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
