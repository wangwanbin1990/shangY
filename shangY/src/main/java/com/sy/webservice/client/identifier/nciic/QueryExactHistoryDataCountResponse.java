
package com.sy.webservice.client.identifier.nciic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.sy.webservice.client.identifier.finance.QueryRecordCountResponse;


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
 *         &lt;element name="QueryExactHistoryDataCountResult" type="{http://schemas.datacontract.org/2004/07/Finance.EPM}QueryRecordCountResponse" minOccurs="0"/>
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
    "queryExactHistoryDataCountResult"
})
@XmlRootElement(name = "QueryExactHistoryDataCountResponse")
public class QueryExactHistoryDataCountResponse {

    @XmlElementRef(name = "QueryExactHistoryDataCountResult", namespace = "http://www.nciic.com.cn", type = JAXBElement.class, required = false)
    protected JAXBElement<QueryRecordCountResponse> queryExactHistoryDataCountResult;

    /**
     * 获取queryExactHistoryDataCountResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link QueryRecordCountResponse }{@code >}
     *     
     */
    public JAXBElement<QueryRecordCountResponse> getQueryExactHistoryDataCountResult() {
        return queryExactHistoryDataCountResult;
    }

    /**
     * 设置queryExactHistoryDataCountResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link QueryRecordCountResponse }{@code >}
     *     
     */
    public void setQueryExactHistoryDataCountResult(JAXBElement<QueryRecordCountResponse> value) {
        this.queryExactHistoryDataCountResult = value;
    }

}
