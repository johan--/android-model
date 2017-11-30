package com.wanfangdata.grpcservice.message.jmessage;

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
    comments = "Source: sendTextMessage.proto")
public final class SendTextMessageServiceGrpc {

  private SendTextMessageServiceGrpc() {}

  public static final String SERVICE_NAME = "SendTextMessageService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfangdata.grpcservice.message.jmessage.SendTextMessageRequest,
      com.wanfangdata.grpcservice.message.jmessage.SendTextMessageResponse> METHOD_SEND_TEXT_MESSAGE_BY_TARGET_ID =
      io.grpc.MethodDescriptor.<com.wanfangdata.grpcservice.message.jmessage.SendTextMessageRequest, com.wanfangdata.grpcservice.message.jmessage.SendTextMessageResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "SendTextMessageService", "sendTextMessageByTargetId"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfangdata.grpcservice.message.jmessage.SendTextMessageRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfangdata.grpcservice.message.jmessage.SendTextMessageResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SendTextMessageServiceStub newStub(io.grpc.Channel channel) {
    return new SendTextMessageServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SendTextMessageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SendTextMessageServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SendTextMessageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SendTextMessageServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SendTextMessageServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *极光IM推送纯文本消息（JMessage）
     * </pre>
     */
    public void sendTextMessageByTargetId(com.wanfangdata.grpcservice.message.jmessage.SendTextMessageRequest request,
        io.grpc.stub.StreamObserver<com.wanfangdata.grpcservice.message.jmessage.SendTextMessageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEND_TEXT_MESSAGE_BY_TARGET_ID, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SEND_TEXT_MESSAGE_BY_TARGET_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfangdata.grpcservice.message.jmessage.SendTextMessageRequest,
                com.wanfangdata.grpcservice.message.jmessage.SendTextMessageResponse>(
                  this, METHODID_SEND_TEXT_MESSAGE_BY_TARGET_ID)))
          .build();
    }
  }

  /**
   */
  public static final class SendTextMessageServiceStub extends io.grpc.stub.AbstractStub<SendTextMessageServiceStub> {
    private SendTextMessageServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SendTextMessageServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SendTextMessageServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SendTextMessageServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *极光IM推送纯文本消息（JMessage）
     * </pre>
     */
    public void sendTextMessageByTargetId(com.wanfangdata.grpcservice.message.jmessage.SendTextMessageRequest request,
        io.grpc.stub.StreamObserver<com.wanfangdata.grpcservice.message.jmessage.SendTextMessageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEND_TEXT_MESSAGE_BY_TARGET_ID, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SendTextMessageServiceBlockingStub extends io.grpc.stub.AbstractStub<SendTextMessageServiceBlockingStub> {
    private SendTextMessageServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SendTextMessageServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SendTextMessageServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SendTextMessageServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *极光IM推送纯文本消息（JMessage）
     * </pre>
     */
    public com.wanfangdata.grpcservice.message.jmessage.SendTextMessageResponse sendTextMessageByTargetId(com.wanfangdata.grpcservice.message.jmessage.SendTextMessageRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEND_TEXT_MESSAGE_BY_TARGET_ID, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SendTextMessageServiceFutureStub extends io.grpc.stub.AbstractStub<SendTextMessageServiceFutureStub> {
    private SendTextMessageServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SendTextMessageServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SendTextMessageServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SendTextMessageServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *极光IM推送纯文本消息（JMessage）
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfangdata.grpcservice.message.jmessage.SendTextMessageResponse> sendTextMessageByTargetId(
        com.wanfangdata.grpcservice.message.jmessage.SendTextMessageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEND_TEXT_MESSAGE_BY_TARGET_ID, getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_TEXT_MESSAGE_BY_TARGET_ID = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SendTextMessageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SendTextMessageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_TEXT_MESSAGE_BY_TARGET_ID:
          serviceImpl.sendTextMessageByTargetId((com.wanfangdata.grpcservice.message.jmessage.SendTextMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfangdata.grpcservice.message.jmessage.SendTextMessageResponse>) responseObserver);
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
      synchronized (SendTextMessageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(METHOD_SEND_TEXT_MESSAGE_BY_TARGET_ID)
              .build();
        }
      }
    }
    return result;
  }
}
