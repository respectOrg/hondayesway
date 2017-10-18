/**
 * UserDetailInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.yesway.common.soap.userinfoservice;

public class UserDetailInfo  implements java.io.Serializable {
    private cn.yesway.common.soap.userinfoservice.UserInfo baseInfo;

    private cn.yesway.common.soap.userinfoservice.UserVehicleCareSet careSetInfo;

    private cn.yesway.common.soap.userinfoservice.UserContactInfo contactInfo;

    private cn.yesway.common.soap.userinfoservice.InsuranceInfo insuranceInfo;

    private cn.yesway.common.soap.userinfoservice.UserLocation locationInfo;

    private cn.yesway.common.soap.userinfoservice.UserOBD obdInfo;

    private cn.yesway.common.soap.userinfoservice.UserOrder userOrderInfo;

    private cn.yesway.common.soap.userinfoservice.UserVehicleInfo vehicleInfo;

    public UserDetailInfo() {
    }

    public UserDetailInfo(
           cn.yesway.common.soap.userinfoservice.UserInfo baseInfo,
           cn.yesway.common.soap.userinfoservice.UserVehicleCareSet careSetInfo,
           cn.yesway.common.soap.userinfoservice.UserContactInfo contactInfo,
           cn.yesway.common.soap.userinfoservice.InsuranceInfo insuranceInfo,
           cn.yesway.common.soap.userinfoservice.UserLocation locationInfo,
           cn.yesway.common.soap.userinfoservice.UserOBD obdInfo,
           cn.yesway.common.soap.userinfoservice.UserOrder userOrderInfo,
           cn.yesway.common.soap.userinfoservice.UserVehicleInfo vehicleInfo) {
           this.baseInfo = baseInfo;
           this.careSetInfo = careSetInfo;
           this.contactInfo = contactInfo;
           this.insuranceInfo = insuranceInfo;
           this.locationInfo = locationInfo;
           this.obdInfo = obdInfo;
           this.userOrderInfo = userOrderInfo;
           this.vehicleInfo = vehicleInfo;
    }


    /**
     * Gets the baseInfo value for this UserDetailInfo.
     * 
     * @return baseInfo
     */
    public cn.yesway.common.soap.userinfoservice.UserInfo getBaseInfo() {
        return baseInfo;
    }


    /**
     * Sets the baseInfo value for this UserDetailInfo.
     * 
     * @param baseInfo
     */
    public void setBaseInfo(cn.yesway.common.soap.userinfoservice.UserInfo baseInfo) {
        this.baseInfo = baseInfo;
    }


    /**
     * Gets the careSetInfo value for this UserDetailInfo.
     * 
     * @return careSetInfo
     */
    public cn.yesway.common.soap.userinfoservice.UserVehicleCareSet getCareSetInfo() {
        return careSetInfo;
    }


    /**
     * Sets the careSetInfo value for this UserDetailInfo.
     * 
     * @param careSetInfo
     */
    public void setCareSetInfo(cn.yesway.common.soap.userinfoservice.UserVehicleCareSet careSetInfo) {
        this.careSetInfo = careSetInfo;
    }


    /**
     * Gets the contactInfo value for this UserDetailInfo.
     * 
     * @return contactInfo
     */
    public cn.yesway.common.soap.userinfoservice.UserContactInfo getContactInfo() {
        return contactInfo;
    }


    /**
     * Sets the contactInfo value for this UserDetailInfo.
     * 
     * @param contactInfo
     */
    public void setContactInfo(cn.yesway.common.soap.userinfoservice.UserContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }


    /**
     * Gets the insuranceInfo value for this UserDetailInfo.
     * 
     * @return insuranceInfo
     */
    public cn.yesway.common.soap.userinfoservice.InsuranceInfo getInsuranceInfo() {
        return insuranceInfo;
    }


    /**
     * Sets the insuranceInfo value for this UserDetailInfo.
     * 
     * @param insuranceInfo
     */
    public void setInsuranceInfo(cn.yesway.common.soap.userinfoservice.InsuranceInfo insuranceInfo) {
        this.insuranceInfo = insuranceInfo;
    }


    /**
     * Gets the locationInfo value for this UserDetailInfo.
     * 
     * @return locationInfo
     */
    public cn.yesway.common.soap.userinfoservice.UserLocation getLocationInfo() {
        return locationInfo;
    }


    /**
     * Sets the locationInfo value for this UserDetailInfo.
     * 
     * @param locationInfo
     */
    public void setLocationInfo(cn.yesway.common.soap.userinfoservice.UserLocation locationInfo) {
        this.locationInfo = locationInfo;
    }


    /**
     * Gets the obdInfo value for this UserDetailInfo.
     * 
     * @return obdInfo
     */
    public cn.yesway.common.soap.userinfoservice.UserOBD getObdInfo() {
        return obdInfo;
    }


    /**
     * Sets the obdInfo value for this UserDetailInfo.
     * 
     * @param obdInfo
     */
    public void setObdInfo(cn.yesway.common.soap.userinfoservice.UserOBD obdInfo) {
        this.obdInfo = obdInfo;
    }


    /**
     * Gets the userOrderInfo value for this UserDetailInfo.
     * 
     * @return userOrderInfo
     */
    public cn.yesway.common.soap.userinfoservice.UserOrder getUserOrderInfo() {
        return userOrderInfo;
    }


    /**
     * Sets the userOrderInfo value for this UserDetailInfo.
     * 
     * @param userOrderInfo
     */
    public void setUserOrderInfo(cn.yesway.common.soap.userinfoservice.UserOrder userOrderInfo) {
        this.userOrderInfo = userOrderInfo;
    }


    /**
     * Gets the vehicleInfo value for this UserDetailInfo.
     * 
     * @return vehicleInfo
     */
    public cn.yesway.common.soap.userinfoservice.UserVehicleInfo getVehicleInfo() {
        return vehicleInfo;
    }


    /**
     * Sets the vehicleInfo value for this UserDetailInfo.
     * 
     * @param vehicleInfo
     */
    public void setVehicleInfo(cn.yesway.common.soap.userinfoservice.UserVehicleInfo vehicleInfo) {
        this.vehicleInfo = vehicleInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserDetailInfo)) return false;
        UserDetailInfo other = (UserDetailInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.baseInfo==null && other.getBaseInfo()==null) || 
             (this.baseInfo!=null &&
              this.baseInfo.equals(other.getBaseInfo()))) &&
            ((this.careSetInfo==null && other.getCareSetInfo()==null) || 
             (this.careSetInfo!=null &&
              this.careSetInfo.equals(other.getCareSetInfo()))) &&
            ((this.contactInfo==null && other.getContactInfo()==null) || 
             (this.contactInfo!=null &&
              this.contactInfo.equals(other.getContactInfo()))) &&
            ((this.insuranceInfo==null && other.getInsuranceInfo()==null) || 
             (this.insuranceInfo!=null &&
              this.insuranceInfo.equals(other.getInsuranceInfo()))) &&
            ((this.locationInfo==null && other.getLocationInfo()==null) || 
             (this.locationInfo!=null &&
              this.locationInfo.equals(other.getLocationInfo()))) &&
            ((this.obdInfo==null && other.getObdInfo()==null) || 
             (this.obdInfo!=null &&
              this.obdInfo.equals(other.getObdInfo()))) &&
            ((this.userOrderInfo==null && other.getUserOrderInfo()==null) || 
             (this.userOrderInfo!=null &&
              this.userOrderInfo.equals(other.getUserOrderInfo()))) &&
            ((this.vehicleInfo==null && other.getVehicleInfo()==null) || 
             (this.vehicleInfo!=null &&
              this.vehicleInfo.equals(other.getVehicleInfo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getBaseInfo() != null) {
            _hashCode += getBaseInfo().hashCode();
        }
        if (getCareSetInfo() != null) {
            _hashCode += getCareSetInfo().hashCode();
        }
        if (getContactInfo() != null) {
            _hashCode += getContactInfo().hashCode();
        }
        if (getInsuranceInfo() != null) {
            _hashCode += getInsuranceInfo().hashCode();
        }
        if (getLocationInfo() != null) {
            _hashCode += getLocationInfo().hashCode();
        }
        if (getObdInfo() != null) {
            _hashCode += getObdInfo().hashCode();
        }
        if (getUserOrderInfo() != null) {
            _hashCode += getUserOrderInfo().hashCode();
        }
        if (getVehicleInfo() != null) {
            _hashCode += getVehicleInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserDetailInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models.UserCenter", "UserDetailInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models.UserCenter", "BaseInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("careSetInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models.UserCenter", "CareSetInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserVehicleCareSet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models.UserCenter", "ContactInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserContactInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuranceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models.UserCenter", "InsuranceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "InsuranceInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models.UserCenter", "LocationInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserLocation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obdInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models.UserCenter", "ObdInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserOBD"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userOrderInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models.UserCenter", "UserOrderInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserOrder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models.UserCenter", "VehicleInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserVehicleInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
