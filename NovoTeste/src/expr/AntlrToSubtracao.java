package expr;

import antlr.GramaticaBaseVisitor;
import antlr.GramaticaParser;

import java.util.ArrayList;
import java.util.List;


public class AntlrToSubtracao extends GramaticaBaseVisitor<Subta> {
    private List<String> declaredVariables;

    private List<String> semanticErrors;

    private SymbleTable symbleTable;

    public AntlrToSubtracao(List<String> semanticErrors, SymbleTable symbleTable) {
        declaredVariables = new ArrayList<>();
        this.semanticErrors = semanticErrors;
        this.symbleTable=symbleTable;
    }

    @Override
    public Subta visitSubta(GramaticaParser.SubtaContext ctx) {
        String value1 = ctx.NUM().getText();
        String value = ctx.NUM().getText();
        Subta sub = new Subta(Integer.parseInt(value1),Integer.parseInt(value));
        if (symbleTable.check(value1)){
            semanticErrors.add("Variavel já declarada : "+value1);
        } else {
            symbleTable.add(value1,Integer.parseInt(value));
        }

        return sub;
    }



}
