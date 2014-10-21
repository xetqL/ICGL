/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionProvider;

import DataStructure.KPoint;

/**
 *
 * @author Boulmier
 */
public interface PointFunctionProvider extends FunctionProvider{
    public Double distance(KPoint p1, KPoint p2);
}
