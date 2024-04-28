
package com.eniso.tp5;

public interface MachineLearningModel {
    public void train(Dataset dataset);
    public void predict(Dataset dataset);
}
