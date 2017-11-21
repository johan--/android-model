package com.wanfang.charge;

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
    comments = "Source: charge/ser_charge.proto")
public final class ChargeServiceGrpc {

  private ChargeServiceGrpc() {}

  public static final String SERVICE_NAME = "charge.ChargeService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.charge.ChargeRequest,
      com.wanfang.charge.ChargeResponse> METHOD_CHARGE =
      io.grpc.MethodDescriptor.<com.wanfang.charge.ChargeRequest, com.wanfang.charge.ChargeResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "charge.ChargeService", "Charge"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.charge.ChargeRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.charge.ChargeResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChargeServiceStub newStub(io.grpc.Channel channel) {
    return new ChargeServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChargeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ChargeServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChargeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ChargeServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ChargeServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 充值请求
     * </pre>
     */
    public void charge(com.wanfang.charge.ChargeRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.charge.ChargeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CHARGE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CHARGE,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.charge.ChargeRequest,
                com.wanfang.charge.ChargeResponse>(
                  this, METHODID_CHARGE)))
          .build();
    }
  }

  /**
   */
  public static final class ChargeServiceStub extends io.grpc.stub.AbstractStub<ChargeServiceStub> {
    private ChargeServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChargeServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChargeServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChargeServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 充值请求
     * </pre>
     */
    public void charge(com.wanfang.charge.ChargeRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.charge.ChargeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CHARGE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ChargeServiceBlockingStub extends io.grpc.stub.AbstractStub<ChargeServiceBlockingStub> {
    private ChargeServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChargeServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChargeServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChargeServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 充值请求
     * </pre>
     */
    public com.wanfang.charge.ChargeResponse charge(com.wanfang.charge.ChargeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CHARGE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ChargeServiceFutureStub extends io.grpc.stub.AbstractStub<ChargeServiceFutureStub> {
    private ChargeServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChargeServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChargeServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChargeServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 充值请求
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.charge.ChargeResponse> charge(
        com.wanfang.charge.ChargeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CHARGE, getCallOptions()), request);
    }
  }

  private static final int METHODID_CHARGE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChargeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChargeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHARGE:
          serviceImpl.charge((com.wanfang.charge.ChargeRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.charge.ChargeResponse>) responseObserver);
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
      synchronized (ChargeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(METHOD_CHARGE)
              .build();
        }
      }
    }
    return result;
  }
}
