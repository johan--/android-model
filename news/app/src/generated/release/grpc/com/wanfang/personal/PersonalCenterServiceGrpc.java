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
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: personalCenter/ser_personal_center.proto")
public final class PersonalCenterServiceGrpc {

  private PersonalCenterServiceGrpc() {}

  public static final String SERVICE_NAME = "personal.PersonalCenterService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.UserGetTradeListRequest,
      com.wanfang.personal.UserGetTradeListResponse> METHOD_GET_TRADE_LIST =
      io.grpc.MethodDescriptor.<com.wanfang.personal.UserGetTradeListRequest, com.wanfang.personal.UserGetTradeListResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "GetTradeList"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.UserGetTradeListRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.UserGetTradeListResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.UserGetBalenceRequest,
      com.wanfang.personal.UserGetBalenceResponse> METHOD_GET_BALANCE =
      io.grpc.MethodDescriptor.<com.wanfang.personal.UserGetBalenceRequest, com.wanfang.personal.UserGetBalenceResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "GetBalance"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.UserGetBalenceRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.UserGetBalenceResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.LoginRequest,
      com.wanfang.personal.LoginResponse> METHOD_LOGIN =
      io.grpc.MethodDescriptor.<com.wanfang.personal.LoginRequest, com.wanfang.personal.LoginResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "Login"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.LoginRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.LoginResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.LoginOutRequest,
      com.wanfang.personal.LoginOutResponse> METHOD_LOGIN_OUT =
      io.grpc.MethodDescriptor.<com.wanfang.personal.LoginOutRequest, com.wanfang.personal.LoginOutResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "LoginOut"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.LoginOutRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.LoginOutResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.QuickLoginRequest,
      com.wanfang.personal.LoginResponse> METHOD_QUICK_LOGIN =
      io.grpc.MethodDescriptor.<com.wanfang.personal.QuickLoginRequest, com.wanfang.personal.LoginResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "quickLogin"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.QuickLoginRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.LoginResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.ThirdPartyLoginRequest,
      com.wanfang.personal.LoginResponse> METHOD_THIRD_PARTY_LOGIN =
      io.grpc.MethodDescriptor.<com.wanfang.personal.ThirdPartyLoginRequest, com.wanfang.personal.LoginResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "thirdPartyLogin"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.ThirdPartyLoginRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.LoginResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.ThirdPartyBindRequest,
      com.wanfang.personal.ThirdPartyBindResponse> METHOD_THIRD_PARTY_BIND =
      io.grpc.MethodDescriptor.<com.wanfang.personal.ThirdPartyBindRequest, com.wanfang.personal.ThirdPartyBindResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "thirdPartyBind"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.ThirdPartyBindRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.ThirdPartyBindResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.BindExistAccountRequest,
      com.wanfang.personal.LoginResponse> METHOD_BIND_EXIST_ACCOUNT =
      io.grpc.MethodDescriptor.<com.wanfang.personal.BindExistAccountRequest, com.wanfang.personal.LoginResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "BindExistAccount"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.BindExistAccountRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.LoginResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.BindNewRegistRequest,
      com.wanfang.personal.RegistResponse> METHOD_BIND_NEW_REGIST =
      io.grpc.MethodDescriptor.<com.wanfang.personal.BindNewRegistRequest, com.wanfang.personal.RegistResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "BindNewRegist"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.BindNewRegistRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.RegistResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.RegistRequest,
      com.wanfang.personal.RegistResponse> METHOD_REGIST =
      io.grpc.MethodDescriptor.<com.wanfang.personal.RegistRequest, com.wanfang.personal.RegistResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "Regist"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.RegistRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.RegistResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.PasswordByPhoneRequest,
      com.wanfang.personal.PasswordByPhoneResponse> METHOD_GET_PASSWORD_BY_PHONE =
      io.grpc.MethodDescriptor.<com.wanfang.personal.PasswordByPhoneRequest, com.wanfang.personal.PasswordByPhoneResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "getPasswordByPhone"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.PasswordByPhoneRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.PasswordByPhoneResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.PasswordVerifyRequest,
      com.wanfang.personal.PasswordVerifyResponse> METHOD_PASSWORD_VERIFY =
      io.grpc.MethodDescriptor.<com.wanfang.personal.PasswordVerifyRequest, com.wanfang.personal.PasswordVerifyResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "PasswordVerify"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.PasswordVerifyRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.PasswordVerifyResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.PasswordUpdateRequest,
      com.wanfang.personal.PasswordUpdateResponse> METHOD_UPDATE_PASSWORD =
      io.grpc.MethodDescriptor.<com.wanfang.personal.PasswordUpdateRequest, com.wanfang.personal.PasswordUpdateResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "UpdatePassword"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.PasswordUpdateRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.PasswordUpdateResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.MyWalletRequest,
      com.wanfang.personal.MyWalletResponse> METHOD_GET_MY_WALLET =
      io.grpc.MethodDescriptor.<com.wanfang.personal.MyWalletRequest, com.wanfang.personal.MyWalletResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "GetMyWallet"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.MyWalletRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.MyWalletResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.GetPhoneCaptchaRequest,
      com.wanfang.personal.GetPhoneCaptchaResponse> METHOD_GET_PHONE_CAPTCHA =
      io.grpc.MethodDescriptor.<com.wanfang.personal.GetPhoneCaptchaRequest, com.wanfang.personal.GetPhoneCaptchaResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "getPhoneCaptcha"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.GetPhoneCaptchaRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.GetPhoneCaptchaResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.CheckPhoneCaptchaRequest,
      com.wanfang.personal.CheckPhoneCaptchaResponse> METHOD_CHECK_PHONE_CAPTCHA =
      io.grpc.MethodDescriptor.<com.wanfang.personal.CheckPhoneCaptchaRequest, com.wanfang.personal.CheckPhoneCaptchaResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "checkPhoneCaptcha"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.CheckPhoneCaptchaRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.CheckPhoneCaptchaResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.UploadFileRequest,
      com.wanfang.personal.UploadFileResponse> METHOD_UPLOAD_FILE =
      io.grpc.MethodDescriptor.<com.wanfang.personal.UploadFileRequest, com.wanfang.personal.UploadFileResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "UploadFile"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.UploadFileRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.UploadFileResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.UploadAvatarRequest,
      com.wanfang.personal.UploadAvatarResponse> METHOD_UPLOAD_AVATAR =
      io.grpc.MethodDescriptor.<com.wanfang.personal.UploadAvatarRequest, com.wanfang.personal.UploadAvatarResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "UploadAvatar"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.UploadAvatarRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.UploadAvatarResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.InterestSubjectRequest,
      com.wanfang.personal.InterestSubjectResponse> METHOD_GET_INTEREST_SUBJECT =
      io.grpc.MethodDescriptor.<com.wanfang.personal.InterestSubjectRequest, com.wanfang.personal.InterestSubjectResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "GetInterestSubject"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.InterestSubjectRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.InterestSubjectResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.MyInfoRequest,
      com.wanfang.personal.MyInfoResponse> METHOD_GET_USER_INFO =
      io.grpc.MethodDescriptor.<com.wanfang.personal.MyInfoRequest, com.wanfang.personal.MyInfoResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "GetUserInfo"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.MyInfoRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.MyInfoResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.MyInfoUpdateRequest,
      com.wanfang.personal.MyInfoUpdateResponse> METHOD_UPDATE_USER_INFO =
      io.grpc.MethodDescriptor.<com.wanfang.personal.MyInfoUpdateRequest, com.wanfang.personal.MyInfoUpdateResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "UpdateUserInfo"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.MyInfoUpdateRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.MyInfoUpdateResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.UserRolesListRequest,
      com.wanfang.personal.UserRolesListResponse> METHOD_GET_ROLES_LIST =
      io.grpc.MethodDescriptor.<com.wanfang.personal.UserRolesListRequest, com.wanfang.personal.UserRolesListResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "GetRolesList"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.UserRolesListRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.UserRolesListResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.EducationLevelListRequest,
      com.wanfang.personal.EducationLevelListResponse> METHOD_GET_EDUCATION_LEVEL_LIST =
      io.grpc.MethodDescriptor.<com.wanfang.personal.EducationLevelListRequest, com.wanfang.personal.EducationLevelListResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "getEducationLevelList"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.EducationLevelListRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.EducationLevelListResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.wanfang.personal.SubjectListRequest,
      com.wanfang.personal.SubjectListResponse> METHOD_GET_SUBJECT_LIST =
      io.grpc.MethodDescriptor.<com.wanfang.personal.SubjectListRequest, com.wanfang.personal.SubjectListResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "personal.PersonalCenterService", "getSubjectList"))
          .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.SubjectListRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
              com.wanfang.personal.SubjectListResponse.getDefaultInstance()))
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
     * 获取交易历史
     * </pre>
     */
    public void getTradeList(com.wanfang.personal.UserGetTradeListRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.UserGetTradeListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TRADE_LIST, responseObserver);
    }

    /**
     * <pre>
     * 获取账户余额
     * </pre>
     */
    public void getBalance(com.wanfang.personal.UserGetBalenceRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.UserGetBalenceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_BALANCE, responseObserver);
    }

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
     * <pre>
     * 登出
     * </pre>
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
     * 第三方登录
     * </pre>
     */
    public void thirdPartyLogin(com.wanfang.personal.ThirdPartyLoginRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.LoginResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_THIRD_PARTY_LOGIN, responseObserver);
    }

    /**
     * <pre>
     * 第三方登录账号绑定
     * </pre>
     */
    public void thirdPartyBind(com.wanfang.personal.ThirdPartyBindRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.ThirdPartyBindResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_THIRD_PARTY_BIND, responseObserver);
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
     * 通过手机号找回密码
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
     * 获取手机验证码
     * </pre>
     */
    public void getPhoneCaptcha(com.wanfang.personal.GetPhoneCaptchaRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.GetPhoneCaptchaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PHONE_CAPTCHA, responseObserver);
    }

    /**
     * <pre>
     * 检验手机验证码
     * </pre>
     */
    public void checkPhoneCaptcha(com.wanfang.personal.CheckPhoneCaptchaRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.CheckPhoneCaptchaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CHECK_PHONE_CAPTCHA, responseObserver);
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
     * 根据关键字获取感兴趣列表
     * </pre>
     */
    public void getInterestSubject(com.wanfang.personal.InterestSubjectRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.InterestSubjectResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_INTEREST_SUBJECT, responseObserver);
    }

    /**
     * <pre>
     * 获取用户信息
     * </pre>
     */
    public void getUserInfo(com.wanfang.personal.MyInfoRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.MyInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_USER_INFO, responseObserver);
    }

    /**
     * <pre>
     * 更新用户信息
     * </pre>
     */
    public void updateUserInfo(com.wanfang.personal.MyInfoUpdateRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.MyInfoUpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_USER_INFO, responseObserver);
    }

    /**
     * <pre>
     * 获取职称对照表
     * </pre>
     */
    public void getRolesList(com.wanfang.personal.UserRolesListRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.UserRolesListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ROLES_LIST, responseObserver);
    }

    /**
     * <pre>
     * 获取学历对照表
     * </pre>
     */
    public void getEducationLevelList(com.wanfang.personal.EducationLevelListRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.EducationLevelListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_EDUCATION_LEVEL_LIST, responseObserver);
    }

    /**
     * <pre>
     * 获取学科列表
     * </pre>
     */
    public void getSubjectList(com.wanfang.personal.SubjectListRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.SubjectListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_SUBJECT_LIST, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_TRADE_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.personal.UserGetTradeListRequest,
                com.wanfang.personal.UserGetTradeListResponse>(
                  this, METHODID_GET_TRADE_LIST)))
          .addMethod(
            METHOD_GET_BALANCE,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.personal.UserGetBalenceRequest,
                com.wanfang.personal.UserGetBalenceResponse>(
                  this, METHODID_GET_BALANCE)))
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
            METHOD_THIRD_PARTY_LOGIN,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.personal.ThirdPartyLoginRequest,
                com.wanfang.personal.LoginResponse>(
                  this, METHODID_THIRD_PARTY_LOGIN)))
          .addMethod(
            METHOD_THIRD_PARTY_BIND,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.personal.ThirdPartyBindRequest,
                com.wanfang.personal.ThirdPartyBindResponse>(
                  this, METHODID_THIRD_PARTY_BIND)))
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
            METHOD_GET_PHONE_CAPTCHA,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.personal.GetPhoneCaptchaRequest,
                com.wanfang.personal.GetPhoneCaptchaResponse>(
                  this, METHODID_GET_PHONE_CAPTCHA)))
          .addMethod(
            METHOD_CHECK_PHONE_CAPTCHA,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.personal.CheckPhoneCaptchaRequest,
                com.wanfang.personal.CheckPhoneCaptchaResponse>(
                  this, METHODID_CHECK_PHONE_CAPTCHA)))
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
                com.wanfang.personal.MyInfoRequest,
                com.wanfang.personal.MyInfoResponse>(
                  this, METHODID_GET_USER_INFO)))
          .addMethod(
            METHOD_UPDATE_USER_INFO,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.personal.MyInfoUpdateRequest,
                com.wanfang.personal.MyInfoUpdateResponse>(
                  this, METHODID_UPDATE_USER_INFO)))
          .addMethod(
            METHOD_GET_ROLES_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.personal.UserRolesListRequest,
                com.wanfang.personal.UserRolesListResponse>(
                  this, METHODID_GET_ROLES_LIST)))
          .addMethod(
            METHOD_GET_EDUCATION_LEVEL_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.personal.EducationLevelListRequest,
                com.wanfang.personal.EducationLevelListResponse>(
                  this, METHODID_GET_EDUCATION_LEVEL_LIST)))
          .addMethod(
            METHOD_GET_SUBJECT_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                com.wanfang.personal.SubjectListRequest,
                com.wanfang.personal.SubjectListResponse>(
                  this, METHODID_GET_SUBJECT_LIST)))
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
     * 获取交易历史
     * </pre>
     */
    public void getTradeList(com.wanfang.personal.UserGetTradeListRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.UserGetTradeListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TRADE_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取账户余额
     * </pre>
     */
    public void getBalance(com.wanfang.personal.UserGetBalenceRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.UserGetBalenceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_BALANCE, getCallOptions()), request, responseObserver);
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
     * <pre>
     * 登出
     * </pre>
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
     * 第三方登录
     * </pre>
     */
    public void thirdPartyLogin(com.wanfang.personal.ThirdPartyLoginRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.LoginResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_THIRD_PARTY_LOGIN, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 第三方登录账号绑定
     * </pre>
     */
    public void thirdPartyBind(com.wanfang.personal.ThirdPartyBindRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.ThirdPartyBindResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_THIRD_PARTY_BIND, getCallOptions()), request, responseObserver);
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
     * 通过手机号找回密码
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
     * 获取手机验证码
     * </pre>
     */
    public void getPhoneCaptcha(com.wanfang.personal.GetPhoneCaptchaRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.GetPhoneCaptchaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PHONE_CAPTCHA, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 检验手机验证码
     * </pre>
     */
    public void checkPhoneCaptcha(com.wanfang.personal.CheckPhoneCaptchaRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.CheckPhoneCaptchaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CHECK_PHONE_CAPTCHA, getCallOptions()), request, responseObserver);
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
     * 根据关键字获取感兴趣列表
     * </pre>
     */
    public void getInterestSubject(com.wanfang.personal.InterestSubjectRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.InterestSubjectResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_INTEREST_SUBJECT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取用户信息
     * </pre>
     */
    public void getUserInfo(com.wanfang.personal.MyInfoRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.MyInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_USER_INFO, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 更新用户信息
     * </pre>
     */
    public void updateUserInfo(com.wanfang.personal.MyInfoUpdateRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.MyInfoUpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_USER_INFO, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取职称对照表
     * </pre>
     */
    public void getRolesList(com.wanfang.personal.UserRolesListRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.UserRolesListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ROLES_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取学历对照表
     * </pre>
     */
    public void getEducationLevelList(com.wanfang.personal.EducationLevelListRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.EducationLevelListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_EDUCATION_LEVEL_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取学科列表
     * </pre>
     */
    public void getSubjectList(com.wanfang.personal.SubjectListRequest request,
        io.grpc.stub.StreamObserver<com.wanfang.personal.SubjectListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_SUBJECT_LIST, getCallOptions()), request, responseObserver);
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
     * 获取交易历史
     * </pre>
     */
    public com.wanfang.personal.UserGetTradeListResponse getTradeList(com.wanfang.personal.UserGetTradeListRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TRADE_LIST, getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取账户余额
     * </pre>
     */
    public com.wanfang.personal.UserGetBalenceResponse getBalance(com.wanfang.personal.UserGetBalenceRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_BALANCE, getCallOptions(), request);
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
     * <pre>
     * 登出
     * </pre>
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
     * 第三方登录
     * </pre>
     */
    public com.wanfang.personal.LoginResponse thirdPartyLogin(com.wanfang.personal.ThirdPartyLoginRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_THIRD_PARTY_LOGIN, getCallOptions(), request);
    }

    /**
     * <pre>
     * 第三方登录账号绑定
     * </pre>
     */
    public com.wanfang.personal.ThirdPartyBindResponse thirdPartyBind(com.wanfang.personal.ThirdPartyBindRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_THIRD_PARTY_BIND, getCallOptions(), request);
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
     * 通过手机号找回密码
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
     * 获取手机验证码
     * </pre>
     */
    public com.wanfang.personal.GetPhoneCaptchaResponse getPhoneCaptcha(com.wanfang.personal.GetPhoneCaptchaRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PHONE_CAPTCHA, getCallOptions(), request);
    }

    /**
     * <pre>
     * 检验手机验证码
     * </pre>
     */
    public com.wanfang.personal.CheckPhoneCaptchaResponse checkPhoneCaptcha(com.wanfang.personal.CheckPhoneCaptchaRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CHECK_PHONE_CAPTCHA, getCallOptions(), request);
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
     * 根据关键字获取感兴趣列表
     * </pre>
     */
    public com.wanfang.personal.InterestSubjectResponse getInterestSubject(com.wanfang.personal.InterestSubjectRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_INTEREST_SUBJECT, getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取用户信息
     * </pre>
     */
    public com.wanfang.personal.MyInfoResponse getUserInfo(com.wanfang.personal.MyInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_USER_INFO, getCallOptions(), request);
    }

    /**
     * <pre>
     * 更新用户信息
     * </pre>
     */
    public com.wanfang.personal.MyInfoUpdateResponse updateUserInfo(com.wanfang.personal.MyInfoUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_USER_INFO, getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取职称对照表
     * </pre>
     */
    public com.wanfang.personal.UserRolesListResponse getRolesList(com.wanfang.personal.UserRolesListRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ROLES_LIST, getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取学历对照表
     * </pre>
     */
    public com.wanfang.personal.EducationLevelListResponse getEducationLevelList(com.wanfang.personal.EducationLevelListRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_EDUCATION_LEVEL_LIST, getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取学科列表
     * </pre>
     */
    public com.wanfang.personal.SubjectListResponse getSubjectList(com.wanfang.personal.SubjectListRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_SUBJECT_LIST, getCallOptions(), request);
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
     * 获取交易历史
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.personal.UserGetTradeListResponse> getTradeList(
        com.wanfang.personal.UserGetTradeListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TRADE_LIST, getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取账户余额
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.personal.UserGetBalenceResponse> getBalance(
        com.wanfang.personal.UserGetBalenceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_BALANCE, getCallOptions()), request);
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
     * <pre>
     * 登出
     * </pre>
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
     * 第三方登录
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.personal.LoginResponse> thirdPartyLogin(
        com.wanfang.personal.ThirdPartyLoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_THIRD_PARTY_LOGIN, getCallOptions()), request);
    }

    /**
     * <pre>
     * 第三方登录账号绑定
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.personal.ThirdPartyBindResponse> thirdPartyBind(
        com.wanfang.personal.ThirdPartyBindRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_THIRD_PARTY_BIND, getCallOptions()), request);
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
     * 通过手机号找回密码
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
     * 获取手机验证码
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.personal.GetPhoneCaptchaResponse> getPhoneCaptcha(
        com.wanfang.personal.GetPhoneCaptchaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PHONE_CAPTCHA, getCallOptions()), request);
    }

    /**
     * <pre>
     * 检验手机验证码
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.personal.CheckPhoneCaptchaResponse> checkPhoneCaptcha(
        com.wanfang.personal.CheckPhoneCaptchaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CHECK_PHONE_CAPTCHA, getCallOptions()), request);
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
     * 根据关键字获取感兴趣列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.personal.InterestSubjectResponse> getInterestSubject(
        com.wanfang.personal.InterestSubjectRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_INTEREST_SUBJECT, getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取用户信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.personal.MyInfoResponse> getUserInfo(
        com.wanfang.personal.MyInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_USER_INFO, getCallOptions()), request);
    }

    /**
     * <pre>
     * 更新用户信息
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.personal.MyInfoUpdateResponse> updateUserInfo(
        com.wanfang.personal.MyInfoUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_USER_INFO, getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取职称对照表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.personal.UserRolesListResponse> getRolesList(
        com.wanfang.personal.UserRolesListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ROLES_LIST, getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取学历对照表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.personal.EducationLevelListResponse> getEducationLevelList(
        com.wanfang.personal.EducationLevelListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_EDUCATION_LEVEL_LIST, getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取学科列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wanfang.personal.SubjectListResponse> getSubjectList(
        com.wanfang.personal.SubjectListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_SUBJECT_LIST, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TRADE_LIST = 0;
  private static final int METHODID_GET_BALANCE = 1;
  private static final int METHODID_LOGIN = 2;
  private static final int METHODID_LOGIN_OUT = 3;
  private static final int METHODID_QUICK_LOGIN = 4;
  private static final int METHODID_THIRD_PARTY_LOGIN = 5;
  private static final int METHODID_THIRD_PARTY_BIND = 6;
  private static final int METHODID_BIND_EXIST_ACCOUNT = 7;
  private static final int METHODID_BIND_NEW_REGIST = 8;
  private static final int METHODID_REGIST = 9;
  private static final int METHODID_GET_PASSWORD_BY_PHONE = 10;
  private static final int METHODID_PASSWORD_VERIFY = 11;
  private static final int METHODID_UPDATE_PASSWORD = 12;
  private static final int METHODID_GET_MY_WALLET = 13;
  private static final int METHODID_GET_PHONE_CAPTCHA = 14;
  private static final int METHODID_CHECK_PHONE_CAPTCHA = 15;
  private static final int METHODID_UPLOAD_FILE = 16;
  private static final int METHODID_UPLOAD_AVATAR = 17;
  private static final int METHODID_GET_INTEREST_SUBJECT = 18;
  private static final int METHODID_GET_USER_INFO = 19;
  private static final int METHODID_UPDATE_USER_INFO = 20;
  private static final int METHODID_GET_ROLES_LIST = 21;
  private static final int METHODID_GET_EDUCATION_LEVEL_LIST = 22;
  private static final int METHODID_GET_SUBJECT_LIST = 23;

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
        case METHODID_GET_TRADE_LIST:
          serviceImpl.getTradeList((com.wanfang.personal.UserGetTradeListRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.UserGetTradeListResponse>) responseObserver);
          break;
        case METHODID_GET_BALANCE:
          serviceImpl.getBalance((com.wanfang.personal.UserGetBalenceRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.UserGetBalenceResponse>) responseObserver);
          break;
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
        case METHODID_THIRD_PARTY_LOGIN:
          serviceImpl.thirdPartyLogin((com.wanfang.personal.ThirdPartyLoginRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.LoginResponse>) responseObserver);
          break;
        case METHODID_THIRD_PARTY_BIND:
          serviceImpl.thirdPartyBind((com.wanfang.personal.ThirdPartyBindRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.ThirdPartyBindResponse>) responseObserver);
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
        case METHODID_GET_PHONE_CAPTCHA:
          serviceImpl.getPhoneCaptcha((com.wanfang.personal.GetPhoneCaptchaRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.GetPhoneCaptchaResponse>) responseObserver);
          break;
        case METHODID_CHECK_PHONE_CAPTCHA:
          serviceImpl.checkPhoneCaptcha((com.wanfang.personal.CheckPhoneCaptchaRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.CheckPhoneCaptchaResponse>) responseObserver);
          break;
        case METHODID_UPLOAD_FILE:
          serviceImpl.uploadFile((com.wanfang.personal.UploadFileRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.UploadFileResponse>) responseObserver);
          break;
        case METHODID_UPLOAD_AVATAR:
          serviceImpl.uploadAvatar((com.wanfang.personal.UploadAvatarRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.UploadAvatarResponse>) responseObserver);
          break;
        case METHODID_GET_INTEREST_SUBJECT:
          serviceImpl.getInterestSubject((com.wanfang.personal.InterestSubjectRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.InterestSubjectResponse>) responseObserver);
          break;
        case METHODID_GET_USER_INFO:
          serviceImpl.getUserInfo((com.wanfang.personal.MyInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.MyInfoResponse>) responseObserver);
          break;
        case METHODID_UPDATE_USER_INFO:
          serviceImpl.updateUserInfo((com.wanfang.personal.MyInfoUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.MyInfoUpdateResponse>) responseObserver);
          break;
        case METHODID_GET_ROLES_LIST:
          serviceImpl.getRolesList((com.wanfang.personal.UserRolesListRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.UserRolesListResponse>) responseObserver);
          break;
        case METHODID_GET_EDUCATION_LEVEL_LIST:
          serviceImpl.getEducationLevelList((com.wanfang.personal.EducationLevelListRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.EducationLevelListResponse>) responseObserver);
          break;
        case METHODID_GET_SUBJECT_LIST:
          serviceImpl.getSubjectList((com.wanfang.personal.SubjectListRequest) request,
              (io.grpc.stub.StreamObserver<com.wanfang.personal.SubjectListResponse>) responseObserver);
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
      synchronized (PersonalCenterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(METHOD_GET_TRADE_LIST)
              .addMethod(METHOD_GET_BALANCE)
              .addMethod(METHOD_LOGIN)
              .addMethod(METHOD_LOGIN_OUT)
              .addMethod(METHOD_QUICK_LOGIN)
              .addMethod(METHOD_THIRD_PARTY_LOGIN)
              .addMethod(METHOD_THIRD_PARTY_BIND)
              .addMethod(METHOD_BIND_EXIST_ACCOUNT)
              .addMethod(METHOD_BIND_NEW_REGIST)
              .addMethod(METHOD_REGIST)
              .addMethod(METHOD_GET_PASSWORD_BY_PHONE)
              .addMethod(METHOD_PASSWORD_VERIFY)
              .addMethod(METHOD_UPDATE_PASSWORD)
              .addMethod(METHOD_GET_MY_WALLET)
              .addMethod(METHOD_GET_PHONE_CAPTCHA)
              .addMethod(METHOD_CHECK_PHONE_CAPTCHA)
              .addMethod(METHOD_UPLOAD_FILE)
              .addMethod(METHOD_UPLOAD_AVATAR)
              .addMethod(METHOD_GET_INTEREST_SUBJECT)
              .addMethod(METHOD_GET_USER_INFO)
              .addMethod(METHOD_UPDATE_USER_INFO)
              .addMethod(METHOD_GET_ROLES_LIST)
              .addMethod(METHOD_GET_EDUCATION_LEVEL_LIST)
              .addMethod(METHOD_GET_SUBJECT_LIST)
              .build();
        }
      }
    }
    return result;
  }
}
