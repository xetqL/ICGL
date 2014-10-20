/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

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
