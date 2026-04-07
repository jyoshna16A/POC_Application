
package xsd.mnpprotocol;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriberResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriberResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{MNPProtocol.xsd}SubscriberNumber"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}ResultCode"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}ResultCode2" minOccurs="0"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}ResultCode3" minOccurs="0"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}ResultText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriberResultType", propOrder = {
    "subscriberNumber",
    "resultCode",
    "resultCode2",
    "resultCode3",
    "resultText"
})
public class SubscriberResultType {

    @XmlElement(name = "SubscriberNumber", required = true)
    protected String subscriberNumber;
    @XmlElement(name = "ResultCode")
    protected int resultCode;
    @XmlElement(name = "ResultCode2")
    protected Integer resultCode2;
    @XmlElement(name = "ResultCode3")
    protected Integer resultCode3;
    @XmlElement(name = "ResultText")
    protected String resultText;

    /**
     * Gets the value of the subscriberNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberNumber() {
        return subscriberNumber;
    }

    /**
     * Sets the value of the subscriberNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberNumber(String value) {
        this.subscriberNumber = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     */
    public int getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     */
    public void setResultCode(int value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the resultCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResultCode2() {
        return resultCode2;
    }

    /**
     * Sets the value of the resultCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResultCode2(Integer value) {
        this.resultCode2 = value;
    }

    /**
     * Gets the value of the resultCode3 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getResultCode3() {
        return resultCode3;
    }

    /**
     * Sets the value of the resultCode3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setResultCode3(Integer value) {
        this.resultCode3 = value;
    }

    /**
     * Gets the value of the resultText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultText() {
        return resultText;
    }

    /**
     * Sets the value of the resultText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultText(String value) {
        this.resultText = value;
    }

}
