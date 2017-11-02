// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: personalCenter/msg_login.proto

package com.wanfang.personal;

/**
 * <pre>
 * 快捷登录（手机号登录请求）
 * </pre>
 *
 * Protobuf type {@code personal.QuickLoginRequest}
 */
public  final class QuickLoginRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:personal.QuickLoginRequest)
    QuickLoginRequestOrBuilder {
  // Use QuickLoginRequest.newBuilder() to construct.
  private QuickLoginRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QuickLoginRequest() {
    phone_ = "";
    token_ = "";
    captcha_ = "";
    deviceId_ = "";
    deviceType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private QuickLoginRequest(
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

            phone_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            token_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            captcha_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            deviceId_ = s;
            break;
          }
          case 40: {
            int rawValue = input.readEnum();

            deviceType_ = rawValue;
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
    return com.wanfang.personal.MsgLogin.internal_static_personal_QuickLoginRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wanfang.personal.MsgLogin.internal_static_personal_QuickLoginRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wanfang.personal.QuickLoginRequest.class, com.wanfang.personal.QuickLoginRequest.Builder.class);
  }

  public static final int PHONE_FIELD_NUMBER = 1;
  private volatile java.lang.Object phone_;
  /**
   * <code>optional string phone = 1;</code>
   */
  public java.lang.String getPhone() {
    java.lang.Object ref = phone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      phone_ = s;
      return s;
    }
  }
  /**
   * <code>optional string phone = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPhoneBytes() {
    java.lang.Object ref = phone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      phone_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object token_;
  /**
   * <code>optional string token = 2;</code>
   */
  public java.lang.String getToken() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      token_ = s;
      return s;
    }
  }
  /**
   * <code>optional string token = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTokenBytes() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      token_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CAPTCHA_FIELD_NUMBER = 3;
  private volatile java.lang.Object captcha_;
  /**
   * <code>optional string captcha = 3;</code>
   */
  public java.lang.String getCaptcha() {
    java.lang.Object ref = captcha_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      captcha_ = s;
      return s;
    }
  }
  /**
   * <code>optional string captcha = 3;</code>
   */
  public com.google.protobuf.ByteString
      getCaptchaBytes() {
    java.lang.Object ref = captcha_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      captcha_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEVICE_ID_FIELD_NUMBER = 4;
  private volatile java.lang.Object deviceId_;
  /**
   * <pre>
   * 设备号
   * </pre>
   *
   * <code>optional string device_id = 4;</code>
   */
  public java.lang.String getDeviceId() {
    java.lang.Object ref = deviceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deviceId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 设备号
   * </pre>
   *
   * <code>optional string device_id = 4;</code>
   */
  public com.google.protobuf.ByteString
      getDeviceIdBytes() {
    java.lang.Object ref = deviceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deviceId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEVICE_TYPE_FIELD_NUMBER = 5;
  private int deviceType_;
  /**
   * <pre>
   * 登录设备类型
   * </pre>
   *
   * <code>optional .personal.LoginDeviceType device_type = 5;</code>
   */
  public int getDeviceTypeValue() {
    return deviceType_;
  }
  /**
   * <pre>
   * 登录设备类型
   * </pre>
   *
   * <code>optional .personal.LoginDeviceType device_type = 5;</code>
   */
  public com.wanfang.personal.LoginDeviceType getDeviceType() {
    com.wanfang.personal.LoginDeviceType result = com.wanfang.personal.LoginDeviceType.valueOf(deviceType_);
    return result == null ? com.wanfang.personal.LoginDeviceType.UNRECOGNIZED : result;
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
    if (!getPhoneBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, phone_);
    }
    if (!getTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, token_);
    }
    if (!getCaptchaBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, captcha_);
    }
    if (!getDeviceIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, deviceId_);
    }
    if (deviceType_ != com.wanfang.personal.LoginDeviceType.ANDROID.getNumber()) {
      output.writeEnum(5, deviceType_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPhoneBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, phone_);
    }
    if (!getTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, token_);
    }
    if (!getCaptchaBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, captcha_);
    }
    if (!getDeviceIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, deviceId_);
    }
    if (deviceType_ != com.wanfang.personal.LoginDeviceType.ANDROID.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, deviceType_);
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
    if (!(obj instanceof com.wanfang.personal.QuickLoginRequest)) {
      return super.equals(obj);
    }
    com.wanfang.personal.QuickLoginRequest other = (com.wanfang.personal.QuickLoginRequest) obj;

    boolean result = true;
    result = result && getPhone()
        .equals(other.getPhone());
    result = result && getToken()
        .equals(other.getToken());
    result = result && getCaptcha()
        .equals(other.getCaptcha());
    result = result && getDeviceId()
        .equals(other.getDeviceId());
    result = result && deviceType_ == other.deviceType_;
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + PHONE_FIELD_NUMBER;
    hash = (53 * hash) + getPhone().hashCode();
    hash = (37 * hash) + TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getToken().hashCode();
    hash = (37 * hash) + CAPTCHA_FIELD_NUMBER;
    hash = (53 * hash) + getCaptcha().hashCode();
    hash = (37 * hash) + DEVICE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDeviceId().hashCode();
    hash = (37 * hash) + DEVICE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + deviceType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wanfang.personal.QuickLoginRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.personal.QuickLoginRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.personal.QuickLoginRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.personal.QuickLoginRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.personal.QuickLoginRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.QuickLoginRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.personal.QuickLoginRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.QuickLoginRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.personal.QuickLoginRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.QuickLoginRequest parseFrom(
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
  public static Builder newBuilder(com.wanfang.personal.QuickLoginRequest prototype) {
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
   * 快捷登录（手机号登录请求）
   * </pre>
   *
   * Protobuf type {@code personal.QuickLoginRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:personal.QuickLoginRequest)
      com.wanfang.personal.QuickLoginRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanfang.personal.MsgLogin.internal_static_personal_QuickLoginRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanfang.personal.MsgLogin.internal_static_personal_QuickLoginRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanfang.personal.QuickLoginRequest.class, com.wanfang.personal.QuickLoginRequest.Builder.class);
    }

    // Construct using com.wanfang.personal.QuickLoginRequest.newBuilder()
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
      phone_ = "";

      token_ = "";

      captcha_ = "";

      deviceId_ = "";

      deviceType_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wanfang.personal.MsgLogin.internal_static_personal_QuickLoginRequest_descriptor;
    }

    public com.wanfang.personal.QuickLoginRequest getDefaultInstanceForType() {
      return com.wanfang.personal.QuickLoginRequest.getDefaultInstance();
    }

    public com.wanfang.personal.QuickLoginRequest build() {
      com.wanfang.personal.QuickLoginRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.wanfang.personal.QuickLoginRequest buildPartial() {
      com.wanfang.personal.QuickLoginRequest result = new com.wanfang.personal.QuickLoginRequest(this);
      result.phone_ = phone_;
      result.token_ = token_;
      result.captcha_ = captcha_;
      result.deviceId_ = deviceId_;
      result.deviceType_ = deviceType_;
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
      if (other instanceof com.wanfang.personal.QuickLoginRequest) {
        return mergeFrom((com.wanfang.personal.QuickLoginRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wanfang.personal.QuickLoginRequest other) {
      if (other == com.wanfang.personal.QuickLoginRequest.getDefaultInstance()) return this;
      if (!other.getPhone().isEmpty()) {
        phone_ = other.phone_;
        onChanged();
      }
      if (!other.getToken().isEmpty()) {
        token_ = other.token_;
        onChanged();
      }
      if (!other.getCaptcha().isEmpty()) {
        captcha_ = other.captcha_;
        onChanged();
      }
      if (!other.getDeviceId().isEmpty()) {
        deviceId_ = other.deviceId_;
        onChanged();
      }
      if (other.deviceType_ != 0) {
        setDeviceTypeValue(other.getDeviceTypeValue());
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
      com.wanfang.personal.QuickLoginRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wanfang.personal.QuickLoginRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object phone_ = "";
    /**
     * <code>optional string phone = 1;</code>
     */
    public java.lang.String getPhone() {
      java.lang.Object ref = phone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        phone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string phone = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPhoneBytes() {
      java.lang.Object ref = phone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        phone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string phone = 1;</code>
     */
    public Builder setPhone(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      phone_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string phone = 1;</code>
     */
    public Builder clearPhone() {
      
      phone_ = getDefaultInstance().getPhone();
      onChanged();
      return this;
    }
    /**
     * <code>optional string phone = 1;</code>
     */
    public Builder setPhoneBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      phone_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object token_ = "";
    /**
     * <code>optional string token = 2;</code>
     */
    public java.lang.String getToken() {
      java.lang.Object ref = token_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        token_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string token = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTokenBytes() {
      java.lang.Object ref = token_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        token_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string token = 2;</code>
     */
    public Builder setToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      token_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string token = 2;</code>
     */
    public Builder clearToken() {
      
      token_ = getDefaultInstance().getToken();
      onChanged();
      return this;
    }
    /**
     * <code>optional string token = 2;</code>
     */
    public Builder setTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      token_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object captcha_ = "";
    /**
     * <code>optional string captcha = 3;</code>
     */
    public java.lang.String getCaptcha() {
      java.lang.Object ref = captcha_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        captcha_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string captcha = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCaptchaBytes() {
      java.lang.Object ref = captcha_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        captcha_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string captcha = 3;</code>
     */
    public Builder setCaptcha(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      captcha_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string captcha = 3;</code>
     */
    public Builder clearCaptcha() {
      
      captcha_ = getDefaultInstance().getCaptcha();
      onChanged();
      return this;
    }
    /**
     * <code>optional string captcha = 3;</code>
     */
    public Builder setCaptchaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      captcha_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object deviceId_ = "";
    /**
     * <pre>
     * 设备号
     * </pre>
     *
     * <code>optional string device_id = 4;</code>
     */
    public java.lang.String getDeviceId() {
      java.lang.Object ref = deviceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deviceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 设备号
     * </pre>
     *
     * <code>optional string device_id = 4;</code>
     */
    public com.google.protobuf.ByteString
        getDeviceIdBytes() {
      java.lang.Object ref = deviceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 设备号
     * </pre>
     *
     * <code>optional string device_id = 4;</code>
     */
    public Builder setDeviceId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      deviceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 设备号
     * </pre>
     *
     * <code>optional string device_id = 4;</code>
     */
    public Builder clearDeviceId() {
      
      deviceId_ = getDefaultInstance().getDeviceId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 设备号
     * </pre>
     *
     * <code>optional string device_id = 4;</code>
     */
    public Builder setDeviceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      deviceId_ = value;
      onChanged();
      return this;
    }

    private int deviceType_ = 0;
    /**
     * <pre>
     * 登录设备类型
     * </pre>
     *
     * <code>optional .personal.LoginDeviceType device_type = 5;</code>
     */
    public int getDeviceTypeValue() {
      return deviceType_;
    }
    /**
     * <pre>
     * 登录设备类型
     * </pre>
     *
     * <code>optional .personal.LoginDeviceType device_type = 5;</code>
     */
    public Builder setDeviceTypeValue(int value) {
      deviceType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 登录设备类型
     * </pre>
     *
     * <code>optional .personal.LoginDeviceType device_type = 5;</code>
     */
    public com.wanfang.personal.LoginDeviceType getDeviceType() {
      com.wanfang.personal.LoginDeviceType result = com.wanfang.personal.LoginDeviceType.valueOf(deviceType_);
      return result == null ? com.wanfang.personal.LoginDeviceType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 登录设备类型
     * </pre>
     *
     * <code>optional .personal.LoginDeviceType device_type = 5;</code>
     */
    public Builder setDeviceType(com.wanfang.personal.LoginDeviceType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      deviceType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 登录设备类型
     * </pre>
     *
     * <code>optional .personal.LoginDeviceType device_type = 5;</code>
     */
    public Builder clearDeviceType() {
      
      deviceType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:personal.QuickLoginRequest)
  }

  // @@protoc_insertion_point(class_scope:personal.QuickLoginRequest)
  private static final com.wanfang.personal.QuickLoginRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wanfang.personal.QuickLoginRequest();
  }

  public static com.wanfang.personal.QuickLoginRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QuickLoginRequest>
      PARSER = new com.google.protobuf.AbstractParser<QuickLoginRequest>() {
    public QuickLoginRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new QuickLoginRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QuickLoginRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QuickLoginRequest> getParserForType() {
    return PARSER;
  }

  public com.wanfang.personal.QuickLoginRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

