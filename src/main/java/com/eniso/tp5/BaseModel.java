
package com.eniso.tp5;

public abstract class BaseModel implements  MachineLearningModel  {
    protected String name;
    private int version;
    private String description;
    private String device = "cpu";
    public BaseModel(String name,int version , String description,String device){
        this.name = name;
        this.version = version;
        this.description = description;
          
    }
    public BaseModel(String name){
        this.name = name;
      
          
    }
    
    public BaseModel(String name,int version){
        this.name = name;
        this.version = version;
          
    }
    
    
   public abstract void  displayDetails();
       
   
}
