// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: personalCenter/msg_personInfo.proto

package com.wanfang.personal;

/**
 * Protobuf type {@code personal.SubjectListResponse}
 */
public  final class SubjectListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:personal.SubjectListResponse)
    SubjectListResponseOrBuilder {
  // Use SubjectListResponse.newBuilder() to construct.
  private SubjectListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SubjectListResponse() {
    subjectList_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SubjectListResponse(
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
            java.lang.String s = input.readStringRequireUtf8();

            subjectList_ = s;
            break;
          }
          case 18: {
            com.wanfang.grpcCommon.MsgError.GrpcError.Builder subBuilder = null;
            if (error_ != null) {
              subBuilder = error_.toBuilder();
            }
            error_ = input.readMessage(com.wanfang.grpcCommon.MsgError.GrpcError.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(error_);
              error_ = subBuilder.buildPartial();
            }

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
    return com.wanfang.personal.MsgPersonInfo.internal_static_personal_SubjectListResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wanfang.personal.MsgPersonInfo.internal_static_personal_SubjectListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wanfang.personal.SubjectListResponse.class, com.wanfang.personal.SubjectListResponse.Builder.class);
  }

  public static final int SUBJECT_LIST_FIELD_NUMBER = 1;
  private volatile java.lang.Object subjectList_;
  /**
   * <code>optional string subject_list = 1;</code>
   */
  public java.lang.String getSubjectList() {
    java.lang.Object ref = subjectList_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subjectList_ = s;
      return s;
    }
  }
  /**
   * <code>optional string subject_list = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSubjectListBytes() {
    java.lang.Object ref = subjectList_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subjectList_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ERROR_FIELD_NUMBER = 2;
  private com.wanfang.grpcCommon.MsgError.GrpcError error_;
  /**
   * <code>optional .grpcCommon.GrpcError error = 2;</code>
   */
  public boolean hasError() {
    return error_ != null;
  }
  /**
   * <code>optional .grpcCommon.GrpcError error = 2;</code>
   */
  public com.wanfang.grpcCommon.MsgError.GrpcError getError() {
    return error_ == null ? com.wanfang.grpcCommon.MsgError.GrpcError.getDefaultInstance() : error_;
  }
  /**
   * <code>optional .grpcCommon.GrpcError error = 2;</code>
   */
  public com.wanfang.grpcCommon.MsgError.GrpcErrorOrBuilder getErrorOrBuilder() {
    return getError();
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
    if (!getSubjectListBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, subjectList_);
    }
    if (error_ != null) {
      output.writeMessage(2, getError());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSubjectListBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, subjectList_);
    }
    if (error_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getError());
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
    if (!(obj instanceof com.wanfang.personal.SubjectListResponse)) {
      return super.equals(obj);
    }
    com.wanfang.personal.SubjectListResponse other = (com.wanfang.personal.SubjectListResponse) obj;

    boolean result = true;
    result = result && getSubjectList()
        .equals(other.getSubjectList());
    result = result && (hasError() == other.hasError());
    if (hasError()) {
      result = result && getError()
          .equals(other.getError());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + SUBJECT_LIST_FIELD_NUMBER;
    hash = (53 * hash) + getSubjectList().hashCode();
    if (hasError()) {
      hash = (37 * hash) + ERROR_FIELD_NUMBER;
      hash = (53 * hash) + getError().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wanfang.personal.SubjectListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.personal.SubjectListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.personal.SubjectListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.personal.SubjectListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.personal.SubjectListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.SubjectListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.personal.SubjectListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.SubjectListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.personal.SubjectListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.SubjectListResponse parseFrom(
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
  public static Builder newBuilder(com.wanfang.personal.SubjectListResponse prototype) {
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
   * Protobuf type {@code personal.SubjectListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:personal.SubjectListResponse)
      com.wanfang.personal.SubjectListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanfang.personal.MsgPersonInfo.internal_static_personal_SubjectListResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanfang.personal.MsgPersonInfo.internal_static_personal_SubjectListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanfang.personal.SubjectListResponse.class, com.wanfang.personal.SubjectListResponse.Builder.class);
    }

    // Construct using com.wanfang.personal.SubjectListResponse.newBuilder()
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
      subjectList_ = "";

      if (errorBuilder_ == null) {
        error_ = null;
      } else {
        error_ = null;
        errorBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wanfang.personal.MsgPersonInfo.internal_static_personal_SubjectListResponse_descriptor;
    }

    public com.wanfang.personal.SubjectListResponse getDefaultInstanceForType() {
      return com.wanfang.personal.SubjectListResponse.getDefaultInstance();
    }

    public com.wanfang.personal.SubjectListResponse build() {
      com.wanfang.personal.SubjectListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.wanfang.personal.SubjectListResponse buildPartial() {
      com.wanfang.personal.SubjectListResponse result = new com.wanfang.personal.SubjectListResponse(this);
      result.subjectList_ = subjectList_;
      if (errorBuilder_ == null) {
        result.error_ = error_;
      } else {
        result.error_ = errorBuilder_.build();
      }
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
      if (other instanceof com.wanfang.personal.SubjectListResponse) {
        return mergeFrom((com.wanfang.personal.SubjectListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wanfang.personal.SubjectListResponse other) {
      if (other == com.wanfang.personal.SubjectListResponse.getDefaultInstance()) return this;
      if (!other.getSubjectList().isEmpty()) {
        subjectList_ = other.subjectList_;
        onChanged();
      }
      if (other.hasError()) {
        mergeError(other.getError());
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
      com.wanfang.personal.SubjectListResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wanfang.personal.SubjectListResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object subjectList_ = "";
    /**
     * <code>optional string subject_list = 1;</code>
     */
    public java.lang.String getSubjectList() {
      java.lang.Object ref = subjectList_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subjectList_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string subject_list = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSubjectListBytes() {
      java.lang.Object ref = subjectList_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subjectList_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string subject_list = 1;</code>
     */
    public Builder setSubjectList(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      subjectList_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string subject_list = 1;</code>
     */
    public Builder clearSubjectList() {
      
      subjectList_ = getDefaultInstance().getSubjectList();
      onChanged();
      return this;
    }
    /**
     * <code>optional string subject_list = 1;</code>
     */
    public Builder setSubjectListBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      subjectList_ = value;
      onChanged();
      return this;
    }

    private com.wanfang.grpcCommon.MsgError.GrpcError error_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.wanfang.grpcCommon.MsgError.GrpcError, com.wanfang.grpcCommon.MsgError.GrpcError.Builder, com.wanfang.grpcCommon.MsgError.GrpcErrorOrBuilder> errorBuilder_;
    /**
     * <code>optional .grpcCommon.GrpcError error = 2;</code>
     */
    public boolean hasError() {
      return errorBuilder_ != null || error_ != null;
    }
    /**
     * <code>optional .grpcCommon.GrpcError error = 2;</code>
     */
    public com.wanfang.grpcCommon.MsgError.GrpcError getError() {
      if (errorBuilder_ == null) {
        return error_ == null ? com.wanfang.grpcCommon.MsgError.GrpcError.getDefaultInstance() : error_;
      } else {
        return errorBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .grpcCommon.GrpcError error = 2;</code>
     */
    public Builder setError(com.wanfang.grpcCommon.MsgError.GrpcError value) {
      if (errorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        error_ = value;
        onChanged();
      } else {
        errorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>optional .grpcCommon.GrpcError error = 2;</code>
     */
    public Builder setError(
        com.wanfang.grpcCommon.MsgError.GrpcError.Builder builderForValue) {
      if (errorBuilder_ == null) {
        error_ = builderForValue.build();
        onChanged();
      } else {
        errorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>optional .grpcCommon.GrpcError error = 2;</code>
     */
    public Builder mergeError(com.wanfang.grpcCommon.MsgError.GrpcError value) {
      if (errorBuilder_ == null) {
        if (error_ != null) {
          error_ =
            com.wanfang.grpcCommon.MsgError.GrpcError.newBuilder(error_).mergeFrom(value).buildPartial();
        } else {
          error_ = value;
        }
        onChanged();
      } else {
        errorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>optional .grpcCommon.GrpcError error = 2;</code>
     */
    public Builder clearError() {
      if (errorBuilder_ == null) {
        error_ = null;
        onChanged();
      } else {
        error_ = null;
        errorBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>optional .grpcCommon.GrpcError error = 2;</code>
     */
    public com.wanfang.grpcCommon.MsgError.GrpcError.Builder getErrorBuilder() {
      
      onChanged();
      return getErrorFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .grpcCommon.GrpcError error = 2;</code>
     */
    public com.wanfang.grpcCommon.MsgError.GrpcErrorOrBuilder getErrorOrBuilder() {
      if (errorBuilder_ != null) {
        return errorBuilder_.getMessageOrBuilder();
      } else {
        return error_ == null ?
            com.wanfang.grpcCommon.MsgError.GrpcError.getDefaultInstance() : error_;
      }
    }
    /**
     * <code>optional .grpcCommon.GrpcError error = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.wanfang.grpcCommon.MsgError.GrpcError, com.wanfang.grpcCommon.MsgError.GrpcError.Builder, com.wanfang.grpcCommon.MsgError.GrpcErrorOrBuilder> 
        getErrorFieldBuilder() {
      if (errorBuilder_ == null) {
        errorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.wanfang.grpcCommon.MsgError.GrpcError, com.wanfang.grpcCommon.MsgError.GrpcError.Builder, com.wanfang.grpcCommon.MsgError.GrpcErrorOrBuilder>(
                getError(),
                getParentForChildren(),
                isClean());
        error_ = null;
      }
      return errorBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:personal.SubjectListResponse)
  }

  // @@protoc_insertion_point(class_scope:personal.SubjectListResponse)
  private static final com.wanfang.personal.SubjectListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wanfang.personal.SubjectListResponse();
  }

  public static com.wanfang.personal.SubjectListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubjectListResponse>
      PARSER = new com.google.protobuf.AbstractParser<SubjectListResponse>() {
    public SubjectListResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SubjectListResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SubjectListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubjectListResponse> getParserForType() {
    return PARSER;
  }

  public com.wanfang.personal.SubjectListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

