// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: collect/msg_collect.proto

package com.wanfang.collect;

/**
 * <pre>
 * 收藏详情/文献详情 会议详情信息
 * </pre>
 *
 * Protobuf type {@code collect.MyCollectConfMessage}
 */
public  final class MyCollectConfMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:collect.MyCollectConfMessage)
    MyCollectConfMessageOrBuilder {
  // Use MyCollectConfMessage.newBuilder() to construct.
  private MyCollectConfMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MyCollectConfMessage() {
    confName_ = "";
    confType_ = "";
    confYear_ = "";
    publishPlace_ = "";
    hostunitName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private MyCollectConfMessage(
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

            confName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            confType_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            confYear_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            publishPlace_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            hostunitName_ = s;
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
    return com.wanfang.collect.MsgCollect.internal_static_collect_MyCollectConfMessage_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wanfang.collect.MsgCollect.internal_static_collect_MyCollectConfMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wanfang.collect.MyCollectConfMessage.class, com.wanfang.collect.MyCollectConfMessage.Builder.class);
  }

  public static final int CONF_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object confName_;
  /**
   * <pre>
   * 会议名称
   * </pre>
   *
   * <code>optional string conf_name = 1;</code>
   */
  public java.lang.String getConfName() {
    java.lang.Object ref = confName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      confName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 会议名称
   * </pre>
   *
   * <code>optional string conf_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getConfNameBytes() {
    java.lang.Object ref = confName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      confName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONF_TYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object confType_;
  /**
   * <pre>
   * 会议类型
   * </pre>
   *
   * <code>optional string conf_type = 2;</code>
   */
  public java.lang.String getConfType() {
    java.lang.Object ref = confType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      confType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 会议类型
   * </pre>
   *
   * <code>optional string conf_type = 2;</code>
   */
  public com.google.protobuf.ByteString
      getConfTypeBytes() {
    java.lang.Object ref = confType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      confType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONF_YEAR_FIELD_NUMBER = 3;
  private volatile java.lang.Object confYear_;
  /**
   * <pre>
   * 会议年份
   * </pre>
   *
   * <code>optional string conf_year = 3;</code>
   */
  public java.lang.String getConfYear() {
    java.lang.Object ref = confYear_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      confYear_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 会议年份
   * </pre>
   *
   * <code>optional string conf_year = 3;</code>
   */
  public com.google.protobuf.ByteString
      getConfYearBytes() {
    java.lang.Object ref = confYear_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      confYear_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PUBLISH_PLACE_FIELD_NUMBER = 4;
  private volatile java.lang.Object publishPlace_;
  /**
   * <pre>
   * 会议地点
   * </pre>
   *
   * <code>optional string publish_place = 4;</code>
   */
  public java.lang.String getPublishPlace() {
    java.lang.Object ref = publishPlace_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      publishPlace_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 会议地点
   * </pre>
   *
   * <code>optional string publish_place = 4;</code>
   */
  public com.google.protobuf.ByteString
      getPublishPlaceBytes() {
    java.lang.Object ref = publishPlace_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      publishPlace_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HOSTUNIT_NAME_FIELD_NUMBER = 5;
  private volatile java.lang.Object hostunitName_;
  /**
   * <pre>
   * 主办单位 '%'分隔
   * </pre>
   *
   * <code>optional string hostunit_name = 5;</code>
   */
  public java.lang.String getHostunitName() {
    java.lang.Object ref = hostunitName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hostunitName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 主办单位 '%'分隔
   * </pre>
   *
   * <code>optional string hostunit_name = 5;</code>
   */
  public com.google.protobuf.ByteString
      getHostunitNameBytes() {
    java.lang.Object ref = hostunitName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hostunitName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getConfNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, confName_);
    }
    if (!getConfTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, confType_);
    }
    if (!getConfYearBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, confYear_);
    }
    if (!getPublishPlaceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, publishPlace_);
    }
    if (!getHostunitNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, hostunitName_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getConfNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, confName_);
    }
    if (!getConfTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, confType_);
    }
    if (!getConfYearBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, confYear_);
    }
    if (!getPublishPlaceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, publishPlace_);
    }
    if (!getHostunitNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, hostunitName_);
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
    if (!(obj instanceof com.wanfang.collect.MyCollectConfMessage)) {
      return super.equals(obj);
    }
    com.wanfang.collect.MyCollectConfMessage other = (com.wanfang.collect.MyCollectConfMessage) obj;

    boolean result = true;
    result = result && getConfName()
        .equals(other.getConfName());
    result = result && getConfType()
        .equals(other.getConfType());
    result = result && getConfYear()
        .equals(other.getConfYear());
    result = result && getPublishPlace()
        .equals(other.getPublishPlace());
    result = result && getHostunitName()
        .equals(other.getHostunitName());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + CONF_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getConfName().hashCode();
    hash = (37 * hash) + CONF_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getConfType().hashCode();
    hash = (37 * hash) + CONF_YEAR_FIELD_NUMBER;
    hash = (53 * hash) + getConfYear().hashCode();
    hash = (37 * hash) + PUBLISH_PLACE_FIELD_NUMBER;
    hash = (53 * hash) + getPublishPlace().hashCode();
    hash = (37 * hash) + HOSTUNIT_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getHostunitName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wanfang.collect.MyCollectConfMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.collect.MyCollectConfMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.collect.MyCollectConfMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.collect.MyCollectConfMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.collect.MyCollectConfMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.collect.MyCollectConfMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.collect.MyCollectConfMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wanfang.collect.MyCollectConfMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.collect.MyCollectConfMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.collect.MyCollectConfMessage parseFrom(
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
  public static Builder newBuilder(com.wanfang.collect.MyCollectConfMessage prototype) {
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
   * <pre>
   * 收藏详情/文献详情 会议详情信息
   * </pre>
   *
   * Protobuf type {@code collect.MyCollectConfMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:collect.MyCollectConfMessage)
      com.wanfang.collect.MyCollectConfMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanfang.collect.MsgCollect.internal_static_collect_MyCollectConfMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanfang.collect.MsgCollect.internal_static_collect_MyCollectConfMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanfang.collect.MyCollectConfMessage.class, com.wanfang.collect.MyCollectConfMessage.Builder.class);
    }

    // Construct using com.wanfang.collect.MyCollectConfMessage.newBuilder()
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
      confName_ = "";

      confType_ = "";

      confYear_ = "";

      publishPlace_ = "";

      hostunitName_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wanfang.collect.MsgCollect.internal_static_collect_MyCollectConfMessage_descriptor;
    }

    public com.wanfang.collect.MyCollectConfMessage getDefaultInstanceForType() {
      return com.wanfang.collect.MyCollectConfMessage.getDefaultInstance();
    }

    public com.wanfang.collect.MyCollectConfMessage build() {
      com.wanfang.collect.MyCollectConfMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.wanfang.collect.MyCollectConfMessage buildPartial() {
      com.wanfang.collect.MyCollectConfMessage result = new com.wanfang.collect.MyCollectConfMessage(this);
      result.confName_ = confName_;
      result.confType_ = confType_;
      result.confYear_ = confYear_;
      result.publishPlace_ = publishPlace_;
      result.hostunitName_ = hostunitName_;
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
      if (other instanceof com.wanfang.collect.MyCollectConfMessage) {
        return mergeFrom((com.wanfang.collect.MyCollectConfMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wanfang.collect.MyCollectConfMessage other) {
      if (other == com.wanfang.collect.MyCollectConfMessage.getDefaultInstance()) return this;
      if (!other.getConfName().isEmpty()) {
        confName_ = other.confName_;
        onChanged();
      }
      if (!other.getConfType().isEmpty()) {
        confType_ = other.confType_;
        onChanged();
      }
      if (!other.getConfYear().isEmpty()) {
        confYear_ = other.confYear_;
        onChanged();
      }
      if (!other.getPublishPlace().isEmpty()) {
        publishPlace_ = other.publishPlace_;
        onChanged();
      }
      if (!other.getHostunitName().isEmpty()) {
        hostunitName_ = other.hostunitName_;
        onChanged();
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
      com.wanfang.collect.MyCollectConfMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wanfang.collect.MyCollectConfMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object confName_ = "";
    /**
     * <pre>
     * 会议名称
     * </pre>
     *
     * <code>optional string conf_name = 1;</code>
     */
    public java.lang.String getConfName() {
      java.lang.Object ref = confName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        confName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 会议名称
     * </pre>
     *
     * <code>optional string conf_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getConfNameBytes() {
      java.lang.Object ref = confName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        confName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 会议名称
     * </pre>
     *
     * <code>optional string conf_name = 1;</code>
     */
    public Builder setConfName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      confName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 会议名称
     * </pre>
     *
     * <code>optional string conf_name = 1;</code>
     */
    public Builder clearConfName() {
      
      confName_ = getDefaultInstance().getConfName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 会议名称
     * </pre>
     *
     * <code>optional string conf_name = 1;</code>
     */
    public Builder setConfNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      confName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object confType_ = "";
    /**
     * <pre>
     * 会议类型
     * </pre>
     *
     * <code>optional string conf_type = 2;</code>
     */
    public java.lang.String getConfType() {
      java.lang.Object ref = confType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        confType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 会议类型
     * </pre>
     *
     * <code>optional string conf_type = 2;</code>
     */
    public com.google.protobuf.ByteString
        getConfTypeBytes() {
      java.lang.Object ref = confType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        confType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 会议类型
     * </pre>
     *
     * <code>optional string conf_type = 2;</code>
     */
    public Builder setConfType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      confType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 会议类型
     * </pre>
     *
     * <code>optional string conf_type = 2;</code>
     */
    public Builder clearConfType() {
      
      confType_ = getDefaultInstance().getConfType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 会议类型
     * </pre>
     *
     * <code>optional string conf_type = 2;</code>
     */
    public Builder setConfTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      confType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object confYear_ = "";
    /**
     * <pre>
     * 会议年份
     * </pre>
     *
     * <code>optional string conf_year = 3;</code>
     */
    public java.lang.String getConfYear() {
      java.lang.Object ref = confYear_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        confYear_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 会议年份
     * </pre>
     *
     * <code>optional string conf_year = 3;</code>
     */
    public com.google.protobuf.ByteString
        getConfYearBytes() {
      java.lang.Object ref = confYear_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        confYear_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 会议年份
     * </pre>
     *
     * <code>optional string conf_year = 3;</code>
     */
    public Builder setConfYear(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      confYear_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 会议年份
     * </pre>
     *
     * <code>optional string conf_year = 3;</code>
     */
    public Builder clearConfYear() {
      
      confYear_ = getDefaultInstance().getConfYear();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 会议年份
     * </pre>
     *
     * <code>optional string conf_year = 3;</code>
     */
    public Builder setConfYearBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      confYear_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object publishPlace_ = "";
    /**
     * <pre>
     * 会议地点
     * </pre>
     *
     * <code>optional string publish_place = 4;</code>
     */
    public java.lang.String getPublishPlace() {
      java.lang.Object ref = publishPlace_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        publishPlace_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 会议地点
     * </pre>
     *
     * <code>optional string publish_place = 4;</code>
     */
    public com.google.protobuf.ByteString
        getPublishPlaceBytes() {
      java.lang.Object ref = publishPlace_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        publishPlace_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 会议地点
     * </pre>
     *
     * <code>optional string publish_place = 4;</code>
     */
    public Builder setPublishPlace(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      publishPlace_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 会议地点
     * </pre>
     *
     * <code>optional string publish_place = 4;</code>
     */
    public Builder clearPublishPlace() {
      
      publishPlace_ = getDefaultInstance().getPublishPlace();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 会议地点
     * </pre>
     *
     * <code>optional string publish_place = 4;</code>
     */
    public Builder setPublishPlaceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      publishPlace_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object hostunitName_ = "";
    /**
     * <pre>
     * 主办单位 '%'分隔
     * </pre>
     *
     * <code>optional string hostunit_name = 5;</code>
     */
    public java.lang.String getHostunitName() {
      java.lang.Object ref = hostunitName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hostunitName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 主办单位 '%'分隔
     * </pre>
     *
     * <code>optional string hostunit_name = 5;</code>
     */
    public com.google.protobuf.ByteString
        getHostunitNameBytes() {
      java.lang.Object ref = hostunitName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hostunitName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 主办单位 '%'分隔
     * </pre>
     *
     * <code>optional string hostunit_name = 5;</code>
     */
    public Builder setHostunitName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hostunitName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 主办单位 '%'分隔
     * </pre>
     *
     * <code>optional string hostunit_name = 5;</code>
     */
    public Builder clearHostunitName() {
      
      hostunitName_ = getDefaultInstance().getHostunitName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 主办单位 '%'分隔
     * </pre>
     *
     * <code>optional string hostunit_name = 5;</code>
     */
    public Builder setHostunitNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      hostunitName_ = value;
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


    // @@protoc_insertion_point(builder_scope:collect.MyCollectConfMessage)
  }

  // @@protoc_insertion_point(class_scope:collect.MyCollectConfMessage)
  private static final com.wanfang.collect.MyCollectConfMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wanfang.collect.MyCollectConfMessage();
  }

  public static com.wanfang.collect.MyCollectConfMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MyCollectConfMessage>
      PARSER = new com.google.protobuf.AbstractParser<MyCollectConfMessage>() {
    public MyCollectConfMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new MyCollectConfMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MyCollectConfMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MyCollectConfMessage> getParserForType() {
    return PARSER;
  }

  public com.wanfang.collect.MyCollectConfMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

