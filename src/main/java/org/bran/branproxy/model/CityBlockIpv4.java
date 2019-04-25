package org.bran.branproxy.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author bran
*/
public class CityBlockIpv4 implements Serializable {

    private static final long serialVersionUID = 1556090422739L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long id;

    /**
    * 
    * isNullAble:1
    */
    private String network;

    /**
    * 
    * isNullAble:1
    */
    private Long geonameId;

    /**
    * 
    * isNullAble:1
    */
    private Long registeredCountryGeonameId;

    /**
    * 
    * isNullAble:1
    */
    private Long representedCountryGeonameId;

    /**
    * 
    * isNullAble:1
    */
    private Integer isAnonymousProxy;

    /**
    * 
    * isNullAble:1
    */
    private Integer isSatelliteProvider;

    /**
    * 
    * isNullAble:1
    */
    private String postalCode;

    /**
    * 
    * isNullAble:1
    */
    private java.math.BigDecimal latitude;

    /**
    * 
    * isNullAble:1
    */
    private java.math.BigDecimal longitude;

    /**
    * 
    * isNullAble:1
    */
    private Integer accuracyRadius;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setNetwork(String network){this.network = network;}

    public String getNetwork(){return this.network;}

    public void setGeonameId(Long geonameId){this.geonameId = geonameId;}

    public Long getGeonameId(){return this.geonameId;}

    public void setRegisteredCountryGeonameId(Long registeredCountryGeonameId){this.registeredCountryGeonameId = registeredCountryGeonameId;}

    public Long getRegisteredCountryGeonameId(){return this.registeredCountryGeonameId;}

    public void setRepresentedCountryGeonameId(Long representedCountryGeonameId){this.representedCountryGeonameId = representedCountryGeonameId;}

    public Long getRepresentedCountryGeonameId(){return this.representedCountryGeonameId;}

    public void setIsAnonymousProxy(Integer isAnonymousProxy){this.isAnonymousProxy = isAnonymousProxy;}

    public Integer getIsAnonymousProxy(){return this.isAnonymousProxy;}

    public void setIsSatelliteProvider(Integer isSatelliteProvider){this.isSatelliteProvider = isSatelliteProvider;}

    public Integer getIsSatelliteProvider(){return this.isSatelliteProvider;}

    public void setPostalCode(String postalCode){this.postalCode = postalCode;}

    public String getPostalCode(){return this.postalCode;}

    public void setLatitude(java.math.BigDecimal latitude){this.latitude = latitude;}

    public java.math.BigDecimal getLatitude(){return this.latitude;}

    public void setLongitude(java.math.BigDecimal longitude){this.longitude = longitude;}

    public java.math.BigDecimal getLongitude(){return this.longitude;}

    public void setAccuracyRadius(Integer accuracyRadius){this.accuracyRadius = accuracyRadius;}

    public Integer getAccuracyRadius(){return this.accuracyRadius;}
    @Override
    public String toString() {
        return "CityBlockIpv4{" +
                "id='" + id + '\'' +
                "network='" + network + '\'' +
                "geonameId='" + geonameId + '\'' +
                "registeredCountryGeonameId='" + registeredCountryGeonameId + '\'' +
                "representedCountryGeonameId='" + representedCountryGeonameId + '\'' +
                "isAnonymousProxy='" + isAnonymousProxy + '\'' +
                "isSatelliteProvider='" + isSatelliteProvider + '\'' +
                "postalCode='" + postalCode + '\'' +
                "latitude='" + latitude + '\'' +
                "longitude='" + longitude + '\'' +
                "accuracyRadius='" + accuracyRadius + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private CityBlockIpv4 set;

        private ConditionBuilder where;

        public UpdateBuilder set(CityBlockIpv4 set){
            this.set = set;
            return this;
        }

        public CityBlockIpv4 getSet(){
            return this.set;
        }

        public UpdateBuilder where(ConditionBuilder where){
            this.where = where;
            return this;
        }

        public ConditionBuilder getWhere(){
            return this.where;
        }

        public UpdateBuilder build(){
            return this;
        }
    }

    public static class QueryBuilder extends CityBlockIpv4{
        /**
        * 需要返回的列
        */
        private Map<String,Object> fetchFields;

        public Map<String,Object> getFetchFields(){return this.fetchFields;}

        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<String> networkList;

        public List<String> getNetworkList(){return this.networkList;}


        private List<String> fuzzyNetwork;

        public List<String> getFuzzyNetwork(){return this.fuzzyNetwork;}

        private List<String> rightFuzzyNetwork;

        public List<String> getRightFuzzyNetwork(){return this.rightFuzzyNetwork;}
        private List<Long> geonameIdList;

        public List<Long> getGeonameIdList(){return this.geonameIdList;}

        private Long geonameIdSt;

        private Long geonameIdEd;

        public Long getGeonameIdSt(){return this.geonameIdSt;}

        public Long getGeonameIdEd(){return this.geonameIdEd;}

        private List<Long> registeredCountryGeonameIdList;

        public List<Long> getRegisteredCountryGeonameIdList(){return this.registeredCountryGeonameIdList;}

        private Long registeredCountryGeonameIdSt;

        private Long registeredCountryGeonameIdEd;

        public Long getRegisteredCountryGeonameIdSt(){return this.registeredCountryGeonameIdSt;}

        public Long getRegisteredCountryGeonameIdEd(){return this.registeredCountryGeonameIdEd;}

        private List<Long> representedCountryGeonameIdList;

        public List<Long> getRepresentedCountryGeonameIdList(){return this.representedCountryGeonameIdList;}

        private Long representedCountryGeonameIdSt;

        private Long representedCountryGeonameIdEd;

        public Long getRepresentedCountryGeonameIdSt(){return this.representedCountryGeonameIdSt;}

        public Long getRepresentedCountryGeonameIdEd(){return this.representedCountryGeonameIdEd;}

        private List<Integer> isAnonymousProxyList;

        public List<Integer> getIsAnonymousProxyList(){return this.isAnonymousProxyList;}

        private Integer isAnonymousProxySt;

        private Integer isAnonymousProxyEd;

        public Integer getIsAnonymousProxySt(){return this.isAnonymousProxySt;}

        public Integer getIsAnonymousProxyEd(){return this.isAnonymousProxyEd;}

        private List<Integer> isSatelliteProviderList;

        public List<Integer> getIsSatelliteProviderList(){return this.isSatelliteProviderList;}

        private Integer isSatelliteProviderSt;

        private Integer isSatelliteProviderEd;

        public Integer getIsSatelliteProviderSt(){return this.isSatelliteProviderSt;}

        public Integer getIsSatelliteProviderEd(){return this.isSatelliteProviderEd;}

        private List<String> postalCodeList;

        public List<String> getPostalCodeList(){return this.postalCodeList;}


        private List<String> fuzzyPostalCode;

        public List<String> getFuzzyPostalCode(){return this.fuzzyPostalCode;}

        private List<String> rightFuzzyPostalCode;

        public List<String> getRightFuzzyPostalCode(){return this.rightFuzzyPostalCode;}
        private List<java.math.BigDecimal> latitudeList;

        public List<java.math.BigDecimal> getLatitudeList(){return this.latitudeList;}

        private java.math.BigDecimal latitudeSt;

        private java.math.BigDecimal latitudeEd;

        public java.math.BigDecimal getLatitudeSt(){return this.latitudeSt;}

        public java.math.BigDecimal getLatitudeEd(){return this.latitudeEd;}

        private List<java.math.BigDecimal> longitudeList;

        public List<java.math.BigDecimal> getLongitudeList(){return this.longitudeList;}

        private java.math.BigDecimal longitudeSt;

        private java.math.BigDecimal longitudeEd;

        public java.math.BigDecimal getLongitudeSt(){return this.longitudeSt;}

        public java.math.BigDecimal getLongitudeEd(){return this.longitudeEd;}

        private List<Integer> accuracyRadiusList;

        public List<Integer> getAccuracyRadiusList(){return this.accuracyRadiusList;}

        private Integer accuracyRadiusSt;

        private Integer accuracyRadiusEd;

        public Integer getAccuracyRadiusSt(){return this.accuracyRadiusSt;}

        public Integer getAccuracyRadiusEd(){return this.accuracyRadiusEd;}

        private QueryBuilder (){
            this.fetchFields = new HashMap<>();
        }

        public QueryBuilder idBetWeen(Long idSt,Long idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public QueryBuilder idGreaterEqThan(Long idSt){
            this.idSt = idSt;
            return this;
        }
        public QueryBuilder idLessEqThan(Long idEd){
            this.idEd = idEd;
            return this;
        }


        public QueryBuilder id(Long id){
            setId(id);
            return this;
        }

        public QueryBuilder idList(Long ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public QueryBuilder idList(List<Long> id){
            this.idList = id;
            return this;
        }

        public QueryBuilder fetchId(){
            setFetchFields("fetchFields","id");
            return this;
        }

        public QueryBuilder excludeId(){
            setFetchFields("excludeFields","id");
            return this;
        }

        public QueryBuilder fuzzyNetwork (List<String> fuzzyNetwork){
            this.fuzzyNetwork = fuzzyNetwork;
            return this;
        }

        public QueryBuilder fuzzyNetwork (String ... fuzzyNetwork){
            this.fuzzyNetwork = solveNullList(fuzzyNetwork);
            return this;
        }

        public QueryBuilder rightFuzzyNetwork (List<String> rightFuzzyNetwork){
            this.rightFuzzyNetwork = rightFuzzyNetwork;
            return this;
        }

        public QueryBuilder rightFuzzyNetwork (String ... rightFuzzyNetwork){
            this.rightFuzzyNetwork = solveNullList(rightFuzzyNetwork);
            return this;
        }

        public QueryBuilder network(String network){
            setNetwork(network);
            return this;
        }

        public QueryBuilder networkList(String ... network){
            this.networkList = solveNullList(network);
            return this;
        }

        public QueryBuilder networkList(List<String> network){
            this.networkList = network;
            return this;
        }

        public QueryBuilder fetchNetwork(){
            setFetchFields("fetchFields","network");
            return this;
        }

        public QueryBuilder excludeNetwork(){
            setFetchFields("excludeFields","network");
            return this;
        }

        public QueryBuilder geonameIdBetWeen(Long geonameIdSt,Long geonameIdEd){
            this.geonameIdSt = geonameIdSt;
            this.geonameIdEd = geonameIdEd;
            return this;
        }

        public QueryBuilder geonameIdGreaterEqThan(Long geonameIdSt){
            this.geonameIdSt = geonameIdSt;
            return this;
        }
        public QueryBuilder geonameIdLessEqThan(Long geonameIdEd){
            this.geonameIdEd = geonameIdEd;
            return this;
        }


        public QueryBuilder geonameId(Long geonameId){
            setGeonameId(geonameId);
            return this;
        }

        public QueryBuilder geonameIdList(Long ... geonameId){
            this.geonameIdList = solveNullList(geonameId);
            return this;
        }

        public QueryBuilder geonameIdList(List<Long> geonameId){
            this.geonameIdList = geonameId;
            return this;
        }

        public QueryBuilder fetchGeonameId(){
            setFetchFields("fetchFields","geonameId");
            return this;
        }

        public QueryBuilder excludeGeonameId(){
            setFetchFields("excludeFields","geonameId");
            return this;
        }

        public QueryBuilder registeredCountryGeonameIdBetWeen(Long registeredCountryGeonameIdSt,Long registeredCountryGeonameIdEd){
            this.registeredCountryGeonameIdSt = registeredCountryGeonameIdSt;
            this.registeredCountryGeonameIdEd = registeredCountryGeonameIdEd;
            return this;
        }

        public QueryBuilder registeredCountryGeonameIdGreaterEqThan(Long registeredCountryGeonameIdSt){
            this.registeredCountryGeonameIdSt = registeredCountryGeonameIdSt;
            return this;
        }
        public QueryBuilder registeredCountryGeonameIdLessEqThan(Long registeredCountryGeonameIdEd){
            this.registeredCountryGeonameIdEd = registeredCountryGeonameIdEd;
            return this;
        }


        public QueryBuilder registeredCountryGeonameId(Long registeredCountryGeonameId){
            setRegisteredCountryGeonameId(registeredCountryGeonameId);
            return this;
        }

        public QueryBuilder registeredCountryGeonameIdList(Long ... registeredCountryGeonameId){
            this.registeredCountryGeonameIdList = solveNullList(registeredCountryGeonameId);
            return this;
        }

        public QueryBuilder registeredCountryGeonameIdList(List<Long> registeredCountryGeonameId){
            this.registeredCountryGeonameIdList = registeredCountryGeonameId;
            return this;
        }

        public QueryBuilder fetchRegisteredCountryGeonameId(){
            setFetchFields("fetchFields","registeredCountryGeonameId");
            return this;
        }

        public QueryBuilder excludeRegisteredCountryGeonameId(){
            setFetchFields("excludeFields","registeredCountryGeonameId");
            return this;
        }

        public QueryBuilder representedCountryGeonameIdBetWeen(Long representedCountryGeonameIdSt,Long representedCountryGeonameIdEd){
            this.representedCountryGeonameIdSt = representedCountryGeonameIdSt;
            this.representedCountryGeonameIdEd = representedCountryGeonameIdEd;
            return this;
        }

        public QueryBuilder representedCountryGeonameIdGreaterEqThan(Long representedCountryGeonameIdSt){
            this.representedCountryGeonameIdSt = representedCountryGeonameIdSt;
            return this;
        }
        public QueryBuilder representedCountryGeonameIdLessEqThan(Long representedCountryGeonameIdEd){
            this.representedCountryGeonameIdEd = representedCountryGeonameIdEd;
            return this;
        }


        public QueryBuilder representedCountryGeonameId(Long representedCountryGeonameId){
            setRepresentedCountryGeonameId(representedCountryGeonameId);
            return this;
        }

        public QueryBuilder representedCountryGeonameIdList(Long ... representedCountryGeonameId){
            this.representedCountryGeonameIdList = solveNullList(representedCountryGeonameId);
            return this;
        }

        public QueryBuilder representedCountryGeonameIdList(List<Long> representedCountryGeonameId){
            this.representedCountryGeonameIdList = representedCountryGeonameId;
            return this;
        }

        public QueryBuilder fetchRepresentedCountryGeonameId(){
            setFetchFields("fetchFields","representedCountryGeonameId");
            return this;
        }

        public QueryBuilder excludeRepresentedCountryGeonameId(){
            setFetchFields("excludeFields","representedCountryGeonameId");
            return this;
        }

        public QueryBuilder isAnonymousProxyBetWeen(Integer isAnonymousProxySt,Integer isAnonymousProxyEd){
            this.isAnonymousProxySt = isAnonymousProxySt;
            this.isAnonymousProxyEd = isAnonymousProxyEd;
            return this;
        }

        public QueryBuilder isAnonymousProxyGreaterEqThan(Integer isAnonymousProxySt){
            this.isAnonymousProxySt = isAnonymousProxySt;
            return this;
        }
        public QueryBuilder isAnonymousProxyLessEqThan(Integer isAnonymousProxyEd){
            this.isAnonymousProxyEd = isAnonymousProxyEd;
            return this;
        }


        public QueryBuilder isAnonymousProxy(Integer isAnonymousProxy){
            setIsAnonymousProxy(isAnonymousProxy);
            return this;
        }

        public QueryBuilder isAnonymousProxyList(Integer ... isAnonymousProxy){
            this.isAnonymousProxyList = solveNullList(isAnonymousProxy);
            return this;
        }

        public QueryBuilder isAnonymousProxyList(List<Integer> isAnonymousProxy){
            this.isAnonymousProxyList = isAnonymousProxy;
            return this;
        }

        public QueryBuilder fetchIsAnonymousProxy(){
            setFetchFields("fetchFields","isAnonymousProxy");
            return this;
        }

        public QueryBuilder excludeIsAnonymousProxy(){
            setFetchFields("excludeFields","isAnonymousProxy");
            return this;
        }

        public QueryBuilder isSatelliteProviderBetWeen(Integer isSatelliteProviderSt,Integer isSatelliteProviderEd){
            this.isSatelliteProviderSt = isSatelliteProviderSt;
            this.isSatelliteProviderEd = isSatelliteProviderEd;
            return this;
        }

        public QueryBuilder isSatelliteProviderGreaterEqThan(Integer isSatelliteProviderSt){
            this.isSatelliteProviderSt = isSatelliteProviderSt;
            return this;
        }
        public QueryBuilder isSatelliteProviderLessEqThan(Integer isSatelliteProviderEd){
            this.isSatelliteProviderEd = isSatelliteProviderEd;
            return this;
        }


        public QueryBuilder isSatelliteProvider(Integer isSatelliteProvider){
            setIsSatelliteProvider(isSatelliteProvider);
            return this;
        }

        public QueryBuilder isSatelliteProviderList(Integer ... isSatelliteProvider){
            this.isSatelliteProviderList = solveNullList(isSatelliteProvider);
            return this;
        }

        public QueryBuilder isSatelliteProviderList(List<Integer> isSatelliteProvider){
            this.isSatelliteProviderList = isSatelliteProvider;
            return this;
        }

        public QueryBuilder fetchIsSatelliteProvider(){
            setFetchFields("fetchFields","isSatelliteProvider");
            return this;
        }

        public QueryBuilder excludeIsSatelliteProvider(){
            setFetchFields("excludeFields","isSatelliteProvider");
            return this;
        }

        public QueryBuilder fuzzyPostalCode (List<String> fuzzyPostalCode){
            this.fuzzyPostalCode = fuzzyPostalCode;
            return this;
        }

        public QueryBuilder fuzzyPostalCode (String ... fuzzyPostalCode){
            this.fuzzyPostalCode = solveNullList(fuzzyPostalCode);
            return this;
        }

        public QueryBuilder rightFuzzyPostalCode (List<String> rightFuzzyPostalCode){
            this.rightFuzzyPostalCode = rightFuzzyPostalCode;
            return this;
        }

        public QueryBuilder rightFuzzyPostalCode (String ... rightFuzzyPostalCode){
            this.rightFuzzyPostalCode = solveNullList(rightFuzzyPostalCode);
            return this;
        }

        public QueryBuilder postalCode(String postalCode){
            setPostalCode(postalCode);
            return this;
        }

        public QueryBuilder postalCodeList(String ... postalCode){
            this.postalCodeList = solveNullList(postalCode);
            return this;
        }

        public QueryBuilder postalCodeList(List<String> postalCode){
            this.postalCodeList = postalCode;
            return this;
        }

        public QueryBuilder fetchPostalCode(){
            setFetchFields("fetchFields","postalCode");
            return this;
        }

        public QueryBuilder excludePostalCode(){
            setFetchFields("excludeFields","postalCode");
            return this;
        }

        public QueryBuilder latitudeBetWeen(java.math.BigDecimal latitudeSt,java.math.BigDecimal latitudeEd){
            this.latitudeSt = latitudeSt;
            this.latitudeEd = latitudeEd;
            return this;
        }

        public QueryBuilder latitudeGreaterEqThan(java.math.BigDecimal latitudeSt){
            this.latitudeSt = latitudeSt;
            return this;
        }
        public QueryBuilder latitudeLessEqThan(java.math.BigDecimal latitudeEd){
            this.latitudeEd = latitudeEd;
            return this;
        }


        public QueryBuilder latitude(java.math.BigDecimal latitude){
            setLatitude(latitude);
            return this;
        }

        public QueryBuilder latitudeList(java.math.BigDecimal ... latitude){
            this.latitudeList = solveNullList(latitude);
            return this;
        }

        public QueryBuilder latitudeList(List<java.math.BigDecimal> latitude){
            this.latitudeList = latitude;
            return this;
        }

        public QueryBuilder fetchLatitude(){
            setFetchFields("fetchFields","latitude");
            return this;
        }

        public QueryBuilder excludeLatitude(){
            setFetchFields("excludeFields","latitude");
            return this;
        }

        public QueryBuilder longitudeBetWeen(java.math.BigDecimal longitudeSt,java.math.BigDecimal longitudeEd){
            this.longitudeSt = longitudeSt;
            this.longitudeEd = longitudeEd;
            return this;
        }

        public QueryBuilder longitudeGreaterEqThan(java.math.BigDecimal longitudeSt){
            this.longitudeSt = longitudeSt;
            return this;
        }
        public QueryBuilder longitudeLessEqThan(java.math.BigDecimal longitudeEd){
            this.longitudeEd = longitudeEd;
            return this;
        }


        public QueryBuilder longitude(java.math.BigDecimal longitude){
            setLongitude(longitude);
            return this;
        }

        public QueryBuilder longitudeList(java.math.BigDecimal ... longitude){
            this.longitudeList = solveNullList(longitude);
            return this;
        }

        public QueryBuilder longitudeList(List<java.math.BigDecimal> longitude){
            this.longitudeList = longitude;
            return this;
        }

        public QueryBuilder fetchLongitude(){
            setFetchFields("fetchFields","longitude");
            return this;
        }

        public QueryBuilder excludeLongitude(){
            setFetchFields("excludeFields","longitude");
            return this;
        }

        public QueryBuilder accuracyRadiusBetWeen(Integer accuracyRadiusSt,Integer accuracyRadiusEd){
            this.accuracyRadiusSt = accuracyRadiusSt;
            this.accuracyRadiusEd = accuracyRadiusEd;
            return this;
        }

        public QueryBuilder accuracyRadiusGreaterEqThan(Integer accuracyRadiusSt){
            this.accuracyRadiusSt = accuracyRadiusSt;
            return this;
        }
        public QueryBuilder accuracyRadiusLessEqThan(Integer accuracyRadiusEd){
            this.accuracyRadiusEd = accuracyRadiusEd;
            return this;
        }


        public QueryBuilder accuracyRadius(Integer accuracyRadius){
            setAccuracyRadius(accuracyRadius);
            return this;
        }

        public QueryBuilder accuracyRadiusList(Integer ... accuracyRadius){
            this.accuracyRadiusList = solveNullList(accuracyRadius);
            return this;
        }

        public QueryBuilder accuracyRadiusList(List<Integer> accuracyRadius){
            this.accuracyRadiusList = accuracyRadius;
            return this;
        }

        public QueryBuilder fetchAccuracyRadius(){
            setFetchFields("fetchFields","accuracyRadius");
            return this;
        }

        public QueryBuilder excludeAccuracyRadius(){
            setFetchFields("excludeFields","accuracyRadius");
            return this;
        }
        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public QueryBuilder fetchAll(){
            this.fetchFields.put("AllFields",true);
            return this;
        }

        public QueryBuilder addField(String ... fields){
            List<String> list = new ArrayList<>();
            if (fields != null){
                for (String field : fields){
                    list.add(field);
                }
            }
            this.fetchFields.put("otherFields",list);
            return this;
        }
        @SuppressWarnings("unchecked")
        private void setFetchFields(String key,String val){
            Map<String,Boolean> fields= (Map<String, Boolean>) this.fetchFields.get(key);
            if (fields == null){
                fields = new HashMap<>();
            }
            fields.put(val,true);
            this.fetchFields.put(key,fields);
        }

        public CityBlockIpv4 build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<String> networkList;

        public List<String> getNetworkList(){return this.networkList;}


        private List<String> fuzzyNetwork;

        public List<String> getFuzzyNetwork(){return this.fuzzyNetwork;}

        private List<String> rightFuzzyNetwork;

        public List<String> getRightFuzzyNetwork(){return this.rightFuzzyNetwork;}
        private List<Long> geonameIdList;

        public List<Long> getGeonameIdList(){return this.geonameIdList;}

        private Long geonameIdSt;

        private Long geonameIdEd;

        public Long getGeonameIdSt(){return this.geonameIdSt;}

        public Long getGeonameIdEd(){return this.geonameIdEd;}

        private List<Long> registeredCountryGeonameIdList;

        public List<Long> getRegisteredCountryGeonameIdList(){return this.registeredCountryGeonameIdList;}

        private Long registeredCountryGeonameIdSt;

        private Long registeredCountryGeonameIdEd;

        public Long getRegisteredCountryGeonameIdSt(){return this.registeredCountryGeonameIdSt;}

        public Long getRegisteredCountryGeonameIdEd(){return this.registeredCountryGeonameIdEd;}

        private List<Long> representedCountryGeonameIdList;

        public List<Long> getRepresentedCountryGeonameIdList(){return this.representedCountryGeonameIdList;}

        private Long representedCountryGeonameIdSt;

        private Long representedCountryGeonameIdEd;

        public Long getRepresentedCountryGeonameIdSt(){return this.representedCountryGeonameIdSt;}

        public Long getRepresentedCountryGeonameIdEd(){return this.representedCountryGeonameIdEd;}

        private List<Integer> isAnonymousProxyList;

        public List<Integer> getIsAnonymousProxyList(){return this.isAnonymousProxyList;}

        private Integer isAnonymousProxySt;

        private Integer isAnonymousProxyEd;

        public Integer getIsAnonymousProxySt(){return this.isAnonymousProxySt;}

        public Integer getIsAnonymousProxyEd(){return this.isAnonymousProxyEd;}

        private List<Integer> isSatelliteProviderList;

        public List<Integer> getIsSatelliteProviderList(){return this.isSatelliteProviderList;}

        private Integer isSatelliteProviderSt;

        private Integer isSatelliteProviderEd;

        public Integer getIsSatelliteProviderSt(){return this.isSatelliteProviderSt;}

        public Integer getIsSatelliteProviderEd(){return this.isSatelliteProviderEd;}

        private List<String> postalCodeList;

        public List<String> getPostalCodeList(){return this.postalCodeList;}


        private List<String> fuzzyPostalCode;

        public List<String> getFuzzyPostalCode(){return this.fuzzyPostalCode;}

        private List<String> rightFuzzyPostalCode;

        public List<String> getRightFuzzyPostalCode(){return this.rightFuzzyPostalCode;}
        private List<java.math.BigDecimal> latitudeList;

        public List<java.math.BigDecimal> getLatitudeList(){return this.latitudeList;}

        private java.math.BigDecimal latitudeSt;

        private java.math.BigDecimal latitudeEd;

        public java.math.BigDecimal getLatitudeSt(){return this.latitudeSt;}

        public java.math.BigDecimal getLatitudeEd(){return this.latitudeEd;}

        private List<java.math.BigDecimal> longitudeList;

        public List<java.math.BigDecimal> getLongitudeList(){return this.longitudeList;}

        private java.math.BigDecimal longitudeSt;

        private java.math.BigDecimal longitudeEd;

        public java.math.BigDecimal getLongitudeSt(){return this.longitudeSt;}

        public java.math.BigDecimal getLongitudeEd(){return this.longitudeEd;}

        private List<Integer> accuracyRadiusList;

        public List<Integer> getAccuracyRadiusList(){return this.accuracyRadiusList;}

        private Integer accuracyRadiusSt;

        private Integer accuracyRadiusEd;

        public Integer getAccuracyRadiusSt(){return this.accuracyRadiusSt;}

        public Integer getAccuracyRadiusEd(){return this.accuracyRadiusEd;}


        public ConditionBuilder idBetWeen(Long idSt,Long idEd){
            this.idSt = idSt;
            this.idEd = idEd;
            return this;
        }

        public ConditionBuilder idGreaterEqThan(Long idSt){
            this.idSt = idSt;
            return this;
        }
        public ConditionBuilder idLessEqThan(Long idEd){
            this.idEd = idEd;
            return this;
        }


        public ConditionBuilder idList(Long ... id){
            this.idList = solveNullList(id);
            return this;
        }

        public ConditionBuilder idList(List<Long> id){
            this.idList = id;
            return this;
        }

        public ConditionBuilder fuzzyNetwork (List<String> fuzzyNetwork){
            this.fuzzyNetwork = fuzzyNetwork;
            return this;
        }

        public ConditionBuilder fuzzyNetwork (String ... fuzzyNetwork){
            this.fuzzyNetwork = solveNullList(fuzzyNetwork);
            return this;
        }

        public ConditionBuilder rightFuzzyNetwork (List<String> rightFuzzyNetwork){
            this.rightFuzzyNetwork = rightFuzzyNetwork;
            return this;
        }

        public ConditionBuilder rightFuzzyNetwork (String ... rightFuzzyNetwork){
            this.rightFuzzyNetwork = solveNullList(rightFuzzyNetwork);
            return this;
        }

        public ConditionBuilder networkList(String ... network){
            this.networkList = solveNullList(network);
            return this;
        }

        public ConditionBuilder networkList(List<String> network){
            this.networkList = network;
            return this;
        }

        public ConditionBuilder geonameIdBetWeen(Long geonameIdSt,Long geonameIdEd){
            this.geonameIdSt = geonameIdSt;
            this.geonameIdEd = geonameIdEd;
            return this;
        }

        public ConditionBuilder geonameIdGreaterEqThan(Long geonameIdSt){
            this.geonameIdSt = geonameIdSt;
            return this;
        }
        public ConditionBuilder geonameIdLessEqThan(Long geonameIdEd){
            this.geonameIdEd = geonameIdEd;
            return this;
        }


        public ConditionBuilder geonameIdList(Long ... geonameId){
            this.geonameIdList = solveNullList(geonameId);
            return this;
        }

        public ConditionBuilder geonameIdList(List<Long> geonameId){
            this.geonameIdList = geonameId;
            return this;
        }

        public ConditionBuilder registeredCountryGeonameIdBetWeen(Long registeredCountryGeonameIdSt,Long registeredCountryGeonameIdEd){
            this.registeredCountryGeonameIdSt = registeredCountryGeonameIdSt;
            this.registeredCountryGeonameIdEd = registeredCountryGeonameIdEd;
            return this;
        }

        public ConditionBuilder registeredCountryGeonameIdGreaterEqThan(Long registeredCountryGeonameIdSt){
            this.registeredCountryGeonameIdSt = registeredCountryGeonameIdSt;
            return this;
        }
        public ConditionBuilder registeredCountryGeonameIdLessEqThan(Long registeredCountryGeonameIdEd){
            this.registeredCountryGeonameIdEd = registeredCountryGeonameIdEd;
            return this;
        }


        public ConditionBuilder registeredCountryGeonameIdList(Long ... registeredCountryGeonameId){
            this.registeredCountryGeonameIdList = solveNullList(registeredCountryGeonameId);
            return this;
        }

        public ConditionBuilder registeredCountryGeonameIdList(List<Long> registeredCountryGeonameId){
            this.registeredCountryGeonameIdList = registeredCountryGeonameId;
            return this;
        }

        public ConditionBuilder representedCountryGeonameIdBetWeen(Long representedCountryGeonameIdSt,Long representedCountryGeonameIdEd){
            this.representedCountryGeonameIdSt = representedCountryGeonameIdSt;
            this.representedCountryGeonameIdEd = representedCountryGeonameIdEd;
            return this;
        }

        public ConditionBuilder representedCountryGeonameIdGreaterEqThan(Long representedCountryGeonameIdSt){
            this.representedCountryGeonameIdSt = representedCountryGeonameIdSt;
            return this;
        }
        public ConditionBuilder representedCountryGeonameIdLessEqThan(Long representedCountryGeonameIdEd){
            this.representedCountryGeonameIdEd = representedCountryGeonameIdEd;
            return this;
        }


        public ConditionBuilder representedCountryGeonameIdList(Long ... representedCountryGeonameId){
            this.representedCountryGeonameIdList = solveNullList(representedCountryGeonameId);
            return this;
        }

        public ConditionBuilder representedCountryGeonameIdList(List<Long> representedCountryGeonameId){
            this.representedCountryGeonameIdList = representedCountryGeonameId;
            return this;
        }

        public ConditionBuilder isAnonymousProxyBetWeen(Integer isAnonymousProxySt,Integer isAnonymousProxyEd){
            this.isAnonymousProxySt = isAnonymousProxySt;
            this.isAnonymousProxyEd = isAnonymousProxyEd;
            return this;
        }

        public ConditionBuilder isAnonymousProxyGreaterEqThan(Integer isAnonymousProxySt){
            this.isAnonymousProxySt = isAnonymousProxySt;
            return this;
        }
        public ConditionBuilder isAnonymousProxyLessEqThan(Integer isAnonymousProxyEd){
            this.isAnonymousProxyEd = isAnonymousProxyEd;
            return this;
        }


        public ConditionBuilder isAnonymousProxyList(Integer ... isAnonymousProxy){
            this.isAnonymousProxyList = solveNullList(isAnonymousProxy);
            return this;
        }

        public ConditionBuilder isAnonymousProxyList(List<Integer> isAnonymousProxy){
            this.isAnonymousProxyList = isAnonymousProxy;
            return this;
        }

        public ConditionBuilder isSatelliteProviderBetWeen(Integer isSatelliteProviderSt,Integer isSatelliteProviderEd){
            this.isSatelliteProviderSt = isSatelliteProviderSt;
            this.isSatelliteProviderEd = isSatelliteProviderEd;
            return this;
        }

        public ConditionBuilder isSatelliteProviderGreaterEqThan(Integer isSatelliteProviderSt){
            this.isSatelliteProviderSt = isSatelliteProviderSt;
            return this;
        }
        public ConditionBuilder isSatelliteProviderLessEqThan(Integer isSatelliteProviderEd){
            this.isSatelliteProviderEd = isSatelliteProviderEd;
            return this;
        }


        public ConditionBuilder isSatelliteProviderList(Integer ... isSatelliteProvider){
            this.isSatelliteProviderList = solveNullList(isSatelliteProvider);
            return this;
        }

        public ConditionBuilder isSatelliteProviderList(List<Integer> isSatelliteProvider){
            this.isSatelliteProviderList = isSatelliteProvider;
            return this;
        }

        public ConditionBuilder fuzzyPostalCode (List<String> fuzzyPostalCode){
            this.fuzzyPostalCode = fuzzyPostalCode;
            return this;
        }

        public ConditionBuilder fuzzyPostalCode (String ... fuzzyPostalCode){
            this.fuzzyPostalCode = solveNullList(fuzzyPostalCode);
            return this;
        }

        public ConditionBuilder rightFuzzyPostalCode (List<String> rightFuzzyPostalCode){
            this.rightFuzzyPostalCode = rightFuzzyPostalCode;
            return this;
        }

        public ConditionBuilder rightFuzzyPostalCode (String ... rightFuzzyPostalCode){
            this.rightFuzzyPostalCode = solveNullList(rightFuzzyPostalCode);
            return this;
        }

        public ConditionBuilder postalCodeList(String ... postalCode){
            this.postalCodeList = solveNullList(postalCode);
            return this;
        }

        public ConditionBuilder postalCodeList(List<String> postalCode){
            this.postalCodeList = postalCode;
            return this;
        }

        public ConditionBuilder latitudeBetWeen(java.math.BigDecimal latitudeSt,java.math.BigDecimal latitudeEd){
            this.latitudeSt = latitudeSt;
            this.latitudeEd = latitudeEd;
            return this;
        }

        public ConditionBuilder latitudeGreaterEqThan(java.math.BigDecimal latitudeSt){
            this.latitudeSt = latitudeSt;
            return this;
        }
        public ConditionBuilder latitudeLessEqThan(java.math.BigDecimal latitudeEd){
            this.latitudeEd = latitudeEd;
            return this;
        }


        public ConditionBuilder latitudeList(java.math.BigDecimal ... latitude){
            this.latitudeList = solveNullList(latitude);
            return this;
        }

        public ConditionBuilder latitudeList(List<java.math.BigDecimal> latitude){
            this.latitudeList = latitude;
            return this;
        }

        public ConditionBuilder longitudeBetWeen(java.math.BigDecimal longitudeSt,java.math.BigDecimal longitudeEd){
            this.longitudeSt = longitudeSt;
            this.longitudeEd = longitudeEd;
            return this;
        }

        public ConditionBuilder longitudeGreaterEqThan(java.math.BigDecimal longitudeSt){
            this.longitudeSt = longitudeSt;
            return this;
        }
        public ConditionBuilder longitudeLessEqThan(java.math.BigDecimal longitudeEd){
            this.longitudeEd = longitudeEd;
            return this;
        }


        public ConditionBuilder longitudeList(java.math.BigDecimal ... longitude){
            this.longitudeList = solveNullList(longitude);
            return this;
        }

        public ConditionBuilder longitudeList(List<java.math.BigDecimal> longitude){
            this.longitudeList = longitude;
            return this;
        }

        public ConditionBuilder accuracyRadiusBetWeen(Integer accuracyRadiusSt,Integer accuracyRadiusEd){
            this.accuracyRadiusSt = accuracyRadiusSt;
            this.accuracyRadiusEd = accuracyRadiusEd;
            return this;
        }

        public ConditionBuilder accuracyRadiusGreaterEqThan(Integer accuracyRadiusSt){
            this.accuracyRadiusSt = accuracyRadiusSt;
            return this;
        }
        public ConditionBuilder accuracyRadiusLessEqThan(Integer accuracyRadiusEd){
            this.accuracyRadiusEd = accuracyRadiusEd;
            return this;
        }


        public ConditionBuilder accuracyRadiusList(Integer ... accuracyRadius){
            this.accuracyRadiusList = solveNullList(accuracyRadius);
            return this;
        }

        public ConditionBuilder accuracyRadiusList(List<Integer> accuracyRadius){
            this.accuracyRadiusList = accuracyRadius;
            return this;
        }

        private <T>List<T> solveNullList(T ... objs){
            if (objs != null){
            List<T> list = new ArrayList<>();
                for (T item : objs){
                    if (item != null){
                        list.add(item);
                    }
                }
                return list;
            }
            return null;
        }

        public ConditionBuilder build(){return this;}
    }

    public static class Builder {

        private CityBlockIpv4 obj;

        public Builder(){
            this.obj = new CityBlockIpv4();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder network(String network){
            this.obj.setNetwork(network);
            return this;
        }
        public Builder geonameId(Long geonameId){
            this.obj.setGeonameId(geonameId);
            return this;
        }
        public Builder registeredCountryGeonameId(Long registeredCountryGeonameId){
            this.obj.setRegisteredCountryGeonameId(registeredCountryGeonameId);
            return this;
        }
        public Builder representedCountryGeonameId(Long representedCountryGeonameId){
            this.obj.setRepresentedCountryGeonameId(representedCountryGeonameId);
            return this;
        }
        public Builder isAnonymousProxy(Integer isAnonymousProxy){
            this.obj.setIsAnonymousProxy(isAnonymousProxy);
            return this;
        }
        public Builder isSatelliteProvider(Integer isSatelliteProvider){
            this.obj.setIsSatelliteProvider(isSatelliteProvider);
            return this;
        }
        public Builder postalCode(String postalCode){
            this.obj.setPostalCode(postalCode);
            return this;
        }
        public Builder latitude(java.math.BigDecimal latitude){
            this.obj.setLatitude(latitude);
            return this;
        }
        public Builder longitude(java.math.BigDecimal longitude){
            this.obj.setLongitude(longitude);
            return this;
        }
        public Builder accuracyRadius(Integer accuracyRadius){
            this.obj.setAccuracyRadius(accuracyRadius);
            return this;
        }
        public CityBlockIpv4 build(){return obj;}
    }

}
