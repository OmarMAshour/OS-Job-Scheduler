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
public class RR extends Algorithm {
   private int noOfProcesses = processes.length;
   private double clock ;
    @Override
    public void Start() {
        this.Sort();
        this.setRR();
    }

    @Override
    protected void Sort() {
        this.SortArrival(processes);
       // this.SortAllBurstsOfCertainArrivals(processes);
    }
    
    private void setRR(){

        clock = 0.0;
        
        outIndex=0;
        int x = 0;
        int i = 0;
        while(!isAllFinished()){
            
            if(processes[x].getArrivalTime() <= clock && processes[x].getArrivalTime() >= 0.0 && !processes[x].getIsFinished()){
                
                if((processes[x].getRemainingTime()-processes[x].getQuantum())>=0.0 && (processes[x].getPassedTime()+processes[x].getQuantum())<=processes[x].getBurstTime()){
                
                processes[x].setRemainingTime(processes[x].getRemainingTime()-processes[x].getQuantum());
                processes[x].setPassedTime(processes[x].getPassedTime()+processes[x].getQuantum());
                
                clock += processes[x].getQuantum();
                   // addOut(processes[x], clock, clock-processes[x].getQuantum());
                
                   if(processes[x].getRemainingTime() <= 0.0 && processes[x].getPassedTime() >= processes[x].getBurstTime()){
                    processes[x].setIsFinished(true);
                    processes[x].setExitTime(clock);
                    processes[x].setTurnaroundTime(processes[x].getExitTime()-processes[x].getArrivalTime());
                    processes[x].setWaitingTime(processes[x].getTurnaroundTime()-processes[x].getBurstTime());
                }
                   frame.addResultRow(processes[x], clock-processes[x].getQuantum(), clock);
                }
                
                if((processes[x].getRemainingTime()-processes[x].getQuantum())<0.0 && (processes[x].getPassedTime()+processes[x].getQuantum())>processes[x].getBurstTime()){
                    double k;
                    
                    for(k=0.0;;k++){
                        if((processes[x].getRemainingTime()-k)== 0.0 && (processes[x].getPassedTime()+k)==processes[x].getBurstTime()){
                        break;
                    }
                    }
                     processes[x].setRemainingTime(processes[x].getRemainingTime()-k);
                processes[x].setPassedTime(processes[x].getPassedTime()+k);
                
                clock += k;
                if(processes[x].getRemainingTime() <= 0.0 && processes[x].getPassedTime() >= processes[x].getBurstTime()){
                    processes[x].setIsFinished(true);
                    processes[x].setExitTime(clock);
                    processes[x].setTurnaroundTime(processes[x].getExitTime()-processes[x].getArrivalTime());
                    processes[x].setWaitingTime(processes[x].getTurnaroundTime()-processes[x].getBurstTime());
                }
                frame.addResultRow(processes[x], clock- k, clock);

                    
                }
                
                if(processes[x].getRemainingTime() <= 0.0 && processes[x].getPassedTime() >= processes[x].getBurstTime()){
                    
                    processes[x].setIsFinished(true);
                    processes[x].setExitTime(clock);
                    
                }
                i = 0;

            }else{
                i++;
                
                if(i == processes.length){
                    clock += 1.0;
                }
            }
            
            x = (x+1) % processes.length;
        }

		this.setTurnaroundTimes();
                this.setWaitingTimes();
                this.setAvgTurnaroundTime();
                this.setAvgWaitingTime();
    }
    
    private void setExitsRR(){
        for(int i=0;i<processes.length;i++){
            processes[i].setExitTime(processes[i].getTurnaroundTime()+processes[i].getArrivalTime());
        }
    }
    
}
