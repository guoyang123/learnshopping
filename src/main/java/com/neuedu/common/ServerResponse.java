package com.neuedu.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 封装返回前端的高复用对象
 * */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ServerResponse<T> {
   //状态码
    private int status;
  // 返回接口数据
    private  T   data;
    //接口提示信息
    private String msg;


    private  ServerResponse(){}
    private  ServerResponse(int status){
        this.status=status;
    }
    private  ServerResponse(int status,String msg){
        this.status=status;
        this.msg=msg;
    }
    private  ServerResponse(int status ,String msg,T data){
        this.status=status;
        this.msg=msg;
        this.data=data;
    }

    /**
     * 判断接口是否调用成功
     * */

    @JsonIgnore
     public   boolean isSuccess(){
        return  this.status==Const.SUCCESS_CODE;
     }

    /**
     * 成功
     * */

    public  static  ServerResponse createServerResponseBySucess(){

        return new ServerResponse(Const.SUCCESS_CODE);

    }
    public  static  ServerResponse createServerResponseBySucess(String msg){

        return new ServerResponse(Const.SUCCESS_CODE,msg);

    }

    public  static <T>  ServerResponse createServerResponseBySucess(String msg,T data){

        return new ServerResponse(Const.SUCCESS_CODE,msg,data);

    }

  /**
   * 失败
   * */
  public  static  ServerResponse createServerResponseByError(){

      return new ServerResponse(Const.SUCCESS_ERROR);
  }
  public  static  ServerResponse createServerResponseByError(String msg){

        return new ServerResponse(Const.SUCCESS_ERROR,msg);
  }
    public  static  ServerResponse createServerResponseByError(int status){
        return new ServerResponse(status);
    }
    public  static  ServerResponse createServerResponseByError(int status,String msg){

        return new ServerResponse(status,msg);
    }
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
