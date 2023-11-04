/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author enriq
 */
@WebService(serviceName = "WSOperaciones")
public class WSOperaciones {
    
   
    @WebMethod(operationName = "Login")
    public Boolean Login(@WebParam(name = "user") String user, @WebParam(name = "password") String password) {
        if(user.equals("Jenny") && password.equals("12345")){
            System.out.println("Sus credenciales son correcta");
            return true;
        }else{
            System.out.println("Sus credenciales son incorrecta por favor verifique");
            return false;
        }
    }

    
    @WebMethod(operationName = "procesarPago")
    public int ProcesarPago(@WebParam(name = "total") int total, @WebParam(name = "pago") int pago) {
        if (pago >= total){
            int saldo;
            saldo = pago - total;
            return saldo;  
        }else{
            return -1;
        }
    }

    /**
     * This is a sample web service operation
     */
    
}
