/**
 * ZJUser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.yesway.common.soap.usersyncservice;

public class ZJUser  implements java.io.Serializable {
    private cn.yesway.common.soap.usersyncservice.UserBaseInfo userBaseInfo;

    private cn.yesway.common.soap.usersyncservice.UserBindPhone[] userBindPhone;

    private cn.yesway.common.soap.usersyncservice.UserContactInfo userContactInfo;

    private cn.yesway.common.soap.usersyncservice.UserOrder userOrder;

    private cn.yesway.common.soap.usersyncservice.UserVehicleInfo userVehicleInfo;

    public ZJUser() {
    }

    public ZJUser(
           cn.yesway.common.soap.usersyncservice.UserBaseInfo userBaseInfo,
           cn.yesway.common.soap.usersyncservice.UserBindPhone[] userBindPhone,
           cn.yesway.common.soap.usersyncservice.UserContactInfo userContactInfo,
           cn.yesway.common.soap.usersyncservice.UserOrder userOrder,
           cn.yesway.common.soap.usersyncservice.UserVehicleInfo userVehicleInfo) {
           this.userBaseInfo = userBaseInfo;
           this.userBindPhone = userBindPhone;
           this.userContactInfo = userContactInfo;
           this.userOrder = userOrder;
           this.userVehicleInfo = userVehicleInfo;
    }


    /**
     * Gets the userBaseInfo value for this ZJUser.
     * 
     * @return userBaseInfo
     */
    public cn.yesway.common.soap.usersyncservice.UserBaseInfo getUserBaseInfo() {
        return userBaseInfo;
    }


    /**
     * Sets the userBaseInfo value for this ZJUser.
     * 
     * @param userBaseInfo
     */
    public void setUserBaseInfo(cn.yesway.common.soap.usersyncservice.UserBaseInfo userBaseInfo) {
        this.userBaseInfo = userBaseInfo;
    }


    /**
     * Gets the userBindPhone value for this ZJUser.
     * 
     * @return userBindPhone
     */
    public cn.yesway.common.soap.usersyncservice.UserBindPhone[] getUserBindPhone() {
        return userBindPhone;
    }


    /**
     * Sets the userBindPhone value for this ZJUser.
     * 
     * @param userBindPhone
     */
    public void setUserBindPhone(cn.yesway.common.soap.usersyncservice.UserBindPhone[] userBindPhone) {
        this.userBindPhone = userBindPhone;
    }


    /**
     * Gets the userContactInfo value for this ZJUser.
     * 
     * @return userContactInfo
     */
    public cn.yesway.common.soap.usersyncservice.UserContactInfo getUserContactInfo() {
        return userContactInfo;
    }


    /**
     * Sets the userContactInfo value for this ZJUser.
     * 
     * @param userContactInfo
     */
    public void setUserContactInfo(cn.yesway.common.soap.usersyncservice.UserContactInfo userContactInfo) {
        this.userContactInfo = userContactInfo;
    }


    /**
     * Gets the userOrder value for this ZJUser.
     * 
     * @return userOrder
     */
    public cn.yesway.common.soap.usersyncservice.UserOrder getUserOrder() {
        return userOrder;
    }


    /**
     * Sets the userOrder value for this ZJUser.
     * 
     * @param userOrder
     */
    public void setUserOrder(cn.yesway.common.soap.usersyncservice.UserOrder userOrder) {
        this.userOrder = userOrder;
    }


    /**
     * Gets the userVehicleInfo value for this ZJUser.
     * 
     * @return userVehicleInfo
     */
    public cn.yesway.common.soap.usersyncservice.UserVehicleInfo getUserVehicleInfo() {
        return userVehicleInfo;
    }


    /**
     * Sets the userVehicleInfo value for this ZJUser.
     * 
     * @param userVehicleInfo
     */
    public void setUserVehicleInfo(cn.yesway.common.soap.usersyncservice.UserVehicleInfo userVehicleInfo) {
        this.userVehicleInfo = userVehicleInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZJUser)) return false;
        ZJUser other = (ZJUser) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userBaseInfo==null && other.getUserBaseInfo()==null) || 
             (this.userBaseInfo!=null &&
              this.userBaseInfo.equals(other.getUserBaseInfo()))) &&
            ((this.userBindPhone==null && other.getUserBindPhone()==null) || 
             (this.userBindPhone!=null &&
              java.util.Arrays.equals(this.userBindPhone, other.getUserBindPhone()))) &&
            ((this.userContactInfo==null && other.getUserContactInfo()==null) || 
             (this.userContactInfo!=null &&
              this.userContactInfo.equals(other.getUserContactInfo()))) &&
            ((this.userOrder==null && other.getUserOrder()==null) || 
             (this.userOrder!=null &&
              this.userOrder.equals(other.getUserOrder()))) &&
            ((this.userVehicleInfo==null && other.getUserVehicleInfo()==null) || 
             (this.userVehicleInfo!=null &&
              this.userVehicleInfo.equals(other.getUserVehicleInfo())));
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
        if (getUserBaseInfo() != null) {
            _hashCode += getUserBaseInfo().hashCode();
        }
        if (getUserBindPhone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserBindPhone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserBindPhone(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserContactInfo() != null) {
            _hashCode += getUserContactInfo().hashCode();
        }
        if (getUserOrder() != null) {
            _hashCode += getUserOrder().hashCode();
        }
        if (getUserVehicleInfo() != null) {
            _hashCode += getUserVehicleInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZJUser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayUserSync.Models", "ZJUser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userBaseInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayUserSync.Models", "UserBaseInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayUserSync.Models", "UserBaseInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userBindPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayUserSync.Models", "UserBindPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayUserSync.Models", "UserBindPhone"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayUserSync.Models", "UserBindPhone"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userContactInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayUserSync.Models", "UserContactInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayUserSync.Models", "UserContactInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayUserSync.Models", "UserOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayUserSync.Models", "UserOrder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userVehicleInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayUserSync.Models", "UserVehicleInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayUserSync.Models", "UserVehicleInfo"));
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
