/**
 * NPOTType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Nov 07, 2023 (07:57:58 UTC) WSDL2Java emitter.
 */

package xsd.MNPProtocol;

public class NPOTType  implements java.io.Serializable {
    private java.lang.String messageSenderTelco;

    private java.lang.String messageReceiverTelco;

    private java.lang.String requestId;

    private java.util.Calendar timestamp;

    private java.lang.String referenceId;

    private java.lang.String[] subscriberSequence;

    private java.lang.String LSA;

    private java.util.Calendar orderedTransferTime;

    private java.util.Calendar orderedApprovalTime;

    private java.lang.String version;  // attribute

    public NPOTType() {
    }

    public NPOTType(
           java.lang.String messageSenderTelco,
           java.lang.String messageReceiverTelco,
           java.lang.String requestId,
           java.util.Calendar timestamp,
           java.lang.String referenceId,
           java.lang.String[] subscriberSequence,
           java.lang.String LSA,
           java.util.Calendar orderedTransferTime,
           java.util.Calendar orderedApprovalTime,
           java.lang.String version) {
           this.messageSenderTelco = messageSenderTelco;
           this.messageReceiverTelco = messageReceiverTelco;
           this.requestId = requestId;
           this.timestamp = timestamp;
           this.referenceId = referenceId;
           this.subscriberSequence = subscriberSequence;
           this.LSA = LSA;
           this.orderedTransferTime = orderedTransferTime;
           this.orderedApprovalTime = orderedApprovalTime;
           this.version = version;
    }


    /**
     * Gets the messageSenderTelco value for this NPOTType.
     * 
     * @return messageSenderTelco
     */
    public java.lang.String getMessageSenderTelco() {
        return messageSenderTelco;
    }


    /**
     * Sets the messageSenderTelco value for this NPOTType.
     * 
     * @param messageSenderTelco
     */
    public void setMessageSenderTelco(java.lang.String messageSenderTelco) {
        this.messageSenderTelco = messageSenderTelco;
    }


    /**
     * Gets the messageReceiverTelco value for this NPOTType.
     * 
     * @return messageReceiverTelco
     */
    public java.lang.String getMessageReceiverTelco() {
        return messageReceiverTelco;
    }


    /**
     * Sets the messageReceiverTelco value for this NPOTType.
     * 
     * @param messageReceiverTelco
     */
    public void setMessageReceiverTelco(java.lang.String messageReceiverTelco) {
        this.messageReceiverTelco = messageReceiverTelco;
    }


    /**
     * Gets the requestId value for this NPOTType.
     * 
     * @return requestId
     */
    public java.lang.String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this NPOTType.
     * 
     * @param requestId
     */
    public void setRequestId(java.lang.String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the timestamp value for this NPOTType.
     * 
     * @return timestamp
     */
    public java.util.Calendar getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this NPOTType.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.util.Calendar timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the referenceId value for this NPOTType.
     * 
     * @return referenceId
     */
    public java.lang.String getReferenceId() {
        return referenceId;
    }


    /**
     * Sets the referenceId value for this NPOTType.
     * 
     * @param referenceId
     */
    public void setReferenceId(java.lang.String referenceId) {
        this.referenceId = referenceId;
    }


    /**
     * Gets the subscriberSequence value for this NPOTType.
     * 
     * @return subscriberSequence
     */
    public java.lang.String[] getSubscriberSequence() {
        return subscriberSequence;
    }


    /**
     * Sets the subscriberSequence value for this NPOTType.
     * 
     * @param subscriberSequence
     */
    public void setSubscriberSequence(java.lang.String[] subscriberSequence) {
        this.subscriberSequence = subscriberSequence;
    }


    /**
     * Gets the LSA value for this NPOTType.
     * 
     * @return LSA
     */
    public java.lang.String getLSA() {
        return LSA;
    }


    /**
     * Sets the LSA value for this NPOTType.
     * 
     * @param LSA
     */
    public void setLSA(java.lang.String LSA) {
        this.LSA = LSA;
    }


    /**
     * Gets the orderedTransferTime value for this NPOTType.
     * 
     * @return orderedTransferTime
     */
    public java.util.Calendar getOrderedTransferTime() {
        return orderedTransferTime;
    }


    /**
     * Sets the orderedTransferTime value for this NPOTType.
     * 
     * @param orderedTransferTime
     */
    public void setOrderedTransferTime(java.util.Calendar orderedTransferTime) {
        this.orderedTransferTime = orderedTransferTime;
    }


    /**
     * Gets the orderedApprovalTime value for this NPOTType.
     * 
     * @return orderedApprovalTime
     */
    public java.util.Calendar getOrderedApprovalTime() {
        return orderedApprovalTime;
    }


    /**
     * Sets the orderedApprovalTime value for this NPOTType.
     * 
     * @param orderedApprovalTime
     */
    public void setOrderedApprovalTime(java.util.Calendar orderedApprovalTime) {
        this.orderedApprovalTime = orderedApprovalTime;
    }


    /**
     * Gets the version value for this NPOTType.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this NPOTType.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NPOTType)) return false;
        NPOTType other = (NPOTType) obj;
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
            ((this.subscriberSequence==null && other.getSubscriberSequence()==null) || 
             (this.subscriberSequence!=null &&
              java.util.Arrays.equals(this.subscriberSequence, other.getSubscriberSequence()))) &&
            ((this.LSA==null && other.getLSA()==null) || 
             (this.LSA!=null &&
              this.LSA.equals(other.getLSA()))) &&
            ((this.orderedTransferTime==null && other.getOrderedTransferTime()==null) || 
             (this.orderedTransferTime!=null &&
              this.orderedTransferTime.equals(other.getOrderedTransferTime()))) &&
            ((this.orderedApprovalTime==null && other.getOrderedApprovalTime()==null) || 
             (this.orderedApprovalTime!=null &&
              this.orderedApprovalTime.equals(other.getOrderedApprovalTime()))) &&
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
        if (getSubscriberSequence() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscriberSequence());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscriberSequence(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLSA() != null) {
            _hashCode += getLSA().hashCode();
        }
        if (getOrderedTransferTime() != null) {
            _hashCode += getOrderedTransferTime().hashCode();
        }
        if (getOrderedApprovalTime() != null) {
            _hashCode += getOrderedApprovalTime().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NPOTType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", "NPOTType"));
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
        elemField.setFieldName("subscriberSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "SubscriberSequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", "SubscriberNumber"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LSA");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "LSA"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">LSA"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderedTransferTime");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "OrderedTransferTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderedApprovalTime");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "OrderedApprovalTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
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
