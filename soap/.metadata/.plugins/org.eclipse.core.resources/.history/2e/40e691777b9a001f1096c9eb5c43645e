/**
 * DateRangeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Nov 07, 2023 (07:57:58 UTC) WSDL2Java emitter.
 */

package xsd.MNPProtocol;

public class DateRangeType  implements java.io.Serializable {
    private java.util.Date dateRangeStart;

    private java.util.Date dateRangeEnd;

    public DateRangeType() {
    }

    public DateRangeType(
           java.util.Date dateRangeStart,
           java.util.Date dateRangeEnd) {
           this.dateRangeStart = dateRangeStart;
           this.dateRangeEnd = dateRangeEnd;
    }


    /**
     * Gets the dateRangeStart value for this DateRangeType.
     * 
     * @return dateRangeStart
     */
    public java.util.Date getDateRangeStart() {
        return dateRangeStart;
    }


    /**
     * Sets the dateRangeStart value for this DateRangeType.
     * 
     * @param dateRangeStart
     */
    public void setDateRangeStart(java.util.Date dateRangeStart) {
        this.dateRangeStart = dateRangeStart;
    }


    /**
     * Gets the dateRangeEnd value for this DateRangeType.
     * 
     * @return dateRangeEnd
     */
    public java.util.Date getDateRangeEnd() {
        return dateRangeEnd;
    }


    /**
     * Sets the dateRangeEnd value for this DateRangeType.
     * 
     * @param dateRangeEnd
     */
    public void setDateRangeEnd(java.util.Date dateRangeEnd) {
        this.dateRangeEnd = dateRangeEnd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DateRangeType)) return false;
        DateRangeType other = (DateRangeType) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dateRangeStart==null && other.getDateRangeStart()==null) || 
             (this.dateRangeStart!=null &&
              this.dateRangeStart.equals(other.getDateRangeStart()))) &&
            ((this.dateRangeEnd==null && other.getDateRangeEnd()==null) || 
             (this.dateRangeEnd!=null &&
              this.dateRangeEnd.equals(other.getDateRangeEnd())));
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
        if (getDateRangeStart() != null) {
            _hashCode += getDateRangeStart().hashCode();
        }
        if (getDateRangeEnd() != null) {
            _hashCode += getDateRangeEnd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DateRangeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", "DateRangeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateRangeStart");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "DateRangeStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateRangeEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "DateRangeEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
