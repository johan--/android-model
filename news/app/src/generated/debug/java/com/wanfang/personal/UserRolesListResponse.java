// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: personalCenter/msg_personInfo.proto

package com.wanfang.personal;

/**
 * Protobuf type {@code personal.UserRolesListResponse}
 */
public  final class UserRolesListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:personal.UserRolesListResponse)
    UserRolesListResponseOrBuilder {
  // Use UserRolesListResponse.newBuilder() to construct.
  private UserRolesListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserRolesListResponse() {
    listVersion_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private UserRolesListResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              roles_ = com.google.protobuf.MapField.newMapField(
                  RolesDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            roles__ = input.readMessage(
                RolesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            roles_.getMutableMap().put(
                roles__.getKey(), roles__.getValue());
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            listVersion_ = s;
            break;
          }
          case 26: {
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
    return com.wanfang.personal.MsgPersonInfo.internal_static_personal_UserRolesListResponse_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetRoles();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wanfang.personal.MsgPersonInfo.internal_static_personal_UserRolesListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wanfang.personal.UserRolesListResponse.class, com.wanfang.personal.UserRolesListResponse.Builder.class);
  }

  private int bitField0_;
  public static final int ROLES_FIELD_NUMBER = 1;
  private static final class RolesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.wanfang.personal.MsgPersonInfo.internal_static_personal_UserRolesListResponse_RolesEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> roles_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetRoles() {
    if (roles_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          RolesDefaultEntryHolder.defaultEntry);
    }
    return roles_;
  }

  public int getRolesCount() {
    return internalGetRoles().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; roles = 1;</code>
   */

  public boolean containsRoles(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetRoles().getMap().containsKey(key);
  }
  /**
   * Use {@link #getRolesMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getRoles() {
    return getRolesMap();
  }
  /**
   * <code>map&lt;string, string&gt; roles = 1;</code>
   */

  public java.util.Map<java.lang.String, java.lang.String> getRolesMap() {
    return internalGetRoles().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; roles = 1;</code>
   */

  public java.lang.String getRolesOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetRoles().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; roles = 1;</code>
   */

  public java.lang.String getRolesOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetRoles().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int LIST_VERSION_FIELD_NUMBER = 2;
  private volatile java.lang.Object listVersion_;
  /**
   * <pre>
   * 版本号，如果不同则更新app本地文件，否则直接加载
   * </pre>
   *
   * <code>optional string list_version = 2;</code>
   */
  public java.lang.String getListVersion() {
    java.lang.Object ref = listVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      listVersion_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 版本号，如果不同则更新app本地文件，否则直接加载
   * </pre>
   *
   * <code>optional string list_version = 2;</code>
   */
  public com.google.protobuf.ByteString
      getListVersionBytes() {
    java.lang.Object ref = listVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      listVersion_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ERROR_FIELD_NUMBER = 3;
  private com.wanfang.grpcCommon.MsgError.GrpcError error_;
  /**
   * <code>optional .grpcCommon.GrpcError error = 3;</code>
   */
  public boolean hasError() {
    return error_ != null;
  }
  /**
   * <code>optional .grpcCommon.GrpcError error = 3;</code>
   */
  public com.wanfang.grpcCommon.MsgError.GrpcError getError() {
    return error_ == null ? com.wanfang.grpcCommon.MsgError.GrpcError.getDefaultInstance() : error_;
  }
  /**
   * <code>optional .grpcCommon.GrpcError error = 3;</code>
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetRoles(),
        RolesDefaultEntryHolder.defaultEntry,
        1);
    if (!getListVersionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, listVersion_);
    }
    if (error_ != null) {
      output.writeMessage(3, getError());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetRoles().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      roles__ = RolesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, roles__);
    }
    if (!getListVersionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, listVersion_);
    }
    if (error_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getError());
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
    if (!(obj instanceof com.wanfang.personal.UserRolesListResponse)) {
      return super.equals(obj);
    }
    com.wanfang.personal.UserRolesListResponse other = (com.wanfang.personal.UserRolesListResponse) obj;

    boolean result = true;
    result = result && internalGetRoles().equals(
        other.internalGetRoles());
    result = result && getListVersion()
        .equals(other.getListVersion());
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
    if (!internalGetRoles().getMap().isEmpty()) {
      hash = (37 * hash) + ROLES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetRoles().hashCode();
    }
    hash = (37 * hash) + LIST_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getListVersion().hashCode();
    if (hasError()) {
      hash = (37 * hash) + ERROR_FIELD_NUMBER;
      hash = (53 * hash) + getError().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wanfang.personal.UserRolesListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.personal.UserRolesListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.personal.UserRolesListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wanfang.personal.UserRolesListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wanfang.personal.UserRolesListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.UserRolesListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.personal.UserRolesListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.UserRolesListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wanfang.personal.UserRolesListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wanfang.personal.UserRolesListResponse parseFrom(
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
  public static Builder newBuilder(com.wanfang.personal.UserRolesListResponse prototype) {
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
   * Protobuf type {@code personal.UserRolesListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:personal.UserRolesListResponse)
      com.wanfang.personal.UserRolesListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wanfang.personal.MsgPersonInfo.internal_static_personal_UserRolesListResponse_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetRoles();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableRoles();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wanfang.personal.MsgPersonInfo.internal_static_personal_UserRolesListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wanfang.personal.UserRolesListResponse.class, com.wanfang.personal.UserRolesListResponse.Builder.class);
    }

    // Construct using com.wanfang.personal.UserRolesListResponse.newBuilder()
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
      internalGetMutableRoles().clear();
      listVersion_ = "";

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
      return com.wanfang.personal.MsgPersonInfo.internal_static_personal_UserRolesListResponse_descriptor;
    }

    public com.wanfang.personal.UserRolesListResponse getDefaultInstanceForType() {
      return com.wanfang.personal.UserRolesListResponse.getDefaultInstance();
    }

    public com.wanfang.personal.UserRolesListResponse build() {
      com.wanfang.personal.UserRolesListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.wanfang.personal.UserRolesListResponse buildPartial() {
      com.wanfang.personal.UserRolesListResponse result = new com.wanfang.personal.UserRolesListResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.roles_ = internalGetRoles();
      result.roles_.makeImmutable();
      result.listVersion_ = listVersion_;
      if (errorBuilder_ == null) {
        result.error_ = error_;
      } else {
        result.error_ = errorBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.wanfang.personal.UserRolesListResponse) {
        return mergeFrom((com.wanfang.personal.UserRolesListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wanfang.personal.UserRolesListResponse other) {
      if (other == com.wanfang.personal.UserRolesListResponse.getDefaultInstance()) return this;
      internalGetMutableRoles().mergeFrom(
          other.internalGetRoles());
      if (!other.getListVersion().isEmpty()) {
        listVersion_ = other.listVersion_;
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
      com.wanfang.personal.UserRolesListResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wanfang.personal.UserRolesListResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> roles_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetRoles() {
      if (roles_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            RolesDefaultEntryHolder.defaultEntry);
      }
      return roles_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableRoles() {
      onChanged();;
      if (roles_ == null) {
        roles_ = com.google.protobuf.MapField.newMapField(
            RolesDefaultEntryHolder.defaultEntry);
      }
      if (!roles_.isMutable()) {
        roles_ = roles_.copy();
      }
      return roles_;
    }

    public int getRolesCount() {
      return internalGetRoles().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; roles = 1;</code>
     */

    public boolean containsRoles(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetRoles().getMap().containsKey(key);
    }
    /**
     * Use {@link #getRolesMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getRoles() {
      return getRolesMap();
    }
    /**
     * <code>map&lt;string, string&gt; roles = 1;</code>
     */

    public java.util.Map<java.lang.String, java.lang.String> getRolesMap() {
      return internalGetRoles().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; roles = 1;</code>
     */

    public java.lang.String getRolesOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetRoles().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; roles = 1;</code>
     */

    public java.lang.String getRolesOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetRoles().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearRoles() {
      getMutableRoles().clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; roles = 1;</code>
     */

    public Builder removeRoles(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      getMutableRoles().remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableRoles() {
      return internalGetMutableRoles().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; roles = 1;</code>
     */
    public Builder putRoles(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      getMutableRoles().put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; roles = 1;</code>
     */

    public Builder putAllRoles(
        java.util.Map<java.lang.String, java.lang.String> values) {
      getMutableRoles().putAll(values);
      return this;
    }

    private java.lang.Object listVersion_ = "";
    /**
     * <pre>
     * 版本号，如果不同则更新app本地文件，否则直接加载
     * </pre>
     *
     * <code>optional string list_version = 2;</code>
     */
    public java.lang.String getListVersion() {
      java.lang.Object ref = listVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        listVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 版本号，如果不同则更新app本地文件，否则直接加载
     * </pre>
     *
     * <code>optional string list_version = 2;</code>
     */
    public com.google.protobuf.ByteString
        getListVersionBytes() {
      java.lang.Object ref = listVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        listVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 版本号，如果不同则更新app本地文件，否则直接加载
     * </pre>
     *
     * <code>optional string list_version = 2;</code>
     */
    public Builder setListVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      listVersion_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 版本号，如果不同则更新app本地文件，否则直接加载
     * </pre>
     *
     * <code>optional string list_version = 2;</code>
     */
    public Builder clearListVersion() {
      
      listVersion_ = getDefaultInstance().getListVersion();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 版本号，如果不同则更新app本地文件，否则直接加载
     * </pre>
     *
     * <code>optional string list_version = 2;</code>
     */
    public Builder setListVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      listVersion_ = value;
      onChanged();
      return this;
    }

    private com.wanfang.grpcCommon.MsgError.GrpcError error_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.wanfang.grpcCommon.MsgError.GrpcError, com.wanfang.grpcCommon.MsgError.GrpcError.Builder, com.wanfang.grpcCommon.MsgError.GrpcErrorOrBuilder> errorBuilder_;
    /**
     * <code>optional .grpcCommon.GrpcError error = 3;</code>
     */
    public boolean hasError() {
      return errorBuilder_ != null || error_ != null;
    }
    /**
     * <code>optional .grpcCommon.GrpcError error = 3;</code>
     */
    public com.wanfang.grpcCommon.MsgError.GrpcError getError() {
      if (errorBuilder_ == null) {
        return error_ == null ? com.wanfang.grpcCommon.MsgError.GrpcError.getDefaultInstance() : error_;
      } else {
        return errorBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .grpcCommon.GrpcError error = 3;</code>
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
     * <code>optional .grpcCommon.GrpcError error = 3;</code>
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
     * <code>optional .grpcCommon.GrpcError error = 3;</code>
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
     * <code>optional .grpcCommon.GrpcError error = 3;</code>
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
     * <code>optional .grpcCommon.GrpcError error = 3;</code>
     */
    public com.wanfang.grpcCommon.MsgError.GrpcError.Builder getErrorBuilder() {
      
      onChanged();
      return getErrorFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .grpcCommon.GrpcError error = 3;</code>
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
     * <code>optional .grpcCommon.GrpcError error = 3;</code>
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


    // @@protoc_insertion_point(builder_scope:personal.UserRolesListResponse)
  }

  // @@protoc_insertion_point(class_scope:personal.UserRolesListResponse)
  private static final com.wanfang.personal.UserRolesListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wanfang.personal.UserRolesListResponse();
  }

  public static com.wanfang.personal.UserRolesListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserRolesListResponse>
      PARSER = new com.google.protobuf.AbstractParser<UserRolesListResponse>() {
    public UserRolesListResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new UserRolesListResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserRolesListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserRolesListResponse> getParserForType() {
    return PARSER;
  }

  public com.wanfang.personal.UserRolesListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

