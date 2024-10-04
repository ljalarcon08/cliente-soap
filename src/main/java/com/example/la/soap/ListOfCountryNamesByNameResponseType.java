
package com.example.la.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ListOfCountryNamesByNameResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="ListOfCountryNamesByNameResponseType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ListOfCountryNamesByNameResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOfCountryNames"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfCountryNamesByNameResponseType", propOrder = {
    "listOfCountryNamesByNameResult"
})
public class ListOfCountryNamesByNameResponseType {

    @XmlElement(name = "ListOfCountryNamesByNameResult", required = true)
    protected ArrayOfCountryNames listOfCountryNamesByNameResult;

    /**
     * Obtiene el valor de la propiedad listOfCountryNamesByNameResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCountryNames }
     *     
     */
    public ArrayOfCountryNames getListOfCountryNamesByNameResult() {
        return listOfCountryNamesByNameResult;
    }

    /**
     * Define el valor de la propiedad listOfCountryNamesByNameResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCountryNames }
     *     
     */
    public void setListOfCountryNamesByNameResult(ArrayOfCountryNames value) {
        this.listOfCountryNamesByNameResult = value;
    }

}
