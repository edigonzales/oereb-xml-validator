//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.28 at 05:34:43 PM CEST 
//


package ch.ehi.oereb.schemas.gml._3_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RangeSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RangeSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}ValueArray" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}AbstractScalarValueList" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}DataBlock"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}File"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RangeSetType", propOrder = {
    "valueArray",
    "abstractScalarValueList",
    "dataBlock",
    "file"
})
public class RangeSetTypeType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementRef(name = "ValueArray", namespace = "http://www.opengis.net/gml/3.2", type = ValueArray.class, required = false)
    protected List<ValueArray> valueArray;
    @XmlElementRef(name = "AbstractScalarValueList", namespace = "http://www.opengis.net/gml/3.2", type = AbstractScalarValueList.class, required = false)
    protected List<JAXBElement<?>> abstractScalarValueList;
    @XmlElementRef(name = "DataBlock", namespace = "http://www.opengis.net/gml/3.2", type = DataBlock.class, required = false)
    protected DataBlock dataBlock;
    @XmlElementRef(name = "File", namespace = "http://www.opengis.net/gml/3.2", type = File.class, required = false)
    protected File file;

    /**
     * Gets the value of the valueArray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueArray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueArray }
     * 
     * 
     */
    public List<ValueArray> getValueArray() {
        if (valueArray == null) {
            valueArray = new ArrayList<ValueArray>();
        }
        return this.valueArray;
    }

    /**
     * Gets the value of the abstractScalarValueList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abstractScalarValueList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbstractScalarValueList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoryList }
     * {@link AbstractScalarValueList }
     * {@link QuantityList }
     * {@link CountList }
     * {@link BooleanList }
     * 
     * 
     */
    public List<JAXBElement<?>> getAbstractScalarValueList() {
        if (abstractScalarValueList == null) {
            abstractScalarValueList = new ArrayList<JAXBElement<?>>();
        }
        return this.abstractScalarValueList;
    }

    /**
     * Gets the value of the dataBlock property.
     * 
     * @return
     *     possible object is
     *     {@link DataBlock }
     *     
     */
    public DataBlock getDataBlock() {
        return dataBlock;
    }

    /**
     * Sets the value of the dataBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataBlock }
     *     
     */
    public void setDataBlock(DataBlock value) {
        this.dataBlock = value;
    }

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link File }
     *     
     */
    public File getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link File }
     *     
     */
    public void setFile(File value) {
        this.file = value;
    }

}
