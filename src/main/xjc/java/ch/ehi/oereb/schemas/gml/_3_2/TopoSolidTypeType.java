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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TopoSolidType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TopoSolidType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractTopoPrimitiveType">
 *       &lt;sequence>
 *         &lt;element name="isolated" type="{http://www.opengis.net/gml/3.2}NodeOrEdgePropertyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}directedFace" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}solidProperty" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}AggregationAttributeGroup"/>
 *       &lt;attribute name="universal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopoSolidType", propOrder = {
    "isolated",
    "directedFace",
    "solidProperty"
})
public class TopoSolidTypeType
    extends AbstractTopoPrimitiveTypeType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<NodeOrEdgePropertyTypeType> isolated;
    @XmlElementRef(name = "directedFace", namespace = "http://www.opengis.net/gml/3.2", type = DirectedFace.class)
    protected List<DirectedFace> directedFace;
    @XmlElementRef(name = "solidProperty", namespace = "http://www.opengis.net/gml/3.2", type = SolidProperty.class, required = false)
    protected SolidProperty solidProperty;
    @XmlAttribute(name = "universal")
    protected java.lang.Boolean universal;
    @XmlAttribute(name = "aggregationType")
    protected AggregationTypeType aggregationType;

    /**
     * Gets the value of the isolated property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isolated property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsolated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NodeOrEdgePropertyTypeType }
     * 
     * 
     */
    public List<NodeOrEdgePropertyTypeType> getIsolated() {
        if (isolated == null) {
            isolated = new ArrayList<NodeOrEdgePropertyTypeType>();
        }
        return this.isolated;
    }

    /**
     * Gets the value of the directedFace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directedFace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirectedFace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectedFace }
     * 
     * 
     */
    public List<DirectedFace> getDirectedFace() {
        if (directedFace == null) {
            directedFace = new ArrayList<DirectedFace>();
        }
        return this.directedFace;
    }

    /**
     * Gets the value of the solidProperty property.
     * 
     * @return
     *     possible object is
     *     {@link SolidProperty }
     *     
     */
    public SolidProperty getSolidProperty() {
        return solidProperty;
    }

    /**
     * Sets the value of the solidProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolidProperty }
     *     
     */
    public void setSolidProperty(SolidProperty value) {
        this.solidProperty = value;
    }

    /**
     * Gets the value of the universal property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Boolean }
     *     
     */
    public boolean isUniversal() {
        if (universal == null) {
            return false;
        } else {
            return universal;
        }
    }

    /**
     * Sets the value of the universal property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Boolean }
     *     
     */
    public void setUniversal(java.lang.Boolean value) {
        this.universal = value;
    }

    /**
     * Gets the value of the aggregationType property.
     * 
     * @return
     *     possible object is
     *     {@link AggregationTypeType }
     *     
     */
    public AggregationTypeType getAggregationType() {
        return aggregationType;
    }

    /**
     * Sets the value of the aggregationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregationTypeType }
     *     
     */
    public void setAggregationType(AggregationTypeType value) {
        this.aggregationType = value;
    }

}
