/**
 * UserOBD.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.yesway.common.soap.userextrainfoservice;

public class UserOBD  extends cn.yesway.common.soap.userextrainfoservice.BaseModel  implements java.io.Serializable {
    private java.util.Calendar addTime;

    private java.lang.String OBDID;

    private java.util.Calendar openTime;

    private java.lang.String SIMKey;

    private java.lang.String SIMNumber;

    private java.lang.Integer SIMStatus;

    private java.util.Calendar updateTime;

    private java.lang.String ZJID;

    public UserOBD() {
    }

    public UserOBD(
           java.util.Calendar ts,
           java.util.Calendar addTime,
           java.lang.String OBDID,
           java.util.Calendar openTime,
           java.lang.String SIMKey,
           java.lang.String SIMNumber,
           java.lang.Integer SIMStatus,
           java.util.Calendar updateTime,
           java.lang.String ZJID) {
        super(
            ts);
        this.addTime = addTime;
        this.OBDID = OBDID;
        this.openTime = openTime;
        this.SIMKey = SIMKey;
        this.SIMNumber = SIMNumber;
        this.SIMStatus = SIMStatus;
        this.updateTime = updateTime;
        this.ZJID = ZJID;
    }


    /**
     * Gets the addTime value for this UserOBD.
     * 
     * @return addTime
     */
    public java.util.Calendar getAddTime() {
        return addTime;
    }


    /**
     * Sets the addTime value for this UserOBD.
     * 
     * @param addTime
     */
    public void setAddTime(java.util.Calendar addTime) {
        this.addTime = addTime;
    }


    /**
     * Gets the OBDID value for this UserOBD.
     * 
     * @return OBDID
     */
    public java.lang.String getOBDID() {
        return OBDID;
    }


    /**
     * Sets the OBDID value for this UserOBD.
     * 
     * @param OBDID
     */
    public void setOBDID(java.lang.String OBDID) {
        this.OBDID = OBDID;
    }


    /**
     * Gets the openTime value for this UserOBD.
     * 
     * @return openTime
     */
    public java.util.Calendar getOpenTime() {
        return openTime;
    }


    /**
     * Sets the openTime value for this UserOBD.
     * 
     * @param openTime
     */
    public void setOpenTime(java.util.Calendar openTime) {
        this.openTime = openTime;
    }


    /**
     * Gets the SIMKey value for this UserOBD.
     * 
     * @return SIMKey
     */
    public java.lang.String getSIMKey() {
        return SIMKey;
    }


    /**
     * Sets the SIMKey value for this UserOBD.
     * 
     * @param SIMKey
     */
    public void setSIMKey(java.lang.String SIMKey) {
        this.SIMKey = SIMKey;
    }


    /**
     * Gets the SIMNumber value for this UserOBD.
     * 
     * @return SIMNumber
     */
    public java.lang.String getSIMNumber() {
        return SIMNumber;
    }


    /**
     * Sets the SIMNumber value for this UserOBD.
     * 
     * @param SIMNumber
     */
    public void setSIMNumber(java.lang.String SIMNumber) {
        this.SIMNumber = SIMNumber;
    }


    /**
     * Gets the SIMStatus value for this UserOBD.
     * 
     * @return SIMStatus
     */
    public java.lang.Integer getSIMStatus() {
        return SIMStatus;
    }


    /**
     * Sets the SIMStatus value for this UserOBD.
     * 
     * @param SIMStatus
     */
    public void setSIMStatus(java.lang.Integer SIMStatus) {
        this.SIMStatus = SIMStatus;
    }


    /**
     * Gets the updateTime value for this UserOBD.
     * 
     * @return updateTime
     */
    public java.util.Calendar getUpdateTime() {
        return updateTime;
    }


    /**
     * Sets the updateTime value for this UserOBD.
     * 
     * @param updateTime
     */
    public void setUpdateTime(java.util.Calendar updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * Gets the ZJID value for this UserOBD.
     * 
     * @return ZJID
     */
    public java.lang.String getZJID() {
        return ZJID;
    }


    /**
     * Sets the ZJID value for this UserOBD.
     * 
     * @param ZJID
     */
    public void setZJID(java.lang.String ZJID) {
        this.ZJID = ZJID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserOBD)) return false;
        UserOBD other = (UserOBD) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.addTime==null && other.getAddTime()==null) || 
             (this.addTime!=null &&
              this.addTime.equals(other.getAddTime()))) &&
            ((this.OBDID==null && other.getOBDID()==null) || 
             (this.OBDID!=null &&
              this.OBDID.equals(other.getOBDID()))) &&
            ((this.openTime==null && other.getOpenTime()==null) || 
             (this.openTime!=null &&
              this.openTime.equals(other.getOpenTime()))) &&
            ((this.SIMKey==null && other.getSIMKey()==null) || 
             (this.SIMKey!=null &&
              this.SIMKey.equals(other.getSIMKey()))) &&
            ((this.SIMNumber==null && other.getSIMNumber()==null) || 
             (this.SIMNumber!=null &&
              this.SIMNumber.equals(other.getSIMNumber()))) &&
            ((this.SIMStatus==null && other.getSIMStatus()==null) || 
             (this.SIMStatus!=null &&
              this.SIMStatus.equals(other.getSIMStatus()))) &&
            ((this.updateTime==null && other.getUpdateTime()==null) || 
             (this.updateTime!=null &&
              this.updateTime.equals(other.getUpdateTime()))) &&
            ((this.ZJID==null && other.getZJID()==null) || 
             (this.ZJID!=null &&
              this.ZJID.equals(other.getZJID())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAddTime() != null) {
            _hashCode += getAddTime().hashCode();
        }
        if (getOBDID() != null) {
            _hashCode += getOBDID().hashCode();
        }
        if (getOpenTime() != null) {
            _hashCode += getOpenTime().hashCode();
        }
        if (getSIMKey() != null) {
            _hashCode += getSIMKey().hashCode();
        }
        if (getSIMNumber() != null) {
            _hashCode += getSIMNumber().hashCode();
        }
        if (getSIMStatus() != null) {
            _hashCode += getSIMStatus().hashCode();
        }
        if (getUpdateTime() != null) {
            _hashCode += getUpdateTime().hashCode();
        }
        if (getZJID() != null) {
            _hashCode += getZJID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserOBD.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserOBD"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "AddTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OBDID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "OBDID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "OpenTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIMKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "SIMKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIMNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "SIMNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIMStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "SIMStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UpdateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZJID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ZJID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
