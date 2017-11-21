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
    comments = "Source: trade/ser_iap.proto")
public final class IAPServiceGrpc {

  private IAPServiceGrpc() {}

  public static final String SERVICE_NAME = "trade.IAPService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.trade.IAPVerifyRequest,
      com.wanfang.trade.IAPVerifyResponse> METHOD_IAPVERIFY =
      io.grpc.MethodDescriptor.<com.wanfang.trade.IAPVerifyRequest, com.wanfang.trade.IAPVerifyResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "trade.IAPService", "IAPVerify"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.trade.IAPVerifyRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.trade.IAPVerifyResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.trade.CompleteIAPTradeRequest,
      com.wanfang.trade.CompleteIAPTradeResponse> METHOD_COMPLETE_IAPTRADE =
      io.grpc.MethodDescriptor.<com.wanfang.trade.CompleteIAPTradeRequest, com.wanfang.trade.CompleteIAPTradeResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "trade.IAPService", "CompleteIAPTrade"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.trade.CompleteIAPTradeRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.trade.CompleteIAPTradeResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.trade.IAPPriceListRequest,
      com.wanfang.trade.IAPPriceListResponse> METHOD_IAPPRICE_LIST =
      io.grpc.MethodDescriptor.<com.wanfang.trade.IAPPriceListRequest, com.wanfang.trade.IAPPriceListResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "trade.IAPService", "IAPPriceList"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.trade.IAPPriceListRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.trade.IAPPriceListResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.trade.IAPCreateOrderRequest,
      com.wanfang.trade.IAPCreateOrderResponse> METHOD_IAPCREATE_ORDER =
      io.grpc.MethodDescriptor.<com.wanfang.trade.IAPCreateOrderRequest, com.wanfang.trade.IAPCreateOrderResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "trade.IAPService", "IAPCreateOrder"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.trade.IAPCreateOrderRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.trade.IAPCreateOrderResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IAPServiceStub newStub(io.grpc.Channel channel) {
    return new IAPServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IAPServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IAPServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IAPServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IAPServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class IAPServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 后台二次验证接口（IAP）
     * </pre>
     */
    public void iAPVerify(com.wanfang.trade.IAPVerifyRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.trade.IAPVerifyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_IAPVERIFY, responseObserver);
    }

    /**
     * <pre>
     * 完成交易
     * </pre>
     */
    public void completeIAPTrade(com.wanfang.trade.CompleteIAPTradeRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.trade.CompleteIAPTradeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_COMPLETE_IAPTRADE, responseObserver);
    }

    /**
     * <pre>
     * 获取价目表
     * </pre>
     */
    public void iAPPriceList(com.wanfang.trade.IAPPriceListRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.trade.IAPPriceListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_IAPPRICE_LIST, responseObserver);
    }

    /**
     * <pre>
     * 创建订单
     * </pre>
     */
    public void iAPCreateOrder(com.wanfang.trade.IAPCreateOrderRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.trade.IAPCreateOrderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_IAPCREATE_ORDER, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_IAPVERIFY,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.trade.IAPVerifyRequest,
                com.wanfang.trade.IAPVerifyResponse>(
                  this, METHODID_IAPVERIFY)))
          .addMethod(
            METHOD_COMPLETE_IAPTRADE,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.trade.CompleteIAPTradeRequest,
                com.wanfang.trade.CompleteIAPTradeResponse>(
                  this, METHODID_COMPLETE_IAPTRADE)))
          .addMethod(
            METHOD_IAPPRICE_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.trade.IAPPriceListRequest,
                com.wanfang.trade.IAPPriceListResponse>(
                  this, METHODID_IAPPRICE_LIST)))
          .addMethod(
            METHOD_IAPCREATE_ORDER,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.trade.IAPCreateOrderRequest,
                com.wanfang.trade.IAPCreateOrderResponse>(
                  this, METHODID_IAPCREATE_ORDER)))
          .build();
    }
  }

  /**
   */
  public static final class IAPServiceStub extends io.grpc.stub.AbstractStub<IAPServiceStub> {
    private IAPServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IAPServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IAPServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IAPServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 后台二次验证接口（IAP）
     * </pre>
     */
    public void iAPVerify(com.wanfang.trade.IAPVerifyRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.trade.IAPVerifyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_IAPVERIFY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 完成交易
     * </pre>
     */
    public void completeIAPTrade(com.wanfang.trade.CompleteIAPTradeRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.trade.CompleteIAPTradeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_COMPLETE_IAPTRADE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取价目表
     * </pre>
     */
    public void iAPPriceList(com.wanfang.trade.IAPPriceListRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.trade.IAPPriceListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_IAPPRICE_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 创建订单
     * </pre>
     */
    public void iAPCreateOrder(com.wanfang.trade.IAPCreateOrderRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.trade.IAPCreateOrderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_IAPCREATE_ORDER, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class IAPServiceBlockingStub extends io.grpc.stub.AbstractStub<IAPServiceBlockingStub> {
    private IAPServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IAPServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IAPServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IAPServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 后台二次验证接口（IAP）
     * </pre>
     */
    public com.wanfang.trade.IAPVerifyResponse iAPVerify(com.wanfang.trade.IAPVerifyRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_IAPVERIFY, getCallOptions(), request);
    }

    /**
     * <pre>
     * 完成交易
     * </pre>
     */
    public com.wanfang.trade.CompleteIAPTradeResponse completeIAPTrade(com.wanfang.trade.CompleteIAPTradeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_COMPLETE_IAPTRADE, getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取价目表
     * </pre>
     */
    public com.wanfang.trade.IAPPriceListResponse iAPPriceList(com.wanfang.trade.IAPPriceListRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_IAPPRICE_LIST, getCallOptions(), request);
    }

    /**
     * <pre>
     * 创建订单
     * </pre>
     */
    public com.wanfang.trade.IAPCreateOrderResponse iAPCreateOrder(com.wanfang.trade.IAPCreateOrderRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_IAPCREATE_ORDER, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class IAPServiceFutureStub extends io.grpc.stub.AbstractStub<IAPServiceFutureStub> {
    private IAPServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IAPServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IAPServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IAPServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 后台二次验证接口（IAP）
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.trade.IAPVerifyResponse> iAPVerify(
        com.wanfang.trade.IAPVerifyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_IAPVERIFY, getCallOptions()), request);
    }

    /**
     * <pre>
     * 完成交易
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.trade.CompleteIAPTradeResponse> completeIAPTrade(
        com.wanfang.trade.CompleteIAPTradeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_COMPLETE_IAPTRADE, getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取价目表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.trade.IAPPriceListResponse> iAPPriceList(
        com.wanfang.trade.IAPPriceListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_IAPPRICE_LIST, getCallOptions()), request);
    }

    /**
     * <pre>
     * 创建订单
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.trade.IAPCreateOrderResponse> iAPCreateOrder(
        com.wanfang.trade.IAPCreateOrderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_IAPCREATE_ORDER, getCallOptions()), request);
    }
  }

  private static final int METHODID_IAPVERIFY = 0;
  private static final int METHODID_COMPLETE_IAPTRADE = 1;
  private static final int METHODID_IAPPRICE_LIST = 2;
  private static final int METHODID_IAPCREATE_ORDER = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IAPServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IAPServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_IAPVERIFY:
          serviceImpl.iAPVerify((com.wanfang.trade.IAPVerifyRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.trade.IAPVerifyResponse>) responseObserver);
          break;
        case METHODID_COMPLETE_IAPTRADE:
          serviceImpl.completeIAPTrade((com.wanfang.trade.CompleteIAPTradeRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.trade.CompleteIAPTradeResponse>) responseObserver);
          break;
        case METHODID_IAPPRICE_LIST:
          serviceImpl.iAPPriceList((com.wanfang.trade.IAPPriceListRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.trade.IAPPriceListResponse>) responseObserver);
          break;
        case METHODID_IAPCREATE_ORDER:
          serviceImpl.iAPCreateOrder((com.wanfang.trade.IAPCreateOrderRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.trade.IAPCreateOrderResponse>) responseObserver);
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
      synchronized (IAPServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(METHOD_IAPVERIFY)
              .addMethod(METHOD_COMPLETE_IAPTRADE)
              .addMethod(METHOD_IAPPRICE_LIST)
              .addMethod(METHOD_IAPCREATE_ORDER)
              .build();
        }
      }
    }
    return result;
  }
}
