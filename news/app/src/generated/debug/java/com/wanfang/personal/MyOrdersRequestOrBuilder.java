// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: personalCenter/msg_my_orders.proto

package com.wanfang.personal;

public interface MyOrdersRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:personal.MyOrdersRequest)
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
   * <code>optional int32 page_number = 2;</code>
   */
  int getPageNumber();

  /**
   * <code>optional int32 page_size = 3;</code>
   */
  int getPageSize();
}