/**
 * BasicHttpBinding_UserInfoServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.yesway.common.soap.userinfoservice;

public class BasicHttpBinding_UserInfoServiceStub extends org.apache.axis.client.Stub implements cn.yesway.common.soap.userinfoservice.UserInfoService_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[19];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Update");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "userInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserInfo"), cn.yesway.common.soap.userinfoservice.UserInfo.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "UpdateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userinfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateUserIntegral");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "zjID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "IntegralNum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userinfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUserIntegral");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "zjID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserIntegral"));
        oper.setReturnClass(cn.yesway.common.soap.userinfoservice.UserIntegral.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "GetUserIntegralResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userinfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetlistUserIntegral");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "zjID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "startTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "endTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "pageIndex"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "pageSize"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "rowCount"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "pageCount"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ArrayOfUserIntegral"));
        oper.setReturnClass(cn.yesway.common.soap.userinfoservice.UserIntegral[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "GetlistUserIntegralResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserIntegral"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userinfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetByZJID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "zjID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserInfo"));
        oper.setReturnClass(cn.yesway.common.soap.userinfoservice.UserInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "GetByZJIDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userinfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetByUserName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserInfo"));
        oper.setReturnClass(cn.yesway.common.soap.userinfoservice.UserInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "GetByUserNameResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userinfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetByServicePhone");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "phone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ArrayOfUserInfo"));
        oper.setReturnClass(cn.yesway.common.soap.userinfoservice.UserInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "GetByServicePhoneResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserInfo"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userinfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddBindPhone");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "zjID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "phoneType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "phoneNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "AddBindPhoneResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userinfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RemoveBindPhone");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "RemoveBindPhoneResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userinfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateBindPhone");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "newModel"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserBindPhoneModel"), cn.yesway.common.soap.userinfoservice.UserBindPhoneModel.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "UpdateBindPhoneResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userinfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBindPhone");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "zjID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ArrayOfUserBindPhoneModel"));
        oper.setReturnClass(cn.yesway.common.soap.userinfoservice.UserBindPhoneModel[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "GetBindPhoneResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserBindPhoneModel"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userinfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangePassword");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "zjID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "newPassword"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "ChangePasswordResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userinfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetByBindingPhone");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "bindingPhone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ArrayOfUserInfo"));
        oper.setReturnClass(cn.yesway.common.soap.userinfoservice.UserInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "GetByBindingPhoneResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserInfo"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userinfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetByEmail");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ArrayOfUserInfo"));
        oper.setReturnClass(cn.yesway.common.soap.userinfoservice.UserInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "GetByEmailResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserInfo"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userinfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetByLicensePlateNo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "licensePlateNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ArrayOfUserInfo"));
        oper.setReturnClass(cn.yesway.common.soap.userinfoservice.UserInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "GetByLicensePlateNoResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserInfo"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userinfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetByTelphone");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "telphone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ArrayOfUserInfo"));
        oper.setReturnClass(cn.yesway.common.soap.userinfoservice.UserInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "GetByTelphoneResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserInfo"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userinfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetByVinNO");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "vinNO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ArrayOfUserInfo"));
        oper.setReturnClass(cn.yesway.common.soap.userinfoservice.UserInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "GetByVinNOResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserInfo"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userinfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetByOBDID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "obdid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserInfo"));
        oper.setReturnClass(cn.yesway.common.soap.userinfoservice.UserInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "GetByOBDIDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userinfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetByZJIDList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "zjidList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring"), java.lang.String[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "switches"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models.UserCenter", "ArrayOfUserDetailInfo"));
        oper.setReturnClass(cn.yesway.common.soap.userinfoservice.UserDetailInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "GetByZJIDListResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models.UserCenter", "UserDetailInfo"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userinfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[18] = oper;

    }

    public BasicHttpBinding_UserInfoServiceStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BasicHttpBinding_UserInfoServiceStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BasicHttpBinding_UserInfoServiceStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models.UserCenter", "ArrayOfUserDetailInfo");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userinfoservice.UserDetailInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models.UserCenter", "UserDetailInfo");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models.UserCenter", "UserDetailInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models.UserCenter", "UserDetailInfo");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userinfoservice.UserDetailInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ArrayOfUserBindPhoneModel");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userinfoservice.UserBindPhoneModel[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserBindPhoneModel");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserBindPhoneModel");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ArrayOfUserInfo");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userinfoservice.UserInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserInfo");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ArrayOfUserIntegral");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userinfoservice.UserIntegral[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserIntegral");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserIntegral");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "BaseModel");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userinfoservice.BaseModel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userinfoservice.ErrorMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "InsuranceInfo");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userinfoservice.InsuranceInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ProductInfo");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userinfoservice.ProductInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserBindPhoneModel");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userinfoservice.UserBindPhoneModel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserContactInfo");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userinfoservice.UserContactInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserInfo");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userinfoservice.UserInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserIntegral");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userinfoservice.UserIntegral.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserLocation");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userinfoservice.UserLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserOBD");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userinfoservice.UserOBD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserOrder");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userinfoservice.UserOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserVehicleCareSet");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userinfoservice.UserVehicleCareSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserVehicleInfo");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userinfoservice.UserVehicleInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public java.lang.Boolean update(cn.yesway.common.soap.userinfoservice.UserInfo userInfo) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserInfoServiceNamespace/UserInfoService/Update");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "Update"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userInfo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Boolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Boolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userinfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userinfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void updateUserIntegral(java.lang.String zjID, java.lang.Integer integralNum) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserInfoServiceNamespace/UserInfoService/UpdateUserIntegral");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "UpdateUserIntegral"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {zjID, integralNum});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userinfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userinfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userinfoservice.UserIntegral getUserIntegral(java.lang.String zjID) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserInfoServiceNamespace/UserInfoService/GetUserIntegral");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "GetUserIntegral"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {zjID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.yesway.common.soap.userinfoservice.UserIntegral) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userinfoservice.UserIntegral) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userinfoservice.UserIntegral.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userinfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userinfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userinfoservice.UserIntegral[] getlistUserIntegral(java.lang.String zjID, java.lang.String startTime, java.lang.String endTime, java.lang.Integer pageIndex, java.lang.Integer pageSize, javax.xml.rpc.holders.IntegerWrapperHolder rowCount, javax.xml.rpc.holders.IntegerWrapperHolder pageCount) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserInfoServiceNamespace/UserInfoService/GetlistUserIntegral");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "GetlistUserIntegral"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {zjID, startTime, endTime, pageIndex, pageSize, rowCount.value, pageCount.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                rowCount.value = (java.lang.Integer) _output.get(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "rowCount"));
            } catch (java.lang.Exception _exception) {
                rowCount.value = (java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "rowCount")), java.lang.Integer.class);
            }
            try {
                pageCount.value = (java.lang.Integer) _output.get(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "pageCount"));
            } catch (java.lang.Exception _exception) {
                pageCount.value = (java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "pageCount")), java.lang.Integer.class);
            }
            try {
                return (cn.yesway.common.soap.userinfoservice.UserIntegral[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userinfoservice.UserIntegral[]) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userinfoservice.UserIntegral[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userinfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userinfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userinfoservice.UserInfo getByZJID(java.lang.String zjID) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserInfoServiceNamespace/UserInfoService/GetByZJID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "GetByZJID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {zjID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.yesway.common.soap.userinfoservice.UserInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userinfoservice.UserInfo) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userinfoservice.UserInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userinfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userinfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userinfoservice.UserInfo getByUserName(java.lang.String userName) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserInfoServiceNamespace/UserInfoService/GetByUserName");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "GetByUserName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {userName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.yesway.common.soap.userinfoservice.UserInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userinfoservice.UserInfo) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userinfoservice.UserInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userinfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userinfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userinfoservice.UserInfo[] getByServicePhone(java.lang.String phone) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserInfoServiceNamespace/UserInfoService/GetByServicePhone");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "GetByServicePhone"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {phone});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.yesway.common.soap.userinfoservice.UserInfo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userinfoservice.UserInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userinfoservice.UserInfo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userinfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userinfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String addBindPhone(java.lang.String zjID, java.lang.Integer phoneType, java.lang.String phoneNumber) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserInfoServiceNamespace/UserInfoService/AddBindPhone");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "AddBindPhone"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {zjID, phoneType, phoneNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userinfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userinfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Boolean removeBindPhone(java.lang.String id) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserInfoServiceNamespace/UserInfoService/RemoveBindPhone");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "RemoveBindPhone"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Boolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Boolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userinfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userinfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Boolean updateBindPhone(cn.yesway.common.soap.userinfoservice.UserBindPhoneModel newModel) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserInfoServiceNamespace/UserInfoService/UpdateBindPhone");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "UpdateBindPhone"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {newModel});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Boolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Boolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userinfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userinfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userinfoservice.UserBindPhoneModel[] getBindPhone(java.lang.String zjID) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserInfoServiceNamespace/UserInfoService/GetBindPhone");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "GetBindPhone"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {zjID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.yesway.common.soap.userinfoservice.UserBindPhoneModel[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userinfoservice.UserBindPhoneModel[]) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userinfoservice.UserBindPhoneModel[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userinfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userinfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Boolean changePassword(java.lang.String zjID, java.lang.String newPassword) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserInfoServiceNamespace/UserInfoService/ChangePassword");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "ChangePassword"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {zjID, newPassword});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.Boolean) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.Boolean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userinfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userinfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userinfoservice.UserInfo[] getByBindingPhone(java.lang.String bindingPhone) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserInfoServiceNamespace/UserInfoService/GetByBindingPhone");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "GetByBindingPhone"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bindingPhone});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.yesway.common.soap.userinfoservice.UserInfo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userinfoservice.UserInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userinfoservice.UserInfo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userinfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userinfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userinfoservice.UserInfo[] getByEmail(java.lang.String email) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserInfoServiceNamespace/UserInfoService/GetByEmail");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "GetByEmail"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {email});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.yesway.common.soap.userinfoservice.UserInfo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userinfoservice.UserInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userinfoservice.UserInfo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userinfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userinfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userinfoservice.UserInfo[] getByLicensePlateNo(java.lang.String licensePlateNo) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserInfoServiceNamespace/UserInfoService/GetByLicensePlateNo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "GetByLicensePlateNo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {licensePlateNo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.yesway.common.soap.userinfoservice.UserInfo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userinfoservice.UserInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userinfoservice.UserInfo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userinfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userinfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userinfoservice.UserInfo[] getByTelphone(java.lang.String telphone) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserInfoServiceNamespace/UserInfoService/GetByTelphone");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "GetByTelphone"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {telphone});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.yesway.common.soap.userinfoservice.UserInfo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userinfoservice.UserInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userinfoservice.UserInfo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userinfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userinfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userinfoservice.UserInfo[] getByVinNO(java.lang.String vinNO) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserInfoServiceNamespace/UserInfoService/GetByVinNO");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "GetByVinNO"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {vinNO});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.yesway.common.soap.userinfoservice.UserInfo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userinfoservice.UserInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userinfoservice.UserInfo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userinfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userinfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userinfoservice.UserInfo getByOBDID(java.lang.String obdid) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserInfoServiceNamespace/UserInfoService/GetByOBDID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "GetByOBDID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {obdid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.yesway.common.soap.userinfoservice.UserInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userinfoservice.UserInfo) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userinfoservice.UserInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userinfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userinfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userinfoservice.UserDetailInfo[] getByZJIDList(java.lang.String[] zjidList, java.lang.String switches) throws java.rmi.RemoteException, cn.yesway.common.soap.userinfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserInfoServiceNamespace/UserInfoService/GetByZJIDList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserInfoServiceNamespace", "GetByZJIDList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {zjidList, switches});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.yesway.common.soap.userinfoservice.UserDetailInfo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userinfoservice.UserDetailInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userinfoservice.UserDetailInfo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userinfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userinfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
