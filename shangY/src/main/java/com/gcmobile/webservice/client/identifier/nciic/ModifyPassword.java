
package com.gcmobile.webservice.client.identifier.nciic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.gcmobile.webservice.client.identifier.finance.Credential;
import com.gcmobile.webservice.client.identifier.finance.ModifyPwdRequest;


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
 *         &lt;element name="request" type="{http://schemas.datacontract.org/2004/07/Finance.EPM}ModifyPwdRequest" minOccurs="0"/>
 *         &lt;element name="cred" type="{http://schemas.datacontract.org/2004/07/Finance.EPM}Credential" minOccurs="0"/>
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
    "request",
    "cred"
})
@XmlRootElement(name = "ModifyPassword")
public class ModifyPassword {

    @XmlElementRef(name = "request", namespace = "http://www.nciic.com.cn", type = JAXBElement.class, required = false)
    protected JAXBElement<ModifyPwdRequest> request;
    @XmlElementRef(name = "cred", namespace = "http://www.nciic.com.cn", type = JAXBElement.class, required = false)
    protected JAXBElement<Credential> cred;

    /**
     * 获取request属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ModifyPwdRequest }{@code >}
     *     
     */
    public JAXBElement<ModifyPwdRequest> getRequest() {
        return request;
    }

    /**
     * 设置request属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ModifyPwdRequest }{@code >}
     *     
     */
    public void setRequest(JAXBElement<ModifyPwdRequest> value) {
        this.request = value;
    }

    /**
     * 获取cred属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Credential }{@code >}
     *     
     */
    public JAXBElement<Credential> getCred() {
        return cred;
    }

    /**
     * 设置cred属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Credential }{@code >}
     *     
     */
    public void setCred(JAXBElement<Credential> value) {
        this.cred = value;
    }

}
