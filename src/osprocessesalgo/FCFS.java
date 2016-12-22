/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osprocessesalgo;

import static osprocessesalgo.OSProcessesAlgo.*;
/**
 *
 * @author root
 */
public class FCFS extends Algorithm{
    
//    private double avgWaitingTime;
//    private double avgTurnaroundTime;
//    private double totalTime;
    
    public void Start(){
        this.Sort();
        this.setExitsTime();
        this.setTurnaroundTimes();
        this.setWaitingTimes();
        this.setAvgTurnaroundTime();
        this.setAvgWaitingTime();
        this.SetOutput();
//        for(int k =0 ;k<processes.length;k++){
//            System.out.println(processes[k].getArrivalTime() +"\t"+ processes[k].getBurstTime()+"\t"+processes[k].getExitTime());
//        }
    }
    
    protected void Sort(){
        
        SortArrival(processes);
       // SortAllBurstsOfCertainArrivals(processes);
        
        
    }
    
    private void SetOutput(){
        outIndex = 0;
        for(int i =0;i<processes.length;i++){
            frame.addResultRow(processes[i],processes[i].getExitTime()-processes[i].getBurstTime(),processes[i].getExitTime());
        }
    }
   
}
