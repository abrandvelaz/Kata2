/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.Map;

/**
 *
 * @author Alber
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Histogram hist = new Histogram(4,3,8,1,3,1,1,2,5,4,8,5,4,2,3,1,3,2,6,7,8);
        HistogramDisplay display = new HistogramDisplay(hist);
        display.execute();
        // TODO code application logic here
    }
    
}
