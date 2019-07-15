package cashregister;

public class FakePurse {
    private String message;
    public void setStringThat(String other) {
        this.message=other;
    }

    public Object asString() {
        return message;
    }
}
