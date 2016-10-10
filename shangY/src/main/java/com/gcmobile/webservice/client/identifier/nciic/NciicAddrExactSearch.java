
package com.gcmobile.webservice.client.identifier.nciic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inLicense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inConditions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "inLicense",
    "inConditions"
})
@XmlRootElement(name = "nciicAddrExactSearch")
public class NciicAddrExactSearch {

    @XmlElementRef(name = "inLicense", namespace = "http://www.nciic.com.cn", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inLicense;
    @XmlElementRef(name = "inConditions", namespace = "http://www.nciic.com.cn", type = JAXBElement.class, required = false)
    protected JAXBElement<String> inConditions;

    /**
     * 获取inLicense属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInLicense() {
        return inLicense;
    }

    /**
     * 设置inLicense属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInLicense(JAXBElement<String> value) {
        this.inLicense = value;
    }

    /**
     * 获取inConditions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInConditions() {
        return inConditions;
    }

    /**
     * 设置inConditions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInConditions(JAXBElement<String> value) {
        this.inConditions = value;
    }

}
