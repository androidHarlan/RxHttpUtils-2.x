package com.allen.rxhttputils.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/1/17.
 */
public class LoginBean {

    /**
     * identifier :
     * membersList : [{"identifier":"","sex":1,"name":"会员1","iconUrl":"http://ok2n8epc1.bkt.clouddn.com/static/c5/4e/62/67/2e480c692dfb4b109bbebe3e2cab73a1.png","age":18,"memberId":"8a10873662b451290162b4dd92ac0034"},{"identifier":"","sex":1,"name":"会员2","iconUrl":"http://ok2n8epc1.bkt.clouddn.com/static/ba/f8/d7/3e/048310d788b14d5eabdc8b13eccdd568.jpg","age":20,"memberId":"8a10873662b451290162b777dbec0197"}]
     * qrUrl :
     * sex : 0
     * name : 测试号
     * isInformation : 1
     * sessionId : b5c68b166c5541e0a6be8d525a2a6f83
     * iconUrl : http://ok2n8epc1.bkt.clouddn.com/static/b2/e5/f2/1b/f7ece3e4efe441acbecb8344665eb159.jpg
     * position : 内科主任
     * userSig :
     * hospital :
     * userId : d5c68b166c5541e0a6be8d525a2a6f82
     */

    private String identifier;
    private String qrUrl;
    private String sex;
    private String name;
    private String isInformation;
    private String sessionId;
    private String iconUrl;
    private String position;
    private String userSig;
    private String hospital;
    private String userId;
    private List<MembersListBean> membersList;

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getQrUrl() {
        return qrUrl;
    }

    public void setQrUrl(String qrUrl) {
        this.qrUrl = qrUrl;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsInformation() {
        return isInformation;
    }

    public void setIsInformation(String isInformation) {
        this.isInformation = isInformation;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getUserSig() {
        return userSig;
    }

    public void setUserSig(String userSig) {
        this.userSig = userSig;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<MembersListBean> getMembersList() {
        return membersList;
    }

    public void setMembersList(List<MembersListBean> membersList) {
        this.membersList = membersList;
    }

    public static class MembersListBean {
        /**
         * identifier :
         * sex : 1
         * name : 会员1
         * iconUrl : http://ok2n8epc1.bkt.clouddn.com/static/c5/4e/62/67/2e480c692dfb4b109bbebe3e2cab73a1.png
         * age : 18
         * memberId : 8a10873662b451290162b4dd92ac0034
         */

        private String identifier;
        private int sex;
        private String name;
        private String iconUrl;
        private int age;
        private String memberId;

        public String getIdentifier() {
            return identifier;
        }

        public void setIdentifier(String identifier) {
            this.identifier = identifier;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getIconUrl() {
            return iconUrl;
        }

        public void setIconUrl(String iconUrl) {
            this.iconUrl = iconUrl;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getMemberId() {
            return memberId;
        }

        public void setMemberId(String memberId) {
            this.memberId = memberId;
        }
    }
}
