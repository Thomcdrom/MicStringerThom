package oose.ThomvanHeeswijk;

public class Stringer implements IStringer {

    private String string;
    private String reverse;

    public Stringer(String string) {
        this.string = string;
        this.setReverse("ollah");
    }

    @Override
    public String getReverse() {
        return reverse;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void setReverse(String reverse) {
        this.reverse = reverse;
    }
}
