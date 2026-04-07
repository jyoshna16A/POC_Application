
package com.example.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestMessageHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestMessageHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestTrxId" type="{http://oap/services/checkCAPRegenRequestService/types}RequestTransactionType"/>
 *         &lt;element name="messageTimeStamp" type="{http://oap/services/checkCAPRegenRequestService/types}DateFormatType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestMessageHeader", propOrder = {
    "requestTrxId",
    "messageTimeStamp"
})
public class RequestMessageHeader {

    @XmlElement(required = true)
    protected String requestTrxId;
    @XmlElement(required = true)
    protected String messageTimeStamp;

    /**
     * Gets the value of the requestTrxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestTrxId() {
        return requestTrxId;
    }

    /**
     * Sets the value of the requestTrxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestTrxId(String value) {
        this.requestTrxId = value;
    }

    /**
     * Gets the value of the messageTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageTimeStamp() {
        return messageTimeStamp;
    }

    /**
     * Sets the value of the messageTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageTimeStamp(String value) {
        this.messageTimeStamp = value;
    }

}
