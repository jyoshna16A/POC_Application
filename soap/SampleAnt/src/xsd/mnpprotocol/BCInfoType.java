
package xsd.mnpprotocol;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BCInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BCInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{MNPProtocol.xsd}SubscriberNumber"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}BCAction"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}DCTime"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}ServiceType"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}RouteNumber"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}RNO"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}DNO"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}NRH"/&gt;
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
@XmlType(name = "BCInfoType", propOrder = {
    "subscriberNumber",
    "bcAction",
    "dcTime",
    "serviceType",
    "routeNumber",
    "rno",
    "dno",
    "nrh",
    "resultText"
})
public class BCInfoType {

    @XmlElement(name = "SubscriberNumber", required = true)
    protected String subscriberNumber;
    @XmlElement(name = "BCAction")
    protected int bcAction;
    @XmlElement(name = "DCTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dcTime;
    @XmlElement(name = "ServiceType", required = true)
    protected String serviceType;
    @XmlElement(name = "RouteNumber", required = true)
    protected String routeNumber;
    @XmlElement(name = "RNO", required = true)
    protected String rno;
    @XmlElement(name = "DNO", required = true)
    protected String dno;
    @XmlElement(name = "NRH", required = true)
    protected String nrh;
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
     * Gets the value of the bcAction property.
     * 
     */
    public int getBCAction() {
        return bcAction;
    }

    /**
     * Sets the value of the bcAction property.
     * 
     */
    public void setBCAction(int value) {
        this.bcAction = value;
    }

    /**
     * Gets the value of the dcTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDCTime() {
        return dcTime;
    }

    /**
     * Sets the value of the dcTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDCTime(XMLGregorianCalendar value) {
        this.dcTime = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the routeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteNumber() {
        return routeNumber;
    }

    /**
     * Sets the value of the routeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteNumber(String value) {
        this.routeNumber = value;
    }

    /**
     * Gets the value of the rno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRNO() {
        return rno;
    }

    /**
     * Sets the value of the rno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRNO(String value) {
        this.rno = value;
    }

    /**
     * Gets the value of the dno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNO() {
        return dno;
    }

    /**
     * Sets the value of the dno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNO(String value) {
        this.dno = value;
    }

    /**
     * Gets the value of the nrh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNRH() {
        return nrh;
    }

    /**
     * Sets the value of the nrh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNRH(String value) {
        this.nrh = value;
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
