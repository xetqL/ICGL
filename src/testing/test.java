/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testing;

import DataStructure.BadDimensionException;
import DataStructure.BinaryTree;
import DataStructure.Graph;
import DataStructure.Graph.Node;


/**
 *
 * @author antho
 */
public class test {
    
    public static void main(String[] args) throws BadDimensionException{
        BinaryTree btree = new BinaryTree(10.0);
        Graph g = new Graph(false);
        System.out.println( g.add(new Node("B")) );
        System.out.println( g.add(new Node("A")) );
        System.out.println( g.add(new Node("C")) );
        System.out.println( g.find("A") );
        System.out.println( g.attach("A", "B") );
        g.attach("A", "C");
        g.attach("B", "B");
        g.attach("B", "B");
        btree.add(5.0);
        btree.add(12.0);
        btree.add(11.0);
        btree.add(13.0);
        System.out.println(g);
        
    }
}
