/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionProvider;

import DataStructure.KPoint;
import DataStructure.KSegment;

/**
 *
 * @author Boulmier
 */
public interface SegmentFunctionProvider extends FunctionProvider{
    public <T extends Number> KPoint<T> intersect(KSegment s1, KSegment s2);
}
