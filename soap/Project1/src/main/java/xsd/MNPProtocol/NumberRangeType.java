/**
 * NumberRangeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Nov 07, 2023 (07:57:58 UTC) WSDL2Java emitter.
 */

package xsd.MNPProtocol;

public class NumberRangeType  implements java.io.Serializable {
    private java.lang.String numberRangeStart;

    private java.lang.String numberRangeEnd;

    public NumberRangeType() {
    }

    public NumberRangeType(
           java.lang.String numberRangeStart,
           java.lang.String numberRangeEnd) {
           this.numberRangeStart = numberRangeStart;
           this.numberRangeEnd = numberRangeEnd;
    }


    /**
     * Gets the numberRangeStart value for this NumberRangeType.
     * 
     * @return numberRangeStart
     */
    public java.lang.String getNumberRangeStart() {
        return numberRangeStart;
    }


    /**
     * Sets the numberRangeStart value for this NumberRangeType.
     * 
     * @param numberRangeStart
     */
    public void setNumberRangeStart(java.lang.String numberRangeStart) {
        this.numberRangeStart = numberRangeStart;
    }


    /**
     * Gets the numberRangeEnd value for this NumberRangeType.
     * 
     * @return numberRangeEnd
     */
    public java.lang.String getNumberRangeEnd() {
        return numberRangeEnd;
    }


    /**
     * Sets the numberRangeEnd value for this NumberRangeType.
     * 
     * @param numberRangeEnd
     */
    public void setNumberRangeEnd(java.lang.String numberRangeEnd) {
        this.numberRangeEnd = numberRangeEnd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NumberRangeType)) return false;
        NumberRangeType other = (NumberRangeType) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numberRangeStart==null && other.getNumberRangeStart()==null) || 
             (this.numberRangeStart!=null &&
              this.numberRangeStart.equals(other.getNumberRangeStart()))) &&
            ((this.numberRangeEnd==null && other.getNumberRangeEnd()==null) || 
             (this.numberRangeEnd!=null &&
              this.numberRangeEnd.equals(other.getNumberRangeEnd())));
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
        if (getNumberRangeStart() != null) {
            _hashCode += getNumberRangeStart().hashCode();
        }
        if (getNumberRangeEnd() != null) {
            _hashCode += getNumberRangeEnd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NumberRangeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", "NumberRangeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberRangeStart");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "NumberRangeStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">NumberRangeStart"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberRangeEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "NumberRangeEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">NumberRangeEnd"));
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
