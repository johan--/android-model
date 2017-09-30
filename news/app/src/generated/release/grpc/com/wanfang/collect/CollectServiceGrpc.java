package com.wanfang.collect;

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
    comments = "Source: collect/ser_collect.proto")
public final class CollectServiceGrpc {

  private CollectServiceGrpc() {}

  public static final String SERVICE_NAME = "collect.CollectService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.collect.MyCollectDetailRequest,
      com.wanfang.collect.MyCollectDetailResponse> METHOD_GET_DOC_DETAIL =
      io.grpc.MethodDescriptor.<com.wanfang.collect.MyCollectDetailRequest, com.wanfang.collect.MyCollectDetailResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "collect.CollectService", "getDocDetail"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.collect.MyCollectDetailRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.collect.MyCollectDetailResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.collect.MyCollectRequest,
      com.wanfang.collect.MyCollectResponse> METHOD_GET_MY_COLLECT =
      io.grpc.MethodDescriptor.<com.wanfang.collect.MyCollectRequest, com.wanfang.collect.MyCollectResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "collect.CollectService", "GetMyCollect"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.collect.MyCollectRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.collect.MyCollectResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.collect.CollectRequest,
      com.wanfang.collect.CollectResponse> METHOD_COLLECT =
      io.grpc.MethodDescriptor.<com.wanfang.collect.CollectRequest, com.wanfang.collect.CollectResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "collect.CollectService", "Collect"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.collect.CollectRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.collect.CollectResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CollectServiceStub newStub(io.grpc.Channel channel) {
    return new CollectServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CollectServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CollectServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CollectServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CollectServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CollectServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 收藏列表详情
     * </pre>
     */
    public void getDocDetail(com.wanfang.collect.MyCollectDetailRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.collect.MyCollectDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_DOC_DETAIL, responseObserver);
    }

    /**
     * <pre>
     * 获取我的收藏
     * </pre>
     */
    public void getMyCollect(com.wanfang.collect.MyCollectRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.collect.MyCollectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_MY_COLLECT, responseObserver);
    }

    /**
     * <pre>
     * 收藏文献
     * </pre>
     */
    public void collect(com.wanfang.collect.CollectRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.collect.CollectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_COLLECT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_DOC_DETAIL,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.collect.MyCollectDetailRequest,
                com.wanfang.collect.MyCollectDetailResponse>(
                  this, METHODID_GET_DOC_DETAIL)))
          .addMethod(
            METHOD_GET_MY_COLLECT,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.collect.MyCollectRequest,
                com.wanfang.collect.MyCollectResponse>(
                  this, METHODID_GET_MY_COLLECT)))
          .addMethod(
            METHOD_COLLECT,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.collect.CollectRequest,
                com.wanfang.collect.CollectResponse>(
                  this, METHODID_COLLECT)))
          .build();
    }
  }

  /**
   */
  public static final class CollectServiceStub extends io.grpc.stub.AbstractStub<CollectServiceStub> {
    private CollectServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CollectServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CollectServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CollectServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 收藏列表详情
     * </pre>
     */
    public void getDocDetail(com.wanfang.collect.MyCollectDetailRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.collect.MyCollectDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_DOC_DETAIL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取我的收藏
     * </pre>
     */
    public void getMyCollect(com.wanfang.collect.MyCollectRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.collect.MyCollectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_MY_COLLECT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 收藏文献
     * </pre>
     */
    public void collect(com.wanfang.collect.CollectRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.collect.CollectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_COLLECT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CollectServiceBlockingStub extends io.grpc.stub.AbstractStub<CollectServiceBlockingStub> {
    private CollectServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CollectServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CollectServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CollectServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 收藏列表详情
     * </pre>
     */
    public com.wanfang.collect.MyCollectDetailResponse getDocDetail(com.wanfang.collect.MyCollectDetailRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_DOC_DETAIL, getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取我的收藏
     * </pre>
     */
    public com.wanfang.collect.MyCollectResponse getMyCollect(com.wanfang.collect.MyCollectRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_MY_COLLECT, getCallOptions(), request);
    }

    /**
     * <pre>
     * 收藏文献
     * </pre>
     */
    public com.wanfang.collect.CollectResponse collect(com.wanfang.collect.CollectRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_COLLECT, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CollectServiceFutureStub extends io.grpc.stub.AbstractStub<CollectServiceFutureStub> {
    private CollectServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CollectServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CollectServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CollectServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 收藏列表详情
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.collect.MyCollectDetailResponse> getDocDetail(
        com.wanfang.collect.MyCollectDetailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_DOC_DETAIL, getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取我的收藏
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.collect.MyCollectResponse> getMyCollect(
        com.wanfang.collect.MyCollectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_MY_COLLECT, getCallOptions()), request);
    }

    /**
     * <pre>
     * 收藏文献
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.collect.CollectResponse> collect(
        com.wanfang.collect.CollectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_COLLECT, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DOC_DETAIL = 0;
  private static final int METHODID_GET_MY_COLLECT = 1;
  private static final int METHODID_COLLECT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CollectServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CollectServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DOC_DETAIL:
          serviceImpl.getDocDetail((com.wanfang.collect.MyCollectDetailRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.collect.MyCollectDetailResponse>) responseObserver);
          break;
        case METHODID_GET_MY_COLLECT:
          serviceImpl.getMyCollect((com.wanfang.collect.MyCollectRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.collect.MyCollectResponse>) responseObserver);
          break;
        case METHODID_COLLECT:
          serviceImpl.collect((com.wanfang.collect.CollectRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.collect.CollectResponse>) responseObserver);
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
      synchronized (CollectServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(METHOD_GET_DOC_DETAIL)
              .addMethod(METHOD_GET_MY_COLLECT)
              .addMethod(METHOD_COLLECT)
              .build();
        }
      }
    }
    return result;
  }
}
