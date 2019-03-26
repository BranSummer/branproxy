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
public class RoleResourceModel implements Serializable {

    private static final long serialVersionUID = 1552819764022L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long id;

    /**
    * 
    * isNullAble:0
    */
    private Long roleId;

    /**
    * 
    * isNullAble:0
    */
    private Long resourceId;

    /**
    * 0未删，1已删
    * isNullAble:0,defaultVal:0
    */
    private Integer isDelete;

    /**
    * 
    * isNullAble:0
    */
    private Long updateUid;

    /**
    * 
    * isNullAble:0,defaultVal:0000-00-00 00:00:00
    */
    private java.time.LocalDateTime lastUpdateTime;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setRoleId(Long roleId){this.roleId = roleId;}

    public Long getRoleId(){return this.roleId;}

    public void setResourceId(Long resourceId){this.resourceId = resourceId;}

    public Long getResourceId(){return this.resourceId;}

    public void setIsDelete(Integer isDelete){this.isDelete = isDelete;}

    public Integer getIsDelete(){return this.isDelete;}

    public void setUpdateUid(Long  updateUid){this. updateUid =  updateUid;}

    public Long getUpdateUid(){return this. updateUid;}

    public void setLastUpdateTime(java.time.LocalDateTime lastUpdateTime){this.lastUpdateTime = lastUpdateTime;}

    public java.time.LocalDateTime getLastUpdateTime(){return this.lastUpdateTime;}
    @Override
    public String toString() {
        return "RoleResourceModel{" +
                "id='" + id + '\'' +
                "roleId='" + roleId + '\'' +
                "resourceId='" + resourceId + '\'' +
                "isDelete='" + isDelete + '\'' +
                " updateUid='" +  updateUid + '\'' +
                "lastUpdateTime='" + lastUpdateTime + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private RoleResourceModel set;

        private ConditionBuilder where;

        public UpdateBuilder set(RoleResourceModel set){
            this.set = set;
            return this;
        }

        public RoleResourceModel getSet(){
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

    public static class QueryBuilder extends RoleResourceModel{
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

        private List<Long> roleIdList;

        public List<Long> getRoleIdList(){return this.roleIdList;}

        private Long roleIdSt;

        private Long roleIdEd;

        public Long getRoleIdSt(){return this.roleIdSt;}

        public Long getRoleIdEd(){return this.roleIdEd;}

        private List<Long> resourceIdList;

        public List<Long> getResourceIdList(){return this.resourceIdList;}

        private Long resourceIdSt;

        private Long resourceIdEd;

        public Long getResourceIdSt(){return this.resourceIdSt;}

        public Long getResourceIdEd(){return this.resourceIdEd;}

        private List<Integer> isDeleteList;

        public List<Integer> getIsDeleteList(){return this.isDeleteList;}

        private Integer isDeleteSt;

        private Integer isDeleteEd;

        public Integer getIsDeleteSt(){return this.isDeleteSt;}

        public Integer getIsDeleteEd(){return this.isDeleteEd;}

        private List<Long>  updateUidList;

        public List<Long> getUpdateUidList(){return this. updateUidList;}

        private Long  updateUidSt;

        private Long  updateUidEd;

        public Long getUpdateUidSt(){return this. updateUidSt;}

        public Long getUpdateUidEd(){return this. updateUidEd;}

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

        public QueryBuilder roleIdBetWeen(Long roleIdSt,Long roleIdEd){
            this.roleIdSt = roleIdSt;
            this.roleIdEd = roleIdEd;
            return this;
        }

        public QueryBuilder roleIdGreaterEqThan(Long roleIdSt){
            this.roleIdSt = roleIdSt;
            return this;
        }
        public QueryBuilder roleIdLessEqThan(Long roleIdEd){
            this.roleIdEd = roleIdEd;
            return this;
        }


        public QueryBuilder roleId(Long roleId){
            setRoleId(roleId);
            return this;
        }

        public QueryBuilder roleIdList(Long ... roleId){
            this.roleIdList = solveNullList(roleId);
            return this;
        }

        public QueryBuilder roleIdList(List<Long> roleId){
            this.roleIdList = roleId;
            return this;
        }

        public QueryBuilder fetchRoleId(){
            setFetchFields("fetchFields","roleId");
            return this;
        }

        public QueryBuilder excludeRoleId(){
            setFetchFields("excludeFields","roleId");
            return this;
        }

        public QueryBuilder resourceIdBetWeen(Long resourceIdSt,Long resourceIdEd){
            this.resourceIdSt = resourceIdSt;
            this.resourceIdEd = resourceIdEd;
            return this;
        }

        public QueryBuilder resourceIdGreaterEqThan(Long resourceIdSt){
            this.resourceIdSt = resourceIdSt;
            return this;
        }
        public QueryBuilder resourceIdLessEqThan(Long resourceIdEd){
            this.resourceIdEd = resourceIdEd;
            return this;
        }


        public QueryBuilder resourceId(Long resourceId){
            setResourceId(resourceId);
            return this;
        }

        public QueryBuilder resourceIdList(Long ... resourceId){
            this.resourceIdList = solveNullList(resourceId);
            return this;
        }

        public QueryBuilder resourceIdList(List<Long> resourceId){
            this.resourceIdList = resourceId;
            return this;
        }

        public QueryBuilder fetchResourceId(){
            setFetchFields("fetchFields","resourceId");
            return this;
        }

        public QueryBuilder excludeResourceId(){
            setFetchFields("excludeFields","resourceId");
            return this;
        }

        public QueryBuilder isDeleteBetWeen(Integer isDeleteSt,Integer isDeleteEd){
            this.isDeleteSt = isDeleteSt;
            this.isDeleteEd = isDeleteEd;
            return this;
        }

        public QueryBuilder isDeleteGreaterEqThan(Integer isDeleteSt){
            this.isDeleteSt = isDeleteSt;
            return this;
        }
        public QueryBuilder isDeleteLessEqThan(Integer isDeleteEd){
            this.isDeleteEd = isDeleteEd;
            return this;
        }


        public QueryBuilder isDelete(Integer isDelete){
            setIsDelete(isDelete);
            return this;
        }

        public QueryBuilder isDeleteList(Integer ... isDelete){
            this.isDeleteList = solveNullList(isDelete);
            return this;
        }

        public QueryBuilder isDeleteList(List<Integer> isDelete){
            this.isDeleteList = isDelete;
            return this;
        }

        public QueryBuilder fetchIsDelete(){
            setFetchFields("fetchFields","isDelete");
            return this;
        }

        public QueryBuilder excludeIsDelete(){
            setFetchFields("excludeFields","isDelete");
            return this;
        }

        public QueryBuilder  updateUidBetWeen(Long  updateUidSt,Long  updateUidEd){
            this. updateUidSt =  updateUidSt;
            this. updateUidEd =  updateUidEd;
            return this;
        }

        public QueryBuilder  updateUidGreaterEqThan(Long  updateUidSt){
            this. updateUidSt =  updateUidSt;
            return this;
        }
        public QueryBuilder  updateUidLessEqThan(Long  updateUidEd){
            this. updateUidEd =  updateUidEd;
            return this;
        }


        public QueryBuilder  updateUid(Long  updateUid){
            setUpdateUid( updateUid);
            return this;
        }

        public QueryBuilder  updateUidList(Long ...  updateUid){
            this. updateUidList = solveNullList( updateUid);
            return this;
        }

        public QueryBuilder  updateUidList(List<Long>  updateUid){
            this. updateUidList =  updateUid;
            return this;
        }

        public QueryBuilder fetchUpdateUid(){
            setFetchFields("fetchFields"," updateUid");
            return this;
        }

        public QueryBuilder excludeUpdateUid(){
            setFetchFields("excludeFields"," updateUid");
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

        public RoleResourceModel build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<Long> roleIdList;

        public List<Long> getRoleIdList(){return this.roleIdList;}

        private Long roleIdSt;

        private Long roleIdEd;

        public Long getRoleIdSt(){return this.roleIdSt;}

        public Long getRoleIdEd(){return this.roleIdEd;}

        private List<Long> resourceIdList;

        public List<Long> getResourceIdList(){return this.resourceIdList;}

        private Long resourceIdSt;

        private Long resourceIdEd;

        public Long getResourceIdSt(){return this.resourceIdSt;}

        public Long getResourceIdEd(){return this.resourceIdEd;}

        private List<Integer> isDeleteList;

        public List<Integer> getIsDeleteList(){return this.isDeleteList;}

        private Integer isDeleteSt;

        private Integer isDeleteEd;

        public Integer getIsDeleteSt(){return this.isDeleteSt;}

        public Integer getIsDeleteEd(){return this.isDeleteEd;}

        private List<Long>  updateUidList;

        public List<Long> getUpdateUidList(){return this. updateUidList;}

        private Long  updateUidSt;

        private Long  updateUidEd;

        public Long getUpdateUidSt(){return this. updateUidSt;}

        public Long getUpdateUidEd(){return this. updateUidEd;}

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

        public ConditionBuilder roleIdBetWeen(Long roleIdSt,Long roleIdEd){
            this.roleIdSt = roleIdSt;
            this.roleIdEd = roleIdEd;
            return this;
        }

        public ConditionBuilder roleIdGreaterEqThan(Long roleIdSt){
            this.roleIdSt = roleIdSt;
            return this;
        }
        public ConditionBuilder roleIdLessEqThan(Long roleIdEd){
            this.roleIdEd = roleIdEd;
            return this;
        }


        public ConditionBuilder roleIdList(Long ... roleId){
            this.roleIdList = solveNullList(roleId);
            return this;
        }

        public ConditionBuilder roleIdList(List<Long> roleId){
            this.roleIdList = roleId;
            return this;
        }

        public ConditionBuilder resourceIdBetWeen(Long resourceIdSt,Long resourceIdEd){
            this.resourceIdSt = resourceIdSt;
            this.resourceIdEd = resourceIdEd;
            return this;
        }

        public ConditionBuilder resourceIdGreaterEqThan(Long resourceIdSt){
            this.resourceIdSt = resourceIdSt;
            return this;
        }
        public ConditionBuilder resourceIdLessEqThan(Long resourceIdEd){
            this.resourceIdEd = resourceIdEd;
            return this;
        }


        public ConditionBuilder resourceIdList(Long ... resourceId){
            this.resourceIdList = solveNullList(resourceId);
            return this;
        }

        public ConditionBuilder resourceIdList(List<Long> resourceId){
            this.resourceIdList = resourceId;
            return this;
        }

        public ConditionBuilder isDeleteBetWeen(Integer isDeleteSt,Integer isDeleteEd){
            this.isDeleteSt = isDeleteSt;
            this.isDeleteEd = isDeleteEd;
            return this;
        }

        public ConditionBuilder isDeleteGreaterEqThan(Integer isDeleteSt){
            this.isDeleteSt = isDeleteSt;
            return this;
        }
        public ConditionBuilder isDeleteLessEqThan(Integer isDeleteEd){
            this.isDeleteEd = isDeleteEd;
            return this;
        }


        public ConditionBuilder isDeleteList(Integer ... isDelete){
            this.isDeleteList = solveNullList(isDelete);
            return this;
        }

        public ConditionBuilder isDeleteList(List<Integer> isDelete){
            this.isDeleteList = isDelete;
            return this;
        }

        public ConditionBuilder  updateUidBetWeen(Long  updateUidSt,Long  updateUidEd){
            this. updateUidSt =  updateUidSt;
            this. updateUidEd =  updateUidEd;
            return this;
        }

        public ConditionBuilder  updateUidGreaterEqThan(Long  updateUidSt){
            this. updateUidSt =  updateUidSt;
            return this;
        }
        public ConditionBuilder  updateUidLessEqThan(Long  updateUidEd){
            this. updateUidEd =  updateUidEd;
            return this;
        }


        public ConditionBuilder  updateUidList(Long ...  updateUid){
            this. updateUidList = solveNullList( updateUid);
            return this;
        }

        public ConditionBuilder  updateUidList(List<Long>  updateUid){
            this. updateUidList =  updateUid;
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

        private RoleResourceModel obj;

        public Builder(){
            this.obj = new RoleResourceModel();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder roleId(Long roleId){
            this.obj.setRoleId(roleId);
            return this;
        }
        public Builder resourceId(Long resourceId){
            this.obj.setResourceId(resourceId);
            return this;
        }
        public Builder isDelete(Integer isDelete){
            this.obj.setIsDelete(isDelete);
            return this;
        }
        public Builder  updateUid(Long  updateUid){
            this.obj.setUpdateUid( updateUid);
            return this;
        }
        public Builder lastUpdateTime(java.time.LocalDateTime lastUpdateTime){
            this.obj.setLastUpdateTime(lastUpdateTime);
            return this;
        }
        public RoleResourceModel build(){return obj;}
    }

}
