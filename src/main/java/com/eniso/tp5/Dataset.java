
package com.eniso.tp5;
public abstract class  Dataset {
   protected boolean isTrain;
   protected String path;
   public abstract void load();
   public abstract void process();
   public Dataset(boolean isTrain,String path){
       this.isTrain = isTrain;
       this.path = path;
   }
}
