package 大话设计模式.解释器模式;

public class Context {
    private String input;

    public void setInput(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }
    
    private String output;

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
    
    
}
