package awslambda.javagradle;

public class Greeting {
    private String greetings;

    public Greeting(String greetings) {
        this.greetings = greetings;
    }
    public String getGreetings() {
        return greetings;
    }

    public void setGreetings(String greetings) {
        this.greetings = greetings;
    }
}
