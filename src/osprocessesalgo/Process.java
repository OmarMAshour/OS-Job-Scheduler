/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osprocessesalgo;

import java.awt.Color;
import java.util.Random;



/**
 *
 * @author root
 */
public class Process {
    
    //Initialize the process
    private String name;
    private double arrivalTime;
    private double burstTime;
    private double priority;
    private double quantum;
    
    //Encapsulate the waiting and turnarround time
    private double waitingTime;
    private double turnaroundTime;
    
    private Random rand = new Random();
    private Color color;
    
    //TO BE SET
    private double passedTime;
    private double exitTime;
    private boolean isFinished;
    private double remainingTime;
    private double startTime;
    private double to=0.0;
    private double from =0.0;
    ///////////////////////

   

   
    
    
    
    //constructor
    public Process(String name, double arrivalTime, double burstTime, double priority, double quantum) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.priority = priority;
        this.quantum = quantum;
        this.exitTime = 0.0; //Dummy value at the start
        this.passedTime =0.0;
        this.remainingTime = burstTime;
        this.isFinished=false;
        this.waitingTime = 0.0;
        this.turnaroundTime = 0.0;
        color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    }
    
//    public Process(String name, double arrivalTime,double startTime, double burstTime, double priority, double quantum) {
//        this( name,  arrivalTime,  burstTime,  priority,  quantum);
//        
//        this.startTime =startTime;
//    }

    public double getArrivalTime() {
        return arrivalTime;
    }

    public double getBurstTime() {
        return burstTime;
    }

    public double getTurnaroundTime() {
        return turnaroundTime;
    }

    public double getWaitingTime() {
        return waitingTime;
    }

    public double getPriority() {
        return priority;
    }

    public String getName() {
        return name;
    }

    public double getExitTime() {
        return exitTime;
    }

    public double getPassedTime() {
        return passedTime;
    }

    public double getQuantum() {
        return quantum;
    }
    
    public boolean getIsFinished(){
        return isFinished;
    }

    public double getRemainingTime() {
        return remainingTime;
    }

    public Color getColor() {
        return color;
    }

    public double getStartTime() {
        return startTime;
    }

    public double getTo() {
        return to;
    }

    public double getFrom() {
        return from;
    }
    
    
    
    
    
    public void setArrivalTime(double arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setBurstTime(double burstTime) {
        this.burstTime = burstTime;
    }

    public void setTurnaroundTime(double turnaroundTime) {
        this.turnaroundTime = turnaroundTime;
    }

    public void setWaitingTime(double waitingTime) {
        this.waitingTime = waitingTime;
    }

    public void setPriority(double priority) {
        this.priority = priority;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExitTime(double exitTime) {
        this.exitTime = exitTime;
    }

    public void setPassedTime(double passedTime) {
        this.passedTime = passedTime;
    }

    public void setQuantum(double quantum) {
        this.quantum = quantum;
    }
    
    public void setIsFinished(boolean n){
        isFinished=n;
    }

    public void setRemainingTime(double remainingTime) {
        this.remainingTime = remainingTime;
    }

    public void setColor(Color c) {
        this.color = c;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public void setFrom(double from) {
        this.from = from;
    }
    
        
    
    
    
}
