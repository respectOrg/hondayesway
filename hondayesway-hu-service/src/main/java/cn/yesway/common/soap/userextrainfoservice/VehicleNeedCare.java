/**
 * VehicleNeedCare.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.yesway.common.soap.userextrainfoservice;

public class VehicleNeedCare  implements java.io.Serializable {
    private java.lang.String licensePlateNo;

    private java.lang.Integer mileageDistance;

    private java.lang.Integer nextMaintenanceDistance;

    private java.util.Calendar nextMaintenanceTime;

    private java.lang.String ownersName;

    private java.lang.String phone;

    private java.lang.Integer timeDistance;

    private java.lang.Integer totalDistance;

    private java.lang.String ZJID;

    public VehicleNeedCare() {
    }

    public VehicleNeedCare(
           java.lang.String licensePlateNo,
           java.lang.Integer mileageDistance,
           java.lang.Integer nextMaintenanceDistance,
           java.util.Calendar nextMaintenanceTime,
           java.lang.String ownersName,
           java.lang.String phone,
           java.lang.Integer timeDistance,
           java.lang.Integer totalDistance,
           java.lang.String ZJID) {
           this.licensePlateNo = licensePlateNo;
           this.mileageDistance = mileageDistance;
           this.nextMaintenanceDistance = nextMaintenanceDistance;
           this.nextMaintenanceTime = nextMaintenanceTime;
           this.ownersName = ownersName;
           this.phone = phone;
           this.timeDistance = timeDistance;
           this.totalDistance = totalDistance;
           this.ZJID = ZJID;
    }


    /**
     * Gets the licensePlateNo value for this VehicleNeedCare.
     * 
     * @return licensePlateNo
     */
    public java.lang.String getLicensePlateNo() {
        return licensePlateNo;
    }


    /**
     * Sets the licensePlateNo value for this VehicleNeedCare.
     * 
     * @param licensePlateNo
     */
    public void setLicensePlateNo(java.lang.String licensePlateNo) {
        this.licensePlateNo = licensePlateNo;
    }


    /**
     * Gets the mileageDistance value for this VehicleNeedCare.
     * 
     * @return mileageDistance
     */
    public java.lang.Integer getMileageDistance() {
        return mileageDistance;
    }


    /**
     * Sets the mileageDistance value for this VehicleNeedCare.
     * 
     * @param mileageDistance
     */
    public void setMileageDistance(java.lang.Integer mileageDistance) {
        this.mileageDistance = mileageDistance;
    }


    /**
     * Gets the nextMaintenanceDistance value for this VehicleNeedCare.
     * 
     * @return nextMaintenanceDistance
     */
    public java.lang.Integer getNextMaintenanceDistance() {
        return nextMaintenanceDistance;
    }


    /**
     * Sets the nextMaintenanceDistance value for this VehicleNeedCare.
     * 
     * @param nextMaintenanceDistance
     */
    public void setNextMaintenanceDistance(java.lang.Integer nextMaintenanceDistance) {
        this.nextMaintenanceDistance = nextMaintenanceDistance;
    }


    /**
     * Gets the nextMaintenanceTime value for this VehicleNeedCare.
     * 
     * @return nextMaintenanceTime
     */
    public java.util.Calendar getNextMaintenanceTime() {
        return nextMaintenanceTime;
    }


    /**
     * Sets the nextMaintenanceTime value for this VehicleNeedCare.
     * 
     * @param nextMaintenanceTime
     */
    public void setNextMaintenanceTime(java.util.Calendar nextMaintenanceTime) {
        this.nextMaintenanceTime = nextMaintenanceTime;
    }


    /**
     * Gets the ownersName value for this VehicleNeedCare.
     * 
     * @return ownersName
     */
    public java.lang.String getOwnersName() {
        return ownersName;
    }


    /**
     * Sets the ownersName value for this VehicleNeedCare.
     * 
     * @param ownersName
     */
    public void setOwnersName(java.lang.String ownersName) {
        this.ownersName = ownersName;
    }


    /**
     * Gets the phone value for this VehicleNeedCare.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this VehicleNeedCare.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the timeDistance value for this VehicleNeedCare.
     * 
     * @return timeDistance
     */
    public java.lang.Integer getTimeDistance() {
        return timeDistance;
    }


    /**
     * Sets the timeDistance value for this VehicleNeedCare.
     * 
     * @param timeDistance
     */
    public void setTimeDistance(java.lang.Integer timeDistance) {
        this.timeDistance = timeDistance;
    }


    /**
     * Gets the totalDistance value for this VehicleNeedCare.
     * 
     * @return totalDistance
     */
    public java.lang.Integer getTotalDistance() {
        return totalDistance;
    }


    /**
     * Sets the totalDistance value for this VehicleNeedCare.
     * 
     * @param totalDistance
     */
    public void setTotalDistance(java.lang.Integer totalDistance) {
        this.totalDistance = totalDistance;
    }


    /**
     * Gets the ZJID value for this VehicleNeedCare.
     * 
     * @return ZJID
     */
    public java.lang.String getZJID() {
        return ZJID;
    }


    /**
     * Sets the ZJID value for this VehicleNeedCare.
     * 
     * @param ZJID
     */
    public void setZJID(java.lang.String ZJID) {
        this.ZJID = ZJID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VehicleNeedCare)) return false;
        VehicleNeedCare other = (VehicleNeedCare) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.licensePlateNo==null && other.getLicensePlateNo()==null) || 
             (this.licensePlateNo!=null &&
              this.licensePlateNo.equals(other.getLicensePlateNo()))) &&
            ((this.mileageDistance==null && other.getMileageDistance()==null) || 
             (this.mileageDistance!=null &&
              this.mileageDistance.equals(other.getMileageDistance()))) &&
            ((this.nextMaintenanceDistance==null && other.getNextMaintenanceDistance()==null) || 
             (this.nextMaintenanceDistance!=null &&
              this.nextMaintenanceDistance.equals(other.getNextMaintenanceDistance()))) &&
            ((this.nextMaintenanceTime==null && other.getNextMaintenanceTime()==null) || 
             (this.nextMaintenanceTime!=null &&
              this.nextMaintenanceTime.equals(other.getNextMaintenanceTime()))) &&
            ((this.ownersName==null && other.getOwnersName()==null) || 
             (this.ownersName!=null &&
              this.ownersName.equals(other.getOwnersName()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.timeDistance==null && other.getTimeDistance()==null) || 
             (this.timeDistance!=null &&
              this.timeDistance.equals(other.getTimeDistance()))) &&
            ((this.totalDistance==null && other.getTotalDistance()==null) || 
             (this.totalDistance!=null &&
              this.totalDistance.equals(other.getTotalDistance()))) &&
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
        if (getLicensePlateNo() != null) {
            _hashCode += getLicensePlateNo().hashCode();
        }
        if (getMileageDistance() != null) {
            _hashCode += getMileageDistance().hashCode();
        }
        if (getNextMaintenanceDistance() != null) {
            _hashCode += getNextMaintenanceDistance().hashCode();
        }
        if (getNextMaintenanceTime() != null) {
            _hashCode += getNextMaintenanceTime().hashCode();
        }
        if (getOwnersName() != null) {
            _hashCode += getOwnersName().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getTimeDistance() != null) {
            _hashCode += getTimeDistance().hashCode();
        }
        if (getTotalDistance() != null) {
            _hashCode += getTotalDistance().hashCode();
        }
        if (getZJID() != null) {
            _hashCode += getZJID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VehicleNeedCare.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "VehicleNeedCare"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licensePlateNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "LicensePlateNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mileageDistance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "MileageDistance"));
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
        elemField.setFieldName("ownersName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "OwnersName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "Phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeDistance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "TimeDistance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalDistance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "TotalDistance"));
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
