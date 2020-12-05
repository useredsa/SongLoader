//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de
// enlace (JAXB) XML v2.2.8-b130911.1802
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el
// esquema de origen.
// Generado el: 2017.10.26 a las 12:42:42 AM CEST
//

package um.tds.songloader;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for anonymous complex type.
 *
 * <p>The next schema fragment specifies the format expected for this class
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cancion" type="{http://www.tds.es/canciones}Cancion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "",
    propOrder = {"songs"})
@XmlRootElement(name = "canciones")
public class Songs {
  @XmlElement(name = "cancion", required = true)
  protected List<Song> songs;

  /**
   * Gets the value of the cacion property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <code>set</code> method for the cacion property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getCancion().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link Song }
   */
  public List<Song> getSongs() {
    if (songs == null) {
      songs = new ArrayList<Song>();
    }
    return this.songs;
  }
}
