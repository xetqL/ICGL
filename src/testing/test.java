/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testing;

import DataStructure.Dimension;
import DataStructure.KObject;
import DataStructure.KVector;
import DataStructure.OutOfVectorDimension;
import DataStructure.Vector;
import DataStructure.Vector3D;
import DataStructure.VectorFactory;

/**
 *
 * @author antho
 */
public class test {
    public static void main(String[] args) throws OutOfVectorDimension {
        Vector3D v = (Vector3D) VectorFactory.getVector(Dimension.getThirdDimension(), Double.class),
                u = (Vector3D) VectorFactory.getVector(Dimension.getThirdDimension(), Double.class); 
		Vector3D AB = (Vector3D) VectorFactory.getVector(Dimension.getThirdDimension, Integer.class);
        v.crossProduct(u);
        System.out.println(v);
    }
}
