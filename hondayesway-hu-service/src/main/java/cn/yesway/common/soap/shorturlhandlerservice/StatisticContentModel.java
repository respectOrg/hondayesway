/**
 * StatisticContentModel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.yesway.common.soap.shorturlhandlerservice;

public class StatisticContentModel  implements java.io.Serializable {
    private cn.yesway.common.soap.shorturlhandlerservice.StatisticItem[] browsers;

    private cn.yesway.common.soap.shorturlhandlerservice.StatisticItem[] clicks;

    private cn.yesway.common.soap.shorturlhandlerservice.StatisticItem[] countries;

    private java.lang.String createTime;

    private java.lang.String longUrl;

    private cn.yesway.common.soap.shorturlhandlerservice.StatisticItem[] platforms;

    private cn.yesway.common.soap.shorturlhandlerservice.StatisticItem[] referrers;

    private java.lang.Integer shortUrlClicks;

    private java.lang.String status;

    private java.lang.String urlID;

    public StatisticContentModel() {
    }

    public StatisticContentModel(
           cn.yesway.common.soap.shorturlhandlerservice.StatisticItem[] browsers,
           cn.yesway.common.soap.shorturlhandlerservice.StatisticItem[] clicks,
           cn.yesway.common.soap.shorturlhandlerservice.StatisticItem[] countries,
           java.lang.String createTime,
           java.lang.String longUrl,
           cn.yesway.common.soap.shorturlhandlerservice.StatisticItem[] platforms,
           cn.yesway.common.soap.shorturlhandlerservice.StatisticItem[] referrers,
           java.lang.Integer shortUrlClicks,
           java.lang.String status,
           java.lang.String urlID) {
           this.browsers = browsers;
           this.clicks = clicks;
           this.countries = countries;
           this.createTime = createTime;
           this.longUrl = longUrl;
           this.platforms = platforms;
           this.referrers = referrers;
           this.shortUrlClicks = shortUrlClicks;
           this.status = status;
           this.urlID = urlID;
    }


    /**
     * Gets the browsers value for this StatisticContentModel.
     * 
     * @return browsers
     */
    public cn.yesway.common.soap.shorturlhandlerservice.StatisticItem[] getBrowsers() {
        return browsers;
    }


    /**
     * Sets the browsers value for this StatisticContentModel.
     * 
     * @param browsers
     */
    public void setBrowsers(cn.yesway.common.soap.shorturlhandlerservice.StatisticItem[] browsers) {
        this.browsers = browsers;
    }


    /**
     * Gets the clicks value for this StatisticContentModel.
     * 
     * @return clicks
     */
    public cn.yesway.common.soap.shorturlhandlerservice.StatisticItem[] getClicks() {
        return clicks;
    }


    /**
     * Sets the clicks value for this StatisticContentModel.
     * 
     * @param clicks
     */
    public void setClicks(cn.yesway.common.soap.shorturlhandlerservice.StatisticItem[] clicks) {
        this.clicks = clicks;
    }


    /**
     * Gets the countries value for this StatisticContentModel.
     * 
     * @return countries
     */
    public cn.yesway.common.soap.shorturlhandlerservice.StatisticItem[] getCountries() {
        return countries;
    }


    /**
     * Sets the countries value for this StatisticContentModel.
     * 
     * @param countries
     */
    public void setCountries(cn.yesway.common.soap.shorturlhandlerservice.StatisticItem[] countries) {
        this.countries = countries;
    }


    /**
     * Gets the createTime value for this StatisticContentModel.
     * 
     * @return createTime
     */
    public java.lang.String getCreateTime() {
        return createTime;
    }


    /**
     * Sets the createTime value for this StatisticContentModel.
     * 
     * @param createTime
     */
    public void setCreateTime(java.lang.String createTime) {
        this.createTime = createTime;
    }


    /**
     * Gets the longUrl value for this StatisticContentModel.
     * 
     * @return longUrl
     */
    public java.lang.String getLongUrl() {
        return longUrl;
    }


    /**
     * Sets the longUrl value for this StatisticContentModel.
     * 
     * @param longUrl
     */
    public void setLongUrl(java.lang.String longUrl) {
        this.longUrl = longUrl;
    }


    /**
     * Gets the platforms value for this StatisticContentModel.
     * 
     * @return platforms
     */
    public cn.yesway.common.soap.shorturlhandlerservice.StatisticItem[] getPlatforms() {
        return platforms;
    }


    /**
     * Sets the platforms value for this StatisticContentModel.
     * 
     * @param platforms
     */
    public void setPlatforms(cn.yesway.common.soap.shorturlhandlerservice.StatisticItem[] platforms) {
        this.platforms = platforms;
    }


    /**
     * Gets the referrers value for this StatisticContentModel.
     * 
     * @return referrers
     */
    public cn.yesway.common.soap.shorturlhandlerservice.StatisticItem[] getReferrers() {
        return referrers;
    }


    /**
     * Sets the referrers value for this StatisticContentModel.
     * 
     * @param referrers
     */
    public void setReferrers(cn.yesway.common.soap.shorturlhandlerservice.StatisticItem[] referrers) {
        this.referrers = referrers;
    }


    /**
     * Gets the shortUrlClicks value for this StatisticContentModel.
     * 
     * @return shortUrlClicks
     */
    public java.lang.Integer getShortUrlClicks() {
        return shortUrlClicks;
    }


    /**
     * Sets the shortUrlClicks value for this StatisticContentModel.
     * 
     * @param shortUrlClicks
     */
    public void setShortUrlClicks(java.lang.Integer shortUrlClicks) {
        this.shortUrlClicks = shortUrlClicks;
    }


    /**
     * Gets the status value for this StatisticContentModel.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this StatisticContentModel.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the urlID value for this StatisticContentModel.
     * 
     * @return urlID
     */
    public java.lang.String getUrlID() {
        return urlID;
    }


    /**
     * Sets the urlID value for this StatisticContentModel.
     * 
     * @param urlID
     */
    public void setUrlID(java.lang.String urlID) {
        this.urlID = urlID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatisticContentModel)) return false;
        StatisticContentModel other = (StatisticContentModel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.browsers==null && other.getBrowsers()==null) || 
             (this.browsers!=null &&
              java.util.Arrays.equals(this.browsers, other.getBrowsers()))) &&
            ((this.clicks==null && other.getClicks()==null) || 
             (this.clicks!=null &&
              java.util.Arrays.equals(this.clicks, other.getClicks()))) &&
            ((this.countries==null && other.getCountries()==null) || 
             (this.countries!=null &&
              java.util.Arrays.equals(this.countries, other.getCountries()))) &&
            ((this.createTime==null && other.getCreateTime()==null) || 
             (this.createTime!=null &&
              this.createTime.equals(other.getCreateTime()))) &&
            ((this.longUrl==null && other.getLongUrl()==null) || 
             (this.longUrl!=null &&
              this.longUrl.equals(other.getLongUrl()))) &&
            ((this.platforms==null && other.getPlatforms()==null) || 
             (this.platforms!=null &&
              java.util.Arrays.equals(this.platforms, other.getPlatforms()))) &&
            ((this.referrers==null && other.getReferrers()==null) || 
             (this.referrers!=null &&
              java.util.Arrays.equals(this.referrers, other.getReferrers()))) &&
            ((this.shortUrlClicks==null && other.getShortUrlClicks()==null) || 
             (this.shortUrlClicks!=null &&
              this.shortUrlClicks.equals(other.getShortUrlClicks()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.urlID==null && other.getUrlID()==null) || 
             (this.urlID!=null &&
              this.urlID.equals(other.getUrlID())));
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
        if (getBrowsers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBrowsers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBrowsers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClicks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClicks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClicks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCountries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCountries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreateTime() != null) {
            _hashCode += getCreateTime().hashCode();
        }
        if (getLongUrl() != null) {
            _hashCode += getLongUrl().hashCode();
        }
        if (getPlatforms() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlatforms());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlatforms(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReferrers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReferrers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReferrers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShortUrlClicks() != null) {
            _hashCode += getShortUrlClicks().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getUrlID() != null) {
            _hashCode += getUrlID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatisticContentModel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayShortURLHandler.Model", "StatisticContentModel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browsers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayShortURLHandler.Model", "Browsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayShortURLHandler.Model", "StatisticItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayShortURLHandler.Model", "StatisticItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clicks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayShortURLHandler.Model", "Clicks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayShortURLHandler.Model", "StatisticItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayShortURLHandler.Model", "StatisticItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countries");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayShortURLHandler.Model", "Countries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayShortURLHandler.Model", "StatisticItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayShortURLHandler.Model", "StatisticItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayShortURLHandler.Model", "CreateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayShortURLHandler.Model", "LongUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("platforms");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayShortURLHandler.Model", "Platforms"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayShortURLHandler.Model", "StatisticItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayShortURLHandler.Model", "StatisticItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referrers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayShortURLHandler.Model", "Referrers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayShortURLHandler.Model", "StatisticItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayShortURLHandler.Model", "StatisticItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortUrlClicks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayShortURLHandler.Model", "ShortUrlClicks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/YesWayShortURLHandler.Model", "Status"));
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
