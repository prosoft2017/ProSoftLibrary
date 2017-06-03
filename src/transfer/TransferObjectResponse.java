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
public class TransferObjectResponse implements Serializable {

    private Object result;
    private int messsage;
    private Exception responseException;

    public Object getResult() {
        return result;
    }

    public TransferObjectResponse setResult(Object result) {
        this.result = result;

        return this;
    }

    public int getMesssage() {
        return messsage;
    }

    public TransferObjectResponse setMesssage(int messsage) {
        this.messsage = messsage;

        return this;
    }

    public Exception getResponseException() {
        return responseException;
    }

    public TransferObjectResponse setResponseException(Exception responseException) {
        this.responseException = responseException;

        return this;
    }
}
