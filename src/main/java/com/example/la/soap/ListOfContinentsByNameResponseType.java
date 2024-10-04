
package com.example.la.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ListOfContinentsByNameResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="ListOfContinentsByNameResponseType">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ListOfContinentsByNameResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOfContinents"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfContinentsByNameResponseType", propOrder = {
    "listOfContinentsByNameResult"
})
public class ListOfContinentsByNameResponseType {

    @XmlElement(name = "ListOfContinentsByNameResult", required = true)
    protected ArrayOfContinents listOfContinentsByNameResult;

    /**
     * Obtiene el valor de la propiedad listOfContinentsByNameResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfContinents }
     *     
     */
    public ArrayOfContinents getListOfContinentsByNameResult() {
        return listOfContinentsByNameResult;
    }

    /**
     * Define el valor de la propiedad listOfContinentsByNameResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfContinents }
     *     
     */
    public void setListOfContinentsByNameResult(ArrayOfContinents value) {
        this.listOfContinentsByNameResult = value;
    }

}
