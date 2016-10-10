
package com.sy.webservice.client.identifier.finance;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QueryUserResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="QueryUserResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Finance.EPM}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="Users" type="{http://schemas.datacontract.org/2004/07/Finance.EPM}ArrayOfLoginUser" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryUserResponse", propOrder = {
    "users"
})
public class QueryUserResponse
    extends BaseResponse
{

    @XmlElementRef(name = "Users", namespace = "http://schemas.datacontract.org/2004/07/Finance.EPM", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfLoginUser> users;

    /**
     * 获取users属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLoginUser }{@code >}
     *     
     */
    public JAXBElement<ArrayOfLoginUser> getUsers() {
        return users;
    }

    /**
     * 设置users属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfLoginUser }{@code >}
     *     
     */
    public void setUsers(JAXBElement<ArrayOfLoginUser> value) {
        this.users = value;
    }

}
