package is.hi.hbv202g.ass9.compositeLeafObservedTemplateMethod;

import is.hi.hbv202g.ass9.composite.MathExpression;

import java.util.ArrayList;
import java.util.List;

/***********************************************************
 * Nafn: Brynjólfur Steingrímsson
 * Email: brs26@hi.is
 *
 * Lýsing:
 *
 *
 ***********************************************************/
public abstract class MathExpressionComposite implements MathExpression, Observer {
    protected List<MathExpression> mathExpression = new ArrayList<MathExpression>();
    private int lastObservedResult;

    public abstract int getResult();

    public void add(MathExpression number) {
        mathExpression.add(number);
    }

    @Override
    public void update() {
        this.lastObservedResult = this.getResult();
        System.out.println("Result: " + String.valueOf(lastObservedResult));
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }
}
