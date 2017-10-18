/**
 * UserMaintenanceFactory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.yesway.common.soap.userextrainfoservice;

public class UserMaintenanceFactory  implements java.io.Serializable {
    private java.util.Calendar addTime;

    private java.lang.Integer defaultMark;

    private java.lang.String maintenanceFactoryID;

    private java.lang.String ZJID;

    public UserMaintenanceFactory() {
    }

    public UserMaintenanceFactory(
           java.util.Calendar addTime,
           java.lang.Integer defaultMark,
           java.lang.String maintenanceFactoryID,
           java.lang.String ZJID) {
           this.addTime = addTime;
           this.defaultMark = defaultMark;
           this.maintenanceFactoryID = maintenanceFactoryID;
           this.ZJID = ZJID;
    }


    /**
     * Gets the addTime value for this UserMaintenanceFactory.
     * 
     * @return addTime
     */
    public java.util.Calendar getAddTime() {
        return addTime;
    }


    /**
     * Sets the addTime value for this UserMaintenanceFactory.
     * 
     * @param addTime
     */
    public void setAddTime(java.util.Calendar addTime) {
        this.addTime = addTime;
    }


    /**
     * Gets the defaultMark value for this UserMaintenanceFactory.
     * 
     * @return defaultMark
     */
    public java.lang.Integer getDefaultMark() {
        return defaultMark;
    }


    /**
     * Sets the defaultMark value for this UserMaintenanceFactory.
     * 
     * @param defaultMark
     */
    public void setDefaultMark(java.lang.Integer defaultMark) {
        this.defaultMark = defaultMark;
    }


    /**
     * Gets the maintenanceFactoryID value for this UserMaintenanceFactory.
     * 
     * @return maintenanceFactoryID
     */
    public java.lang.String getMaintenanceFactoryID() {
        return maintenanceFactoryID;
    }


    /**
     * Sets the maintenanceFactoryID value for this UserMaintenanceFactory.
     * 
     * @param maintenanceFactoryID
     */
    public void setMaintenanceFactoryID(java.lang.String maintenanceFactoryID) {
        this.maintenanceFactoryID = maintenanceFactoryID;
    }


    /**
     * Gets the ZJID value for this UserMaintenanceFactory.
     * 
     * @return ZJID
     */
    public java.lang.String getZJID() {
        return ZJID;
    }


    /**
     * Sets the ZJID value for this UserMaintenanceFactory.
     * 
     * @param ZJID
     */
    public void setZJID(java.lang.String ZJID) {
        this.ZJID = ZJID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserMaintenanceFactory)) return false;
        UserMaintenanceFactory other = (UserMaintenanceFactory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addTime==null && other.getAddTime()==null) || 
             (this.addTime!=null &&
              this.addTime.equals(other.getAddTime()))) &&
            ((this.defaultMark==null && other.getDefaultMark()==null) || 
             (this.defaultMark!=null &&
              this.defaultMark.equals(other.getDefaultMark()))) &&
            ((this.maintenanceFactoryID==null && other.getMaintenanceFactoryID()==null) || 
             (this.maintenanceFactoryID!=null &&
              this.maintenanceFactoryID.equals(other.getMaintenanceFactoryID()))) &&
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
        if (getAddTime() != null) {
            _hashCode += getAddTime().hashCode();
        }
        if (getDefaultMark() != null) {
            _hashCode += getDefaultMark().hashCode();
        }
        if (getMaintenanceFactoryID() != null) {
            _hashCode += getMaintenanceFactoryID().hashCode();
        }
        if (getZJID() != null) {
            _hashCode += getZJID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserMaintenanceFactory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models.UserCenter", "UserMaintenanceFactory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models.UserCenter", "AddTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultMark");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models.UserCenter", "DefaultMark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maintenanceFactoryID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models.UserCenter", "MaintenanceFactoryID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZJID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models.UserCenter", "ZJID"));
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
