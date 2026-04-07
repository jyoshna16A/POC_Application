/**
 * QuotaResultType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Nov 07, 2023 (07:57:58 UTC) WSDL2Java emitter.
 */

package xsd.MNPProtocol;

public class QuotaResultType  implements java.io.Serializable {
    private java.util.Date quotaDate;

    private xsd.MNPProtocol.DonorQuotaType donorQuota;

    private java.math.BigInteger activationQuota;

    private java.math.BigInteger maxSNPerNPO;

    public QuotaResultType() {
    }

    public QuotaResultType(
           java.util.Date quotaDate,
           xsd.MNPProtocol.DonorQuotaType donorQuota,
           java.math.BigInteger activationQuota,
           java.math.BigInteger maxSNPerNPO) {
           this.quotaDate = quotaDate;
           this.donorQuota = donorQuota;
           this.activationQuota = activationQuota;
           this.maxSNPerNPO = maxSNPerNPO;
    }


    /**
     * Gets the quotaDate value for this QuotaResultType.
     * 
     * @return quotaDate
     */
    public java.util.Date getQuotaDate() {
        return quotaDate;
    }


    /**
     * Sets the quotaDate value for this QuotaResultType.
     * 
     * @param quotaDate
     */
    public void setQuotaDate(java.util.Date quotaDate) {
        this.quotaDate = quotaDate;
    }


    /**
     * Gets the donorQuota value for this QuotaResultType.
     * 
     * @return donorQuota
     */
    public xsd.MNPProtocol.DonorQuotaType getDonorQuota() {
        return donorQuota;
    }


    /**
     * Sets the donorQuota value for this QuotaResultType.
     * 
     * @param donorQuota
     */
    public void setDonorQuota(xsd.MNPProtocol.DonorQuotaType donorQuota) {
        this.donorQuota = donorQuota;
    }


    /**
     * Gets the activationQuota value for this QuotaResultType.
     * 
     * @return activationQuota
     */
    public java.math.BigInteger getActivationQuota() {
        return activationQuota;
    }


    /**
     * Sets the activationQuota value for this QuotaResultType.
     * 
     * @param activationQuota
     */
    public void setActivationQuota(java.math.BigInteger activationQuota) {
        this.activationQuota = activationQuota;
    }


    /**
     * Gets the maxSNPerNPO value for this QuotaResultType.
     * 
     * @return maxSNPerNPO
     */
    public java.math.BigInteger getMaxSNPerNPO() {
        return maxSNPerNPO;
    }


    /**
     * Sets the maxSNPerNPO value for this QuotaResultType.
     * 
     * @param maxSNPerNPO
     */
    public void setMaxSNPerNPO(java.math.BigInteger maxSNPerNPO) {
        this.maxSNPerNPO = maxSNPerNPO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QuotaResultType)) return false;
        QuotaResultType other = (QuotaResultType) obj;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.quotaDate==null && other.getQuotaDate()==null) || 
             (this.quotaDate!=null &&
              this.quotaDate.equals(other.getQuotaDate()))) &&
            ((this.donorQuota==null && other.getDonorQuota()==null) || 
             (this.donorQuota!=null &&
              this.donorQuota.equals(other.getDonorQuota()))) &&
            ((this.activationQuota==null && other.getActivationQuota()==null) || 
             (this.activationQuota!=null &&
              this.activationQuota.equals(other.getActivationQuota()))) &&
            ((this.maxSNPerNPO==null && other.getMaxSNPerNPO()==null) || 
             (this.maxSNPerNPO!=null &&
              this.maxSNPerNPO.equals(other.getMaxSNPerNPO())));
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
        if (getQuotaDate() != null) {
            _hashCode += getQuotaDate().hashCode();
        }
        if (getDonorQuota() != null) {
            _hashCode += getDonorQuota().hashCode();
        }
        if (getActivationQuota() != null) {
            _hashCode += getActivationQuota().hashCode();
        }
        if (getMaxSNPerNPO() != null) {
            _hashCode += getMaxSNPerNPO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QuotaResultType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", "QuotaResultType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quotaDate");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "QuotaDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("donorQuota");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "DonorQuota"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", "DonorQuotaType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationQuota");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "ActivationQuota"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">ActivationQuota"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxSNPerNPO");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "MaxSNPerNPO"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">MaxSNPerNPO"));
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
