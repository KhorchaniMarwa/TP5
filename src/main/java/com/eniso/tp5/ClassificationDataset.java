
package com.eniso.tp5;

public class ClassificationDataset extends Dataset {
    private String[] labels;
    private int numClass;
    public ClassificationDataset(String path,boolean isTrain){
        super(isTrain,path);
       
    }

    @Override
    public void load() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void process() {
        System.out.println("process done");
    }
 
public String predict(Dataset dataset) {
    return "predict done";
}
   
    
}
