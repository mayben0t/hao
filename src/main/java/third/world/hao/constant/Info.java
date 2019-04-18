package third.world.hao.constant;

public enum Info {
    ADMIN("admin","管理员帐号");

    private String code;
    private String describe;

    Info(String code,String describe){
        this.code=code;
        this.describe = describe;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
