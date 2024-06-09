//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.06.08 a las 07:09:25 PM PET 
//


package pe.edu.cibertec.ws.objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para publicacionws complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="publicacionws"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idpublicacion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="titulo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="resumen" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nomautor" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "publicacionws", propOrder = {
    "idpublicacion",
    "titulo",
    "resumen",
    "nomautor"
})
public class Publicacionws {

    protected int idpublicacion;
    @XmlElement(required = true)
    protected String titulo;
    @XmlElement(required = true)
    protected String resumen;
    @XmlElement(required = true)
    protected String nomautor;

    /**
     * Obtiene el valor de la propiedad idpublicacion.
     * 
     */
    public int getIdpublicacion() {
        return idpublicacion;
    }

    /**
     * Define el valor de la propiedad idpublicacion.
     * 
     */
    public void setIdpublicacion(int value) {
        this.idpublicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad titulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define el valor de la propiedad titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulo(String value) {
        this.titulo = value;
    }

    /**
     * Obtiene el valor de la propiedad resumen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResumen() {
        return resumen;
    }

    /**
     * Define el valor de la propiedad resumen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResumen(String value) {
        this.resumen = value;
    }

    /**
     * Obtiene el valor de la propiedad nomautor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomautor() {
        return nomautor;
    }

    /**
     * Define el valor de la propiedad nomautor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomautor(String value) {
        this.nomautor = value;
    }

}
