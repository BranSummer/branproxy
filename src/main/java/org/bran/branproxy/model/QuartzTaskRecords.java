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
public class QuartzTaskRecords implements Serializable {

    private static final long serialVersionUID = 1556519688753L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long id;

    /**
    * 任务编号
    * isNullAble:0
    */
    private String taskNo;

    /**
    * 执行时间格式值
    * isNullAble:1
    */
    private String timeKeyValue;

    /**
    * 执行时间
    * isNullAble:0
    */
    private Long executeTime;

    /**
    * 任务状态
    * isNullAble:0
    */
    private String taskStatus;

    /**
    * 失败统计数
    * isNullAble:1
    */
    private Integer failcount;

    /**
    * 失败错误描述
    * isNullAble:1
    */
    private String failReason;

    /**
    * 创建时间
    * isNullAble:1
    */
    private java.time.LocalDateTime createTime;

    /**
    * 最近修改时间
    * isNullAble:1
    */
    private java.time.LocalDateTime lastModifyTime;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setTaskNo(String taskNo){this.taskNo = taskNo;}

    public String getTaskNo(){return this.taskNo;}

    public void setTimeKeyValue(String timeKeyValue){this.timeKeyValue = timeKeyValue;}

    public String getTimeKeyValue(){return this.timeKeyValue;}

    public void setExecuteTime(Long executeTime){this.executeTime = executeTime;}

    public Long getExecuteTime(){return this.executeTime;}

    public void setTaskStatus(String taskStatus){this.taskStatus = taskStatus;}

    public String getTaskStatus(){return this.taskStatus;}

    public void setFailcount(Integer failcount){this.failcount = failcount;}

    public Integer getFailcount(){return this.failcount;}

    public void setFailReason(String failReason){this.failReason = failReason;}

    public String getFailReason(){return this.failReason;}

    public void setCreateTime(java.time.LocalDateTime createTime){this.createTime = createTime;}

    public java.time.LocalDateTime getCreateTime(){return this.createTime;}

    public void setLastModifyTime(java.time.LocalDateTime lastModifyTime){this.lastModifyTime = lastModifyTime;}

    public java.time.LocalDateTime getLastModifyTime(){return this.lastModifyTime;}
    @Override
    public String toString() {
        return "QuartzTaskRecords{" +
                "id='" + id + '\'' +
                "taskNo='" + taskNo + '\'' +
                "timeKeyValue='" + timeKeyValue + '\'' +
                "executeTime='" + executeTime + '\'' +
                "taskStatus='" + taskStatus + '\'' +
                "failcount='" + failcount + '\'' +
                "failReason='" + failReason + '\'' +
                "createTime='" + createTime + '\'' +
                "lastModifyTime='" + lastModifyTime + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private QuartzTaskRecords set;

        private ConditionBuilder where;

        public UpdateBuilder set(QuartzTaskRecords set){
            this.set = set;
            return this;
        }

        public QuartzTaskRecords getSet(){
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

    public static class QueryBuilder extends QuartzTaskRecords{
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

        private List<String> taskNoList;

        public List<String> getTaskNoList(){return this.taskNoList;}


        private List<String> fuzzyTaskNo;

        public List<String> getFuzzyTaskNo(){return this.fuzzyTaskNo;}

        private List<String> rightFuzzyTaskNo;

        public List<String> getRightFuzzyTaskNo(){return this.rightFuzzyTaskNo;}
        private List<String> timeKeyValueList;

        public List<String> getTimeKeyValueList(){return this.timeKeyValueList;}


        private List<String> fuzzyTimeKeyValue;

        public List<String> getFuzzyTimeKeyValue(){return this.fuzzyTimeKeyValue;}

        private List<String> rightFuzzyTimeKeyValue;

        public List<String> getRightFuzzyTimeKeyValue(){return this.rightFuzzyTimeKeyValue;}
        private List<Long> executeTimeList;

        public List<Long> getExecuteTimeList(){return this.executeTimeList;}

        private Long executeTimeSt;

        private Long executeTimeEd;

        public Long getExecuteTimeSt(){return this.executeTimeSt;}

        public Long getExecuteTimeEd(){return this.executeTimeEd;}

        private List<String> taskStatusList;

        public List<String> getTaskStatusList(){return this.taskStatusList;}


        private List<String> fuzzyTaskStatus;

        public List<String> getFuzzyTaskStatus(){return this.fuzzyTaskStatus;}

        private List<String> rightFuzzyTaskStatus;

        public List<String> getRightFuzzyTaskStatus(){return this.rightFuzzyTaskStatus;}
        private List<Integer> failcountList;

        public List<Integer> getFailcountList(){return this.failcountList;}

        private Integer failcountSt;

        private Integer failcountEd;

        public Integer getFailcountSt(){return this.failcountSt;}

        public Integer getFailcountEd(){return this.failcountEd;}

        private List<String> failReasonList;

        public List<String> getFailReasonList(){return this.failReasonList;}


        private List<String> fuzzyFailReason;

        public List<String> getFuzzyFailReason(){return this.fuzzyFailReason;}

        private List<String> rightFuzzyFailReason;

        public List<String> getRightFuzzyFailReason(){return this.rightFuzzyFailReason;}
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

        public QueryBuilder fuzzyTaskNo (List<String> fuzzyTaskNo){
            this.fuzzyTaskNo = fuzzyTaskNo;
            return this;
        }

        public QueryBuilder fuzzyTaskNo (String ... fuzzyTaskNo){
            this.fuzzyTaskNo = solveNullList(fuzzyTaskNo);
            return this;
        }

        public QueryBuilder rightFuzzyTaskNo (List<String> rightFuzzyTaskNo){
            this.rightFuzzyTaskNo = rightFuzzyTaskNo;
            return this;
        }

        public QueryBuilder rightFuzzyTaskNo (String ... rightFuzzyTaskNo){
            this.rightFuzzyTaskNo = solveNullList(rightFuzzyTaskNo);
            return this;
        }

        public QueryBuilder taskNo(String taskNo){
            setTaskNo(taskNo);
            return this;
        }

        public QueryBuilder taskNoList(String ... taskNo){
            this.taskNoList = solveNullList(taskNo);
            return this;
        }

        public QueryBuilder taskNoList(List<String> taskNo){
            this.taskNoList = taskNo;
            return this;
        }

        public QueryBuilder fetchTaskNo(){
            setFetchFields("fetchFields","taskNo");
            return this;
        }

        public QueryBuilder excludeTaskNo(){
            setFetchFields("excludeFields","taskNo");
            return this;
        }

        public QueryBuilder fuzzyTimeKeyValue (List<String> fuzzyTimeKeyValue){
            this.fuzzyTimeKeyValue = fuzzyTimeKeyValue;
            return this;
        }

        public QueryBuilder fuzzyTimeKeyValue (String ... fuzzyTimeKeyValue){
            this.fuzzyTimeKeyValue = solveNullList(fuzzyTimeKeyValue);
            return this;
        }

        public QueryBuilder rightFuzzyTimeKeyValue (List<String> rightFuzzyTimeKeyValue){
            this.rightFuzzyTimeKeyValue = rightFuzzyTimeKeyValue;
            return this;
        }

        public QueryBuilder rightFuzzyTimeKeyValue (String ... rightFuzzyTimeKeyValue){
            this.rightFuzzyTimeKeyValue = solveNullList(rightFuzzyTimeKeyValue);
            return this;
        }

        public QueryBuilder timeKeyValue(String timeKeyValue){
            setTimeKeyValue(timeKeyValue);
            return this;
        }

        public QueryBuilder timeKeyValueList(String ... timeKeyValue){
            this.timeKeyValueList = solveNullList(timeKeyValue);
            return this;
        }

        public QueryBuilder timeKeyValueList(List<String> timeKeyValue){
            this.timeKeyValueList = timeKeyValue;
            return this;
        }

        public QueryBuilder fetchTimeKeyValue(){
            setFetchFields("fetchFields","timeKeyValue");
            return this;
        }

        public QueryBuilder excludeTimeKeyValue(){
            setFetchFields("excludeFields","timeKeyValue");
            return this;
        }

        public QueryBuilder executeTimeBetWeen(Long executeTimeSt,Long executeTimeEd){
            this.executeTimeSt = executeTimeSt;
            this.executeTimeEd = executeTimeEd;
            return this;
        }

        public QueryBuilder executeTimeGreaterEqThan(Long executeTimeSt){
            this.executeTimeSt = executeTimeSt;
            return this;
        }
        public QueryBuilder executeTimeLessEqThan(Long executeTimeEd){
            this.executeTimeEd = executeTimeEd;
            return this;
        }


        public QueryBuilder executeTime(Long executeTime){
            setExecuteTime(executeTime);
            return this;
        }

        public QueryBuilder executeTimeList(Long ... executeTime){
            this.executeTimeList = solveNullList(executeTime);
            return this;
        }

        public QueryBuilder executeTimeList(List<Long> executeTime){
            this.executeTimeList = executeTime;
            return this;
        }

        public QueryBuilder fetchExecuteTime(){
            setFetchFields("fetchFields","executeTime");
            return this;
        }

        public QueryBuilder excludeExecuteTime(){
            setFetchFields("excludeFields","executeTime");
            return this;
        }

        public QueryBuilder fuzzyTaskStatus (List<String> fuzzyTaskStatus){
            this.fuzzyTaskStatus = fuzzyTaskStatus;
            return this;
        }

        public QueryBuilder fuzzyTaskStatus (String ... fuzzyTaskStatus){
            this.fuzzyTaskStatus = solveNullList(fuzzyTaskStatus);
            return this;
        }

        public QueryBuilder rightFuzzyTaskStatus (List<String> rightFuzzyTaskStatus){
            this.rightFuzzyTaskStatus = rightFuzzyTaskStatus;
            return this;
        }

        public QueryBuilder rightFuzzyTaskStatus (String ... rightFuzzyTaskStatus){
            this.rightFuzzyTaskStatus = solveNullList(rightFuzzyTaskStatus);
            return this;
        }

        public QueryBuilder taskStatus(String taskStatus){
            setTaskStatus(taskStatus);
            return this;
        }

        public QueryBuilder taskStatusList(String ... taskStatus){
            this.taskStatusList = solveNullList(taskStatus);
            return this;
        }

        public QueryBuilder taskStatusList(List<String> taskStatus){
            this.taskStatusList = taskStatus;
            return this;
        }

        public QueryBuilder fetchTaskStatus(){
            setFetchFields("fetchFields","taskStatus");
            return this;
        }

        public QueryBuilder excludeTaskStatus(){
            setFetchFields("excludeFields","taskStatus");
            return this;
        }

        public QueryBuilder failcountBetWeen(Integer failcountSt,Integer failcountEd){
            this.failcountSt = failcountSt;
            this.failcountEd = failcountEd;
            return this;
        }

        public QueryBuilder failcountGreaterEqThan(Integer failcountSt){
            this.failcountSt = failcountSt;
            return this;
        }
        public QueryBuilder failcountLessEqThan(Integer failcountEd){
            this.failcountEd = failcountEd;
            return this;
        }


        public QueryBuilder failcount(Integer failcount){
            setFailcount(failcount);
            return this;
        }

        public QueryBuilder failcountList(Integer ... failcount){
            this.failcountList = solveNullList(failcount);
            return this;
        }

        public QueryBuilder failcountList(List<Integer> failcount){
            this.failcountList = failcount;
            return this;
        }

        public QueryBuilder fetchFailcount(){
            setFetchFields("fetchFields","failcount");
            return this;
        }

        public QueryBuilder excludeFailcount(){
            setFetchFields("excludeFields","failcount");
            return this;
        }

        public QueryBuilder fuzzyFailReason (List<String> fuzzyFailReason){
            this.fuzzyFailReason = fuzzyFailReason;
            return this;
        }

        public QueryBuilder fuzzyFailReason (String ... fuzzyFailReason){
            this.fuzzyFailReason = solveNullList(fuzzyFailReason);
            return this;
        }

        public QueryBuilder rightFuzzyFailReason (List<String> rightFuzzyFailReason){
            this.rightFuzzyFailReason = rightFuzzyFailReason;
            return this;
        }

        public QueryBuilder rightFuzzyFailReason (String ... rightFuzzyFailReason){
            this.rightFuzzyFailReason = solveNullList(rightFuzzyFailReason);
            return this;
        }

        public QueryBuilder failReason(String failReason){
            setFailReason(failReason);
            return this;
        }

        public QueryBuilder failReasonList(String ... failReason){
            this.failReasonList = solveNullList(failReason);
            return this;
        }

        public QueryBuilder failReasonList(List<String> failReason){
            this.failReasonList = failReason;
            return this;
        }

        public QueryBuilder fetchFailReason(){
            setFetchFields("fetchFields","failReason");
            return this;
        }

        public QueryBuilder excludeFailReason(){
            setFetchFields("excludeFields","failReason");
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

        public QuartzTaskRecords build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<String> taskNoList;

        public List<String> getTaskNoList(){return this.taskNoList;}


        private List<String> fuzzyTaskNo;

        public List<String> getFuzzyTaskNo(){return this.fuzzyTaskNo;}

        private List<String> rightFuzzyTaskNo;

        public List<String> getRightFuzzyTaskNo(){return this.rightFuzzyTaskNo;}
        private List<String> timeKeyValueList;

        public List<String> getTimeKeyValueList(){return this.timeKeyValueList;}


        private List<String> fuzzyTimeKeyValue;

        public List<String> getFuzzyTimeKeyValue(){return this.fuzzyTimeKeyValue;}

        private List<String> rightFuzzyTimeKeyValue;

        public List<String> getRightFuzzyTimeKeyValue(){return this.rightFuzzyTimeKeyValue;}
        private List<Long> executeTimeList;

        public List<Long> getExecuteTimeList(){return this.executeTimeList;}

        private Long executeTimeSt;

        private Long executeTimeEd;

        public Long getExecuteTimeSt(){return this.executeTimeSt;}

        public Long getExecuteTimeEd(){return this.executeTimeEd;}

        private List<String> taskStatusList;

        public List<String> getTaskStatusList(){return this.taskStatusList;}


        private List<String> fuzzyTaskStatus;

        public List<String> getFuzzyTaskStatus(){return this.fuzzyTaskStatus;}

        private List<String> rightFuzzyTaskStatus;

        public List<String> getRightFuzzyTaskStatus(){return this.rightFuzzyTaskStatus;}
        private List<Integer> failcountList;

        public List<Integer> getFailcountList(){return this.failcountList;}

        private Integer failcountSt;

        private Integer failcountEd;

        public Integer getFailcountSt(){return this.failcountSt;}

        public Integer getFailcountEd(){return this.failcountEd;}

        private List<String> failReasonList;

        public List<String> getFailReasonList(){return this.failReasonList;}


        private List<String> fuzzyFailReason;

        public List<String> getFuzzyFailReason(){return this.fuzzyFailReason;}

        private List<String> rightFuzzyFailReason;

        public List<String> getRightFuzzyFailReason(){return this.rightFuzzyFailReason;}
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

        public ConditionBuilder fuzzyTaskNo (List<String> fuzzyTaskNo){
            this.fuzzyTaskNo = fuzzyTaskNo;
            return this;
        }

        public ConditionBuilder fuzzyTaskNo (String ... fuzzyTaskNo){
            this.fuzzyTaskNo = solveNullList(fuzzyTaskNo);
            return this;
        }

        public ConditionBuilder rightFuzzyTaskNo (List<String> rightFuzzyTaskNo){
            this.rightFuzzyTaskNo = rightFuzzyTaskNo;
            return this;
        }

        public ConditionBuilder rightFuzzyTaskNo (String ... rightFuzzyTaskNo){
            this.rightFuzzyTaskNo = solveNullList(rightFuzzyTaskNo);
            return this;
        }

        public ConditionBuilder taskNoList(String ... taskNo){
            this.taskNoList = solveNullList(taskNo);
            return this;
        }

        public ConditionBuilder taskNoList(List<String> taskNo){
            this.taskNoList = taskNo;
            return this;
        }

        public ConditionBuilder fuzzyTimeKeyValue (List<String> fuzzyTimeKeyValue){
            this.fuzzyTimeKeyValue = fuzzyTimeKeyValue;
            return this;
        }

        public ConditionBuilder fuzzyTimeKeyValue (String ... fuzzyTimeKeyValue){
            this.fuzzyTimeKeyValue = solveNullList(fuzzyTimeKeyValue);
            return this;
        }

        public ConditionBuilder rightFuzzyTimeKeyValue (List<String> rightFuzzyTimeKeyValue){
            this.rightFuzzyTimeKeyValue = rightFuzzyTimeKeyValue;
            return this;
        }

        public ConditionBuilder rightFuzzyTimeKeyValue (String ... rightFuzzyTimeKeyValue){
            this.rightFuzzyTimeKeyValue = solveNullList(rightFuzzyTimeKeyValue);
            return this;
        }

        public ConditionBuilder timeKeyValueList(String ... timeKeyValue){
            this.timeKeyValueList = solveNullList(timeKeyValue);
            return this;
        }

        public ConditionBuilder timeKeyValueList(List<String> timeKeyValue){
            this.timeKeyValueList = timeKeyValue;
            return this;
        }

        public ConditionBuilder executeTimeBetWeen(Long executeTimeSt,Long executeTimeEd){
            this.executeTimeSt = executeTimeSt;
            this.executeTimeEd = executeTimeEd;
            return this;
        }

        public ConditionBuilder executeTimeGreaterEqThan(Long executeTimeSt){
            this.executeTimeSt = executeTimeSt;
            return this;
        }
        public ConditionBuilder executeTimeLessEqThan(Long executeTimeEd){
            this.executeTimeEd = executeTimeEd;
            return this;
        }


        public ConditionBuilder executeTimeList(Long ... executeTime){
            this.executeTimeList = solveNullList(executeTime);
            return this;
        }

        public ConditionBuilder executeTimeList(List<Long> executeTime){
            this.executeTimeList = executeTime;
            return this;
        }

        public ConditionBuilder fuzzyTaskStatus (List<String> fuzzyTaskStatus){
            this.fuzzyTaskStatus = fuzzyTaskStatus;
            return this;
        }

        public ConditionBuilder fuzzyTaskStatus (String ... fuzzyTaskStatus){
            this.fuzzyTaskStatus = solveNullList(fuzzyTaskStatus);
            return this;
        }

        public ConditionBuilder rightFuzzyTaskStatus (List<String> rightFuzzyTaskStatus){
            this.rightFuzzyTaskStatus = rightFuzzyTaskStatus;
            return this;
        }

        public ConditionBuilder rightFuzzyTaskStatus (String ... rightFuzzyTaskStatus){
            this.rightFuzzyTaskStatus = solveNullList(rightFuzzyTaskStatus);
            return this;
        }

        public ConditionBuilder taskStatusList(String ... taskStatus){
            this.taskStatusList = solveNullList(taskStatus);
            return this;
        }

        public ConditionBuilder taskStatusList(List<String> taskStatus){
            this.taskStatusList = taskStatus;
            return this;
        }

        public ConditionBuilder failcountBetWeen(Integer failcountSt,Integer failcountEd){
            this.failcountSt = failcountSt;
            this.failcountEd = failcountEd;
            return this;
        }

        public ConditionBuilder failcountGreaterEqThan(Integer failcountSt){
            this.failcountSt = failcountSt;
            return this;
        }
        public ConditionBuilder failcountLessEqThan(Integer failcountEd){
            this.failcountEd = failcountEd;
            return this;
        }


        public ConditionBuilder failcountList(Integer ... failcount){
            this.failcountList = solveNullList(failcount);
            return this;
        }

        public ConditionBuilder failcountList(List<Integer> failcount){
            this.failcountList = failcount;
            return this;
        }

        public ConditionBuilder fuzzyFailReason (List<String> fuzzyFailReason){
            this.fuzzyFailReason = fuzzyFailReason;
            return this;
        }

        public ConditionBuilder fuzzyFailReason (String ... fuzzyFailReason){
            this.fuzzyFailReason = solveNullList(fuzzyFailReason);
            return this;
        }

        public ConditionBuilder rightFuzzyFailReason (List<String> rightFuzzyFailReason){
            this.rightFuzzyFailReason = rightFuzzyFailReason;
            return this;
        }

        public ConditionBuilder rightFuzzyFailReason (String ... rightFuzzyFailReason){
            this.rightFuzzyFailReason = solveNullList(rightFuzzyFailReason);
            return this;
        }

        public ConditionBuilder failReasonList(String ... failReason){
            this.failReasonList = solveNullList(failReason);
            return this;
        }

        public ConditionBuilder failReasonList(List<String> failReason){
            this.failReasonList = failReason;
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

        private QuartzTaskRecords obj;

        public Builder(){
            this.obj = new QuartzTaskRecords();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder taskNo(String taskNo){
            this.obj.setTaskNo(taskNo);
            return this;
        }
        public Builder timeKeyValue(String timeKeyValue){
            this.obj.setTimeKeyValue(timeKeyValue);
            return this;
        }
        public Builder executeTime(Long executeTime){
            this.obj.setExecuteTime(executeTime);
            return this;
        }
        public Builder taskStatus(String taskStatus){
            this.obj.setTaskStatus(taskStatus);
            return this;
        }
        public Builder failcount(Integer failcount){
            this.obj.setFailcount(failcount);
            return this;
        }
        public Builder failReason(String failReason){
            this.obj.setFailReason(failReason);
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
        public QuartzTaskRecords build(){return obj;}
    }

}
