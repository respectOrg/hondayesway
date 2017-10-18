/**
 * BasicHttpBinding_UserExtraInfoServiceStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.yesway.common.soap.userextrainfoservice;

public class BasicHttpBinding_UserExtraInfoServiceStub extends org.apache.axis.client.Stub implements cn.yesway.common.soap.userextrainfoservice.UserExtraInfoService_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[47];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateInvoice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "invoice"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserInvoice"), cn.yesway.common.soap.userextrainfoservice.UserInvoice.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "UpdateInvoiceResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteInvoice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "DeleteInvoiceResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetInvoice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "zjid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ArrayOfUserInvoice"));
        oper.setReturnClass(cn.yesway.common.soap.userextrainfoservice.UserInvoice[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetInvoiceResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserInvoice"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddPostAddress");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "postaddress"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserPostAddress"), cn.yesway.common.soap.userextrainfoservice.UserPostAddress.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "AddPostAddressResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdatePostAddress");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "postaddress"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserPostAddress"), cn.yesway.common.soap.userextrainfoservice.UserPostAddress.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "UpdatePostAddressResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeletePostAddress");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "DeletePostAddressResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPostAddress");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "zjID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ArrayOfUserPostAddress"));
        oper.setReturnClass(cn.yesway.common.soap.userextrainfoservice.UserPostAddress[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetPostAddressResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserPostAddress"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddOBD");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "model"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserOBD"), cn.yesway.common.soap.userextrainfoservice.UserOBD.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "AddOBDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateOBD");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "model"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserOBD"), cn.yesway.common.soap.userextrainfoservice.UserOBD.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "UpdateOBDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetOBDByzjId");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "zjId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserOBD"));
        oper.setReturnClass(cn.yesway.common.soap.userextrainfoservice.UserOBD.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetOBDByzjIdResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetOBDByOBDID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "obdId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserOBD"));
        oper.setReturnClass(cn.yesway.common.soap.userextrainfoservice.UserOBD.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetOBDByOBDIDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UnBindOBD");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "obdId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "zjid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OpenSIM");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "simKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfstringstring"), cn.yesway.common.soap.userextrainfoservice.ArrayOfKeyValueOfstringstringKeyValueOfstringstring[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "KeyValueOfstringstring"));
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "OpenSIMResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetOBDByCondition");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "zjid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "obdId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "simKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "simNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "simStatus"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "orderStatus"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "startTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "endTime"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "timeType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "productId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "sortFiled"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "page"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Common", "PageInfo"), cn.yesway.common.soap.userextrainfoservice.PageInfo.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ArrayOfUserOBDExt"));
        oper.setReturnClass(cn.yesway.common.soap.userextrainfoservice.UserOBDExt[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetOBDByConditionResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserOBDExt"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddUserMaintenaceFactory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "model"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models.UserCenter", "UserMaintenanceFactory"), cn.yesway.common.soap.userextrainfoservice.UserMaintenanceFactory.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "AddUserMaintenaceFactoryResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteUserMaintenaceFactory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "ZJID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "maintenaceFactoryRecordID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "DeleteUserMaintenaceFactoryResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUserMaintenaceFactoryByZJID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "ZJID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "page"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Common", "PageInfo"), cn.yesway.common.soap.userextrainfoservice.PageInfo.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models.UserCenter", "ArrayOfUserMaintenanceFactory"));
        oper.setReturnClass(cn.yesway.common.soap.userextrainfoservice.UserMaintenanceFactory[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetUserMaintenaceFactoryByZJIDResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models.UserCenter", "UserMaintenanceFactory"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUserMaintenaceFactoryByID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "zjid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "maintenaceFactoryRecordID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models.UserCenter", "UserMaintenanceFactory"));
        oper.setReturnClass(cn.yesway.common.soap.userextrainfoservice.UserMaintenanceFactory.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetUserMaintenaceFactoryByIDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetDefaultUserMaintenaceFactory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "ZJID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "maintenaceFactoryRecordID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "SetDefaultUserMaintenaceFactoryResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddVehicle");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "vehicleInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserVehicleInfo"), cn.yesway.common.soap.userextrainfoservice.UserVehicleInfo.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "AddVehicleResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateVehicle");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "vehicleInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserVehicleInfo"), cn.yesway.common.soap.userextrainfoservice.UserVehicleInfo.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "UpdateVehicleResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateVehicleWithOBDReset");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "vehicleInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserVehicleInfo"), cn.yesway.common.soap.userextrainfoservice.UserVehicleInfo.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "UpdateVehicleWithOBDResetResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteVehicle");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "DeleteVehicleResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetVehicleByZJID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "ZJID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ArrayOfUserVehicleInfo"));
        oper.setReturnClass(cn.yesway.common.soap.userextrainfoservice.UserVehicleInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetVehicleByZJIDResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserVehicleInfo"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllByZJID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "ZJID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.UserCenter.Model", "ArrayOfUserVehicleModel"));
        oper.setReturnClass(cn.yesway.common.soap.userextrainfoservice.UserVehicleModel[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetAllByZJIDResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.UserCenter.Model", "UserVehicleModel"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetVehicleByPlateNo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "licensePlateNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ArrayOfUserVehicleInfo"));
        oper.setReturnClass(cn.yesway.common.soap.userextrainfoservice.UserVehicleInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetVehicleByPlateNoResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserVehicleInfo"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetVehicleByID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "ID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserVehicleInfo"));
        oper.setReturnClass(cn.yesway.common.soap.userextrainfoservice.UserVehicleInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetVehicleByIDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCareSetByZJID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "ZJID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ArrayOfUserVehicleCareSet"));
        oper.setReturnClass(cn.yesway.common.soap.userextrainfoservice.UserVehicleCareSet[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetCareSetByZJIDResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserVehicleCareSet"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCareSetByPlateNo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "licensePlateNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ArrayOfUserVehicleCareSet"));
        oper.setReturnClass(cn.yesway.common.soap.userextrainfoservice.UserVehicleCareSet[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetCareSetByPlateNoResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserVehicleCareSet"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCareSetByID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserVehicleCareSet"));
        oper.setReturnClass(cn.yesway.common.soap.userextrainfoservice.UserVehicleCareSet.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetCareSetByIDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCareNotification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "CareNotification"));
        oper.setReturnClass(cn.yesway.common.soap.userextrainfoservice.CareNotification.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetCareNotificationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddCareSet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "model"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserVehicleCareSet"), cn.yesway.common.soap.userextrainfoservice.UserVehicleCareSet.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "AddCareSetResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateCareSet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "model"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserVehicleCareSet"), cn.yesway.common.soap.userextrainfoservice.UserVehicleCareSet.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "UpdateCareSetResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateTotalDistance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "zjID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "totalDistance"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "UpdateTotalDistanceResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateOBDTotalDistance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "zjID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "obdTotalDistance"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "UpdateOBDTotalDistanceResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNeedCareByCondition");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "channelID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "channelPK"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "MileageDistance"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "TimeDistance"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "page"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Common", "PageInfo"), cn.yesway.common.soap.userextrainfoservice.PageInfo.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ArrayOfVehicleNeedCare"));
        oper.setReturnClass(cn.yesway.common.soap.userextrainfoservice.VehicleNeedCare[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetNeedCareByConditionResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "VehicleNeedCare"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateContactInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "contactInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserContactInfo"), cn.yesway.common.soap.userextrainfoservice.UserContactInfo.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "UpdateContactInfoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetContactInfoByZJID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "ZJID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserContactInfo"));
        oper.setReturnClass(cn.yesway.common.soap.userextrainfoservice.UserContactInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetContactInfoByZJIDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddInsurance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "insuranceInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "InsuranceInfo"), cn.yesway.common.soap.userextrainfoservice.InsuranceInfo.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "AddInsuranceResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateInsurance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "insuranceInfo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "InsuranceInfo"), cn.yesway.common.soap.userextrainfoservice.InsuranceInfo.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "UpdateInsuranceResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteInsurance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "ID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "DeleteInsuranceResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetInsuranceByID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "ID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "InsuranceInfo"));
        oper.setReturnClass(cn.yesway.common.soap.userextrainfoservice.InsuranceInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetInsuranceByIDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetInsuranceByZJID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "ZJID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ArrayOfInsuranceInfo"));
        oper.setReturnClass(cn.yesway.common.soap.userextrainfoservice.InsuranceInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetInsuranceByZJIDResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "InsuranceInfo"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetInsuranceByVehicleID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "vehicleID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ArrayOfInsuranceInfo"));
        oper.setReturnClass(cn.yesway.common.soap.userextrainfoservice.InsuranceInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetInsuranceByVehicleIDResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "InsuranceInfo"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateUserLocation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "model"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserLocation"), cn.yesway.common.soap.userextrainfoservice.UserLocation.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(java.lang.Boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "UpdateUserLocationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUserLoction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "ZJID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "productID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ArrayOfUserLocation"));
        oper.setReturnClass(cn.yesway.common.soap.userextrainfoservice.UserLocation[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetUserLoctionResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserLocation"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddInvoice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "invoice"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserInvoice"), cn.yesway.common.soap.userextrainfoservice.UserInvoice.class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "AddInvoiceResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"),
                      "cn.yesway.common.soap.userextrainfoservice.ErrorMessage",
                      new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage"), 
                      true
                     ));
        _operations[46] = oper;

    }

    public BasicHttpBinding_UserExtraInfoServiceStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BasicHttpBinding_UserExtraInfoServiceStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BasicHttpBinding_UserExtraInfoServiceStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Common", "PageInfo");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userextrainfoservice.PageInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models.UserCenter", "ArrayOfUserMaintenanceFactory");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userextrainfoservice.UserMaintenanceFactory[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models.UserCenter", "UserMaintenanceFactory");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models.UserCenter", "UserMaintenanceFactory");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models.UserCenter", "UserMaintenanceFactory");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userextrainfoservice.UserMaintenanceFactory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ArrayOfInsuranceInfo");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userextrainfoservice.InsuranceInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "InsuranceInfo");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "InsuranceInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ArrayOfUserInvoice");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userextrainfoservice.UserInvoice[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserInvoice");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserInvoice");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ArrayOfUserLocation");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userextrainfoservice.UserLocation[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserLocation");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserLocation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ArrayOfUserOBDExt");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userextrainfoservice.UserOBDExt[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserOBDExt");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserOBDExt");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ArrayOfUserPostAddress");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userextrainfoservice.UserPostAddress[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserPostAddress");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserPostAddress");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ArrayOfUserVehicleCareSet");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userextrainfoservice.UserVehicleCareSet[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserVehicleCareSet");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserVehicleCareSet");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ArrayOfUserVehicleInfo");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userextrainfoservice.UserVehicleInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserVehicleInfo");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserVehicleInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ArrayOfVehicleNeedCare");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userextrainfoservice.VehicleNeedCare[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "VehicleNeedCare");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "VehicleNeedCare");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "BaseModel");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userextrainfoservice.BaseModel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "CareNotification");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userextrainfoservice.CareNotification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ErrorMessage");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userextrainfoservice.ErrorMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "InsuranceInfo");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userextrainfoservice.InsuranceInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserContactInfo");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userextrainfoservice.UserContactInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserInvoice");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userextrainfoservice.UserInvoice.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserLocation");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userextrainfoservice.UserLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserOBD");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userextrainfoservice.UserOBD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserOBDExt");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userextrainfoservice.UserOBDExt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserPostAddress");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userextrainfoservice.UserPostAddress.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserVehicleCareSet");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userextrainfoservice.UserVehicleCareSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserVehicleInfo");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userextrainfoservice.UserVehicleInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "VehicleNeedCare");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userextrainfoservice.VehicleNeedCare.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.UserCenter.Model", "ArrayOfUserVehicleModel");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userextrainfoservice.UserVehicleModel[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.UserCenter.Model", "UserVehicleModel");
            qName2 = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.UserCenter.Model", "UserVehicleModel");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.UserCenter.Model", "UserVehicleModel");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userextrainfoservice.UserVehicleModel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.UserCenter.Model", "VehicleModel");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userextrainfoservice.VehicleModel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", ">ArrayOfKeyValueOfstringstring>KeyValueOfstringstring");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userextrainfoservice.ArrayOfKeyValueOfstringstringKeyValueOfstringstring.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfKeyValueOfstringstring");
            cachedSerQNames.add(qName);
            cls = cn.yesway.common.soap.userextrainfoservice.ArrayOfKeyValueOfstringstringKeyValueOfstringstring[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", ">ArrayOfKeyValueOfstringstring>KeyValueOfstringstring");
            qName2 = new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "KeyValueOfstringstring");
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

    public java.lang.Boolean updateInvoice(cn.yesway.common.soap.userextrainfoservice.UserInvoice invoice) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/UpdateInvoice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "UpdateInvoice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {invoice});

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
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Boolean deleteInvoice(java.lang.String id) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/DeleteInvoice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "DeleteInvoice"));

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
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userextrainfoservice.UserInvoice[] getInvoice(java.lang.String id, java.lang.String zjid) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/GetInvoice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetInvoice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id, zjid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.yesway.common.soap.userextrainfoservice.UserInvoice[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userextrainfoservice.UserInvoice[]) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userextrainfoservice.UserInvoice[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String addPostAddress(cn.yesway.common.soap.userextrainfoservice.UserPostAddress postaddress) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/AddPostAddress");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "AddPostAddress"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {postaddress});

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
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Boolean updatePostAddress(cn.yesway.common.soap.userextrainfoservice.UserPostAddress postaddress) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/UpdatePostAddress");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "UpdatePostAddress"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {postaddress});

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
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Boolean deletePostAddress(java.lang.String id) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/DeletePostAddress");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "DeletePostAddress"));

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
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userextrainfoservice.UserPostAddress[] getPostAddress(java.lang.String id, java.lang.String zjID) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/GetPostAddress");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetPostAddress"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id, zjID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.yesway.common.soap.userextrainfoservice.UserPostAddress[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userextrainfoservice.UserPostAddress[]) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userextrainfoservice.UserPostAddress[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Boolean addOBD(cn.yesway.common.soap.userextrainfoservice.UserOBD model) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/AddOBD");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "AddOBD"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {model});

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
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Boolean updateOBD(cn.yesway.common.soap.userextrainfoservice.UserOBD model) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/UpdateOBD");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "UpdateOBD"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {model});

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
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userextrainfoservice.UserOBD getOBDByzjId(java.lang.String zjId) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/GetOBDByzjId");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetOBDByzjId"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {zjId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.yesway.common.soap.userextrainfoservice.UserOBD) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userextrainfoservice.UserOBD) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userextrainfoservice.UserOBD.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userextrainfoservice.UserOBD getOBDByOBDID(java.lang.String obdId) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/GetOBDByOBDID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetOBDByOBDID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {obdId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.yesway.common.soap.userextrainfoservice.UserOBD) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userextrainfoservice.UserOBD) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userextrainfoservice.UserOBD.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void unBindOBD(java.lang.String obdId, java.lang.String zjid) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/UnBindOBD");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "UnBindOBD"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {obdId, zjid});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Boolean openSIM(cn.yesway.common.soap.userextrainfoservice.ArrayOfKeyValueOfstringstringKeyValueOfstringstring[] simKey) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/OpenSIM");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "OpenSIM"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {simKey});

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
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userextrainfoservice.UserOBDExt[] getOBDByCondition(java.lang.String zjid, java.lang.String obdId, java.lang.String simKey, java.lang.String simNumber, java.lang.Integer simStatus, java.lang.Integer orderStatus, java.util.Calendar startTime, java.util.Calendar endTime, java.lang.Integer timeType, java.lang.Integer productId, java.lang.String sortFiled, cn.yesway.common.soap.userextrainfoservice.holders.PageInfoHolder page) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/GetOBDByCondition");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetOBDByCondition"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {zjid, obdId, simKey, simNumber, simStatus, orderStatus, startTime, endTime, timeType, productId, sortFiled, page.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                page.value = (cn.yesway.common.soap.userextrainfoservice.PageInfo) _output.get(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "page"));
            } catch (java.lang.Exception _exception) {
                page.value = (cn.yesway.common.soap.userextrainfoservice.PageInfo) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "page")), cn.yesway.common.soap.userextrainfoservice.PageInfo.class);
            }
            try {
                return (cn.yesway.common.soap.userextrainfoservice.UserOBDExt[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userextrainfoservice.UserOBDExt[]) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userextrainfoservice.UserOBDExt[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Boolean addUserMaintenaceFactory(cn.yesway.common.soap.userextrainfoservice.UserMaintenanceFactory model) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/AddUserMaintenaceFactory");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "AddUserMaintenaceFactory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {model});

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
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Boolean deleteUserMaintenaceFactory(java.lang.String ZJID, java.lang.String maintenaceFactoryRecordID) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/DeleteUserMaintenaceFactory");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "DeleteUserMaintenaceFactory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ZJID, maintenaceFactoryRecordID});

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
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userextrainfoservice.UserMaintenanceFactory[] getUserMaintenaceFactoryByZJID(java.lang.String ZJID, cn.yesway.common.soap.userextrainfoservice.holders.PageInfoHolder page) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/GetUserMaintenaceFactoryByZJID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetUserMaintenaceFactoryByZJID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ZJID, page.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                page.value = (cn.yesway.common.soap.userextrainfoservice.PageInfo) _output.get(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "page"));
            } catch (java.lang.Exception _exception) {
                page.value = (cn.yesway.common.soap.userextrainfoservice.PageInfo) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "page")), cn.yesway.common.soap.userextrainfoservice.PageInfo.class);
            }
            try {
                return (cn.yesway.common.soap.userextrainfoservice.UserMaintenanceFactory[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userextrainfoservice.UserMaintenanceFactory[]) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userextrainfoservice.UserMaintenanceFactory[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userextrainfoservice.UserMaintenanceFactory getUserMaintenaceFactoryByID(java.lang.String zjid, java.lang.String maintenaceFactoryRecordID) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/GetUserMaintenaceFactoryByID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetUserMaintenaceFactoryByID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {zjid, maintenaceFactoryRecordID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.yesway.common.soap.userextrainfoservice.UserMaintenanceFactory) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userextrainfoservice.UserMaintenanceFactory) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userextrainfoservice.UserMaintenanceFactory.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Boolean setDefaultUserMaintenaceFactory(java.lang.String ZJID, java.lang.String maintenaceFactoryRecordID) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/SetDefaultUserMaintenaceFactory");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "SetDefaultUserMaintenaceFactory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ZJID, maintenaceFactoryRecordID});

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
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String addVehicle(cn.yesway.common.soap.userextrainfoservice.UserVehicleInfo vehicleInfo) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/AddVehicle");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "AddVehicle"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {vehicleInfo});

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
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Boolean updateVehicle(cn.yesway.common.soap.userextrainfoservice.UserVehicleInfo vehicleInfo) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/UpdateVehicle");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "UpdateVehicle"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {vehicleInfo});

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
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Boolean updateVehicleWithOBDReset(cn.yesway.common.soap.userextrainfoservice.UserVehicleInfo vehicleInfo) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/UpdateVehicleWithOBDReset");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "UpdateVehicleWithOBDReset"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {vehicleInfo});

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
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Boolean deleteVehicle(java.lang.String id) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/DeleteVehicle");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "DeleteVehicle"));

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
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userextrainfoservice.UserVehicleInfo[] getVehicleByZJID(java.lang.String ZJID) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/GetVehicleByZJID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetVehicleByZJID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ZJID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.yesway.common.soap.userextrainfoservice.UserVehicleInfo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userextrainfoservice.UserVehicleInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userextrainfoservice.UserVehicleInfo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userextrainfoservice.UserVehicleModel[] getAllByZJID(java.lang.String ZJID) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/GetAllByZJID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetAllByZJID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ZJID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.yesway.common.soap.userextrainfoservice.UserVehicleModel[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userextrainfoservice.UserVehicleModel[]) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userextrainfoservice.UserVehicleModel[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userextrainfoservice.UserVehicleInfo[] getVehicleByPlateNo(java.lang.String licensePlateNo) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/GetVehicleByPlateNo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetVehicleByPlateNo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {licensePlateNo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.yesway.common.soap.userextrainfoservice.UserVehicleInfo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userextrainfoservice.UserVehicleInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userextrainfoservice.UserVehicleInfo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userextrainfoservice.UserVehicleInfo getVehicleByID(java.lang.String ID) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/GetVehicleByID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetVehicleByID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.yesway.common.soap.userextrainfoservice.UserVehicleInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userextrainfoservice.UserVehicleInfo) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userextrainfoservice.UserVehicleInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userextrainfoservice.UserVehicleCareSet[] getCareSetByZJID(java.lang.String ZJID) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/GetCareSetByZJID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetCareSetByZJID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ZJID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.yesway.common.soap.userextrainfoservice.UserVehicleCareSet[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userextrainfoservice.UserVehicleCareSet[]) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userextrainfoservice.UserVehicleCareSet[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userextrainfoservice.UserVehicleCareSet[] getCareSetByPlateNo(java.lang.String licensePlateNo) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/GetCareSetByPlateNo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetCareSetByPlateNo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {licensePlateNo});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.yesway.common.soap.userextrainfoservice.UserVehicleCareSet[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userextrainfoservice.UserVehicleCareSet[]) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userextrainfoservice.UserVehicleCareSet[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userextrainfoservice.UserVehicleCareSet getCareSetByID(java.lang.String id) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/GetCareSetByID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetCareSetByID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.yesway.common.soap.userextrainfoservice.UserVehicleCareSet) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userextrainfoservice.UserVehicleCareSet) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userextrainfoservice.UserVehicleCareSet.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userextrainfoservice.CareNotification getCareNotification(java.lang.String id) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/GetCareNotification");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetCareNotification"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.yesway.common.soap.userextrainfoservice.CareNotification) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userextrainfoservice.CareNotification) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userextrainfoservice.CareNotification.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Boolean addCareSet(cn.yesway.common.soap.userextrainfoservice.UserVehicleCareSet model) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/AddCareSet");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "AddCareSet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {model});

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
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Boolean updateCareSet(cn.yesway.common.soap.userextrainfoservice.UserVehicleCareSet model) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/UpdateCareSet");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "UpdateCareSet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {model});

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
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Boolean updateTotalDistance(java.lang.String id, java.lang.String zjID, java.lang.Integer totalDistance) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/UpdateTotalDistance");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "UpdateTotalDistance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id, zjID, totalDistance});

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
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Boolean updateOBDTotalDistance(java.lang.String id, java.lang.String zjID, java.lang.Integer obdTotalDistance) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/UpdateOBDTotalDistance");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "UpdateOBDTotalDistance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {id, zjID, obdTotalDistance});

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
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userextrainfoservice.VehicleNeedCare[] getNeedCareByCondition(java.lang.String channelID, java.lang.String channelPK, java.lang.Integer mileageDistance, java.lang.Integer timeDistance, cn.yesway.common.soap.userextrainfoservice.holders.PageInfoHolder page) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/GetNeedCareByCondition");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetNeedCareByCondition"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {channelID, channelPK, mileageDistance, timeDistance, page.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                page.value = (cn.yesway.common.soap.userextrainfoservice.PageInfo) _output.get(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "page"));
            } catch (java.lang.Exception _exception) {
                page.value = (cn.yesway.common.soap.userextrainfoservice.PageInfo) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "page")), cn.yesway.common.soap.userextrainfoservice.PageInfo.class);
            }
            try {
                return (cn.yesway.common.soap.userextrainfoservice.VehicleNeedCare[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userextrainfoservice.VehicleNeedCare[]) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userextrainfoservice.VehicleNeedCare[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Boolean updateContactInfo(cn.yesway.common.soap.userextrainfoservice.UserContactInfo contactInfo) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/UpdateContactInfo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "UpdateContactInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {contactInfo});

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
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userextrainfoservice.UserContactInfo getContactInfoByZJID(java.lang.String ZJID) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/GetContactInfoByZJID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetContactInfoByZJID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ZJID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.yesway.common.soap.userextrainfoservice.UserContactInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userextrainfoservice.UserContactInfo) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userextrainfoservice.UserContactInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String addInsurance(cn.yesway.common.soap.userextrainfoservice.InsuranceInfo insuranceInfo) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/AddInsurance");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "AddInsurance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {insuranceInfo});

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
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Boolean updateInsurance(cn.yesway.common.soap.userextrainfoservice.InsuranceInfo insuranceInfo) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/UpdateInsurance");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "UpdateInsurance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {insuranceInfo});

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
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Boolean deleteInsurance(java.lang.String ID) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/DeleteInsurance");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "DeleteInsurance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ID});

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
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userextrainfoservice.InsuranceInfo getInsuranceByID(java.lang.String ID) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/GetInsuranceByID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetInsuranceByID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.yesway.common.soap.userextrainfoservice.InsuranceInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userextrainfoservice.InsuranceInfo) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userextrainfoservice.InsuranceInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userextrainfoservice.InsuranceInfo[] getInsuranceByZJID(java.lang.String ZJID) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/GetInsuranceByZJID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetInsuranceByZJID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ZJID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.yesway.common.soap.userextrainfoservice.InsuranceInfo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userextrainfoservice.InsuranceInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userextrainfoservice.InsuranceInfo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userextrainfoservice.InsuranceInfo[] getInsuranceByVehicleID(java.lang.String vehicleID) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/GetInsuranceByVehicleID");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetInsuranceByVehicleID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {vehicleID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.yesway.common.soap.userextrainfoservice.InsuranceInfo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userextrainfoservice.InsuranceInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userextrainfoservice.InsuranceInfo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.Boolean updateUserLocation(cn.yesway.common.soap.userextrainfoservice.UserLocation model) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/UpdateUserLocation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "UpdateUserLocation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {model});

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
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public cn.yesway.common.soap.userextrainfoservice.UserLocation[] getUserLoction(java.lang.String ZJID, java.lang.Integer productID) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/GetUserLoction");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "GetUserLoction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ZJID, productID});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cn.yesway.common.soap.userextrainfoservice.UserLocation[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (cn.yesway.common.soap.userextrainfoservice.UserLocation[]) org.apache.axis.utils.JavaUtils.convert(_resp, cn.yesway.common.soap.userextrainfoservice.UserLocation[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String addInvoice(cn.yesway.common.soap.userextrainfoservice.UserInvoice invoice) throws java.rmi.RemoteException, cn.yesway.common.soap.userextrainfoservice.ErrorMessage {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://www.95190.com/UserExtraInfoServiceNamespace/UserExtraInfoService/AddInvoice");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.95190.com/UserExtraInfoServiceNamespace", "AddInvoice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {invoice});

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
        if (axisFaultException.detail instanceof cn.yesway.common.soap.userextrainfoservice.ErrorMessage) {
              throw (cn.yesway.common.soap.userextrainfoservice.ErrorMessage) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
