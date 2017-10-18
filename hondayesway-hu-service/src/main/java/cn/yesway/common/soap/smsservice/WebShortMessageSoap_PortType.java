/**
 * WebShortMessageSoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.yesway.common.soap.smsservice;

public interface WebShortMessageSoap_PortType extends java.rmi.Remote {
    public int sendText(cn.yesway.common.soap.smsservice.Sms s) throws java.rmi.RemoteException;
    public int sendAsc(cn.yesway.common.soap.smsservice.Sms s) throws java.rmi.RemoteException;
    public java.lang.String helloWorld() throws java.rmi.RemoteException;
    public int sendEx(java.lang.String strPhone, java.lang.String strContent, java.lang.String strSource, java.lang.String strChannel) throws java.rmi.RemoteException;
    public int send(java.lang.String strPhone, java.lang.String strContent, java.lang.String strSource) throws java.rmi.RemoteException;
    public int sendBinEx(java.lang.String strPhone, byte[] content, java.lang.String strSource, java.lang.String strChannel) throws java.rmi.RemoteException;
    public int sendBin(java.lang.String strPhone, byte[] content, java.lang.String strSource) throws java.rmi.RemoteException;
}
