package com.wanfang.personal;

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
    comments = "Source: ser_personal_center.proto")
public final class PersonalCenterServiceGrpc {

  private PersonalCenterServiceGrpc() {}

  public static final String SERVICE_NAME = "personal.PersonalCenterService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.LoginRequest,
      com.wanfang.personal.LoginResponse> METHOD_LOGIN =
      io.grpc.MethodDescriptor.<com.wanfang.personal.LoginRequest, com.wanfang.personal.LoginResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "Login"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.LoginRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.LoginResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.LoginOutRequest,
      com.wanfang.personal.LoginOutResponse> METHOD_LOGIN_OUT =
      io.grpc.MethodDescriptor.<com.wanfang.personal.LoginOutRequest, com.wanfang.personal.LoginOutResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "LoginOut"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.LoginOutRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.LoginOutResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.QuickLoginRequest,
      com.wanfang.personal.LoginResponse> METHOD_QUICK_LOGIN =
      io.grpc.MethodDescriptor.<com.wanfang.personal.QuickLoginRequest, com.wanfang.personal.LoginResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "QuickLogin"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.QuickLoginRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.LoginResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.BindExistAccountRequest,
      com.wanfang.personal.LoginResponse> METHOD_BIND_EXIST_ACCOUNT =
      io.grpc.MethodDescriptor.<com.wanfang.personal.BindExistAccountRequest, com.wanfang.personal.LoginResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "BindExistAccount"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.BindExistAccountRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.LoginResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.BindNewRegistRequest,
      com.wanfang.personal.RegistResponse> METHOD_BIND_NEW_REGIST =
      io.grpc.MethodDescriptor.<com.wanfang.personal.BindNewRegistRequest, com.wanfang.personal.RegistResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "BindNewRegist"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.BindNewRegistRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.RegistResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.RegistRequest,
      com.wanfang.personal.RegistResponse> METHOD_REGIST =
      io.grpc.MethodDescriptor.<com.wanfang.personal.RegistRequest, com.wanfang.personal.RegistResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "Regist"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.RegistRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.RegistResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.PasswordByPhoneRequest,
      com.wanfang.personal.PasswordByPhoneResponse> METHOD_GET_PASSWORD_BY_PHONE =
      io.grpc.MethodDescriptor.<com.wanfang.personal.PasswordByPhoneRequest, com.wanfang.personal.PasswordByPhoneResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "GetPasswordByPhone"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.PasswordByPhoneRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.PasswordByPhoneResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.PasswordVerifyRequest,
      com.wanfang.personal.PasswordVerifyResponse> METHOD_PASSWORD_VERIFY =
      io.grpc.MethodDescriptor.<com.wanfang.personal.PasswordVerifyRequest, com.wanfang.personal.PasswordVerifyResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "PasswordVerify"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.PasswordVerifyRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.PasswordVerifyResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.PasswordUpdateRequest,
      com.wanfang.personal.PasswordUpdateResponse> METHOD_UPDATE_PASSWORD =
      io.grpc.MethodDescriptor.<com.wanfang.personal.PasswordUpdateRequest, com.wanfang.personal.PasswordUpdateResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "UpdatePassword"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.PasswordUpdateRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.PasswordUpdateResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.MyWalletRequest,
      com.wanfang.personal.MyWalletResponse> METHOD_GET_MY_WALLET =
      io.grpc.MethodDescriptor.<com.wanfang.personal.MyWalletRequest, com.wanfang.personal.MyWalletResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "GetMyWallet"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.MyWalletRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.MyWalletResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.MyOrdersRequest,
      com.wanfang.personal.MyOrdersResponse> METHOD_GET_MY_ORDERS =
      io.grpc.MethodDescriptor.<com.wanfang.personal.MyOrdersRequest, com.wanfang.personal.MyOrdersResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "GetMyOrders"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.MyOrdersRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.MyOrdersResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.MyCollectRequest,
      com.wanfang.personal.MyCollectResponse> METHOD_GET_MY_COLLECT =
      io.grpc.MethodDescriptor.<com.wanfang.personal.MyCollectRequest, com.wanfang.personal.MyCollectResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "GetMyCollect"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.MyCollectRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.MyCollectResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.PhoneCaptchaRequest,
      com.wanfang.personal.PhoneCaptchaResponse> METHOD_GET_PHONE_CAPTCHA =
      io.grpc.MethodDescriptor.<com.wanfang.personal.PhoneCaptchaRequest, com.wanfang.personal.PhoneCaptchaResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "GetPhoneCaptcha"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.PhoneCaptchaRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.PhoneCaptchaResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.UploadFileRequest,
      com.wanfang.personal.UploadFileResponse> METHOD_UPLOAD_FILE =
      io.grpc.MethodDescriptor.<com.wanfang.personal.UploadFileRequest, com.wanfang.personal.UploadFileResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "UploadFile"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.UploadFileRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.UploadFileResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.UploadAvatarRequest,
      com.wanfang.personal.UploadAvatarResponse> METHOD_UPLOAD_AVATAR =
      io.grpc.MethodDescriptor.<com.wanfang.personal.UploadAvatarRequest, com.wanfang.personal.UploadAvatarResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "UploadAvatar"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.UploadAvatarRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.UploadAvatarResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.UpdateRegistInfoRequest,
      com.wanfang.personal.UpdateRegistInfoResponse> METHOD_UPDATE_REGIST_INFO =
      io.grpc.MethodDescriptor.<com.wanfang.personal.UpdateRegistInfoRequest, com.wanfang.personal.UpdateRegistInfoResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "UpdateRegistInfo"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.UpdateRegistInfoRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.UpdateRegistInfoResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.InterestSubjectRequest,
      com.wanfang.personal.InterestSubjectResponse> METHOD_GET_INTEREST_SUBJECT =
      io.grpc.MethodDescriptor.<com.wanfang.personal.InterestSubjectRequest, com.wanfang.personal.InterestSubjectResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "GetInterestSubject"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.InterestSubjectRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.InterestSubjectResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.UserInfoRequest,
      com.wanfang.personal.UserInfoResponse> METHOD_GET_USER_INFO =
      io.grpc.MethodDescriptor.<com.wanfang.personal.UserInfoRequest, com.wanfang.personal.UserInfoResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "GetUserInfo"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.UserInfoRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.wanfang.personal.UserInfoResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PersonalCenterServiceStub newStub(io.grpc.Channel channel) {
    return new PersonalCenterServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PersonalCenterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PersonalCenterServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PersonalCenterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PersonalCenterServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PersonalCenterServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 登录
     * </pre>
     */
    public void login(com.wanfang.personal.LoginRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.LoginResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LOGIN, responseObserver);
    }

    /**
     */
    public void loginOut(com.wanfang.personal.LoginOutRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.LoginOutResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LOGIN_OUT, responseObserver);
    }

    /**
     * <pre>
     * 快捷登录(手机号验证码登录)
     * </pre>
     */
    public void quickLogin(com.wanfang.personal.QuickLoginRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.LoginResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_QUICK_LOGIN, responseObserver);
    }

    /**
     * <pre>
     * 第三方登录后绑定万方账号
     * </pre>
     */
    public void bindExistAccount(com.wanfang.personal.BindExistAccountRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.LoginResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BIND_EXIST_ACCOUNT, responseObserver);
    }

    /**
     * <pre>
     * 第三方登录后注册万方账号
     * </pre>
     */
    public void bindNewRegist(com.wanfang.personal.BindNewRegistRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.RegistResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BIND_NEW_REGIST, responseObserver);
    }

    /**
     * <pre>
     * 注册
     * </pre>
     */
    public void regist(com.wanfang.personal.RegistRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.RegistResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REGIST, responseObserver);
    }

    /**
     * <pre>
     * 通过手机号找回密码 验证手机号
     * </pre>
     */
    public void getPasswordByPhone(com.wanfang.personal.PasswordByPhoneRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.PasswordByPhoneResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PASSWORD_BY_PHONE, responseObserver);
    }

    /**
     * <pre>
     * 验证密码是否正确
     * </pre>
     */
    public void passwordVerify(com.wanfang.personal.PasswordVerifyRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.PasswordVerifyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PASSWORD_VERIFY, responseObserver);
    }

    /**
     * <pre>
     * 更新密码
     * </pre>
     */
    public void updatePassword(com.wanfang.personal.PasswordUpdateRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.PasswordUpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_PASSWORD, responseObserver);
    }

    /**
     * <pre>
     * 获取我的钱包详情
     * </pre>
     */
    public void getMyWallet(com.wanfang.personal.MyWalletRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.MyWalletResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_MY_WALLET, responseObserver);
    }

    /**
     * <pre>
     * 获取我的订单数据
     * </pre>
     */
    public void getMyOrders(com.wanfang.personal.MyOrdersRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.MyOrdersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_MY_ORDERS, responseObserver);
    }

    /**
     * <pre>
     * 获取我的收藏
     * </pre>
     */
    public void getMyCollect(com.wanfang.personal.MyCollectRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.MyCollectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_MY_COLLECT, responseObserver);
    }

    /**
     * <pre>
     * 获取验证码
     * </pre>
     */
    public void getPhoneCaptcha(com.wanfang.personal.PhoneCaptchaRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.PhoneCaptchaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PHONE_CAPTCHA, responseObserver);
    }

    /**
     * <pre>
     * 上传文件
     * </pre>
     */
    public void uploadFile(com.wanfang.personal.UploadFileRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.UploadFileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPLOAD_FILE, responseObserver);
    }

    /**
     * <pre>
     * 上传用户头像
     * </pre>
     */
    public void uploadAvatar(com.wanfang.personal.UploadAvatarRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.UploadAvatarResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPLOAD_AVATAR, responseObserver);
    }

    /**
     * <pre>
     * 更新注册信息
     * </pre>
     */
    public void updateRegistInfo(com.wanfang.personal.UpdateRegistInfoRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.UpdateRegistInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_REGIST_INFO, responseObserver);
    }

    /**
     * <pre>
     * 根据关键字获取感兴趣列表
     * </pre>
     */
    public void getInterestSubject(com.wanfang.personal.InterestSubjectRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.InterestSubjectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_INTEREST_SUBJECT, responseObserver);
    }

    /**
     */
    public void getUserInfo(com.wanfang.personal.UserInfoRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.UserInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_USER_INFO, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LOGIN,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.personal.LoginRequest,
                com.wanfang.personal.LoginResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            METHOD_LOGIN_OUT,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.personal.LoginOutRequest,
                com.wanfang.personal.LoginOutResponse>(
                  this, METHODID_LOGIN_OUT)))
          .addMethod(
            METHOD_QUICK_LOGIN,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.personal.QuickLoginRequest,
                com.wanfang.personal.LoginResponse>(
                  this, METHODID_QUICK_LOGIN)))
          .addMethod(
            METHOD_BIND_EXIST_ACCOUNT,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.personal.BindExistAccountRequest,
                com.wanfang.personal.LoginResponse>(
                  this, METHODID_BIND_EXIST_ACCOUNT)))
          .addMethod(
            METHOD_BIND_NEW_REGIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.personal.BindNewRegistRequest,
                com.wanfang.personal.RegistResponse>(
                  this, METHODID_BIND_NEW_REGIST)))
          .addMethod(
            METHOD_REGIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.personal.RegistRequest,
                com.wanfang.personal.RegistResponse>(
                  this, METHODID_REGIST)))
          .addMethod(
            METHOD_GET_PASSWORD_BY_PHONE,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.personal.PasswordByPhoneRequest,
                com.wanfang.personal.PasswordByPhoneResponse>(
                  this, METHODID_GET_PASSWORD_BY_PHONE)))
          .addMethod(
            METHOD_PASSWORD_VERIFY,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.personal.PasswordVerifyRequest,
                com.wanfang.personal.PasswordVerifyResponse>(
                  this, METHODID_PASSWORD_VERIFY)))
          .addMethod(
            METHOD_UPDATE_PASSWORD,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.personal.PasswordUpdateRequest,
                com.wanfang.personal.PasswordUpdateResponse>(
                  this, METHODID_UPDATE_PASSWORD)))
          .addMethod(
            METHOD_GET_MY_WALLET,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.personal.MyWalletRequest,
                com.wanfang.personal.MyWalletResponse>(
                  this, METHODID_GET_MY_WALLET)))
          .addMethod(
            METHOD_GET_MY_ORDERS,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.personal.MyOrdersRequest,
                com.wanfang.personal.MyOrdersResponse>(
                  this, METHODID_GET_MY_ORDERS)))
          .addMethod(
            METHOD_GET_MY_COLLECT,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.personal.MyCollectRequest,
                com.wanfang.personal.MyCollectResponse>(
                  this, METHODID_GET_MY_COLLECT)))
          .addMethod(
            METHOD_GET_PHONE_CAPTCHA,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.personal.PhoneCaptchaRequest,
                com.wanfang.personal.PhoneCaptchaResponse>(
                  this, METHODID_GET_PHONE_CAPTCHA)))
          .addMethod(
            METHOD_UPLOAD_FILE,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.personal.UploadFileRequest,
                com.wanfang.personal.UploadFileResponse>(
                  this, METHODID_UPLOAD_FILE)))
          .addMethod(
            METHOD_UPLOAD_AVATAR,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.personal.UploadAvatarRequest,
                com.wanfang.personal.UploadAvatarResponse>(
                  this, METHODID_UPLOAD_AVATAR)))
          .addMethod(
            METHOD_UPDATE_REGIST_INFO,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.personal.UpdateRegistInfoRequest,
                com.wanfang.personal.UpdateRegistInfoResponse>(
                  this, METHODID_UPDATE_REGIST_INFO)))
          .addMethod(
            METHOD_GET_INTEREST_SUBJECT,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.personal.InterestSubjectRequest,
                com.wanfang.personal.InterestSubjectResponse>(
                  this, METHODID_GET_INTEREST_SUBJECT)))
          .addMethod(
            METHOD_GET_USER_INFO,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.personal.UserInfoRequest,
                com.wanfang.personal.UserInfoResponse>(
                  this, METHODID_GET_USER_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class PersonalCenterServiceStub extends io.grpc.stub.AbstractStub<PersonalCenterServiceStub> {
    private PersonalCenterServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonalCenterServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonalCenterServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonalCenterServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * 登录
     * </pre>
     */
    public void login(com.wanfang.personal.LoginRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.LoginResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LOGIN, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void loginOut(com.wanfang.personal.LoginOutRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.LoginOutResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LOGIN_OUT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 快捷登录(手机号验证码登录)
     * </pre>
     */
    public void quickLogin(com.wanfang.personal.QuickLoginRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.LoginResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_QUICK_LOGIN, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 第三方登录后绑定万方账号
     * </pre>
     */
    public void bindExistAccount(com.wanfang.personal.BindExistAccountRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.LoginResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BIND_EXIST_ACCOUNT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 第三方登录后注册万方账号
     * </pre>
     */
    public void bindNewRegist(com.wanfang.personal.BindNewRegistRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.RegistResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BIND_NEW_REGIST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 注册
     * </pre>
     */
    public void regist(com.wanfang.personal.RegistRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.RegistResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REGIST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 通过手机号找回密码 验证手机号
     * </pre>
     */
    public void getPasswordByPhone(com.wanfang.personal.PasswordByPhoneRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.PasswordByPhoneResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PASSWORD_BY_PHONE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 验证密码是否正确
     * </pre>
     */
    public void passwordVerify(com.wanfang.personal.PasswordVerifyRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.PasswordVerifyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PASSWORD_VERIFY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更新密码
     * </pre>
     */
    public void updatePassword(com.wanfang.personal.PasswordUpdateRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.PasswordUpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PASSWORD, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取我的钱包详情
     * </pre>
     */
    public void getMyWallet(com.wanfang.personal.MyWalletRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.MyWalletResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_MY_WALLET, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取我的订单数据
     * </pre>
     */
    public void getMyOrders(com.wanfang.personal.MyOrdersRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.MyOrdersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_MY_ORDERS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取我的收藏
     * </pre>
     */
    public void getMyCollect(com.wanfang.personal.MyCollectRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.MyCollectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_MY_COLLECT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取验证码
     * </pre>
     */
    public void getPhoneCaptcha(com.wanfang.personal.PhoneCaptchaRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.PhoneCaptchaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PHONE_CAPTCHA, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 上传文件
     * </pre>
     */
    public void uploadFile(com.wanfang.personal.UploadFileRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.UploadFileResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPLOAD_FILE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 上传用户头像
     * </pre>
     */
    public void uploadAvatar(com.wanfang.personal.UploadAvatarRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.UploadAvatarResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPLOAD_AVATAR, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更新注册信息
     * </pre>
     */
    public void updateRegistInfo(com.wanfang.personal.UpdateRegistInfoRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.UpdateRegistInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_REGIST_INFO, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 根据关键字获取感兴趣列表
     * </pre>
     */
    public void getInterestSubject(com.wanfang.personal.InterestSubjectRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.InterestSubjectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_INTEREST_SUBJECT, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserInfo(com.wanfang.personal.UserInfoRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.UserInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_USER_INFO, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PersonalCenterServiceBlockingStub extends io.grpc.stub.AbstractStub<PersonalCenterServiceBlockingStub> {
    private PersonalCenterServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonalCenterServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonalCenterServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonalCenterServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 登录
     * </pre>
     */
    public com.wanfang.personal.LoginResponse login(com.wanfang.personal.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LOGIN, getCallOptions(), request);
    }

    /**
     */
    public com.wanfang.personal.LoginOutResponse loginOut(com.wanfang.personal.LoginOutRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LOGIN_OUT, getCallOptions(), request);
    }

    /**
     * <pre>
     * 快捷登录(手机号验证码登录)
     * </pre>
     */
    public com.wanfang.personal.LoginResponse quickLogin(com.wanfang.personal.QuickLoginRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_QUICK_LOGIN, getCallOptions(), request);
    }

    /**
     * <pre>
     * 第三方登录后绑定万方账号
     * </pre>
     */
    public com.wanfang.personal.LoginResponse bindExistAccount(com.wanfang.personal.BindExistAccountRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BIND_EXIST_ACCOUNT, getCallOptions(), request);
    }

    /**
     * <pre>
     * 第三方登录后注册万方账号
     * </pre>
     */
    public com.wanfang.personal.RegistResponse bindNewRegist(com.wanfang.personal.BindNewRegistRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BIND_NEW_REGIST, getCallOptions(), request);
    }

    /**
     * <pre>
     * 注册
     * </pre>
     */
    public com.wanfang.personal.RegistResponse regist(com.wanfang.personal.RegistRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REGIST, getCallOptions(), request);
    }

    /**
     * <pre>
     * 通过手机号找回密码 验证手机号
     * </pre>
     */
    public com.wanfang.personal.PasswordByPhoneResponse getPasswordByPhone(com.wanfang.personal.PasswordByPhoneRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PASSWORD_BY_PHONE, getCallOptions(), request);
    }

    /**
     * <pre>
     * 验证密码是否正确
     * </pre>
     */
    public com.wanfang.personal.PasswordVerifyResponse passwordVerify(com.wanfang.personal.PasswordVerifyRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PASSWORD_VERIFY, getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新密码
     * </pre>
     */
    public com.wanfang.personal.PasswordUpdateResponse updatePassword(com.wanfang.personal.PasswordUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_PASSWORD, getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取我的钱包详情
     * </pre>
     */
    public com.wanfang.personal.MyWalletResponse getMyWallet(com.wanfang.personal.MyWalletRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_MY_WALLET, getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取我的订单数据
     * </pre>
     */
    public com.wanfang.personal.MyOrdersResponse getMyOrders(com.wanfang.personal.MyOrdersRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_MY_ORDERS, getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取我的收藏
     * </pre>
     */
    public com.wanfang.personal.MyCollectResponse getMyCollect(com.wanfang.personal.MyCollectRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_MY_COLLECT, getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取验证码
     * </pre>
     */
    public com.wanfang.personal.PhoneCaptchaResponse getPhoneCaptcha(com.wanfang.personal.PhoneCaptchaRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PHONE_CAPTCHA, getCallOptions(), request);
    }

    /**
     * <pre>
     * 上传文件
     * </pre>
     */
    public com.wanfang.personal.UploadFileResponse uploadFile(com.wanfang.personal.UploadFileRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPLOAD_FILE, getCallOptions(), request);
    }

    /**
     * <pre>
     * 上传用户头像
     * </pre>
     */
    public com.wanfang.personal.UploadAvatarResponse uploadAvatar(com.wanfang.personal.UploadAvatarRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPLOAD_AVATAR, getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新注册信息
     * </pre>
     */
    public com.wanfang.personal.UpdateRegistInfoResponse updateRegistInfo(com.wanfang.personal.UpdateRegistInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_REGIST_INFO, getCallOptions(), request);
    }

    /**
     * <pre>
     * 根据关键字获取感兴趣列表
     * </pre>
     */
    public com.wanfang.personal.InterestSubjectResponse getInterestSubject(com.wanfang.personal.InterestSubjectRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_INTEREST_SUBJECT, getCallOptions(), request);
    }

    /**
     */
    public com.wanfang.personal.UserInfoResponse getUserInfo(com.wanfang.personal.UserInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_USER_INFO, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PersonalCenterServiceFutureStub extends io.grpc.stub.AbstractStub<PersonalCenterServiceFutureStub> {
    private PersonalCenterServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonalCenterServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonalCenterServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonalCenterServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 登录
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.personal.LoginResponse> login(
        com.wanfang.personal.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LOGIN, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.personal.LoginOutResponse> loginOut(
        com.wanfang.personal.LoginOutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LOGIN_OUT, getCallOptions()), request);
    }

    /**
     * <pre>
     * 快捷登录(手机号验证码登录)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.personal.LoginResponse> quickLogin(
        com.wanfang.personal.QuickLoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_QUICK_LOGIN, getCallOptions()), request);
    }

    /**
     * <pre>
     * 第三方登录后绑定万方账号
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.personal.LoginResponse> bindExistAccount(
        com.wanfang.personal.BindExistAccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BIND_EXIST_ACCOUNT, getCallOptions()), request);
    }

    /**
     * <pre>
     * 第三方登录后注册万方账号
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.personal.RegistResponse> bindNewRegist(
        com.wanfang.personal.BindNewRegistRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BIND_NEW_REGIST, getCallOptions()), request);
    }

    /**
     * <pre>
     * 注册
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.personal.RegistResponse> regist(
        com.wanfang.personal.RegistRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REGIST, getCallOptions()), request);
    }

    /**
     * <pre>
     * 通过手机号找回密码 验证手机号
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.personal.PasswordByPhoneResponse> getPasswordByPhone(
        com.wanfang.personal.PasswordByPhoneRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PASSWORD_BY_PHONE, getCallOptions()), request);
    }

    /**
     * <pre>
     * 验证密码是否正确
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.personal.PasswordVerifyResponse> passwordVerify(
        com.wanfang.personal.PasswordVerifyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PASSWORD_VERIFY, getCallOptions()), request);
    }

    /**
     * <pre>
     * 更新密码
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.personal.PasswordUpdateResponse> updatePassword(
        com.wanfang.personal.PasswordUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PASSWORD, getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取我的钱包详情
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.personal.MyWalletResponse> getMyWallet(
        com.wanfang.personal.MyWalletRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_MY_WALLET, getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取我的订单数据
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.personal.MyOrdersResponse> getMyOrders(
        com.wanfang.personal.MyOrdersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_MY_ORDERS, getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取我的收藏
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.personal.MyCollectResponse> getMyCollect(
        com.wanfang.personal.MyCollectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_MY_COLLECT, getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取验证码
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.personal.PhoneCaptchaResponse> getPhoneCaptcha(
        com.wanfang.personal.PhoneCaptchaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PHONE_CAPTCHA, getCallOptions()), request);
    }

    /**
     * <pre>
     * 上传文件
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.personal.UploadFileResponse> uploadFile(
        com.wanfang.personal.UploadFileRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPLOAD_FILE, getCallOptions()), request);
    }

    /**
     * <pre>
     * 上传用户头像
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.personal.UploadAvatarResponse> uploadAvatar(
        com.wanfang.personal.UploadAvatarRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPLOAD_AVATAR, getCallOptions()), request);
    }

    /**
     * <pre>
     * 更新注册信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.personal.UpdateRegistInfoResponse> updateRegistInfo(
        com.wanfang.personal.UpdateRegistInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_REGIST_INFO, getCallOptions()), request);
    }

    /**
     * <pre>
     * 根据关键字获取感兴趣列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.personal.InterestSubjectResponse> getInterestSubject(
        com.wanfang.personal.InterestSubjectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_INTEREST_SUBJECT, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.personal.UserInfoResponse> getUserInfo(
        com.wanfang.personal.UserInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_USER_INFO, getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_LOGIN_OUT = 1;
  private static final int METHODID_QUICK_LOGIN = 2;
  private static final int METHODID_BIND_EXIST_ACCOUNT = 3;
  private static final int METHODID_BIND_NEW_REGIST = 4;
  private static final int METHODID_REGIST = 5;
  private static final int METHODID_GET_PASSWORD_BY_PHONE = 6;
  private static final int METHODID_PASSWORD_VERIFY = 7;
  private static final int METHODID_UPDATE_PASSWORD = 8;
  private static final int METHODID_GET_MY_WALLET = 9;
  private static final int METHODID_GET_MY_ORDERS = 10;
  private static final int METHODID_GET_MY_COLLECT = 11;
  private static final int METHODID_GET_PHONE_CAPTCHA = 12;
  private static final int METHODID_UPLOAD_FILE = 13;
  private static final int METHODID_UPLOAD_AVATAR = 14;
  private static final int METHODID_UPDATE_REGIST_INFO = 15;
  private static final int METHODID_GET_INTEREST_SUBJECT = 16;
  private static final int METHODID_GET_USER_INFO = 17;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PersonalCenterServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PersonalCenterServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((com.wanfang.personal.LoginRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.LoginResponse>) responseObserver);
          break;
        case METHODID_LOGIN_OUT:
          serviceImpl.loginOut((com.wanfang.personal.LoginOutRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.LoginOutResponse>) responseObserver);
          break;
        case METHODID_QUICK_LOGIN:
          serviceImpl.quickLogin((com.wanfang.personal.QuickLoginRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.LoginResponse>) responseObserver);
          break;
        case METHODID_BIND_EXIST_ACCOUNT:
          serviceImpl.bindExistAccount((com.wanfang.personal.BindExistAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.LoginResponse>) responseObserver);
          break;
        case METHODID_BIND_NEW_REGIST:
          serviceImpl.bindNewRegist((com.wanfang.personal.BindNewRegistRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.RegistResponse>) responseObserver);
          break;
        case METHODID_REGIST:
          serviceImpl.regist((com.wanfang.personal.RegistRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.RegistResponse>) responseObserver);
          break;
        case METHODID_GET_PASSWORD_BY_PHONE:
          serviceImpl.getPasswordByPhone((com.wanfang.personal.PasswordByPhoneRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.PasswordByPhoneResponse>) responseObserver);
          break;
        case METHODID_PASSWORD_VERIFY:
          serviceImpl.passwordVerify((com.wanfang.personal.PasswordVerifyRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.PasswordVerifyResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PASSWORD:
          serviceImpl.updatePassword((com.wanfang.personal.PasswordUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.PasswordUpdateResponse>) responseObserver);
          break;
        case METHODID_GET_MY_WALLET:
          serviceImpl.getMyWallet((com.wanfang.personal.MyWalletRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.MyWalletResponse>) responseObserver);
          break;
        case METHODID_GET_MY_ORDERS:
          serviceImpl.getMyOrders((com.wanfang.personal.MyOrdersRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.MyOrdersResponse>) responseObserver);
          break;
        case METHODID_GET_MY_COLLECT:
          serviceImpl.getMyCollect((com.wanfang.personal.MyCollectRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.MyCollectResponse>) responseObserver);
          break;
        case METHODID_GET_PHONE_CAPTCHA:
          serviceImpl.getPhoneCaptcha((com.wanfang.personal.PhoneCaptchaRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.PhoneCaptchaResponse>) responseObserver);
          break;
        case METHODID_UPLOAD_FILE:
          serviceImpl.uploadFile((com.wanfang.personal.UploadFileRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.UploadFileResponse>) responseObserver);
          break;
        case METHODID_UPLOAD_AVATAR:
          serviceImpl.uploadAvatar((com.wanfang.personal.UploadAvatarRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.UploadAvatarResponse>) responseObserver);
          break;
        case METHODID_UPDATE_REGIST_INFO:
          serviceImpl.updateRegistInfo((com.wanfang.personal.UpdateRegistInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.UpdateRegistInfoResponse>) responseObserver);
          break;
        case METHODID_GET_INTEREST_SUBJECT:
          serviceImpl.getInterestSubject((com.wanfang.personal.InterestSubjectRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.InterestSubjectResponse>) responseObserver);
          break;
        case METHODID_GET_USER_INFO:
          serviceImpl.getUserInfo((com.wanfang.personal.UserInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.UserInfoResponse>) responseObserver);
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

  private static final class PersonalCenterServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.wanfang.personal.SerPersonalCenter.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PersonalCenterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PersonalCenterServiceDescriptorSupplier())
              .addMethod(METHOD_LOGIN)
              .addMethod(METHOD_LOGIN_OUT)
              .addMethod(METHOD_QUICK_LOGIN)
              .addMethod(METHOD_BIND_EXIST_ACCOUNT)
              .addMethod(METHOD_BIND_NEW_REGIST)
              .addMethod(METHOD_REGIST)
              .addMethod(METHOD_GET_PASSWORD_BY_PHONE)
              .addMethod(METHOD_PASSWORD_VERIFY)
              .addMethod(METHOD_UPDATE_PASSWORD)
              .addMethod(METHOD_GET_MY_WALLET)
              .addMethod(METHOD_GET_MY_ORDERS)
              .addMethod(METHOD_GET_MY_COLLECT)
              .addMethod(METHOD_GET_PHONE_CAPTCHA)
              .addMethod(METHOD_UPLOAD_FILE)
              .addMethod(METHOD_UPLOAD_AVATAR)
              .addMethod(METHOD_UPDATE_REGIST_INFO)
              .addMethod(METHOD_GET_INTEREST_SUBJECT)
              .addMethod(METHOD_GET_USER_INFO)
              .build();
        }
      }
    }
    return result;
  }
}
