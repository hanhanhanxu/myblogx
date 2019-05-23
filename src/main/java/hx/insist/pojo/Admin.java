package hx.insist.pojo;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class Admin {
    private String aid;

    private String ausername;

    private String apassword;

    private String checkcode;

    private Map<String,String> errors = new HashMap<>();

    //对form表单传送进controller的数据进行简单校验
    public boolean Verification(String checkcode2){
        boolean isOK = true;

        if(checkcode==null || StringUtils.isEmpty(checkcode)){//空
            isOK = false;
            errors.put("checkcode","验证码必填!");
        }else{//非空
            if(!checkcode.equals(checkcode2)){//验证码不正确
                isOK = false;
                errors.put("checkcode","验证码错误!");
            }
        }
        //System.err.println("验证码.");
        if(ausername==null || StringUtils.isEmpty(ausername)){//空
            isOK = false;
            errors.put("username","账号必填!");
        }else{//非空
            if(!ausername.matches("[0-9a-zA-Z]{4,23}")){//不为数字或字母的组合，或超出长度
                isOK = false;
                errors.put("username","账号为4-23位数字或字母的组合!");
            }
        }
        //System.err.println("账号.");
        if(apassword==null || StringUtils.isEmpty(apassword)){//空
            isOK = false;
            errors.put("password","密码必填!");
        }else{//非空
            if(!apassword.matches("[0-9a-zA-Z]{4,23}")){//不为数字或字母的组合，或超出长度
                isOK = false;
                errors.put("password","密码为4-23位数字或字母的组合!");
            }
        }
        //System.err.println("密码.");
        return isOK;
    }

    //进行一些 "额外"的校验
    public boolean Verificationhx(){
        boolean isOK = true;
        if (!ausername.startsWith("myblogx")){//如果账号不是以myblogx开头就直接返回
            isOK=false;
            errors.put("username","账号或密码错误");
        }else{
            if(!apassword.startsWith("myblogx")){//检验密码
                isOK=false;
                errors.put("username","账号或密码错误");
            }
        }
        return isOK;
    }

    public Admin() {
    }

    public Admin(String ausername, String apassword) {
        this.ausername = ausername;
        this.apassword = apassword;
    }

    public Admin(String ausername, String apassword, String checkcode) {
        this.ausername = ausername;
        this.apassword = apassword;
        this.checkcode = checkcode;
    }

    public Admin(String aid, String ausername, String apassword, Map<String, String> errors) {
        this.aid = aid;
        this.ausername = ausername;
        this.apassword = apassword;
        this.errors = errors;
    }

    public Admin(String aid, String ausername, String apassword, String checkcode, Map<String, String> errors) {
        this.aid = aid;
        this.ausername = ausername;
        this.apassword = apassword;
        this.checkcode = checkcode;
        this.errors = errors;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "aid='" + aid + '\'' +
                ", ausername='" + ausername + '\'' +
                ", apassword='" + apassword + '\'' +
                ", checkcode='" + checkcode + '\'' +
                ", errors=" + errors +
                '}';
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid == null ? null : aid.trim();
    }

    public String getAusername() {
        return ausername;
    }

    public void setAusername(String ausername) {
        this.ausername = ausername == null ? null : ausername.trim();
    }

    public String getApassword() {
        return apassword;
    }

    public void setApassword(String apassword) {
        this.apassword = apassword == null ? null : apassword.trim();
    }

    public Map<String, String> getErrors() {
        return errors;
    }

    public void setErrors(Map<String, String> errors) {
        this.errors = errors;
    }

    public String getCheckcode() {
        return checkcode;
    }

    public void setCheckcode(String checkcode) {
        this.checkcode = checkcode;
    }
}