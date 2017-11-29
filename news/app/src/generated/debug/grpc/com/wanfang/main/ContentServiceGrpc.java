package com.wanfang.main;

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
    comments = "Source: mainPage/ser_main_content.proto")
public final class ContentServiceGrpc {

  private ContentServiceGrpc() {}

  public static final String SERVICE_NAME = "ContentService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.main.Content.ContentRequest,
      com.wanfang.main.SerMainContent.ContentResponse> METHOD_SEARCH_CONTENT =
      io.grpc.MethodDescriptor.<com.wanfang.main.Content.ContentRequest, com.wanfang.main.SerMainContent.ContentResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "ContentService", "SearchContent"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.main.Content.ContentRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.main.SerMainContent.ContentResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ContentServiceStub newStub(io.grpc.Channel channel) {
    return new ContentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ContentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ContentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ContentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ContentServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ContentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void searchContent(com.wanfang.main.Content.ContentRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.main.SerMainContent.ContentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_CONTENT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SEARCH_CONTENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.main.Content.ContentRequest,
                com.wanfang.main.SerMainContent.ContentResponse>(
                  this, METHODID_SEARCH_CONTENT)))
          .build();
    }
  }

  /**
   */
  public static final class ContentServiceStub extends io.grpc.stub.AbstractStub<ContentServiceStub> {
    private ContentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ContentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContentServiceStub(channel, callOptions);
    }

    /**
     */
    public void searchContent(com.wanfang.main.Content.ContentRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.main.SerMainContent.ContentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_CONTENT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ContentServiceBlockingStub extends io.grpc.stub.AbstractStub<ContentServiceBlockingStub> {
    private ContentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ContentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.wanfang.main.SerMainContent.ContentResponse searchContent(com.wanfang.main.Content.ContentRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_CONTENT, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ContentServiceFutureStub extends io.grpc.stub.AbstractStub<ContentServiceFutureStub> {
    private ContentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ContentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ContentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.main.SerMainContent.ContentResponse> searchContent(
        com.wanfang.main.Content.ContentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_CONTENT, getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_CONTENT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ContentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ContentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEARCH_CONTENT:
          serviceImpl.searchContent((com.wanfang.main.Content.ContentRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.main.SerMainContent.ContentResponse>) responseObserver);
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
      synchronized (ContentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(METHOD_SEARCH_CONTENT)
              .build();
        }
      }
    }
    return result;
  }
}
