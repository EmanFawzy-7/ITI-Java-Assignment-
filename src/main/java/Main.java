/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eman
 */
import java.util.List;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
	List <Pyramid> pyramids;
		
	pyramids = PyramidCSVDAO.readPyramidCSV("pyramids.csv");
		
	for(Pyramid p : pyramids)
            System.out.println(p.toString());;
	}

}

    
    

