/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Boulmier
 */
public abstract class Values {
    public static final Map<Class<? extends Number>, Number> zeroes = new HashMap<>();
    static {
        zeroes.put(Integer.class, 0);
        zeroes.put(Double.class, 0.0);
        zeroes.put(Float.class, (float) 0.0);
        zeroes.put(Long.class, (long) 0);
    }
    public static final Map<Class<? extends Number>, Number> ones = new HashMap<>();
    static {
        ones.put(Integer.class, 1);
        ones.put(Double.class, 1.0);
        ones.put(Float.class, (float) 1.0);
        ones.put(Long.class, (long) 1);
    }
}
