/**
 * CareNotification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.yesway.common.soap.userextrainfoservice;

public class CareNotification  implements java.io.Serializable {
    private java.lang.Integer mileageDistance;

    private java.lang.Integer needcare;

    private java.lang.Integer timeDistance;

    public CareNotification() {
    }

    public CareNotification(
           java.lang.Integer mileageDistance,
           java.lang.Integer needcare,
           java.lang.Integer timeDistance) {
           this.mileageDistance = mileageDistance;
           this.needcare = needcare;
           this.timeDistance = timeDistance;
    }


    /**
     * Gets the mileageDistance value for this CareNotification.
     * 
     * @return mileageDistance
     */
    public java.lang.Integer getMileageDistance() {
        return mileageDistance;
    }


    /**
     * Sets the mileageDistance value for this CareNotification.
     * 
     * @param mileageDistance
     */
    public void setMileageDistance(java.lang.Integer mileageDistance) {
        this.mileageDistance = mileageDistance;
    }


    /**
     * Gets the needcare value for this CareNotification.
     * 
     * @return needcare
     */
    public java.lang.Integer getNeedcare() {
        return needcare;
    }


    /**
     * Sets the needcare value for this CareNotification.
     * 
     * @param needcare
     */
    public void setNeedcare(java.lang.Integer needcare) {
        this.needcare = needcare;
    }


    /**
     * Gets the timeDistance value for this CareNotification.
     * 
     * @return timeDistance
     */
    public java.lang.Integer getTimeDistance() {
        return timeDistance;
    }


    /**
     * Sets the timeDistance value for this CareNotification.
     * 
     * @param timeDistance
     */
    public void setTimeDistance(java.lang.Integer timeDistance) {
        this.timeDistance = timeDistance;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CareNotification)) return false;
        CareNotification other = (CareNotification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mileageDistance==null && other.getMileageDistance()==null) || 
             (this.mileageDistance!=null &&
              this.mileageDistance.equals(other.getMileageDistance()))) &&
            ((this.needcare==null && other.getNeedcare()==null) || 
             (this.needcare!=null &&
              this.needcare.equals(other.getNeedcare()))) &&
            ((this.timeDistance==null && other.getTimeDistance()==null) || 
             (this.timeDistance!=null &&
              this.timeDistance.equals(other.getTimeDistance())));
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
        if (getMileageDistance() != null) {
            _hashCode += getMileageDistance().hashCode();
        }
        if (getNeedcare() != null) {
            _hashCode += getNeedcare().hashCode();
        }
        if (getTimeDistance() != null) {
            _hashCode += getTimeDistance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CareNotification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "CareNotification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mileageDistance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "MileageDistance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("needcare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "Needcare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeDistance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "TimeDistance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
