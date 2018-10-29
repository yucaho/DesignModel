package 大话设计模式.访问者模式;

/**
 * 
 * @author : lyuchao
 * @description: 定义一个accept操作，他以一个访问者为参数
 *
 */
public abstract class Element {
    public abstract void Accept(Visitor visitor);
}
