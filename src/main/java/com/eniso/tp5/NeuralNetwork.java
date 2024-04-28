
package com.eniso.tp5;

public class NeuralNetwork extends BaseModel {
    private int[] layers;
    private String  activationFunction;
    public NeuralNetwork(String name,int[] layers,String activationFunction){
        super(name);
        this.layers = layers;
        this.activationFunction = activationFunction;
        
    }

    @Override
    public void displayDetails() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void train(Dataset dataset) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void predict(Dataset dataset) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
