
package com.gcmobile.webservice.client.identifier.nciic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.gcmobile.webservice.client.identifier.finance.BatchCheckResponse;


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
 *         &lt;element name="BatchExactCheckResult" type="{http://schemas.datacontract.org/2004/07/Finance.EPM}BatchCheckResponse" minOccurs="0"/>
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
    "batchExactCheckResult"
})
@XmlRootElement(name = "BatchExactCheckResponse")
public class BatchExactCheckResponse {

    @XmlElementRef(name = "BatchExactCheckResult", namespace = "http://www.nciic.com.cn", type = JAXBElement.class, required = false)
    protected JAXBElement<BatchCheckResponse> batchExactCheckResult;

    /**
     * 获取batchExactCheckResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BatchCheckResponse }{@code >}
     *     
     */
    public JAXBElement<BatchCheckResponse> getBatchExactCheckResult() {
        return batchExactCheckResult;
    }

    /**
     * 设置batchExactCheckResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BatchCheckResponse }{@code >}
     *     
     */
    public void setBatchExactCheckResult(JAXBElement<BatchCheckResponse> value) {
        this.batchExactCheckResult = value;
    }

}
