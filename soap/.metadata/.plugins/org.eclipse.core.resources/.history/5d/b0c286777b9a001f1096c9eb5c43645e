/**
 * NPOTypeSubscriberAuthSequenceSubscriberAuthorization.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Nov 07, 2023 (07:57:58 UTC) WSDL2Java emitter.
 */

package xsd.MNPProtocol;

public class NPOTypeSubscriberAuthSequenceSubscriberAuthorization  implements java.io.Serializable {
    private java.lang.String subscriberNumber;

    private java.lang.String ownerId;

    private java.math.BigInteger typeOfId;

    public NPOTypeSubscriberAuthSequenceSubscriberAuthorization() {
    }

    public NPOTypeSubscriberAuthSequenceSubscriberAuthorization(
           java.lang.String subscriberNumber,
           java.lang.String ownerId,
           java.math.BigInteger typeOfId) {
           this.subscriberNumber = subscriberNumber;
           this.ownerId = ownerId;
           this.typeOfId = typeOfId;
    }


    /**
     * Gets the subscriberNumber value for this NPOTypeSubscriberAuthSequenceSubscriberAuthorization.
     * 
     * @return subscriberNumber
     */
    public java.lang.String getSubscriberNumber() {
        return subscriberNumber;
    }


    /**
     * Sets the subscriberNumber value for this NPOTypeSubscriberAuthSequenceSubscriberAuthorization.
     * 
     * @param subscriberNumber
     */
    public void setSubscriberNumber(java.lang.String subscriberNumber) {
        this.subscriberNumber = subscriberNumber;
    }


    /**
     * Gets the ownerId value for this NPOTypeSubscriberAuthSequenceSubscriberAuthorization.
     * 
     * @return ownerId
     */
    public java.lang.String getOwnerId() {
        return ownerId;
    }


    /**
     * Sets the ownerId value for this NPOTypeSubscriberAuthSequenceSubscriberAuthorization.
     * 
     * @param ownerId
     */
    public void setOwnerId(java.lang.String ownerId) {
        this.ownerId = ownerId;
    }


    /**
     * Gets the typeOfId value for this NPOTypeSubscriberAuthSequenceSubscriberAuthorization.
     * 
     * @return typeOfId
     */
    public java.math.BigInteger getTypeOfId() {
        return typeOfId;
    }


    /**
     * Sets the typeOfId value for this NPOTypeSubscriberAuthSequenceSubscriberAuthorization.
     * 
     * @param typeOfId
     */
    public void setTypeOfId(java.math.BigInteger typeOfId) {
        this.typeOfId = typeOfId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NPOTypeSubscriberAuthSequenceSubscriberAuthorization)) return false;
        NPOTypeSubscriberAuthSequenceSubscriberAuthorization other = (NPOTypeSubscriberAuthSequenceSubscriberAuthorization) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscriberNumber==null && other.getSubscriberNumber()==null) || 
             (this.subscriberNumber!=null &&
              this.subscriberNumber.equals(other.getSubscriberNumber()))) &&
            ((this.ownerId==null && other.getOwnerId()==null) || 
             (this.ownerId!=null &&
              this.ownerId.equals(other.getOwnerId()))) &&
            ((this.typeOfId==null && other.getTypeOfId()==null) || 
             (this.typeOfId!=null &&
              this.typeOfId.equals(other.getTypeOfId())));
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
        if (getSubscriberNumber() != null) {
            _hashCode += getSubscriberNumber().hashCode();
        }
        if (getOwnerId() != null) {
            _hashCode += getOwnerId().hashCode();
        }
        if (getTypeOfId() != null) {
            _hashCode += getTypeOfId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NPOTypeSubscriberAuthSequenceSubscriberAuthorization.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">>NPOType>SubscriberAuthSequence>SubscriberAuthorization"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "SubscriberNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">SubscriberNumber"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownerId");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "OwnerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">OwnerId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeOfId");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "TypeOfId"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">TypeOfId"));
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
