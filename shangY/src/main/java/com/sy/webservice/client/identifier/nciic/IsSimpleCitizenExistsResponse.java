
package com.sy.webservice.client.identifier.nciic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.sy.webservice.client.identifier.finance.IsExistsResponse;


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
 *         &lt;element name="IsSimpleCitizenExistsResult" type="{http://schemas.datacontract.org/2004/07/Finance.EPM}IsExistsResponse" minOccurs="0"/>
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
    "isSimpleCitizenExistsResult"
})
@XmlRootElement(name = "IsSimpleCitizenExistsResponse")
public class IsSimpleCitizenExistsResponse {

    @XmlElementRef(name = "IsSimpleCitizenExistsResult", namespace = "http://www.nciic.com.cn", type = JAXBElement.class, required = false)
    protected JAXBElement<IsExistsResponse> isSimpleCitizenExistsResult;

    /**
     * 获取isSimpleCitizenExistsResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IsExistsResponse }{@code >}
     *     
     */
    public JAXBElement<IsExistsResponse> getIsSimpleCitizenExistsResult() {
        return isSimpleCitizenExistsResult;
    }

    /**
     * 设置isSimpleCitizenExistsResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IsExistsResponse }{@code >}
     *     
     */
    public void setIsSimpleCitizenExistsResult(JAXBElement<IsExistsResponse> value) {
        this.isSimpleCitizenExistsResult = value;
    }

}
