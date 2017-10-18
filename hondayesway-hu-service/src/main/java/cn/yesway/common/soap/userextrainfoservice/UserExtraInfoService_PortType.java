/**
 * UserExtraInfoService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.yesway.common.soap.userextrainfoservice;

public interface UserExtraInfoService_PortType extends java.rmi.Remote {
    public java.lang.Boolean updateInvoice(cn.yesway.common.soap.userextrainfoservice.UserInvoice invoice) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public java.lang.Boolean deleteInvoice(java.lang.String id) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public cn.yesway.common.soap.userextrainfoservice.UserInvoice[] getInvoice(java.lang.String id, java.lang.String zjid) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public java.lang.String addPostAddress(cn.yesway.common.soap.userextrainfoservice.UserPostAddress postaddress) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public java.lang.Boolean updatePostAddress(cn.yesway.common.soap.userextrainfoservice.UserPostAddress postaddress) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public java.lang.Boolean deletePostAddress(java.lang.String id) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public cn.yesway.common.soap.userextrainfoservice.UserPostAddress[] getPostAddress(java.lang.String id, java.lang.String zjID) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public java.lang.Boolean addOBD(cn.yesway.common.soap.userextrainfoservice.UserOBD model) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public java.lang.Boolean updateOBD(cn.yesway.common.soap.userextrainfoservice.UserOBD model) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public cn.yesway.common.soap.userextrainfoservice.UserOBD getOBDByzjId(java.lang.String zjId) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public cn.yesway.common.soap.userextrainfoservice.UserOBD getOBDByOBDID(java.lang.String obdId) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public void unBindOBD(java.lang.String obdId, java.lang.String zjid) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public java.lang.Boolean openSIM(cn.yesway.common.soap.userextrainfoservice.ArrayOfKeyValueOfstringstringKeyValueOfstringstring[] simKey) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public cn.yesway.common.soap.userextrainfoservice.UserOBDExt[] getOBDByCondition(java.lang.String zjid, java.lang.String obdId, java.lang.String simKey, java.lang.String simNumber, java.lang.Integer simStatus, java.lang.Integer orderStatus, java.util.Calendar startTime, java.util.Calendar endTime, java.lang.Integer timeType, java.lang.Integer productId, java.lang.String sortFiled, cn.yesway.common.soap.userextrainfoservice.holders.PageInfoHolder page) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public java.lang.Boolean addUserMaintenaceFactory(cn.yesway.common.soap.userextrainfoservice.UserMaintenanceFactory model) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public java.lang.Boolean deleteUserMaintenaceFactory(java.lang.String ZJID, java.lang.String maintenaceFactoryRecordID) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public cn.yesway.common.soap.userextrainfoservice.UserMaintenanceFactory[] getUserMaintenaceFactoryByZJID(java.lang.String ZJID, cn.yesway.common.soap.userextrainfoservice.holders.PageInfoHolder page) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public cn.yesway.common.soap.userextrainfoservice.UserMaintenanceFactory getUserMaintenaceFactoryByID(java.lang.String zjid, java.lang.String maintenaceFactoryRecordID) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public java.lang.Boolean setDefaultUserMaintenaceFactory(java.lang.String ZJID, java.lang.String maintenaceFactoryRecordID) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public java.lang.String addVehicle(cn.yesway.common.soap.userextrainfoservice.UserVehicleInfo vehicleInfo) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public java.lang.Boolean updateVehicle(cn.yesway.common.soap.userextrainfoservice.UserVehicleInfo vehicleInfo) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public java.lang.Boolean updateVehicleWithOBDReset(cn.yesway.common.soap.userextrainfoservice.UserVehicleInfo vehicleInfo) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public java.lang.Boolean deleteVehicle(java.lang.String id) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public cn.yesway.common.soap.userextrainfoservice.UserVehicleInfo[] getVehicleByZJID(java.lang.String ZJID) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public cn.yesway.common.soap.userextrainfoservice.UserVehicleModel[] getAllByZJID(java.lang.String ZJID) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public cn.yesway.common.soap.userextrainfoservice.UserVehicleInfo[] getVehicleByPlateNo(java.lang.String licensePlateNo) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public cn.yesway.common.soap.userextrainfoservice.UserVehicleInfo getVehicleByID(java.lang.String ID) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public cn.yesway.common.soap.userextrainfoservice.UserVehicleCareSet[] getCareSetByZJID(java.lang.String ZJID) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public cn.yesway.common.soap.userextrainfoservice.UserVehicleCareSet[] getCareSetByPlateNo(java.lang.String licensePlateNo) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public cn.yesway.common.soap.userextrainfoservice.UserVehicleCareSet getCareSetByID(java.lang.String id) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public cn.yesway.common.soap.userextrainfoservice.CareNotification getCareNotification(java.lang.String id) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public java.lang.Boolean addCareSet(cn.yesway.common.soap.userextrainfoservice.UserVehicleCareSet model) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public java.lang.Boolean updateCareSet(cn.yesway.common.soap.userextrainfoservice.UserVehicleCareSet model) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public java.lang.Boolean updateTotalDistance(java.lang.String id, java.lang.String zjID, java.lang.Integer totalDistance) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public java.lang.Boolean updateOBDTotalDistance(java.lang.String id, java.lang.String zjID, java.lang.Integer obdTotalDistance) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public cn.yesway.common.soap.userextrainfoservice.VehicleNeedCare[] getNeedCareByCondition(java.lang.String channelID, java.lang.String channelPK, java.lang.Integer mileageDistance, java.lang.Integer timeDistance, cn.yesway.common.soap.userextrainfoservice.holders.PageInfoHolder page) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public java.lang.Boolean updateContactInfo(cn.yesway.common.soap.userextrainfoservice.UserContactInfo contactInfo) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public cn.yesway.common.soap.userextrainfoservice.UserContactInfo getContactInfoByZJID(java.lang.String ZJID) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public java.lang.String addInsurance(cn.yesway.common.soap.userextrainfoservice.InsuranceInfo insuranceInfo) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public java.lang.Boolean updateInsurance(cn.yesway.common.soap.userextrainfoservice.InsuranceInfo insuranceInfo) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public java.lang.Boolean deleteInsurance(java.lang.String ID) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public cn.yesway.common.soap.userextrainfoservice.InsuranceInfo getInsuranceByID(java.lang.String ID) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public cn.yesway.common.soap.userextrainfoservice.InsuranceInfo[] getInsuranceByZJID(java.lang.String ZJID) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public cn.yesway.common.soap.userextrainfoservice.InsuranceInfo[] getInsuranceByVehicleID(java.lang.String vehicleID) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public java.lang.Boolean updateUserLocation(cn.yesway.common.soap.userextrainfoservice.UserLocation model) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public cn.yesway.common.soap.userextrainfoservice.UserLocation[] getUserLoction(java.lang.String ZJID, java.lang.Integer productID) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
    public java.lang.String addInvoice(cn.yesway.common.soap.userextrainfoservice.UserInvoice invoice) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage;
}
