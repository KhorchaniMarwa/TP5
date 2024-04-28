
package com.eniso.tp5;

public class SupportVectorMachine extends BaseModel {
    private int iterations;
    private double learningRate;
    public SupportVectorMachine(String name, int version,double learn){
        super(name,version);
        this.learningRate = learn;
    }
   
    public void displayDetails() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void train(Dataset dataset) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void predict(Dataset dataset) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
