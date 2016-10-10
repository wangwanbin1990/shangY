
package com.gcmobile.webservice.client.identifier.finance;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BatchCheckRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BatchCheckRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Items" type="{http://schemas.datacontract.org/2004/07/Finance.EPM}ArrayOfCheckRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchCheckRequest", propOrder = {
    "items"
})
public class BatchCheckRequest {

    @XmlElementRef(name = "Items", namespace = "http://schemas.datacontract.org/2004/07/Finance.EPM", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCheckRequest> items;

    /**
     * 获取items属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCheckRequest }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCheckRequest> getItems() {
        return items;
    }

    /**
     * 设置items属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCheckRequest }{@code >}
     *     
     */
    public void setItems(JAXBElement<ArrayOfCheckRequest> value) {
        this.items = value;
    }

}
