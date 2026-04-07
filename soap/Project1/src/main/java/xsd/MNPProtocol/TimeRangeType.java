/**
 * TimeRangeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Nov 07, 2023 (07:57:58 UTC) WSDL2Java emitter.
 */

package xsd.MNPProtocol;

public class TimeRangeType  implements java.io.Serializable {
    private java.util.Calendar timeRangeStart;

    private java.util.Calendar timeRangeEnd;

    public TimeRangeType() {
    }

    public TimeRangeType(
           java.util.Calendar timeRangeStart,
           java.util.Calendar timeRangeEnd) {
           this.timeRangeStart = timeRangeStart;
           this.timeRangeEnd = timeRangeEnd;
    }


    /**
     * Gets the timeRangeStart value for this TimeRangeType.
     * 
     * @return timeRangeStart
     */
    public java.util.Calendar getTimeRangeStart() {
        return timeRangeStart;
    }


    /**
     * Sets the timeRangeStart value for this TimeRangeType.
     * 
     * @param timeRangeStart
     */
    public void setTimeRangeStart(java.util.Calendar timeRangeStart) {
        this.timeRangeStart = timeRangeStart;
    }


    /**
     * Gets the timeRangeEnd value for this TimeRangeType.
     * 
     * @return timeRangeEnd
     */
    public java.util.Calendar getTimeRangeEnd() {
        return timeRangeEnd;
    }


    /**
     * Sets the timeRangeEnd value for this TimeRangeType.
     * 
     * @param timeRangeEnd
     */
    public void setTimeRangeEnd(java.util.Calendar timeRangeEnd) {
        this.timeRangeEnd = timeRangeEnd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimeRangeType)) return false;
        TimeRangeType other = (TimeRangeType) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.timeRangeStart==null && other.getTimeRangeStart()==null) || 
             (this.timeRangeStart!=null &&
              this.timeRangeStart.equals(other.getTimeRangeStart()))) &&
            ((this.timeRangeEnd==null && other.getTimeRangeEnd()==null) || 
             (this.timeRangeEnd!=null &&
              this.timeRangeEnd.equals(other.getTimeRangeEnd())));
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
        if (getTimeRangeStart() != null) {
            _hashCode += getTimeRangeStart().hashCode();
        }
        if (getTimeRangeEnd() != null) {
            _hashCode += getTimeRangeEnd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TimeRangeType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", "TimeRangeType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeRangeStart");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "TimeRangeStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeRangeEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "TimeRangeEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
