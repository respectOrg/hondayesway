/**
 * UserVehicleCareSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.yesway.common.soap.userinfoservice;

public class UserVehicleCareSet  implements java.io.Serializable {
    private java.lang.Integer correctTotalDistance;

    private java.lang.String ID;

    private java.lang.Integer maintenaceDistance;

    private java.lang.Integer maintenaceTime;

    private java.lang.Integer nextMaintenanceDistance;

    private java.util.Calendar nextMaintenanceTime;

    private java.lang.Integer OBDTotalDistance;

    private java.lang.Integer totalDistance;

    private java.util.Calendar updateTime;

    private java.lang.String ZJID;

    public UserVehicleCareSet() {
    }

    public UserVehicleCareSet(
           java.lang.Integer correctTotalDistance,
           java.lang.String ID,
           java.lang.Integer maintenaceDistance,
           java.lang.Integer maintenaceTime,
           java.lang.Integer nextMaintenanceDistance,
           java.util.Calendar nextMaintenanceTime,
           java.lang.Integer OBDTotalDistance,
           java.lang.Integer totalDistance,
           java.util.Calendar updateTime,
           java.lang.String ZJID) {
           this.correctTotalDistance = correctTotalDistance;
           this.ID = ID;
           this.maintenaceDistance = maintenaceDistance;
           this.maintenaceTime = maintenaceTime;
           this.nextMaintenanceDistance = nextMaintenanceDistance;
           this.nextMaintenanceTime = nextMaintenanceTime;
           this.OBDTotalDistance = OBDTotalDistance;
           this.totalDistance = totalDistance;
           this.updateTime = updateTime;
           this.ZJID = ZJID;
    }


    /**
     * Gets the correctTotalDistance value for this UserVehicleCareSet.
     * 
     * @return correctTotalDistance
     */
    public java.lang.Integer getCorrectTotalDistance() {
        return correctTotalDistance;
    }


    /**
     * Sets the correctTotalDistance value for this UserVehicleCareSet.
     * 
     * @param correctTotalDistance
     */
    public void setCorrectTotalDistance(java.lang.Integer correctTotalDistance) {
        this.correctTotalDistance = correctTotalDistance;
    }


    /**
     * Gets the ID value for this UserVehicleCareSet.
     * 
     * @return ID
     */
    public java.lang.String getID() {
        return ID;
    }


    /**
     * Sets the ID value for this UserVehicleCareSet.
     * 
     * @param ID
     */
    public void setID(java.lang.String ID) {
        this.ID = ID;
    }


    /**
     * Gets the maintenaceDistance value for this UserVehicleCareSet.
     * 
     * @return maintenaceDistance
     */
    public java.lang.Integer getMaintenaceDistance() {
        return maintenaceDistance;
    }


    /**
     * Sets the maintenaceDistance value for this UserVehicleCareSet.
     * 
     * @param maintenaceDistance
     */
    public void setMaintenaceDistance(java.lang.Integer maintenaceDistance) {
        this.maintenaceDistance = maintenaceDistance;
    }


    /**
     * Gets the maintenaceTime value for this UserVehicleCareSet.
     * 
     * @return maintenaceTime
     */
    public java.lang.Integer getMaintenaceTime() {
        return maintenaceTime;
    }


    /**
     * Sets the maintenaceTime value for this UserVehicleCareSet.
     * 
     * @param maintenaceTime
     */
    public void setMaintenaceTime(java.lang.Integer maintenaceTime) {
        this.maintenaceTime = maintenaceTime;
    }


    /**
     * Gets the nextMaintenanceDistance value for this UserVehicleCareSet.
     * 
     * @return nextMaintenanceDistance
     */
    public java.lang.Integer getNextMaintenanceDistance() {
        return nextMaintenanceDistance;
    }


    /**
     * Sets the nextMaintenanceDistance value for this UserVehicleCareSet.
     * 
     * @param nextMaintenanceDistance
     */
    public void setNextMaintenanceDistance(java.lang.Integer nextMaintenanceDistance) {
        this.nextMaintenanceDistance = nextMaintenanceDistance;
    }


    /**
     * Gets the nextMaintenanceTime value for this UserVehicleCareSet.
     * 
     * @return nextMaintenanceTime
     */
    public java.util.Calendar getNextMaintenanceTime() {
        return nextMaintenanceTime;
    }


    /**
     * Sets the nextMaintenanceTime value for this UserVehicleCareSet.
     * 
     * @param nextMaintenanceTime
     */
    public void setNextMaintenanceTime(java.util.Calendar nextMaintenanceTime) {
        this.nextMaintenanceTime = nextMaintenanceTime;
    }


    /**
     * Gets the OBDTotalDistance value for this UserVehicleCareSet.
     * 
     * @return OBDTotalDistance
     */
    public java.lang.Integer getOBDTotalDistance() {
        return OBDTotalDistance;
    }


    /**
     * Sets the OBDTotalDistance value for this UserVehicleCareSet.
     * 
     * @param OBDTotalDistance
     */
    public void setOBDTotalDistance(java.lang.Integer OBDTotalDistance) {
        this.OBDTotalDistance = OBDTotalDistance;
    }


    /**
     * Gets the totalDistance value for this UserVehicleCareSet.
     * 
     * @return totalDistance
     */
    public java.lang.Integer getTotalDistance() {
        return totalDistance;
    }


    /**
     * Sets the totalDistance value for this UserVehicleCareSet.
     * 
     * @param totalDistance
     */
    public void setTotalDistance(java.lang.Integer totalDistance) {
        this.totalDistance = totalDistance;
    }


    /**
     * Gets the updateTime value for this UserVehicleCareSet.
     * 
     * @return updateTime
     */
    public java.util.Calendar getUpdateTime() {
        return updateTime;
    }


    /**
     * Sets the updateTime value for this UserVehicleCareSet.
     * 
     * @param updateTime
     */
    public void setUpdateTime(java.util.Calendar updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * Gets the ZJID value for this UserVehicleCareSet.
     * 
     * @return ZJID
     */
    public java.lang.String getZJID() {
        return ZJID;
    }


    /**
     * Sets the ZJID value for this UserVehicleCareSet.
     * 
     * @param ZJID
     */
    public void setZJID(java.lang.String ZJID) {
        this.ZJID = ZJID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserVehicleCareSet)) return false;
        UserVehicleCareSet other = (UserVehicleCareSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.correctTotalDistance==null && other.getCorrectTotalDistance()==null) || 
             (this.correctTotalDistance!=null &&
              this.correctTotalDistance.equals(other.getCorrectTotalDistance()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.maintenaceDistance==null && other.getMaintenaceDistance()==null) || 
             (this.maintenaceDistance!=null &&
              this.maintenaceDistance.equals(other.getMaintenaceDistance()))) &&
            ((this.maintenaceTime==null && other.getMaintenaceTime()==null) || 
             (this.maintenaceTime!=null &&
              this.maintenaceTime.equals(other.getMaintenaceTime()))) &&
            ((this.nextMaintenanceDistance==null && other.getNextMaintenanceDistance()==null) || 
             (this.nextMaintenanceDistance!=null &&
              this.nextMaintenanceDistance.equals(other.getNextMaintenanceDistance()))) &&
            ((this.nextMaintenanceTime==null && other.getNextMaintenanceTime()==null) || 
             (this.nextMaintenanceTime!=null &&
              this.nextMaintenanceTime.equals(other.getNextMaintenanceTime()))) &&
            ((this.OBDTotalDistance==null && other.getOBDTotalDistance()==null) || 
             (this.OBDTotalDistance!=null &&
              this.OBDTotalDistance.equals(other.getOBDTotalDistance()))) &&
            ((this.totalDistance==null && other.getTotalDistance()==null) || 
             (this.totalDistance!=null &&
              this.totalDistance.equals(other.getTotalDistance()))) &&
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
        if (getCorrectTotalDistance() != null) {
            _hashCode += getCorrectTotalDistance().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getMaintenaceDistance() != null) {
            _hashCode += getMaintenaceDistance().hashCode();
        }
        if (getMaintenaceTime() != null) {
            _hashCode += getMaintenaceTime().hashCode();
        }
        if (getNextMaintenanceDistance() != null) {
            _hashCode += getNextMaintenanceDistance().hashCode();
        }
        if (getNextMaintenanceTime() != null) {
            _hashCode += getNextMaintenanceTime().hashCode();
        }
        if (getOBDTotalDistance() != null) {
            _hashCode += getOBDTotalDistance().hashCode();
        }
        if (getTotalDistance() != null) {
            _hashCode += getTotalDistance().hashCode();
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
        new org.apache.axis.description.TypeDesc(UserVehicleCareSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UserVehicleCareSet"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correctTotalDistance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "CorrectTotalDistance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maintenaceDistance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "MaintenaceDistance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maintenaceTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "MaintenaceTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextMaintenanceDistance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "NextMaintenanceDistance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextMaintenanceTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "NextMaintenanceTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OBDTotalDistance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "OBDTotalDistance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalDistance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "TotalDistance"));
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
