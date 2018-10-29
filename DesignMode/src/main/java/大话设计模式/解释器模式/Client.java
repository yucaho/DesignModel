package 大话设计模式.解释器模式;

import java.util.ArrayList;
import java.util.List;


public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> list = new ArrayList<AbstractExpression>();
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());
        
        for (AbstractExpression expression : list) {
              expression.getInterpret(context);
        }
        
        
    }
}
