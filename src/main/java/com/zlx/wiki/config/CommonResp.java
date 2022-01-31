package com.zlx.wiki.config;

public class CommonResp<T> {
    // 成功或者失败
    private boolean success = true;
    // 完成后的提示信息
    private String message;
    // 返回的数据 因为不确定返回的类型 所以定义为泛型
    private T content;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
