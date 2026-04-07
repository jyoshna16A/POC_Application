/**
 * BCInfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4.1-SNAPSHOT Nov 07, 2023 (07:57:58 UTC) WSDL2Java emitter.
 */

package xsd.MNPProtocol;

public class BCInfoType  implements java.io.Serializable {
    private java.lang.String subscriberNumber;

    private java.math.BigInteger BCAction;

    private java.util.Calendar DCTime;

    private java.lang.String serviceType;

    private java.lang.String routeNumber;

    private java.lang.String RNO;

    private java.lang.String DNO;

    private java.lang.String NRH;

    private java.lang.String resultText;

    public BCInfoType() {
    }

    public BCInfoType(
           java.lang.String subscriberNumber,
           java.math.BigInteger BCAction,
           java.util.Calendar DCTime,
           java.lang.String serviceType,
           java.lang.String routeNumber,
           java.lang.String RNO,
           java.lang.String DNO,
           java.lang.String NRH,
           java.lang.String resultText) {
           this.subscriberNumber = subscriberNumber;
           this.BCAction = BCAction;
           this.DCTime = DCTime;
           this.serviceType = serviceType;
           this.routeNumber = routeNumber;
           this.RNO = RNO;
           this.DNO = DNO;
           this.NRH = NRH;
           this.resultText = resultText;
    }


    /**
     * Gets the subscriberNumber value for this BCInfoType.
     * 
     * @return subscriberNumber
     */
    public java.lang.String getSubscriberNumber() {
        return subscriberNumber;
    }


    /**
     * Sets the subscriberNumber value for this BCInfoType.
     * 
     * @param subscriberNumber
     */
    public void setSubscriberNumber(java.lang.String subscriberNumber) {
        this.subscriberNumber = subscriberNumber;
    }


    /**
     * Gets the BCAction value for this BCInfoType.
     * 
     * @return BCAction
     */
    public java.math.BigInteger getBCAction() {
        return BCAction;
    }


    /**
     * Sets the BCAction value for this BCInfoType.
     * 
     * @param BCAction
     */
    public void setBCAction(java.math.BigInteger BCAction) {
        this.BCAction = BCAction;
    }


    /**
     * Gets the DCTime value for this BCInfoType.
     * 
     * @return DCTime
     */
    public java.util.Calendar getDCTime() {
        return DCTime;
    }


    /**
     * Sets the DCTime value for this BCInfoType.
     * 
     * @param DCTime
     */
    public void setDCTime(java.util.Calendar DCTime) {
        this.DCTime = DCTime;
    }


    /**
     * Gets the serviceType value for this BCInfoType.
     * 
     * @return serviceType
     */
    public java.lang.String getServiceType() {
        return serviceType;
    }


    /**
     * Sets the serviceType value for this BCInfoType.
     * 
     * @param serviceType
     */
    public void setServiceType(java.lang.String serviceType) {
        this.serviceType = serviceType;
    }


    /**
     * Gets the routeNumber value for this BCInfoType.
     * 
     * @return routeNumber
     */
    public java.lang.String getRouteNumber() {
        return routeNumber;
    }


    /**
     * Sets the routeNumber value for this BCInfoType.
     * 
     * @param routeNumber
     */
    public void setRouteNumber(java.lang.String routeNumber) {
        this.routeNumber = routeNumber;
    }


    /**
     * Gets the RNO value for this BCInfoType.
     * 
     * @return RNO
     */
    public java.lang.String getRNO() {
        return RNO;
    }


    /**
     * Sets the RNO value for this BCInfoType.
     * 
     * @param RNO
     */
    public void setRNO(java.lang.String RNO) {
        this.RNO = RNO;
    }


    /**
     * Gets the DNO value for this BCInfoType.
     * 
     * @return DNO
     */
    public java.lang.String getDNO() {
        return DNO;
    }


    /**
     * Sets the DNO value for this BCInfoType.
     * 
     * @param DNO
     */
    public void setDNO(java.lang.String DNO) {
        this.DNO = DNO;
    }


    /**
     * Gets the NRH value for this BCInfoType.
     * 
     * @return NRH
     */
    public java.lang.String getNRH() {
        return NRH;
    }


    /**
     * Sets the NRH value for this BCInfoType.
     * 
     * @param NRH
     */
    public void setNRH(java.lang.String NRH) {
        this.NRH = NRH;
    }


    /**
     * Gets the resultText value for this BCInfoType.
     * 
     * @return resultText
     */
    public java.lang.String getResultText() {
        return resultText;
    }


    /**
     * Sets the resultText value for this BCInfoType.
     * 
     * @param resultText
     */
    public void setResultText(java.lang.String resultText) {
        this.resultText = resultText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BCInfoType)) return false;
        BCInfoType other = (BCInfoType) obj;
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
            ((this.BCAction==null && other.getBCAction()==null) || 
             (this.BCAction!=null &&
              this.BCAction.equals(other.getBCAction()))) &&
            ((this.DCTime==null && other.getDCTime()==null) || 
             (this.DCTime!=null &&
              this.DCTime.equals(other.getDCTime()))) &&
            ((this.serviceType==null && other.getServiceType()==null) || 
             (this.serviceType!=null &&
              this.serviceType.equals(other.getServiceType()))) &&
            ((this.routeNumber==null && other.getRouteNumber()==null) || 
             (this.routeNumber!=null &&
              this.routeNumber.equals(other.getRouteNumber()))) &&
            ((this.RNO==null && other.getRNO()==null) || 
             (this.RNO!=null &&
              this.RNO.equals(other.getRNO()))) &&
            ((this.DNO==null && other.getDNO()==null) || 
             (this.DNO!=null &&
              this.DNO.equals(other.getDNO()))) &&
            ((this.NRH==null && other.getNRH()==null) || 
             (this.NRH!=null &&
              this.NRH.equals(other.getNRH()))) &&
            ((this.resultText==null && other.getResultText()==null) || 
             (this.resultText!=null &&
              this.resultText.equals(other.getResultText())));
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
        if (getBCAction() != null) {
            _hashCode += getBCAction().hashCode();
        }
        if (getDCTime() != null) {
            _hashCode += getDCTime().hashCode();
        }
        if (getServiceType() != null) {
            _hashCode += getServiceType().hashCode();
        }
        if (getRouteNumber() != null) {
            _hashCode += getRouteNumber().hashCode();
        }
        if (getRNO() != null) {
            _hashCode += getRNO().hashCode();
        }
        if (getDNO() != null) {
            _hashCode += getDNO().hashCode();
        }
        if (getNRH() != null) {
            _hashCode += getNRH().hashCode();
        }
        if (getResultText() != null) {
            _hashCode += getResultText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BCInfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", "BCInfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "SubscriberNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">SubscriberNumber"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BCAction");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "BCAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">BCAction"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DCTime");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "DCTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "ServiceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">ServiceType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "RouteNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">RouteNumber"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RNO");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "RNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">RNO"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DNO");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "DNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">DNO"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NRH");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "NRH"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">NRH"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultText");
        elemField.setXmlName(new javax.xml.namespace.QName("MNPProtocol.xsd", "ResultText"));
        elemField.setXmlType(new javax.xml.namespace.QName("MNPProtocol.xsd", ">ResultText"));
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
