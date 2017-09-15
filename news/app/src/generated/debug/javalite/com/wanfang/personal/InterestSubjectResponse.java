// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: msg_interest_word.proto

package com.wanfang.personal;

/**
 * Protobuf type {@code personal.InterestSubjectResponse}
 */
public  final class InterestSubjectResponse extends
    com.google.protobuf.GeneratedMessageLite<
        InterestSubjectResponse, InterestSubjectResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:personal.InterestSubjectResponse)
    InterestSubjectResponseOrBuilder {
  private InterestSubjectResponse() {
    subject_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  private int bitField0_;
  public static final int SUBJECT_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<String> subject_;
  /**
   * <pre>
   * 根据关键字查询的主题列表
   * </pre>
   *
   * <code>repeated string subject = 1;</code>
   */
  public java.util.List<String> getSubjectList() {
    return subject_;
  }
  /**
   * <pre>
   * 根据关键字查询的主题列表
   * </pre>
   *
   * <code>repeated string subject = 1;</code>
   */
  public int getSubjectCount() {
    return subject_.size();
  }
  /**
   * <pre>
   * 根据关键字查询的主题列表
   * </pre>
   *
   * <code>repeated string subject = 1;</code>
   */
  public java.lang.String getSubject(int index) {
    return subject_.get(index);
  }
  /**
   * <pre>
   * 根据关键字查询的主题列表
   * </pre>
   *
   * <code>repeated string subject = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSubjectBytes(int index) {
    return com.google.protobuf.ByteString.copyFromUtf8(
        subject_.get(index));
  }
  private void ensureSubjectIsMutable() {
    if (!subject_.isModifiable()) {
      subject_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(subject_);
     }
  }
  /**
   * <pre>
   * 根据关键字查询的主题列表
   * </pre>
   *
   * <code>repeated string subject = 1;</code>
   */
  private void setSubject(
      int index, java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureSubjectIsMutable();
    subject_.set(index, value);
  }
  /**
   * <pre>
   * 根据关键字查询的主题列表
   * </pre>
   *
   * <code>repeated string subject = 1;</code>
   */
  private void addSubject(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  ensureSubjectIsMutable();
    subject_.add(value);
  }
  /**
   * <pre>
   * 根据关键字查询的主题列表
   * </pre>
   *
   * <code>repeated string subject = 1;</code>
   */
  private void addAllSubject(
      java.lang.Iterable<java.lang.String> values) {
    ensureSubjectIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, subject_);
  }
  /**
   * <pre>
   * 根据关键字查询的主题列表
   * </pre>
   *
   * <code>repeated string subject = 1;</code>
   */
  private void clearSubject() {
    subject_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
  }
  /**
   * <pre>
   * 根据关键字查询的主题列表
   * </pre>
   *
   * <code>repeated string subject = 1;</code>
   */
  private void addSubjectBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    ensureSubjectIsMutable();
    subject_.add(value.toStringUtf8());
  }

  public static final int TOTAL_COUNT_FIELD_NUMBER = 2;
  private int totalCount_;
  /**
   * <pre>
   * 命中数
   * </pre>
   *
   * <code>optional int32 total_count = 2;</code>
   */
  public int getTotalCount() {
    return totalCount_;
  }
  /**
   * <pre>
   * 命中数
   * </pre>
   *
   * <code>optional int32 total_count = 2;</code>
   */
  private void setTotalCount(int value) {
    
    totalCount_ = value;
  }
  /**
   * <pre>
   * 命中数
   * </pre>
   *
   * <code>optional int32 total_count = 2;</code>
   */
  private void clearTotalCount() {
    
    totalCount_ = 0;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < subject_.size(); i++) {
      output.writeString(1, subject_.get(i));
    }
    if (totalCount_ != 0) {
      output.writeInt32(2, totalCount_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < subject_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeStringSizeNoTag(subject_.get(i));
      }
      size += dataSize;
      size += 1 * getSubjectList().size();
    }
    if (totalCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, totalCount_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.wanfang.personal.InterestSubjectResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.wanfang.personal.InterestSubjectResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.wanfang.personal.InterestSubjectResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.wanfang.personal.InterestSubjectResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.wanfang.personal.InterestSubjectResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.wanfang.personal.InterestSubjectResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.wanfang.personal.InterestSubjectResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.wanfang.personal.InterestSubjectResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.wanfang.personal.InterestSubjectResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.wanfang.personal.InterestSubjectResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.wanfang.personal.InterestSubjectResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code personal.InterestSubjectResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.wanfang.personal.InterestSubjectResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:personal.InterestSubjectResponse)
      com.wanfang.personal.InterestSubjectResponseOrBuilder {
    // Construct using com.wanfang.personal.InterestSubjectResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * 根据关键字查询的主题列表
     * </pre>
     *
     * <code>repeated string subject = 1;</code>
     */
    public java.util.List<String>
        getSubjectList() {
      return java.util.Collections.unmodifiableList(
          instance.getSubjectList());
    }
    /**
     * <pre>
     * 根据关键字查询的主题列表
     * </pre>
     *
     * <code>repeated string subject = 1;</code>
     */
    public int getSubjectCount() {
      return instance.getSubjectCount();
    }
    /**
     * <pre>
     * 根据关键字查询的主题列表
     * </pre>
     *
     * <code>repeated string subject = 1;</code>
     */
    public java.lang.String getSubject(int index) {
      return instance.getSubject(index);
    }
    /**
     * <pre>
     * 根据关键字查询的主题列表
     * </pre>
     *
     * <code>repeated string subject = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSubjectBytes(int index) {
      return instance.getSubjectBytes(index);
    }
    /**
     * <pre>
     * 根据关键字查询的主题列表
     * </pre>
     *
     * <code>repeated string subject = 1;</code>
     */
    public Builder setSubject(
        int index, java.lang.String value) {
      copyOnWrite();
      instance.setSubject(index, value);
      return this;
    }
    /**
     * <pre>
     * 根据关键字查询的主题列表
     * </pre>
     *
     * <code>repeated string subject = 1;</code>
     */
    public Builder addSubject(
        java.lang.String value) {
      copyOnWrite();
      instance.addSubject(value);
      return this;
    }
    /**
     * <pre>
     * 根据关键字查询的主题列表
     * </pre>
     *
     * <code>repeated string subject = 1;</code>
     */
    public Builder addAllSubject(
        java.lang.Iterable<java.lang.String> values) {
      copyOnWrite();
      instance.addAllSubject(values);
      return this;
    }
    /**
     * <pre>
     * 根据关键字查询的主题列表
     * </pre>
     *
     * <code>repeated string subject = 1;</code>
     */
    public Builder clearSubject() {
      copyOnWrite();
      instance.clearSubject();
      return this;
    }
    /**
     * <pre>
     * 根据关键字查询的主题列表
     * </pre>
     *
     * <code>repeated string subject = 1;</code>
     */
    public Builder addSubjectBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.addSubjectBytes(value);
      return this;
    }

    /**
     * <pre>
     * 命中数
     * </pre>
     *
     * <code>optional int32 total_count = 2;</code>
     */
    public int getTotalCount() {
      return instance.getTotalCount();
    }
    /**
     * <pre>
     * 命中数
     * </pre>
     *
     * <code>optional int32 total_count = 2;</code>
     */
    public Builder setTotalCount(int value) {
      copyOnWrite();
      instance.setTotalCount(value);
      return this;
    }
    /**
     * <pre>
     * 命中数
     * </pre>
     *
     * <code>optional int32 total_count = 2;</code>
     */
    public Builder clearTotalCount() {
      copyOnWrite();
      instance.clearTotalCount();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:personal.InterestSubjectResponse)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.wanfang.personal.InterestSubjectResponse();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        subject_.makeImmutable();
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.wanfang.personal.InterestSubjectResponse other = (com.wanfang.personal.InterestSubjectResponse) arg1;
        subject_= visitor.visitList(subject_, other.subject_);
        totalCount_ = visitor.visitInt(totalCount_ != 0, totalCount_,
            other.totalCount_ != 0, other.totalCount_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
          bitField0_ |= other.bitField0_;
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
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
                String s = input.readStringRequireUtf8();
                if (!subject_.isModifiable()) {
                  subject_ =
                      com.google.protobuf.GeneratedMessageLite.mutableCopy(subject_);
                }
                subject_.add(s);
                break;
              }
              case 16: {

                totalCount_ = input.readInt32();
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (com.wanfang.personal.InterestSubjectResponse.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:personal.InterestSubjectResponse)
  private static final com.wanfang.personal.InterestSubjectResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new InterestSubjectResponse();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.wanfang.personal.InterestSubjectResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<InterestSubjectResponse> PARSER;

  public static com.google.protobuf.Parser<InterestSubjectResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

