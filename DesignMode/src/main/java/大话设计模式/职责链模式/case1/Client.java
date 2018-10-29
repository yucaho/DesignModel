package 大话设计模式.职责链模式.case1;


public class Client {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        Handler h3 = new ConcreteHandler3();
        //设置职责链的上家与下家
        h1.setSuccessor(h2);
        h2.setSuccessor(h3);
        
        int[] requests = {2,5,12,23,16,32};
        
        //循环给最小矗立着提交请求，不同的数额由不同权限的处理者处理
        for (int i : requests) {
            h1.HandlerRequest(i);
        }
        
    }
}
