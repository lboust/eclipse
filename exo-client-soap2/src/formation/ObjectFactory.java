
package formation;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the formation package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _JeMeDeclareResponse_QNAME = new QName("http://formation/", "jeMeDeclareResponse");
    private final static QName _JeMeDeclare_QNAME = new QName("http://formation/", "jeMeDeclare");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: formation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JeMeDeclare }
     * 
     */
    public JeMeDeclare createJeMeDeclare() {
        return new JeMeDeclare();
    }

    /**
     * Create an instance of {@link JeMeDeclareResponse }
     * 
     */
    public JeMeDeclareResponse createJeMeDeclareResponse() {
        return new JeMeDeclareResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JeMeDeclareResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://formation/", name = "jeMeDeclareResponse")
    public JAXBElement<JeMeDeclareResponse> createJeMeDeclareResponse(JeMeDeclareResponse value) {
        return new JAXBElement<JeMeDeclareResponse>(_JeMeDeclareResponse_QNAME, JeMeDeclareResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JeMeDeclare }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://formation/", name = "jeMeDeclare")
    public JAXBElement<JeMeDeclare> createJeMeDeclare(JeMeDeclare value) {
        return new JAXBElement<JeMeDeclare>(_JeMeDeclare_QNAME, JeMeDeclare.class, null, value);
    }

}
