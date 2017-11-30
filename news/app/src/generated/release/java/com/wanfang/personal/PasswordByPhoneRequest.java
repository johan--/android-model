// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: personalCenter/msg_password.proto

package com.wanfang.personal;

/**
 * <pre>
 * 找回密码(通过手机号)-请求
 * </pre>
 *
 * Protobuf type {@code personal.PasswordByPhoneRequest}
 */
public  final class PasswordByPhoneRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:personal.PasswordByPhoneRequest)
    PasswordByPhoneRequestOrBuilder {
  // Use PasswordByPhoneRequest.newBuilder() to construct.
  private PasswordByPhoneRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PasswordByPhoneRequest() {
    phoneNumber_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private PasswordByPhoneRequest(
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
    return com.wanfang.personal.MsgPassword.internal_static_personal_PasswordByPhoneRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wanfang.personal.MsgPassword.internal_static_personal_PasswordByPhoneRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wanfang.personal.PasswordByPhoneRequest.class, com.wanfang.personal.PasswordByPhoneRequest.Builder.class);
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
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPhoneNumberBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, phoneNumber_);
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
    if (!(obj instanceof com.wanfang.personal.PasswordByPhoneRequest)) {
      return super.equals(obj);
    }
    com.wanfang.personal.PasswordByPhoneRequest other = (com.wanfang.personal.PasswordByPhoneRequest) obj;

    boolean result = true;
    result = result && getPhoneNumber()
        .equals(other.getPhoneNumber());
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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wanfang.personal.PasswordByPhoneRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.personal.PasswordByPhoneRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.personal.PasswordByPhoneRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.personal.PasswordByPhoneRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.personal.PasswordByPhoneRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.PasswordByPhoneRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.personal.PasswordByPhoneRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.PasswordByPhoneRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.personal.PasswordByPhoneRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.PasswordByPhoneRequest parseFrom(
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
  public static Builder newBuilder(com.wanfang.personal.PasswordByPhoneRequest prototype) {
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
   * 找回密码(通过手机号)-请求
   * </pre>
   *
   * Protobuf type {@code personal.PasswordByPhoneRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:personal.PasswordByPhoneRequest)
      com.wanfang.personal.PasswordByPhoneRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanfang.personal.MsgPassword.internal_static_personal_PasswordByPhoneRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanfang.personal.MsgPassword.internal_static_personal_PasswordByPhoneRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanfang.personal.PasswordByPhoneRequest.class, com.wanfang.personal.PasswordByPhoneRequest.Builder.class);
    }

    // Construct using com.wanfang.personal.PasswordByPhoneRequest.newBuilder()
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

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wanfang.personal.MsgPassword.internal_static_personal_PasswordByPhoneRequest_descriptor;
    }

    public com.wanfang.personal.PasswordByPhoneRequest getDefaultInstanceForType() {
      return com.wanfang.personal.PasswordByPhoneRequest.getDefaultInstance();
    }

    public com.wanfang.personal.PasswordByPhoneRequest build() {
      com.wanfang.personal.PasswordByPhoneRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.wanfang.personal.PasswordByPhoneRequest buildPartial() {
      com.wanfang.personal.PasswordByPhoneRequest result = new com.wanfang.personal.PasswordByPhoneRequest(this);
      result.phoneNumber_ = phoneNumber_;
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
      if (other instanceof com.wanfang.personal.PasswordByPhoneRequest) {
        return mergeFrom((com.wanfang.personal.PasswordByPhoneRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wanfang.personal.PasswordByPhoneRequest other) {
      if (other == com.wanfang.personal.PasswordByPhoneRequest.getDefaultInstance()) return this;
      if (!other.getPhoneNumber().isEmpty()) {
        phoneNumber_ = other.phoneNumber_;
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
      com.wanfang.personal.PasswordByPhoneRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wanfang.personal.PasswordByPhoneRequest) e.getUnfinishedMessage();
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
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:personal.PasswordByPhoneRequest)
  }

  // @@protoc_insertion_point(class_scope:personal.PasswordByPhoneRequest)
  private static final com.wanfang.personal.PasswordByPhoneRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wanfang.personal.PasswordByPhoneRequest();
  }

  public static com.wanfang.personal.PasswordByPhoneRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PasswordByPhoneRequest>
      PARSER = new com.google.protobuf.AbstractParser<PasswordByPhoneRequest>() {
    public PasswordByPhoneRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PasswordByPhoneRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PasswordByPhoneRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PasswordByPhoneRequest> getParserForType() {
    return PARSER;
  }

  public com.wanfang.personal.PasswordByPhoneRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

