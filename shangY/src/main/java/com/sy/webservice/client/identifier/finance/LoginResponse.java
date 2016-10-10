
package com.sy.webservice.client.identifier.finance;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>LoginResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="LoginResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Finance.EPM}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="ServersXmlData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UserData" type="{http://schemas.datacontract.org/2004/07/Finance.EPM}LoginUser" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginResponse", propOrder = {
    "serversXmlData",
    "userData"
})
public class LoginResponse
    extends BaseResponse
{

    @XmlElementRef(name = "ServersXmlData", namespace = "http://schemas.datacontract.org/2004/07/Finance.EPM", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serversXmlData;
    @XmlElementRef(name = "UserData", namespace = "http://schemas.datacontract.org/2004/07/Finance.EPM", type = JAXBElement.class, required = false)
    protected JAXBElement<LoginUser> userData;

    /**
     * 获取serversXmlData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServersXmlData() {
        return serversXmlData;
    }

    /**
     * 设置serversXmlData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServersXmlData(JAXBElement<String> value) {
        this.serversXmlData = value;
    }

    /**
     * 获取userData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LoginUser }{@code >}
     *     
     */
    public JAXBElement<LoginUser> getUserData() {
        return userData;
    }

    /**
     * 设置userData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LoginUser }{@code >}
     *     
     */
    public void setUserData(JAXBElement<LoginUser> value) {
        this.userData = value;
    }

}
