// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: personalCenter/msg_common.proto

package com.wanfang.personal;

public interface UploadFileRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:personal.UploadFileRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .personal.FileMetaData meta_data = 1;</code>
   */
  boolean hasMetaData();
  /**
   * <code>optional .personal.FileMetaData meta_data = 1;</code>
   */
  com.wanfang.personal.FileMetaData getMetaData();
  /**
   * <code>optional .personal.FileMetaData meta_data = 1;</code>
   */
  com.wanfang.personal.FileMetaDataOrBuilder getMetaDataOrBuilder();

  /**
   * <code>optional bytes file_data = 2;</code>
   */
  com.google.protobuf.ByteString getFileData();
}
