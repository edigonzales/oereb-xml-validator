//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.07.28 at 05:34:43 PM CEST 
//


package ch.ehi.oereb.schemas.gml._3_2;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitDefinitionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}DefinitionType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}quantityType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}quantityTypeReference" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/gml/3.2}catalogSymbol" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitDefinitionType", propOrder = {
    "quantityType",
    "quantityTypeReference",
    "catalogSymbol"
})
@XmlSeeAlso({
    BaseUnitTypeType.class,
    ConventionalUnitTypeType.class,
    DerivedUnitTypeType.class
})
public class UnitDefinitionTypeType
    extends DefinitionTypeType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElementRef(name = "quantityType", namespace = "http://www.opengis.net/gml/3.2", type = QuantityType.class, required = false)
    protected QuantityType quantityType;
    @XmlElementRef(name = "quantityTypeReference", namespace = "http://www.opengis.net/gml/3.2", type = QuantityTypeReference.class, required = false)
    protected QuantityTypeReference quantityTypeReference;
    @XmlElementRef(name = "catalogSymbol", namespace = "http://www.opengis.net/gml/3.2", type = CatalogSymbol.class, required = false)
    protected CatalogSymbol catalogSymbol;

    /**
     * Gets the value of the quantityType property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getQuantityType() {
        return quantityType;
    }

    /**
     * Sets the value of the quantityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setQuantityType(QuantityType value) {
        this.quantityType = value;
    }

    /**
     * Gets the value of the quantityTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityTypeReference }
     *     
     */
    public QuantityTypeReference getQuantityTypeReference() {
        return quantityTypeReference;
    }

    /**
     * Sets the value of the quantityTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityTypeReference }
     *     
     */
    public void setQuantityTypeReference(QuantityTypeReference value) {
        this.quantityTypeReference = value;
    }

    /**
     * Gets the value of the catalogSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogSymbol }
     *     
     */
    public CatalogSymbol getCatalogSymbol() {
        return catalogSymbol;
    }

    /**
     * Sets the value of the catalogSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogSymbol }
     *     
     */
    public void setCatalogSymbol(CatalogSymbol value) {
        this.catalogSymbol = value;
    }

}
