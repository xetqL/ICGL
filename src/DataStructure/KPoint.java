/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

/**
 *
 * @author Boulmier
 * @param <T>
 */
public class KPoint<T extends Number> extends KObject<T> implements Point{

    public KPoint(Dimension d, Class c) {
        super(d, c);
    }

    @Override
    public Double distance(KPoint p2) {
        FunctionProvider f = ClassFunctionProvider.provideFunctions(internType);
        return f.distance(p2, p2);
    }
    
}
