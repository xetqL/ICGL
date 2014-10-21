/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure.FunctionProvider.Point;

import DataStructure.KPoint;
import FunctionProvider.FunctionProvider;
import FunctionProvider.PointFunctionProvider;

/**
 *
 * @author Boulmier
 */
public class FloatPointFunctionProvider implements PointFunctionProvider {

    public FloatPointFunctionProvider() {
    }
        @Override
    public Double distance(KPoint p1, KPoint p2){
        KPoint<Float> v1 = (KPoint<Float>) p1,v2 = (KPoint<Float>) p2;
        double sumSquared = 0.0;
        for(int i = 0; i < p1.size(); i++){
            sumSquared += java.lang.Math.pow( v1.get(i) - v2.get(i) , 2);
        }
        return java.lang.Math.sqrt(sumSquared);
    }
}
