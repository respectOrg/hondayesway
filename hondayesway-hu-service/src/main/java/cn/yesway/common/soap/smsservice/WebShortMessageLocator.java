/**
 * WebShortMessageLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.yesway.common.soap.smsservice;

public class WebShortMessageLocator extends org.apache.axis.client.Service implements cn.yesway.common.soap.smsservice.WebShortMessage {

    public WebShortMessageLocator() {
    }


    public WebShortMessageLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebShortMessageLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WebShortMessageSoap
    private java.lang.String WebShortMessageSoap_address = "http://61.50.132.216:8000/SmsWebagent/WebShortMessage.asmx";

    public java.lang.String getWebShortMessageSoapAddress() {
        return WebShortMessageSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebShortMessageSoapWSDDServiceName = "WebShortMessageSoap";

    public java.lang.String getWebShortMessageSoapWSDDServiceName() {
        return WebShortMessageSoapWSDDServiceName;
    }

    public void setWebShortMessageSoapWSDDServiceName(java.lang.String name) {
        WebShortMessageSoapWSDDServiceName = name;
    }

    public cn.yesway.common.soap.smsservice.WebShortMessageSoap_PortType getWebShortMessageSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebShortMessageSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebShortMessageSoap(endpoint);
    }

    public cn.yesway.common.soap.smsservice.WebShortMessageSoap_PortType getWebShortMessageSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cn.yesway.common.soap.smsservice.WebShortMessageSoap_BindingStub _stub = new cn.yesway.common.soap.smsservice.WebShortMessageSoap_BindingStub(portAddress, this);
            _stub.setPortName(getWebShortMessageSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebShortMessageSoapEndpointAddress(java.lang.String address) {
        WebShortMessageSoap_address = address;
    }


    // Use to get a proxy class for WebShortMessageSoap12
    private java.lang.String WebShortMessageSoap12_address = "http://61.50.132.216:8000/SmsWebagent/WebShortMessage.asmx";

    public java.lang.String getWebShortMessageSoap12Address() {
        return WebShortMessageSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WebShortMessageSoap12WSDDServiceName = "WebShortMessageSoap12";

    public java.lang.String getWebShortMessageSoap12WSDDServiceName() {
        return WebShortMessageSoap12WSDDServiceName;
    }

    public void setWebShortMessageSoap12WSDDServiceName(java.lang.String name) {
        WebShortMessageSoap12WSDDServiceName = name;
    }

    public cn.yesway.common.soap.smsservice.WebShortMessageSoap_PortType getWebShortMessageSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WebShortMessageSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWebShortMessageSoap12(endpoint);
    }

    public cn.yesway.common.soap.smsservice.WebShortMessageSoap_PortType getWebShortMessageSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cn.yesway.common.soap.smsservice.WebShortMessageSoap12Stub _stub = new cn.yesway.common.soap.smsservice.WebShortMessageSoap12Stub(portAddress, this);
            _stub.setPortName(getWebShortMessageSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWebShortMessageSoap12EndpointAddress(java.lang.String address) {
        WebShortMessageSoap12_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cn.yesway.common.soap.smsservice.WebShortMessageSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                cn.yesway.common.soap.smsservice.WebShortMessageSoap_BindingStub _stub = new cn.yesway.common.soap.smsservice.WebShortMessageSoap_BindingStub(new java.net.URL(WebShortMessageSoap_address), this);
                _stub.setPortName(getWebShortMessageSoapWSDDServiceName());
                return _stub;
            }
            if (cn.yesway.common.soap.smsservice.WebShortMessageSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                cn.yesway.common.soap.smsservice.WebShortMessageSoap12Stub _stub = new cn.yesway.common.soap.smsservice.WebShortMessageSoap12Stub(new java.net.URL(WebShortMessageSoap12_address), this);
                _stub.setPortName(getWebShortMessageSoap12WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WebShortMessageSoap".equals(inputPortName)) {
            return getWebShortMessageSoap();
        }
        else if ("WebShortMessageSoap12".equals(inputPortName)) {
            return getWebShortMessageSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "WebShortMessage");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "WebShortMessageSoap"));
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "WebShortMessageSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WebShortMessageSoap".equals(portName)) {
            setWebShortMessageSoapEndpointAddress(address);
        }
        else 
if ("WebShortMessageSoap12".equals(portName)) {
            setWebShortMessageSoap12EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
