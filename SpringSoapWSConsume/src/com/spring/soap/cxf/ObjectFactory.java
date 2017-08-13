
package com.spring.soap.cxf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.spring.soap.cxf package. 
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

    private final static QName _RequestCheckBook_QNAME = new QName("http://cxf.soap.spring.com/", "requestCheckBook");
    private final static QName _DepositResponse_QNAME = new QName("http://cxf.soap.spring.com/", "depositResponse");
    private final static QName _Deposit_QNAME = new QName("http://cxf.soap.spring.com/", "deposit");
    private final static QName _RequestCheckBookResponse_QNAME = new QName("http://cxf.soap.spring.com/", "requestCheckBookResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.spring.soap.cxf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DepositResponse }
     * 
     */
    public DepositResponse createDepositResponse() {
        return new DepositResponse();
    }

    /**
     * Create an instance of {@link RequestCheckBook }
     * 
     */
    public RequestCheckBook createRequestCheckBook() {
        return new RequestCheckBook();
    }

    /**
     * Create an instance of {@link RequestCheckBookResponse }
     * 
     */
    public RequestCheckBookResponse createRequestCheckBookResponse() {
        return new RequestCheckBookResponse();
    }

    /**
     * Create an instance of {@link Deposit }
     * 
     */
    public Deposit createDeposit() {
        return new Deposit();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestCheckBook }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.soap.spring.com/", name = "requestCheckBook")
    public JAXBElement<RequestCheckBook> createRequestCheckBook(RequestCheckBook value) {
        return new JAXBElement<RequestCheckBook>(_RequestCheckBook_QNAME, RequestCheckBook.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DepositResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.soap.spring.com/", name = "depositResponse")
    public JAXBElement<DepositResponse> createDepositResponse(DepositResponse value) {
        return new JAXBElement<DepositResponse>(_DepositResponse_QNAME, DepositResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deposit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.soap.spring.com/", name = "deposit")
    public JAXBElement<Deposit> createDeposit(Deposit value) {
        return new JAXBElement<Deposit>(_Deposit_QNAME, Deposit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestCheckBookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.soap.spring.com/", name = "requestCheckBookResponse")
    public JAXBElement<RequestCheckBookResponse> createRequestCheckBookResponse(RequestCheckBookResponse value) {
        return new JAXBElement<RequestCheckBookResponse>(_RequestCheckBookResponse_QNAME, RequestCheckBookResponse.class, null, value);
    }

}
