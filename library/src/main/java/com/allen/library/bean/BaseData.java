package com.allen.library.bean;

/**
 * Created by Allen on 2017/10/23.
 *
 * @author Allen
 *         <p>
 *         返回数据基类
 */

public class BaseData<T> {
    /**
     * 错误码
     */
    private int result;
    /**
     * 错误描述
     */
    private String resultDesc;

    /**
     * 数据
     */
    private T resultData;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    public T getResultData() {
        return resultData;
    }

    public void setResultData(T resultData) {
        this.resultData = resultData;
    }

    @Override
    public String toString() {
        return "BaseData{" +
                "result=" + result +
                ", resultDesc='" + resultDesc + '\'' +
                ", resultData=" + resultData +
                '}';
    }
}
