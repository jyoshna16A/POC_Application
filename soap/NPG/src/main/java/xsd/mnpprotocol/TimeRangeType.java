
package xsd.mnpprotocol;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeRangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeRangeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{MNPProtocol.xsd}TimeRangeStart"/&gt;
 *         &lt;element ref="{MNPProtocol.xsd}TimeRangeEnd"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeRangeType", propOrder = {
    "timeRangeStart",
    "timeRangeEnd"
})
public class TimeRangeType {

    @XmlElement(name = "TimeRangeStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeRangeStart;
    @XmlElement(name = "TimeRangeEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeRangeEnd;

    /**
     * Gets the value of the timeRangeStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeRangeStart() {
        return timeRangeStart;
    }

    /**
     * Sets the value of the timeRangeStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeRangeStart(XMLGregorianCalendar value) {
        this.timeRangeStart = value;
    }

    /**
     * Gets the value of the timeRangeEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeRangeEnd() {
        return timeRangeEnd;
    }

    /**
     * Sets the value of the timeRangeEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeRangeEnd(XMLGregorianCalendar value) {
        this.timeRangeEnd = value;
    }

}
