package expr;

public class Somato extends Expression{
    int value1;
    int value;

    public Somato(int v, int value) {
        this.value1 = v;
        this.value = value;
    }

    @Override
    public String toString() {
        return Integer.toString(value1)+" = "+Integer.toString(value);
    }
}
