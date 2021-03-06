/**
 * UserSyncService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.yesway.common.soap.usersyncservice;

public class UserSyncService_ServiceLocator extends org.apache.axis.client.Service implements cn.yesway.common.soap.usersyncservice.UserSyncService_Service {

    public UserSyncService_ServiceLocator() {
    }


    public UserSyncService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UserSyncService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_UserSyncService
    private java.lang.String BasicHttpBinding_UserSyncService_address = "http://10.1.11.101:9102/UserCenter/UserSyncService.svc/UserSyncService";

    public java.lang.String getBasicHttpBinding_UserSyncServiceAddress() {
        return BasicHttpBinding_UserSyncService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_UserSyncServiceWSDDServiceName = "BasicHttpBinding_UserSyncService";

    public java.lang.String getBasicHttpBinding_UserSyncServiceWSDDServiceName() {
        return BasicHttpBinding_UserSyncServiceWSDDServiceName;
    }

    public void setBasicHttpBinding_UserSyncServiceWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_UserSyncServiceWSDDServiceName = name;
    }

    public cn.yesway.common.soap.usersyncservice.UserSyncService_PortType getBasicHttpBinding_UserSyncService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_UserSyncService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_UserSyncService(endpoint);
    }

    public cn.yesway.common.soap.usersyncservice.UserSyncService_PortType getBasicHttpBinding_UserSyncService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cn.yesway.common.soap.usersyncservice.BasicHttpBinding_UserSyncServiceStub _stub = new cn.yesway.common.soap.usersyncservice.BasicHttpBinding_UserSyncServiceStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_UserSyncServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_UserSyncServiceEndpointAddress(java.lang.String address) {
        BasicHttpBinding_UserSyncService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cn.yesway.common.soap.usersyncservice.UserSyncService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                cn.yesway.common.soap.usersyncservice.BasicHttpBinding_UserSyncServiceStub _stub = new cn.yesway.common.soap.usersyncservice.BasicHttpBinding_UserSyncServiceStub(new java.net.URL(BasicHttpBinding_UserSyncService_address), this);
                _stub.setPortName(getBasicHttpBinding_UserSyncServiceWSDDServiceName());
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
        if ("BasicHttpBinding_UserSyncService".equals(inputPortName)) {
            return getBasicHttpBinding_UserSyncService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "UserSyncService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_UserSyncService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_UserSyncService".equals(portName)) {
            setBasicHttpBinding_UserSyncServiceEndpointAddress(address);
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
