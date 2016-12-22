/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osprocessesalgo;

import static osprocessesalgo.OSProcessesAlgo.*;
import javax.swing.Timer;

/**
 *
 * @author root
 */
public class SJFPrem extends Algorithm{
    
    private Timer clockTimer;
    private double clock;

    @Override
    public void Start() {
        this.Sort();
        this.setSJFPrem();
    }

    @Override
    protected void Sort() {
        this.SortArrival(processes);
        this.SortAllBurstsOfCertainArrivals(processes);
    }
    
    protected void setSJFPrem(){
        
        outIndex = 0;


        clock = 0.0;
        
        while(!this.isAllFinished()){
                                System.out.println("da5al fi awl loop");

                
            
             int n=0;
            for(int i=0;i<processes.length;i++){
                if(processes[i].getArrivalTime()<=clock)
                    n++;
            }
            System.out.println("abl el n check");
              if(n!=0){
                Process[] temp = new Process[n];
                    int m=0;
        for(int p = 0;p<processes.length;p++){
            
            if(processes[p].getArrivalTime()<=clock){
                temp[m]=processes[p];
                m++;
            }
            
         }  
        this.SortRemainingTime(temp);
        
                            

          int z=0;
            for(int l=0;l<temp.length;l++){
                processes[l]=temp[z];
                z++;
            }
            
            for(int i=0;i<processes.length;i++){
                if(i+1<processes.length){
                if(processes[i].getRemainingTime()==processes[i+1].getRemainingTime() && processes[i].getArrivalTime()>processes[i+1].getArrivalTime()){
                    Process temp1;
                    temp1 = processes[i];
                    processes[i]=processes[i+1];
                    processes[i+1]=temp1;
            }}
        }
            int x=0;
            
            while(true){
                    System.out.println("da5al");
                
                if(processes[x].getRemainingTime()>0.0){
                    System.out.println("da5al");
                   
                    processes[x].setPassedTime(processes[x].getPassedTime()+1.0);
                    processes[x].setRemainingTime(processes[x].getRemainingTime()-1.0);
                    addOut(processes[x], clock+1, clock);
//                    addOut(new Process(processes, totalTime, totalTime, clock, totalTime));
                    
                    if(processes[x].getRemainingTime()<=0.0 && processes[x].getPassedTime()>=processes[x].getBurstTime() && !processes[x].getIsFinished() ){
                    System.out.println("da5al");
                processes[x].setExitTime(clock+1);
                processes[x].setIsFinished(true);
                    }
                    
                    frame.addResultRow(processes[x], clock, clock+1);
                    break;
                }else{
                    x++;
                }
                
            }
            
        }
        
        
        
                   clock++;

        
        
    }
        this.setTurnaroundTimes();
        this.setWaitingTimes();
        this.setAvgTurnaroundTime();
        this.setAvgWaitingTime(); 
    
    }
    
    
    private void setTotalTime(){
        this.totalTime = 0.0;
        for(int i=0;i<processes.length;i++){
            this.totalTime+=processes[i].getBurstTime();
        }
        
        for(int i=0;i<processes.length;i++){
            if(i+1>=processes.length){
                if(processes[i+1].getArrivalTime()-processes[i].getArrivalTime()>0.0){
//                    this.settotalTime();
                }
            }
        }
    }
    
    
    private Process getSRProcess(){
        
        Process min =  processes[0];
        for(int i =0; i<processes.length;i++){
            if(processes[i].getRemainingTime()<min.getRemainingTime() && processes[i].getArrivalTime()<=clock){
                min = processes[i];
            }
        }
        
        
        
        return min;
    }
}
