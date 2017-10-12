package com.book.api.utils;

import java.util.HashMap;
import java.util.Map;

public class ApiReturn {
    private int status;
    private String message;
    private boolean apiTrue;
    private Object  data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean apiTrue() {
        return apiTrue;
    }

    public void setTrue(boolean aTrue) {
        this.apiTrue = aTrue;
    }

    public ApiReturn(int status, String message, boolean apiTrue) {
        this.status = status;
        this.message = message;
        this.apiTrue = apiTrue;
    }

    public ApiReturn(int status, String message, boolean apiTrue,Object data) {
        this.status = status;
        this.message = message;
        this.apiTrue = apiTrue;
        this.data = data;
    }

    @Override
    public String toString() {
        return "ApiReturn{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", apiTrue=" + apiTrue +
                ", data=" + data +
                '}';
    }
}
