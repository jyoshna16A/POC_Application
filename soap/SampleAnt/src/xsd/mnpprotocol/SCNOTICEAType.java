
package xsd.mnpprotocol;

import java.math.BigInteger;
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
 * <p>Java class for SC-NOTICEAType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SC-NOTICEAType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{MNPProtocol.xsd}MessageSenderTelco"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}MessageReceiverTelco"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}RequestId"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}Timestamp"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}BatchId"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}Success"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}Fail"/&gt;
 *         &lt;element name="SubscriberResult" type="{MNPProtocol.xsd}SubscriberResultType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "SC-NOTICEAType", propOrder = {
    "messageSenderTelco",
    "messageReceiverTelco",
    "requestId",
    "timestamp",
    "batchId",
    "success",
    "fail",
    "subscriberResult"
})
public class SCNOTICEAType {

    @XmlElement(name = "MessageSenderTelco", required = true)
    protected String messageSenderTelco;
    @XmlElement(name = "MessageReceiverTelco", required = true)
    protected String messageReceiverTelco;
    @XmlElement(name = "RequestId", required = true)
    protected String requestId;
    @XmlElement(name = "Timestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "BatchId", required = true)
    protected String batchId;
    @XmlElement(name = "Success", required = true)
    protected BigInteger success;
    @XmlElement(name = "Fail", required = true)
    protected BigInteger fail;
    @XmlElement(name = "SubscriberResult")
    protected List<SubscriberResultType> subscriberResult;
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
     * Gets the value of the batchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * Sets the value of the batchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchId(String value) {
        this.batchId = value;
    }

    /**
     * Gets the value of the success property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSuccess(BigInteger value) {
        this.success = value;
    }

    /**
     * Gets the value of the fail property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFail() {
        return fail;
    }

    /**
     * Sets the value of the fail property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFail(BigInteger value) {
        this.fail = value;
    }

    /**
     * Gets the value of the subscriberResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the subscriberResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriberResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriberResultType }
     * 
     * 
     */
    public List<SubscriberResultType> getSubscriberResult() {
        if (subscriberResult == null) {
            subscriberResult = new ArrayList<SubscriberResultType>();
        }
        return this.subscriberResult;
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
