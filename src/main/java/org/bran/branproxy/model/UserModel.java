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
public class UserModel implements Serializable {

    private static final long serialVersionUID = 1552819645505L;


    /**
    * 主键
    * 
    * isNullAble:0
    */
    private Long id;

    /**
    * 
    * isNullAble:0,defaultVal:
    */
    private String title;

    /**
    * 
    * isNullAble:0,defaultVal:
    */
    private String pwd;

    /**
    * 
    * isNullAble:0,defaultVal:
    */
    private String email;

    /**
    * 
    * isNullAble:0,defaultVal:
    */
    private String salt;

    /**
    * 0未删，1已删
    * isNullAble:0,defaultVal:0
    */
    private Integer isDelete;

    /**
    * 
    * isNullAble:0,defaultVal:0000-00-00 00:00:00
    */
    private java.time.LocalDateTime lastUpdateTime;

    /**
    * 
    * isNullAble:0,defaultVal:
    */
    private String lastLoginAddress;


    public void setId(Long id){this.id = id;}

    public Long getId(){return this.id;}

    public void setTitle(String title){this.title = title;}

    public String getTitle(){return this.title;}

    public void setPwd(String pwd){this.pwd = pwd;}

    public String getPwd(){return this.pwd;}

    public void setEmail(String email){this.email = email;}

    public String getEmail(){return this.email;}

    public void setSalt(String salt){this.salt = salt;}

    public String getSalt(){return this.salt;}

    public void setIsDelete(Integer isDelete){this.isDelete = isDelete;}

    public Integer getIsDelete(){return this.isDelete;}

    public void setLastUpdateTime(java.time.LocalDateTime lastUpdateTime){this.lastUpdateTime = lastUpdateTime;}

    public java.time.LocalDateTime getLastUpdateTime(){return this.lastUpdateTime;}

    public void setLastLoginAddress(String lastLoginAddress){this.lastLoginAddress = lastLoginAddress;}

    public String getLastLoginAddress(){return this.lastLoginAddress;}
    @Override
    public String toString() {
        return "UserModel{" +
                "id='" + id + '\'' +
                "title='" + title + '\'' +
                "pwd='" + pwd + '\'' +
                "email='" + email + '\'' +
                "salt='" + salt + '\'' +
                "isDelete='" + isDelete + '\'' +
                "lastUpdateTime='" + lastUpdateTime + '\'' +
                "lastLoginAddress='" + lastLoginAddress + '\'' +
            '}';
    }

    public static Builder Build(){return new Builder();}

    public static ConditionBuilder ConditionBuild(){return new ConditionBuilder();}

    public static UpdateBuilder UpdateBuild(){return new UpdateBuilder();}

    public static QueryBuilder QueryBuild(){return new QueryBuilder();}

    public static class UpdateBuilder {

        private UserModel set;

        private ConditionBuilder where;

        public UpdateBuilder set(UserModel set){
            this.set = set;
            return this;
        }

        public UserModel getSet(){
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

    public static class QueryBuilder extends UserModel{
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

        private List<String> titleList;

        public List<String> getTitleList(){return this.titleList;}


        private List<String> fuzzyTitle;

        public List<String> getFuzzyTitle(){return this.fuzzyTitle;}

        private List<String> rightFuzzyTitle;

        public List<String> getRightFuzzyTitle(){return this.rightFuzzyTitle;}
        private List<String> pwdList;

        public List<String> getPwdList(){return this.pwdList;}


        private List<String> fuzzyPwd;

        public List<String> getFuzzyPwd(){return this.fuzzyPwd;}

        private List<String> rightFuzzyPwd;

        public List<String> getRightFuzzyPwd(){return this.rightFuzzyPwd;}
        private List<String> emailList;

        public List<String> getEmailList(){return this.emailList;}


        private List<String> fuzzyEmail;

        public List<String> getFuzzyEmail(){return this.fuzzyEmail;}

        private List<String> rightFuzzyEmail;

        public List<String> getRightFuzzyEmail(){return this.rightFuzzyEmail;}
        private List<String> saltList;

        public List<String> getSaltList(){return this.saltList;}


        private List<String> fuzzySalt;

        public List<String> getFuzzySalt(){return this.fuzzySalt;}

        private List<String> rightFuzzySalt;

        public List<String> getRightFuzzySalt(){return this.rightFuzzySalt;}
        private List<Integer> isDeleteList;

        public List<Integer> getIsDeleteList(){return this.isDeleteList;}

        private Integer isDeleteSt;

        private Integer isDeleteEd;

        public Integer getIsDeleteSt(){return this.isDeleteSt;}

        public Integer getIsDeleteEd(){return this.isDeleteEd;}

        private List<java.time.LocalDateTime> lastUpdateTimeList;

        public List<java.time.LocalDateTime> getLastUpdateTimeList(){return this.lastUpdateTimeList;}

        private java.time.LocalDateTime lastUpdateTimeSt;

        private java.time.LocalDateTime lastUpdateTimeEd;

        public java.time.LocalDateTime getLastUpdateTimeSt(){return this.lastUpdateTimeSt;}

        public java.time.LocalDateTime getLastUpdateTimeEd(){return this.lastUpdateTimeEd;}

        private List<String> lastLoginAddressList;

        public List<String> getLastLoginAddressList(){return this.lastLoginAddressList;}


        private List<String> fuzzyLastLoginAddress;

        public List<String> getFuzzyLastLoginAddress(){return this.fuzzyLastLoginAddress;}

        private List<String> rightFuzzyLastLoginAddress;

        public List<String> getRightFuzzyLastLoginAddress(){return this.rightFuzzyLastLoginAddress;}
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

        public QueryBuilder fuzzyTitle (List<String> fuzzyTitle){
            this.fuzzyTitle = fuzzyTitle;
            return this;
        }

        public QueryBuilder fuzzyTitle (String ... fuzzyTitle){
            this.fuzzyTitle = solveNullList(fuzzyTitle);
            return this;
        }

        public QueryBuilder rightFuzzyTitle (List<String> rightFuzzyTitle){
            this.rightFuzzyTitle = rightFuzzyTitle;
            return this;
        }

        public QueryBuilder rightFuzzyTitle (String ... rightFuzzyTitle){
            this.rightFuzzyTitle = solveNullList(rightFuzzyTitle);
            return this;
        }

        public QueryBuilder title(String title){
            setTitle(title);
            return this;
        }

        public QueryBuilder titleList(String ... title){
            this.titleList = solveNullList(title);
            return this;
        }

        public QueryBuilder titleList(List<String> title){
            this.titleList = title;
            return this;
        }

        public QueryBuilder fetchTitle(){
            setFetchFields("fetchFields","title");
            return this;
        }

        public QueryBuilder excludeTitle(){
            setFetchFields("excludeFields","title");
            return this;
        }

        public QueryBuilder fuzzyPwd (List<String> fuzzyPwd){
            this.fuzzyPwd = fuzzyPwd;
            return this;
        }

        public QueryBuilder fuzzyPwd (String ... fuzzyPwd){
            this.fuzzyPwd = solveNullList(fuzzyPwd);
            return this;
        }

        public QueryBuilder rightFuzzyPwd (List<String> rightFuzzyPwd){
            this.rightFuzzyPwd = rightFuzzyPwd;
            return this;
        }

        public QueryBuilder rightFuzzyPwd (String ... rightFuzzyPwd){
            this.rightFuzzyPwd = solveNullList(rightFuzzyPwd);
            return this;
        }

        public QueryBuilder pwd(String pwd){
            setPwd(pwd);
            return this;
        }

        public QueryBuilder pwdList(String ... pwd){
            this.pwdList = solveNullList(pwd);
            return this;
        }

        public QueryBuilder pwdList(List<String> pwd){
            this.pwdList = pwd;
            return this;
        }

        public QueryBuilder fetchPwd(){
            setFetchFields("fetchFields","pwd");
            return this;
        }

        public QueryBuilder excludePwd(){
            setFetchFields("excludeFields","pwd");
            return this;
        }

        public QueryBuilder fuzzyEmail (List<String> fuzzyEmail){
            this.fuzzyEmail = fuzzyEmail;
            return this;
        }

        public QueryBuilder fuzzyEmail (String ... fuzzyEmail){
            this.fuzzyEmail = solveNullList(fuzzyEmail);
            return this;
        }

        public QueryBuilder rightFuzzyEmail (List<String> rightFuzzyEmail){
            this.rightFuzzyEmail = rightFuzzyEmail;
            return this;
        }

        public QueryBuilder rightFuzzyEmail (String ... rightFuzzyEmail){
            this.rightFuzzyEmail = solveNullList(rightFuzzyEmail);
            return this;
        }

        public QueryBuilder email(String email){
            setEmail(email);
            return this;
        }

        public QueryBuilder emailList(String ... email){
            this.emailList = solveNullList(email);
            return this;
        }

        public QueryBuilder emailList(List<String> email){
            this.emailList = email;
            return this;
        }

        public QueryBuilder fetchEmail(){
            setFetchFields("fetchFields","email");
            return this;
        }

        public QueryBuilder excludeEmail(){
            setFetchFields("excludeFields","email");
            return this;
        }

        public QueryBuilder fuzzySalt (List<String> fuzzySalt){
            this.fuzzySalt = fuzzySalt;
            return this;
        }

        public QueryBuilder fuzzySalt (String ... fuzzySalt){
            this.fuzzySalt = solveNullList(fuzzySalt);
            return this;
        }

        public QueryBuilder rightFuzzySalt (List<String> rightFuzzySalt){
            this.rightFuzzySalt = rightFuzzySalt;
            return this;
        }

        public QueryBuilder rightFuzzySalt (String ... rightFuzzySalt){
            this.rightFuzzySalt = solveNullList(rightFuzzySalt);
            return this;
        }

        public QueryBuilder salt(String salt){
            setSalt(salt);
            return this;
        }

        public QueryBuilder saltList(String ... salt){
            this.saltList = solveNullList(salt);
            return this;
        }

        public QueryBuilder saltList(List<String> salt){
            this.saltList = salt;
            return this;
        }

        public QueryBuilder fetchSalt(){
            setFetchFields("fetchFields","salt");
            return this;
        }

        public QueryBuilder excludeSalt(){
            setFetchFields("excludeFields","salt");
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

        public QueryBuilder fuzzyLastLoginAddress (List<String> fuzzyLastLoginAddress){
            this.fuzzyLastLoginAddress = fuzzyLastLoginAddress;
            return this;
        }

        public QueryBuilder fuzzyLastLoginAddress (String ... fuzzyLastLoginAddress){
            this.fuzzyLastLoginAddress = solveNullList(fuzzyLastLoginAddress);
            return this;
        }

        public QueryBuilder rightFuzzyLastLoginAddress (List<String> rightFuzzyLastLoginAddress){
            this.rightFuzzyLastLoginAddress = rightFuzzyLastLoginAddress;
            return this;
        }

        public QueryBuilder rightFuzzyLastLoginAddress (String ... rightFuzzyLastLoginAddress){
            this.rightFuzzyLastLoginAddress = solveNullList(rightFuzzyLastLoginAddress);
            return this;
        }

        public QueryBuilder lastLoginAddress(String lastLoginAddress){
            setLastLoginAddress(lastLoginAddress);
            return this;
        }

        public QueryBuilder lastLoginAddressList(String ... lastLoginAddress){
            this.lastLoginAddressList = solveNullList(lastLoginAddress);
            return this;
        }

        public QueryBuilder lastLoginAddressList(List<String> lastLoginAddress){
            this.lastLoginAddressList = lastLoginAddress;
            return this;
        }

        public QueryBuilder fetchLastLoginAddress(){
            setFetchFields("fetchFields","lastLoginAddress");
            return this;
        }

        public QueryBuilder excludeLastLoginAddress(){
            setFetchFields("excludeFields","lastLoginAddress");
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

        public UserModel build(){return this;}
    }


    public static class ConditionBuilder{
        private List<Long> idList;

        public List<Long> getIdList(){return this.idList;}

        private Long idSt;

        private Long idEd;

        public Long getIdSt(){return this.idSt;}

        public Long getIdEd(){return this.idEd;}

        private List<String> titleList;

        public List<String> getTitleList(){return this.titleList;}


        private List<String> fuzzyTitle;

        public List<String> getFuzzyTitle(){return this.fuzzyTitle;}

        private List<String> rightFuzzyTitle;

        public List<String> getRightFuzzyTitle(){return this.rightFuzzyTitle;}
        private List<String> pwdList;

        public List<String> getPwdList(){return this.pwdList;}


        private List<String> fuzzyPwd;

        public List<String> getFuzzyPwd(){return this.fuzzyPwd;}

        private List<String> rightFuzzyPwd;

        public List<String> getRightFuzzyPwd(){return this.rightFuzzyPwd;}
        private List<String> emailList;

        public List<String> getEmailList(){return this.emailList;}


        private List<String> fuzzyEmail;

        public List<String> getFuzzyEmail(){return this.fuzzyEmail;}

        private List<String> rightFuzzyEmail;

        public List<String> getRightFuzzyEmail(){return this.rightFuzzyEmail;}
        private List<String> saltList;

        public List<String> getSaltList(){return this.saltList;}


        private List<String> fuzzySalt;

        public List<String> getFuzzySalt(){return this.fuzzySalt;}

        private List<String> rightFuzzySalt;

        public List<String> getRightFuzzySalt(){return this.rightFuzzySalt;}
        private List<Integer> isDeleteList;

        public List<Integer> getIsDeleteList(){return this.isDeleteList;}

        private Integer isDeleteSt;

        private Integer isDeleteEd;

        public Integer getIsDeleteSt(){return this.isDeleteSt;}

        public Integer getIsDeleteEd(){return this.isDeleteEd;}

        private List<java.time.LocalDateTime> lastUpdateTimeList;

        public List<java.time.LocalDateTime> getLastUpdateTimeList(){return this.lastUpdateTimeList;}

        private java.time.LocalDateTime lastUpdateTimeSt;

        private java.time.LocalDateTime lastUpdateTimeEd;

        public java.time.LocalDateTime getLastUpdateTimeSt(){return this.lastUpdateTimeSt;}

        public java.time.LocalDateTime getLastUpdateTimeEd(){return this.lastUpdateTimeEd;}

        private List<String> lastLoginAddressList;

        public List<String> getLastLoginAddressList(){return this.lastLoginAddressList;}


        private List<String> fuzzyLastLoginAddress;

        public List<String> getFuzzyLastLoginAddress(){return this.fuzzyLastLoginAddress;}

        private List<String> rightFuzzyLastLoginAddress;

        public List<String> getRightFuzzyLastLoginAddress(){return this.rightFuzzyLastLoginAddress;}

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

        public ConditionBuilder fuzzyTitle (List<String> fuzzyTitle){
            this.fuzzyTitle = fuzzyTitle;
            return this;
        }

        public ConditionBuilder fuzzyTitle (String ... fuzzyTitle){
            this.fuzzyTitle = solveNullList(fuzzyTitle);
            return this;
        }

        public ConditionBuilder rightFuzzyTitle (List<String> rightFuzzyTitle){
            this.rightFuzzyTitle = rightFuzzyTitle;
            return this;
        }

        public ConditionBuilder rightFuzzyTitle (String ... rightFuzzyTitle){
            this.rightFuzzyTitle = solveNullList(rightFuzzyTitle);
            return this;
        }

        public ConditionBuilder titleList(String ... title){
            this.titleList = solveNullList(title);
            return this;
        }

        public ConditionBuilder titleList(List<String> title){
            this.titleList = title;
            return this;
        }

        public ConditionBuilder fuzzyPwd (List<String> fuzzyPwd){
            this.fuzzyPwd = fuzzyPwd;
            return this;
        }

        public ConditionBuilder fuzzyPwd (String ... fuzzyPwd){
            this.fuzzyPwd = solveNullList(fuzzyPwd);
            return this;
        }

        public ConditionBuilder rightFuzzyPwd (List<String> rightFuzzyPwd){
            this.rightFuzzyPwd = rightFuzzyPwd;
            return this;
        }

        public ConditionBuilder rightFuzzyPwd (String ... rightFuzzyPwd){
            this.rightFuzzyPwd = solveNullList(rightFuzzyPwd);
            return this;
        }

        public ConditionBuilder pwdList(String ... pwd){
            this.pwdList = solveNullList(pwd);
            return this;
        }

        public ConditionBuilder pwdList(List<String> pwd){
            this.pwdList = pwd;
            return this;
        }

        public ConditionBuilder fuzzyEmail (List<String> fuzzyEmail){
            this.fuzzyEmail = fuzzyEmail;
            return this;
        }

        public ConditionBuilder fuzzyEmail (String ... fuzzyEmail){
            this.fuzzyEmail = solveNullList(fuzzyEmail);
            return this;
        }

        public ConditionBuilder rightFuzzyEmail (List<String> rightFuzzyEmail){
            this.rightFuzzyEmail = rightFuzzyEmail;
            return this;
        }

        public ConditionBuilder rightFuzzyEmail (String ... rightFuzzyEmail){
            this.rightFuzzyEmail = solveNullList(rightFuzzyEmail);
            return this;
        }

        public ConditionBuilder emailList(String ... email){
            this.emailList = solveNullList(email);
            return this;
        }

        public ConditionBuilder emailList(List<String> email){
            this.emailList = email;
            return this;
        }

        public ConditionBuilder fuzzySalt (List<String> fuzzySalt){
            this.fuzzySalt = fuzzySalt;
            return this;
        }

        public ConditionBuilder fuzzySalt (String ... fuzzySalt){
            this.fuzzySalt = solveNullList(fuzzySalt);
            return this;
        }

        public ConditionBuilder rightFuzzySalt (List<String> rightFuzzySalt){
            this.rightFuzzySalt = rightFuzzySalt;
            return this;
        }

        public ConditionBuilder rightFuzzySalt (String ... rightFuzzySalt){
            this.rightFuzzySalt = solveNullList(rightFuzzySalt);
            return this;
        }

        public ConditionBuilder saltList(String ... salt){
            this.saltList = solveNullList(salt);
            return this;
        }

        public ConditionBuilder saltList(List<String> salt){
            this.saltList = salt;
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

        public ConditionBuilder fuzzyLastLoginAddress (List<String> fuzzyLastLoginAddress){
            this.fuzzyLastLoginAddress = fuzzyLastLoginAddress;
            return this;
        }

        public ConditionBuilder fuzzyLastLoginAddress (String ... fuzzyLastLoginAddress){
            this.fuzzyLastLoginAddress = solveNullList(fuzzyLastLoginAddress);
            return this;
        }

        public ConditionBuilder rightFuzzyLastLoginAddress (List<String> rightFuzzyLastLoginAddress){
            this.rightFuzzyLastLoginAddress = rightFuzzyLastLoginAddress;
            return this;
        }

        public ConditionBuilder rightFuzzyLastLoginAddress (String ... rightFuzzyLastLoginAddress){
            this.rightFuzzyLastLoginAddress = solveNullList(rightFuzzyLastLoginAddress);
            return this;
        }

        public ConditionBuilder lastLoginAddressList(String ... lastLoginAddress){
            this.lastLoginAddressList = solveNullList(lastLoginAddress);
            return this;
        }

        public ConditionBuilder lastLoginAddressList(List<String> lastLoginAddress){
            this.lastLoginAddressList = lastLoginAddress;
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

        private UserModel obj;

        public Builder(){
            this.obj = new UserModel();
        }

        public Builder id(Long id){
            this.obj.setId(id);
            return this;
        }
        public Builder title(String title){
            this.obj.setTitle(title);
            return this;
        }
        public Builder pwd(String pwd){
            this.obj.setPwd(pwd);
            return this;
        }
        public Builder email(String email){
            this.obj.setEmail(email);
            return this;
        }
        public Builder salt(String salt){
            this.obj.setSalt(salt);
            return this;
        }
        public Builder isDelete(Integer isDelete){
            this.obj.setIsDelete(isDelete);
            return this;
        }
        public Builder lastUpdateTime(java.time.LocalDateTime lastUpdateTime){
            this.obj.setLastUpdateTime(lastUpdateTime);
            return this;
        }
        public Builder lastLoginAddress(String lastLoginAddress){
            this.obj.setLastLoginAddress(lastLoginAddress);
            return this;
        }
        public UserModel build(){return obj;}
    }

}
