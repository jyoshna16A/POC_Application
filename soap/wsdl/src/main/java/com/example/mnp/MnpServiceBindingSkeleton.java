/**
 * MnpServiceBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Nov 07, 2023 (07:57:58 UTC) WSDL2Java emitter.
 */

package com.example.mnp;

public class MnpServiceBindingSkeleton implements com.example.mnp.MnpServicePortType, org.apache.axis.wsdl.Skeleton {
    private com.example.mnp.MnpServicePortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://example.com/mnp", "getMnpServiceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://example.com/mnp", ">getMnpServiceRequest"), com.example.mnp.GetMnpServiceRequest.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getMnpService", _params, new javax.xml.namespace.QName("http://example.com/mnp", "getMnpServiceResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://example.com/mnp", ">getMnpServiceResponse"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "getMnpService"));
        _oper.setSoapAction("http://example.com/mnp/getMnpService");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getMnpService") == null) {
            _myOperations.put("getMnpService", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getMnpService")).add(_oper);
    }

    public MnpServiceBindingSkeleton() {
        this.impl = new com.example.mnp.MnpServiceBindingImpl();
    }

    public MnpServiceBindingSkeleton(com.example.mnp.MnpServicePortType impl) {
        this.impl = impl;
    }
    public com.example.mnp.GetMnpServiceResponse getMnpService(com.example.mnp.GetMnpServiceRequest parameters) throws java.rmi.RemoteException
    {
        com.example.mnp.GetMnpServiceResponse ret = impl.getMnpService(parameters);
        return ret;
    }

}
