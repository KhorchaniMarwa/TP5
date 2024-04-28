
package com.eniso.tp5;

public class RegressionDataset extends Dataset {
   private int numFeatures;
   private double[] targets;
    public RegressionDataset(String path,boolean isTrain){
       super(isTrain,path);
    }
   public  void load(){
        System.out.println("chargement de données effectués");
        
    }
   public  void process(){
       System.out.println("traitement de données effectuées");
   }
public String predict(Dataset dataset) {
    return "predict done";
}
}
