package 大话设计模式.访问者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author : lyuchao
 * @description: 能枚举它的元素，可以提供一个高层的结构以允许访问者访问它的元素
 *
 */
public class ObjectStructure {
     private List<Element> elements = new ArrayList<Element>();
     
     public void  Attach(Element element){
         if (!elements.contains(element)) {
             elements.add(element);
        }
         
     }
     
     public void Detach(Element element){
         elements.remove(element);
     }
     
     public void Accept(Visitor visitor){
            for (Element element : elements) {
                 element.Accept(visitor);
                
            }
     }
}
