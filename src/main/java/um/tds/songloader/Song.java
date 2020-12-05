//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de
// enlace (JAXB) XML v2.2.8-b130911.1802
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el
// esquema de origen.
// Generado el: 2017.10.26 a las 12:42:42 AM CEST
//

package um.tds.songloader;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for the Song complex type.
 *
 * <p>The next schema fragment specifies the format expected for this class
 *
 * <pre>
 * &lt;complexType name="Cancion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="estilo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interprete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="titulo" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "Cancion",
    propOrder = {"url", "style", "author", "title"})
public class Song {
  @XmlElement(name = "URL", required = true)
  protected String url;

  @XmlElement(name = "estilo", required = true)
  protected String style;

  @XmlElement(name = "interprete", required = true)
  protected String author;

  @XmlAttribute(name = "titulo", required = true)
  protected String title;

  /**
   * Gets the value of the property url.
   *
   * @return possible object is {@link String }
   */
  public String getUrl() {
    return url;
  }

  /**
   * Sets the value of the property url.
   *
   * @param value allowed object is {@link String }
   */
  public void setUrl(String value) {
    this.url = value;
  }

  /**
   * Gets the value of the property style.
   *
   * @return possible object is {@link String }
   */
  public String getStyle() {
    return style;
  }

  /**
   * Sets the value of the property style.
   *
   * @param value allowed object is {@link String }
   */
  public void setStyle(String value) {
    this.style = value;
  }

  /**
   * Gets the value of the property author.
   *
   * @return possible object is {@link String }
   */
  public String getAuthor() {
    return author;
  }

  /**
   * Sets the value of the property author.
   *
   * @param value allowed object is {@link String }
   */
  public void setAuthor(String value) {
    this.author = value;
  }

  /**
   * Gets the value of the property title.
   *
   * @return possible object is {@link String }
   */
  public String getTitle() {
    return title;
  }

  /**
   * Sets the value of the property title.
   *
   * @param value allowed object is {@link String }
   */
  public void setTitle(String value) {
    this.title = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null) return false;
    if (getClass() != o.getClass()) return false;
    Song other = (Song) o;
    return url.equals(other.url)
        && style.equals(other.style)
        && author.equals(other.author)
        && title.equals(other.title);
  }
}
