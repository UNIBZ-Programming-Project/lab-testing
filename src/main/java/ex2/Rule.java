package ex2;

public class Rule {
    private Condition[] body;
    private double head;

    public Rule(Condition[] body, double head) {
        this.body = body;
        this.head = head;
    }

    public Condition[] getBody() {
        return body;
    }

    public double getHead() {
        return head;
    }

    public Double evaluate(double[] input) {
        for(int i = 0; i < this.getBody().length; i++) {
            boolean leftOk = input[i] >= this.getBody()[i].getInf();
            boolean rightOk = input[i] <= this.getBody()[i].getSup();
            if(!leftOk || !rightOk)
                return null;
        }
        return this.getHead();
    }

    public String toString() {
        StringBuffer b = new StringBuffer();
        b.append("if");
        for(int i = 0; i < this.getBody().length; i++) {
            b.append("\t");
            if(i > 0)
                b.append("and ");
            b.append(this.getBody()[i]);
            b.append("\n");
        }
        b.append("then return ");
        b.append(this.getHead());
        b.append("\n");
        return b.toString();
    }
}
