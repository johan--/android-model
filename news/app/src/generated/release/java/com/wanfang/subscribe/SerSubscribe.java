// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: subscribe/ser_subscribe.proto

package com.wanfang.subscribe;

public final class SerSubscribe {
  private SerSubscribe() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035subscribe/ser_subscribe.proto\022\tsubscri" +
      "be\032\035subscribe/msg_subscribe.proto\032!subsc" +
      "ribe/msg_subscribe_doc.proto\032%subscribe/" +
      "msg_subscribe_keyword.proto\032#subscribe/m" +
      "sg_subscribe_perio.proto2\366\n\n\020SubscribeSe" +
      "rvice\022X\n\017CancelSubscribe\022!.subscribe.Can" +
      "celSubscribeRequest\032\".subscribe.CancelSu" +
      "bscribeResponse\022g\n\021CheckIsSubscribed\022(.s" +
      "ubscribe.CheckPerioISSubscribedRequest\032(" +
      ".subscribe.CheckPerioISSubscribeResponse",
      "\022[\n\020SubscribeKeyword\022\".subscribe.Subscri" +
      "beKeywordRequest\032#.subscribe.SubscribeKe" +
      "ywordResponse\022j\n\027GetSubscribeKeywordList" +
      "\022&.subscribe.SubscribeKeywordListRequest" +
      "\032\'.subscribe.SubscribeKeywordListRespons" +
      "e\022g\n\034GetSubscribeDocListByKeyword\022\".subs" +
      "cribe.SubscribeDocListRequest\032#.subscrib" +
      "e.SubscribeDocListResponse\022U\n\016SubscribeP" +
      "erio\022 .subscribe.SubscribePerioRequest\032!" +
      ".subscribe.SubscribePerioResponse\022d\n\025Get",
      "SubscribePerioList\022$.subscribe.Subscribe" +
      "PerioListRequest\032%.subscribe.SubscribePe" +
      "rioListResponse\022y\n\034GetAddSubscribePerioT" +
      "reeList\022+.subscribe.AddSubscribePerioTre" +
      "eListRequest\032,.subscribe.AddSubscribePer" +
      "ioTreeListResponse\022y\n\036GetAddSubscribePer" +
      "ioSearchList\022*.subscribe.SubscribePerioL" +
      "istSearchRequest\032+.subscribe.SubscribePe" +
      "rioListSearchResponse\022j\n\027GetSubscribeDoc" +
      "TypeList\022&.subscribe.SubscribeDocTypeLis",
      "tRequest\032\'.subscribe.SubscribeDocTypeLis" +
      "tResponse\022s\n\032GetSubscribeSourceTypeList\022" +
      ").subscribe.SubscribeSourceTypeListReque" +
      "st\032*.subscribe.SubscribeSourceTypeListRe" +
      "sponse\022d\n\025GetSubscribePushEmail\022$.subscr" +
      "ibe.SubscribePushEmailRequest\032%.subscrib" +
      "e.SubscribePushEmailResponse\022s\n\030UpdateSu" +
      "bscribePushEmail\022*.subscribe.UpdateSubsc" +
      "ribePushEmailRequest\032+.subscribe.UpdateS" +
      "ubscribePushEmailResponseB \n\025com.wanfang",
      ".subscribeP\001\242\002\004WFPRb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.wanfang.subscribe.MsgSubscribe.getDescriptor(),
          com.wanfang.subscribe.MsgSubscribeDoc.getDescriptor(),
          com.wanfang.subscribe.MsgSubscribeKeyword.getDescriptor(),
          com.wanfang.subscribe.MsgSubscribePerio.getDescriptor(),
        }, assigner);
    com.wanfang.subscribe.MsgSubscribe.getDescriptor();
    com.wanfang.subscribe.MsgSubscribeDoc.getDescriptor();
    com.wanfang.subscribe.MsgSubscribeKeyword.getDescriptor();
    com.wanfang.subscribe.MsgSubscribePerio.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
