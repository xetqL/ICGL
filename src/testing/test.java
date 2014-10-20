/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testing;

import DataStructure.Dimension;

import DataStructure.Vector3D;
import DataStructure.VectorFactory;

/**
 *
 * @author antho
 */
public class test {
    public static void main(String[] args){
        Vector3D v = (Vector3D) VectorFactory.getVector(Dimension.getThirdDimension(),  Integer.class),
                 u = (Vector3D) VectorFactory.getVector(Dimension.getThirdDimension(),  Integer.class); 
	Vector3D AB = (Vector3D) VectorFactory.getVector(Dimension.getThirdDimension(), Integer.class);
        v.crossProduct(u);
        System.out.println(u);
    }
}
