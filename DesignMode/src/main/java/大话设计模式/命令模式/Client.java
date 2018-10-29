package 大话设计模式.命令模式;

public class Client {
    public static void main(String[] args) {
        Receiver receiver  = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        
        invoker.setCommand(command);
        invoker.executeCommand();
    }
}
