
package com.sy.webservice.client.identifier.nciic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.sy.webservice.client.identifier.finance.Credential;
import com.sy.webservice.client.identifier.finance.LoginUser;


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
 *         &lt;element name="user" type="{http://schemas.datacontract.org/2004/07/Finance.EPM}LoginUser" minOccurs="0"/>
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
    "user",
    "cred"
})
@XmlRootElement(name = "ModifyUser")
public class ModifyUser {

    @XmlElementRef(name = "user", namespace = "http://www.nciic.com.cn", type = JAXBElement.class, required = false)
    protected JAXBElement<LoginUser> user;
    @XmlElementRef(name = "cred", namespace = "http://www.nciic.com.cn", type = JAXBElement.class, required = false)
    protected JAXBElement<Credential> cred;

    /**
     * 获取user属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LoginUser }{@code >}
     *     
     */
    public JAXBElement<LoginUser> getUser() {
        return user;
    }

    /**
     * 设置user属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LoginUser }{@code >}
     *     
     */
    public void setUser(JAXBElement<LoginUser> value) {
        this.user = value;
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
