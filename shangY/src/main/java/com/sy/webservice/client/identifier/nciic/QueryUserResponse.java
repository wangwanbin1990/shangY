
package com.sy.webservice.client.identifier.nciic;

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
 *         &lt;element name="QueryUserResult" type="{http://schemas.datacontract.org/2004/07/Finance.EPM}QueryUserResponse" minOccurs="0"/>
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
    "queryUserResult"
})
@XmlRootElement(name = "QueryUserResponse")
public class QueryUserResponse {

    @XmlElementRef(name = "QueryUserResult", namespace = "http://www.nciic.com.cn", type = JAXBElement.class, required = false)
    protected JAXBElement<com.sy.webservice.client.identifier.finance.QueryUserResponse> queryUserResult;

    /**
     * 获取queryUserResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link com.sy.webservice.client.identifier.finance.QueryUserResponse }{@code >}
     *     
     */
    public JAXBElement<com.sy.webservice.client.identifier.finance.QueryUserResponse> getQueryUserResult() {
        return queryUserResult;
    }

    /**
     * 设置queryUserResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link com.sy.webservice.client.identifier.finance.QueryUserResponse }{@code >}
     *     
     */
    public void setQueryUserResult(JAXBElement<com.sy.webservice.client.identifier.finance.QueryUserResponse> value) {
        this.queryUserResult = value;
    }

}
