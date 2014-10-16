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
public class Dimension {
    private final int dim;

    private Dimension(int dim) {
        this.dim = dim;
    }
    
    public static Dimension getFirstDimension(){
        return new Dimension(1);
    }
    
    public static Dimension getDimension(int dim) throws BadDimensionException{
        if(dim >= 1){
            return new Dimension(dim);
        }else throw new BadDimensionException();
    }
    
    @Override
    public String toString() {
        return (dim == 1)? String.valueOf(dim)+"st dimension" :
                           String.valueOf(dim)+"th dimension";
    }
    
    public int value(){
        return dim;
    }
}
