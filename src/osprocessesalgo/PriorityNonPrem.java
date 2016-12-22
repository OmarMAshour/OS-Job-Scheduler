/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osprocessesalgo;

import static osprocessesalgo.OSProcessesAlgo.addOut;
import static osprocessesalgo.OSProcessesAlgo.frame;
import static osprocessesalgo.OSProcessesAlgo.outIndex;
import static osprocessesalgo.OSProcessesAlgo.processes;

/**
 *
 * @author root
 */
public class PriorityNonPrem extends Algorithm{

    @Override
    public void Start() {

        this.Sort();
        this.setPriorityNonPrem();
        this.SetOutput();
       
    }

    @Override
    protected void Sort() {

        SortArrival(processes);
        SortAllPrioritesOfCertainArrivals(processes);
    }
    
    protected void setPriorityNonPrem(){


        int x=0;
        
        
        while(x<processes.length){
            
        
        if(x==0){
        processes[x].setExitTime(processes[x].getArrivalTime()+processes[x].getBurstTime());
        }else{
        processes[x].setExitTime(processes[x-1].getExitTime()+processes[x].getBurstTime());
        }
        
        
        int n =0;
        for(int i = x+1;i<processes.length;i++){
            if(processes[i].getArrivalTime()<=processes[x].getExitTime()){
                n++;
            }
        }
        if(n!=0){
            Process[] temp = new Process[n];
                
            int m=0;
        for(int i = x+1;i<processes.length;i++){
            
            if(processes[i].getArrivalTime()<=processes[x].getExitTime()){
                temp[m]=processes[i];
                m++;
            }
            
           
            
            }
         this.SortPriority(temp);
            int z=0;
            for(int l=x+1;l<=x+m;l++){
                processes[l]=temp[z];
                z++;
            }
        }
            x++;
        }
        
        for(int i=0;i<processes.length;i++){
            if(i+1<processes.length){
            if(processes[i].getPriority()==processes[i+1].getPriority() && processes[i].getArrivalTime()>processes[i+1].getArrivalTime()){
                Process temp;
                temp = processes[i];
                processes[i]=processes[i+1];
                processes[i+1]=temp;
            }}
        }
        
        
        
        this.setTurnaroundTimes();
        this.setWaitingTimes();
        this.setAvgTurnaroundTime();
        this.setAvgWaitingTime();
        
    }
    
    private void SetOutput(){
        outIndex = 0;
        for(int i =0;i<processes.length;i++){
            frame.addResultRow(processes[i],processes[i].getExitTime()-processes[i].getBurstTime(),processes[i].getExitTime());
        }
    }
}
