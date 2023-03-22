package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

import is.hi.hbv202g.ass9.composite.MathExpression;

/***********************************************************
 * Nafn: Brynjólfur Steingrímsson
 * Email: brs26@hi.is
 *
 * Lýsing:
 *
 *
 ***********************************************************/
public class NumberLeaf extends Observable implements MathExpression {

    private int number;
    public NumberLeaf(int i) {
        this.number = i;
    }

    @Override
    public int getResult() {
        return number;
    }

    public void setValue(int newNumber) {
        this.number = newNumber;
        this.notifyObservers();
    }

}
