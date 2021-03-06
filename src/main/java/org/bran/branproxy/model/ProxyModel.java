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
public class ProxyModel implements Serializable {

    private static final long serialVersionUID = 1555251411836L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long id;

    /**
    * ip
    * isNullAble:0,defaultVal:
    */
    private String ip;

    /**
    * 端口
    * isNullAble:0,defaultVal:0
    */
    private Integer port;

    /**
    * 地址
    * isNullAble:0,defaultVal:
    */
    private String address;

    /**
    * 匿名度
    * isNullAble:0,defaultVal:0
    */
    private Integer anonymity;

    /**
    * 类型
    * isNullAble:0,defaultVal:0
    */
    private Integer type;

    /**
    * 响应时间
    * isNullAble:0,defaultVal:0
    */
    private Integer timeout;

    /**
    * 最新更新时间
    * isNullAble:0,defaultVal:0000-00-00 00:00:00
    */
    private java.time.LocalDateTime lastUpdateTime;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setIp(String ip){this.ip = ip;}

    public String getIp(){return this.ip;}

    public void setPort(Integer port){this.port = port;}

    public Integer getPort(){return this.port;}

    public void setAddress(String address){this.address = address;}

    public String getAddress(){return this.address;}

    public void setAnonymity(Integer anonymity){this.anonymity = anonymity;}

    public Integer getAnonymity(){return this.anonymity;}

    public void setType(Integer type){this.type = type;}

    public Integer getType(){return this.type;}

    public void setTimeout(Integer timeout){this.timeout = timeout;}

    public Integer getTimeout(){return this.timeout;}

    public void setLastUpdateTime(java.time.LocalDateTime lastUpdateTime){this.lastUpdateTime = lastUpdateTime;}

    public java.time.LocalDateTime getLastUpdateTime(){return this.lastUpdateTime;}
    @Override
    public String toString() {
        return "ProxyModel{" +
                "id='" + id + '\'' +
                "ip='" + ip + '\'' +
                "port='" + port + '\'' +
                "address='" + address + '\'' +
                "anonymity='" + anonymity + '\'' +
                "type='" + type + '\'' +
                "timeout='" + timeout + '\'' +
                "lastUpdateTime='" + lastUpdateTime + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private ProxyModel set;

        private ConditionBuilder where;

        public UpdateBuilder set(ProxyModel set){
            this.set = set;
            return this;
        }

        public ProxyModel getSet(){
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

    public static class QueryBuilder extends ProxyModel{
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

        private List<String> ipList;

        public List<String> getIpList(){return this.ipList;}


        private List<String> fuzzyIp;

        public List<String> getFuzzyIp(){return this.fuzzyIp;}

        private List<String> rightFuzzyIp;

        public List<String> getRightFuzzyIp(){return this.rightFuzzyIp;}
        private List<Integer> portList;

        public List<Integer> getPortList(){return this.portList;}

        private Integer portSt;

        private Integer portEd;

        public Integer getPortSt(){return this.portSt;}

        public Integer getPortEd(){return this.portEd;}

        private List<String> addressList;

        public List<String> getAddressList(){return this.addressList;}


        private List<String> fuzzyAddress;

        public List<String> getFuzzyAddress(){return this.fuzzyAddress;}

        private List<String> rightFuzzyAddress;

        public List<String> getRightFuzzyAddress(){return this.rightFuzzyAddress;}
        private List<Integer> anonymityList;

        public List<Integer> getAnonymityList(){return this.anonymityList;}

        private Integer anonymitySt;

        private Integer anonymityEd;

        public Integer getAnonymitySt(){return this.anonymitySt;}

        public Integer getAnonymityEd(){return this.anonymityEd;}

        private List<Integer> typeList;

        public List<Integer> getTypeList(){return this.typeList;}

        private Integer typeSt;

        private Integer typeEd;

        public Integer getTypeSt(){return this.typeSt;}

        public Integer getTypeEd(){return this.typeEd;}

        private List<Integer> timeoutList;

        public List<Integer> getTimeoutList(){return this.timeoutList;}

        private Integer timeoutSt;

        private Integer timeoutEd;

        public Integer getTimeoutSt(){return this.timeoutSt;}

        public Integer getTimeoutEd(){return this.timeoutEd;}

        private List<java.time.LocalDateTime> lastUpdateTimeList;

        public List<java.time.LocalDateTime> getLastUpdateTimeList(){return this.lastUpdateTimeList;}

        private java.time.LocalDateTime lastUpdateTimeSt;

        private java.time.LocalDateTime lastUpdateTimeEd;

        public java.time.LocalDateTime getLastUpdateTimeSt(){return this.lastUpdateTimeSt;}

        public java.time.LocalDateTime getLastUpdateTimeEd(){return this.lastUpdateTimeEd;}

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

        public QueryBuilder fuzzyIp (List<String> fuzzyIp){
            this.fuzzyIp = fuzzyIp;
            return this;
        }

        public QueryBuilder fuzzyIp (String ... fuzzyIp){
            this.fuzzyIp = solveNullList(fuzzyIp);
            return this;
        }

        public QueryBuilder rightFuzzyIp (List<String> rightFuzzyIp){
            this.rightFuzzyIp = rightFuzzyIp;
            return this;
        }

        public QueryBuilder rightFuzzyIp (String ... rightFuzzyIp){
            this.rightFuzzyIp = solveNullList(rightFuzzyIp);
            return this;
        }

        public QueryBuilder ip(String ip){
            setIp(ip);
            return this;
        }

        public QueryBuilder ipList(String ... ip){
            this.ipList = solveNullList(ip);
            return this;
        }

        public QueryBuilder ipList(List<String> ip){
            this.ipList = ip;
            return this;
        }

        public QueryBuilder fetchIp(){
            setFetchFields("fetchFields","ip");
            return this;
        }

        public QueryBuilder excludeIp(){
            setFetchFields("excludeFields","ip");
            return this;
        }

        public QueryBuilder portBetWeen(Integer portSt,Integer portEd){
            this.portSt = portSt;
            this.portEd = portEd;
            return this;
        }

        public QueryBuilder portGreaterEqThan(Integer portSt){
            this.portSt = portSt;
            return this;
        }
        public QueryBuilder portLessEqThan(Integer portEd){
            this.portEd = portEd;
            return this;
        }


        public QueryBuilder port(Integer port){
            setPort(port);
            return this;
        }

        public QueryBuilder portList(Integer ... port){
            this.portList = solveNullList(port);
            return this;
        }

        public QueryBuilder portList(List<Integer> port){
            this.portList = port;
            return this;
        }

        public QueryBuilder fetchPort(){
            setFetchFields("fetchFields","port");
            return this;
        }

        public QueryBuilder excludePort(){
            setFetchFields("excludeFields","port");
            return this;
        }

        public QueryBuilder fuzzyAddress (List<String> fuzzyAddress){
            this.fuzzyAddress = fuzzyAddress;
            return this;
        }

        public QueryBuilder fuzzyAddress (String ... fuzzyAddress){
            this.fuzzyAddress = solveNullList(fuzzyAddress);
            return this;
        }

        public QueryBuilder rightFuzzyAddress (List<String> rightFuzzyAddress){
            this.rightFuzzyAddress = rightFuzzyAddress;
            return this;
        }

        public QueryBuilder rightFuzzyAddress (String ... rightFuzzyAddress){
            this.rightFuzzyAddress = solveNullList(rightFuzzyAddress);
            return this;
        }

        public QueryBuilder address(String address){
            setAddress(address);
            return this;
        }

        public QueryBuilder addressList(String ... address){
            this.addressList = solveNullList(address);
            return this;
        }

        public QueryBuilder addressList(List<String> address){
            this.addressList = address;
            return this;
        }

        public QueryBuilder fetchAddress(){
            setFetchFields("fetchFields","address");
            return this;
        }

        public QueryBuilder excludeAddress(){
            setFetchFields("excludeFields","address");
            return this;
        }

        public QueryBuilder anonymityBetWeen(Integer anonymitySt,Integer anonymityEd){
            this.anonymitySt = anonymitySt;
            this.anonymityEd = anonymityEd;
            return this;
        }

        public QueryBuilder anonymityGreaterEqThan(Integer anonymitySt){
            this.anonymitySt = anonymitySt;
            return this;
        }
        public QueryBuilder anonymityLessEqThan(Integer anonymityEd){
            this.anonymityEd = anonymityEd;
            return this;
        }


        public QueryBuilder anonymity(Integer anonymity){
            setAnonymity(anonymity);
            return this;
        }

        public QueryBuilder anonymityList(Integer ... anonymity){
            this.anonymityList = solveNullList(anonymity);
            return this;
        }

        public QueryBuilder anonymityList(List<Integer> anonymity){
            this.anonymityList = anonymity;
            return this;
        }

        public QueryBuilder fetchAnonymity(){
            setFetchFields("fetchFields","anonymity");
            return this;
        }

        public QueryBuilder excludeAnonymity(){
            setFetchFields("excludeFields","anonymity");
            return this;
        }

        public QueryBuilder typeBetWeen(Integer typeSt,Integer typeEd){
            this.typeSt = typeSt;
            this.typeEd = typeEd;
            return this;
        }

        public QueryBuilder typeGreaterEqThan(Integer typeSt){
            this.typeSt = typeSt;
            return this;
        }
        public QueryBuilder typeLessEqThan(Integer typeEd){
            this.typeEd = typeEd;
            return this;
        }


        public QueryBuilder type(Integer type){
            setType(type);
            return this;
        }

        public QueryBuilder typeList(Integer ... type){
            this.typeList = solveNullList(type);
            return this;
        }

        public QueryBuilder typeList(List<Integer> type){
            this.typeList = type;
            return this;
        }

        public QueryBuilder fetchType(){
            setFetchFields("fetchFields","type");
            return this;
        }

        public QueryBuilder excludeType(){
            setFetchFields("excludeFields","type");
            return this;
        }

        public QueryBuilder timeoutBetWeen(Integer timeoutSt,Integer timeoutEd){
            this.timeoutSt = timeoutSt;
            this.timeoutEd = timeoutEd;
            return this;
        }

        public QueryBuilder timeoutGreaterEqThan(Integer timeoutSt){
            this.timeoutSt = timeoutSt;
            return this;
        }
        public QueryBuilder timeoutLessEqThan(Integer timeoutEd){
            this.timeoutEd = timeoutEd;
            return this;
        }


        public QueryBuilder timeout(Integer timeout){
            setTimeout(timeout);
            return this;
        }

        public QueryBuilder timeoutList(Integer ... timeout){
            this.timeoutList = solveNullList(timeout);
            return this;
        }

        public QueryBuilder timeoutList(List<Integer> timeout){
            this.timeoutList = timeout;
            return this;
        }

        public QueryBuilder fetchTimeout(){
            setFetchFields("fetchFields","timeout");
            return this;
        }

        public QueryBuilder excludeTimeout(){
            setFetchFields("excludeFields","timeout");
            return this;
        }

        public QueryBuilder lastUpdateTimeBetWeen(java.time.LocalDateTime lastUpdateTimeSt,java.time.LocalDateTime lastUpdateTimeEd){
            this.lastUpdateTimeSt = lastUpdateTimeSt;
            this.lastUpdateTimeEd = lastUpdateTimeEd;
            return this;
        }

        public QueryBuilder lastUpdateTimeGreaterEqThan(java.time.LocalDateTime lastUpdateTimeSt){
            this.lastUpdateTimeSt = lastUpdateTimeSt;
            return this;
        }
        public QueryBuilder lastUpdateTimeLessEqThan(java.time.LocalDateTime lastUpdateTimeEd){
            this.lastUpdateTimeEd = lastUpdateTimeEd;
            return this;
        }


        public QueryBuilder lastUpdateTime(java.time.LocalDateTime lastUpdateTime){
            setLastUpdateTime(lastUpdateTime);
            return this;
        }

        public QueryBuilder lastUpdateTimeList(java.time.LocalDateTime ... lastUpdateTime){
            this.lastUpdateTimeList = solveNullList(lastUpdateTime);
            return this;
        }

        public QueryBuilder lastUpdateTimeList(List<java.time.LocalDateTime> lastUpdateTime){
            this.lastUpdateTimeList = lastUpdateTime;
            return this;
        }

        public QueryBuilder fetchLastUpdateTime(){
            setFetchFields("fetchFields","lastUpdateTime");
            return this;
        }

        public QueryBuilder excludeLastUpdateTime(){
            setFetchFields("excludeFields","lastUpdateTime");
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

        public ProxyModel build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<String> ipList;

        public List<String> getIpList(){return this.ipList;}


        private List<String> fuzzyIp;

        public List<String> getFuzzyIp(){return this.fuzzyIp;}

        private List<String> rightFuzzyIp;

        public List<String> getRightFuzzyIp(){return this.rightFuzzyIp;}
        private List<Integer> portList;

        public List<Integer> getPortList(){return this.portList;}

        private Integer portSt;

        private Integer portEd;

        public Integer getPortSt(){return this.portSt;}

        public Integer getPortEd(){return this.portEd;}

        private List<String> addressList;

        public List<String> getAddressList(){return this.addressList;}


        private List<String> fuzzyAddress;

        public List<String> getFuzzyAddress(){return this.fuzzyAddress;}

        private List<String> rightFuzzyAddress;

        public List<String> getRightFuzzyAddress(){return this.rightFuzzyAddress;}
        private List<Integer> anonymityList;

        public List<Integer> getAnonymityList(){return this.anonymityList;}

        private Integer anonymitySt;

        private Integer anonymityEd;

        public Integer getAnonymitySt(){return this.anonymitySt;}

        public Integer getAnonymityEd(){return this.anonymityEd;}

        private List<Integer> typeList;

        public List<Integer> getTypeList(){return this.typeList;}

        private Integer typeSt;

        private Integer typeEd;

        public Integer getTypeSt(){return this.typeSt;}

        public Integer getTypeEd(){return this.typeEd;}

        private List<Integer> timeoutList;

        public List<Integer> getTimeoutList(){return this.timeoutList;}

        private Integer timeoutSt;

        private Integer timeoutEd;

        public Integer getTimeoutSt(){return this.timeoutSt;}

        public Integer getTimeoutEd(){return this.timeoutEd;}

        private List<java.time.LocalDateTime> lastUpdateTimeList;

        public List<java.time.LocalDateTime> getLastUpdateTimeList(){return this.lastUpdateTimeList;}

        private java.time.LocalDateTime lastUpdateTimeSt;

        private java.time.LocalDateTime lastUpdateTimeEd;

        public java.time.LocalDateTime getLastUpdateTimeSt(){return this.lastUpdateTimeSt;}

        public java.time.LocalDateTime getLastUpdateTimeEd(){return this.lastUpdateTimeEd;}


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

        public ConditionBuilder fuzzyIp (List<String> fuzzyIp){
            this.fuzzyIp = fuzzyIp;
            return this;
        }

        public ConditionBuilder fuzzyIp (String ... fuzzyIp){
            this.fuzzyIp = solveNullList(fuzzyIp);
            return this;
        }

        public ConditionBuilder rightFuzzyIp (List<String> rightFuzzyIp){
            this.rightFuzzyIp = rightFuzzyIp;
            return this;
        }

        public ConditionBuilder rightFuzzyIp (String ... rightFuzzyIp){
            this.rightFuzzyIp = solveNullList(rightFuzzyIp);
            return this;
        }

        public ConditionBuilder ipList(String ... ip){
            this.ipList = solveNullList(ip);
            return this;
        }

        public ConditionBuilder ipList(List<String> ip){
            this.ipList = ip;
            return this;
        }

        public ConditionBuilder portBetWeen(Integer portSt,Integer portEd){
            this.portSt = portSt;
            this.portEd = portEd;
            return this;
        }

        public ConditionBuilder portGreaterEqThan(Integer portSt){
            this.portSt = portSt;
            return this;
        }
        public ConditionBuilder portLessEqThan(Integer portEd){
            this.portEd = portEd;
            return this;
        }


        public ConditionBuilder portList(Integer ... port){
            this.portList = solveNullList(port);
            return this;
        }

        public ConditionBuilder portList(List<Integer> port){
            this.portList = port;
            return this;
        }

        public ConditionBuilder fuzzyAddress (List<String> fuzzyAddress){
            this.fuzzyAddress = fuzzyAddress;
            return this;
        }

        public ConditionBuilder fuzzyAddress (String ... fuzzyAddress){
            this.fuzzyAddress = solveNullList(fuzzyAddress);
            return this;
        }

        public ConditionBuilder rightFuzzyAddress (List<String> rightFuzzyAddress){
            this.rightFuzzyAddress = rightFuzzyAddress;
            return this;
        }

        public ConditionBuilder rightFuzzyAddress (String ... rightFuzzyAddress){
            this.rightFuzzyAddress = solveNullList(rightFuzzyAddress);
            return this;
        }

        public ConditionBuilder addressList(String ... address){
            this.addressList = solveNullList(address);
            return this;
        }

        public ConditionBuilder addressList(List<String> address){
            this.addressList = address;
            return this;
        }

        public ConditionBuilder anonymityBetWeen(Integer anonymitySt,Integer anonymityEd){
            this.anonymitySt = anonymitySt;
            this.anonymityEd = anonymityEd;
            return this;
        }

        public ConditionBuilder anonymityGreaterEqThan(Integer anonymitySt){
            this.anonymitySt = anonymitySt;
            return this;
        }
        public ConditionBuilder anonymityLessEqThan(Integer anonymityEd){
            this.anonymityEd = anonymityEd;
            return this;
        }


        public ConditionBuilder anonymityList(Integer ... anonymity){
            this.anonymityList = solveNullList(anonymity);
            return this;
        }

        public ConditionBuilder anonymityList(List<Integer> anonymity){
            this.anonymityList = anonymity;
            return this;
        }

        public ConditionBuilder typeBetWeen(Integer typeSt,Integer typeEd){
            this.typeSt = typeSt;
            this.typeEd = typeEd;
            return this;
        }

        public ConditionBuilder typeGreaterEqThan(Integer typeSt){
            this.typeSt = typeSt;
            return this;
        }
        public ConditionBuilder typeLessEqThan(Integer typeEd){
            this.typeEd = typeEd;
            return this;
        }


        public ConditionBuilder typeList(Integer ... type){
            this.typeList = solveNullList(type);
            return this;
        }

        public ConditionBuilder typeList(List<Integer> type){
            this.typeList = type;
            return this;
        }

        public ConditionBuilder timeoutBetWeen(Integer timeoutSt,Integer timeoutEd){
            this.timeoutSt = timeoutSt;
            this.timeoutEd = timeoutEd;
            return this;
        }

        public ConditionBuilder timeoutGreaterEqThan(Integer timeoutSt){
            this.timeoutSt = timeoutSt;
            return this;
        }
        public ConditionBuilder timeoutLessEqThan(Integer timeoutEd){
            this.timeoutEd = timeoutEd;
            return this;
        }


        public ConditionBuilder timeoutList(Integer ... timeout){
            this.timeoutList = solveNullList(timeout);
            return this;
        }

        public ConditionBuilder timeoutList(List<Integer> timeout){
            this.timeoutList = timeout;
            return this;
        }

        public ConditionBuilder lastUpdateTimeBetWeen(java.time.LocalDateTime lastUpdateTimeSt,java.time.LocalDateTime lastUpdateTimeEd){
            this.lastUpdateTimeSt = lastUpdateTimeSt;
            this.lastUpdateTimeEd = lastUpdateTimeEd;
            return this;
        }

        public ConditionBuilder lastUpdateTimeGreaterEqThan(java.time.LocalDateTime lastUpdateTimeSt){
            this.lastUpdateTimeSt = lastUpdateTimeSt;
            return this;
        }
        public ConditionBuilder lastUpdateTimeLessEqThan(java.time.LocalDateTime lastUpdateTimeEd){
            this.lastUpdateTimeEd = lastUpdateTimeEd;
            return this;
        }


        public ConditionBuilder lastUpdateTimeList(java.time.LocalDateTime ... lastUpdateTime){
            this.lastUpdateTimeList = solveNullList(lastUpdateTime);
            return this;
        }

        public ConditionBuilder lastUpdateTimeList(List<java.time.LocalDateTime> lastUpdateTime){
            this.lastUpdateTimeList = lastUpdateTime;
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

        private ProxyModel obj;

        public Builder(){
            this.obj = new ProxyModel();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder ip(String ip){
            this.obj.setIp(ip);
            return this;
        }
        public Builder port(Integer port){
            this.obj.setPort(port);
            return this;
        }
        public Builder address(String address){
            this.obj.setAddress(address);
            return this;
        }
        public Builder anonymity(Integer anonymity){
            this.obj.setAnonymity(anonymity);
            return this;
        }
        public Builder type(Integer type){
            this.obj.setType(type);
            return this;
        }
        public Builder timeout(Integer timeout){
            this.obj.setTimeout(timeout);
            return this;
        }
        public Builder lastUpdateTime(java.time.LocalDateTime lastUpdateTime){
            this.obj.setLastUpdateTime(lastUpdateTime);
            return this;
        }
        public ProxyModel build(){return obj;}
    }

}
