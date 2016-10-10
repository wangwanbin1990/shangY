
package com.sy.webservice.client.identifier.finance;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CheckResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CheckResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Finance.EPM}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="Identifier" type="{http://schemas.datacontract.org/2004/07/Finance.EPM}IdentifierData" minOccurs="0"/>
 *         &lt;element name="RawXml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckResponse", propOrder = {
    "identifier",
    "rawXml"
})
public class CheckResponse
    extends BaseResponse
{

    @XmlElementRef(name = "Identifier", namespace = "http://schemas.datacontract.org/2004/07/Finance.EPM", type = JAXBElement.class, required = false)
    protected JAXBElement<IdentifierData> identifier;
    @XmlElementRef(name = "RawXml", namespace = "http://schemas.datacontract.org/2004/07/Finance.EPM", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rawXml;

    /**
     * 获取identifier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IdentifierData }{@code >}
     *     
     */
    public JAXBElement<IdentifierData> getIdentifier() {
        return identifier;
    }

    /**
     * 设置identifier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IdentifierData }{@code >}
     *     
     */
    public void setIdentifier(JAXBElement<IdentifierData> value) {
        this.identifier = value;
    }

    /**
     * 获取rawXml属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRawXml() {
        return rawXml;
    }

    /**
     * 设置rawXml属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRawXml(JAXBElement<String> value) {
        this.rawXml = value;
    }

}
