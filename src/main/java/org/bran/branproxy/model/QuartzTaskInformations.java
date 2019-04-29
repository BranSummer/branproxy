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
public class QuartzTaskInformations implements Serializable {

    private static final long serialVersionUID = 1556519681738L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long id;

    /**
    * 版本号：需要乐观锁控制
    * isNullAble:0
    */
    private Integer version;

    /**
    * 任务编号
    * isNullAble:0
    */
    private String taskNo;

    /**
    * 任务名称
    * isNullAble:0
    */
    private String taskName;

    /**
    * 定时规则表达式
    * isNullAble:0
    */
    private String schedulerRule;

    /**
    * 冻结状态
    * isNullAble:0
    */
    private String frozenStatus;

    /**
    * 执行方
    * isNullAble:0
    */
    private String executorNo;

    /**
    * 冻结时间
    * isNullAble:1
    */
    private java.time.LocalDateTime frozenTime;

    /**
    * 解冻时间
    * isNullAble:1
    */
    private java.time.LocalDateTime unfrozenTime;

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

    /**
    * 发送方式
    * isNullAble:1
    */
    private String sendType;

    /**
    * 请求地址
    * isNullAble:1
    */
    private String url;

    /**
    * 执行参数
    * isNullAble:1
    */
    private String executeParamter;

    /**
    * 
    * isNullAble:0
    */
    private String timeKey;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setVersion(Integer version){this.version = version;}

    public Integer getVersion(){return this.version;}

    public void setTaskNo(String taskNo){this.taskNo = taskNo;}

    public String getTaskNo(){return this.taskNo;}

    public void setTaskName(String taskName){this.taskName = taskName;}

    public String getTaskName(){return this.taskName;}

    public void setSchedulerRule(String schedulerRule){this.schedulerRule = schedulerRule;}

    public String getSchedulerRule(){return this.schedulerRule;}

    public void setFrozenStatus(String frozenStatus){this.frozenStatus = frozenStatus;}

    public String getFrozenStatus(){return this.frozenStatus;}

    public void setExecutorNo(String executorNo){this.executorNo = executorNo;}

    public String getExecutorNo(){return this.executorNo;}

    public void setFrozenTime(java.time.LocalDateTime frozenTime){this.frozenTime = frozenTime;}

    public java.time.LocalDateTime getFrozenTime(){return this.frozenTime;}

    public void setUnfrozenTime(java.time.LocalDateTime unfrozenTime){this.unfrozenTime = unfrozenTime;}

    public java.time.LocalDateTime getUnfrozenTime(){return this.unfrozenTime;}

    public void setCreateTime(java.time.LocalDateTime createTime){this.createTime = createTime;}

    public java.time.LocalDateTime getCreateTime(){return this.createTime;}

    public void setLastModifyTime(java.time.LocalDateTime lastModifyTime){this.lastModifyTime = lastModifyTime;}

    public java.time.LocalDateTime getLastModifyTime(){return this.lastModifyTime;}

    public void setSendType(String sendType){this.sendType = sendType;}

    public String getSendType(){return this.sendType;}

    public void setUrl(String url){this.url = url;}

    public String getUrl(){return this.url;}

    public void setExecuteParamter(String executeParamter){this.executeParamter = executeParamter;}

    public String getExecuteParamter(){return this.executeParamter;}

    public void setTimeKey(String timeKey){this.timeKey = timeKey;}

    public String getTimeKey(){return this.timeKey;}
    @Override
    public String toString() {
        return "QuartzTaskInformations{" +
                "id='" + id + '\'' +
                "version='" + version + '\'' +
                "taskNo='" + taskNo + '\'' +
                "taskName='" + taskName + '\'' +
                "schedulerRule='" + schedulerRule + '\'' +
                "frozenStatus='" + frozenStatus + '\'' +
                "executorNo='" + executorNo + '\'' +
                "frozenTime='" + frozenTime + '\'' +
                "unfrozenTime='" + unfrozenTime + '\'' +
                "createTime='" + createTime + '\'' +
                "lastModifyTime='" + lastModifyTime + '\'' +
                "sendType='" + sendType + '\'' +
                "url='" + url + '\'' +
                "executeParamter='" + executeParamter + '\'' +
                "timeKey='" + timeKey + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private QuartzTaskInformations set;

        private ConditionBuilder where;

        public UpdateBuilder set(QuartzTaskInformations set){
            this.set = set;
            return this;
        }

        public QuartzTaskInformations getSet(){
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

    public static class QueryBuilder extends QuartzTaskInformations{
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

        private List<Integer> versionList;

        public List<Integer> getVersionList(){return this.versionList;}

        private Integer versionSt;

        private Integer versionEd;

        public Integer getVersionSt(){return this.versionSt;}

        public Integer getVersionEd(){return this.versionEd;}

        private List<String> taskNoList;

        public List<String> getTaskNoList(){return this.taskNoList;}


        private List<String> fuzzyTaskNo;

        public List<String> getFuzzyTaskNo(){return this.fuzzyTaskNo;}

        private List<String> rightFuzzyTaskNo;

        public List<String> getRightFuzzyTaskNo(){return this.rightFuzzyTaskNo;}
        private List<String> taskNameList;

        public List<String> getTaskNameList(){return this.taskNameList;}


        private List<String> fuzzyTaskName;

        public List<String> getFuzzyTaskName(){return this.fuzzyTaskName;}

        private List<String> rightFuzzyTaskName;

        public List<String> getRightFuzzyTaskName(){return this.rightFuzzyTaskName;}
        private List<String> schedulerRuleList;

        public List<String> getSchedulerRuleList(){return this.schedulerRuleList;}


        private List<String> fuzzySchedulerRule;

        public List<String> getFuzzySchedulerRule(){return this.fuzzySchedulerRule;}

        private List<String> rightFuzzySchedulerRule;

        public List<String> getRightFuzzySchedulerRule(){return this.rightFuzzySchedulerRule;}
        private List<String> frozenStatusList;

        public List<String> getFrozenStatusList(){return this.frozenStatusList;}


        private List<String> fuzzyFrozenStatus;

        public List<String> getFuzzyFrozenStatus(){return this.fuzzyFrozenStatus;}

        private List<String> rightFuzzyFrozenStatus;

        public List<String> getRightFuzzyFrozenStatus(){return this.rightFuzzyFrozenStatus;}
        private List<String> executorNoList;

        public List<String> getExecutorNoList(){return this.executorNoList;}


        private List<String> fuzzyExecutorNo;

        public List<String> getFuzzyExecutorNo(){return this.fuzzyExecutorNo;}

        private List<String> rightFuzzyExecutorNo;

        public List<String> getRightFuzzyExecutorNo(){return this.rightFuzzyExecutorNo;}
        private List<java.time.LocalDateTime> frozenTimeList;

        public List<java.time.LocalDateTime> getFrozenTimeList(){return this.frozenTimeList;}

        private java.time.LocalDateTime frozenTimeSt;

        private java.time.LocalDateTime frozenTimeEd;

        public java.time.LocalDateTime getFrozenTimeSt(){return this.frozenTimeSt;}

        public java.time.LocalDateTime getFrozenTimeEd(){return this.frozenTimeEd;}

        private List<java.time.LocalDateTime> unfrozenTimeList;

        public List<java.time.LocalDateTime> getUnfrozenTimeList(){return this.unfrozenTimeList;}

        private java.time.LocalDateTime unfrozenTimeSt;

        private java.time.LocalDateTime unfrozenTimeEd;

        public java.time.LocalDateTime getUnfrozenTimeSt(){return this.unfrozenTimeSt;}

        public java.time.LocalDateTime getUnfrozenTimeEd(){return this.unfrozenTimeEd;}

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

        private List<String> sendTypeList;

        public List<String> getSendTypeList(){return this.sendTypeList;}


        private List<String> fuzzySendType;

        public List<String> getFuzzySendType(){return this.fuzzySendType;}

        private List<String> rightFuzzySendType;

        public List<String> getRightFuzzySendType(){return this.rightFuzzySendType;}
        private List<String> urlList;

        public List<String> getUrlList(){return this.urlList;}


        private List<String> fuzzyUrl;

        public List<String> getFuzzyUrl(){return this.fuzzyUrl;}

        private List<String> rightFuzzyUrl;

        public List<String> getRightFuzzyUrl(){return this.rightFuzzyUrl;}
        private List<String> executeParamterList;

        public List<String> getExecuteParamterList(){return this.executeParamterList;}


        private List<String> fuzzyExecuteParamter;

        public List<String> getFuzzyExecuteParamter(){return this.fuzzyExecuteParamter;}

        private List<String> rightFuzzyExecuteParamter;

        public List<String> getRightFuzzyExecuteParamter(){return this.rightFuzzyExecuteParamter;}
        private List<String> timeKeyList;

        public List<String> getTimeKeyList(){return this.timeKeyList;}


        private List<String> fuzzyTimeKey;

        public List<String> getFuzzyTimeKey(){return this.fuzzyTimeKey;}

        private List<String> rightFuzzyTimeKey;

        public List<String> getRightFuzzyTimeKey(){return this.rightFuzzyTimeKey;}
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

        public QueryBuilder versionBetWeen(Integer versionSt,Integer versionEd){
            this.versionSt = versionSt;
            this.versionEd = versionEd;
            return this;
        }

        public QueryBuilder versionGreaterEqThan(Integer versionSt){
            this.versionSt = versionSt;
            return this;
        }
        public QueryBuilder versionLessEqThan(Integer versionEd){
            this.versionEd = versionEd;
            return this;
        }


        public QueryBuilder version(Integer version){
            setVersion(version);
            return this;
        }

        public QueryBuilder versionList(Integer ... version){
            this.versionList = solveNullList(version);
            return this;
        }

        public QueryBuilder versionList(List<Integer> version){
            this.versionList = version;
            return this;
        }

        public QueryBuilder fetchVersion(){
            setFetchFields("fetchFields","version");
            return this;
        }

        public QueryBuilder excludeVersion(){
            setFetchFields("excludeFields","version");
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

        public QueryBuilder fuzzyTaskName (List<String> fuzzyTaskName){
            this.fuzzyTaskName = fuzzyTaskName;
            return this;
        }

        public QueryBuilder fuzzyTaskName (String ... fuzzyTaskName){
            this.fuzzyTaskName = solveNullList(fuzzyTaskName);
            return this;
        }

        public QueryBuilder rightFuzzyTaskName (List<String> rightFuzzyTaskName){
            this.rightFuzzyTaskName = rightFuzzyTaskName;
            return this;
        }

        public QueryBuilder rightFuzzyTaskName (String ... rightFuzzyTaskName){
            this.rightFuzzyTaskName = solveNullList(rightFuzzyTaskName);
            return this;
        }

        public QueryBuilder taskName(String taskName){
            setTaskName(taskName);
            return this;
        }

        public QueryBuilder taskNameList(String ... taskName){
            this.taskNameList = solveNullList(taskName);
            return this;
        }

        public QueryBuilder taskNameList(List<String> taskName){
            this.taskNameList = taskName;
            return this;
        }

        public QueryBuilder fetchTaskName(){
            setFetchFields("fetchFields","taskName");
            return this;
        }

        public QueryBuilder excludeTaskName(){
            setFetchFields("excludeFields","taskName");
            return this;
        }

        public QueryBuilder fuzzySchedulerRule (List<String> fuzzySchedulerRule){
            this.fuzzySchedulerRule = fuzzySchedulerRule;
            return this;
        }

        public QueryBuilder fuzzySchedulerRule (String ... fuzzySchedulerRule){
            this.fuzzySchedulerRule = solveNullList(fuzzySchedulerRule);
            return this;
        }

        public QueryBuilder rightFuzzySchedulerRule (List<String> rightFuzzySchedulerRule){
            this.rightFuzzySchedulerRule = rightFuzzySchedulerRule;
            return this;
        }

        public QueryBuilder rightFuzzySchedulerRule (String ... rightFuzzySchedulerRule){
            this.rightFuzzySchedulerRule = solveNullList(rightFuzzySchedulerRule);
            return this;
        }

        public QueryBuilder schedulerRule(String schedulerRule){
            setSchedulerRule(schedulerRule);
            return this;
        }

        public QueryBuilder schedulerRuleList(String ... schedulerRule){
            this.schedulerRuleList = solveNullList(schedulerRule);
            return this;
        }

        public QueryBuilder schedulerRuleList(List<String> schedulerRule){
            this.schedulerRuleList = schedulerRule;
            return this;
        }

        public QueryBuilder fetchSchedulerRule(){
            setFetchFields("fetchFields","schedulerRule");
            return this;
        }

        public QueryBuilder excludeSchedulerRule(){
            setFetchFields("excludeFields","schedulerRule");
            return this;
        }

        public QueryBuilder fuzzyFrozenStatus (List<String> fuzzyFrozenStatus){
            this.fuzzyFrozenStatus = fuzzyFrozenStatus;
            return this;
        }

        public QueryBuilder fuzzyFrozenStatus (String ... fuzzyFrozenStatus){
            this.fuzzyFrozenStatus = solveNullList(fuzzyFrozenStatus);
            return this;
        }

        public QueryBuilder rightFuzzyFrozenStatus (List<String> rightFuzzyFrozenStatus){
            this.rightFuzzyFrozenStatus = rightFuzzyFrozenStatus;
            return this;
        }

        public QueryBuilder rightFuzzyFrozenStatus (String ... rightFuzzyFrozenStatus){
            this.rightFuzzyFrozenStatus = solveNullList(rightFuzzyFrozenStatus);
            return this;
        }

        public QueryBuilder frozenStatus(String frozenStatus){
            setFrozenStatus(frozenStatus);
            return this;
        }

        public QueryBuilder frozenStatusList(String ... frozenStatus){
            this.frozenStatusList = solveNullList(frozenStatus);
            return this;
        }

        public QueryBuilder frozenStatusList(List<String> frozenStatus){
            this.frozenStatusList = frozenStatus;
            return this;
        }

        public QueryBuilder fetchFrozenStatus(){
            setFetchFields("fetchFields","frozenStatus");
            return this;
        }

        public QueryBuilder excludeFrozenStatus(){
            setFetchFields("excludeFields","frozenStatus");
            return this;
        }

        public QueryBuilder fuzzyExecutorNo (List<String> fuzzyExecutorNo){
            this.fuzzyExecutorNo = fuzzyExecutorNo;
            return this;
        }

        public QueryBuilder fuzzyExecutorNo (String ... fuzzyExecutorNo){
            this.fuzzyExecutorNo = solveNullList(fuzzyExecutorNo);
            return this;
        }

        public QueryBuilder rightFuzzyExecutorNo (List<String> rightFuzzyExecutorNo){
            this.rightFuzzyExecutorNo = rightFuzzyExecutorNo;
            return this;
        }

        public QueryBuilder rightFuzzyExecutorNo (String ... rightFuzzyExecutorNo){
            this.rightFuzzyExecutorNo = solveNullList(rightFuzzyExecutorNo);
            return this;
        }

        public QueryBuilder executorNo(String executorNo){
            setExecutorNo(executorNo);
            return this;
        }

        public QueryBuilder executorNoList(String ... executorNo){
            this.executorNoList = solveNullList(executorNo);
            return this;
        }

        public QueryBuilder executorNoList(List<String> executorNo){
            this.executorNoList = executorNo;
            return this;
        }

        public QueryBuilder fetchExecutorNo(){
            setFetchFields("fetchFields","executorNo");
            return this;
        }

        public QueryBuilder excludeExecutorNo(){
            setFetchFields("excludeFields","executorNo");
            return this;
        }

        public QueryBuilder frozenTimeBetWeen(java.time.LocalDateTime frozenTimeSt,java.time.LocalDateTime frozenTimeEd){
            this.frozenTimeSt = frozenTimeSt;
            this.frozenTimeEd = frozenTimeEd;
            return this;
        }

        public QueryBuilder frozenTimeGreaterEqThan(java.time.LocalDateTime frozenTimeSt){
            this.frozenTimeSt = frozenTimeSt;
            return this;
        }
        public QueryBuilder frozenTimeLessEqThan(java.time.LocalDateTime frozenTimeEd){
            this.frozenTimeEd = frozenTimeEd;
            return this;
        }


        public QueryBuilder frozenTime(java.time.LocalDateTime frozenTime){
            setFrozenTime(frozenTime);
            return this;
        }

        public QueryBuilder frozenTimeList(java.time.LocalDateTime ... frozenTime){
            this.frozenTimeList = solveNullList(frozenTime);
            return this;
        }

        public QueryBuilder frozenTimeList(List<java.time.LocalDateTime> frozenTime){
            this.frozenTimeList = frozenTime;
            return this;
        }

        public QueryBuilder fetchFrozenTime(){
            setFetchFields("fetchFields","frozenTime");
            return this;
        }

        public QueryBuilder excludeFrozenTime(){
            setFetchFields("excludeFields","frozenTime");
            return this;
        }

        public QueryBuilder unfrozenTimeBetWeen(java.time.LocalDateTime unfrozenTimeSt,java.time.LocalDateTime unfrozenTimeEd){
            this.unfrozenTimeSt = unfrozenTimeSt;
            this.unfrozenTimeEd = unfrozenTimeEd;
            return this;
        }

        public QueryBuilder unfrozenTimeGreaterEqThan(java.time.LocalDateTime unfrozenTimeSt){
            this.unfrozenTimeSt = unfrozenTimeSt;
            return this;
        }
        public QueryBuilder unfrozenTimeLessEqThan(java.time.LocalDateTime unfrozenTimeEd){
            this.unfrozenTimeEd = unfrozenTimeEd;
            return this;
        }


        public QueryBuilder unfrozenTime(java.time.LocalDateTime unfrozenTime){
            setUnfrozenTime(unfrozenTime);
            return this;
        }

        public QueryBuilder unfrozenTimeList(java.time.LocalDateTime ... unfrozenTime){
            this.unfrozenTimeList = solveNullList(unfrozenTime);
            return this;
        }

        public QueryBuilder unfrozenTimeList(List<java.time.LocalDateTime> unfrozenTime){
            this.unfrozenTimeList = unfrozenTime;
            return this;
        }

        public QueryBuilder fetchUnfrozenTime(){
            setFetchFields("fetchFields","unfrozenTime");
            return this;
        }

        public QueryBuilder excludeUnfrozenTime(){
            setFetchFields("excludeFields","unfrozenTime");
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

        public QueryBuilder fuzzySendType (List<String> fuzzySendType){
            this.fuzzySendType = fuzzySendType;
            return this;
        }

        public QueryBuilder fuzzySendType (String ... fuzzySendType){
            this.fuzzySendType = solveNullList(fuzzySendType);
            return this;
        }

        public QueryBuilder rightFuzzySendType (List<String> rightFuzzySendType){
            this.rightFuzzySendType = rightFuzzySendType;
            return this;
        }

        public QueryBuilder rightFuzzySendType (String ... rightFuzzySendType){
            this.rightFuzzySendType = solveNullList(rightFuzzySendType);
            return this;
        }

        public QueryBuilder sendType(String sendType){
            setSendType(sendType);
            return this;
        }

        public QueryBuilder sendTypeList(String ... sendType){
            this.sendTypeList = solveNullList(sendType);
            return this;
        }

        public QueryBuilder sendTypeList(List<String> sendType){
            this.sendTypeList = sendType;
            return this;
        }

        public QueryBuilder fetchSendType(){
            setFetchFields("fetchFields","sendType");
            return this;
        }

        public QueryBuilder excludeSendType(){
            setFetchFields("excludeFields","sendType");
            return this;
        }

        public QueryBuilder fuzzyUrl (List<String> fuzzyUrl){
            this.fuzzyUrl = fuzzyUrl;
            return this;
        }

        public QueryBuilder fuzzyUrl (String ... fuzzyUrl){
            this.fuzzyUrl = solveNullList(fuzzyUrl);
            return this;
        }

        public QueryBuilder rightFuzzyUrl (List<String> rightFuzzyUrl){
            this.rightFuzzyUrl = rightFuzzyUrl;
            return this;
        }

        public QueryBuilder rightFuzzyUrl (String ... rightFuzzyUrl){
            this.rightFuzzyUrl = solveNullList(rightFuzzyUrl);
            return this;
        }

        public QueryBuilder url(String url){
            setUrl(url);
            return this;
        }

        public QueryBuilder urlList(String ... url){
            this.urlList = solveNullList(url);
            return this;
        }

        public QueryBuilder urlList(List<String> url){
            this.urlList = url;
            return this;
        }

        public QueryBuilder fetchUrl(){
            setFetchFields("fetchFields","url");
            return this;
        }

        public QueryBuilder excludeUrl(){
            setFetchFields("excludeFields","url");
            return this;
        }

        public QueryBuilder fuzzyExecuteParamter (List<String> fuzzyExecuteParamter){
            this.fuzzyExecuteParamter = fuzzyExecuteParamter;
            return this;
        }

        public QueryBuilder fuzzyExecuteParamter (String ... fuzzyExecuteParamter){
            this.fuzzyExecuteParamter = solveNullList(fuzzyExecuteParamter);
            return this;
        }

        public QueryBuilder rightFuzzyExecuteParamter (List<String> rightFuzzyExecuteParamter){
            this.rightFuzzyExecuteParamter = rightFuzzyExecuteParamter;
            return this;
        }

        public QueryBuilder rightFuzzyExecuteParamter (String ... rightFuzzyExecuteParamter){
            this.rightFuzzyExecuteParamter = solveNullList(rightFuzzyExecuteParamter);
            return this;
        }

        public QueryBuilder executeParamter(String executeParamter){
            setExecuteParamter(executeParamter);
            return this;
        }

        public QueryBuilder executeParamterList(String ... executeParamter){
            this.executeParamterList = solveNullList(executeParamter);
            return this;
        }

        public QueryBuilder executeParamterList(List<String> executeParamter){
            this.executeParamterList = executeParamter;
            return this;
        }

        public QueryBuilder fetchExecuteParamter(){
            setFetchFields("fetchFields","executeParamter");
            return this;
        }

        public QueryBuilder excludeExecuteParamter(){
            setFetchFields("excludeFields","executeParamter");
            return this;
        }

        public QueryBuilder fuzzyTimeKey (List<String> fuzzyTimeKey){
            this.fuzzyTimeKey = fuzzyTimeKey;
            return this;
        }

        public QueryBuilder fuzzyTimeKey (String ... fuzzyTimeKey){
            this.fuzzyTimeKey = solveNullList(fuzzyTimeKey);
            return this;
        }

        public QueryBuilder rightFuzzyTimeKey (List<String> rightFuzzyTimeKey){
            this.rightFuzzyTimeKey = rightFuzzyTimeKey;
            return this;
        }

        public QueryBuilder rightFuzzyTimeKey (String ... rightFuzzyTimeKey){
            this.rightFuzzyTimeKey = solveNullList(rightFuzzyTimeKey);
            return this;
        }

        public QueryBuilder timeKey(String timeKey){
            setTimeKey(timeKey);
            return this;
        }

        public QueryBuilder timeKeyList(String ... timeKey){
            this.timeKeyList = solveNullList(timeKey);
            return this;
        }

        public QueryBuilder timeKeyList(List<String> timeKey){
            this.timeKeyList = timeKey;
            return this;
        }

        public QueryBuilder fetchTimeKey(){
            setFetchFields("fetchFields","timeKey");
            return this;
        }

        public QueryBuilder excludeTimeKey(){
            setFetchFields("excludeFields","timeKey");
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

        public QuartzTaskInformations build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<Integer> versionList;

        public List<Integer> getVersionList(){return this.versionList;}

        private Integer versionSt;

        private Integer versionEd;

        public Integer getVersionSt(){return this.versionSt;}

        public Integer getVersionEd(){return this.versionEd;}

        private List<String> taskNoList;

        public List<String> getTaskNoList(){return this.taskNoList;}


        private List<String> fuzzyTaskNo;

        public List<String> getFuzzyTaskNo(){return this.fuzzyTaskNo;}

        private List<String> rightFuzzyTaskNo;

        public List<String> getRightFuzzyTaskNo(){return this.rightFuzzyTaskNo;}
        private List<String> taskNameList;

        public List<String> getTaskNameList(){return this.taskNameList;}


        private List<String> fuzzyTaskName;

        public List<String> getFuzzyTaskName(){return this.fuzzyTaskName;}

        private List<String> rightFuzzyTaskName;

        public List<String> getRightFuzzyTaskName(){return this.rightFuzzyTaskName;}
        private List<String> schedulerRuleList;

        public List<String> getSchedulerRuleList(){return this.schedulerRuleList;}


        private List<String> fuzzySchedulerRule;

        public List<String> getFuzzySchedulerRule(){return this.fuzzySchedulerRule;}

        private List<String> rightFuzzySchedulerRule;

        public List<String> getRightFuzzySchedulerRule(){return this.rightFuzzySchedulerRule;}
        private List<String> frozenStatusList;

        public List<String> getFrozenStatusList(){return this.frozenStatusList;}


        private List<String> fuzzyFrozenStatus;

        public List<String> getFuzzyFrozenStatus(){return this.fuzzyFrozenStatus;}

        private List<String> rightFuzzyFrozenStatus;

        public List<String> getRightFuzzyFrozenStatus(){return this.rightFuzzyFrozenStatus;}
        private List<String> executorNoList;

        public List<String> getExecutorNoList(){return this.executorNoList;}


        private List<String> fuzzyExecutorNo;

        public List<String> getFuzzyExecutorNo(){return this.fuzzyExecutorNo;}

        private List<String> rightFuzzyExecutorNo;

        public List<String> getRightFuzzyExecutorNo(){return this.rightFuzzyExecutorNo;}
        private List<java.time.LocalDateTime> frozenTimeList;

        public List<java.time.LocalDateTime> getFrozenTimeList(){return this.frozenTimeList;}

        private java.time.LocalDateTime frozenTimeSt;

        private java.time.LocalDateTime frozenTimeEd;

        public java.time.LocalDateTime getFrozenTimeSt(){return this.frozenTimeSt;}

        public java.time.LocalDateTime getFrozenTimeEd(){return this.frozenTimeEd;}

        private List<java.time.LocalDateTime> unfrozenTimeList;

        public List<java.time.LocalDateTime> getUnfrozenTimeList(){return this.unfrozenTimeList;}

        private java.time.LocalDateTime unfrozenTimeSt;

        private java.time.LocalDateTime unfrozenTimeEd;

        public java.time.LocalDateTime getUnfrozenTimeSt(){return this.unfrozenTimeSt;}

        public java.time.LocalDateTime getUnfrozenTimeEd(){return this.unfrozenTimeEd;}

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

        private List<String> sendTypeList;

        public List<String> getSendTypeList(){return this.sendTypeList;}


        private List<String> fuzzySendType;

        public List<String> getFuzzySendType(){return this.fuzzySendType;}

        private List<String> rightFuzzySendType;

        public List<String> getRightFuzzySendType(){return this.rightFuzzySendType;}
        private List<String> urlList;

        public List<String> getUrlList(){return this.urlList;}


        private List<String> fuzzyUrl;

        public List<String> getFuzzyUrl(){return this.fuzzyUrl;}

        private List<String> rightFuzzyUrl;

        public List<String> getRightFuzzyUrl(){return this.rightFuzzyUrl;}
        private List<String> executeParamterList;

        public List<String> getExecuteParamterList(){return this.executeParamterList;}


        private List<String> fuzzyExecuteParamter;

        public List<String> getFuzzyExecuteParamter(){return this.fuzzyExecuteParamter;}

        private List<String> rightFuzzyExecuteParamter;

        public List<String> getRightFuzzyExecuteParamter(){return this.rightFuzzyExecuteParamter;}
        private List<String> timeKeyList;

        public List<String> getTimeKeyList(){return this.timeKeyList;}


        private List<String> fuzzyTimeKey;

        public List<String> getFuzzyTimeKey(){return this.fuzzyTimeKey;}

        private List<String> rightFuzzyTimeKey;

        public List<String> getRightFuzzyTimeKey(){return this.rightFuzzyTimeKey;}

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

        public ConditionBuilder versionBetWeen(Integer versionSt,Integer versionEd){
            this.versionSt = versionSt;
            this.versionEd = versionEd;
            return this;
        }

        public ConditionBuilder versionGreaterEqThan(Integer versionSt){
            this.versionSt = versionSt;
            return this;
        }
        public ConditionBuilder versionLessEqThan(Integer versionEd){
            this.versionEd = versionEd;
            return this;
        }


        public ConditionBuilder versionList(Integer ... version){
            this.versionList = solveNullList(version);
            return this;
        }

        public ConditionBuilder versionList(List<Integer> version){
            this.versionList = version;
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

        public ConditionBuilder fuzzyTaskName (List<String> fuzzyTaskName){
            this.fuzzyTaskName = fuzzyTaskName;
            return this;
        }

        public ConditionBuilder fuzzyTaskName (String ... fuzzyTaskName){
            this.fuzzyTaskName = solveNullList(fuzzyTaskName);
            return this;
        }

        public ConditionBuilder rightFuzzyTaskName (List<String> rightFuzzyTaskName){
            this.rightFuzzyTaskName = rightFuzzyTaskName;
            return this;
        }

        public ConditionBuilder rightFuzzyTaskName (String ... rightFuzzyTaskName){
            this.rightFuzzyTaskName = solveNullList(rightFuzzyTaskName);
            return this;
        }

        public ConditionBuilder taskNameList(String ... taskName){
            this.taskNameList = solveNullList(taskName);
            return this;
        }

        public ConditionBuilder taskNameList(List<String> taskName){
            this.taskNameList = taskName;
            return this;
        }

        public ConditionBuilder fuzzySchedulerRule (List<String> fuzzySchedulerRule){
            this.fuzzySchedulerRule = fuzzySchedulerRule;
            return this;
        }

        public ConditionBuilder fuzzySchedulerRule (String ... fuzzySchedulerRule){
            this.fuzzySchedulerRule = solveNullList(fuzzySchedulerRule);
            return this;
        }

        public ConditionBuilder rightFuzzySchedulerRule (List<String> rightFuzzySchedulerRule){
            this.rightFuzzySchedulerRule = rightFuzzySchedulerRule;
            return this;
        }

        public ConditionBuilder rightFuzzySchedulerRule (String ... rightFuzzySchedulerRule){
            this.rightFuzzySchedulerRule = solveNullList(rightFuzzySchedulerRule);
            return this;
        }

        public ConditionBuilder schedulerRuleList(String ... schedulerRule){
            this.schedulerRuleList = solveNullList(schedulerRule);
            return this;
        }

        public ConditionBuilder schedulerRuleList(List<String> schedulerRule){
            this.schedulerRuleList = schedulerRule;
            return this;
        }

        public ConditionBuilder fuzzyFrozenStatus (List<String> fuzzyFrozenStatus){
            this.fuzzyFrozenStatus = fuzzyFrozenStatus;
            return this;
        }

        public ConditionBuilder fuzzyFrozenStatus (String ... fuzzyFrozenStatus){
            this.fuzzyFrozenStatus = solveNullList(fuzzyFrozenStatus);
            return this;
        }

        public ConditionBuilder rightFuzzyFrozenStatus (List<String> rightFuzzyFrozenStatus){
            this.rightFuzzyFrozenStatus = rightFuzzyFrozenStatus;
            return this;
        }

        public ConditionBuilder rightFuzzyFrozenStatus (String ... rightFuzzyFrozenStatus){
            this.rightFuzzyFrozenStatus = solveNullList(rightFuzzyFrozenStatus);
            return this;
        }

        public ConditionBuilder frozenStatusList(String ... frozenStatus){
            this.frozenStatusList = solveNullList(frozenStatus);
            return this;
        }

        public ConditionBuilder frozenStatusList(List<String> frozenStatus){
            this.frozenStatusList = frozenStatus;
            return this;
        }

        public ConditionBuilder fuzzyExecutorNo (List<String> fuzzyExecutorNo){
            this.fuzzyExecutorNo = fuzzyExecutorNo;
            return this;
        }

        public ConditionBuilder fuzzyExecutorNo (String ... fuzzyExecutorNo){
            this.fuzzyExecutorNo = solveNullList(fuzzyExecutorNo);
            return this;
        }

        public ConditionBuilder rightFuzzyExecutorNo (List<String> rightFuzzyExecutorNo){
            this.rightFuzzyExecutorNo = rightFuzzyExecutorNo;
            return this;
        }

        public ConditionBuilder rightFuzzyExecutorNo (String ... rightFuzzyExecutorNo){
            this.rightFuzzyExecutorNo = solveNullList(rightFuzzyExecutorNo);
            return this;
        }

        public ConditionBuilder executorNoList(String ... executorNo){
            this.executorNoList = solveNullList(executorNo);
            return this;
        }

        public ConditionBuilder executorNoList(List<String> executorNo){
            this.executorNoList = executorNo;
            return this;
        }

        public ConditionBuilder frozenTimeBetWeen(java.time.LocalDateTime frozenTimeSt,java.time.LocalDateTime frozenTimeEd){
            this.frozenTimeSt = frozenTimeSt;
            this.frozenTimeEd = frozenTimeEd;
            return this;
        }

        public ConditionBuilder frozenTimeGreaterEqThan(java.time.LocalDateTime frozenTimeSt){
            this.frozenTimeSt = frozenTimeSt;
            return this;
        }
        public ConditionBuilder frozenTimeLessEqThan(java.time.LocalDateTime frozenTimeEd){
            this.frozenTimeEd = frozenTimeEd;
            return this;
        }


        public ConditionBuilder frozenTimeList(java.time.LocalDateTime ... frozenTime){
            this.frozenTimeList = solveNullList(frozenTime);
            return this;
        }

        public ConditionBuilder frozenTimeList(List<java.time.LocalDateTime> frozenTime){
            this.frozenTimeList = frozenTime;
            return this;
        }

        public ConditionBuilder unfrozenTimeBetWeen(java.time.LocalDateTime unfrozenTimeSt,java.time.LocalDateTime unfrozenTimeEd){
            this.unfrozenTimeSt = unfrozenTimeSt;
            this.unfrozenTimeEd = unfrozenTimeEd;
            return this;
        }

        public ConditionBuilder unfrozenTimeGreaterEqThan(java.time.LocalDateTime unfrozenTimeSt){
            this.unfrozenTimeSt = unfrozenTimeSt;
            return this;
        }
        public ConditionBuilder unfrozenTimeLessEqThan(java.time.LocalDateTime unfrozenTimeEd){
            this.unfrozenTimeEd = unfrozenTimeEd;
            return this;
        }


        public ConditionBuilder unfrozenTimeList(java.time.LocalDateTime ... unfrozenTime){
            this.unfrozenTimeList = solveNullList(unfrozenTime);
            return this;
        }

        public ConditionBuilder unfrozenTimeList(List<java.time.LocalDateTime> unfrozenTime){
            this.unfrozenTimeList = unfrozenTime;
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

        public ConditionBuilder fuzzySendType (List<String> fuzzySendType){
            this.fuzzySendType = fuzzySendType;
            return this;
        }

        public ConditionBuilder fuzzySendType (String ... fuzzySendType){
            this.fuzzySendType = solveNullList(fuzzySendType);
            return this;
        }

        public ConditionBuilder rightFuzzySendType (List<String> rightFuzzySendType){
            this.rightFuzzySendType = rightFuzzySendType;
            return this;
        }

        public ConditionBuilder rightFuzzySendType (String ... rightFuzzySendType){
            this.rightFuzzySendType = solveNullList(rightFuzzySendType);
            return this;
        }

        public ConditionBuilder sendTypeList(String ... sendType){
            this.sendTypeList = solveNullList(sendType);
            return this;
        }

        public ConditionBuilder sendTypeList(List<String> sendType){
            this.sendTypeList = sendType;
            return this;
        }

        public ConditionBuilder fuzzyUrl (List<String> fuzzyUrl){
            this.fuzzyUrl = fuzzyUrl;
            return this;
        }

        public ConditionBuilder fuzzyUrl (String ... fuzzyUrl){
            this.fuzzyUrl = solveNullList(fuzzyUrl);
            return this;
        }

        public ConditionBuilder rightFuzzyUrl (List<String> rightFuzzyUrl){
            this.rightFuzzyUrl = rightFuzzyUrl;
            return this;
        }

        public ConditionBuilder rightFuzzyUrl (String ... rightFuzzyUrl){
            this.rightFuzzyUrl = solveNullList(rightFuzzyUrl);
            return this;
        }

        public ConditionBuilder urlList(String ... url){
            this.urlList = solveNullList(url);
            return this;
        }

        public ConditionBuilder urlList(List<String> url){
            this.urlList = url;
            return this;
        }

        public ConditionBuilder fuzzyExecuteParamter (List<String> fuzzyExecuteParamter){
            this.fuzzyExecuteParamter = fuzzyExecuteParamter;
            return this;
        }

        public ConditionBuilder fuzzyExecuteParamter (String ... fuzzyExecuteParamter){
            this.fuzzyExecuteParamter = solveNullList(fuzzyExecuteParamter);
            return this;
        }

        public ConditionBuilder rightFuzzyExecuteParamter (List<String> rightFuzzyExecuteParamter){
            this.rightFuzzyExecuteParamter = rightFuzzyExecuteParamter;
            return this;
        }

        public ConditionBuilder rightFuzzyExecuteParamter (String ... rightFuzzyExecuteParamter){
            this.rightFuzzyExecuteParamter = solveNullList(rightFuzzyExecuteParamter);
            return this;
        }

        public ConditionBuilder executeParamterList(String ... executeParamter){
            this.executeParamterList = solveNullList(executeParamter);
            return this;
        }

        public ConditionBuilder executeParamterList(List<String> executeParamter){
            this.executeParamterList = executeParamter;
            return this;
        }

        public ConditionBuilder fuzzyTimeKey (List<String> fuzzyTimeKey){
            this.fuzzyTimeKey = fuzzyTimeKey;
            return this;
        }

        public ConditionBuilder fuzzyTimeKey (String ... fuzzyTimeKey){
            this.fuzzyTimeKey = solveNullList(fuzzyTimeKey);
            return this;
        }

        public ConditionBuilder rightFuzzyTimeKey (List<String> rightFuzzyTimeKey){
            this.rightFuzzyTimeKey = rightFuzzyTimeKey;
            return this;
        }

        public ConditionBuilder rightFuzzyTimeKey (String ... rightFuzzyTimeKey){
            this.rightFuzzyTimeKey = solveNullList(rightFuzzyTimeKey);
            return this;
        }

        public ConditionBuilder timeKeyList(String ... timeKey){
            this.timeKeyList = solveNullList(timeKey);
            return this;
        }

        public ConditionBuilder timeKeyList(List<String> timeKey){
            this.timeKeyList = timeKey;
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

        private QuartzTaskInformations obj;

        public Builder(){
            this.obj = new QuartzTaskInformations();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder version(Integer version){
            this.obj.setVersion(version);
            return this;
        }
        public Builder taskNo(String taskNo){
            this.obj.setTaskNo(taskNo);
            return this;
        }
        public Builder taskName(String taskName){
            this.obj.setTaskName(taskName);
            return this;
        }
        public Builder schedulerRule(String schedulerRule){
            this.obj.setSchedulerRule(schedulerRule);
            return this;
        }
        public Builder frozenStatus(String frozenStatus){
            this.obj.setFrozenStatus(frozenStatus);
            return this;
        }
        public Builder executorNo(String executorNo){
            this.obj.setExecutorNo(executorNo);
            return this;
        }
        public Builder frozenTime(java.time.LocalDateTime frozenTime){
            this.obj.setFrozenTime(frozenTime);
            return this;
        }
        public Builder unfrozenTime(java.time.LocalDateTime unfrozenTime){
            this.obj.setUnfrozenTime(unfrozenTime);
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
        public Builder sendType(String sendType){
            this.obj.setSendType(sendType);
            return this;
        }
        public Builder url(String url){
            this.obj.setUrl(url);
            return this;
        }
        public Builder executeParamter(String executeParamter){
            this.obj.setExecuteParamter(executeParamter);
            return this;
        }
        public Builder timeKey(String timeKey){
            this.obj.setTimeKey(timeKey);
            return this;
        }
        public QuartzTaskInformations build(){return obj;}
    }

}
