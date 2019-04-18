package third.world.hao.exception;

/**
 * @program: demo
 * @description:
 *
 * @create: 2019-02-01 00:03
 **/
public class CommonException extends RuntimeException {
    private String msg;

    public CommonException(String msg){
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
