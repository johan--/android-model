// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: personalCenter/msg_common.proto

package com.wanfang.personal;

/**
 * Protobuf type {@code personal.UploadFileRequest}
 */
public  final class UploadFileRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:personal.UploadFileRequest)
    UploadFileRequestOrBuilder {
  // Use UploadFileRequest.newBuilder() to construct.
  private UploadFileRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UploadFileRequest() {
    fileData_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private UploadFileRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.wanfang.personal.FileMetaData.Builder subBuilder = null;
            if (metaData_ != null) {
              subBuilder = metaData_.toBuilder();
            }
            metaData_ = input.readMessage(com.wanfang.personal.FileMetaData.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(metaData_);
              metaData_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {

            fileData_ = input.readBytes();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.wanfang.personal.MsgCommon.internal_static_personal_UploadFileRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wanfang.personal.MsgCommon.internal_static_personal_UploadFileRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wanfang.personal.UploadFileRequest.class, com.wanfang.personal.UploadFileRequest.Builder.class);
  }

  public static final int META_DATA_FIELD_NUMBER = 1;
  private com.wanfang.personal.FileMetaData metaData_;
  /**
   * <code>optional .personal.FileMetaData meta_data = 1;</code>
   */
  public boolean hasMetaData() {
    return metaData_ != null;
  }
  /**
   * <code>optional .personal.FileMetaData meta_data = 1;</code>
   */
  public com.wanfang.personal.FileMetaData getMetaData() {
    return metaData_ == null ? com.wanfang.personal.FileMetaData.getDefaultInstance() : metaData_;
  }
  /**
   * <code>optional .personal.FileMetaData meta_data = 1;</code>
   */
  public com.wanfang.personal.FileMetaDataOrBuilder getMetaDataOrBuilder() {
    return getMetaData();
  }

  public static final int FILE_DATA_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString fileData_;
  /**
   * <code>optional bytes file_data = 2;</code>
   */
  public com.google.protobuf.ByteString getFileData() {
    return fileData_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (metaData_ != null) {
      output.writeMessage(1, getMetaData());
    }
    if (!fileData_.isEmpty()) {
      output.writeBytes(2, fileData_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (metaData_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMetaData());
    }
    if (!fileData_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, fileData_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.wanfang.personal.UploadFileRequest)) {
      return super.equals(obj);
    }
    com.wanfang.personal.UploadFileRequest other = (com.wanfang.personal.UploadFileRequest) obj;

    boolean result = true;
    result = result && (hasMetaData() == other.hasMetaData());
    if (hasMetaData()) {
      result = result && getMetaData()
          .equals(other.getMetaData());
    }
    result = result && getFileData()
        .equals(other.getFileData());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (hasMetaData()) {
      hash = (37 * hash) + META_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getMetaData().hashCode();
    }
    hash = (37 * hash) + FILE_DATA_FIELD_NUMBER;
    hash = (53 * hash) + getFileData().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wanfang.personal.UploadFileRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.personal.UploadFileRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.personal.UploadFileRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.personal.UploadFileRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.personal.UploadFileRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.UploadFileRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.personal.UploadFileRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.UploadFileRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.personal.UploadFileRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.UploadFileRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.wanfang.personal.UploadFileRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code personal.UploadFileRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:personal.UploadFileRequest)
      com.wanfang.personal.UploadFileRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanfang.personal.MsgCommon.internal_static_personal_UploadFileRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanfang.personal.MsgCommon.internal_static_personal_UploadFileRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanfang.personal.UploadFileRequest.class, com.wanfang.personal.UploadFileRequest.Builder.class);
    }

    // Construct using com.wanfang.personal.UploadFileRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (metaDataBuilder_ == null) {
        metaData_ = null;
      } else {
        metaData_ = null;
        metaDataBuilder_ = null;
      }
      fileData_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wanfang.personal.MsgCommon.internal_static_personal_UploadFileRequest_descriptor;
    }

    public com.wanfang.personal.UploadFileRequest getDefaultInstanceForType() {
      return com.wanfang.personal.UploadFileRequest.getDefaultInstance();
    }

    public com.wanfang.personal.UploadFileRequest build() {
      com.wanfang.personal.UploadFileRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.wanfang.personal.UploadFileRequest buildPartial() {
      com.wanfang.personal.UploadFileRequest result = new com.wanfang.personal.UploadFileRequest(this);
      if (metaDataBuilder_ == null) {
        result.metaData_ = metaData_;
      } else {
        result.metaData_ = metaDataBuilder_.build();
      }
      result.fileData_ = fileData_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.wanfang.personal.UploadFileRequest) {
        return mergeFrom((com.wanfang.personal.UploadFileRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wanfang.personal.UploadFileRequest other) {
      if (other == com.wanfang.personal.UploadFileRequest.getDefaultInstance()) return this;
      if (other.hasMetaData()) {
        mergeMetaData(other.getMetaData());
      }
      if (other.getFileData() != com.google.protobuf.ByteString.EMPTY) {
        setFileData(other.getFileData());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.wanfang.personal.UploadFileRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wanfang.personal.UploadFileRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.wanfang.personal.FileMetaData metaData_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.wanfang.personal.FileMetaData, com.wanfang.personal.FileMetaData.Builder, com.wanfang.personal.FileMetaDataOrBuilder> metaDataBuilder_;
    /**
     * <code>optional .personal.FileMetaData meta_data = 1;</code>
     */
    public boolean hasMetaData() {
      return metaDataBuilder_ != null || metaData_ != null;
    }
    /**
     * <code>optional .personal.FileMetaData meta_data = 1;</code>
     */
    public com.wanfang.personal.FileMetaData getMetaData() {
      if (metaDataBuilder_ == null) {
        return metaData_ == null ? com.wanfang.personal.FileMetaData.getDefaultInstance() : metaData_;
      } else {
        return metaDataBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .personal.FileMetaData meta_data = 1;</code>
     */
    public Builder setMetaData(com.wanfang.personal.FileMetaData value) {
      if (metaDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metaData_ = value;
        onChanged();
      } else {
        metaDataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .personal.FileMetaData meta_data = 1;</code>
     */
    public Builder setMetaData(
        com.wanfang.personal.FileMetaData.Builder builderForValue) {
      if (metaDataBuilder_ == null) {
        metaData_ = builderForValue.build();
        onChanged();
      } else {
        metaDataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .personal.FileMetaData meta_data = 1;</code>
     */
    public Builder mergeMetaData(com.wanfang.personal.FileMetaData value) {
      if (metaDataBuilder_ == null) {
        if (metaData_ != null) {
          metaData_ =
            com.wanfang.personal.FileMetaData.newBuilder(metaData_).mergeFrom(value).buildPartial();
        } else {
          metaData_ = value;
        }
        onChanged();
      } else {
        metaDataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .personal.FileMetaData meta_data = 1;</code>
     */
    public Builder clearMetaData() {
      if (metaDataBuilder_ == null) {
        metaData_ = null;
        onChanged();
      } else {
        metaData_ = null;
        metaDataBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .personal.FileMetaData meta_data = 1;</code>
     */
    public com.wanfang.personal.FileMetaData.Builder getMetaDataBuilder() {
      
      onChanged();
      return getMetaDataFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .personal.FileMetaData meta_data = 1;</code>
     */
    public com.wanfang.personal.FileMetaDataOrBuilder getMetaDataOrBuilder() {
      if (metaDataBuilder_ != null) {
        return metaDataBuilder_.getMessageOrBuilder();
      } else {
        return metaData_ == null ?
            com.wanfang.personal.FileMetaData.getDefaultInstance() : metaData_;
      }
    }
    /**
     * <code>optional .personal.FileMetaData meta_data = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.wanfang.personal.FileMetaData, com.wanfang.personal.FileMetaData.Builder, com.wanfang.personal.FileMetaDataOrBuilder> 
        getMetaDataFieldBuilder() {
      if (metaDataBuilder_ == null) {
        metaDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.wanfang.personal.FileMetaData, com.wanfang.personal.FileMetaData.Builder, com.wanfang.personal.FileMetaDataOrBuilder>(
                getMetaData(),
                getParentForChildren(),
                isClean());
        metaData_ = null;
      }
      return metaDataBuilder_;
    }

    private com.google.protobuf.ByteString fileData_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>optional bytes file_data = 2;</code>
     */
    public com.google.protobuf.ByteString getFileData() {
      return fileData_;
    }
    /**
     * <code>optional bytes file_data = 2;</code>
     */
    public Builder setFileData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fileData_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bytes file_data = 2;</code>
     */
    public Builder clearFileData() {
      
      fileData_ = getDefaultInstance().getFileData();
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:personal.UploadFileRequest)
  }

  // @@protoc_insertion_point(class_scope:personal.UploadFileRequest)
  private static final com.wanfang.personal.UploadFileRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wanfang.personal.UploadFileRequest();
  }

  public static com.wanfang.personal.UploadFileRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UploadFileRequest>
      PARSER = new com.google.protobuf.AbstractParser<UploadFileRequest>() {
    public UploadFileRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new UploadFileRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UploadFileRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UploadFileRequest> getParserForType() {
    return PARSER;
  }

  public com.wanfang.personal.UploadFileRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
