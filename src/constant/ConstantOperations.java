/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constant;

/**
 *
 * @author Filip
 */
public interface ConstantOperations {

//  -----------     Operation status messages      ---------------- 
    public final static int SUCCESS_MSG = 1;
    public final static int ERROR_MSG = 2;
    public final static int CLIENT_DISCONECTED = 1000;

//  -----------     User operations     ----------------
    public final static int VALIDATED_USER = 10;
    public final static int UPDATE_LOGED_USER = 11;
    public final static int GET_ALL_ACTIVE_USERES = 12;

//  -----------     Tasks operations     ----------------   
    public final static int GET_ALL_TASKS_FOR_USER = 20;

//  -----------    AppUSER operations     ----------------  
    public final static int GET_ALL_USERS_FRONTEND = 50;
    public final static int GET_ALL_COUNTRIES_FRONTEND = 51;
    public final static int REPORT_ISSUE = 52;
    public final static int SEND_PRIVATE_MESSAGE = 53;
    public final static int GET_ALL_MESSAGES = 54;
}
