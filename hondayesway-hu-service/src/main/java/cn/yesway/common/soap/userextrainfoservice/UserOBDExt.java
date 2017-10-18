/**
 * UserOBDExt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.yesway.common.soap.userextrainfoservice;

public class UserOBDExt  implements java.io.Serializable {
    private java.util.Calendar activeTime;

    private java.util.Calendar addTime;

    private java.util.Calendar deadline;

    private java.lang.String OBDID;

    private java.util.Calendar openTime;

    private java.lang.String SIMKey;

    private java.lang.String SIMNumber;

    private java.lang.Integer SIMStatus;

    private java.util.Calendar updateTime;

    private java.lang.String ZJID;

    public UserOBDExt() {
    }

    public UserOBDExt(
           java.util.Calendar activeTime,
           java.util.Calendar addTime,
           java.util.Calendar deadline,
           java.lang.String OBDID,
           java.util.Calendar openTime,
           java.lang.String SIMKey,
           java.lang.String SIMNumber,
           java.lang.Integer SIMStatus,
           java.util.Calendar updateTime,
           java.lang.String ZJID) {
           this.activeTime = activeTime;
           this.addTime = addTime;
           this.deadline = deadline;
           this.OBDID = OBDID;
           this.openTime = openTime;
           this.SIMKey = SIMKey;
           this.SIMNumber = SIMNumber;
           this.SIMStatus = SIMStatus;
           this.updateTime = updateTime;
           this.ZJID = ZJID;
    }


    /**
     * Gets the activeTime value for this UserOBDExt.
     * 
     * @return activeTime
     */
    public java.util.Calendar getActiveTime() {
        return activeTime;
    }


    /**
     * Sets the activeTime value for this UserOBDExt.
     * 
     * @param activeTime
     */
    public void setActiveTime(java.util.Calendar activeTime) {
        this.activeTime = activeTime;
    }


    /**
     * Gets the addTime value for this UserOBDExt.
     * 
     * @return addTime
     */
    public java.util.Calendar getAddTime() {
        return addTime;
    }


    /**
     * Sets the addTime value for this UserOBDExt.
     * 
     * @param addTime
     */
    public void setAddTime(java.util.Calendar addTime) {
        this.addTime = addTime;
    }


    /**
     * Gets the deadline value for this UserOBDExt.
     * 
     * @return deadline
     */
    public java.util.Calendar getDeadline() {
        return deadline;
    }


    /**
     * Sets the deadline value for this UserOBDExt.
     * 
     * @param deadline
     */
    public void setDeadline(java.util.Calendar deadline) {
        this.deadline = deadline;
    }


    /**
     * Gets the OBDID value for this UserOBDExt.
     * 
     * @return OBDID
     */
    public java.lang.String getOBDID() {
        return OBDID;
    }


    /**
     * Sets the OBDID value for this UserOBDExt.
     * 
     * @param OBDID
     */
    public void setOBDID(java.lang.String OBDID) {
        this.OBDID = OBDID;
    }


    /**
     * Gets the openTime value for this UserOBDExt.
     * 
     * @return openTime
     */
    public java.util.Calendar getOpenTime() {
        return openTime;
    }


    /**
     * Sets the openTime value for this UserOBDExt.
     * 
     * @param openTime
     */
    public void setOpenTime(java.util.Calendar openTime) {
        this.openTime = openTime;
    }


    /**
     * Gets the SIMKey value for this UserOBDExt.
     * 
     * @return SIMKey
     */
    public java.lang.String getSIMKey() {
        return SIMKey;
    }


    /**
     * Sets the SIMKey value for this UserOBDExt.
     * 
     * @param SIMKey
     */
    public void setSIMKey(java.lang.String SIMKey) {
        this.SIMKey = SIMKey;
    }


    /**
     * Gets the SIMNumber value for this UserOBDExt.
     * 
     * @return SIMNumber
     */
    public java.lang.String getSIMNumber() {
        return SIMNumber;
    }


    /**
     * Sets the SIMNumber value for this UserOBDExt.
     * 
     * @param SIMNumber
     */
    public void setSIMNumber(java.lang.String SIMNumber) {
        this.SIMNumber = SIMNumber;
    }


    /**
     * Gets the SIMStatus value for this UserOBDExt.
     * 
     * @return SIMStatus
     */
    public java.lang.Integer getSIMStatus() {
        return SIMStatus;
    }


    /**
     * Sets the SIMStatus value for this UserOBDExt.
     * 
     * @param SIMStatus
     */
    public void setSIMStatus(java.lang.Integer SIMStatus) {
        this.SIMStatus = SIMStatus;
    }


    /**
     * Gets the updateTime value for this UserOBDExt.
     * 
     * @return updateTime
     */
    public java.util.Calendar getUpdateTime() {
        return updateTime;
    }


    /**
     * Sets the updateTime value for this UserOBDExt.
     * 
     * @param updateTime
     */
    public void setUpdateTime(java.util.Calendar updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * Gets the ZJID value for this UserOBDExt.
     * 
     * @return ZJID
     */
    public java.lang.String getZJID() {
        return ZJID;
    }


    /**
     * Sets the ZJID value for this UserOBDExt.
     * 
     * @param ZJID
     */
    public void setZJID(java.lang.String ZJID) {
        this.ZJID = ZJID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserOBDExt)) return false;
        UserOBDExt other = (UserOBDExt) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.activeTime==null && other.getActiveTime()==null) || 
             (this.activeTime!=null &&
              this.activeTime.equals(other.getActiveTime()))) &&
            ((this.addTime==null && other.getAddTime()==null) || 
             (this.addTime!=null &&
              this.addTime.equals(other.getAddTime()))) &&
            ((this.deadline==null && other.getDeadline()==null) || 
             (this.deadline!=null &&
              this.deadline.equals(other.getDeadline()))) &&
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
        int _hashCode = 1;
        if (getActiveTime() != null) {
            _hashCode += getActiveTime().hashCode();
        }
        if (getAddTime() != null) {
            _hashCode += getAddTime().hashCode();
        }
        if (getDeadline() != null) {
            _hashCode += getDeadline().hashCode();
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
        new org.apache.axis.description.TypeDesc(UserOBDExt.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserOBDExt"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ActiveTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "AddTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deadline");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "Deadline"));
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
