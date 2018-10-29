package 大话设计模式.解释器模式;

/**
 * 
 * @author : lyuchao
 * @description: 终结符表达式
 *
 */
public class TerminalExpression extends AbstractExpression{

    @Override
    public void getInterpret(Context context) {
        // TODO Auto-generated method stub
        System.out.println("终端解释器");
    }
    
}

/**
 * 
 * @author : lyuchao
 * @description:    非终结符表达式
 *
 */
class NonterminalExpression  extends AbstractExpression{

    @Override
    public void getInterpret(Context context) {
        // TODO Auto-generated method stub
        System.out.println("非终端解释器");
    }
    
}
