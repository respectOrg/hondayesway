/**
 * UserIntegral.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.yesway.common.soap.userinfoservice;

public class UserIntegral  extends cn.yesway.common.soap.userinfoservice.BaseModel  implements java.io.Serializable {
    private java.util.Calendar addTime;

    private java.lang.Integer currentIntegral;

    private java.lang.Integer totalIntegral;

    private java.util.Calendar updateTime;

    private java.lang.Integer useIntegral;

    private java.lang.String ZJID;

    public UserIntegral() {
    }

    public UserIntegral(
           java.util.Calendar ts,
           java.util.Calendar addTime,
           java.lang.Integer currentIntegral,
           java.lang.Integer totalIntegral,
           java.util.Calendar updateTime,
           java.lang.Integer useIntegral,
           java.lang.String ZJID) {
        super(
            ts);
        this.addTime = addTime;
        this.currentIntegral = currentIntegral;
        this.totalIntegral = totalIntegral;
        this.updateTime = updateTime;
        this.useIntegral = useIntegral;
        this.ZJID = ZJID;
    }


    /**
     * Gets the addTime value for this UserIntegral.
     * 
     * @return addTime
     */
    public java.util.Calendar getAddTime() {
        return addTime;
    }


    /**
     * Sets the addTime value for this UserIntegral.
     * 
     * @param addTime
     */
    public void setAddTime(java.util.Calendar addTime) {
        this.addTime = addTime;
    }


    /**
     * Gets the currentIntegral value for this UserIntegral.
     * 
     * @return currentIntegral
     */
    public java.lang.Integer getCurrentIntegral() {
        return currentIntegral;
    }


    /**
     * Sets the currentIntegral value for this UserIntegral.
     * 
     * @param currentIntegral
     */
    public void setCurrentIntegral(java.lang.Integer currentIntegral) {
        this.currentIntegral = currentIntegral;
    }


    /**
     * Gets the totalIntegral value for this UserIntegral.
     * 
     * @return totalIntegral
     */
    public java.lang.Integer getTotalIntegral() {
        return totalIntegral;
    }


    /**
     * Sets the totalIntegral value for this UserIntegral.
     * 
     * @param totalIntegral
     */
    public void setTotalIntegral(java.lang.Integer totalIntegral) {
        this.totalIntegral = totalIntegral;
    }


    /**
     * Gets the updateTime value for this UserIntegral.
     * 
     * @return updateTime
     */
    public java.util.Calendar getUpdateTime() {
        return updateTime;
    }


    /**
     * Sets the updateTime value for this UserIntegral.
     * 
     * @param updateTime
     */
    public void setUpdateTime(java.util.Calendar updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * Gets the useIntegral value for this UserIntegral.
     * 
     * @return useIntegral
     */
    public java.lang.Integer getUseIntegral() {
        return useIntegral;
    }


    /**
     * Sets the useIntegral value for this UserIntegral.
     * 
     * @param useIntegral
     */
    public void setUseIntegral(java.lang.Integer useIntegral) {
        this.useIntegral = useIntegral;
    }


    /**
     * Gets the ZJID value for this UserIntegral.
     * 
     * @return ZJID
     */
    public java.lang.String getZJID() {
        return ZJID;
    }


    /**
     * Sets the ZJID value for this UserIntegral.
     * 
     * @param ZJID
     */
    public void setZJID(java.lang.String ZJID) {
        this.ZJID = ZJID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserIntegral)) return false;
        UserIntegral other = (UserIntegral) obj;
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
            ((this.currentIntegral==null && other.getCurrentIntegral()==null) || 
             (this.currentIntegral!=null &&
              this.currentIntegral.equals(other.getCurrentIntegral()))) &&
            ((this.totalIntegral==null && other.getTotalIntegral()==null) || 
             (this.totalIntegral!=null &&
              this.totalIntegral.equals(other.getTotalIntegral()))) &&
            ((this.updateTime==null && other.getUpdateTime()==null) || 
             (this.updateTime!=null &&
              this.updateTime.equals(other.getUpdateTime()))) &&
            ((this.useIntegral==null && other.getUseIntegral()==null) || 
             (this.useIntegral!=null &&
              this.useIntegral.equals(other.getUseIntegral()))) &&
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
        if (getCurrentIntegral() != null) {
            _hashCode += getCurrentIntegral().hashCode();
        }
        if (getTotalIntegral() != null) {
            _hashCode += getTotalIntegral().hashCode();
        }
        if (getUpdateTime() != null) {
            _hashCode += getUpdateTime().hashCode();
        }
        if (getUseIntegral() != null) {
            _hashCode += getUseIntegral().hashCode();
        }
        if (getZJID() != null) {
            _hashCode += getZJID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserIntegral.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserIntegral"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "AddTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentIntegral");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "CurrentIntegral"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalIntegral");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "TotalIntegral"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UpdateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useIntegral");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UseIntegral"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
