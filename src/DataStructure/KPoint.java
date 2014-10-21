/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

import FunctionProvider.PointFunctionProvider;

/**
 *
 * @author Boulmier
 * @param <T>
 */
public class KPoint<T extends Number> extends KObject<T> implements Point{
    public KPoint(Dimension d, Class<? extends Number> c) {
        super(d, c, true, KPoint.class);
    }
    
    @Override
    public Double distance(KPoint p2) {
        return ((PointFunctionProvider) f).distance(p2, p2);
    }
    
}
