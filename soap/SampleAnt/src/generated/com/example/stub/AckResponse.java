
package com.example.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ackResponse" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ackResponse"
})
@XmlRootElement(name = "ackResponse")
public class AckResponse {

    protected int ackResponse;

    /**
     * Gets the value of the ackResponse property.
     * 
     */
    public int getAckResponse() {
        return ackResponse;
    }

    /**
     * Sets the value of the ackResponse property.
     * 
     */
    public void setAckResponse(int value) {
        this.ackResponse = value;
    }

}
