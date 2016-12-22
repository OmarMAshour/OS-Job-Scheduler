/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osprocessesalgo;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author root
 */
public class OSProcessesAlgo {
    
    private static int getNumberOfArrivals(Process[] array){
        int n =0;
        for(int i=0;i<array.length;i++){
            if(array[i].getArrivalTime()!=array[i+1].getArrivalTime()){
                n++;
            }
        }
        
        return n;
    }
    //FIX HERE
    public static void addOut(Process p,double clock, double from){
        outP[outIndex]=p;
        outP[outIndex++].setTo(clock);
        
    }
    
    
    public static Process[] processes;
    public static Process[] outP;
    public static int outIndex=0;
    public static GUIFrame frame;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
//        System.out.println(getNumberOfArrivals(processes));
//        String lookAndFeel = UIManager.getCrossPlatformLookAndFeelClassName();
//        javax.swing.plaf.
//        System.err.println(lookAndFeel);
         frame =new GUIFrame();
//        UIManager.setLookAndFeel(lookAndFeel);
//        SwingUtilities.updateComponentTreeUI(f);
//        f.pack();
        frame.setVisible(true);
//        String n = UIManager.getSystemLookAndFeelClassName();
//        try {
//            UIManager.setLookAndFeel(n);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(OSProcessesAlgo.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            Logger.getLogger(OSProcessesAlgo.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            Logger.getLogger(OSProcessesAlgo.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (UnsupportedLookAndFeelException ex) {
//            Logger.getLogger(OSProcessesAlgo.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    
}
