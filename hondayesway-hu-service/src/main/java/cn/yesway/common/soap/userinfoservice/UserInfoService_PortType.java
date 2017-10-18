/**
 * UserInfoService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.yesway.common.soap.userinfoservice;

public interface UserInfoService_PortType extends java.rmi.Remote {
    public java.lang.Boolean update(cn.yesway.common.soap.userinfoservice.UserInfo userInfo) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage;
    public void updateUserIntegral(java.lang.String zjID, java.lang.Integer integralNum) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage;
    public cn.yesway.common.soap.userinfoservice.UserIntegral getUserIntegral(java.lang.String zjID) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage;
    public cn.yesway.common.soap.userinfoservice.UserIntegral[] getlistUserIntegral(java.lang.String zjID, java.lang.String startTime, java.lang.String endTime, java.lang.Integer pageIndex, java.lang.Integer pageSize, javax.xml.rpc.holders.IntegerWrapperHolder rowCount, javax.xml.rpc.holders.IntegerWrapperHolder pageCount) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage;
    public cn.yesway.common.soap.userinfoservice.UserInfo getByZJID(java.lang.String zjID) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage;
    public cn.yesway.common.soap.userinfoservice.UserInfo getByUserName(java.lang.String userName) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage;
    public cn.yesway.common.soap.userinfoservice.UserInfo[] getByServicePhone(java.lang.String phone) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage;
    public java.lang.String addBindPhone(java.lang.String zjID, java.lang.Integer phoneType, java.lang.String phoneNumber) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage;
    public java.lang.Boolean removeBindPhone(java.lang.String id) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage;
    public java.lang.Boolean updateBindPhone(cn.yesway.common.soap.userinfoservice.UserBindPhoneModel newModel) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage;
    public cn.yesway.common.soap.userinfoservice.UserBindPhoneModel[] getBindPhone(java.lang.String zjID) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage;
    public java.lang.Boolean changePassword(java.lang.String zjID, java.lang.String newPassword) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage;
    public cn.yesway.common.soap.userinfoservice.UserInfo[] getByBindingPhone(java.lang.String bindingPhone) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage;
    public cn.yesway.common.soap.userinfoservice.UserInfo[] getByEmail(java.lang.String email) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage;
    public cn.yesway.common.soap.userinfoservice.UserInfo[] getByLicensePlateNo(java.lang.String licensePlateNo) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage;
    public cn.yesway.common.soap.userinfoservice.UserInfo[] getByTelphone(java.lang.String telphone) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage;
    public cn.yesway.common.soap.userinfoservice.UserInfo[] getByVinNO(java.lang.String vinNO) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage;
    public cn.yesway.common.soap.userinfoservice.UserInfo getByOBDID(java.lang.String obdid) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage;
    public cn.yesway.common.soap.userinfoservice.UserDetailInfo[] getByZJIDList(java.lang.String[] zjidList, java.lang.String switches) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage;
}
