package org.bran.branproxy.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
/**
*
*  @author bransummer
*/
public class ProxyPermission implements Serializable {

    private static final long serialVersionUID = 1550392304167L;


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
    private String permissionName;

    /**
    * 
    * isNullAble:1
    */
    private String addUid;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime addTime;

    /**
    * 
    * isNullAble:1
    */
    private String updateUid;

    /**
    * 
    * isNullAble:1
    */
    private java.time.LocalDateTime updateTime;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setPermissionName(String permissionName){this.permissionName = permissionName;}

    public String getPermissionName(){return this.permissionName;}

    public void setAddUid(String addUid){this.addUid = addUid;}

    public String getAddUid(){return this.addUid;}

    public void setAddTime(java.time.LocalDateTime addTime){this.addTime = addTime;}

    public java.time.LocalDateTime getAddTime(){return this.addTime;}

    public void setUpdateUid(String updateUid){this.updateUid = updateUid;}

    public String getUpdateUid(){return this.updateUid;}

    public void setUpdateTime(java.time.LocalDateTime updateTime){this.updateTime = updateTime;}

    public java.time.LocalDateTime getUpdateTime(){return this.updateTime;}
    @Override
    public String toString() {
        return "ProxyPermission{" +
                "id='" + id + '\'' +
                "permissionName='" + permissionName + '\'' +
                "addUid='" + addUid + '\'' +
                "addTime='" + addTime + '\'' +
                "updateUid='" + updateUid + '\'' +
                "updateTime='" + updateTime + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private ProxyPermission set;

        private ConditionBuilder where;

        public UpdateBuilder set(ProxyPermission set){
            this.set = set;
            return this;
        }

        public ProxyPermission getSet(){
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

    public static class QueryBuilder extends ProxyPermission{
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

        private List<String> permissionNameList;

        public List<String> getPermissionNameList(){return this.permissionNameList;}


        private List<String> fuzzyPermissionName;

        public List<String> getFuzzyPermissionName(){return this.fuzzyPermissionName;}

        private List<String> rightFuzzyPermissionName;

        public List<String> getRightFuzzyPermissionName(){return this.rightFuzzyPermissionName;}
        private List<String> addUidList;

        public List<String> getAddUidList(){return this.addUidList;}


        private List<String> fuzzyAddUid;

        public List<String> getFuzzyAddUid(){return this.fuzzyAddUid;}

        private List<String> rightFuzzyAddUid;

        public List<String> getRightFuzzyAddUid(){return this.rightFuzzyAddUid;}
        private List<java.time.LocalDateTime> addTimeList;

        public List<java.time.LocalDateTime> getAddTimeList(){return this.addTimeList;}

        private java.time.LocalDateTime addTimeSt;

        private java.time.LocalDateTime addTimeEd;

        public java.time.LocalDateTime getAddTimeSt(){return this.addTimeSt;}

        public java.time.LocalDateTime getAddTimeEd(){return this.addTimeEd;}

        private List<String> updateUidList;

        public List<String> getUpdateUidList(){return this.updateUidList;}


        private List<String> fuzzyUpdateUid;

        public List<String> getFuzzyUpdateUid(){return this.fuzzyUpdateUid;}

        private List<String> rightFuzzyUpdateUid;

        public List<String> getRightFuzzyUpdateUid(){return this.rightFuzzyUpdateUid;}
        private List<java.time.LocalDateTime> updateTimeList;

        public List<java.time.LocalDateTime> getUpdateTimeList(){return this.updateTimeList;}

        private java.time.LocalDateTime updateTimeSt;

        private java.time.LocalDateTime updateTimeEd;

        public java.time.LocalDateTime getUpdateTimeSt(){return this.updateTimeSt;}

        public java.time.LocalDateTime getUpdateTimeEd(){return this.updateTimeEd;}

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

        public QueryBuilder fuzzyPermissionName (List<String> fuzzyPermissionName){
            this.fuzzyPermissionName = fuzzyPermissionName;
            return this;
        }

        public QueryBuilder fuzzyPermissionName (String ... fuzzyPermissionName){
            this.fuzzyPermissionName = solveNullList(fuzzyPermissionName);
            return this;
        }

        public QueryBuilder rightFuzzyPermissionName (List<String> rightFuzzyPermissionName){
            this.rightFuzzyPermissionName = rightFuzzyPermissionName;
            return this;
        }

        public QueryBuilder rightFuzzyPermissionName (String ... rightFuzzyPermissionName){
            this.rightFuzzyPermissionName = solveNullList(rightFuzzyPermissionName);
            return this;
        }

        public QueryBuilder permissionName(String permissionName){
            setPermissionName(permissionName);
            return this;
        }

        public QueryBuilder permissionNameList(String ... permissionName){
            this.permissionNameList = solveNullList(permissionName);
            return this;
        }

        public QueryBuilder permissionNameList(List<String> permissionName){
            this.permissionNameList = permissionName;
            return this;
        }

        public QueryBuilder fetchPermissionName(){
            setFetchFields("fetchFields","permissionName");
            return this;
        }

        public QueryBuilder excludePermissionName(){
            setFetchFields("excludeFields","permissionName");
            return this;
        }

        public QueryBuilder fuzzyAddUid (List<String> fuzzyAddUid){
            this.fuzzyAddUid = fuzzyAddUid;
            return this;
        }

        public QueryBuilder fuzzyAddUid (String ... fuzzyAddUid){
            this.fuzzyAddUid = solveNullList(fuzzyAddUid);
            return this;
        }

        public QueryBuilder rightFuzzyAddUid (List<String> rightFuzzyAddUid){
            this.rightFuzzyAddUid = rightFuzzyAddUid;
            return this;
        }

        public QueryBuilder rightFuzzyAddUid (String ... rightFuzzyAddUid){
            this.rightFuzzyAddUid = solveNullList(rightFuzzyAddUid);
            return this;
        }

        public QueryBuilder addUid(String addUid){
            setAddUid(addUid);
            return this;
        }

        public QueryBuilder addUidList(String ... addUid){
            this.addUidList = solveNullList(addUid);
            return this;
        }

        public QueryBuilder addUidList(List<String> addUid){
            this.addUidList = addUid;
            return this;
        }

        public QueryBuilder fetchAddUid(){
            setFetchFields("fetchFields","addUid");
            return this;
        }

        public QueryBuilder excludeAddUid(){
            setFetchFields("excludeFields","addUid");
            return this;
        }

        public QueryBuilder addTimeBetWeen(java.time.LocalDateTime addTimeSt,java.time.LocalDateTime addTimeEd){
            this.addTimeSt = addTimeSt;
            this.addTimeEd = addTimeEd;
            return this;
        }

        public QueryBuilder addTimeGreaterEqThan(java.time.LocalDateTime addTimeSt){
            this.addTimeSt = addTimeSt;
            return this;
        }
        public QueryBuilder addTimeLessEqThan(java.time.LocalDateTime addTimeEd){
            this.addTimeEd = addTimeEd;
            return this;
        }


        public QueryBuilder addTime(java.time.LocalDateTime addTime){
            setAddTime(addTime);
            return this;
        }

        public QueryBuilder addTimeList(java.time.LocalDateTime ... addTime){
            this.addTimeList = solveNullList(addTime);
            return this;
        }

        public QueryBuilder addTimeList(List<java.time.LocalDateTime> addTime){
            this.addTimeList = addTime;
            return this;
        }

        public QueryBuilder fetchAddTime(){
            setFetchFields("fetchFields","addTime");
            return this;
        }

        public QueryBuilder excludeAddTime(){
            setFetchFields("excludeFields","addTime");
            return this;
        }

        public QueryBuilder fuzzyUpdateUid (List<String> fuzzyUpdateUid){
            this.fuzzyUpdateUid = fuzzyUpdateUid;
            return this;
        }

        public QueryBuilder fuzzyUpdateUid (String ... fuzzyUpdateUid){
            this.fuzzyUpdateUid = solveNullList(fuzzyUpdateUid);
            return this;
        }

        public QueryBuilder rightFuzzyUpdateUid (List<String> rightFuzzyUpdateUid){
            this.rightFuzzyUpdateUid = rightFuzzyUpdateUid;
            return this;
        }

        public QueryBuilder rightFuzzyUpdateUid (String ... rightFuzzyUpdateUid){
            this.rightFuzzyUpdateUid = solveNullList(rightFuzzyUpdateUid);
            return this;
        }

        public QueryBuilder updateUid(String updateUid){
            setUpdateUid(updateUid);
            return this;
        }

        public QueryBuilder updateUidList(String ... updateUid){
            this.updateUidList = solveNullList(updateUid);
            return this;
        }

        public QueryBuilder updateUidList(List<String> updateUid){
            this.updateUidList = updateUid;
            return this;
        }

        public QueryBuilder fetchUpdateUid(){
            setFetchFields("fetchFields","updateUid");
            return this;
        }

        public QueryBuilder excludeUpdateUid(){
            setFetchFields("excludeFields","updateUid");
            return this;
        }

        public QueryBuilder updateTimeBetWeen(java.time.LocalDateTime updateTimeSt,java.time.LocalDateTime updateTimeEd){
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public QueryBuilder updateTimeGreaterEqThan(java.time.LocalDateTime updateTimeSt){
            this.updateTimeSt = updateTimeSt;
            return this;
        }
        public QueryBuilder updateTimeLessEqThan(java.time.LocalDateTime updateTimeEd){
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public QueryBuilder updateTime(java.time.LocalDateTime updateTime){
            setUpdateTime(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(java.time.LocalDateTime ... updateTime){
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public QueryBuilder updateTimeList(List<java.time.LocalDateTime> updateTime){
            this.updateTimeList = updateTime;
            return this;
        }

        public QueryBuilder fetchUpdateTime(){
            setFetchFields("fetchFields","updateTime");
            return this;
        }

        public QueryBuilder excludeUpdateTime(){
            setFetchFields("excludeFields","updateTime");
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

        public ProxyPermission build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<String> permissionNameList;

        public List<String> getPermissionNameList(){return this.permissionNameList;}


        private List<String> fuzzyPermissionName;

        public List<String> getFuzzyPermissionName(){return this.fuzzyPermissionName;}

        private List<String> rightFuzzyPermissionName;

        public List<String> getRightFuzzyPermissionName(){return this.rightFuzzyPermissionName;}
        private List<String> addUidList;

        public List<String> getAddUidList(){return this.addUidList;}


        private List<String> fuzzyAddUid;

        public List<String> getFuzzyAddUid(){return this.fuzzyAddUid;}

        private List<String> rightFuzzyAddUid;

        public List<String> getRightFuzzyAddUid(){return this.rightFuzzyAddUid;}
        private List<java.time.LocalDateTime> addTimeList;

        public List<java.time.LocalDateTime> getAddTimeList(){return this.addTimeList;}

        private java.time.LocalDateTime addTimeSt;

        private java.time.LocalDateTime addTimeEd;

        public java.time.LocalDateTime getAddTimeSt(){return this.addTimeSt;}

        public java.time.LocalDateTime getAddTimeEd(){return this.addTimeEd;}

        private List<String> updateUidList;

        public List<String> getUpdateUidList(){return this.updateUidList;}


        private List<String> fuzzyUpdateUid;

        public List<String> getFuzzyUpdateUid(){return this.fuzzyUpdateUid;}

        private List<String> rightFuzzyUpdateUid;

        public List<String> getRightFuzzyUpdateUid(){return this.rightFuzzyUpdateUid;}
        private List<java.time.LocalDateTime> updateTimeList;

        public List<java.time.LocalDateTime> getUpdateTimeList(){return this.updateTimeList;}

        private java.time.LocalDateTime updateTimeSt;

        private java.time.LocalDateTime updateTimeEd;

        public java.time.LocalDateTime getUpdateTimeSt(){return this.updateTimeSt;}

        public java.time.LocalDateTime getUpdateTimeEd(){return this.updateTimeEd;}


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

        public ConditionBuilder fuzzyPermissionName (List<String> fuzzyPermissionName){
            this.fuzzyPermissionName = fuzzyPermissionName;
            return this;
        }

        public ConditionBuilder fuzzyPermissionName (String ... fuzzyPermissionName){
            this.fuzzyPermissionName = solveNullList(fuzzyPermissionName);
            return this;
        }

        public ConditionBuilder rightFuzzyPermissionName (List<String> rightFuzzyPermissionName){
            this.rightFuzzyPermissionName = rightFuzzyPermissionName;
            return this;
        }

        public ConditionBuilder rightFuzzyPermissionName (String ... rightFuzzyPermissionName){
            this.rightFuzzyPermissionName = solveNullList(rightFuzzyPermissionName);
            return this;
        }

        public ConditionBuilder permissionNameList(String ... permissionName){
            this.permissionNameList = solveNullList(permissionName);
            return this;
        }

        public ConditionBuilder permissionNameList(List<String> permissionName){
            this.permissionNameList = permissionName;
            return this;
        }

        public ConditionBuilder fuzzyAddUid (List<String> fuzzyAddUid){
            this.fuzzyAddUid = fuzzyAddUid;
            return this;
        }

        public ConditionBuilder fuzzyAddUid (String ... fuzzyAddUid){
            this.fuzzyAddUid = solveNullList(fuzzyAddUid);
            return this;
        }

        public ConditionBuilder rightFuzzyAddUid (List<String> rightFuzzyAddUid){
            this.rightFuzzyAddUid = rightFuzzyAddUid;
            return this;
        }

        public ConditionBuilder rightFuzzyAddUid (String ... rightFuzzyAddUid){
            this.rightFuzzyAddUid = solveNullList(rightFuzzyAddUid);
            return this;
        }

        public ConditionBuilder addUidList(String ... addUid){
            this.addUidList = solveNullList(addUid);
            return this;
        }

        public ConditionBuilder addUidList(List<String> addUid){
            this.addUidList = addUid;
            return this;
        }

        public ConditionBuilder addTimeBetWeen(java.time.LocalDateTime addTimeSt,java.time.LocalDateTime addTimeEd){
            this.addTimeSt = addTimeSt;
            this.addTimeEd = addTimeEd;
            return this;
        }

        public ConditionBuilder addTimeGreaterEqThan(java.time.LocalDateTime addTimeSt){
            this.addTimeSt = addTimeSt;
            return this;
        }
        public ConditionBuilder addTimeLessEqThan(java.time.LocalDateTime addTimeEd){
            this.addTimeEd = addTimeEd;
            return this;
        }


        public ConditionBuilder addTimeList(java.time.LocalDateTime ... addTime){
            this.addTimeList = solveNullList(addTime);
            return this;
        }

        public ConditionBuilder addTimeList(List<java.time.LocalDateTime> addTime){
            this.addTimeList = addTime;
            return this;
        }

        public ConditionBuilder fuzzyUpdateUid (List<String> fuzzyUpdateUid){
            this.fuzzyUpdateUid = fuzzyUpdateUid;
            return this;
        }

        public ConditionBuilder fuzzyUpdateUid (String ... fuzzyUpdateUid){
            this.fuzzyUpdateUid = solveNullList(fuzzyUpdateUid);
            return this;
        }

        public ConditionBuilder rightFuzzyUpdateUid (List<String> rightFuzzyUpdateUid){
            this.rightFuzzyUpdateUid = rightFuzzyUpdateUid;
            return this;
        }

        public ConditionBuilder rightFuzzyUpdateUid (String ... rightFuzzyUpdateUid){
            this.rightFuzzyUpdateUid = solveNullList(rightFuzzyUpdateUid);
            return this;
        }

        public ConditionBuilder updateUidList(String ... updateUid){
            this.updateUidList = solveNullList(updateUid);
            return this;
        }

        public ConditionBuilder updateUidList(List<String> updateUid){
            this.updateUidList = updateUid;
            return this;
        }

        public ConditionBuilder updateTimeBetWeen(java.time.LocalDateTime updateTimeSt,java.time.LocalDateTime updateTimeEd){
            this.updateTimeSt = updateTimeSt;
            this.updateTimeEd = updateTimeEd;
            return this;
        }

        public ConditionBuilder updateTimeGreaterEqThan(java.time.LocalDateTime updateTimeSt){
            this.updateTimeSt = updateTimeSt;
            return this;
        }
        public ConditionBuilder updateTimeLessEqThan(java.time.LocalDateTime updateTimeEd){
            this.updateTimeEd = updateTimeEd;
            return this;
        }


        public ConditionBuilder updateTimeList(java.time.LocalDateTime ... updateTime){
            this.updateTimeList = solveNullList(updateTime);
            return this;
        }

        public ConditionBuilder updateTimeList(List<java.time.LocalDateTime> updateTime){
            this.updateTimeList = updateTime;
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

        private ProxyPermission obj;

        public Builder(){
            this.obj = new ProxyPermission();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder permissionName(String permissionName){
            this.obj.setPermissionName(permissionName);
            return this;
        }
        public Builder addUid(String addUid){
            this.obj.setAddUid(addUid);
            return this;
        }
        public Builder addTime(java.time.LocalDateTime addTime){
            this.obj.setAddTime(addTime);
            return this;
        }
        public Builder updateUid(String updateUid){
            this.obj.setUpdateUid(updateUid);
            return this;
        }
        public Builder updateTime(java.time.LocalDateTime updateTime){
            this.obj.setUpdateTime(updateTime);
            return this;
        }
        public ProxyPermission build(){return obj;}
    }

}
