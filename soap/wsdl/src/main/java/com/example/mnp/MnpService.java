/**
 * MnpService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Nov 07, 2023 (07:57:58 UTC) WSDL2Java emitter.
 */

package com.example.mnp;

public interface MnpService extends javax.xml.rpc.Service {
    public java.lang.String getMnpServicePortAddress();

    public com.example.mnp.MnpServicePortType getMnpServicePort() throws javax.xml.rpc.ServiceException;

    public com.example.mnp.MnpServicePortType getMnpServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
