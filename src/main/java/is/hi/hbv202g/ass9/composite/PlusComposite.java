package is.hi.hbv202g.ass9.composite;

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
public class PlusComposite implements MathExpression {

    private List<MathExpression> mathExpression = new ArrayList<MathExpression>();

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
}
