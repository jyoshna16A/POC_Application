/**
 * MnpserviceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Nov 07, 2023 (07:57:58 UTC) WSDL2Java emitter.
 */

package xsd.MNPProtocol;

public class MnpserviceLocator extends org.apache.axis.client.Service implements xsd.MNPProtocol.Mnpservice {

    public MnpserviceLocator() {
    }


    public MnpserviceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MnpserviceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for mnpservicePort
    private java.lang.String mnpservicePort_address = "http://mnpserver/services/mnpservice";

    public java.lang.String getmnpservicePortAddress() {
        return mnpservicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String mnpservicePortWSDDServiceName = "mnpservicePort";

    public java.lang.String getmnpservicePortWSDDServiceName() {
        return mnpservicePortWSDDServiceName;
    }

    public void setmnpservicePortWSDDServiceName(java.lang.String name) {
        mnpservicePortWSDDServiceName = name;
    }

    public xsd.MNPProtocol.MnpservicePort getmnpservicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(mnpservicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getmnpservicePort(endpoint);
    }

    public xsd.MNPProtocol.MnpservicePort getmnpservicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            xsd.MNPProtocol.MnpservicePortSoapBindingStub _stub = new xsd.MNPProtocol.MnpservicePortSoapBindingStub(portAddress, this);
            _stub.setPortName(getmnpservicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setmnpservicePortEndpointAddress(java.lang.String address) {
        mnpservicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (xsd.MNPProtocol.MnpservicePort.class.isAssignableFrom(serviceEndpointInterface)) {
                xsd.MNPProtocol.MnpservicePortSoapBindingStub _stub = new xsd.MNPProtocol.MnpservicePortSoapBindingStub(new java.net.URL(mnpservicePort_address), this);
                _stub.setPortName(getmnpservicePortWSDDServiceName());
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
        if ("mnpservicePort".equals(inputPortName)) {
            return getmnpservicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("MNPProtocol.xsd", "mnpservice");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("MNPProtocol.xsd", "mnpservicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("mnpservicePort".equals(portName)) {
            setmnpservicePortEndpointAddress(address);
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
