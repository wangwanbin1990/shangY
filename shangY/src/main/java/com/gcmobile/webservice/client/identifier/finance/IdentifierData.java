
package com.gcmobile.webservice.client.identifier.finance;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>IdentifierData complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="IdentifierData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BirthPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Education" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FormerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsQueryCitizen" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NativePlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Photo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QueryTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifierData", propOrder = {
    "address",
    "birthPlace",
    "birthday",
    "company",
    "education",
    "formerName",
    "idNumber",
    "isQueryCitizen",
    "maritalStatus",
    "name",
    "nation",
    "nativePlace",
    "photo",
    "queryTime",
    "result",
    "sex"
})
public class IdentifierData {

    @XmlElementRef(name = "Address", namespace = "http://schemas.datacontract.org/2004/07/Finance.EPM", type = JAXBElement.class, required = false)
    protected JAXBElement<String> address;
    @XmlElementRef(name = "BirthPlace", namespace = "http://schemas.datacontract.org/2004/07/Finance.EPM", type = JAXBElement.class, required = false)
    protected JAXBElement<String> birthPlace;
    @XmlElementRef(name = "Birthday", namespace = "http://schemas.datacontract.org/2004/07/Finance.EPM", type = JAXBElement.class, required = false)
    protected JAXBElement<String> birthday;
    @XmlElementRef(name = "Company", namespace = "http://schemas.datacontract.org/2004/07/Finance.EPM", type = JAXBElement.class, required = false)
    protected JAXBElement<String> company;
    @XmlElementRef(name = "Education", namespace = "http://schemas.datacontract.org/2004/07/Finance.EPM", type = JAXBElement.class, required = false)
    protected JAXBElement<String> education;
    @XmlElementRef(name = "FormerName", namespace = "http://schemas.datacontract.org/2004/07/Finance.EPM", type = JAXBElement.class, required = false)
    protected JAXBElement<String> formerName;
    @XmlElementRef(name = "IDNumber", namespace = "http://schemas.datacontract.org/2004/07/Finance.EPM", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idNumber;
    @XmlElement(name = "IsQueryCitizen")
    protected Boolean isQueryCitizen;
    @XmlElementRef(name = "MaritalStatus", namespace = "http://schemas.datacontract.org/2004/07/Finance.EPM", type = JAXBElement.class, required = false)
    protected JAXBElement<String> maritalStatus;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/Finance.EPM", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Nation", namespace = "http://schemas.datacontract.org/2004/07/Finance.EPM", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nation;
    @XmlElementRef(name = "NativePlace", namespace = "http://schemas.datacontract.org/2004/07/Finance.EPM", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nativePlace;
    @XmlElementRef(name = "Photo", namespace = "http://schemas.datacontract.org/2004/07/Finance.EPM", type = JAXBElement.class, required = false)
    protected JAXBElement<String> photo;
    @XmlElementRef(name = "QueryTime", namespace = "http://schemas.datacontract.org/2004/07/Finance.EPM", type = JAXBElement.class, required = false)
    protected JAXBElement<String> queryTime;
    @XmlElementRef(name = "Result", namespace = "http://schemas.datacontract.org/2004/07/Finance.EPM", type = JAXBElement.class, required = false)
    protected JAXBElement<String> result;
    @XmlElementRef(name = "Sex", namespace = "http://schemas.datacontract.org/2004/07/Finance.EPM", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sex;

    /**
     * 获取address属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddress(JAXBElement<String> value) {
        this.address = value;
    }

    /**
     * 获取birthPlace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBirthPlace() {
        return birthPlace;
    }

    /**
     * 设置birthPlace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBirthPlace(JAXBElement<String> value) {
        this.birthPlace = value;
    }

    /**
     * 获取birthday属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBirthday() {
        return birthday;
    }

    /**
     * 设置birthday属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBirthday(JAXBElement<String> value) {
        this.birthday = value;
    }

    /**
     * 获取company属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompany() {
        return company;
    }

    /**
     * 设置company属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompany(JAXBElement<String> value) {
        this.company = value;
    }

    /**
     * 获取education属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEducation() {
        return education;
    }

    /**
     * 设置education属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEducation(JAXBElement<String> value) {
        this.education = value;
    }

    /**
     * 获取formerName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormerName() {
        return formerName;
    }

    /**
     * 设置formerName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormerName(JAXBElement<String> value) {
        this.formerName = value;
    }

    /**
     * 获取idNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIDNumber() {
        return idNumber;
    }

    /**
     * 设置idNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIDNumber(JAXBElement<String> value) {
        this.idNumber = value;
    }

    /**
     * 获取isQueryCitizen属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsQueryCitizen() {
        return isQueryCitizen;
    }

    /**
     * 设置isQueryCitizen属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsQueryCitizen(Boolean value) {
        this.isQueryCitizen = value;
    }

    /**
     * 获取maritalStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * 设置maritalStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaritalStatus(JAXBElement<String> value) {
        this.maritalStatus = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * 获取nation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNation() {
        return nation;
    }

    /**
     * 设置nation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNation(JAXBElement<String> value) {
        this.nation = value;
    }

    /**
     * 获取nativePlace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNativePlace() {
        return nativePlace;
    }

    /**
     * 设置nativePlace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNativePlace(JAXBElement<String> value) {
        this.nativePlace = value;
    }

    /**
     * 获取photo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhoto() {
        return photo;
    }

    /**
     * 设置photo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhoto(JAXBElement<String> value) {
        this.photo = value;
    }

    /**
     * 获取queryTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQueryTime() {
        return queryTime;
    }

    /**
     * 设置queryTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQueryTime(JAXBElement<String> value) {
        this.queryTime = value;
    }

    /**
     * 获取result属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResult() {
        return result;
    }

    /**
     * 设置result属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResult(JAXBElement<String> value) {
        this.result = value;
    }

    /**
     * 获取sex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSex() {
        return sex;
    }

    /**
     * 设置sex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSex(JAXBElement<String> value) {
        this.sex = value;
    }

}
