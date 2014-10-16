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
class BadDimensionException extends Exception {

    public BadDimensionException() {
        super("Dimension cannot be inferior or equals to zero");
    }
    
}
