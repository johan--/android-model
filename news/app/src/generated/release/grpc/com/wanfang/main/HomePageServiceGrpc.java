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
    comments = "Source: mainPage/ser_main_page.proto")
public final class HomePageServiceGrpc {

  private HomePageServiceGrpc() {}

  public static final String SERVICE_NAME = "main.HomePageService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.main.AllCource.AlCourseRequest,
      com.wanfang.main.AllCource.AlCourseReply> METHOD_GET_AL_COURSE =
      io.grpc.MethodDescriptor.<com.wanfang.main.AllCource.AlCourseRequest, com.wanfang.main.AllCource.AlCourseReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "main.HomePageService", "GetAlCourse"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.main.AllCource.AlCourseRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.main.AllCource.AlCourseReply.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.main.AllHotDoc.HotDocRequest,
      com.wanfang.main.AllHotDoc.HotDocReply> METHOD_GET_ALL_HOT_DOC =
      io.grpc.MethodDescriptor.<com.wanfang.main.AllHotDoc.HotDocRequest, com.wanfang.main.AllHotDoc.HotDocReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "main.HomePageService", "GetAllHotDoc"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.main.AllHotDoc.HotDocRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.main.AllHotDoc.HotDocReply.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.main.AllLastNews.LastNewsRequest,
      com.wanfang.main.AllLastNews.LastNewsReply> METHOD_GET_ALL_LAST_NEWS =
      io.grpc.MethodDescriptor.<com.wanfang.main.AllLastNews.LastNewsRequest, com.wanfang.main.AllLastNews.LastNewsReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "main.HomePageService", "GetAllLastNews"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.main.AllLastNews.LastNewsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.main.AllLastNews.LastNewsReply.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.main.AllProject.ProjectRequest,
      com.wanfang.main.AllProject.ProjectReply> METHOD_GET_ALL_PROJECT =
      io.grpc.MethodDescriptor.<com.wanfang.main.AllProject.ProjectRequest, com.wanfang.main.AllProject.ProjectReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "main.HomePageService", "GetAllProject"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.main.AllProject.ProjectRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.main.AllProject.ProjectReply.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.main.AllScience.AllScienceRequest,
      com.wanfang.main.AllScience.AllScienceReply> METHOD_GET_ALL_SCIENCE =
      io.grpc.MethodDescriptor.<com.wanfang.main.AllScience.AllScienceRequest, com.wanfang.main.AllScience.AllScienceReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "main.HomePageService", "GetAllScience"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.main.AllScience.AllScienceRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.main.AllScience.AllScienceReply.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.main.Banner.AllBannerRequest,
      com.wanfang.main.Banner.AllBannerReply> METHOD_GET_ALL_BANNER =
      io.grpc.MethodDescriptor.<com.wanfang.main.Banner.AllBannerRequest, com.wanfang.main.Banner.AllBannerReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "main.HomePageService", "GetAllBanner"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.main.Banner.AllBannerRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.main.Banner.AllBannerReply.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.main.DocResource.DocResourceRequest,
      com.wanfang.main.DocResource.DocResourceReply> METHOD_GET_DOC_RESOURCE =
      io.grpc.MethodDescriptor.<com.wanfang.main.DocResource.DocResourceRequest, com.wanfang.main.DocResource.DocResourceReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "main.HomePageService", "GetDocResource"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.main.DocResource.DocResourceRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.main.DocResource.DocResourceReply.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.main.GuessLikeOuterClass.GuessLikeRequest,
      com.wanfang.main.GuessLikeOuterClass.GuessLikeReply> METHOD_GET_ALL_GUESS_LIKE =
      io.grpc.MethodDescriptor.<com.wanfang.main.GuessLikeOuterClass.GuessLikeRequest, com.wanfang.main.GuessLikeOuterClass.GuessLikeReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "main.HomePageService", "GetAllGuessLike"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.main.GuessLikeOuterClass.GuessLikeRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.main.GuessLikeOuterClass.GuessLikeReply.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.main.HotPeriodical.PeriodicalRequest,
      com.wanfang.main.HotPeriodical.PeriodicalReply> METHOD_GET_ALL_HOT_PERIODICAL =
      io.grpc.MethodDescriptor.<com.wanfang.main.HotPeriodical.PeriodicalRequest, com.wanfang.main.HotPeriodical.PeriodicalReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "main.HomePageService", "GetAllHotPeriodical"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.main.HotPeriodical.PeriodicalRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.main.HotPeriodical.PeriodicalReply.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.main.HotSearchWord.HotSearchWordRequest,
      com.wanfang.main.HotSearchWord.HotSearchWordReply> METHOD_GET_HOT_SEARCH_WORD =
      io.grpc.MethodDescriptor.<com.wanfang.main.HotSearchWord.HotSearchWordRequest, com.wanfang.main.HotSearchWord.HotSearchWordReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "main.HomePageService", "GetHotSearchWord"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.main.HotSearchWord.HotSearchWordRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.main.HotSearchWord.HotSearchWordReply.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.main.MeetingMessage.MeetingRequest,
      com.wanfang.main.MeetingMessage.MeetingReply> METHOD_GET_ALL_MEETING_MESSAGE =
      io.grpc.MethodDescriptor.<com.wanfang.main.MeetingMessage.MeetingRequest, com.wanfang.main.MeetingMessage.MeetingReply>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "main.HomePageService", "GetAllMeetingMessage"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.main.MeetingMessage.MeetingRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.main.MeetingMessage.MeetingReply.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HomePageServiceStub newStub(io.grpc.Channel channel) {
    return new HomePageServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HomePageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HomePageServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HomePageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HomePageServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class HomePageServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *精品课程列表
     * </pre>
     */
    public void getAlCourse(com.wanfang.main.AllCource.AlCourseRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.main.AllCource.AlCourseReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_AL_COURSE, responseObserver);
    }

    /**
     * <pre>
     *热门文献
     * </pre>
     */
    public void getAllHotDoc(com.wanfang.main.AllHotDoc.HotDocRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.main.AllHotDoc.HotDocReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_HOT_DOC, responseObserver);
    }

    /**
     * <pre>
     *	最新资讯列表
     * </pre>
     */
    public void getAllLastNews(com.wanfang.main.AllLastNews.LastNewsRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.main.AllLastNews.LastNewsReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_LAST_NEWS, responseObserver);
    }

    /**
     * <pre>
     *专题聚焦数据列表
     * </pre>
     */
    public void getAllProject(com.wanfang.main.AllProject.ProjectRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.main.AllProject.ProjectReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_PROJECT, responseObserver);
    }

    /**
     * <pre>
     *	科技动态
     * </pre>
     */
    public void getAllScience(com.wanfang.main.AllScience.AllScienceRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.main.AllScience.AllScienceReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_SCIENCE, responseObserver);
    }

    /**
     * <pre>
     *	广告页
     * </pre>
     */
    public void getAllBanner(com.wanfang.main.Banner.AllBannerRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.main.Banner.AllBannerReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_BANNER, responseObserver);
    }

    /**
     * <pre>
     *	资源下载地址，要判断阅读权限
     * </pre>
     */
    public void getDocResource(com.wanfang.main.DocResource.DocResourceRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.main.DocResource.DocResourceReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_DOC_RESOURCE, responseObserver);
    }

    /**
     * <pre>
     *猜你喜欢列表
     * </pre>
     */
    public void getAllGuessLike(com.wanfang.main.GuessLikeOuterClass.GuessLikeRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.main.GuessLikeOuterClass.GuessLikeReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_GUESS_LIKE, responseObserver);
    }

    /**
     * <pre>
     *首页热门期刊列表
     * </pre>
     */
    public void getAllHotPeriodical(com.wanfang.main.HotPeriodical.PeriodicalRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.main.HotPeriodical.PeriodicalReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_HOT_PERIODICAL, responseObserver);
    }

    /**
     * <pre>
     *热搜词列表
     * </pre>
     */
    public void getHotSearchWord(com.wanfang.main.HotSearchWord.HotSearchWordRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.main.HotSearchWord.HotSearchWordReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_HOT_SEARCH_WORD, responseObserver);
    }

    /**
     * <pre>
     *会议信息列表
     * </pre>
     */
    public void getAllMeetingMessage(com.wanfang.main.MeetingMessage.MeetingRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.main.MeetingMessage.MeetingReply> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ALL_MEETING_MESSAGE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_AL_COURSE,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.main.AllCource.AlCourseRequest,
                com.wanfang.main.AllCource.AlCourseReply>(
                  this, METHODID_GET_AL_COURSE)))
          .addMethod(
            METHOD_GET_ALL_HOT_DOC,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.main.AllHotDoc.HotDocRequest,
                com.wanfang.main.AllHotDoc.HotDocReply>(
                  this, METHODID_GET_ALL_HOT_DOC)))
          .addMethod(
            METHOD_GET_ALL_LAST_NEWS,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.main.AllLastNews.LastNewsRequest,
                com.wanfang.main.AllLastNews.LastNewsReply>(
                  this, METHODID_GET_ALL_LAST_NEWS)))
          .addMethod(
            METHOD_GET_ALL_PROJECT,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.main.AllProject.ProjectRequest,
                com.wanfang.main.AllProject.ProjectReply>(
                  this, METHODID_GET_ALL_PROJECT)))
          .addMethod(
            METHOD_GET_ALL_SCIENCE,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.main.AllScience.AllScienceRequest,
                com.wanfang.main.AllScience.AllScienceReply>(
                  this, METHODID_GET_ALL_SCIENCE)))
          .addMethod(
            METHOD_GET_ALL_BANNER,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.main.Banner.AllBannerRequest,
                com.wanfang.main.Banner.AllBannerReply>(
                  this, METHODID_GET_ALL_BANNER)))
          .addMethod(
            METHOD_GET_DOC_RESOURCE,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.main.DocResource.DocResourceRequest,
                com.wanfang.main.DocResource.DocResourceReply>(
                  this, METHODID_GET_DOC_RESOURCE)))
          .addMethod(
            METHOD_GET_ALL_GUESS_LIKE,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.main.GuessLikeOuterClass.GuessLikeRequest,
                com.wanfang.main.GuessLikeOuterClass.GuessLikeReply>(
                  this, METHODID_GET_ALL_GUESS_LIKE)))
          .addMethod(
            METHOD_GET_ALL_HOT_PERIODICAL,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.main.HotPeriodical.PeriodicalRequest,
                com.wanfang.main.HotPeriodical.PeriodicalReply>(
                  this, METHODID_GET_ALL_HOT_PERIODICAL)))
          .addMethod(
            METHOD_GET_HOT_SEARCH_WORD,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.main.HotSearchWord.HotSearchWordRequest,
                com.wanfang.main.HotSearchWord.HotSearchWordReply>(
                  this, METHODID_GET_HOT_SEARCH_WORD)))
          .addMethod(
            METHOD_GET_ALL_MEETING_MESSAGE,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.main.MeetingMessage.MeetingRequest,
                com.wanfang.main.MeetingMessage.MeetingReply>(
                  this, METHODID_GET_ALL_MEETING_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class HomePageServiceStub extends io.grpc.stub.AbstractStub<HomePageServiceStub> {
    private HomePageServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HomePageServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HomePageServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HomePageServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *精品课程列表
     * </pre>
     */
    public void getAlCourse(com.wanfang.main.AllCource.AlCourseRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.main.AllCource.AlCourseReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_AL_COURSE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *热门文献
     * </pre>
     */
    public void getAllHotDoc(com.wanfang.main.AllHotDoc.HotDocRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.main.AllHotDoc.HotDocReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_HOT_DOC, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	最新资讯列表
     * </pre>
     */
    public void getAllLastNews(com.wanfang.main.AllLastNews.LastNewsRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.main.AllLastNews.LastNewsReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_LAST_NEWS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *专题聚焦数据列表
     * </pre>
     */
    public void getAllProject(com.wanfang.main.AllProject.ProjectRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.main.AllProject.ProjectReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_PROJECT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	科技动态
     * </pre>
     */
    public void getAllScience(com.wanfang.main.AllScience.AllScienceRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.main.AllScience.AllScienceReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_SCIENCE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	广告页
     * </pre>
     */
    public void getAllBanner(com.wanfang.main.Banner.AllBannerRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.main.Banner.AllBannerReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_BANNER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *	资源下载地址，要判断阅读权限
     * </pre>
     */
    public void getDocResource(com.wanfang.main.DocResource.DocResourceRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.main.DocResource.DocResourceReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_DOC_RESOURCE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *猜你喜欢列表
     * </pre>
     */
    public void getAllGuessLike(com.wanfang.main.GuessLikeOuterClass.GuessLikeRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.main.GuessLikeOuterClass.GuessLikeReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_GUESS_LIKE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *首页热门期刊列表
     * </pre>
     */
    public void getAllHotPeriodical(com.wanfang.main.HotPeriodical.PeriodicalRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.main.HotPeriodical.PeriodicalReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_HOT_PERIODICAL, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *热搜词列表
     * </pre>
     */
    public void getHotSearchWord(com.wanfang.main.HotSearchWord.HotSearchWordRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.main.HotSearchWord.HotSearchWordReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_HOT_SEARCH_WORD, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *会议信息列表
     * </pre>
     */
    public void getAllMeetingMessage(com.wanfang.main.MeetingMessage.MeetingRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.main.MeetingMessage.MeetingReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_MEETING_MESSAGE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HomePageServiceBlockingStub extends io.grpc.stub.AbstractStub<HomePageServiceBlockingStub> {
    private HomePageServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HomePageServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HomePageServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HomePageServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *精品课程列表
     * </pre>
     */
    public com.wanfang.main.AllCource.AlCourseReply getAlCourse(com.wanfang.main.AllCource.AlCourseRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_AL_COURSE, getCallOptions(), request);
    }

    /**
     * <pre>
     *热门文献
     * </pre>
     */
    public com.wanfang.main.AllHotDoc.HotDocReply getAllHotDoc(com.wanfang.main.AllHotDoc.HotDocRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL_HOT_DOC, getCallOptions(), request);
    }

    /**
     * <pre>
     *	最新资讯列表
     * </pre>
     */
    public com.wanfang.main.AllLastNews.LastNewsReply getAllLastNews(com.wanfang.main.AllLastNews.LastNewsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL_LAST_NEWS, getCallOptions(), request);
    }

    /**
     * <pre>
     *专题聚焦数据列表
     * </pre>
     */
    public com.wanfang.main.AllProject.ProjectReply getAllProject(com.wanfang.main.AllProject.ProjectRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL_PROJECT, getCallOptions(), request);
    }

    /**
     * <pre>
     *	科技动态
     * </pre>
     */
    public com.wanfang.main.AllScience.AllScienceReply getAllScience(com.wanfang.main.AllScience.AllScienceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL_SCIENCE, getCallOptions(), request);
    }

    /**
     * <pre>
     *	广告页
     * </pre>
     */
    public com.wanfang.main.Banner.AllBannerReply getAllBanner(com.wanfang.main.Banner.AllBannerRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL_BANNER, getCallOptions(), request);
    }

    /**
     * <pre>
     *	资源下载地址，要判断阅读权限
     * </pre>
     */
    public com.wanfang.main.DocResource.DocResourceReply getDocResource(com.wanfang.main.DocResource.DocResourceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_DOC_RESOURCE, getCallOptions(), request);
    }

    /**
     * <pre>
     *猜你喜欢列表
     * </pre>
     */
    public com.wanfang.main.GuessLikeOuterClass.GuessLikeReply getAllGuessLike(com.wanfang.main.GuessLikeOuterClass.GuessLikeRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL_GUESS_LIKE, getCallOptions(), request);
    }

    /**
     * <pre>
     *首页热门期刊列表
     * </pre>
     */
    public com.wanfang.main.HotPeriodical.PeriodicalReply getAllHotPeriodical(com.wanfang.main.HotPeriodical.PeriodicalRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL_HOT_PERIODICAL, getCallOptions(), request);
    }

    /**
     * <pre>
     *热搜词列表
     * </pre>
     */
    public com.wanfang.main.HotSearchWord.HotSearchWordReply getHotSearchWord(com.wanfang.main.HotSearchWord.HotSearchWordRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_HOT_SEARCH_WORD, getCallOptions(), request);
    }

    /**
     * <pre>
     *会议信息列表
     * </pre>
     */
    public com.wanfang.main.MeetingMessage.MeetingReply getAllMeetingMessage(com.wanfang.main.MeetingMessage.MeetingRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ALL_MEETING_MESSAGE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HomePageServiceFutureStub extends io.grpc.stub.AbstractStub<HomePageServiceFutureStub> {
    private HomePageServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HomePageServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HomePageServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HomePageServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *精品课程列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.main.AllCource.AlCourseReply> getAlCourse(
        com.wanfang.main.AllCource.AlCourseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_AL_COURSE, getCallOptions()), request);
    }

    /**
     * <pre>
     *热门文献
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.main.AllHotDoc.HotDocReply> getAllHotDoc(
        com.wanfang.main.AllHotDoc.HotDocRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_HOT_DOC, getCallOptions()), request);
    }

    /**
     * <pre>
     *	最新资讯列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.main.AllLastNews.LastNewsReply> getAllLastNews(
        com.wanfang.main.AllLastNews.LastNewsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_LAST_NEWS, getCallOptions()), request);
    }

    /**
     * <pre>
     *专题聚焦数据列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.main.AllProject.ProjectReply> getAllProject(
        com.wanfang.main.AllProject.ProjectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_PROJECT, getCallOptions()), request);
    }

    /**
     * <pre>
     *	科技动态
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.main.AllScience.AllScienceReply> getAllScience(
        com.wanfang.main.AllScience.AllScienceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_SCIENCE, getCallOptions()), request);
    }

    /**
     * <pre>
     *	广告页
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.main.Banner.AllBannerReply> getAllBanner(
        com.wanfang.main.Banner.AllBannerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_BANNER, getCallOptions()), request);
    }

    /**
     * <pre>
     *	资源下载地址，要判断阅读权限
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.main.DocResource.DocResourceReply> getDocResource(
        com.wanfang.main.DocResource.DocResourceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_DOC_RESOURCE, getCallOptions()), request);
    }

    /**
     * <pre>
     *猜你喜欢列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.main.GuessLikeOuterClass.GuessLikeReply> getAllGuessLike(
        com.wanfang.main.GuessLikeOuterClass.GuessLikeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_GUESS_LIKE, getCallOptions()), request);
    }

    /**
     * <pre>
     *首页热门期刊列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.main.HotPeriodical.PeriodicalReply> getAllHotPeriodical(
        com.wanfang.main.HotPeriodical.PeriodicalRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_HOT_PERIODICAL, getCallOptions()), request);
    }

    /**
     * <pre>
     *热搜词列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.main.HotSearchWord.HotSearchWordReply> getHotSearchWord(
        com.wanfang.main.HotSearchWord.HotSearchWordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_HOT_SEARCH_WORD, getCallOptions()), request);
    }

    /**
     * <pre>
     *会议信息列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.main.MeetingMessage.MeetingReply> getAllMeetingMessage(
        com.wanfang.main.MeetingMessage.MeetingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ALL_MEETING_MESSAGE, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_AL_COURSE = 0;
  private static final int METHODID_GET_ALL_HOT_DOC = 1;
  private static final int METHODID_GET_ALL_LAST_NEWS = 2;
  private static final int METHODID_GET_ALL_PROJECT = 3;
  private static final int METHODID_GET_ALL_SCIENCE = 4;
  private static final int METHODID_GET_ALL_BANNER = 5;
  private static final int METHODID_GET_DOC_RESOURCE = 6;
  private static final int METHODID_GET_ALL_GUESS_LIKE = 7;
  private static final int METHODID_GET_ALL_HOT_PERIODICAL = 8;
  private static final int METHODID_GET_HOT_SEARCH_WORD = 9;
  private static final int METHODID_GET_ALL_MEETING_MESSAGE = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HomePageServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HomePageServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_AL_COURSE:
          serviceImpl.getAlCourse((com.wanfang.main.AllCource.AlCourseRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.main.AllCource.AlCourseReply>) responseObserver);
          break;
        case METHODID_GET_ALL_HOT_DOC:
          serviceImpl.getAllHotDoc((com.wanfang.main.AllHotDoc.HotDocRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.main.AllHotDoc.HotDocReply>) responseObserver);
          break;
        case METHODID_GET_ALL_LAST_NEWS:
          serviceImpl.getAllLastNews((com.wanfang.main.AllLastNews.LastNewsRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.main.AllLastNews.LastNewsReply>) responseObserver);
          break;
        case METHODID_GET_ALL_PROJECT:
          serviceImpl.getAllProject((com.wanfang.main.AllProject.ProjectRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.main.AllProject.ProjectReply>) responseObserver);
          break;
        case METHODID_GET_ALL_SCIENCE:
          serviceImpl.getAllScience((com.wanfang.main.AllScience.AllScienceRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.main.AllScience.AllScienceReply>) responseObserver);
          break;
        case METHODID_GET_ALL_BANNER:
          serviceImpl.getAllBanner((com.wanfang.main.Banner.AllBannerRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.main.Banner.AllBannerReply>) responseObserver);
          break;
        case METHODID_GET_DOC_RESOURCE:
          serviceImpl.getDocResource((com.wanfang.main.DocResource.DocResourceRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.main.DocResource.DocResourceReply>) responseObserver);
          break;
        case METHODID_GET_ALL_GUESS_LIKE:
          serviceImpl.getAllGuessLike((com.wanfang.main.GuessLikeOuterClass.GuessLikeRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.main.GuessLikeOuterClass.GuessLikeReply>) responseObserver);
          break;
        case METHODID_GET_ALL_HOT_PERIODICAL:
          serviceImpl.getAllHotPeriodical((com.wanfang.main.HotPeriodical.PeriodicalRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.main.HotPeriodical.PeriodicalReply>) responseObserver);
          break;
        case METHODID_GET_HOT_SEARCH_WORD:
          serviceImpl.getHotSearchWord((com.wanfang.main.HotSearchWord.HotSearchWordRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.main.HotSearchWord.HotSearchWordReply>) responseObserver);
          break;
        case METHODID_GET_ALL_MEETING_MESSAGE:
          serviceImpl.getAllMeetingMessage((com.wanfang.main.MeetingMessage.MeetingRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.main.MeetingMessage.MeetingReply>) responseObserver);
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
      synchronized (HomePageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(METHOD_GET_AL_COURSE)
              .addMethod(METHOD_GET_ALL_HOT_DOC)
              .addMethod(METHOD_GET_ALL_LAST_NEWS)
              .addMethod(METHOD_GET_ALL_PROJECT)
              .addMethod(METHOD_GET_ALL_SCIENCE)
              .addMethod(METHOD_GET_ALL_BANNER)
              .addMethod(METHOD_GET_DOC_RESOURCE)
              .addMethod(METHOD_GET_ALL_GUESS_LIKE)
              .addMethod(METHOD_GET_ALL_HOT_PERIODICAL)
              .addMethod(METHOD_GET_HOT_SEARCH_WORD)
              .addMethod(METHOD_GET_ALL_MEETING_MESSAGE)
              .build();
        }
      }
    }
    return result;
  }
}
