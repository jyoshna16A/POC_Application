/**
 * Mnpservice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Nov 07, 2023 (07:57:58 UTC) WSDL2Java emitter.
 */

package xsd.MNPProtocol;

public interface Mnpservice extends javax.xml.rpc.Service {
    public java.lang.String getmnpservicePortAddress();

    public xsd.MNPProtocol.MnpservicePort getmnpservicePort() throws javax.xml.rpc.ServiceException;

    public xsd.MNPProtocol.MnpservicePort getmnpservicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
