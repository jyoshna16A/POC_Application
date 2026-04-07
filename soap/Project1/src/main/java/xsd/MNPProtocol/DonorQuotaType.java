/**
 * DonorQuotaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Nov 07, 2023 (07:57:58 UTC) WSDL2Java emitter.
 */

package xsd.MNPProtocol;

public class DonorQuotaType  implements java.io.Serializable {
    private java.lang.String donorTelco;

    private xsd.MNPProtocol.WindowType[] window;

    public DonorQuotaType() {
    }

    public DonorQuotaType(
           java.lang.String donorTelco,
           xsd.MNPProtocol.WindowType[] window) {
           this.donorTelco = donorTelco;
           this.window = window;
    }


    /**
     * Gets the donorTelco value for this DonorQuotaType.
     * 
     * @return donorTelco
     */
    public java.lang.String getDonorTelco() {
        return donorTelco;
    }


    /**
     * Sets the donorTelco value for this DonorQuotaType.
     * 
     * @param donorTelco
     */
    public void setDonorTelco(java.lang.String donorTelco) {
        this.donorTelco = donorTelco;
    }


    /**
     * Gets the window value for this DonorQuotaType.
     * 
     * @return window
     */
    public xsd.MNPProtocol.WindowType[] getWindow() {
        return window;
    }


    /**
     * Sets the window value for this DonorQuotaType.
     * 
     * @param window
     */
    public void setWindow(xsd.MNPProtocol.WindowType[] window) {
        this.window = window;
    }

    public xsd.MNPProtocol.WindowType getWindow(int i) {
        return this.window[i];
    }

    public void setWindow(int i, xsd.MNPProtocol.WindowType _value) {
        this.window[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DonorQuotaType)) return false;
        DonorQuotaType other = (DonorQuotaType) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.donorTelco==null && other.getDonorTelco()==null) || 
             (this.donorTelco!=null &&
              this.donorTelco.equals(other.getDonorTelco()))) &&
            ((this.window==null && other.getWindow()==null) || 
             (this.window!=null &&
              java.util.Arrays.equals(this.window, other.getWindow())));
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
        if (getDonorTelco() != null) {
            _hashCode += getDonorTelco().hashCode();
        }
        if (getWindow() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWindow());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWindow(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DonorQuotaType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", "DonorQuotaType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("donorTelco");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "DonorTelco"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">DonorTelco"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("window");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "Window"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", "WindowType"));
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
