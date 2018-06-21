package ws;

public class CompteurImplProxy implements ws.CompteurImpl {
  private String _endpoint = null;
  private ws.CompteurImpl compteurImpl = null;
  
  public CompteurImplProxy() {
    _initCompteurImplProxy();
  }
  
  public CompteurImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initCompteurImplProxy();
  }
  
  private void _initCompteurImplProxy() {
    try {
      compteurImpl = (new ws.CompteurImplServiceLocator()).getCompteurImplPort();
      if (compteurImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)compteurImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)compteurImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (compteurImpl != null)
      ((javax.xml.rpc.Stub)compteurImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ws.CompteurImpl getCompteurImpl() {
    if (compteurImpl == null)
      _initCompteurImplProxy();
    return compteurImpl;
  }
  
  public void ecrire(java.lang.String arg0, java.lang.Integer arg1) throws java.rmi.RemoteException{
    if (compteurImpl == null)
      _initCompteurImplProxy();
    compteurImpl.ecrire(arg0, arg1);
  }
  
  public java.lang.Integer lire(java.lang.String arg0) throws java.rmi.RemoteException{
    if (compteurImpl == null)
      _initCompteurImplProxy();
    return compteurImpl.lire(arg0);
  }
  
  
}