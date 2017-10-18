/**
 * UserExtraInfoService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.yesway.common.soap.userextrainfoservice;

public class UserExtraInfoService_ServiceLocator extends org.apache.axis.client.Service implements cn.yesway.common.soap.userextrainfoservice.UserExtraInfoService_Service {

    public UserExtraInfoService_ServiceLocator() {
    }


    public UserExtraInfoService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UserExtraInfoService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_UserExtraInfoService
    private java.lang.String BasicHttpBinding_UserExtraInfoService_address = "http://192.168.114.76:9110/user/UserExtraInfoService.svc/UserExtraInfoService";

    public java.lang.String getBasicHttpBinding_UserExtraInfoServiceAddress() {
        return BasicHttpBinding_UserExtraInfoService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_UserExtraInfoServiceWSDDServiceName = "BasicHttpBinding_UserExtraInfoService";

    public java.lang.String getBasicHttpBinding_UserExtraInfoServiceWSDDServiceName() {
        return BasicHttpBinding_UserExtraInfoServiceWSDDServiceName;
    }

    public void setBasicHttpBinding_UserExtraInfoServiceWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_UserExtraInfoServiceWSDDServiceName = name;
    }

    public cn.yesway.common.soap.userextrainfoservice.UserExtraInfoService_PortType getBasicHttpBinding_UserExtraInfoService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_UserExtraInfoService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_UserExtraInfoService(endpoint);
    }

    public cn.yesway.common.soap.userextrainfoservice.UserExtraInfoService_PortType getBasicHttpBinding_UserExtraInfoService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cn.yesway.common.soap.userextrainfoservice.BasicHttpBinding_UserExtraInfoServiceStub _stub = new cn.yesway.common.soap.userextrainfoservice.BasicHttpBinding_UserExtraInfoServiceStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_UserExtraInfoServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_UserExtraInfoServiceEndpointAddress(java.lang.String address) {
        BasicHttpBinding_UserExtraInfoService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cn.yesway.common.soap.userextrainfoservice.UserExtraInfoService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                cn.yesway.common.soap.userextrainfoservice.BasicHttpBinding_UserExtraInfoServiceStub _stub = new cn.yesway.common.soap.userextrainfoservice.BasicHttpBinding_UserExtraInfoServiceStub(new java.net.URL(BasicHttpBinding_UserExtraInfoService_address), this);
                _stub.setPortName(getBasicHttpBinding_UserExtraInfoServiceWSDDServiceName());
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
        if ("BasicHttpBinding_UserExtraInfoService".equals(inputPortName)) {
            return getBasicHttpBinding_UserExtraInfoService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "UserExtraInfoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_UserExtraInfoService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_UserExtraInfoService".equals(portName)) {
            setBasicHttpBinding_UserExtraInfoServiceEndpointAddress(address);
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
