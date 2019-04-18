package third.world.hao.dto;

/**
 * @program: hi
 * @description:
 *
 * @create: 2019-04-01 18:05
 **/
public class ResultTO<T> {
    private int code=200;
    private T result;
    private boolean success = true;
    private String msg;
    private PageTO page;

    public ResultTO() {
    }

    public ResultTO(T result) {
        this.result = result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public PageTO getPage() {
        return page;
    }

    public void setPage(PageTO page) {
        this.page = page;
    }

    public void authException(String msg) {
        this.code = 403;
        this.msg = msg;
        this.success = false;
    }

    public void commonException(String msg) {
        this.code = 400;
        this.msg = msg;
        this.success = false;
    }

    public void serverException(String msg) {
        this.code = 500;
        this.msg = msg;
        this.success = false;
    }
}
