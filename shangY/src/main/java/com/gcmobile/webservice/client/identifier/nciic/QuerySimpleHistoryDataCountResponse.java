
package com.gcmobile.webservice.client.identifier.nciic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.gcmobile.webservice.client.identifier.finance.QueryRecordCountResponse;


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
 *         &lt;element name="QuerySimpleHistoryDataCountResult" type="{http://schemas.datacontract.org/2004/07/Finance.EPM}QueryRecordCountResponse" minOccurs="0"/>
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
    "querySimpleHistoryDataCountResult"
})
@XmlRootElement(name = "QuerySimpleHistoryDataCountResponse")
public class QuerySimpleHistoryDataCountResponse {

    @XmlElementRef(name = "QuerySimpleHistoryDataCountResult", namespace = "http://www.nciic.com.cn", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryRecordCountResponse> querySimpleHistoryDataCountResult;

    /**
     * 获取querySimpleHistoryDataCountResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryRecordCountResponse }{@code >}
     *     
     */
    public JAXBElement<QueryRecordCountResponse> getQuerySimpleHistoryDataCountResult() {
        return querySimpleHistoryDataCountResult;
    }

    /**
     * 设置querySimpleHistoryDataCountResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryRecordCountResponse }{@code >}
     *     
     */
    public void setQuerySimpleHistoryDataCountResult(JAXBElement<QueryRecordCountResponse> value) {
        this.querySimpleHistoryDataCountResult = value;
    }

}
