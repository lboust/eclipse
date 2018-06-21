/**
 * CompteurImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

import javax.jws.WebService;

@WebService
public interface CompteurImpl extends java.rmi.Remote {
    public void ecrire(java.lang.String arg0, java.lang.Integer arg1) throws java.rmi.RemoteException;
    public java.lang.Integer lire(java.lang.String arg0) throws java.rmi.RemoteException;
}
