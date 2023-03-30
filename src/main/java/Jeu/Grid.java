package Jeu;

import java.util.ArrayList;

public class Grid {

    // Attribs
    private int length;
    private ArrayList<ArrayList<>> grid = new ArrayList<> (length);

    /**
     * Constructor of a 2D grid
     * @param length Length of the grid (square)
     */
    public Grid(int length){
        this.length = length;
        for(int i = 0; i < length; i++){
            grid.add(new ArrayList<>());
        }
    }
}
