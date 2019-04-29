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
public class QuartzTaskErrors implements Serializable {

    private static final long serialVersionUID = 1556519684265L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long id;

    /**
    * 任务执行记录Id
    * isNullAble:0
    */
    private String taskExecuteRecordId;

    /**
    * 信息关键字
    * isNullAble:0
    */
    private String errorKey;

    /**
    * 信息内容
    * isNullAble:1
    */
    private String errorValue;

    /**
    * 创建时间
    * isNullAble:1
    */
    private java.time.LocalDateTime createTime;

    /**
    * 最近修改时间
    * isNullAble:0,defaultVal:CURRENT_TIMESTAMP
    */
    private java.time.LocalDateTime lastModifyTime;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setTaskExecuteRecordId(String taskExecuteRecordId){this.taskExecuteRecordId = taskExecuteRecordId;}

    public String getTaskExecuteRecordId(){return this.taskExecuteRecordId;}

    public void setErrorKey(String errorKey){this.errorKey = errorKey;}

    public String getErrorKey(){return this.errorKey;}

    public void setErrorValue(String errorValue){this.errorValue = errorValue;}

    public String getErrorValue(){return this.errorValue;}

    public void setCreateTime(java.time.LocalDateTime createTime){this.createTime = createTime;}

    public java.time.LocalDateTime getCreateTime(){return this.createTime;}

    public void setLastModifyTime(java.time.LocalDateTime lastModifyTime){this.lastModifyTime = lastModifyTime;}

    public java.time.LocalDateTime getLastModifyTime(){return this.lastModifyTime;}
    @Override
    public String toString() {
        return "QuartzTaskErrors{" +
                "id='" + id + '\'' +
                "taskExecuteRecordId='" + taskExecuteRecordId + '\'' +
                "errorKey='" + errorKey + '\'' +
                "errorValue='" + errorValue + '\'' +
                "createTime='" + createTime + '\'' +
                "lastModifyTime='" + lastModifyTime + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private QuartzTaskErrors set;

        private ConditionBuilder where;

        public UpdateBuilder set(QuartzTaskErrors set){
            this.set = set;
            return this;
        }

        public QuartzTaskErrors getSet(){
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

    public static class QueryBuilder extends QuartzTaskErrors{
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

        private List<String> taskExecuteRecordIdList;

        public List<String> getTaskExecuteRecordIdList(){return this.taskExecuteRecordIdList;}


        private List<String> fuzzyTaskExecuteRecordId;

        public List<String> getFuzzyTaskExecuteRecordId(){return this.fuzzyTaskExecuteRecordId;}

        private List<String> rightFuzzyTaskExecuteRecordId;

        public List<String> getRightFuzzyTaskExecuteRecordId(){return this.rightFuzzyTaskExecuteRecordId;}
        private List<String> errorKeyList;

        public List<String> getErrorKeyList(){return this.errorKeyList;}


        private List<String> fuzzyErrorKey;

        public List<String> getFuzzyErrorKey(){return this.fuzzyErrorKey;}

        private List<String> rightFuzzyErrorKey;

        public List<String> getRightFuzzyErrorKey(){return this.rightFuzzyErrorKey;}
        private List<String> errorValueList;

        public List<String> getErrorValueList(){return this.errorValueList;}


        private List<String> fuzzyErrorValue;

        public List<String> getFuzzyErrorValue(){return this.fuzzyErrorValue;}

        private List<String> rightFuzzyErrorValue;

        public List<String> getRightFuzzyErrorValue(){return this.rightFuzzyErrorValue;}
        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<java.time.LocalDateTime> lastModifyTimeList;

        public List<java.time.LocalDateTime> getLastModifyTimeList(){return this.lastModifyTimeList;}

        private java.time.LocalDateTime lastModifyTimeSt;

        private java.time.LocalDateTime lastModifyTimeEd;

        public java.time.LocalDateTime getLastModifyTimeSt(){return this.lastModifyTimeSt;}

        public java.time.LocalDateTime getLastModifyTimeEd(){return this.lastModifyTimeEd;}

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

        public QueryBuilder fuzzyTaskExecuteRecordId (List<String> fuzzyTaskExecuteRecordId){
            this.fuzzyTaskExecuteRecordId = fuzzyTaskExecuteRecordId;
            return this;
        }

        public QueryBuilder fuzzyTaskExecuteRecordId (String ... fuzzyTaskExecuteRecordId){
            this.fuzzyTaskExecuteRecordId = solveNullList(fuzzyTaskExecuteRecordId);
            return this;
        }

        public QueryBuilder rightFuzzyTaskExecuteRecordId (List<String> rightFuzzyTaskExecuteRecordId){
            this.rightFuzzyTaskExecuteRecordId = rightFuzzyTaskExecuteRecordId;
            return this;
        }

        public QueryBuilder rightFuzzyTaskExecuteRecordId (String ... rightFuzzyTaskExecuteRecordId){
            this.rightFuzzyTaskExecuteRecordId = solveNullList(rightFuzzyTaskExecuteRecordId);
            return this;
        }

        public QueryBuilder taskExecuteRecordId(String taskExecuteRecordId){
            setTaskExecuteRecordId(taskExecuteRecordId);
            return this;
        }

        public QueryBuilder taskExecuteRecordIdList(String ... taskExecuteRecordId){
            this.taskExecuteRecordIdList = solveNullList(taskExecuteRecordId);
            return this;
        }

        public QueryBuilder taskExecuteRecordIdList(List<String> taskExecuteRecordId){
            this.taskExecuteRecordIdList = taskExecuteRecordId;
            return this;
        }

        public QueryBuilder fetchTaskExecuteRecordId(){
            setFetchFields("fetchFields","taskExecuteRecordId");
            return this;
        }

        public QueryBuilder excludeTaskExecuteRecordId(){
            setFetchFields("excludeFields","taskExecuteRecordId");
            return this;
        }

        public QueryBuilder fuzzyErrorKey (List<String> fuzzyErrorKey){
            this.fuzzyErrorKey = fuzzyErrorKey;
            return this;
        }

        public QueryBuilder fuzzyErrorKey (String ... fuzzyErrorKey){
            this.fuzzyErrorKey = solveNullList(fuzzyErrorKey);
            return this;
        }

        public QueryBuilder rightFuzzyErrorKey (List<String> rightFuzzyErrorKey){
            this.rightFuzzyErrorKey = rightFuzzyErrorKey;
            return this;
        }

        public QueryBuilder rightFuzzyErrorKey (String ... rightFuzzyErrorKey){
            this.rightFuzzyErrorKey = solveNullList(rightFuzzyErrorKey);
            return this;
        }

        public QueryBuilder errorKey(String errorKey){
            setErrorKey(errorKey);
            return this;
        }

        public QueryBuilder errorKeyList(String ... errorKey){
            this.errorKeyList = solveNullList(errorKey);
            return this;
        }

        public QueryBuilder errorKeyList(List<String> errorKey){
            this.errorKeyList = errorKey;
            return this;
        }

        public QueryBuilder fetchErrorKey(){
            setFetchFields("fetchFields","errorKey");
            return this;
        }

        public QueryBuilder excludeErrorKey(){
            setFetchFields("excludeFields","errorKey");
            return this;
        }

        public QueryBuilder fuzzyErrorValue (List<String> fuzzyErrorValue){
            this.fuzzyErrorValue = fuzzyErrorValue;
            return this;
        }

        public QueryBuilder fuzzyErrorValue (String ... fuzzyErrorValue){
            this.fuzzyErrorValue = solveNullList(fuzzyErrorValue);
            return this;
        }

        public QueryBuilder rightFuzzyErrorValue (List<String> rightFuzzyErrorValue){
            this.rightFuzzyErrorValue = rightFuzzyErrorValue;
            return this;
        }

        public QueryBuilder rightFuzzyErrorValue (String ... rightFuzzyErrorValue){
            this.rightFuzzyErrorValue = solveNullList(rightFuzzyErrorValue);
            return this;
        }

        public QueryBuilder errorValue(String errorValue){
            setErrorValue(errorValue);
            return this;
        }

        public QueryBuilder errorValueList(String ... errorValue){
            this.errorValueList = solveNullList(errorValue);
            return this;
        }

        public QueryBuilder errorValueList(List<String> errorValue){
            this.errorValueList = errorValue;
            return this;
        }

        public QueryBuilder fetchErrorValue(){
            setFetchFields("fetchFields","errorValue");
            return this;
        }

        public QueryBuilder excludeErrorValue(){
            setFetchFields("excludeFields","errorValue");
            return this;
        }

        public QueryBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public QueryBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public QueryBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public QueryBuilder createTime(java.time.LocalDateTime createTime){
            setCreateTime(createTime);
            return this;
        }

        public QueryBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public QueryBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public QueryBuilder fetchCreateTime(){
            setFetchFields("fetchFields","createTime");
            return this;
        }

        public QueryBuilder excludeCreateTime(){
            setFetchFields("excludeFields","createTime");
            return this;
        }

        public QueryBuilder lastModifyTimeBetWeen(java.time.LocalDateTime lastModifyTimeSt,java.time.LocalDateTime lastModifyTimeEd){
            this.lastModifyTimeSt = lastModifyTimeSt;
            this.lastModifyTimeEd = lastModifyTimeEd;
            return this;
        }

        public QueryBuilder lastModifyTimeGreaterEqThan(java.time.LocalDateTime lastModifyTimeSt){
            this.lastModifyTimeSt = lastModifyTimeSt;
            return this;
        }
        public QueryBuilder lastModifyTimeLessEqThan(java.time.LocalDateTime lastModifyTimeEd){
            this.lastModifyTimeEd = lastModifyTimeEd;
            return this;
        }


        public QueryBuilder lastModifyTime(java.time.LocalDateTime lastModifyTime){
            setLastModifyTime(lastModifyTime);
            return this;
        }

        public QueryBuilder lastModifyTimeList(java.time.LocalDateTime ... lastModifyTime){
            this.lastModifyTimeList = solveNullList(lastModifyTime);
            return this;
        }

        public QueryBuilder lastModifyTimeList(List<java.time.LocalDateTime> lastModifyTime){
            this.lastModifyTimeList = lastModifyTime;
            return this;
        }

        public QueryBuilder fetchLastModifyTime(){
            setFetchFields("fetchFields","lastModifyTime");
            return this;
        }

        public QueryBuilder excludeLastModifyTime(){
            setFetchFields("excludeFields","lastModifyTime");
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

        public QuartzTaskErrors build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<String> taskExecuteRecordIdList;

        public List<String> getTaskExecuteRecordIdList(){return this.taskExecuteRecordIdList;}


        private List<String> fuzzyTaskExecuteRecordId;

        public List<String> getFuzzyTaskExecuteRecordId(){return this.fuzzyTaskExecuteRecordId;}

        private List<String> rightFuzzyTaskExecuteRecordId;

        public List<String> getRightFuzzyTaskExecuteRecordId(){return this.rightFuzzyTaskExecuteRecordId;}
        private List<String> errorKeyList;

        public List<String> getErrorKeyList(){return this.errorKeyList;}


        private List<String> fuzzyErrorKey;

        public List<String> getFuzzyErrorKey(){return this.fuzzyErrorKey;}

        private List<String> rightFuzzyErrorKey;

        public List<String> getRightFuzzyErrorKey(){return this.rightFuzzyErrorKey;}
        private List<String> errorValueList;

        public List<String> getErrorValueList(){return this.errorValueList;}


        private List<String> fuzzyErrorValue;

        public List<String> getFuzzyErrorValue(){return this.fuzzyErrorValue;}

        private List<String> rightFuzzyErrorValue;

        public List<String> getRightFuzzyErrorValue(){return this.rightFuzzyErrorValue;}
        private List<java.time.LocalDateTime> createTimeList;

        public List<java.time.LocalDateTime> getCreateTimeList(){return this.createTimeList;}

        private java.time.LocalDateTime createTimeSt;

        private java.time.LocalDateTime createTimeEd;

        public java.time.LocalDateTime getCreateTimeSt(){return this.createTimeSt;}

        public java.time.LocalDateTime getCreateTimeEd(){return this.createTimeEd;}

        private List<java.time.LocalDateTime> lastModifyTimeList;

        public List<java.time.LocalDateTime> getLastModifyTimeList(){return this.lastModifyTimeList;}

        private java.time.LocalDateTime lastModifyTimeSt;

        private java.time.LocalDateTime lastModifyTimeEd;

        public java.time.LocalDateTime getLastModifyTimeSt(){return this.lastModifyTimeSt;}

        public java.time.LocalDateTime getLastModifyTimeEd(){return this.lastModifyTimeEd;}


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

        public ConditionBuilder fuzzyTaskExecuteRecordId (List<String> fuzzyTaskExecuteRecordId){
            this.fuzzyTaskExecuteRecordId = fuzzyTaskExecuteRecordId;
            return this;
        }

        public ConditionBuilder fuzzyTaskExecuteRecordId (String ... fuzzyTaskExecuteRecordId){
            this.fuzzyTaskExecuteRecordId = solveNullList(fuzzyTaskExecuteRecordId);
            return this;
        }

        public ConditionBuilder rightFuzzyTaskExecuteRecordId (List<String> rightFuzzyTaskExecuteRecordId){
            this.rightFuzzyTaskExecuteRecordId = rightFuzzyTaskExecuteRecordId;
            return this;
        }

        public ConditionBuilder rightFuzzyTaskExecuteRecordId (String ... rightFuzzyTaskExecuteRecordId){
            this.rightFuzzyTaskExecuteRecordId = solveNullList(rightFuzzyTaskExecuteRecordId);
            return this;
        }

        public ConditionBuilder taskExecuteRecordIdList(String ... taskExecuteRecordId){
            this.taskExecuteRecordIdList = solveNullList(taskExecuteRecordId);
            return this;
        }

        public ConditionBuilder taskExecuteRecordIdList(List<String> taskExecuteRecordId){
            this.taskExecuteRecordIdList = taskExecuteRecordId;
            return this;
        }

        public ConditionBuilder fuzzyErrorKey (List<String> fuzzyErrorKey){
            this.fuzzyErrorKey = fuzzyErrorKey;
            return this;
        }

        public ConditionBuilder fuzzyErrorKey (String ... fuzzyErrorKey){
            this.fuzzyErrorKey = solveNullList(fuzzyErrorKey);
            return this;
        }

        public ConditionBuilder rightFuzzyErrorKey (List<String> rightFuzzyErrorKey){
            this.rightFuzzyErrorKey = rightFuzzyErrorKey;
            return this;
        }

        public ConditionBuilder rightFuzzyErrorKey (String ... rightFuzzyErrorKey){
            this.rightFuzzyErrorKey = solveNullList(rightFuzzyErrorKey);
            return this;
        }

        public ConditionBuilder errorKeyList(String ... errorKey){
            this.errorKeyList = solveNullList(errorKey);
            return this;
        }

        public ConditionBuilder errorKeyList(List<String> errorKey){
            this.errorKeyList = errorKey;
            return this;
        }

        public ConditionBuilder fuzzyErrorValue (List<String> fuzzyErrorValue){
            this.fuzzyErrorValue = fuzzyErrorValue;
            return this;
        }

        public ConditionBuilder fuzzyErrorValue (String ... fuzzyErrorValue){
            this.fuzzyErrorValue = solveNullList(fuzzyErrorValue);
            return this;
        }

        public ConditionBuilder rightFuzzyErrorValue (List<String> rightFuzzyErrorValue){
            this.rightFuzzyErrorValue = rightFuzzyErrorValue;
            return this;
        }

        public ConditionBuilder rightFuzzyErrorValue (String ... rightFuzzyErrorValue){
            this.rightFuzzyErrorValue = solveNullList(rightFuzzyErrorValue);
            return this;
        }

        public ConditionBuilder errorValueList(String ... errorValue){
            this.errorValueList = solveNullList(errorValue);
            return this;
        }

        public ConditionBuilder errorValueList(List<String> errorValue){
            this.errorValueList = errorValue;
            return this;
        }

        public ConditionBuilder createTimeBetWeen(java.time.LocalDateTime createTimeSt,java.time.LocalDateTime createTimeEd){
            this.createTimeSt = createTimeSt;
            this.createTimeEd = createTimeEd;
            return this;
        }

        public ConditionBuilder createTimeGreaterEqThan(java.time.LocalDateTime createTimeSt){
            this.createTimeSt = createTimeSt;
            return this;
        }
        public ConditionBuilder createTimeLessEqThan(java.time.LocalDateTime createTimeEd){
            this.createTimeEd = createTimeEd;
            return this;
        }


        public ConditionBuilder createTimeList(java.time.LocalDateTime ... createTime){
            this.createTimeList = solveNullList(createTime);
            return this;
        }

        public ConditionBuilder createTimeList(List<java.time.LocalDateTime> createTime){
            this.createTimeList = createTime;
            return this;
        }

        public ConditionBuilder lastModifyTimeBetWeen(java.time.LocalDateTime lastModifyTimeSt,java.time.LocalDateTime lastModifyTimeEd){
            this.lastModifyTimeSt = lastModifyTimeSt;
            this.lastModifyTimeEd = lastModifyTimeEd;
            return this;
        }

        public ConditionBuilder lastModifyTimeGreaterEqThan(java.time.LocalDateTime lastModifyTimeSt){
            this.lastModifyTimeSt = lastModifyTimeSt;
            return this;
        }
        public ConditionBuilder lastModifyTimeLessEqThan(java.time.LocalDateTime lastModifyTimeEd){
            this.lastModifyTimeEd = lastModifyTimeEd;
            return this;
        }


        public ConditionBuilder lastModifyTimeList(java.time.LocalDateTime ... lastModifyTime){
            this.lastModifyTimeList = solveNullList(lastModifyTime);
            return this;
        }

        public ConditionBuilder lastModifyTimeList(List<java.time.LocalDateTime> lastModifyTime){
            this.lastModifyTimeList = lastModifyTime;
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

        private QuartzTaskErrors obj;

        public Builder(){
            this.obj = new QuartzTaskErrors();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder taskExecuteRecordId(String taskExecuteRecordId){
            this.obj.setTaskExecuteRecordId(taskExecuteRecordId);
            return this;
        }
        public Builder errorKey(String errorKey){
            this.obj.setErrorKey(errorKey);
            return this;
        }
        public Builder errorValue(String errorValue){
            this.obj.setErrorValue(errorValue);
            return this;
        }
        public Builder createTime(java.time.LocalDateTime createTime){
            this.obj.setCreateTime(createTime);
            return this;
        }
        public Builder lastModifyTime(java.time.LocalDateTime lastModifyTime){
            this.obj.setLastModifyTime(lastModifyTime);
            return this;
        }
        public QuartzTaskErrors build(){return obj;}
    }

}
