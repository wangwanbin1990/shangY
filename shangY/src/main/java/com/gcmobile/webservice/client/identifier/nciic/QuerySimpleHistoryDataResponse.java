
package com.gcmobile.webservice.client.identifier.nciic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.gcmobile.webservice.client.identifier.finance.QueryHistoryResponse;


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
 *         &lt;element name="QuerySimpleHistoryDataResult" type="{http://schemas.datacontract.org/2004/07/Finance.EPM}QueryHistoryResponse" minOccurs="0"/>
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
    "querySimpleHistoryDataResult"
})
@XmlRootElement(name = "QuerySimpleHistoryDataResponse")
public class QuerySimpleHistoryDataResponse {

    @XmlElementRef(name = "QuerySimpleHistoryDataResult", namespace = "http://www.nciic.com.cn", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryHistoryResponse> querySimpleHistoryDataResult;

    /**
     * 获取querySimpleHistoryDataResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryHistoryResponse }{@code >}
     *     
     */
    public JAXBElement<QueryHistoryResponse> getQuerySimpleHistoryDataResult() {
        return querySimpleHistoryDataResult;
    }

    /**
     * 设置querySimpleHistoryDataResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryHistoryResponse }{@code >}
     *     
     */
    public void setQuerySimpleHistoryDataResult(JAXBElement<QueryHistoryResponse> value) {
        this.querySimpleHistoryDataResult = value;
    }

}
