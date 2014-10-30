/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionProvider;

import FunctionProvider.Segment.DoubleSegmentFunctionProvider;
import FunctionProvider.Segment.IntegerSegmentFunctionProvider;
import FunctionProvider.Segment.FloatSegmentFunctionProvider;
import FunctionProvider.Point.IntegerPointFunctionProvider;
import FunctionProvider.Point.FloatPointFunctionProvider;
import FunctionProvider.Point.DoublePointFunctionProvider;
import DataStructure.KPoint;
import DataStructure.KSegment;
import DataStructure.SpaceElement;
import DataStructure.Vector;
import FunctionProvider.Vector.DoubleVectorFunctionProvider;
import FunctionProvider.Vector.IntegerVectorFunctionProvider;
import FunctionProvider.Vector.FloatVectorFunctionProvider;

/**
 *
 * @author antho
 */
public class ClassFunctionProvider {

    public static FunctionProvider provideFunctions(Class<? extends Number> forWhat, Class<? extends SpaceElement> forWho) {
        if (forWho == Vector.class) {
            if (forWhat == Double.class) {
                return new DoubleVectorFunctionProvider();
            }
            if (forWhat == Float.class) {
                return new FloatVectorFunctionProvider();
            }
            if (forWhat == Integer.class) {
                return new IntegerVectorFunctionProvider();
            }
        }

        if (forWho == KPoint.class) {
            if (forWhat == Double.class) {
                return new DoublePointFunctionProvider();
            }
            if (forWhat == Float.class) {
                return new FloatPointFunctionProvider();
            }
            if (forWhat == Integer.class) {
                return new IntegerPointFunctionProvider();
            }
        }
        
        if (forWho == KSegment.class){
            if (forWhat == Double.class) {
                return new DoubleSegmentFunctionProvider();
            }
            if (forWhat == Float.class) {
                return new FloatSegmentFunctionProvider();
            }
            if (forWhat == Integer.class) {
                return new IntegerSegmentFunctionProvider();
            }
        }
        return null;
    }

}
