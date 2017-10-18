/**
 * UserInfoService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.yesway.common.soap.userinfoservice;

public class UserInfoService_ServiceLocator extends org.apache.axis.client.Service implements cn.yesway.common.soap.userinfoservice.UserInfoService_Service {

    public UserInfoService_ServiceLocator() {
    }


    public UserInfoService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UserInfoService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_UserInfoService
    private java.lang.String BasicHttpBinding_UserInfoService_address = "http://10.1.11.101:9102/UserCenter/UserInfoService.svc/UserInfoService";

    public java.lang.String getBasicHttpBinding_UserInfoServiceAddress() {
        return BasicHttpBinding_UserInfoService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_UserInfoServiceWSDDServiceName = "BasicHttpBinding_UserInfoService";

    public java.lang.String getBasicHttpBinding_UserInfoServiceWSDDServiceName() {
        return BasicHttpBinding_UserInfoServiceWSDDServiceName;
    }

    public void setBasicHttpBinding_UserInfoServiceWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_UserInfoServiceWSDDServiceName = name;
    }

    public cn.yesway.common.soap.userinfoservice.UserInfoService_PortType getBasicHttpBinding_UserInfoService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_UserInfoService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_UserInfoService(endpoint);
    }

    public cn.yesway.common.soap.userinfoservice.UserInfoService_PortType getBasicHttpBinding_UserInfoService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cn.yesway.common.soap.userinfoservice.BasicHttpBinding_UserInfoServiceStub _stub = new cn.yesway.common.soap.userinfoservice.BasicHttpBinding_UserInfoServiceStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_UserInfoServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_UserInfoServiceEndpointAddress(java.lang.String address) {
        BasicHttpBinding_UserInfoService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cn.yesway.common.soap.userinfoservice.UserInfoService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                cn.yesway.common.soap.userinfoservice.BasicHttpBinding_UserInfoServiceStub _stub = new cn.yesway.common.soap.userinfoservice.BasicHttpBinding_UserInfoServiceStub(new java.net.URL(BasicHttpBinding_UserInfoService_address), this);
                _stub.setPortName(getBasicHttpBinding_UserInfoServiceWSDDServiceName());
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
        if ("BasicHttpBinding_UserInfoService".equals(inputPortName)) {
            return getBasicHttpBinding_UserInfoService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "UserInfoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_UserInfoService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_UserInfoService".equals(portName)) {
            setBasicHttpBinding_UserInfoServiceEndpointAddress(address);
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
