package ex2;

public class Condition {
    private boolean leftClosed;
    private boolean rightClosed;
    private double inf;
    private double sup;

    public Condition(boolean leftClosed, double inf, double sup, boolean rightClosed) {
        this.leftClosed = leftClosed;
        this.inf = inf;
        this.sup = sup;
        this.rightClosed = rightClosed;
    }

    public boolean isLeftClosed() {
        return leftClosed;
    }

    public boolean isRightClosed() {
        return rightClosed;
    }

    public double getInf() {
        return inf;
    }

    public double getSup() {
        return sup;
    }

    public String toString() {
        return (isLeftClosed()?"[":"(")+getInf()+", "+getSup()+(isRightClosed()?"]":")");
    }
}
