
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
 *         &lt;element name="ExactCheckByJsonResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "exactCheckByJsonResult"
})
@XmlRootElement(name = "ExactCheckByJsonResponse")
public class ExactCheckByJsonResponse {

    @XmlElementRef(name = "ExactCheckByJsonResult", namespace = "http://www.nciic.com.cn", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exactCheckByJsonResult;

    /**
     * 获取exactCheckByJsonResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExactCheckByJsonResult() {
        return exactCheckByJsonResult;
    }

    /**
     * 设置exactCheckByJsonResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExactCheckByJsonResult(JAXBElement<String> value) {
        this.exactCheckByJsonResult = value;
    }

}
