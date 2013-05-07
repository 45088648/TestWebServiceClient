package com.iwt.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.iwt.services package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetUserInfoResponse_QNAME = new QName("http://services.iwt.com/", "getUserInfoResponse");

    private final static QName _GetUserInfo_QNAME = new QName("http://services.iwt.com/", "getUserInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of
     * schema derived classes for package: com.iwt.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetUserInfo }
     * 
     */
    public GetUserInfo createGetUserInfo() {
        return new GetUserInfo();
    }

    /**
     * Create an instance of {@link GetUserInfoResponse }
     * 
     */
    public GetUserInfoResponse createGetUserInfoResponse() {
        return new GetUserInfoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}
     * {@link GetUserInfoResponse }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://services.iwt.com/", name = "getUserInfoResponse")
    public JAXBElement<GetUserInfoResponse> createGetUserInfoResponse(GetUserInfoResponse value) {
        return new JAXBElement<GetUserInfoResponse>(_GetUserInfoResponse_QNAME, GetUserInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserInfo }
     * {@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://services.iwt.com/", name = "getUserInfo")
    public JAXBElement<GetUserInfo> createGetUserInfo(GetUserInfo value) {
        return new JAXBElement<GetUserInfo>(_GetUserInfo_QNAME, GetUserInfo.class, null, value);
    }

}
