/**
 * UserSyncService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.yesway.common.soap.usersyncservice;

public interface UserSyncService_PortType extends java.rmi.Remote {
    public cn.yesway.common.soap.usersyncservice.UserSyncResult add(cn.yesway.common.soap.usersyncservice.ZJUser zjUser, java.lang.String sectionID) throws java.rmi.RemoteException, cn.yesway.common.soap.usersyncservice.ErrorMessage;
    public java.lang.Boolean update(cn.yesway.common.soap.usersyncservice.ZJUser zjUser) throws java.rmi.RemoteException, cn.yesway.common.soap.usersyncservice.ErrorMessage;
    public java.lang.Boolean delete(java.lang.String zjID) throws java.rmi.RemoteException, cn.yesway.common.soap.usersyncservice.ErrorMessage;
    public cn.yesway.common.soap.usersyncservice.ZJUser get(java.lang.String zjID) throws java.rmi.RemoteException, cn.yesway.common.soap.usersyncservice.ErrorMessage;
}
