/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osprocessesalgo;

import static osprocessesalgo.OSProcessesAlgo.processes;

/**
 *
 * @author root
 */
public abstract class Algorithm {
    
    protected double avgWaitingTime;
    protected double avgTurnaroundTime;
    protected double totalTime;
    
    
    public abstract void Start();
    protected abstract void Sort();//{
//        
//        SortArrival(processes);
//        SortAllBurstsOfCertainArrivals(processes);
//        
//        for(int k =0 ;k<processes.length;k++){
//            System.out.println(processes[k].getArrivalTime() +"   "+ processes[k].getBurstTime());
//        }
//    }
    
    protected void SortAllPrioritesOfCertainArrivals(Process[] processes){
        for(int m=0;m<processes.length;m++){
            
            if( m<=processes.length-2 && processes[m].getArrivalTime() == processes[m+1].getArrivalTime()){
                SortPrioritiesOfCertainArrival(processes[m].getArrivalTime());
            }
            
        }
    }
    
    protected void SortPrioritiesOfCertainArrival(double target){
        
        int noOfTargets = 0;
        
        for(int i=0;i<processes.length;i++){
            
            if(processes[i].getArrivalTime() == target){
                
                noOfTargets++;
                
            }
            
        }
        Process[] temp = new Process[noOfTargets];
        int z = 0;
        
        for(int i=0;i<processes.length;i++){
            
            if(processes[i].getArrivalTime()== target){
                
                temp[z]=processes[i];
                z++;
            }
            
        }
        
        SortPriority(temp);
        
        int x=0;
        for(int i =0 ;i<processes.length;i++){
            if (processes[i].getArrivalTime()==target){
                processes[i]=temp[x];
                x++;
            }
        }
    }
     
    protected void SortPriority(Process[] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(array[j].getPriority()>= array[i].getPriority()){
                    Process Temp = array[i];
                    array[i] = array[j];
                    array[j] = Temp;
                }
            }
        }
    }   
    
    protected void SortAllBurstsOfCertainArrivals(Process[] processes){
        for(int m=0;m<processes.length;m++){
            
            if( m<=processes.length-2 && processes[m].getArrivalTime() == processes[m+1].getArrivalTime()){
                SortBurstOfCertainArrival(processes[m].getArrivalTime());
            }
            
        }
    }
    
    protected void SortBurstOfCertainArrival(double target){
        
        int noOfTargets = 0;
        
        for(int i=0;i<processes.length;i++){
            
            if(processes[i].getArrivalTime() == target){
                
                noOfTargets++;
                
            }
            
        }
        
        Process[] temp = new Process[noOfTargets];
        int z = 0;
        
        for(int i=0;i<processes.length;i++){
            
            if(processes[i].getArrivalTime()== target){
                
                temp[z]=processes[i];
                z++;
            }
            
        }
        
        SortBurst(temp);
        
        int x=0;
        for(int i =0 ;i<processes.length;i++){
            if (processes[i].getArrivalTime()==target){
                processes[i]=temp[x];
                x++;
            }
        }
    }
    
    protected void SortAllRemainingTimesOfCertainPriorities(Process[] processes){
        for(int m=0;m<processes.length;m++){
            
            if( m<=processes.length-2 && processes[m].getPriority()== processes[m+1].getPriority()){
                SortRemainingTimeOfCertainPriority(processes[m].getPriority());
            }
            
        }
    }
    
    protected void SortRemainingTimeOfCertainPriority(double target){
        
        int noOfTargets = 0;
        
        for(int i=0;i<processes.length;i++){
            
            if(processes[i].getPriority() == target){
                
                noOfTargets++;
                
            }
            
        }
        
        Process[] temp = new Process[noOfTargets];
        int z = 0;
        
        for(int i=0;i<processes.length;i++){
            
            if(processes[i].getPriority() == target){
                
                temp[z]=processes[i];
                z++;
            }
            
        }
        
        SortRemainingTime(temp);
        
        int x=0;
        for(int i =0 ;i<processes.length;i++){
            if (processes[i].getPriority()==target){
                processes[i]=temp[x];
                x++;
            }
        }
    }
    
    protected void SortBurst(Process[] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(array[j].getBurstTime() > array[i].getBurstTime()){
                    Process Temp = array[i];
                    array[i] = array[j];
                    array[j] = Temp;
                }
            }
        }
    } 
    
    protected void SortBurstNonPrem(Process[] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(array[j].getBurstTime() >= array[i].getBurstTime()){
                    Process Temp = array[i];
                    array[i] = array[j];
                    array[j] = Temp;
                }
            }
        }
    }
     protected void SortRemainingTime(Process[] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if(array[j].getRemainingTime() >= array[i].getRemainingTime()){
                    Process Temp = array[i];
                    array[i] = array[j];
                    array[j] = Temp;
                }
            }
        }
    }
    
    
    protected void SortArrival(Process[] processes){
         for(int i=0;i<processes.length;i++){
            for(int j=0;j<processes.length;j++){
                if(processes[j].getArrivalTime() > processes[i].getArrivalTime()){
                    Process Temp = processes[i];
                    processes[i] = processes[j];
                    processes[j] = Temp;
                }
            }
        }
    }
    
    protected void setExitsTime(){
        
        totalTime = 0.0;
        
        for(int i =0 ;i<processes.length;i++){
//            totalTime+=processes[i].getBurstTime();
            
            //In case of the first entered process
            if(i==0){
                processes[i].setExitTime(processes[i].getArrivalTime()+processes[i].getBurstTime());
            }
            
            if(i!=0 ){
                if(processes[i].getArrivalTime() >= processes[i-1].getExitTime()){
                processes[i].setExitTime(processes[i].getArrivalTime()+processes[i].getBurstTime());
                }
            }
            
            //In case that arrival of a process came during the execution of another one
            if(i!=0 ){
                if(processes[i].getArrivalTime() < processes[i-1].getExitTime() || processes[i].getArrivalTime() == processes[i-1].getArrivalTime()){
                processes[i].setExitTime(processes[i-1].getExitTime()+processes[i].getBurstTime());
                }
            }
            
            // In case no several proccesses at the same arrival time
//            if(processes[i].getArrivalTime() != processes[i+1].getArrivalTime() && processes[i].getArrivalTime() != processes[i-1].getArrivalTime() && i>0){
//                
//            }
        }
    }
    
    
    protected void setTurnaroundTimes(){
        for(int i=0;i<processes.length;i++){
            processes[i].setTurnaroundTime(processes[i].getExitTime()-processes[i].getArrivalTime());
        }
    }
    
    protected void setWaitingTimes(){
        
        for(int i=0;i<processes.length;i++){
        
            processes[i].setWaitingTime(processes[i].getTurnaroundTime()-(processes[i].getBurstTime()));
    
        }
    }

    public double getAvgTurnaroundTime() {
        return avgTurnaroundTime;
    }

    public double getAvgWaitingTime() {
        return avgWaitingTime;
    }

    
    protected void setAvgTurnaroundTime() {
        avgTurnaroundTime=0.0;
        for(int i=0;i<processes.length;i++){
            avgTurnaroundTime+=processes[i].getTurnaroundTime();
        }
        avgTurnaroundTime /= processes.length;
    }

    protected void setAvgWaitingTime() {
        avgWaitingTime=0.0;
        
        for(int i=0;i<processes.length;i++){
            avgWaitingTime+=processes[i].getWaitingTime();
        }
        avgWaitingTime /= processes.length;
    }

    public double getTotalTime() {
        return totalTime;
    }
    
    
    
    protected boolean checkArrivalCollision(Process p){
        
        for(int i =0 ;i<processes.length;i++){
            if(p.getArrivalTime() < processes[i].getExitTime()){
                return true;
            }
        }
        
        return false;
    }
    
    protected boolean isAllFinished(){
        for(int i=0;i<processes.length;i++){
            if(!processes[i].getIsFinished()){
                return false;
            }
        }
        return true;
    }
}
