package is.hi.hbv202g.ass9.composite;

/***********************************************************
 * Nafn: Brynjólfur Steingrímsson
 * Email: brs26@hi.is
 *
 * Lýsing:
 *
 *
 ***********************************************************/
public class NumberLeaf implements MathExpression {

    private int number;
    public NumberLeaf(int i) {
        this.number = i;
    }

    @Override
    public int getResult() {
        return number;
    }
}
