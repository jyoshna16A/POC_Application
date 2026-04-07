
package xsd.mnpprotocol;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonCustomerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonCustomerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{MNPProtocol.xsd}OwnerName"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}OwnerId"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}TypeOfId"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}SignatureDate"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonCustomerType", propOrder = {
    "ownerName",
    "ownerId",
    "typeOfId",
    "signatureDate"
})
public class PersonCustomerType {

    @XmlElement(name = "OwnerName", required = true)
    protected String ownerName;
    @XmlElement(name = "OwnerId", required = true)
    protected String ownerId;
    @XmlElement(name = "TypeOfId")
    protected int typeOfId;
    @XmlElement(name = "SignatureDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signatureDate;

    /**
     * Gets the value of the ownerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    /**
     * Gets the value of the ownerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * Sets the value of the ownerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerId(String value) {
        this.ownerId = value;
    }

    /**
     * Gets the value of the typeOfId property.
     * 
     */
    public int getTypeOfId() {
        return typeOfId;
    }

    /**
     * Sets the value of the typeOfId property.
     * 
     */
    public void setTypeOfId(int value) {
        this.typeOfId = value;
    }

    /**
     * Gets the value of the signatureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignatureDate() {
        return signatureDate;
    }

    /**
     * Sets the value of the signatureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignatureDate(XMLGregorianCalendar value) {
        this.signatureDate = value;
    }

}
