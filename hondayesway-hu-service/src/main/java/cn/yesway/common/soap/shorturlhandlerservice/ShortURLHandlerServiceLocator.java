/**
 * ShortURLHandlerServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.yesway.common.soap.shorturlhandlerservice;

public class ShortURLHandlerServiceLocator extends org.apache.axis.client.Service implements cn.yesway.common.soap.shorturlhandlerservice.ShortURLHandlerService {

    public ShortURLHandlerServiceLocator() {
    }


    public ShortURLHandlerServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ShortURLHandlerServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_IShortURLHandlerService
    private java.lang.String BasicHttpBinding_IShortURLHandlerService_address = "http://10.1.11.101:9510/ShortURLHandlerService.svc";

    public java.lang.String getBasicHttpBinding_IShortURLHandlerServiceAddress() {
        return BasicHttpBinding_IShortURLHandlerService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IShortURLHandlerServiceWSDDServiceName = "BasicHttpBinding_IShortURLHandlerService";

    public java.lang.String getBasicHttpBinding_IShortURLHandlerServiceWSDDServiceName() {
        return BasicHttpBinding_IShortURLHandlerServiceWSDDServiceName;
    }

    public void setBasicHttpBinding_IShortURLHandlerServiceWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IShortURLHandlerServiceWSDDServiceName = name;
    }

    public cn.yesway.common.soap.shorturlhandlerservice.IShortURLHandlerService getBasicHttpBinding_IShortURLHandlerService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IShortURLHandlerService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IShortURLHandlerService(endpoint);
    }

    public cn.yesway.common.soap.shorturlhandlerservice.IShortURLHandlerService getBasicHttpBinding_IShortURLHandlerService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cn.yesway.common.soap.shorturlhandlerservice.BasicHttpBinding_IShortURLHandlerServiceStub _stub = new cn.yesway.common.soap.shorturlhandlerservice.BasicHttpBinding_IShortURLHandlerServiceStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IShortURLHandlerServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IShortURLHandlerServiceEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IShortURLHandlerService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cn.yesway.common.soap.shorturlhandlerservice.IShortURLHandlerService.class.isAssignableFrom(serviceEndpointInterface)) {
                cn.yesway.common.soap.shorturlhandlerservice.BasicHttpBinding_IShortURLHandlerServiceStub _stub = new cn.yesway.common.soap.shorturlhandlerservice.BasicHttpBinding_IShortURLHandlerServiceStub(new java.net.URL(BasicHttpBinding_IShortURLHandlerService_address), this);
                _stub.setPortName(getBasicHttpBinding_IShortURLHandlerServiceWSDDServiceName());
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
        if ("BasicHttpBinding_IShortURLHandlerService".equals(inputPortName)) {
            return getBasicHttpBinding_IShortURLHandlerService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "ShortURLHandlerService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_IShortURLHandlerService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_IShortURLHandlerService".equals(portName)) {
            setBasicHttpBinding_IShortURLHandlerServiceEndpointAddress(address);
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
