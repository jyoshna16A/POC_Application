/**
 * RspType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Nov 07, 2023 (07:57:58 UTC) WSDL2Java emitter.
 */

package xsd.MNPProtocol;

public class RspType  implements java.io.Serializable {
    private java.lang.String messageSenderTelco;

    private java.lang.String messageReceiverTelco;

    private java.lang.String requestId;

    private java.util.Calendar timestamp;

    private java.lang.String messageType;

    private java.lang.String referenceId;

    private java.math.BigInteger resultCode;

    private xsd.MNPProtocol.SubscriberResultType[] subscriberResult;

    private java.util.Calendar orderedTransferTime;

    private java.util.Calendar recommendTransferTime;

    private java.lang.String recipientTelco;

    private java.lang.String LSA;

    private java.lang.String version;  // attribute

    public RspType() {
    }

    public RspType(
           java.lang.String messageSenderTelco,
           java.lang.String messageReceiverTelco,
           java.lang.String requestId,
           java.util.Calendar timestamp,
           java.lang.String messageType,
           java.lang.String referenceId,
           java.math.BigInteger resultCode,
           xsd.MNPProtocol.SubscriberResultType[] subscriberResult,
           java.util.Calendar orderedTransferTime,
           java.util.Calendar recommendTransferTime,
           java.lang.String recipientTelco,
           java.lang.String LSA,
           java.lang.String version) {
           this.messageSenderTelco = messageSenderTelco;
           this.messageReceiverTelco = messageReceiverTelco;
           this.requestId = requestId;
           this.timestamp = timestamp;
           this.messageType = messageType;
           this.referenceId = referenceId;
           this.resultCode = resultCode;
           this.subscriberResult = subscriberResult;
           this.orderedTransferTime = orderedTransferTime;
           this.recommendTransferTime = recommendTransferTime;
           this.recipientTelco = recipientTelco;
           this.LSA = LSA;
           this.version = version;
    }


    /**
     * Gets the messageSenderTelco value for this RspType.
     * 
     * @return messageSenderTelco
     */
    public java.lang.String getMessageSenderTelco() {
        return messageSenderTelco;
    }


    /**
     * Sets the messageSenderTelco value for this RspType.
     * 
     * @param messageSenderTelco
     */
    public void setMessageSenderTelco(java.lang.String messageSenderTelco) {
        this.messageSenderTelco = messageSenderTelco;
    }


    /**
     * Gets the messageReceiverTelco value for this RspType.
     * 
     * @return messageReceiverTelco
     */
    public java.lang.String getMessageReceiverTelco() {
        return messageReceiverTelco;
    }


    /**
     * Sets the messageReceiverTelco value for this RspType.
     * 
     * @param messageReceiverTelco
     */
    public void setMessageReceiverTelco(java.lang.String messageReceiverTelco) {
        this.messageReceiverTelco = messageReceiverTelco;
    }


    /**
     * Gets the requestId value for this RspType.
     * 
     * @return requestId
     */
    public java.lang.String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this RspType.
     * 
     * @param requestId
     */
    public void setRequestId(java.lang.String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the timestamp value for this RspType.
     * 
     * @return timestamp
     */
    public java.util.Calendar getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this RspType.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.util.Calendar timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the messageType value for this RspType.
     * 
     * @return messageType
     */
    public java.lang.String getMessageType() {
        return messageType;
    }


    /**
     * Sets the messageType value for this RspType.
     * 
     * @param messageType
     */
    public void setMessageType(java.lang.String messageType) {
        this.messageType = messageType;
    }


    /**
     * Gets the referenceId value for this RspType.
     * 
     * @return referenceId
     */
    public java.lang.String getReferenceId() {
        return referenceId;
    }


    /**
     * Sets the referenceId value for this RspType.
     * 
     * @param referenceId
     */
    public void setReferenceId(java.lang.String referenceId) {
        this.referenceId = referenceId;
    }


    /**
     * Gets the resultCode value for this RspType.
     * 
     * @return resultCode
     */
    public java.math.BigInteger getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this RspType.
     * 
     * @param resultCode
     */
    public void setResultCode(java.math.BigInteger resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the subscriberResult value for this RspType.
     * 
     * @return subscriberResult
     */
    public xsd.MNPProtocol.SubscriberResultType[] getSubscriberResult() {
        return subscriberResult;
    }


    /**
     * Sets the subscriberResult value for this RspType.
     * 
     * @param subscriberResult
     */
    public void setSubscriberResult(xsd.MNPProtocol.SubscriberResultType[] subscriberResult) {
        this.subscriberResult = subscriberResult;
    }

    public xsd.MNPProtocol.SubscriberResultType getSubscriberResult(int i) {
        return this.subscriberResult[i];
    }

    public void setSubscriberResult(int i, xsd.MNPProtocol.SubscriberResultType _value) {
        this.subscriberResult[i] = _value;
    }


    /**
     * Gets the orderedTransferTime value for this RspType.
     * 
     * @return orderedTransferTime
     */
    public java.util.Calendar getOrderedTransferTime() {
        return orderedTransferTime;
    }


    /**
     * Sets the orderedTransferTime value for this RspType.
     * 
     * @param orderedTransferTime
     */
    public void setOrderedTransferTime(java.util.Calendar orderedTransferTime) {
        this.orderedTransferTime = orderedTransferTime;
    }


    /**
     * Gets the recommendTransferTime value for this RspType.
     * 
     * @return recommendTransferTime
     */
    public java.util.Calendar getRecommendTransferTime() {
        return recommendTransferTime;
    }


    /**
     * Sets the recommendTransferTime value for this RspType.
     * 
     * @param recommendTransferTime
     */
    public void setRecommendTransferTime(java.util.Calendar recommendTransferTime) {
        this.recommendTransferTime = recommendTransferTime;
    }


    /**
     * Gets the recipientTelco value for this RspType.
     * 
     * @return recipientTelco
     */
    public java.lang.String getRecipientTelco() {
        return recipientTelco;
    }


    /**
     * Sets the recipientTelco value for this RspType.
     * 
     * @param recipientTelco
     */
    public void setRecipientTelco(java.lang.String recipientTelco) {
        this.recipientTelco = recipientTelco;
    }


    /**
     * Gets the LSA value for this RspType.
     * 
     * @return LSA
     */
    public java.lang.String getLSA() {
        return LSA;
    }


    /**
     * Sets the LSA value for this RspType.
     * 
     * @param LSA
     */
    public void setLSA(java.lang.String LSA) {
        this.LSA = LSA;
    }


    /**
     * Gets the version value for this RspType.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this RspType.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RspType)) return false;
        RspType other = (RspType) obj;
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
            ((this.messageType==null && other.getMessageType()==null) || 
             (this.messageType!=null &&
              this.messageType.equals(other.getMessageType()))) &&
            ((this.referenceId==null && other.getReferenceId()==null) || 
             (this.referenceId!=null &&
              this.referenceId.equals(other.getReferenceId()))) &&
            ((this.resultCode==null && other.getResultCode()==null) || 
             (this.resultCode!=null &&
              this.resultCode.equals(other.getResultCode()))) &&
            ((this.subscriberResult==null && other.getSubscriberResult()==null) || 
             (this.subscriberResult!=null &&
              java.util.Arrays.equals(this.subscriberResult, other.getSubscriberResult()))) &&
            ((this.orderedTransferTime==null && other.getOrderedTransferTime()==null) || 
             (this.orderedTransferTime!=null &&
              this.orderedTransferTime.equals(other.getOrderedTransferTime()))) &&
            ((this.recommendTransferTime==null && other.getRecommendTransferTime()==null) || 
             (this.recommendTransferTime!=null &&
              this.recommendTransferTime.equals(other.getRecommendTransferTime()))) &&
            ((this.recipientTelco==null && other.getRecipientTelco()==null) || 
             (this.recipientTelco!=null &&
              this.recipientTelco.equals(other.getRecipientTelco()))) &&
            ((this.LSA==null && other.getLSA()==null) || 
             (this.LSA!=null &&
              this.LSA.equals(other.getLSA()))) &&
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
        if (getMessageType() != null) {
            _hashCode += getMessageType().hashCode();
        }
        if (getReferenceId() != null) {
            _hashCode += getReferenceId().hashCode();
        }
        if (getResultCode() != null) {
            _hashCode += getResultCode().hashCode();
        }
        if (getSubscriberResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscriberResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscriberResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrderedTransferTime() != null) {
            _hashCode += getOrderedTransferTime().hashCode();
        }
        if (getRecommendTransferTime() != null) {
            _hashCode += getRecommendTransferTime().hashCode();
        }
        if (getRecipientTelco() != null) {
            _hashCode += getRecipientTelco().hashCode();
        }
        if (getLSA() != null) {
            _hashCode += getLSA().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RspType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", "RspType"));
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
        elemField.setFieldName("messageType");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "MessageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">MessageType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "ReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">ReferenceId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "ResultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">ResultCode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberResult");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "SubscriberResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", "SubscriberResultType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderedTransferTime");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "OrderedTransferTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommendTransferTime");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "RecommendTransferTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientTelco");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "RecipientTelco"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">RecipientTelco"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LSA");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "LSA"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">LSA"));
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
