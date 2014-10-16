/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author antho
 */
public class VectorClassFunctionProvider {

    public static FunctionProvider provideFunctions(Class forWhat) {
        if (forWhat == Double.class) {
            return new DoubleFunctionProvider();
        }
        if (forWhat == Float.class) {
            return new FloatFunctionProvider();
        }
        if (forWhat == Integer.class) {
            return new IntegerFunctionProvider();
        }
        return null;
    }

}
