
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
 *         <element name="ListOfCurrenciesByCodeResult" type="{http://www.oorsprong.org/websamples.countryinfo}ArrayOftCurrency"/>
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
    "listOfCurrenciesByCodeResult"
})
@XmlRootElement(name = "ListOfCurrenciesByCodeResponse")
public class ListOfCurrenciesByCodeResponse {

    @XmlElement(name = "ListOfCurrenciesByCodeResult", required = true)
    protected ArrayOftCurrency listOfCurrenciesByCodeResult;

    /**
     * Obtiene el valor de la propiedad listOfCurrenciesByCodeResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOftCurrency }
     *     
     */
    public ArrayOftCurrency getListOfCurrenciesByCodeResult() {
        return listOfCurrenciesByCodeResult;
    }

    /**
     * Define el valor de la propiedad listOfCurrenciesByCodeResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOftCurrency }
     *     
     */
    public void setListOfCurrenciesByCodeResult(ArrayOftCurrency value) {
        this.listOfCurrenciesByCodeResult = value;
    }

}
