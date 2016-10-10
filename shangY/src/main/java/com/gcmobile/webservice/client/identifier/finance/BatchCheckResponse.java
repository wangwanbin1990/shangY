
package com.gcmobile.webservice.client.identifier.finance;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BatchCheckResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BatchCheckResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Finance.EPM}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="Identifiers" type="{http://schemas.datacontract.org/2004/07/Finance.EPM}ArrayOfIdentifierData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchCheckResponse", propOrder = {
    "identifiers"
})
public class BatchCheckResponse
    extends BaseResponse
{

    @XmlElementRef(name = "Identifiers", namespace = "http://schemas.datacontract.org/2004/07/Finance.EPM", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfIdentifierData> identifiers;

    /**
     * 获取identifiers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfIdentifierData }{@code >}
     *     
     */
    public JAXBElement<ArrayOfIdentifierData> getIdentifiers() {
        return identifiers;
    }

    /**
     * 设置identifiers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfIdentifierData }{@code >}
     *     
     */
    public void setIdentifiers(JAXBElement<ArrayOfIdentifierData> value) {
        this.identifiers = value;
    }

}
