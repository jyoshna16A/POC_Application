
package xsd.mnpprotocol;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element name="NPO" type="{MNPProtocol.xsd}NPOType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="NVP" type="{MNPProtocol.xsd}NVPType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="NVPA" type="{MNPProtocol.xsd}NVPAType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="NPOT" type="{MNPProtocol.xsd}NPOTType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="CAN" type="{MNPProtocol.xsd}CANType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="NPOS" type="{MNPProtocol.xsd}NPOSType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="NPOSTER" type="{MNPProtocol.xsd}NPOSTERType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="NPOSA" type="{MNPProtocol.xsd}NPOSAType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="NPOSAACK" type="{MNPProtocol.xsd}NPOSAACKType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="NPOSPR" type="{MNPProtocol.xsd}NPOSPRType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="NPOA" type="{MNPProtocol.xsd}NPOAType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="NPOTA" type="{MNPProtocol.xsd}NPOTAType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="PER" type="{MNPProtocol.xsd}PERType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SD" type="{MNPProtocol.xsd}SDType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SDA" type="{MNPProtocol.xsd}SDAType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SC" type="{MNPProtocol.xsd}SCType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SCA" type="{MNPProtocol.xsd}SCAType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SC-NOTICE" type="{MNPProtocol.xsd}SC-NOTICEType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SC-NOTICEA" type="{MNPProtocol.xsd}SC-NOTICEAType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SD-NOTICE" type="{MNPProtocol.xsd}SD-NOTICEType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SD-NOTICEA" type="{MNPProtocol.xsd}SD-NOTICEAType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="RDBPD" type="{MNPProtocol.xsd}RDBPDType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="RDBPDRsp" type="{MNPProtocol.xsd}RDBPDRspType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="RDBFD" type="{MNPProtocol.xsd}RDBFDType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="RDBFDRsp" type="{MNPProtocol.xsd}RDBFDRspType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="RNA" type="{MNPProtocol.xsd}RNAType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="RNAA" type="{MNPProtocol.xsd}RNAAType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="TQ" type="{MNPProtocol.xsd}TQType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="TQRsp" type="{MNPProtocol.xsd}TQRspType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="NPOSQ" type="{MNPProtocol.xsd}NPOSQType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="NPOSQRsp" type="{MNPProtocol.xsd}NPOSQRspType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="NOTE" type="{MNPProtocol.xsd}NOTEType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Rsp" type="{MNPProtocol.xsd}RspType" maxOccurs="unbounded"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "npoOrNVPOrNVPA"
})
@XmlRootElement(name = "MNPFrame")
public class MNPFrame {

    @XmlElements({
        @XmlElement(name = "NPO", type = NPOType.class),
        @XmlElement(name = "NVP", type = NVPType.class),
        @XmlElement(name = "NVPA", type = NVPAType.class),
        @XmlElement(name = "NPOT", type = NPOTType.class),
        @XmlElement(name = "CAN", type = CANType.class),
        @XmlElement(name = "NPOS", type = NPOSType.class),
        @XmlElement(name = "NPOSTER", type = NPOSTERType.class),
        @XmlElement(name = "NPOSA", type = NPOSAType.class),
        @XmlElement(name = "NPOSAACK", type = NPOSAACKType.class),
        @XmlElement(name = "NPOSPR", type = NPOSPRType.class),
        @XmlElement(name = "NPOA", type = NPOAType.class),
        @XmlElement(name = "NPOTA", type = NPOTAType.class),
        @XmlElement(name = "PER", type = PERType.class),
        @XmlElement(name = "SD", type = SDType.class),
        @XmlElement(name = "SDA", type = SDAType.class),
        @XmlElement(name = "SC", type = SCType.class),
        @XmlElement(name = "SCA", type = SCAType.class),
        @XmlElement(name = "SC-NOTICE", type = SCNOTICEType.class),
        @XmlElement(name = "SC-NOTICEA", type = SCNOTICEAType.class),
        @XmlElement(name = "SD-NOTICE", type = SDNOTICEType.class),
        @XmlElement(name = "SD-NOTICEA", type = SDNOTICEAType.class),
        @XmlElement(name = "RDBPD", type = RDBPDType.class),
        @XmlElement(name = "RDBPDRsp", type = RDBPDRspType.class),
        @XmlElement(name = "RDBFD", type = RDBFDType.class),
        @XmlElement(name = "RDBFDRsp", type = RDBFDRspType.class),
        @XmlElement(name = "RNA", type = RNAType.class),
        @XmlElement(name = "RNAA", type = RNAAType.class),
        @XmlElement(name = "TQ", type = TQType.class),
        @XmlElement(name = "TQRsp", type = TQRspType.class),
        @XmlElement(name = "NPOSQ", type = NPOSQType.class),
        @XmlElement(name = "NPOSQRsp", type = NPOSQRspType.class),
        @XmlElement(name = "NOTE", type = NOTEType.class),
        @XmlElement(name = "Rsp", type = RspType.class)
    })
    protected List<Object> npoOrNVPOrNVPA;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Gets the value of the npoOrNVPOrNVPA property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the npoOrNVPOrNVPA property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNPOOrNVPOrNVPA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CANType }
     * {@link NOTEType }
     * {@link NPOAType }
     * {@link NPOSAACKType }
     * {@link NPOSAType }
     * {@link NPOSPRType }
     * {@link NPOSQRspType }
     * {@link NPOSQType }
     * {@link NPOSTERType }
     * {@link NPOSType }
     * {@link NPOTAType }
     * {@link NPOTType }
     * {@link NPOType }
     * {@link NVPAType }
     * {@link NVPType }
     * {@link PERType }
     * {@link RDBFDRspType }
     * {@link RDBFDType }
     * {@link RDBPDRspType }
     * {@link RDBPDType }
     * {@link RNAAType }
     * {@link RNAType }
     * {@link RspType }
     * {@link SCAType }
     * {@link SCNOTICEAType }
     * {@link SCNOTICEType }
     * {@link SCType }
     * {@link SDAType }
     * {@link SDNOTICEAType }
     * {@link SDNOTICEType }
     * {@link SDType }
     * {@link TQRspType }
     * {@link TQType }
     * 
     * 
     */
    public List<Object> getNPOOrNVPOrNVPA() {
        if (npoOrNVPOrNVPA == null) {
            npoOrNVPOrNVPA = new ArrayList<Object>();
        }
        return this.npoOrNVPOrNVPA;
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
