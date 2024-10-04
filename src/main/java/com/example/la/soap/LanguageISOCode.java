
package com.example.la.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="sLanguageName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sLanguageName"
})
@XmlRootElement(name = "LanguageISOCode")
public class LanguageISOCode {

    @XmlElement(required = true)
    protected String sLanguageName;

    /**
     * Obtiene el valor de la propiedad sLanguageName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSLanguageName() {
        return sLanguageName;
    }

    /**
     * Define el valor de la propiedad sLanguageName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSLanguageName(String value) {
        this.sLanguageName = value;
    }

}
