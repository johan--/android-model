package com.wanfang.search;

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
    value = "by gRPC proto compiler (version 1.6.1)",
    comments = "Source: ser_search.proto")
public final class SearchServiceGrpc {

  private SearchServiceGrpc() {}

  public static final String SERVICE_NAME = "personal.SearchService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.HotThemesRequest,
      com.wanfang.personal.HotThemesResponse> METHOD_HOT_THEMES =
      io.grpc.MethodDescriptor.<com.wanfang.personal.HotThemesRequest, com.wanfang.personal.HotThemesResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.SearchService", "HotThemes"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.HotThemesRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.HotThemesResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.SearchHistoryRequest,
      com.wanfang.personal.SearchHistoryResponse> METHOD_SEARCH_HISTORY =
      io.grpc.MethodDescriptor.<com.wanfang.personal.SearchHistoryRequest, com.wanfang.personal.SearchHistoryResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.SearchService", "SearchHistory"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.SearchHistoryRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.SearchHistoryResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SearchServiceStub newStub(io.grpc.Channel channel) {
    return new SearchServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SearchServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SearchServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SearchServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SearchServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SearchServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 获取热搜词
     * </pre>
     */
    public void hotThemes(com.wanfang.personal.HotThemesRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.HotThemesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_HOT_THEMES, responseObserver);
    }

    /**
     * <pre>
     * 获取搜索历史
     * </pre>
     */
    public void searchHistory(com.wanfang.personal.SearchHistoryRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.SearchHistoryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEARCH_HISTORY, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_HOT_THEMES,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.personal.HotThemesRequest,
                com.wanfang.personal.HotThemesResponse>(
                  this, METHODID_HOT_THEMES)))
          .addMethod(
            METHOD_SEARCH_HISTORY,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.personal.SearchHistoryRequest,
                com.wanfang.personal.SearchHistoryResponse>(
                  this, METHODID_SEARCH_HISTORY)))
          .build();
    }
  }

  /**
   */
  public static final class SearchServiceStub extends io.grpc.stub.AbstractStub<SearchServiceStub> {
    private SearchServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SearchServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SearchServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取热搜词
     * </pre>
     */
    public void hotThemes(com.wanfang.personal.HotThemesRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.HotThemesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_HOT_THEMES, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取搜索历史
     * </pre>
     */
    public void searchHistory(com.wanfang.personal.SearchHistoryRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.SearchHistoryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEARCH_HISTORY, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SearchServiceBlockingStub extends io.grpc.stub.AbstractStub<SearchServiceBlockingStub> {
    private SearchServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SearchServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SearchServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取热搜词
     * </pre>
     */
    public com.wanfang.personal.HotThemesResponse hotThemes(com.wanfang.personal.HotThemesRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_HOT_THEMES, getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取搜索历史
     * </pre>
     */
    public com.wanfang.personal.SearchHistoryResponse searchHistory(com.wanfang.personal.SearchHistoryRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEARCH_HISTORY, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SearchServiceFutureStub extends io.grpc.stub.AbstractStub<SearchServiceFutureStub> {
    private SearchServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SearchServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SearchServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SearchServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 获取热搜词
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.personal.HotThemesResponse> hotThemes(
        com.wanfang.personal.HotThemesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_HOT_THEMES, getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取搜索历史
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.personal.SearchHistoryResponse> searchHistory(
        com.wanfang.personal.SearchHistoryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEARCH_HISTORY, getCallOptions()), request);
    }
  }

  private static final int METHODID_HOT_THEMES = 0;
  private static final int METHODID_SEARCH_HISTORY = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SearchServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SearchServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HOT_THEMES:
          serviceImpl.hotThemes((com.wanfang.personal.HotThemesRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.HotThemesResponse>) responseObserver);
          break;
        case METHODID_SEARCH_HISTORY:
          serviceImpl.searchHistory((com.wanfang.personal.SearchHistoryRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.SearchHistoryResponse>) responseObserver);
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

  private static final class SearchServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.wanfang.search.SerSearch.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SearchServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SearchServiceDescriptorSupplier())
              .addMethod(METHOD_HOT_THEMES)
              .addMethod(METHOD_SEARCH_HISTORY)
              .build();
        }
      }
    }
    return result;
  }
}
