package expr;

import antlr.GramaticaBaseVisitor;
import antlr.GramaticaParser;

import java.util.ArrayList;
import java.util.List;


public class AntlrToSomatorio extends GramaticaBaseVisitor<Somato> {
    private List<String> declaredVariables;

    private List<String> semanticErrors;

    private SymbleTable symbleTable;

    public AntlrToSomatorio(List<String> semanticErrors, SymbleTable symbleTable) {
        declaredVariables = new ArrayList<>();
        this.semanticErrors = semanticErrors;
        this.symbleTable=symbleTable;
    }

    @Override
    public Somato visitSomato(GramaticaParser.SomatoContext ctx) {
        String value1 = ctx.NUM().getText();
        String value = ctx.NUM().getText();
        Somato soma = new Somato(Integer.parseInt(value1),Integer.parseInt(value));
        if (symbleTable.check(value1)){
            semanticErrors.add("Variavel já declarada : "+value1);
        } else {
            symbleTable.add(value1,Integer.parseInt(value));
        }

        return soma;
    }



}
