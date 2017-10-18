/**
 * IShortURLHandlerService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.yesway.common.soap.shorturlhandlerservice;

public interface IShortURLHandlerService extends java.rmi.Remote {
    public java.lang.String createShortURL(java.lang.String longUrl, java.lang.Integer appID, java.lang.String title) throws java.rmi.RemoteException, cn.yesway.common.soap.shorturlhandlerservice.ErrorMessage;
    public java.lang.String getLongURL(cn.yesway.common.soap.shorturlhandlerservice.VisitRecordModel visitRecord) throws java.rmi.RemoteException, cn.yesway.common.soap.shorturlhandlerservice.ErrorMessage;
    public cn.yesway.common.soap.shorturlhandlerservice.VisitRecordStatisticModel[] getStatisticList(java.util.Calendar startTime, java.util.Calendar endTime, cn.yesway.common.soap.shorturlhandlerservice.holders.PageInfoHolder pageInfo) throws java.rmi.RemoteException, cn.yesway.common.soap.shorturlhandlerservice.ErrorMessage;
    public cn.yesway.common.soap.shorturlhandlerservice.StatisticContentModel getStatisticDetail(java.util.Calendar startTime, java.util.Calendar endTime, java.lang.String urlID) throws java.rmi.RemoteException, cn.yesway.common.soap.shorturlhandlerservice.ErrorMessage;
}
