// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: home/msg_home.proto

package com.wanfang.home;

/**
 * Protobuf enum {@code home.HOMELISTTYPE}
 */
public enum HOMELISTTYPE
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 基金会议
   * </pre>
   *
   * <code>TYPE_FOUNDE = 0;</code>
   */
  TYPE_FOUNDE(0),
  /**
   * <pre>
   * 科技动态
   * </pre>
   *
   * <code>TYPE_CONFERENCE = 1;</code>
   */
  TYPE_CONFERENCE(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 基金会议
   * </pre>
   *
   * <code>TYPE_FOUNDE = 0;</code>
   */
  public static final int TYPE_FOUNDE_VALUE = 0;
  /**
   * <pre>
   * 科技动态
   * </pre>
   *
   * <code>TYPE_CONFERENCE = 1;</code>
   */
  public static final int TYPE_CONFERENCE_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static HOMELISTTYPE valueOf(int value) {
    return forNumber(value);
  }

  public static HOMELISTTYPE forNumber(int value) {
    switch (value) {
      case 0: return TYPE_FOUNDE;
      case 1: return TYPE_CONFERENCE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<HOMELISTTYPE>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      HOMELISTTYPE> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<HOMELISTTYPE>() {
          public HOMELISTTYPE findValueByNumber(int number) {
            return HOMELISTTYPE.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.wanfang.home.MsgHome.getDescriptor()
        .getEnumTypes().get(0);
  }

  private static final HOMELISTTYPE[] VALUES = values();

  public static HOMELISTTYPE valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private HOMELISTTYPE(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:home.HOMELISTTYPE)
}

