/**
 * VisitRecordStatisticModel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.yesway.common.soap.shorturlhandlerservice;

public class VisitRecordStatisticModel  implements java.io.Serializable {
    private java.util.Calendar createDate;

    private java.lang.String longUrl;

    private java.lang.String urlID;

    private java.lang.Integer visitRecordCount;

    public VisitRecordStatisticModel() {
    }

    public VisitRecordStatisticModel(
           java.util.Calendar createDate,
           java.lang.String longUrl,
           java.lang.String urlID,
           java.lang.Integer visitRecordCount) {
           this.createDate = createDate;
           this.longUrl = longUrl;
           this.urlID = urlID;
           this.visitRecordCount = visitRecordCount;
    }


    /**
     * Gets the createDate value for this VisitRecordStatisticModel.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this VisitRecordStatisticModel.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the longUrl value for this VisitRecordStatisticModel.
     * 
     * @return longUrl
     */
    public java.lang.String getLongUrl() {
        return longUrl;
    }


    /**
     * Sets the longUrl value for this VisitRecordStatisticModel.
     * 
     * @param longUrl
     */
    public void setLongUrl(java.lang.String longUrl) {
        this.longUrl = longUrl;
    }


    /**
     * Gets the urlID value for this VisitRecordStatisticModel.
     * 
     * @return urlID
     */
    public java.lang.String getUrlID() {
        return urlID;
    }


    /**
     * Sets the urlID value for this VisitRecordStatisticModel.
     * 
     * @param urlID
     */
    public void setUrlID(java.lang.String urlID) {
        this.urlID = urlID;
    }


    /**
     * Gets the visitRecordCount value for this VisitRecordStatisticModel.
     * 
     * @return visitRecordCount
     */
    public java.lang.Integer getVisitRecordCount() {
        return visitRecordCount;
    }


    /**
     * Sets the visitRecordCount value for this VisitRecordStatisticModel.
     * 
     * @param visitRecordCount
     */
    public void setVisitRecordCount(java.lang.Integer visitRecordCount) {
        this.visitRecordCount = visitRecordCount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VisitRecordStatisticModel)) return false;
        VisitRecordStatisticModel other = (VisitRecordStatisticModel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.longUrl==null && other.getLongUrl()==null) || 
             (this.longUrl!=null &&
              this.longUrl.equals(other.getLongUrl()))) &&
            ((this.urlID==null && other.getUrlID()==null) || 
             (this.urlID!=null &&
              this.urlID.equals(other.getUrlID()))) &&
            ((this.visitRecordCount==null && other.getVisitRecordCount()==null) || 
             (this.visitRecordCount!=null &&
              this.visitRecordCount.equals(other.getVisitRecordCount())));
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
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getLongUrl() != null) {
            _hashCode += getLongUrl().hashCode();
        }
        if (getUrlID() != null) {
            _hashCode += getUrlID().hashCode();
        }
        if (getVisitRecordCount() != null) {
            _hashCode += getVisitRecordCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VisitRecordStatisticModel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayShortURLHandler.Model", "VisitRecordStatisticModel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayShortURLHandler.Model", "CreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayShortURLHandler.Model", "LongUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayShortURLHandler.Model", "UrlID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visitRecordCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayShortURLHandler.Model", "VisitRecordCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
