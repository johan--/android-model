package com.wanfang.home;

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
    comments = "Source: home/ser_home.proto")
public final class HomeServiceGrpc {

  private HomeServiceGrpc() {}

  public static final String SERVICE_NAME = "home.HomeService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.home.GetHomeListReqeust,
      com.wanfang.home.GetFoundListResponse> METHOD_GET_HOME_LIST =
      io.grpc.MethodDescriptor.<com.wanfang.home.GetHomeListReqeust, com.wanfang.home.GetFoundListResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "home.HomeService", "GetHomeList"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.home.GetHomeListReqeust.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.home.GetFoundListResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.home.GetLastPerioRequest,
      com.wanfang.home.GetLastPerioResponse> METHOD_GET_LAST_PERIO =
      io.grpc.MethodDescriptor.<com.wanfang.home.GetLastPerioRequest, com.wanfang.home.GetLastPerioResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "home.HomeService", "GetLastPerio"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.home.GetLastPerioRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.home.GetLastPerioResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HomeServiceStub newStub(io.grpc.Channel channel) {
    return new HomeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HomeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HomeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HomeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HomeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HomeServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 获取首页基金会议/科技动态列表
     * </pre>
     */
    public void getHomeList(com.wanfang.home.GetHomeListReqeust request,
        io.grpc.stub.StreamObserver<com.wanfang.home.GetFoundListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_HOME_LIST, responseObserver);
    }

    /**
     * <pre>
     * 获取最新期刊列表数据
     * </pre>
     */
    public void getLastPerio(com.wanfang.home.GetLastPerioRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.home.GetLastPerioResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_LAST_PERIO, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_HOME_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.home.GetHomeListReqeust,
                com.wanfang.home.GetFoundListResponse>(
                  this, METHODID_GET_HOME_LIST)))
          .addMethod(
            METHOD_GET_LAST_PERIO,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.home.GetLastPerioRequest,
                com.wanfang.home.GetLastPerioResponse>(
                  this, METHODID_GET_LAST_PERIO)))
          .build();
    }
  }

  /**
   */
  public static final class HomeServiceStub extends io.grpc.stub.AbstractStub<HomeServiceStub> {
    private HomeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HomeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HomeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HomeServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取首页基金会议/科技动态列表
     * </pre>
     */
    public void getHomeList(com.wanfang.home.GetHomeListReqeust request,
        io.grpc.stub.StreamObserver<com.wanfang.home.GetFoundListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_HOME_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取最新期刊列表数据
     * </pre>
     */
    public void getLastPerio(com.wanfang.home.GetLastPerioRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.home.GetLastPerioResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_LAST_PERIO, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HomeServiceBlockingStub extends io.grpc.stub.AbstractStub<HomeServiceBlockingStub> {
    private HomeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HomeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HomeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HomeServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取首页基金会议/科技动态列表
     * </pre>
     */
    public com.wanfang.home.GetFoundListResponse getHomeList(com.wanfang.home.GetHomeListReqeust request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_HOME_LIST, getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取最新期刊列表数据
     * </pre>
     */
    public com.wanfang.home.GetLastPerioResponse getLastPerio(com.wanfang.home.GetLastPerioRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_LAST_PERIO, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HomeServiceFutureStub extends io.grpc.stub.AbstractStub<HomeServiceFutureStub> {
    private HomeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HomeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HomeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HomeServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取首页基金会议/科技动态列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.home.GetFoundListResponse> getHomeList(
        com.wanfang.home.GetHomeListReqeust request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_HOME_LIST, getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取最新期刊列表数据
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.home.GetLastPerioResponse> getLastPerio(
        com.wanfang.home.GetLastPerioRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_LAST_PERIO, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_HOME_LIST = 0;
  private static final int METHODID_GET_LAST_PERIO = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HomeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HomeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_HOME_LIST:
          serviceImpl.getHomeList((com.wanfang.home.GetHomeListReqeust) request,
              (io.grpc.stub.StreamObserver<com.wanfang.home.GetFoundListResponse>) responseObserver);
          break;
        case METHODID_GET_LAST_PERIO:
          serviceImpl.getLastPerio((com.wanfang.home.GetLastPerioRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.home.GetLastPerioResponse>) responseObserver);
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
      synchronized (HomeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(METHOD_GET_HOME_LIST)
              .addMethod(METHOD_GET_LAST_PERIO)
              .build();
        }
      }
    }
    return result;
  }
}
