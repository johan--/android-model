package com.wanfang.bind;

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
    comments = "Source: bind/ser_wfcard_bind.proto")
public final class WFCardBindServiceGrpc {

  private WFCardBindServiceGrpc() {}

  public static final String SERVICE_NAME = "bind.WFCardBindService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.bind.WFCardBindRequest,
      com.wanfang.bind.WFCardBindResponse> METHOD_CARD_BIND =
      io.grpc.MethodDescriptor.<com.wanfang.bind.WFCardBindRequest, com.wanfang.bind.WFCardBindResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bind.WFCardBindService", "CardBind"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.bind.WFCardBindRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.bind.WFCardBindResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.bind.WFCardBlanceRequest,
      com.wanfang.bind.WfCardBlanceResponse> METHOD_GET_WFCARD_BLANCE =
      io.grpc.MethodDescriptor.<com.wanfang.bind.WFCardBlanceRequest, com.wanfang.bind.WfCardBlanceResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bind.WFCardBindService", "GetWFCardBlance"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.bind.WFCardBlanceRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.bind.WfCardBlanceResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WFCardBindServiceStub newStub(io.grpc.Channel channel) {
    return new WFCardBindServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WFCardBindServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WFCardBindServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WFCardBindServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WFCardBindServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class WFCardBindServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void cardBind(com.wanfang.bind.WFCardBindRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.bind.WFCardBindResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CARD_BIND, responseObserver);
    }

    /**
     */
    public void getWFCardBlance(com.wanfang.bind.WFCardBlanceRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.bind.WfCardBlanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_WFCARD_BLANCE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CARD_BIND,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.bind.WFCardBindRequest,
                com.wanfang.bind.WFCardBindResponse>(
                  this, METHODID_CARD_BIND)))
          .addMethod(
            METHOD_GET_WFCARD_BLANCE,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.bind.WFCardBlanceRequest,
                com.wanfang.bind.WfCardBlanceResponse>(
                  this, METHODID_GET_WFCARD_BLANCE)))
          .build();
    }
  }

  /**
   */
  public static final class WFCardBindServiceStub extends io.grpc.stub.AbstractStub<WFCardBindServiceStub> {
    private WFCardBindServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WFCardBindServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WFCardBindServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WFCardBindServiceStub(channel, callOptions);
    }

    /**
     */
    public void cardBind(com.wanfang.bind.WFCardBindRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.bind.WFCardBindResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CARD_BIND, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWFCardBlance(com.wanfang.bind.WFCardBlanceRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.bind.WfCardBlanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_WFCARD_BLANCE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WFCardBindServiceBlockingStub extends io.grpc.stub.AbstractStub<WFCardBindServiceBlockingStub> {
    private WFCardBindServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WFCardBindServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WFCardBindServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WFCardBindServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.wanfang.bind.WFCardBindResponse cardBind(com.wanfang.bind.WFCardBindRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CARD_BIND, getCallOptions(), request);
    }

    /**
     */
    public com.wanfang.bind.WfCardBlanceResponse getWFCardBlance(com.wanfang.bind.WFCardBlanceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_WFCARD_BLANCE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WFCardBindServiceFutureStub extends io.grpc.stub.AbstractStub<WFCardBindServiceFutureStub> {
    private WFCardBindServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WFCardBindServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WFCardBindServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WFCardBindServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.bind.WFCardBindResponse> cardBind(
        com.wanfang.bind.WFCardBindRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CARD_BIND, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.bind.WfCardBlanceResponse> getWFCardBlance(
        com.wanfang.bind.WFCardBlanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_WFCARD_BLANCE, getCallOptions()), request);
    }
  }

  private static final int METHODID_CARD_BIND = 0;
  private static final int METHODID_GET_WFCARD_BLANCE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WFCardBindServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WFCardBindServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CARD_BIND:
          serviceImpl.cardBind((com.wanfang.bind.WFCardBindRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.bind.WFCardBindResponse>) responseObserver);
          break;
        case METHODID_GET_WFCARD_BLANCE:
          serviceImpl.getWFCardBlance((com.wanfang.bind.WFCardBlanceRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.bind.WfCardBlanceResponse>) responseObserver);
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
      synchronized (WFCardBindServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(METHOD_CARD_BIND)
              .addMethod(METHOD_GET_WFCARD_BLANCE)
              .build();
        }
      }
    }
    return result;
  }
}
