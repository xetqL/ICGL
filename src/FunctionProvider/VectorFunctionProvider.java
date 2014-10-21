/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionProvider;

import DataStructure.Couple;
import DataStructure.Vector;

/**
 *
 * @author Boulmier
 */
public interface VectorFunctionProvider extends FunctionProvider {

    public Vector crossProduct(Couple k1k2);

    public Vector add(Couple k1k2);

    public Vector sub(Couple k1k2);

    public Vector mul(Vector k1, Number s1);

    public Double dotProduct(Couple k1k2);

}
