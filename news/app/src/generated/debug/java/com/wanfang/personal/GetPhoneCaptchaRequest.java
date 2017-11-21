// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: personalCenter/msg_captcha.proto

package com.wanfang.personal;

/**
 * <pre>
 * 获取手机验证码-请求
 * </pre>
 *
 * Protobuf type {@code personal.GetPhoneCaptchaRequest}
 */
public  final class GetPhoneCaptchaRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:personal.GetPhoneCaptchaRequest)
    GetPhoneCaptchaRequestOrBuilder {
  // Use GetPhoneCaptchaRequest.newBuilder() to construct.
  private GetPhoneCaptchaRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetPhoneCaptchaRequest() {
    phoneNumber_ = "";
    nation_ = "";
    messageType_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetPhoneCaptchaRequest(
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

            phoneNumber_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nation_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            messageType_ = s;
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
    return com.wanfang.personal.MsgCaptcha.internal_static_personal_GetPhoneCaptchaRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wanfang.personal.MsgCaptcha.internal_static_personal_GetPhoneCaptchaRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wanfang.personal.GetPhoneCaptchaRequest.class, com.wanfang.personal.GetPhoneCaptchaRequest.Builder.class);
  }

  public static final int PHONE_NUMBER_FIELD_NUMBER = 1;
  private volatile java.lang.Object phoneNumber_;
  /**
   * <pre>
   * 手机号
   * </pre>
   *
   * <code>optional string phone_number = 1;</code>
   */
  public java.lang.String getPhoneNumber() {
    java.lang.Object ref = phoneNumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      phoneNumber_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 手机号
   * </pre>
   *
   * <code>optional string phone_number = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPhoneNumberBytes() {
    java.lang.Object ref = phoneNumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      phoneNumber_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NATION_FIELD_NUMBER = 2;
  private volatile java.lang.Object nation_;
  /**
   * <pre>
   * 国际区号 如：中国：0086；
   * </pre>
   *
   * <code>optional string nation = 2;</code>
   */
  public java.lang.String getNation() {
    java.lang.Object ref = nation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nation_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 国际区号 如：中国：0086；
   * </pre>
   *
   * <code>optional string nation = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNationBytes() {
    java.lang.Object ref = nation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nation_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MESSAGE_TYPE_FIELD_NUMBER = 3;
  private volatile java.lang.Object messageType_;
  /**
   * <pre>
   * 消息类型 目前仅支持“bind”
   * </pre>
   *
   * <code>optional string message_type = 3;</code>
   */
  public java.lang.String getMessageType() {
    java.lang.Object ref = messageType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      messageType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 消息类型 目前仅支持“bind”
   * </pre>
   *
   * <code>optional string message_type = 3;</code>
   */
  public com.google.protobuf.ByteString
      getMessageTypeBytes() {
    java.lang.Object ref = messageType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      messageType_ = b;
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
    if (!getPhoneNumberBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, phoneNumber_);
    }
    if (!getNationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nation_);
    }
    if (!getMessageTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, messageType_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPhoneNumberBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, phoneNumber_);
    }
    if (!getNationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nation_);
    }
    if (!getMessageTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, messageType_);
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
    if (!(obj instanceof com.wanfang.personal.GetPhoneCaptchaRequest)) {
      return super.equals(obj);
    }
    com.wanfang.personal.GetPhoneCaptchaRequest other = (com.wanfang.personal.GetPhoneCaptchaRequest) obj;

    boolean result = true;
    result = result && getPhoneNumber()
        .equals(other.getPhoneNumber());
    result = result && getNation()
        .equals(other.getNation());
    result = result && getMessageType()
        .equals(other.getMessageType());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + PHONE_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getPhoneNumber().hashCode();
    hash = (37 * hash) + NATION_FIELD_NUMBER;
    hash = (53 * hash) + getNation().hashCode();
    hash = (37 * hash) + MESSAGE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getMessageType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wanfang.personal.GetPhoneCaptchaRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.personal.GetPhoneCaptchaRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.personal.GetPhoneCaptchaRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.personal.GetPhoneCaptchaRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.personal.GetPhoneCaptchaRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.GetPhoneCaptchaRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.personal.GetPhoneCaptchaRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.GetPhoneCaptchaRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.personal.GetPhoneCaptchaRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.GetPhoneCaptchaRequest parseFrom(
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
  public static Builder newBuilder(com.wanfang.personal.GetPhoneCaptchaRequest prototype) {
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
   * 获取手机验证码-请求
   * </pre>
   *
   * Protobuf type {@code personal.GetPhoneCaptchaRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:personal.GetPhoneCaptchaRequest)
      com.wanfang.personal.GetPhoneCaptchaRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanfang.personal.MsgCaptcha.internal_static_personal_GetPhoneCaptchaRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanfang.personal.MsgCaptcha.internal_static_personal_GetPhoneCaptchaRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanfang.personal.GetPhoneCaptchaRequest.class, com.wanfang.personal.GetPhoneCaptchaRequest.Builder.class);
    }

    // Construct using com.wanfang.personal.GetPhoneCaptchaRequest.newBuilder()
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
      phoneNumber_ = "";

      nation_ = "";

      messageType_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wanfang.personal.MsgCaptcha.internal_static_personal_GetPhoneCaptchaRequest_descriptor;
    }

    public com.wanfang.personal.GetPhoneCaptchaRequest getDefaultInstanceForType() {
      return com.wanfang.personal.GetPhoneCaptchaRequest.getDefaultInstance();
    }

    public com.wanfang.personal.GetPhoneCaptchaRequest build() {
      com.wanfang.personal.GetPhoneCaptchaRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.wanfang.personal.GetPhoneCaptchaRequest buildPartial() {
      com.wanfang.personal.GetPhoneCaptchaRequest result = new com.wanfang.personal.GetPhoneCaptchaRequest(this);
      result.phoneNumber_ = phoneNumber_;
      result.nation_ = nation_;
      result.messageType_ = messageType_;
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
      if (other instanceof com.wanfang.personal.GetPhoneCaptchaRequest) {
        return mergeFrom((com.wanfang.personal.GetPhoneCaptchaRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wanfang.personal.GetPhoneCaptchaRequest other) {
      if (other == com.wanfang.personal.GetPhoneCaptchaRequest.getDefaultInstance()) return this;
      if (!other.getPhoneNumber().isEmpty()) {
        phoneNumber_ = other.phoneNumber_;
        onChanged();
      }
      if (!other.getNation().isEmpty()) {
        nation_ = other.nation_;
        onChanged();
      }
      if (!other.getMessageType().isEmpty()) {
        messageType_ = other.messageType_;
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
      com.wanfang.personal.GetPhoneCaptchaRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wanfang.personal.GetPhoneCaptchaRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object phoneNumber_ = "";
    /**
     * <pre>
     * 手机号
     * </pre>
     *
     * <code>optional string phone_number = 1;</code>
     */
    public java.lang.String getPhoneNumber() {
      java.lang.Object ref = phoneNumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        phoneNumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 手机号
     * </pre>
     *
     * <code>optional string phone_number = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPhoneNumberBytes() {
      java.lang.Object ref = phoneNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        phoneNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 手机号
     * </pre>
     *
     * <code>optional string phone_number = 1;</code>
     */
    public Builder setPhoneNumber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      phoneNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 手机号
     * </pre>
     *
     * <code>optional string phone_number = 1;</code>
     */
    public Builder clearPhoneNumber() {
      
      phoneNumber_ = getDefaultInstance().getPhoneNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 手机号
     * </pre>
     *
     * <code>optional string phone_number = 1;</code>
     */
    public Builder setPhoneNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      phoneNumber_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object nation_ = "";
    /**
     * <pre>
     * 国际区号 如：中国：0086；
     * </pre>
     *
     * <code>optional string nation = 2;</code>
     */
    public java.lang.String getNation() {
      java.lang.Object ref = nation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 国际区号 如：中国：0086；
     * </pre>
     *
     * <code>optional string nation = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNationBytes() {
      java.lang.Object ref = nation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 国际区号 如：中国：0086；
     * </pre>
     *
     * <code>optional string nation = 2;</code>
     */
    public Builder setNation(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nation_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 国际区号 如：中国：0086；
     * </pre>
     *
     * <code>optional string nation = 2;</code>
     */
    public Builder clearNation() {
      
      nation_ = getDefaultInstance().getNation();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 国际区号 如：中国：0086；
     * </pre>
     *
     * <code>optional string nation = 2;</code>
     */
    public Builder setNationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nation_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object messageType_ = "";
    /**
     * <pre>
     * 消息类型 目前仅支持“bind”
     * </pre>
     *
     * <code>optional string message_type = 3;</code>
     */
    public java.lang.String getMessageType() {
      java.lang.Object ref = messageType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        messageType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 消息类型 目前仅支持“bind”
     * </pre>
     *
     * <code>optional string message_type = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMessageTypeBytes() {
      java.lang.Object ref = messageType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        messageType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 消息类型 目前仅支持“bind”
     * </pre>
     *
     * <code>optional string message_type = 3;</code>
     */
    public Builder setMessageType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      messageType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 消息类型 目前仅支持“bind”
     * </pre>
     *
     * <code>optional string message_type = 3;</code>
     */
    public Builder clearMessageType() {
      
      messageType_ = getDefaultInstance().getMessageType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 消息类型 目前仅支持“bind”
     * </pre>
     *
     * <code>optional string message_type = 3;</code>
     */
    public Builder setMessageTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      messageType_ = value;
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


    // @@protoc_insertion_point(builder_scope:personal.GetPhoneCaptchaRequest)
  }

  // @@protoc_insertion_point(class_scope:personal.GetPhoneCaptchaRequest)
  private static final com.wanfang.personal.GetPhoneCaptchaRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wanfang.personal.GetPhoneCaptchaRequest();
  }

  public static com.wanfang.personal.GetPhoneCaptchaRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetPhoneCaptchaRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetPhoneCaptchaRequest>() {
    public GetPhoneCaptchaRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetPhoneCaptchaRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetPhoneCaptchaRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetPhoneCaptchaRequest> getParserForType() {
    return PARSER;
  }

  public com.wanfang.personal.GetPhoneCaptchaRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

