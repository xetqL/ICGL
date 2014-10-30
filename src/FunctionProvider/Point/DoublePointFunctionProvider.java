/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionProvider.Point;

import DataStructure.KPoint;
import DataStructure.Point;
import FunctionProvider.PointFunctionProvider;

/**
 *
 * @author Boulmier
 */
public class DoublePointFunctionProvider implements PointFunctionProvider {

    @Override
    public Double distance(Point p1, Point p2){
        KPoint<Double> v1 = (KPoint<Double>) p1,v2 = (KPoint<Double>) p2;
        Double sumSquared = 0.0;
        for(int i = 0; i < v1.size(); i++){
            sumSquared += java.lang.Math.pow( v1.get(i) - v2.get(i) , 2);
        }
        return java.lang.Math.sqrt(sumSquared);
    }
}
