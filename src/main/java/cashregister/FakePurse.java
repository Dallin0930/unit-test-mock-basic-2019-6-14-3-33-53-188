package cashregister;

public class FakePurse {
    private String message;

    public FakePurse(Item[] items) {

    }

    public void setStringThat(String other) {
        this.message=other;
    }

    public Object asString() {
        return message;
    }

    public void setText(String test) {

    }
}
