// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: home/msg_home.proto

package com.wanfang.home;

public interface GetLastPerioResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:home.GetLastPerioResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .home.GetLastPerioResponse.LastPerioMessage perio_message = 1;</code>
   */
  java.util.List<com.wanfang.home.GetLastPerioResponse.LastPerioMessage> 
      getPerioMessageList();
  /**
   * <code>repeated .home.GetLastPerioResponse.LastPerioMessage perio_message = 1;</code>
   */
  com.wanfang.home.GetLastPerioResponse.LastPerioMessage getPerioMessage(int index);
  /**
   * <code>repeated .home.GetLastPerioResponse.LastPerioMessage perio_message = 1;</code>
   */
  int getPerioMessageCount();
  /**
   * <code>repeated .home.GetLastPerioResponse.LastPerioMessage perio_message = 1;</code>
   */
  java.util.List<? extends com.wanfang.home.GetLastPerioResponse.LastPerioMessageOrBuilder> 
      getPerioMessageOrBuilderList();
  /**
   * <code>repeated .home.GetLastPerioResponse.LastPerioMessage perio_message = 1;</code>
   */
  com.wanfang.home.GetLastPerioResponse.LastPerioMessageOrBuilder getPerioMessageOrBuilder(
      int index);

  /**
   * <code>optional .grpcCommon.GrpcError error = 2;</code>
   */
  boolean hasError();
  /**
   * <code>optional .grpcCommon.GrpcError error = 2;</code>
   */
  com.wanfang.grpcCommon.MsgError.GrpcError getError();
  /**
   * <code>optional .grpcCommon.GrpcError error = 2;</code>
   */
  com.wanfang.grpcCommon.MsgError.GrpcErrorOrBuilder getErrorOrBuilder();

  /**
   * <code>optional bool has_more = 3;</code>
   */
  boolean getHasMore();
}
