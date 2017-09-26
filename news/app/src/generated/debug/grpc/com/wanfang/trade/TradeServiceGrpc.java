package com.wanfang.trade;

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
    comments = "Source: trade/ser_trade.proto")
public final class TradeServiceGrpc {

  private TradeServiceGrpc() {}

  public static final String SERVICE_NAME = "personal.TradeService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.trade.UnifiedorderRequest,
      com.wanfang.trade.UnifiedorderResponse> METHOD_UNIFIEDORDER =
      io.grpc.MethodDescriptor.<com.wanfang.trade.UnifiedorderRequest, com.wanfang.trade.UnifiedorderResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.TradeService", "Unifiedorder"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.trade.UnifiedorderRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.trade.UnifiedorderResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TradeServiceStub newStub(io.grpc.Channel channel) {
    return new TradeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TradeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TradeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TradeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TradeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TradeServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 获取预订单
     * </pre>
     */
    public void unifiedorder(com.wanfang.trade.UnifiedorderRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.trade.UnifiedorderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UNIFIEDORDER, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_UNIFIEDORDER,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.trade.UnifiedorderRequest,
                com.wanfang.trade.UnifiedorderResponse>(
                  this, METHODID_UNIFIEDORDER)))
          .build();
    }
  }

  /**
   */
  public static final class TradeServiceStub extends io.grpc.stub.AbstractStub<TradeServiceStub> {
    private TradeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TradeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TradeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TradeServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取预订单
     * </pre>
     */
    public void unifiedorder(com.wanfang.trade.UnifiedorderRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.trade.UnifiedorderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UNIFIEDORDER, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TradeServiceBlockingStub extends io.grpc.stub.AbstractStub<TradeServiceBlockingStub> {
    private TradeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TradeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TradeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TradeServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取预订单
     * </pre>
     */
    public com.wanfang.trade.UnifiedorderResponse unifiedorder(com.wanfang.trade.UnifiedorderRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UNIFIEDORDER, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TradeServiceFutureStub extends io.grpc.stub.AbstractStub<TradeServiceFutureStub> {
    private TradeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TradeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TradeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TradeServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取预订单
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.trade.UnifiedorderResponse> unifiedorder(
        com.wanfang.trade.UnifiedorderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UNIFIEDORDER, getCallOptions()), request);
    }
  }

  private static final int METHODID_UNIFIEDORDER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TradeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TradeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UNIFIEDORDER:
          serviceImpl.unifiedorder((com.wanfang.trade.UnifiedorderRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.trade.UnifiedorderResponse>) responseObserver);
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
      synchronized (TradeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(METHOD_UNIFIEDORDER)
              .build();
        }
      }
    }
    return result;
  }
}
