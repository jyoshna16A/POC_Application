package xsd.MNPProtocol;

public class MnpservicePortProxy implements xsd.MNPProtocol.MnpservicePort {
  private String _endpoint = null;
  private xsd.MNPProtocol.MnpservicePort mnpservicePort = null;
  
  public MnpservicePortProxy() {
    _initMnpservicePortProxy();
  }
  
  public MnpservicePortProxy(String endpoint) {
    _endpoint = endpoint;
    _initMnpservicePortProxy();
  }
  
  private void _initMnpservicePortProxy() {
    try {
      mnpservicePort = (new xsd.MNPProtocol.MnpserviceLocator()).getmnpservicePort();
      if (mnpservicePort != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)mnpservicePort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)mnpservicePort)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (mnpservicePort != null)
      ((javax.xml.rpc.Stub)mnpservicePort)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public xsd.MNPProtocol.MnpservicePort getMnpservicePort() {
    if (mnpservicePort == null)
      _initMnpservicePortProxy();
    return mnpservicePort;
  }
  
  public void send(xsd.MNPProtocol.MNPFrame param) throws java.rmi.RemoteException{
    if (mnpservicePort == null)
      _initMnpservicePortProxy();
    mnpservicePort.send(param);
  }
  
  
}