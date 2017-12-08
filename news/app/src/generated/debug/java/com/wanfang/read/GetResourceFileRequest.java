// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: read/msg_read.proto

package com.wanfang.read;

/**
 * <pre>
 * 获取全文-请求
 * </pre>
 *
 * Protobuf type {@code read.GetResourceFileRequest}
 */
public  final class GetResourceFileRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:read.GetResourceFileRequest)
    GetResourceFileRequestOrBuilder {
  // Use GetResourceFileRequest.newBuilder() to construct.
  private GetResourceFileRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetResourceFileRequest() {
    resourceType_ = "";
    resourceId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetResourceFileRequest(
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

            resourceType_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            resourceId_ = s;
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
    return com.wanfang.read.MsgRead.internal_static_read_GetResourceFileRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wanfang.read.MsgRead.internal_static_read_GetResourceFileRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wanfang.read.GetResourceFileRequest.class, com.wanfang.read.GetResourceFileRequest.Builder.class);
  }

  public static final int RESOURCE_TYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceType_;
  /**
   * <pre>
   * 资源类型 eg：perio
   * </pre>
   *
   * <code>optional string resource_type = 1;</code>
   */
  public java.lang.String getResourceType() {
    java.lang.Object ref = resourceType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 资源类型 eg：perio
   * </pre>
   *
   * <code>optional string resource_type = 1;</code>
   */
  public com.google.protobuf.ByteString
      getResourceTypeBytes() {
    java.lang.Object ref = resourceType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCE_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object resourceId_;
  /**
   * <pre>
   * 论文id
   * </pre>
   *
   * <code>optional string resource_id = 2;</code>
   */
  public java.lang.String getResourceId() {
    java.lang.Object ref = resourceId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 论文id
   * </pre>
   *
   * <code>optional string resource_id = 2;</code>
   */
  public com.google.protobuf.ByteString
      getResourceIdBytes() {
    java.lang.Object ref = resourceId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceId_ = b;
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
    if (!getResourceTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceType_);
    }
    if (!getResourceIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, resourceId_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getResourceTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceType_);
    }
    if (!getResourceIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, resourceId_);
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
    if (!(obj instanceof com.wanfang.read.GetResourceFileRequest)) {
      return super.equals(obj);
    }
    com.wanfang.read.GetResourceFileRequest other = (com.wanfang.read.GetResourceFileRequest) obj;

    boolean result = true;
    result = result && getResourceType()
        .equals(other.getResourceType());
    result = result && getResourceId()
        .equals(other.getResourceId());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + RESOURCE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getResourceType().hashCode();
    hash = (37 * hash) + RESOURCE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getResourceId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wanfang.read.GetResourceFileRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.read.GetResourceFileRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.read.GetResourceFileRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.read.GetResourceFileRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.read.GetResourceFileRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.read.GetResourceFileRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.read.GetResourceFileRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wanfang.read.GetResourceFileRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.read.GetResourceFileRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.read.GetResourceFileRequest parseFrom(
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
  public static Builder newBuilder(com.wanfang.read.GetResourceFileRequest prototype) {
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
   * 获取全文-请求
   * </pre>
   *
   * Protobuf type {@code read.GetResourceFileRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:read.GetResourceFileRequest)
      com.wanfang.read.GetResourceFileRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanfang.read.MsgRead.internal_static_read_GetResourceFileRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanfang.read.MsgRead.internal_static_read_GetResourceFileRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanfang.read.GetResourceFileRequest.class, com.wanfang.read.GetResourceFileRequest.Builder.class);
    }

    // Construct using com.wanfang.read.GetResourceFileRequest.newBuilder()
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
      resourceType_ = "";

      resourceId_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wanfang.read.MsgRead.internal_static_read_GetResourceFileRequest_descriptor;
    }

    public com.wanfang.read.GetResourceFileRequest getDefaultInstanceForType() {
      return com.wanfang.read.GetResourceFileRequest.getDefaultInstance();
    }

    public com.wanfang.read.GetResourceFileRequest build() {
      com.wanfang.read.GetResourceFileRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.wanfang.read.GetResourceFileRequest buildPartial() {
      com.wanfang.read.GetResourceFileRequest result = new com.wanfang.read.GetResourceFileRequest(this);
      result.resourceType_ = resourceType_;
      result.resourceId_ = resourceId_;
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
      if (other instanceof com.wanfang.read.GetResourceFileRequest) {
        return mergeFrom((com.wanfang.read.GetResourceFileRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wanfang.read.GetResourceFileRequest other) {
      if (other == com.wanfang.read.GetResourceFileRequest.getDefaultInstance()) return this;
      if (!other.getResourceType().isEmpty()) {
        resourceType_ = other.resourceType_;
        onChanged();
      }
      if (!other.getResourceId().isEmpty()) {
        resourceId_ = other.resourceId_;
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
      com.wanfang.read.GetResourceFileRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wanfang.read.GetResourceFileRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object resourceType_ = "";
    /**
     * <pre>
     * 资源类型 eg：perio
     * </pre>
     *
     * <code>optional string resource_type = 1;</code>
     */
    public java.lang.String getResourceType() {
      java.lang.Object ref = resourceType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 资源类型 eg：perio
     * </pre>
     *
     * <code>optional string resource_type = 1;</code>
     */
    public com.google.protobuf.ByteString
        getResourceTypeBytes() {
      java.lang.Object ref = resourceType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 资源类型 eg：perio
     * </pre>
     *
     * <code>optional string resource_type = 1;</code>
     */
    public Builder setResourceType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 资源类型 eg：perio
     * </pre>
     *
     * <code>optional string resource_type = 1;</code>
     */
    public Builder clearResourceType() {
      
      resourceType_ = getDefaultInstance().getResourceType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 资源类型 eg：perio
     * </pre>
     *
     * <code>optional string resource_type = 1;</code>
     */
    public Builder setResourceTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object resourceId_ = "";
    /**
     * <pre>
     * 论文id
     * </pre>
     *
     * <code>optional string resource_id = 2;</code>
     */
    public java.lang.String getResourceId() {
      java.lang.Object ref = resourceId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 论文id
     * </pre>
     *
     * <code>optional string resource_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getResourceIdBytes() {
      java.lang.Object ref = resourceId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 论文id
     * </pre>
     *
     * <code>optional string resource_id = 2;</code>
     */
    public Builder setResourceId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 论文id
     * </pre>
     *
     * <code>optional string resource_id = 2;</code>
     */
    public Builder clearResourceId() {
      
      resourceId_ = getDefaultInstance().getResourceId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 论文id
     * </pre>
     *
     * <code>optional string resource_id = 2;</code>
     */
    public Builder setResourceIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceId_ = value;
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


    // @@protoc_insertion_point(builder_scope:read.GetResourceFileRequest)
  }

  // @@protoc_insertion_point(class_scope:read.GetResourceFileRequest)
  private static final com.wanfang.read.GetResourceFileRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wanfang.read.GetResourceFileRequest();
  }

  public static com.wanfang.read.GetResourceFileRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetResourceFileRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetResourceFileRequest>() {
    public GetResourceFileRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetResourceFileRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetResourceFileRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetResourceFileRequest> getParserForType() {
    return PARSER;
  }

  public com.wanfang.read.GetResourceFileRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
