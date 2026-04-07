/**
 * SCNOTICEAType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Nov 07, 2023 (07:57:58 UTC) WSDL2Java emitter.
 */

package xsd.MNPProtocol;

public class SCNOTICEAType  implements java.io.Serializable {
    private java.lang.String messageSenderTelco;

    private java.lang.String messageReceiverTelco;

    private java.lang.String requestId;

    private java.util.Calendar timestamp;

    private java.lang.String batchId;

    private java.math.BigInteger success;

    private java.math.BigInteger fail;

    private xsd.MNPProtocol.SubscriberResultType[] subscriberResult;

    private java.lang.String version;  // attribute

    public SCNOTICEAType() {
    }

    public SCNOTICEAType(
           java.lang.String messageSenderTelco,
           java.lang.String messageReceiverTelco,
           java.lang.String requestId,
           java.util.Calendar timestamp,
           java.lang.String batchId,
           java.math.BigInteger success,
           java.math.BigInteger fail,
           xsd.MNPProtocol.SubscriberResultType[] subscriberResult,
           java.lang.String version) {
           this.messageSenderTelco = messageSenderTelco;
           this.messageReceiverTelco = messageReceiverTelco;
           this.requestId = requestId;
           this.timestamp = timestamp;
           this.batchId = batchId;
           this.success = success;
           this.fail = fail;
           this.subscriberResult = subscriberResult;
           this.version = version;
    }


    /**
     * Gets the messageSenderTelco value for this SCNOTICEAType.
     * 
     * @return messageSenderTelco
     */
    public java.lang.String getMessageSenderTelco() {
        return messageSenderTelco;
    }


    /**
     * Sets the messageSenderTelco value for this SCNOTICEAType.
     * 
     * @param messageSenderTelco
     */
    public void setMessageSenderTelco(java.lang.String messageSenderTelco) {
        this.messageSenderTelco = messageSenderTelco;
    }


    /**
     * Gets the messageReceiverTelco value for this SCNOTICEAType.
     * 
     * @return messageReceiverTelco
     */
    public java.lang.String getMessageReceiverTelco() {
        return messageReceiverTelco;
    }


    /**
     * Sets the messageReceiverTelco value for this SCNOTICEAType.
     * 
     * @param messageReceiverTelco
     */
    public void setMessageReceiverTelco(java.lang.String messageReceiverTelco) {
        this.messageReceiverTelco = messageReceiverTelco;
    }


    /**
     * Gets the requestId value for this SCNOTICEAType.
     * 
     * @return requestId
     */
    public java.lang.String getRequestId() {
        return requestId;
    }


    /**
     * Sets the requestId value for this SCNOTICEAType.
     * 
     * @param requestId
     */
    public void setRequestId(java.lang.String requestId) {
        this.requestId = requestId;
    }


    /**
     * Gets the timestamp value for this SCNOTICEAType.
     * 
     * @return timestamp
     */
    public java.util.Calendar getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this SCNOTICEAType.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.util.Calendar timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the batchId value for this SCNOTICEAType.
     * 
     * @return batchId
     */
    public java.lang.String getBatchId() {
        return batchId;
    }


    /**
     * Sets the batchId value for this SCNOTICEAType.
     * 
     * @param batchId
     */
    public void setBatchId(java.lang.String batchId) {
        this.batchId = batchId;
    }


    /**
     * Gets the success value for this SCNOTICEAType.
     * 
     * @return success
     */
    public java.math.BigInteger getSuccess() {
        return success;
    }


    /**
     * Sets the success value for this SCNOTICEAType.
     * 
     * @param success
     */
    public void setSuccess(java.math.BigInteger success) {
        this.success = success;
    }


    /**
     * Gets the fail value for this SCNOTICEAType.
     * 
     * @return fail
     */
    public java.math.BigInteger getFail() {
        return fail;
    }


    /**
     * Sets the fail value for this SCNOTICEAType.
     * 
     * @param fail
     */
    public void setFail(java.math.BigInteger fail) {
        this.fail = fail;
    }


    /**
     * Gets the subscriberResult value for this SCNOTICEAType.
     * 
     * @return subscriberResult
     */
    public xsd.MNPProtocol.SubscriberResultType[] getSubscriberResult() {
        return subscriberResult;
    }


    /**
     * Sets the subscriberResult value for this SCNOTICEAType.
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
     * Gets the version value for this SCNOTICEAType.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this SCNOTICEAType.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SCNOTICEAType)) return false;
        SCNOTICEAType other = (SCNOTICEAType) obj;
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
            ((this.batchId==null && other.getBatchId()==null) || 
             (this.batchId!=null &&
              this.batchId.equals(other.getBatchId()))) &&
            ((this.success==null && other.getSuccess()==null) || 
             (this.success!=null &&
              this.success.equals(other.getSuccess()))) &&
            ((this.fail==null && other.getFail()==null) || 
             (this.fail!=null &&
              this.fail.equals(other.getFail()))) &&
            ((this.subscriberResult==null && other.getSubscriberResult()==null) || 
             (this.subscriberResult!=null &&
              java.util.Arrays.equals(this.subscriberResult, other.getSubscriberResult()))) &&
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
        if (getBatchId() != null) {
            _hashCode += getBatchId().hashCode();
        }
        if (getSuccess() != null) {
            _hashCode += getSuccess().hashCode();
        }
        if (getFail() != null) {
            _hashCode += getFail().hashCode();
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
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SCNOTICEAType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", "SC-NOTICEAType"));
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
        elemField.setFieldName("batchId");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "BatchId"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">BatchId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "Success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fail");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "Fail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
