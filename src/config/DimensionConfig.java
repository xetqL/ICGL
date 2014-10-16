/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package config;

import DataStructure.Dimension;

/**
 *
 * @author antho
 */
public class DimensionConfig {
    public static Dimension global_dimension = Dimension.getFirstDimension();
    public static void setGlobalDimension(Dimension d){
        global_dimension = d;
    }
}
