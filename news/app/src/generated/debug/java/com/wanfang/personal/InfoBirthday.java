// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: personalCenter/msg_personInfo.proto

package com.wanfang.personal;

/**
 * Protobuf type {@code personal.InfoBirthday}
 */
public  final class InfoBirthday extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:personal.InfoBirthday)
    InfoBirthdayOrBuilder {
  // Use InfoBirthday.newBuilder() to construct.
  private InfoBirthday(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InfoBirthday() {
    birthday_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private InfoBirthday(
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

            birthday_ = s;
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
    return com.wanfang.personal.MsgPersonInfo.internal_static_personal_InfoBirthday_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wanfang.personal.MsgPersonInfo.internal_static_personal_InfoBirthday_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wanfang.personal.InfoBirthday.class, com.wanfang.personal.InfoBirthday.Builder.class);
  }

  public static final int BIRTHDAY_FIELD_NUMBER = 1;
  private volatile java.lang.Object birthday_;
  /**
   * <code>optional string birthday = 1;</code>
   */
  public java.lang.String getBirthday() {
    java.lang.Object ref = birthday_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      birthday_ = s;
      return s;
    }
  }
  /**
   * <code>optional string birthday = 1;</code>
   */
  public com.google.protobuf.ByteString
      getBirthdayBytes() {
    java.lang.Object ref = birthday_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      birthday_ = b;
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
    if (!getBirthdayBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, birthday_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getBirthdayBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, birthday_);
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
    if (!(obj instanceof com.wanfang.personal.InfoBirthday)) {
      return super.equals(obj);
    }
    com.wanfang.personal.InfoBirthday other = (com.wanfang.personal.InfoBirthday) obj;

    boolean result = true;
    result = result && getBirthday()
        .equals(other.getBirthday());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + BIRTHDAY_FIELD_NUMBER;
    hash = (53 * hash) + getBirthday().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wanfang.personal.InfoBirthday parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.personal.InfoBirthday parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.personal.InfoBirthday parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.personal.InfoBirthday parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.personal.InfoBirthday parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.InfoBirthday parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.personal.InfoBirthday parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.InfoBirthday parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.personal.InfoBirthday parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.InfoBirthday parseFrom(
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
  public static Builder newBuilder(com.wanfang.personal.InfoBirthday prototype) {
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
   * Protobuf type {@code personal.InfoBirthday}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:personal.InfoBirthday)
      com.wanfang.personal.InfoBirthdayOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanfang.personal.MsgPersonInfo.internal_static_personal_InfoBirthday_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanfang.personal.MsgPersonInfo.internal_static_personal_InfoBirthday_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanfang.personal.InfoBirthday.class, com.wanfang.personal.InfoBirthday.Builder.class);
    }

    // Construct using com.wanfang.personal.InfoBirthday.newBuilder()
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
      birthday_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wanfang.personal.MsgPersonInfo.internal_static_personal_InfoBirthday_descriptor;
    }

    public com.wanfang.personal.InfoBirthday getDefaultInstanceForType() {
      return com.wanfang.personal.InfoBirthday.getDefaultInstance();
    }

    public com.wanfang.personal.InfoBirthday build() {
      com.wanfang.personal.InfoBirthday result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.wanfang.personal.InfoBirthday buildPartial() {
      com.wanfang.personal.InfoBirthday result = new com.wanfang.personal.InfoBirthday(this);
      result.birthday_ = birthday_;
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
      if (other instanceof com.wanfang.personal.InfoBirthday) {
        return mergeFrom((com.wanfang.personal.InfoBirthday)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wanfang.personal.InfoBirthday other) {
      if (other == com.wanfang.personal.InfoBirthday.getDefaultInstance()) return this;
      if (!other.getBirthday().isEmpty()) {
        birthday_ = other.birthday_;
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
      com.wanfang.personal.InfoBirthday parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wanfang.personal.InfoBirthday) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object birthday_ = "";
    /**
     * <code>optional string birthday = 1;</code>
     */
    public java.lang.String getBirthday() {
      java.lang.Object ref = birthday_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        birthday_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string birthday = 1;</code>
     */
    public com.google.protobuf.ByteString
        getBirthdayBytes() {
      java.lang.Object ref = birthday_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        birthday_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string birthday = 1;</code>
     */
    public Builder setBirthday(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      birthday_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string birthday = 1;</code>
     */
    public Builder clearBirthday() {
      
      birthday_ = getDefaultInstance().getBirthday();
      onChanged();
      return this;
    }
    /**
     * <code>optional string birthday = 1;</code>
     */
    public Builder setBirthdayBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      birthday_ = value;
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


    // @@protoc_insertion_point(builder_scope:personal.InfoBirthday)
  }

  // @@protoc_insertion_point(class_scope:personal.InfoBirthday)
  private static final com.wanfang.personal.InfoBirthday DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wanfang.personal.InfoBirthday();
  }

  public static com.wanfang.personal.InfoBirthday getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InfoBirthday>
      PARSER = new com.google.protobuf.AbstractParser<InfoBirthday>() {
    public InfoBirthday parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new InfoBirthday(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InfoBirthday> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InfoBirthday> getParserForType() {
    return PARSER;
  }

  public com.wanfang.personal.InfoBirthday getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

