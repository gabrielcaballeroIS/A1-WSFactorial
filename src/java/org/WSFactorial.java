/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Usuario
 */
@WebService(serviceName = "WSFactorial")
public class WSFactorial {

    /**
     * Web service operation
     * @param number
     * @return 
     */
    @WebMethod(operationName = "factorial")
    public int factorial(@WebParam(name = "number") int number) {
        int result = 1;
        for (int i = number; i > 0; i--) {
            result *= i;
        }
        return result;
    }

}
