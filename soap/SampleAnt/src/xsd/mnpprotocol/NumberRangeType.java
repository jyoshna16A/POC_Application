
package xsd.mnpprotocol;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumberRangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumberRangeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{MNPProtocol.xsd}NumberRangeStart"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}NumberRangeEnd"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberRangeType", propOrder = {
    "numberRangeStart",
    "numberRangeEnd"
})
public class NumberRangeType {

    @XmlElement(name = "NumberRangeStart", required = true)
    protected String numberRangeStart;
    @XmlElement(name = "NumberRangeEnd", required = true)
    protected String numberRangeEnd;

    /**
     * Gets the value of the numberRangeStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberRangeStart() {
        return numberRangeStart;
    }

    /**
     * Sets the value of the numberRangeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberRangeStart(String value) {
        this.numberRangeStart = value;
    }

    /**
     * Gets the value of the numberRangeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberRangeEnd() {
        return numberRangeEnd;
    }

    /**
     * Sets the value of the numberRangeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberRangeEnd(String value) {
        this.numberRangeEnd = value;
    }

}
