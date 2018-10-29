package 大话设计模式.解释器模式;

/**
 * 
 * @author : lyuchao
 * @description: 抽象表达式： 这个接口为抽象语法树中所有的节点所共享
 *
 */
public abstract class AbstractExpression {
    public abstract void getInterpret(Context context);
}
