
package xsd.mnpprotocol;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NVPAType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NVPAType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{MNPProtocol.xsd}MessageSenderTelco"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}MessageReceiverTelco"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}RequestId"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}Timestamp"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}ReferenceId"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}SubscriberNumber"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}Corporate"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}ContractualObligation"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}ActivateAging"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}OwnershipChange"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}OutstandingBill"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}UnderSub-judice"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}PortingProhibited"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}SimSwap"/&gt;
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
@XmlType(name = "NVPAType", propOrder = {
    "messageSenderTelco",
    "messageReceiverTelco",
    "requestId",
    "timestamp",
    "referenceId",
    "subscriberNumber",
    "corporate",
    "contractualObligation",
    "activateAging",
    "ownershipChange",
    "outstandingBill",
    "underSubJudice",
    "portingProhibited",
    "simSwap"
})
public class NVPAType {

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
    @XmlElement(name = "SubscriberNumber", required = true)
    protected String subscriberNumber;
    @XmlElement(name = "Corporate", required = true)
    protected String corporate;
    @XmlElement(name = "ContractualObligation", required = true)
    protected String contractualObligation;
    @XmlElement(name = "ActivateAging", required = true)
    protected String activateAging;
    @XmlElement(name = "OwnershipChange", required = true)
    protected String ownershipChange;
    @XmlElement(name = "OutstandingBill", required = true)
    protected String outstandingBill;
    @XmlElement(name = "UnderSub-judice", required = true)
    protected String underSubJudice;
    @XmlElement(name = "PortingProhibited", required = true)
    protected String portingProhibited;
    @XmlElement(name = "SimSwap", required = true)
    protected String simSwap;
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
     * Gets the value of the corporate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporate() {
        return corporate;
    }

    /**
     * Sets the value of the corporate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporate(String value) {
        this.corporate = value;
    }

    /**
     * Gets the value of the contractualObligation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractualObligation() {
        return contractualObligation;
    }

    /**
     * Sets the value of the contractualObligation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractualObligation(String value) {
        this.contractualObligation = value;
    }

    /**
     * Gets the value of the activateAging property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivateAging() {
        return activateAging;
    }

    /**
     * Sets the value of the activateAging property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivateAging(String value) {
        this.activateAging = value;
    }

    /**
     * Gets the value of the ownershipChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnershipChange() {
        return ownershipChange;
    }

    /**
     * Sets the value of the ownershipChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnershipChange(String value) {
        this.ownershipChange = value;
    }

    /**
     * Gets the value of the outstandingBill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutstandingBill() {
        return outstandingBill;
    }

    /**
     * Sets the value of the outstandingBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutstandingBill(String value) {
        this.outstandingBill = value;
    }

    /**
     * Gets the value of the underSubJudice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnderSubJudice() {
        return underSubJudice;
    }

    /**
     * Sets the value of the underSubJudice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnderSubJudice(String value) {
        this.underSubJudice = value;
    }

    /**
     * Gets the value of the portingProhibited property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortingProhibited() {
        return portingProhibited;
    }

    /**
     * Sets the value of the portingProhibited property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortingProhibited(String value) {
        this.portingProhibited = value;
    }

    /**
     * Gets the value of the simSwap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimSwap() {
        return simSwap;
    }

    /**
     * Sets the value of the simSwap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimSwap(String value) {
        this.simSwap = value;
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
