/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testing;

import DataStructure.BadDimensionException;
import DataStructure.Dimension;
import DataStructure.KPoint;
import DataStructure.Point;
import DataStructure.Space;
import DataStructure.Vector;
import DataStructure.VectorFactory;


/**
 *
 * @author antho
 */
public class test {
    
    public static void main(String[] args) throws BadDimensionException{
        Dimension d = Dimension.getDimension(50);
        Vector v = VectorFactory.getVector(new Integer[]{0,1,0}, Integer.class),
               u = VectorFactory.getVector(new Integer[]{0,-1,0},  Integer.class); 
        Point p1 = new KPoint(d, Integer.class),p2 = new KPoint(d, Integer.class);
        
        Vector k = new Vector(u, Integer.class);
        Space space = new Space(d, Integer.class);
        space.add(v);
        space.add(u);
        space.printUnitaries();
        System.out.println(p1.distance(p2));
    }
}
