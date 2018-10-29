package 大话设计模式.中介模式;

public class Client {
    public static void main(String[] args) {
        ConcreteMeditor meditor = new ConcreteMeditor();
        
        //让两个具体同事类认识中介者对象
        ConcreteColleague1 colleague1 = new ConcreteColleague1(meditor);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(meditor);
        
        //让中介者认识各个具体同事类对象
        meditor.setColleague(colleague1);
        meditor.setColleague2(colleague2);
        
        //具体同事类对象的发送信息都是通过中介者转发
        colleague1.Send("吃过饭没？");
        colleague2.Send("没有呢，你打算请客？");
    }
}
