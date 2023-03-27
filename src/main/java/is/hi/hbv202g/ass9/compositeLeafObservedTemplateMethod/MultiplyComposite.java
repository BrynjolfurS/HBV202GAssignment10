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
public class MultiplyComposite extends MathExpressionComposite implements MathExpression, Observer {

    @Override
    public int getResult() {
        int sum = 1;
        for (MathExpression number : mathExpression) {
            sum *= number.getResult();
        }
        return sum;
    }
}
