/**
 * CompteurImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public class CompteurImplServiceLocator extends org.apache.axis.client.Service implements ws.CompteurImplService {

    public CompteurImplServiceLocator() {
    }


    public CompteurImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CompteurImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CompteurImplPort
    private java.lang.String CompteurImplPort_address = "http://localhost:9999/ws/compteurs";

    public java.lang.String getCompteurImplPortAddress() {
        return CompteurImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CompteurImplPortWSDDServiceName = "CompteurImplPort";

    public java.lang.String getCompteurImplPortWSDDServiceName() {
        return CompteurImplPortWSDDServiceName;
    }

    public void setCompteurImplPortWSDDServiceName(java.lang.String name) {
        CompteurImplPortWSDDServiceName = name;
    }

    public ws.CompteurImpl getCompteurImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CompteurImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCompteurImplPort(endpoint);
    }

    public ws.CompteurImpl getCompteurImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ws.CompteurImplPortBindingStub _stub = new ws.CompteurImplPortBindingStub(portAddress, this);
            _stub.setPortName(getCompteurImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCompteurImplPortEndpointAddress(java.lang.String address) {
        CompteurImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ws.CompteurImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                ws.CompteurImplPortBindingStub _stub = new ws.CompteurImplPortBindingStub(new java.net.URL(CompteurImplPort_address), this);
                _stub.setPortName(getCompteurImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CompteurImplPort".equals(inputPortName)) {
            return getCompteurImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws/", "CompteurImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws/", "CompteurImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CompteurImplPort".equals(portName)) {
            setCompteurImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
