
package cn.lonsun.staticcenter.exproject.tgq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xxfl_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "xxflCode",
    "unit"
})
@XmlRootElement(name = "GetColumnJson")
public class GetColumnJson {

    @XmlElement(name = "xxfl_code")
    protected String xxflCode;
    protected String unit;

    /**
     * Gets the value of the xxflCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXxflCode() {
        return xxflCode;
    }

    /**
     * Sets the value of the xxflCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXxflCode(String value) {
        this.xxflCode = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

}