// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: personalCenter/msg_login.proto

package com.wanfang.personal;

public interface LoginOutRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:personal.LoginOutRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 用户id
   * </pre>
   *
   * <code>optional string user_id = 1;</code>
   */
  java.lang.String getUserId();
  /**
   * <pre>
   * 用户id
   * </pre>
   *
   * <code>optional string user_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <pre>
   * 单点登录token
   * </pre>
   *
   * <code>optional string login_token = 2;</code>
   */
  java.lang.String getLoginToken();
  /**
   * <pre>
   * 单点登录token
   * </pre>
   *
   * <code>optional string login_token = 2;</code>
   */
  com.google.protobuf.ByteString
      getLoginTokenBytes();
}
