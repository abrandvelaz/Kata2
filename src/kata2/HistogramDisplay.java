/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

/**
 *
 * @author Alber
 */
public class HistogramDisplay {
    private final Histogram hist;
    
    public HistogramDisplay(Histogram hist){
        this.hist = hist;
    }
    
    void execute(){
        for (int value : hist.getValues()) {
            System.out.println(value + "==>" + hist.getCount(value));
        }
    }
}
