package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

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
public class PlusComposite implements MathExpression, Observer {

    private List<MathExpression> mathExpression = new ArrayList<MathExpression>();

    private int lastObservedResult;
    @Override
    public int getResult() {
        int sum = 0;
        for (MathExpression number: mathExpression) {
            sum += number.getResult();
        }
        return sum;
    }

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
