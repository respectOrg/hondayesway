/**
 * WebShortMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.yesway.common.soap.smsservice;

public interface WebShortMessage extends javax.xml.rpc.Service {
    public java.lang.String getWebShortMessageSoapAddress();

    public cn.yesway.common.soap.smsservice.WebShortMessageSoap_PortType getWebShortMessageSoap() throws javax.xml.rpc.ServiceException;

    public cn.yesway.common.soap.smsservice.WebShortMessageSoap_PortType getWebShortMessageSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getWebShortMessageSoap12Address();

    public cn.yesway.common.soap.smsservice.WebShortMessageSoap_PortType getWebShortMessageSoap12() throws javax.xml.rpc.ServiceException;

    public cn.yesway.common.soap.smsservice.WebShortMessageSoap_PortType getWebShortMessageSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
