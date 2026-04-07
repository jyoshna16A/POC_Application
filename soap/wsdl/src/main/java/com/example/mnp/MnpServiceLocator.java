/**
 * MnpServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Nov 07, 2023 (07:57:58 UTC) WSDL2Java emitter.
 */

package com.example.mnp;

public class MnpServiceLocator extends org.apache.axis.client.Service implements com.example.mnp.MnpService {

    public MnpServiceLocator() {
    }


    public MnpServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public MnpServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for MnpServicePort
    private java.lang.String MnpServicePort_address = "http://localhost:8080/mnpservice";

    public java.lang.String getMnpServicePortAddress() {
        return MnpServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String MnpServicePortWSDDServiceName = "MnpServicePort";

    public java.lang.String getMnpServicePortWSDDServiceName() {
        return MnpServicePortWSDDServiceName;
    }

    public void setMnpServicePortWSDDServiceName(java.lang.String name) {
        MnpServicePortWSDDServiceName = name;
    }

    public com.example.mnp.MnpServicePortType getMnpServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(MnpServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getMnpServicePort(endpoint);
    }

    public com.example.mnp.MnpServicePortType getMnpServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.example.mnp.MnpServiceBindingStub _stub = new com.example.mnp.MnpServiceBindingStub(portAddress, this);
            _stub.setPortName(getMnpServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setMnpServicePortEndpointAddress(java.lang.String address) {
        MnpServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.example.mnp.MnpServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.example.mnp.MnpServiceBindingStub _stub = new com.example.mnp.MnpServiceBindingStub(new java.net.URL(MnpServicePort_address), this);
                _stub.setPortName(getMnpServicePortWSDDServiceName());
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
        if ("MnpServicePort".equals(inputPortName)) {
            return getMnpServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://example.com/mnp", "MnpService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://example.com/mnp", "MnpServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("MnpServicePort".equals(portName)) {
            setMnpServicePortEndpointAddress(address);
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
