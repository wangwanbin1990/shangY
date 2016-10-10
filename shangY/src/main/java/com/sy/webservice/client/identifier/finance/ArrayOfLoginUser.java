
package com.sy.webservice.client.identifier.finance;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfLoginUser complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfLoginUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoginUser" type="{http://schemas.datacontract.org/2004/07/Finance.EPM}LoginUser" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLoginUser", propOrder = {
    "loginUser"
})
public class ArrayOfLoginUser {

    @XmlElement(name = "LoginUser", nillable = true)
    protected List<LoginUser> loginUser;

    /**
     * Gets the value of the loginUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loginUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoginUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoginUser }
     * 
     * 
     */
    public List<LoginUser> getLoginUser() {
        if (loginUser == null) {
            loginUser = new ArrayList<LoginUser>();
        }
        return this.loginUser;
    }

}
