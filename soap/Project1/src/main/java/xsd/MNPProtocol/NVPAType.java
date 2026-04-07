/**
 * NVPAType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Nov 07, 2023 (07:57:58 UTC) WSDL2Java emitter.
 */

package xsd.MNPProtocol;

public class NVPAType  implements java.io.Serializable {
    private java.lang.String messageSenderTelco;

    private java.lang.String messageReceiverTelco;

    private java.lang.String requestId;

    private java.util.Calendar timestamp;

    private java.lang.String referenceId;

    private java.lang.String subscriberNumber;

    private java.lang.String corporate;

    private java.lang.String contractualObligation;

    private java.lang.String activateAging;

    private java.lang.String ownershipChange;

    private java.lang.String outstandingBill;

    private java.lang.String underSubJudice;

    private java.lang.String portingProhibited;

    private java.lang.String simSwap;

    private java.lang.String version;  // attribute

    public NVPAType() {
    }

    public NVPAType(
           java.lang.String messageSenderTelco,
           java.lang.String messageReceiverTelco,
           java.lang.String requestId,
           java.util.Calendar timestamp,
           java.lang.String referenceId,
           java.lang.String subscriberNumber,
           java.lang.String corporate,
           java.lang.String contractualObligation,
           java.lang.String activateAging,
           java.lang.String ownershipChange,
           java.lang.String outstandingBill,
           java.lang.String underSubJudice,
           java.lang.String portingProhibited,
           java.lang.String simSwap,
           java.lang.String version) {
           this.messageSenderTelco = messageSenderTelco;
           this.messageReceiverTelco = messageReceiverTelco;
           this.requestId = requestId;
           this.timestamp = timestamp;
           this.referenceId = referenceId;
           this.subscriberNumber = subscriberNumber;
           this.corporate = corporate;
           this.contractualObligation = contractualObligation;
           this.activateAging = activateAging;
           this.ownershipChange = ownershipChange;
           this.outstandingBill = outstandingBill;
           this.underSubJudice = underSubJudice;
           this.portingProhibited = portingProhibited;
           this.simSwap = simSwap;
           this.version = version;
    }


    /**
     * Gets the messageSenderTelco value for this NVPAType.
     * 
     * @return messageSenderTelco
     */
    public java.lang.String getMessageSenderTelco() {
        return messageSenderTelco;
    }


    /**
     * Sets the messageSenderTelco value for this NVPAType.
     * 
     * @param messageSenderTelco
     */
    public void setMessageSenderTelco(java.lang.String messageSenderTelco) {
        this.messageSenderTelco = messageSenderTelco;
    }


    /**
     * Gets the messageReceiverTelco value for this NVPAType.
     * 
     * @return messageReceiverTelco
     */
    public java.lang.String getMessageReceiverTelco() {
        return messageReceiverTelco;
    }


    /**
     * Sets the messageReceiverTelco value for this NVPAType.
     * 
     * @param messageReceiverTelco
     */
    public void setMessageReceiverTelco(java.lang.String messageReceiverTelco) {
        this.messageReceiverTelco = messageReceiverTelco;
    }


    /**
     * Gets the requestId value for this NVPAType.
     * 
     * @return requestId
     */
    public java.lang.String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this NVPAType.
     * 
     * @param requestId
     */
    public void setRequestId(java.lang.String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the timestamp value for this NVPAType.
     * 
     * @return timestamp
     */
    public java.util.Calendar getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this NVPAType.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.util.Calendar timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the referenceId value for this NVPAType.
     * 
     * @return referenceId
     */
    public java.lang.String getReferenceId() {
        return referenceId;
    }


    /**
     * Sets the referenceId value for this NVPAType.
     * 
     * @param referenceId
     */
    public void setReferenceId(java.lang.String referenceId) {
        this.referenceId = referenceId;
    }


    /**
     * Gets the subscriberNumber value for this NVPAType.
     * 
     * @return subscriberNumber
     */
    public java.lang.String getSubscriberNumber() {
        return subscriberNumber;
    }


    /**
     * Sets the subscriberNumber value for this NVPAType.
     * 
     * @param subscriberNumber
     */
    public void setSubscriberNumber(java.lang.String subscriberNumber) {
        this.subscriberNumber = subscriberNumber;
    }


    /**
     * Gets the corporate value for this NVPAType.
     * 
     * @return corporate
     */
    public java.lang.String getCorporate() {
        return corporate;
    }


    /**
     * Sets the corporate value for this NVPAType.
     * 
     * @param corporate
     */
    public void setCorporate(java.lang.String corporate) {
        this.corporate = corporate;
    }


    /**
     * Gets the contractualObligation value for this NVPAType.
     * 
     * @return contractualObligation
     */
    public java.lang.String getContractualObligation() {
        return contractualObligation;
    }


    /**
     * Sets the contractualObligation value for this NVPAType.
     * 
     * @param contractualObligation
     */
    public void setContractualObligation(java.lang.String contractualObligation) {
        this.contractualObligation = contractualObligation;
    }


    /**
     * Gets the activateAging value for this NVPAType.
     * 
     * @return activateAging
     */
    public java.lang.String getActivateAging() {
        return activateAging;
    }


    /**
     * Sets the activateAging value for this NVPAType.
     * 
     * @param activateAging
     */
    public void setActivateAging(java.lang.String activateAging) {
        this.activateAging = activateAging;
    }


    /**
     * Gets the ownershipChange value for this NVPAType.
     * 
     * @return ownershipChange
     */
    public java.lang.String getOwnershipChange() {
        return ownershipChange;
    }


    /**
     * Sets the ownershipChange value for this NVPAType.
     * 
     * @param ownershipChange
     */
    public void setOwnershipChange(java.lang.String ownershipChange) {
        this.ownershipChange = ownershipChange;
    }


    /**
     * Gets the outstandingBill value for this NVPAType.
     * 
     * @return outstandingBill
     */
    public java.lang.String getOutstandingBill() {
        return outstandingBill;
    }


    /**
     * Sets the outstandingBill value for this NVPAType.
     * 
     * @param outstandingBill
     */
    public void setOutstandingBill(java.lang.String outstandingBill) {
        this.outstandingBill = outstandingBill;
    }


    /**
     * Gets the underSubJudice value for this NVPAType.
     * 
     * @return underSubJudice
     */
    public java.lang.String getUnderSubJudice() {
        return underSubJudice;
    }


    /**
     * Sets the underSubJudice value for this NVPAType.
     * 
     * @param underSubJudice
     */
    public void setUnderSubJudice(java.lang.String underSubJudice) {
        this.underSubJudice = underSubJudice;
    }


    /**
     * Gets the portingProhibited value for this NVPAType.
     * 
     * @return portingProhibited
     */
    public java.lang.String getPortingProhibited() {
        return portingProhibited;
    }


    /**
     * Sets the portingProhibited value for this NVPAType.
     * 
     * @param portingProhibited
     */
    public void setPortingProhibited(java.lang.String portingProhibited) {
        this.portingProhibited = portingProhibited;
    }


    /**
     * Gets the simSwap value for this NVPAType.
     * 
     * @return simSwap
     */
    public java.lang.String getSimSwap() {
        return simSwap;
    }


    /**
     * Sets the simSwap value for this NVPAType.
     * 
     * @param simSwap
     */
    public void setSimSwap(java.lang.String simSwap) {
        this.simSwap = simSwap;
    }


    /**
     * Gets the version value for this NVPAType.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this NVPAType.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NVPAType)) return false;
        NVPAType other = (NVPAType) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.messageSenderTelco==null && other.getMessageSenderTelco()==null) || 
             (this.messageSenderTelco!=null &&
              this.messageSenderTelco.equals(other.getMessageSenderTelco()))) &&
            ((this.messageReceiverTelco==null && other.getMessageReceiverTelco()==null) || 
             (this.messageReceiverTelco!=null &&
              this.messageReceiverTelco.equals(other.getMessageReceiverTelco()))) &&
            ((this.requestId==null && other.getRequestId()==null) || 
             (this.requestId!=null &&
              this.requestId.equals(other.getRequestId()))) &&
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp()))) &&
            ((this.referenceId==null && other.getReferenceId()==null) || 
             (this.referenceId!=null &&
              this.referenceId.equals(other.getReferenceId()))) &&
            ((this.subscriberNumber==null && other.getSubscriberNumber()==null) || 
             (this.subscriberNumber!=null &&
              this.subscriberNumber.equals(other.getSubscriberNumber()))) &&
            ((this.corporate==null && other.getCorporate()==null) || 
             (this.corporate!=null &&
              this.corporate.equals(other.getCorporate()))) &&
            ((this.contractualObligation==null && other.getContractualObligation()==null) || 
             (this.contractualObligation!=null &&
              this.contractualObligation.equals(other.getContractualObligation()))) &&
            ((this.activateAging==null && other.getActivateAging()==null) || 
             (this.activateAging!=null &&
              this.activateAging.equals(other.getActivateAging()))) &&
            ((this.ownershipChange==null && other.getOwnershipChange()==null) || 
             (this.ownershipChange!=null &&
              this.ownershipChange.equals(other.getOwnershipChange()))) &&
            ((this.outstandingBill==null && other.getOutstandingBill()==null) || 
             (this.outstandingBill!=null &&
              this.outstandingBill.equals(other.getOutstandingBill()))) &&
            ((this.underSubJudice==null && other.getUnderSubJudice()==null) || 
             (this.underSubJudice!=null &&
              this.underSubJudice.equals(other.getUnderSubJudice()))) &&
            ((this.portingProhibited==null && other.getPortingProhibited()==null) || 
             (this.portingProhibited!=null &&
              this.portingProhibited.equals(other.getPortingProhibited()))) &&
            ((this.simSwap==null && other.getSimSwap()==null) || 
             (this.simSwap!=null &&
              this.simSwap.equals(other.getSimSwap()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getMessageSenderTelco() != null) {
            _hashCode += getMessageSenderTelco().hashCode();
        }
        if (getMessageReceiverTelco() != null) {
            _hashCode += getMessageReceiverTelco().hashCode();
        }
        if (getRequestId() != null) {
            _hashCode += getRequestId().hashCode();
        }
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        if (getReferenceId() != null) {
            _hashCode += getReferenceId().hashCode();
        }
        if (getSubscriberNumber() != null) {
            _hashCode += getSubscriberNumber().hashCode();
        }
        if (getCorporate() != null) {
            _hashCode += getCorporate().hashCode();
        }
        if (getContractualObligation() != null) {
            _hashCode += getContractualObligation().hashCode();
        }
        if (getActivateAging() != null) {
            _hashCode += getActivateAging().hashCode();
        }
        if (getOwnershipChange() != null) {
            _hashCode += getOwnershipChange().hashCode();
        }
        if (getOutstandingBill() != null) {
            _hashCode += getOutstandingBill().hashCode();
        }
        if (getUnderSubJudice() != null) {
            _hashCode += getUnderSubJudice().hashCode();
        }
        if (getPortingProhibited() != null) {
            _hashCode += getPortingProhibited().hashCode();
        }
        if (getSimSwap() != null) {
            _hashCode += getSimSwap().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NVPAType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", "NVPAType"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("version");
        attrField.setXmlName(new javax.xml.namespace.QName("", "version"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageSenderTelco");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "MessageSenderTelco"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">MessageSenderTelco"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageReceiverTelco");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "MessageReceiverTelco"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">MessageReceiverTelco"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestId");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "RequestId"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">RequestId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "Timestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "ReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">ReferenceId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "SubscriberNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">SubscriberNumber"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corporate");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "Corporate"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">Corporate"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractualObligation");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "ContractualObligation"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">ContractualObligation"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activateAging");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "ActivateAging"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">ActivateAging"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownershipChange");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "OwnershipChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">OwnershipChange"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outstandingBill");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "OutstandingBill"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">OutstandingBill"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("underSubJudice");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "UnderSub-judice"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">UnderSub-judice"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portingProhibited");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "PortingProhibited"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">PortingProhibited"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("simSwap");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "SimSwap"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">SimSwap"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
