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
    public static Dimension x = getFirstDimension(),y=getSecondDimension(),z=getThirdDimension();
    private Dimension(int dim) {
        this.dim = dim;
    }
    
    public static Dimension getFirstDimension(){
        return new Dimension(1);
    }
    
    public static Dimension getThirdDimension(){
        return new Dimension(3);
    }
    
    public static Dimension getSecondDimension(){
        return new Dimension(2);
    }
    
    public static Dimension getDimension(int dim) throws BadDimensionException{
        if(dim >= 1){
            return new Dimension(dim);
        }else throw new BadDimensionException();
    }
    
    @Override
    public String toString() {
        switch(dim){
            case 1:
                return dim+ "st dimension";
            case 2:
                return dim+ "nd dimension";
            case 3:
                return dim+ "rd dimension";
            default:
                return dim+ "th dimension";
        }
    }
    
    public int value(){
        return dim-1;
    }
}
