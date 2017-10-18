/**
 * InsuranceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.yesway.common.soap.userextrainfoservice;

public class InsuranceInfo  extends cn.yesway.common.soap.userextrainfoservice.BaseModel  implements java.io.Serializable {
    private java.util.Calendar addTime;

    private java.lang.String favoreeIdentityNO;

    private java.lang.String favoreeName;

    private java.lang.String favoreePhone;

    private java.lang.String favoreerelation;

    private java.lang.String ID;

    private java.lang.String insuranceCompany;

    private java.lang.String insuranceContent;

    private java.util.Calendar insuranceEndDate;

    private java.lang.String insuranceNO;

    private java.util.Calendar insuranceStartDate;

    private java.lang.Integer insuranceType;

    private java.util.Calendar updateTime;

    private java.lang.String vehicleID;

    public InsuranceInfo() {
    }

    public InsuranceInfo(
           java.util.Calendar ts,
           java.util.Calendar addTime,
           java.lang.String favoreeIdentityNO,
           java.lang.String favoreeName,
           java.lang.String favoreePhone,
           java.lang.String favoreerelation,
           java.lang.String ID,
           java.lang.String insuranceCompany,
           java.lang.String insuranceContent,
           java.util.Calendar insuranceEndDate,
           java.lang.String insuranceNO,
           java.util.Calendar insuranceStartDate,
           java.lang.Integer insuranceType,
           java.util.Calendar updateTime,
           java.lang.String vehicleID) {
        super(
            ts);
        this.addTime = addTime;
        this.favoreeIdentityNO = favoreeIdentityNO;
        this.favoreeName = favoreeName;
        this.favoreePhone = favoreePhone;
        this.favoreerelation = favoreerelation;
        this.ID = ID;
        this.insuranceCompany = insuranceCompany;
        this.insuranceContent = insuranceContent;
        this.insuranceEndDate = insuranceEndDate;
        this.insuranceNO = insuranceNO;
        this.insuranceStartDate = insuranceStartDate;
        this.insuranceType = insuranceType;
        this.updateTime = updateTime;
        this.vehicleID = vehicleID;
    }


    /**
     * Gets the addTime value for this InsuranceInfo.
     * 
     * @return addTime
     */
    public java.util.Calendar getAddTime() {
        return addTime;
    }


    /**
     * Sets the addTime value for this InsuranceInfo.
     * 
     * @param addTime
     */
    public void setAddTime(java.util.Calendar addTime) {
        this.addTime = addTime;
    }


    /**
     * Gets the favoreeIdentityNO value for this InsuranceInfo.
     * 
     * @return favoreeIdentityNO
     */
    public java.lang.String getFavoreeIdentityNO() {
        return favoreeIdentityNO;
    }


    /**
     * Sets the favoreeIdentityNO value for this InsuranceInfo.
     * 
     * @param favoreeIdentityNO
     */
    public void setFavoreeIdentityNO(java.lang.String favoreeIdentityNO) {
        this.favoreeIdentityNO = favoreeIdentityNO;
    }


    /**
     * Gets the favoreeName value for this InsuranceInfo.
     * 
     * @return favoreeName
     */
    public java.lang.String getFavoreeName() {
        return favoreeName;
    }


    /**
     * Sets the favoreeName value for this InsuranceInfo.
     * 
     * @param favoreeName
     */
    public void setFavoreeName(java.lang.String favoreeName) {
        this.favoreeName = favoreeName;
    }


    /**
     * Gets the favoreePhone value for this InsuranceInfo.
     * 
     * @return favoreePhone
     */
    public java.lang.String getFavoreePhone() {
        return favoreePhone;
    }


    /**
     * Sets the favoreePhone value for this InsuranceInfo.
     * 
     * @param favoreePhone
     */
    public void setFavoreePhone(java.lang.String favoreePhone) {
        this.favoreePhone = favoreePhone;
    }


    /**
     * Gets the favoreerelation value for this InsuranceInfo.
     * 
     * @return favoreerelation
     */
    public java.lang.String getFavoreerelation() {
        return favoreerelation;
    }


    /**
     * Sets the favoreerelation value for this InsuranceInfo.
     * 
     * @param favoreerelation
     */
    public void setFavoreerelation(java.lang.String favoreerelation) {
        this.favoreerelation = favoreerelation;
    }


    /**
     * Gets the ID value for this InsuranceInfo.
     * 
     * @return ID
     */
    public java.lang.String getID() {
        return ID;
    }


    /**
     * Sets the ID value for this InsuranceInfo.
     * 
     * @param ID
     */
    public void setID(java.lang.String ID) {
        this.ID = ID;
    }


    /**
     * Gets the insuranceCompany value for this InsuranceInfo.
     * 
     * @return insuranceCompany
     */
    public java.lang.String getInsuranceCompany() {
        return insuranceCompany;
    }


    /**
     * Sets the insuranceCompany value for this InsuranceInfo.
     * 
     * @param insuranceCompany
     */
    public void setInsuranceCompany(java.lang.String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }


    /**
     * Gets the insuranceContent value for this InsuranceInfo.
     * 
     * @return insuranceContent
     */
    public java.lang.String getInsuranceContent() {
        return insuranceContent;
    }


    /**
     * Sets the insuranceContent value for this InsuranceInfo.
     * 
     * @param insuranceContent
     */
    public void setInsuranceContent(java.lang.String insuranceContent) {
        this.insuranceContent = insuranceContent;
    }


    /**
     * Gets the insuranceEndDate value for this InsuranceInfo.
     * 
     * @return insuranceEndDate
     */
    public java.util.Calendar getInsuranceEndDate() {
        return insuranceEndDate;
    }


    /**
     * Sets the insuranceEndDate value for this InsuranceInfo.
     * 
     * @param insuranceEndDate
     */
    public void setInsuranceEndDate(java.util.Calendar insuranceEndDate) {
        this.insuranceEndDate = insuranceEndDate;
    }


    /**
     * Gets the insuranceNO value for this InsuranceInfo.
     * 
     * @return insuranceNO
     */
    public java.lang.String getInsuranceNO() {
        return insuranceNO;
    }


    /**
     * Sets the insuranceNO value for this InsuranceInfo.
     * 
     * @param insuranceNO
     */
    public void setInsuranceNO(java.lang.String insuranceNO) {
        this.insuranceNO = insuranceNO;
    }


    /**
     * Gets the insuranceStartDate value for this InsuranceInfo.
     * 
     * @return insuranceStartDate
     */
    public java.util.Calendar getInsuranceStartDate() {
        return insuranceStartDate;
    }


    /**
     * Sets the insuranceStartDate value for this InsuranceInfo.
     * 
     * @param insuranceStartDate
     */
    public void setInsuranceStartDate(java.util.Calendar insuranceStartDate) {
        this.insuranceStartDate = insuranceStartDate;
    }


    /**
     * Gets the insuranceType value for this InsuranceInfo.
     * 
     * @return insuranceType
     */
    public java.lang.Integer getInsuranceType() {
        return insuranceType;
    }


    /**
     * Sets the insuranceType value for this InsuranceInfo.
     * 
     * @param insuranceType
     */
    public void setInsuranceType(java.lang.Integer insuranceType) {
        this.insuranceType = insuranceType;
    }


    /**
     * Gets the updateTime value for this InsuranceInfo.
     * 
     * @return updateTime
     */
    public java.util.Calendar getUpdateTime() {
        return updateTime;
    }


    /**
     * Sets the updateTime value for this InsuranceInfo.
     * 
     * @param updateTime
     */
    public void setUpdateTime(java.util.Calendar updateTime) {
        this.updateTime = updateTime;
    }


    /**
     * Gets the vehicleID value for this InsuranceInfo.
     * 
     * @return vehicleID
     */
    public java.lang.String getVehicleID() {
        return vehicleID;
    }


    /**
     * Sets the vehicleID value for this InsuranceInfo.
     * 
     * @param vehicleID
     */
    public void setVehicleID(java.lang.String vehicleID) {
        this.vehicleID = vehicleID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsuranceInfo)) return false;
        InsuranceInfo other = (InsuranceInfo) obj;
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
            ((this.favoreeIdentityNO==null && other.getFavoreeIdentityNO()==null) || 
             (this.favoreeIdentityNO!=null &&
              this.favoreeIdentityNO.equals(other.getFavoreeIdentityNO()))) &&
            ((this.favoreeName==null && other.getFavoreeName()==null) || 
             (this.favoreeName!=null &&
              this.favoreeName.equals(other.getFavoreeName()))) &&
            ((this.favoreePhone==null && other.getFavoreePhone()==null) || 
             (this.favoreePhone!=null &&
              this.favoreePhone.equals(other.getFavoreePhone()))) &&
            ((this.favoreerelation==null && other.getFavoreerelation()==null) || 
             (this.favoreerelation!=null &&
              this.favoreerelation.equals(other.getFavoreerelation()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.insuranceCompany==null && other.getInsuranceCompany()==null) || 
             (this.insuranceCompany!=null &&
              this.insuranceCompany.equals(other.getInsuranceCompany()))) &&
            ((this.insuranceContent==null && other.getInsuranceContent()==null) || 
             (this.insuranceContent!=null &&
              this.insuranceContent.equals(other.getInsuranceContent()))) &&
            ((this.insuranceEndDate==null && other.getInsuranceEndDate()==null) || 
             (this.insuranceEndDate!=null &&
              this.insuranceEndDate.equals(other.getInsuranceEndDate()))) &&
            ((this.insuranceNO==null && other.getInsuranceNO()==null) || 
             (this.insuranceNO!=null &&
              this.insuranceNO.equals(other.getInsuranceNO()))) &&
            ((this.insuranceStartDate==null && other.getInsuranceStartDate()==null) || 
             (this.insuranceStartDate!=null &&
              this.insuranceStartDate.equals(other.getInsuranceStartDate()))) &&
            ((this.insuranceType==null && other.getInsuranceType()==null) || 
             (this.insuranceType!=null &&
              this.insuranceType.equals(other.getInsuranceType()))) &&
            ((this.updateTime==null && other.getUpdateTime()==null) || 
             (this.updateTime!=null &&
              this.updateTime.equals(other.getUpdateTime()))) &&
            ((this.vehicleID==null && other.getVehicleID()==null) || 
             (this.vehicleID!=null &&
              this.vehicleID.equals(other.getVehicleID())));
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
        if (getFavoreeIdentityNO() != null) {
            _hashCode += getFavoreeIdentityNO().hashCode();
        }
        if (getFavoreeName() != null) {
            _hashCode += getFavoreeName().hashCode();
        }
        if (getFavoreePhone() != null) {
            _hashCode += getFavoreePhone().hashCode();
        }
        if (getFavoreerelation() != null) {
            _hashCode += getFavoreerelation().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getInsuranceCompany() != null) {
            _hashCode += getInsuranceCompany().hashCode();
        }
        if (getInsuranceContent() != null) {
            _hashCode += getInsuranceContent().hashCode();
        }
        if (getInsuranceEndDate() != null) {
            _hashCode += getInsuranceEndDate().hashCode();
        }
        if (getInsuranceNO() != null) {
            _hashCode += getInsuranceNO().hashCode();
        }
        if (getInsuranceStartDate() != null) {
            _hashCode += getInsuranceStartDate().hashCode();
        }
        if (getInsuranceType() != null) {
            _hashCode += getInsuranceType().hashCode();
        }
        if (getUpdateTime() != null) {
            _hashCode += getUpdateTime().hashCode();
        }
        if (getVehicleID() != null) {
            _hashCode += getVehicleID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsuranceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "InsuranceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "AddTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("favoreeIdentityNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "FavoreeIdentityNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("favoreeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "FavoreeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("favoreePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "FavoreePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("favoreerelation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "Favoreerelation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuranceCompany");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "InsuranceCompany"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuranceContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "InsuranceContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuranceEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "InsuranceEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuranceNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "InsuranceNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuranceStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "InsuranceStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insuranceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "InsuranceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "UpdateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWay.Models", "VehicleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
