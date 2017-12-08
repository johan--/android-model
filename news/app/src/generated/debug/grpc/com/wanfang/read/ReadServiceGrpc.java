package com.wanfang.read;

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
    comments = "Source: read/ser_read.proto")
public final class ReadServiceGrpc {

  private ReadServiceGrpc() {}

  public static final String SERVICE_NAME = "read.ReadService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.read.ReadRequest,
      com.wanfang.read.ReadResponse> METHOD_READ =
      io.grpc.MethodDescriptor.<com.wanfang.read.ReadRequest, com.wanfang.read.ReadResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "read.ReadService", "Read"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.read.ReadRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.read.ReadResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.read.GetResourceFileRequest,
      com.wanfang.read.GetResourceFileResponse> METHOD_GET_RESOURCE_FILE =
      io.grpc.MethodDescriptor.<com.wanfang.read.GetResourceFileRequest, com.wanfang.read.GetResourceFileResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "read.ReadService", "GetResourceFile"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.read.GetResourceFileRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.read.GetResourceFileResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReadServiceStub newStub(io.grpc.Channel channel) {
    return new ReadServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReadServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ReadServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReadServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ReadServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ReadServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 发起阅读请求
     * </pre>
     */
    public void read(com.wanfang.read.ReadRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.read.ReadResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_READ, responseObserver);
    }

    /**
     * <pre>
     * 获取全文信息
     * </pre>
     */
    public void getResourceFile(com.wanfang.read.GetResourceFileRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.read.GetResourceFileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_RESOURCE_FILE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_READ,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.read.ReadRequest,
                com.wanfang.read.ReadResponse>(
                  this, METHODID_READ)))
          .addMethod(
            METHOD_GET_RESOURCE_FILE,
            asyncServerStreamingCall(
              new MethodHandlers<
                com.wanfang.read.GetResourceFileRequest,
                com.wanfang.read.GetResourceFileResponse>(
                  this, METHODID_GET_RESOURCE_FILE)))
          .build();
    }
  }

  /**
   */
  public static final class ReadServiceStub extends io.grpc.stub.AbstractStub<ReadServiceStub> {
    private ReadServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReadServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReadServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReadServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 发起阅读请求
     * </pre>
     */
    public void read(com.wanfang.read.ReadRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.read.ReadResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_READ, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取全文信息
     * </pre>
     */
    public void getResourceFile(com.wanfang.read.GetResourceFileRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.read.GetResourceFileResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_GET_RESOURCE_FILE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ReadServiceBlockingStub extends io.grpc.stub.AbstractStub<ReadServiceBlockingStub> {
    private ReadServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReadServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReadServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReadServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 发起阅读请求
     * </pre>
     */
    public com.wanfang.read.ReadResponse read(com.wanfang.read.ReadRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_READ, getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取全文信息
     * </pre>
     */
    public java.util.Iterator<com.wanfang.read.GetResourceFileResponse> getResourceFile(
        com.wanfang.read.GetResourceFileRequest request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_GET_RESOURCE_FILE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ReadServiceFutureStub extends io.grpc.stub.AbstractStub<ReadServiceFutureStub> {
    private ReadServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReadServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReadServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReadServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 发起阅读请求
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.read.ReadResponse> read(
        com.wanfang.read.ReadRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_READ, getCallOptions()), request);
    }
  }

  private static final int METHODID_READ = 0;
  private static final int METHODID_GET_RESOURCE_FILE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReadServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReadServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_READ:
          serviceImpl.read((com.wanfang.read.ReadRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.read.ReadResponse>) responseObserver);
          break;
        case METHODID_GET_RESOURCE_FILE:
          serviceImpl.getResourceFile((com.wanfang.read.GetResourceFileRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.read.GetResourceFileResponse>) responseObserver);
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
      synchronized (ReadServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(METHOD_READ)
              .addMethod(METHOD_GET_RESOURCE_FILE)
              .build();
        }
      }
    }
    return result;
  }
}
