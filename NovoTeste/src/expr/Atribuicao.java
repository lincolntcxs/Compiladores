package expr;

public class Atribuicao extends Expression{
    String id;
    int value;

    public Atribuicao(String id, int value) {
        this.id = id;
        this.value = value;
    }

    @Override
    public String toString() {
        return id+" = "+Integer.toString(value);
    }
}
