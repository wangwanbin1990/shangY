
package com.gcmobile.webservice.client.identifier.finance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IsExistsResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="IsExistsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/Finance.EPM}BaseResponse">
 *       &lt;sequence>
 *         &lt;element name="IsExists" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IsExistsResponse", propOrder = {
    "isExists"
})
public class IsExistsResponse
    extends BaseResponse
{

    @XmlElement(name = "IsExists")
    protected Boolean isExists;

    /**
     * 获取isExists属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsExists() {
        return isExists;
    }

    /**
     * 设置isExists属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsExists(Boolean value) {
        this.isExists = value;
    }

}
