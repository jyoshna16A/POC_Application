
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
 * <p>Java class for NPOTType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NPOTType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{MNPProtocol.xsd}MessageSenderTelco"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}MessageReceiverTelco"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}RequestId"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}Timestamp"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}ReferenceId"/&gt;
 *         &lt;element name="SubscriberSequence"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{MNPProtocol.xsd}SubscriberNumber" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{MNPProtocol.xsd}LSA"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}OrderedTransferTime" minOccurs="0"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}OrderedApprovalTime" minOccurs="0"/&gt;
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
@XmlType(name = "NPOTType", propOrder = {
    "messageSenderTelco",
    "messageReceiverTelco",
    "requestId",
    "timestamp",
    "referenceId",
    "subscriberSequence",
    "lsa",
    "orderedTransferTime",
    "orderedApprovalTime"
})
public class NPOTType {

    @XmlElement(name = "MessageSenderTelco", required = true)
    protected String messageSenderTelco;
    @XmlElement(name = "MessageReceiverTelco", required = true)
    protected String messageReceiverTelco;
    @XmlElement(name = "RequestId", required = true)
    protected String requestId;
    @XmlElement(name = "Timestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(name = "ReferenceId", required = true)
    protected String referenceId;
    @XmlElement(name = "SubscriberSequence", required = true)
    protected NPOTType.SubscriberSequence subscriberSequence;
    @XmlElement(name = "LSA", required = true)
    protected String lsa;
    @XmlElement(name = "OrderedTransferTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderedTransferTime;
    @XmlElement(name = "OrderedApprovalTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderedApprovalTime;
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
     * Gets the value of the referenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Sets the value of the referenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceId(String value) {
        this.referenceId = value;
    }

    /**
     * Gets the value of the subscriberSequence property.
     * 
     * @return
     *     possible object is
     *     {@link NPOTType.SubscriberSequence }
     *     
     */
    public NPOTType.SubscriberSequence getSubscriberSequence() {
        return subscriberSequence;
    }

    /**
     * Sets the value of the subscriberSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link NPOTType.SubscriberSequence }
     *     
     */
    public void setSubscriberSequence(NPOTType.SubscriberSequence value) {
        this.subscriberSequence = value;
    }

    /**
     * Gets the value of the lsa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLSA() {
        return lsa;
    }

    /**
     * Sets the value of the lsa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLSA(String value) {
        this.lsa = value;
    }

    /**
     * Gets the value of the orderedTransferTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderedTransferTime() {
        return orderedTransferTime;
    }

    /**
     * Sets the value of the orderedTransferTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderedTransferTime(XMLGregorianCalendar value) {
        this.orderedTransferTime = value;
    }

    /**
     * Gets the value of the orderedApprovalTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderedApprovalTime() {
        return orderedApprovalTime;
    }

    /**
     * Sets the value of the orderedApprovalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderedApprovalTime(XMLGregorianCalendar value) {
        this.orderedApprovalTime = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{MNPProtocol.xsd}SubscriberNumber" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "subscriberNumber"
    })
    public static class SubscriberSequence {

        @XmlElement(name = "SubscriberNumber", required = true)
        protected List<String> subscriberNumber;

        /**
         * Gets the value of the subscriberNumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the Jakarta XML Binding object.
         * This is why there is not a <CODE>set</CODE> method for the subscriberNumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubscriberNumber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSubscriberNumber() {
            if (subscriberNumber == null) {
                subscriberNumber = new ArrayList<String>();
            }
            return this.subscriberNumber;
        }

    }

}
