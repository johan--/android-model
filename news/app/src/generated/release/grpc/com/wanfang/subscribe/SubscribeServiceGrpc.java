package com.wanfang.subscribe;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: subscribe/ser_subscribe.proto")
public final class SubscribeServiceGrpc {

  private SubscribeServiceGrpc() {}

  public static final String SERVICE_NAME = "subscribe.SubscribeService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.subscribe.CancelSubscribeRequest,
      com.wanfang.subscribe.CancelSubscribeResponse> METHOD_CANCEL_SUBSCRIBE =
      io.grpc.MethodDescriptor.<com.wanfang.subscribe.CancelSubscribeRequest, com.wanfang.subscribe.CancelSubscribeResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "subscribe.SubscribeService", "CancelSubscribe"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.subscribe.CancelSubscribeRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.subscribe.CancelSubscribeResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.subscribe.CheckPerioISSubscribedRequest,
      com.wanfang.subscribe.CheckPerioISSubscribeResponse> METHOD_CHECK_IS_SUBSCRIBED =
      io.grpc.MethodDescriptor.<com.wanfang.subscribe.CheckPerioISSubscribedRequest, com.wanfang.subscribe.CheckPerioISSubscribeResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "subscribe.SubscribeService", "CheckIsSubscribed"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.subscribe.CheckPerioISSubscribedRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.subscribe.CheckPerioISSubscribeResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.subscribe.SubscribeKeywordRequest,
      com.wanfang.subscribe.SubscribeKeywordResponse> METHOD_SUBSCRIBE_KEYWORD =
      io.grpc.MethodDescriptor.<com.wanfang.subscribe.SubscribeKeywordRequest, com.wanfang.subscribe.SubscribeKeywordResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "subscribe.SubscribeService", "SubscribeKeyword"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.subscribe.SubscribeKeywordRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.subscribe.SubscribeKeywordResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.subscribe.SubscribeKeywordListRequest,
      com.wanfang.subscribe.SubscribeKeywordListResponse> METHOD_GET_SUBSCRIBE_KEYWORD_LIST =
      io.grpc.MethodDescriptor.<com.wanfang.subscribe.SubscribeKeywordListRequest, com.wanfang.subscribe.SubscribeKeywordListResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "subscribe.SubscribeService", "GetSubscribeKeywordList"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.subscribe.SubscribeKeywordListRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.subscribe.SubscribeKeywordListResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.subscribe.SubscribeDocListRequest,
      com.wanfang.subscribe.SubscribeDocListResponse> METHOD_GET_SUBSCRIBE_DOC_LIST_BY_KEYWORD =
      io.grpc.MethodDescriptor.<com.wanfang.subscribe.SubscribeDocListRequest, com.wanfang.subscribe.SubscribeDocListResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "subscribe.SubscribeService", "GetSubscribeDocListByKeyword"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.subscribe.SubscribeDocListRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.subscribe.SubscribeDocListResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.subscribe.SubscribePerioRequest,
      com.wanfang.subscribe.SubscribePerioResponse> METHOD_SUBSCRIBE_PERIO =
      io.grpc.MethodDescriptor.<com.wanfang.subscribe.SubscribePerioRequest, com.wanfang.subscribe.SubscribePerioResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "subscribe.SubscribeService", "SubscribePerio"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.subscribe.SubscribePerioRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.subscribe.SubscribePerioResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.subscribe.SubscribePerioListRequest,
      com.wanfang.subscribe.SubscribePerioListResponse> METHOD_GET_SUBSCRIBE_PERIO_LIST =
      io.grpc.MethodDescriptor.<com.wanfang.subscribe.SubscribePerioListRequest, com.wanfang.subscribe.SubscribePerioListResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "subscribe.SubscribeService", "GetSubscribePerioList"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.subscribe.SubscribePerioListRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.subscribe.SubscribePerioListResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.subscribe.AddSubscribePerioTreeListRequest,
      com.wanfang.subscribe.AddSubscribePerioTreeListResponse> METHOD_GET_ADD_SUBSCRIBE_PERIO_TREE_LIST =
      io.grpc.MethodDescriptor.<com.wanfang.subscribe.AddSubscribePerioTreeListRequest, com.wanfang.subscribe.AddSubscribePerioTreeListResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "subscribe.SubscribeService", "GetAddSubscribePerioTreeList"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.subscribe.AddSubscribePerioTreeListRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.subscribe.AddSubscribePerioTreeListResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.subscribe.SubscribePerioListSearchRequest,
      com.wanfang.subscribe.SubscribePerioListSearchResponse> METHOD_GET_ADD_SUBSCRIBE_PERIO_SEARCH_LIST =
      io.grpc.MethodDescriptor.<com.wanfang.subscribe.SubscribePerioListSearchRequest, com.wanfang.subscribe.SubscribePerioListSearchResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "subscribe.SubscribeService", "GetAddSubscribePerioSearchList"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.subscribe.SubscribePerioListSearchRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.subscribe.SubscribePerioListSearchResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.subscribe.SubscribeDocTypeListRequest,
      com.wanfang.subscribe.SubscribeDocTypeListResponse> METHOD_GET_SUBSCRIBE_DOC_TYPE_LIST =
      io.grpc.MethodDescriptor.<com.wanfang.subscribe.SubscribeDocTypeListRequest, com.wanfang.subscribe.SubscribeDocTypeListResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "subscribe.SubscribeService", "GetSubscribeDocTypeList"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.subscribe.SubscribeDocTypeListRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.subscribe.SubscribeDocTypeListResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.subscribe.SubscribeSourceTypeListRequest,
      com.wanfang.subscribe.SubscribeSourceTypeListResponse> METHOD_GET_SUBSCRIBE_SOURCE_TYPE_LIST =
      io.grpc.MethodDescriptor.<com.wanfang.subscribe.SubscribeSourceTypeListRequest, com.wanfang.subscribe.SubscribeSourceTypeListResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "subscribe.SubscribeService", "GetSubscribeSourceTypeList"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.subscribe.SubscribeSourceTypeListRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.subscribe.SubscribeSourceTypeListResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.subscribe.SubscribePushEmailRequest,
      com.wanfang.subscribe.SubscribePushEmailResponse> METHOD_GET_SUBSCRIBE_PUSH_EMAIL =
      io.grpc.MethodDescriptor.<com.wanfang.subscribe.SubscribePushEmailRequest, com.wanfang.subscribe.SubscribePushEmailResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "subscribe.SubscribeService", "GetSubscribePushEmail"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.subscribe.SubscribePushEmailRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.subscribe.SubscribePushEmailResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.subscribe.UpdateSubscribePushEmailRequest,
      com.wanfang.subscribe.UpdateSubscribePushEmailResponse> METHOD_UPDATE_SUBSCRIBE_PUSH_EMAIL =
      io.grpc.MethodDescriptor.<com.wanfang.subscribe.UpdateSubscribePushEmailRequest, com.wanfang.subscribe.UpdateSubscribePushEmailResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "subscribe.SubscribeService", "UpdateSubscribePushEmail"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.subscribe.UpdateSubscribePushEmailRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.subscribe.UpdateSubscribePushEmailResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SubscribeServiceStub newStub(io.grpc.Channel channel) {
    return new SubscribeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SubscribeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SubscribeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SubscribeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SubscribeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SubscribeServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 取消订阅
     * </pre>
     */
    public void cancelSubscribe(com.wanfang.subscribe.CancelSubscribeRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.subscribe.CancelSubscribeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CANCEL_SUBSCRIBE, responseObserver);
    }

    /**
     * <pre>
     * 检查期刊是否已经被订阅
     * </pre>
     */
    public void checkIsSubscribed(com.wanfang.subscribe.CheckPerioISSubscribedRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.subscribe.CheckPerioISSubscribeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CHECK_IS_SUBSCRIBED, responseObserver);
    }

    /**
     * <pre>
     * 订阅关键词
     * </pre>
     */
    public void subscribeKeyword(com.wanfang.subscribe.SubscribeKeywordRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.subscribe.SubscribeKeywordResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SUBSCRIBE_KEYWORD, responseObserver);
    }

    /**
     * <pre>
     * 获取已订阅关键词列表
     * </pre>
     */
    public void getSubscribeKeywordList(com.wanfang.subscribe.SubscribeKeywordListRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.subscribe.SubscribeKeywordListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SUBSCRIBE_KEYWORD_LIST, responseObserver);
    }

    /**
     * <pre>
     * 根据关键词获取对应已订阅文献列表
     * </pre>
     */
    public void getSubscribeDocListByKeyword(com.wanfang.subscribe.SubscribeDocListRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.subscribe.SubscribeDocListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SUBSCRIBE_DOC_LIST_BY_KEYWORD, responseObserver);
    }

    /**
     * <pre>
     * 订阅期刊
     * </pre>
     */
    public void subscribePerio(com.wanfang.subscribe.SubscribePerioRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.subscribe.SubscribePerioResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SUBSCRIBE_PERIO, responseObserver);
    }

    /**
     * <pre>
     * 获取已订阅期刊列表
     * </pre>
     */
    public void getSubscribePerioList(com.wanfang.subscribe.SubscribePerioListRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.subscribe.SubscribePerioListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SUBSCRIBE_PERIO_LIST, responseObserver);
    }

    /**
     * <pre>
     * 添加期刊订阅时 左侧的列表数据
     * </pre>
     */
    public void getAddSubscribePerioTreeList(com.wanfang.subscribe.AddSubscribePerioTreeListRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.subscribe.AddSubscribePerioTreeListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ADD_SUBSCRIBE_PERIO_TREE_LIST, responseObserver);
    }

    /**
     * <pre>
     * 添加期刊订阅时  右侧期刊列表数据
     * </pre>
     */
    public void getAddSubscribePerioSearchList(com.wanfang.subscribe.SubscribePerioListSearchRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.subscribe.SubscribePerioListSearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ADD_SUBSCRIBE_PERIO_SEARCH_LIST, responseObserver);
    }

    /**
     * <pre>
     * 获取添加关键词订阅时选取的文献类型列表
     * </pre>
     */
    public void getSubscribeDocTypeList(com.wanfang.subscribe.SubscribeDocTypeListRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.subscribe.SubscribeDocTypeListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SUBSCRIBE_DOC_TYPE_LIST, responseObserver);
    }

    /**
     * <pre>
     * 获取添加关键词订阅时选取的来源类别列表
     * </pre>
     */
    public void getSubscribeSourceTypeList(com.wanfang.subscribe.SubscribeSourceTypeListRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.subscribe.SubscribeSourceTypeListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SUBSCRIBE_SOURCE_TYPE_LIST, responseObserver);
    }

    /**
     * <pre>
     * 获取推送邮箱，如果邮箱地址不为空，在添加订阅关键词时，should_update_email为true
     * </pre>
     */
    public void getSubscribePushEmail(com.wanfang.subscribe.SubscribePushEmailRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.subscribe.SubscribePushEmailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SUBSCRIBE_PUSH_EMAIL, responseObserver);
    }

    /**
     * <pre>
     * 更新推送邮箱
     * </pre>
     */
    public void updateSubscribePushEmail(com.wanfang.subscribe.UpdateSubscribePushEmailRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.subscribe.UpdateSubscribePushEmailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_SUBSCRIBE_PUSH_EMAIL, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CANCEL_SUBSCRIBE,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.subscribe.CancelSubscribeRequest,
                com.wanfang.subscribe.CancelSubscribeResponse>(
                  this, METHODID_CANCEL_SUBSCRIBE)))
          .addMethod(
            METHOD_CHECK_IS_SUBSCRIBED,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.subscribe.CheckPerioISSubscribedRequest,
                com.wanfang.subscribe.CheckPerioISSubscribeResponse>(
                  this, METHODID_CHECK_IS_SUBSCRIBED)))
          .addMethod(
            METHOD_SUBSCRIBE_KEYWORD,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.subscribe.SubscribeKeywordRequest,
                com.wanfang.subscribe.SubscribeKeywordResponse>(
                  this, METHODID_SUBSCRIBE_KEYWORD)))
          .addMethod(
            METHOD_GET_SUBSCRIBE_KEYWORD_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.subscribe.SubscribeKeywordListRequest,
                com.wanfang.subscribe.SubscribeKeywordListResponse>(
                  this, METHODID_GET_SUBSCRIBE_KEYWORD_LIST)))
          .addMethod(
            METHOD_GET_SUBSCRIBE_DOC_LIST_BY_KEYWORD,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.subscribe.SubscribeDocListRequest,
                com.wanfang.subscribe.SubscribeDocListResponse>(
                  this, METHODID_GET_SUBSCRIBE_DOC_LIST_BY_KEYWORD)))
          .addMethod(
            METHOD_SUBSCRIBE_PERIO,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.subscribe.SubscribePerioRequest,
                com.wanfang.subscribe.SubscribePerioResponse>(
                  this, METHODID_SUBSCRIBE_PERIO)))
          .addMethod(
            METHOD_GET_SUBSCRIBE_PERIO_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.subscribe.SubscribePerioListRequest,
                com.wanfang.subscribe.SubscribePerioListResponse>(
                  this, METHODID_GET_SUBSCRIBE_PERIO_LIST)))
          .addMethod(
            METHOD_GET_ADD_SUBSCRIBE_PERIO_TREE_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.subscribe.AddSubscribePerioTreeListRequest,
                com.wanfang.subscribe.AddSubscribePerioTreeListResponse>(
                  this, METHODID_GET_ADD_SUBSCRIBE_PERIO_TREE_LIST)))
          .addMethod(
            METHOD_GET_ADD_SUBSCRIBE_PERIO_SEARCH_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.subscribe.SubscribePerioListSearchRequest,
                com.wanfang.subscribe.SubscribePerioListSearchResponse>(
                  this, METHODID_GET_ADD_SUBSCRIBE_PERIO_SEARCH_LIST)))
          .addMethod(
            METHOD_GET_SUBSCRIBE_DOC_TYPE_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.subscribe.SubscribeDocTypeListRequest,
                com.wanfang.subscribe.SubscribeDocTypeListResponse>(
                  this, METHODID_GET_SUBSCRIBE_DOC_TYPE_LIST)))
          .addMethod(
            METHOD_GET_SUBSCRIBE_SOURCE_TYPE_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.subscribe.SubscribeSourceTypeListRequest,
                com.wanfang.subscribe.SubscribeSourceTypeListResponse>(
                  this, METHODID_GET_SUBSCRIBE_SOURCE_TYPE_LIST)))
          .addMethod(
            METHOD_GET_SUBSCRIBE_PUSH_EMAIL,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.subscribe.SubscribePushEmailRequest,
                com.wanfang.subscribe.SubscribePushEmailResponse>(
                  this, METHODID_GET_SUBSCRIBE_PUSH_EMAIL)))
          .addMethod(
            METHOD_UPDATE_SUBSCRIBE_PUSH_EMAIL,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.subscribe.UpdateSubscribePushEmailRequest,
                com.wanfang.subscribe.UpdateSubscribePushEmailResponse>(
                  this, METHODID_UPDATE_SUBSCRIBE_PUSH_EMAIL)))
          .build();
    }
  }

  /**
   */
  public static final class SubscribeServiceStub extends io.grpc.stub.AbstractStub<SubscribeServiceStub> {
    private SubscribeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SubscribeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubscribeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SubscribeServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 取消订阅
     * </pre>
     */
    public void cancelSubscribe(com.wanfang.subscribe.CancelSubscribeRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.subscribe.CancelSubscribeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CANCEL_SUBSCRIBE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 检查期刊是否已经被订阅
     * </pre>
     */
    public void checkIsSubscribed(com.wanfang.subscribe.CheckPerioISSubscribedRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.subscribe.CheckPerioISSubscribeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CHECK_IS_SUBSCRIBED, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 订阅关键词
     * </pre>
     */
    public void subscribeKeyword(com.wanfang.subscribe.SubscribeKeywordRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.subscribe.SubscribeKeywordResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SUBSCRIBE_KEYWORD, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取已订阅关键词列表
     * </pre>
     */
    public void getSubscribeKeywordList(com.wanfang.subscribe.SubscribeKeywordListRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.subscribe.SubscribeKeywordListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SUBSCRIBE_KEYWORD_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 根据关键词获取对应已订阅文献列表
     * </pre>
     */
    public void getSubscribeDocListByKeyword(com.wanfang.subscribe.SubscribeDocListRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.subscribe.SubscribeDocListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SUBSCRIBE_DOC_LIST_BY_KEYWORD, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 订阅期刊
     * </pre>
     */
    public void subscribePerio(com.wanfang.subscribe.SubscribePerioRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.subscribe.SubscribePerioResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SUBSCRIBE_PERIO, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取已订阅期刊列表
     * </pre>
     */
    public void getSubscribePerioList(com.wanfang.subscribe.SubscribePerioListRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.subscribe.SubscribePerioListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SUBSCRIBE_PERIO_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 添加期刊订阅时 左侧的列表数据
     * </pre>
     */
    public void getAddSubscribePerioTreeList(com.wanfang.subscribe.AddSubscribePerioTreeListRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.subscribe.AddSubscribePerioTreeListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ADD_SUBSCRIBE_PERIO_TREE_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 添加期刊订阅时  右侧期刊列表数据
     * </pre>
     */
    public void getAddSubscribePerioSearchList(com.wanfang.subscribe.SubscribePerioListSearchRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.subscribe.SubscribePerioListSearchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ADD_SUBSCRIBE_PERIO_SEARCH_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取添加关键词订阅时选取的文献类型列表
     * </pre>
     */
    public void getSubscribeDocTypeList(com.wanfang.subscribe.SubscribeDocTypeListRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.subscribe.SubscribeDocTypeListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SUBSCRIBE_DOC_TYPE_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取添加关键词订阅时选取的来源类别列表
     * </pre>
     */
    public void getSubscribeSourceTypeList(com.wanfang.subscribe.SubscribeSourceTypeListRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.subscribe.SubscribeSourceTypeListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SUBSCRIBE_SOURCE_TYPE_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取推送邮箱，如果邮箱地址不为空，在添加订阅关键词时，should_update_email为true
     * </pre>
     */
    public void getSubscribePushEmail(com.wanfang.subscribe.SubscribePushEmailRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.subscribe.SubscribePushEmailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SUBSCRIBE_PUSH_EMAIL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更新推送邮箱
     * </pre>
     */
    public void updateSubscribePushEmail(com.wanfang.subscribe.UpdateSubscribePushEmailRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.subscribe.UpdateSubscribePushEmailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_SUBSCRIBE_PUSH_EMAIL, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SubscribeServiceBlockingStub extends io.grpc.stub.AbstractStub<SubscribeServiceBlockingStub> {
    private SubscribeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SubscribeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubscribeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SubscribeServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 取消订阅
     * </pre>
     */
    public com.wanfang.subscribe.CancelSubscribeResponse cancelSubscribe(com.wanfang.subscribe.CancelSubscribeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CANCEL_SUBSCRIBE, getCallOptions(), request);
    }

    /**
     * <pre>
     * 检查期刊是否已经被订阅
     * </pre>
     */
    public com.wanfang.subscribe.CheckPerioISSubscribeResponse checkIsSubscribed(com.wanfang.subscribe.CheckPerioISSubscribedRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CHECK_IS_SUBSCRIBED, getCallOptions(), request);
    }

    /**
     * <pre>
     * 订阅关键词
     * </pre>
     */
    public com.wanfang.subscribe.SubscribeKeywordResponse subscribeKeyword(com.wanfang.subscribe.SubscribeKeywordRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SUBSCRIBE_KEYWORD, getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取已订阅关键词列表
     * </pre>
     */
    public com.wanfang.subscribe.SubscribeKeywordListResponse getSubscribeKeywordList(com.wanfang.subscribe.SubscribeKeywordListRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SUBSCRIBE_KEYWORD_LIST, getCallOptions(), request);
    }

    /**
     * <pre>
     * 根据关键词获取对应已订阅文献列表
     * </pre>
     */
    public com.wanfang.subscribe.SubscribeDocListResponse getSubscribeDocListByKeyword(com.wanfang.subscribe.SubscribeDocListRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SUBSCRIBE_DOC_LIST_BY_KEYWORD, getCallOptions(), request);
    }

    /**
     * <pre>
     * 订阅期刊
     * </pre>
     */
    public com.wanfang.subscribe.SubscribePerioResponse subscribePerio(com.wanfang.subscribe.SubscribePerioRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SUBSCRIBE_PERIO, getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取已订阅期刊列表
     * </pre>
     */
    public com.wanfang.subscribe.SubscribePerioListResponse getSubscribePerioList(com.wanfang.subscribe.SubscribePerioListRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SUBSCRIBE_PERIO_LIST, getCallOptions(), request);
    }

    /**
     * <pre>
     * 添加期刊订阅时 左侧的列表数据
     * </pre>
     */
    public com.wanfang.subscribe.AddSubscribePerioTreeListResponse getAddSubscribePerioTreeList(com.wanfang.subscribe.AddSubscribePerioTreeListRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ADD_SUBSCRIBE_PERIO_TREE_LIST, getCallOptions(), request);
    }

    /**
     * <pre>
     * 添加期刊订阅时  右侧期刊列表数据
     * </pre>
     */
    public com.wanfang.subscribe.SubscribePerioListSearchResponse getAddSubscribePerioSearchList(com.wanfang.subscribe.SubscribePerioListSearchRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ADD_SUBSCRIBE_PERIO_SEARCH_LIST, getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取添加关键词订阅时选取的文献类型列表
     * </pre>
     */
    public com.wanfang.subscribe.SubscribeDocTypeListResponse getSubscribeDocTypeList(com.wanfang.subscribe.SubscribeDocTypeListRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SUBSCRIBE_DOC_TYPE_LIST, getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取添加关键词订阅时选取的来源类别列表
     * </pre>
     */
    public com.wanfang.subscribe.SubscribeSourceTypeListResponse getSubscribeSourceTypeList(com.wanfang.subscribe.SubscribeSourceTypeListRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SUBSCRIBE_SOURCE_TYPE_LIST, getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取推送邮箱，如果邮箱地址不为空，在添加订阅关键词时，should_update_email为true
     * </pre>
     */
    public com.wanfang.subscribe.SubscribePushEmailResponse getSubscribePushEmail(com.wanfang.subscribe.SubscribePushEmailRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SUBSCRIBE_PUSH_EMAIL, getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新推送邮箱
     * </pre>
     */
    public com.wanfang.subscribe.UpdateSubscribePushEmailResponse updateSubscribePushEmail(com.wanfang.subscribe.UpdateSubscribePushEmailRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_SUBSCRIBE_PUSH_EMAIL, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SubscribeServiceFutureStub extends io.grpc.stub.AbstractStub<SubscribeServiceFutureStub> {
    private SubscribeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SubscribeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SubscribeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SubscribeServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 取消订阅
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.subscribe.CancelSubscribeResponse> cancelSubscribe(
        com.wanfang.subscribe.CancelSubscribeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CANCEL_SUBSCRIBE, getCallOptions()), request);
    }

    /**
     * <pre>
     * 检查期刊是否已经被订阅
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.subscribe.CheckPerioISSubscribeResponse> checkIsSubscribed(
        com.wanfang.subscribe.CheckPerioISSubscribedRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CHECK_IS_SUBSCRIBED, getCallOptions()), request);
    }

    /**
     * <pre>
     * 订阅关键词
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.subscribe.SubscribeKeywordResponse> subscribeKeyword(
        com.wanfang.subscribe.SubscribeKeywordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SUBSCRIBE_KEYWORD, getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取已订阅关键词列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.subscribe.SubscribeKeywordListResponse> getSubscribeKeywordList(
        com.wanfang.subscribe.SubscribeKeywordListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SUBSCRIBE_KEYWORD_LIST, getCallOptions()), request);
    }

    /**
     * <pre>
     * 根据关键词获取对应已订阅文献列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.subscribe.SubscribeDocListResponse> getSubscribeDocListByKeyword(
        com.wanfang.subscribe.SubscribeDocListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SUBSCRIBE_DOC_LIST_BY_KEYWORD, getCallOptions()), request);
    }

    /**
     * <pre>
     * 订阅期刊
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.subscribe.SubscribePerioResponse> subscribePerio(
        com.wanfang.subscribe.SubscribePerioRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SUBSCRIBE_PERIO, getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取已订阅期刊列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.subscribe.SubscribePerioListResponse> getSubscribePerioList(
        com.wanfang.subscribe.SubscribePerioListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SUBSCRIBE_PERIO_LIST, getCallOptions()), request);
    }

    /**
     * <pre>
     * 添加期刊订阅时 左侧的列表数据
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.subscribe.AddSubscribePerioTreeListResponse> getAddSubscribePerioTreeList(
        com.wanfang.subscribe.AddSubscribePerioTreeListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ADD_SUBSCRIBE_PERIO_TREE_LIST, getCallOptions()), request);
    }

    /**
     * <pre>
     * 添加期刊订阅时  右侧期刊列表数据
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.subscribe.SubscribePerioListSearchResponse> getAddSubscribePerioSearchList(
        com.wanfang.subscribe.SubscribePerioListSearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ADD_SUBSCRIBE_PERIO_SEARCH_LIST, getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取添加关键词订阅时选取的文献类型列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.subscribe.SubscribeDocTypeListResponse> getSubscribeDocTypeList(
        com.wanfang.subscribe.SubscribeDocTypeListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SUBSCRIBE_DOC_TYPE_LIST, getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取添加关键词订阅时选取的来源类别列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.subscribe.SubscribeSourceTypeListResponse> getSubscribeSourceTypeList(
        com.wanfang.subscribe.SubscribeSourceTypeListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SUBSCRIBE_SOURCE_TYPE_LIST, getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取推送邮箱，如果邮箱地址不为空，在添加订阅关键词时，should_update_email为true
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.subscribe.SubscribePushEmailResponse> getSubscribePushEmail(
        com.wanfang.subscribe.SubscribePushEmailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SUBSCRIBE_PUSH_EMAIL, getCallOptions()), request);
    }

    /**
     * <pre>
     * 更新推送邮箱
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.subscribe.UpdateSubscribePushEmailResponse> updateSubscribePushEmail(
        com.wanfang.subscribe.UpdateSubscribePushEmailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_SUBSCRIBE_PUSH_EMAIL, getCallOptions()), request);
    }
  }

  private static final int METHODID_CANCEL_SUBSCRIBE = 0;
  private static final int METHODID_CHECK_IS_SUBSCRIBED = 1;
  private static final int METHODID_SUBSCRIBE_KEYWORD = 2;
  private static final int METHODID_GET_SUBSCRIBE_KEYWORD_LIST = 3;
  private static final int METHODID_GET_SUBSCRIBE_DOC_LIST_BY_KEYWORD = 4;
  private static final int METHODID_SUBSCRIBE_PERIO = 5;
  private static final int METHODID_GET_SUBSCRIBE_PERIO_LIST = 6;
  private static final int METHODID_GET_ADD_SUBSCRIBE_PERIO_TREE_LIST = 7;
  private static final int METHODID_GET_ADD_SUBSCRIBE_PERIO_SEARCH_LIST = 8;
  private static final int METHODID_GET_SUBSCRIBE_DOC_TYPE_LIST = 9;
  private static final int METHODID_GET_SUBSCRIBE_SOURCE_TYPE_LIST = 10;
  private static final int METHODID_GET_SUBSCRIBE_PUSH_EMAIL = 11;
  private static final int METHODID_UPDATE_SUBSCRIBE_PUSH_EMAIL = 12;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SubscribeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SubscribeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CANCEL_SUBSCRIBE:
          serviceImpl.cancelSubscribe((com.wanfang.subscribe.CancelSubscribeRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.subscribe.CancelSubscribeResponse>) responseObserver);
          break;
        case METHODID_CHECK_IS_SUBSCRIBED:
          serviceImpl.checkIsSubscribed((com.wanfang.subscribe.CheckPerioISSubscribedRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.subscribe.CheckPerioISSubscribeResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_KEYWORD:
          serviceImpl.subscribeKeyword((com.wanfang.subscribe.SubscribeKeywordRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.subscribe.SubscribeKeywordResponse>) responseObserver);
          break;
        case METHODID_GET_SUBSCRIBE_KEYWORD_LIST:
          serviceImpl.getSubscribeKeywordList((com.wanfang.subscribe.SubscribeKeywordListRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.subscribe.SubscribeKeywordListResponse>) responseObserver);
          break;
        case METHODID_GET_SUBSCRIBE_DOC_LIST_BY_KEYWORD:
          serviceImpl.getSubscribeDocListByKeyword((com.wanfang.subscribe.SubscribeDocListRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.subscribe.SubscribeDocListResponse>) responseObserver);
          break;
        case METHODID_SUBSCRIBE_PERIO:
          serviceImpl.subscribePerio((com.wanfang.subscribe.SubscribePerioRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.subscribe.SubscribePerioResponse>) responseObserver);
          break;
        case METHODID_GET_SUBSCRIBE_PERIO_LIST:
          serviceImpl.getSubscribePerioList((com.wanfang.subscribe.SubscribePerioListRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.subscribe.SubscribePerioListResponse>) responseObserver);
          break;
        case METHODID_GET_ADD_SUBSCRIBE_PERIO_TREE_LIST:
          serviceImpl.getAddSubscribePerioTreeList((com.wanfang.subscribe.AddSubscribePerioTreeListRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.subscribe.AddSubscribePerioTreeListResponse>) responseObserver);
          break;
        case METHODID_GET_ADD_SUBSCRIBE_PERIO_SEARCH_LIST:
          serviceImpl.getAddSubscribePerioSearchList((com.wanfang.subscribe.SubscribePerioListSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.subscribe.SubscribePerioListSearchResponse>) responseObserver);
          break;
        case METHODID_GET_SUBSCRIBE_DOC_TYPE_LIST:
          serviceImpl.getSubscribeDocTypeList((com.wanfang.subscribe.SubscribeDocTypeListRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.subscribe.SubscribeDocTypeListResponse>) responseObserver);
          break;
        case METHODID_GET_SUBSCRIBE_SOURCE_TYPE_LIST:
          serviceImpl.getSubscribeSourceTypeList((com.wanfang.subscribe.SubscribeSourceTypeListRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.subscribe.SubscribeSourceTypeListResponse>) responseObserver);
          break;
        case METHODID_GET_SUBSCRIBE_PUSH_EMAIL:
          serviceImpl.getSubscribePushEmail((com.wanfang.subscribe.SubscribePushEmailRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.subscribe.SubscribePushEmailResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SUBSCRIBE_PUSH_EMAIL:
          serviceImpl.updateSubscribePushEmail((com.wanfang.subscribe.UpdateSubscribePushEmailRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.subscribe.UpdateSubscribePushEmailResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SubscribeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(METHOD_CANCEL_SUBSCRIBE)
              .addMethod(METHOD_CHECK_IS_SUBSCRIBED)
              .addMethod(METHOD_SUBSCRIBE_KEYWORD)
              .addMethod(METHOD_GET_SUBSCRIBE_KEYWORD_LIST)
              .addMethod(METHOD_GET_SUBSCRIBE_DOC_LIST_BY_KEYWORD)
              .addMethod(METHOD_SUBSCRIBE_PERIO)
              .addMethod(METHOD_GET_SUBSCRIBE_PERIO_LIST)
              .addMethod(METHOD_GET_ADD_SUBSCRIBE_PERIO_TREE_LIST)
              .addMethod(METHOD_GET_ADD_SUBSCRIBE_PERIO_SEARCH_LIST)
              .addMethod(METHOD_GET_SUBSCRIBE_DOC_TYPE_LIST)
              .addMethod(METHOD_GET_SUBSCRIBE_SOURCE_TYPE_LIST)
              .addMethod(METHOD_GET_SUBSCRIBE_PUSH_EMAIL)
              .addMethod(METHOD_UPDATE_SUBSCRIBE_PUSH_EMAIL)
              .build();
        }
      }
    }
    return result;
  }
}
