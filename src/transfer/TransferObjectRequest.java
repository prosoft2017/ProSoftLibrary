/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transfer;

import java.io.Serializable;

/**
 *
 * @author student1
 */
public class TransferObjectRequest implements Serializable {

    private int operation;
    private Object parameter;

    public int getOperation() {
        return operation;
    }

    public TransferObjectRequest setOperation(int operation) {
        this.operation = operation;

        return this;
    }

    public Object getParameter() {
        return parameter;
    }

    public TransferObjectRequest setParameter(Object parameter) {
        this.parameter = parameter;

        return this;
    }

}
