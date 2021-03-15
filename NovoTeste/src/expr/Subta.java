package expr;

public class Subta extends Expression{
    int value1;
    int value;

    public Subta(int v, int value) {
        this.value1 = v;
        this.value = value;
    }

    @Override
    public String toString() {
        return Integer.toString(value1)+" = "+Integer.toString(value);
    }
}
