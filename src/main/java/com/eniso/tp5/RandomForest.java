
package com.eniso.tp5;

public class RandomForest extends BaseModel {
    private int numTrees;
    private double maxDepth;
    public RandomForest(String name,int version,int numTrees){
        super(name,version);
        this.numTrees = numTrees;
    }
  
 @Override
 public void displayDetails() {
    System.out.println("RandomForest Details:");
    System.out.println("Number of Trees: " + numTrees);
    System.out.println("Maximum Depth: " + maxDepth);
}

@Override
public void train(Dataset dataset) {
    // Implement training logic here
}

@Override
public void predict(Dataset dataset) {
    // Implement prediction logic here
}

    
}
