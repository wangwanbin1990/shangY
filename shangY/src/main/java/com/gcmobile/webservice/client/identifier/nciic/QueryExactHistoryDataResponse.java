
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
 *         &lt;element name="QueryExactHistoryDataResult" type="{http://schemas.datacontract.org/2004/07/Finance.EPM}QueryHistoryResponse" minOccurs="0"/>
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
    "queryExactHistoryDataResult"
})
@XmlRootElement(name = "QueryExactHistoryDataResponse")
public class QueryExactHistoryDataResponse {

    @XmlElementRef(name = "QueryExactHistoryDataResult", namespace = "http://www.nciic.com.cn", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryHistoryResponse> queryExactHistoryDataResult;

    /**
     * 获取queryExactHistoryDataResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryHistoryResponse }{@code >}
     *     
     */
    public JAXBElement<QueryHistoryResponse> getQueryExactHistoryDataResult() {
        return queryExactHistoryDataResult;
    }

    /**
     * 设置queryExactHistoryDataResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryHistoryResponse }{@code >}
     *     
     */
    public void setQueryExactHistoryDataResult(JAXBElement<QueryHistoryResponse> value) {
        this.queryExactHistoryDataResult = value;
    }

}
