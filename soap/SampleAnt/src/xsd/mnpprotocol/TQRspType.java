
package xsd.mnpprotocol;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TQRspType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TQRspType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{MNPProtocol.xsd}MessageSenderTelco"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}MessageReceiverTelco"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}RequestId"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}Timestamp"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}ResultCode"/&gt;
 *         &lt;element name="QuotaResult" type="{MNPProtocol.xsd}QuotaResultType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TQRspType", propOrder = {
    "messageSenderTelco",
    "messageReceiverTelco",
    "requestId",
    "timestamp",
    "resultCode",
    "quotaResult"
})
public class TQRspType {

    @XmlElement(name = "MessageSenderTelco", required = true)
    protected String messageSenderTelco;
    @XmlElement(name = "MessageReceiverTelco", required = true)
    protected String messageReceiverTelco;
    @XmlElement(name = "RequestId", required = true)
    protected String requestId;
    @XmlElement(name = "Timestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "ResultCode")
    protected int resultCode;
    @XmlElement(name = "QuotaResult")
    protected List<QuotaResultType> quotaResult;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Gets the value of the messageSenderTelco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageSenderTelco() {
        return messageSenderTelco;
    }

    /**
     * Sets the value of the messageSenderTelco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageSenderTelco(String value) {
        this.messageSenderTelco = value;
    }

    /**
     * Gets the value of the messageReceiverTelco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageReceiverTelco() {
        return messageReceiverTelco;
    }

    /**
     * Sets the value of the messageReceiverTelco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageReceiverTelco(String value) {
        this.messageReceiverTelco = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
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
     * Gets the value of the quotaResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the quotaResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuotaResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuotaResultType }
     * 
     * 
     */
    public List<QuotaResultType> getQuotaResult() {
        if (quotaResult == null) {
            quotaResult = new ArrayList<QuotaResultType>();
        }
        return this.quotaResult;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
