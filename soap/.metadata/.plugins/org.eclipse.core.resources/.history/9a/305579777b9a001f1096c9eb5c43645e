/**
 * WindowType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Nov 07, 2023 (07:57:58 UTC) WSDL2Java emitter.
 */

package xsd.MNPProtocol;

public class WindowType  implements java.io.Serializable {
    private java.math.BigInteger quotaAmount;

    private java.lang.String windowName;

    public WindowType() {
    }

    public WindowType(
           java.math.BigInteger quotaAmount,
           java.lang.String windowName) {
           this.quotaAmount = quotaAmount;
           this.windowName = windowName;
    }


    /**
     * Gets the quotaAmount value for this WindowType.
     * 
     * @return quotaAmount
     */
    public java.math.BigInteger getQuotaAmount() {
        return quotaAmount;
    }


    /**
     * Sets the quotaAmount value for this WindowType.
     * 
     * @param quotaAmount
     */
    public void setQuotaAmount(java.math.BigInteger quotaAmount) {
        this.quotaAmount = quotaAmount;
    }


    /**
     * Gets the windowName value for this WindowType.
     * 
     * @return windowName
     */
    public java.lang.String getWindowName() {
        return windowName;
    }


    /**
     * Sets the windowName value for this WindowType.
     * 
     * @param windowName
     */
    public void setWindowName(java.lang.String windowName) {
        this.windowName = windowName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WindowType)) return false;
        WindowType other = (WindowType) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.quotaAmount==null && other.getQuotaAmount()==null) || 
             (this.quotaAmount!=null &&
              this.quotaAmount.equals(other.getQuotaAmount()))) &&
            ((this.windowName==null && other.getWindowName()==null) || 
             (this.windowName!=null &&
              this.windowName.equals(other.getWindowName())));
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
        if (getQuotaAmount() != null) {
            _hashCode += getQuotaAmount().hashCode();
        }
        if (getWindowName() != null) {
            _hashCode += getWindowName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WindowType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", "WindowType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quotaAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "QuotaAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">QuotaAmount"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("windowName");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "WindowName"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">WindowName"));
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
