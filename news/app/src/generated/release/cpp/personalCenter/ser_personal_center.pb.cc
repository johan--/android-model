// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: personalCenter/ser_personal_center.proto

#define INTERNAL_SUPPRESS_PROTOBUF_FIELD_DEPRECATION
#include "personalCenter/ser_personal_center.pb.h"

#include <algorithm>

#include <google/protobuf/stubs/common.h>
#include <google/protobuf/stubs/port.h>
#include <google/protobuf/stubs/once.h>
#include <google/protobuf/io/coded_stream.h>
#include <google/protobuf/wire_format_lite_inl.h>
#include <google/protobuf/descriptor.h>
#include <google/protobuf/generated_message_reflection.h>
#include <google/protobuf/reflection_ops.h>
#include <google/protobuf/wire_format.h>
// @@protoc_insertion_point(includes)

namespace personal {

namespace {


}  // namespace


void protobuf_AssignDesc_personalCenter_2fser_5fpersonal_5fcenter_2eproto() GOOGLE_ATTRIBUTE_COLD;
void protobuf_AssignDesc_personalCenter_2fser_5fpersonal_5fcenter_2eproto() {
  protobuf_AddDesc_personalCenter_2fser_5fpersonal_5fcenter_2eproto();
  const ::google::protobuf::FileDescriptor* file =
    ::google::protobuf::DescriptorPool::generated_pool()->FindFileByName(
      "personalCenter/ser_personal_center.proto");
  GOOGLE_CHECK(file != NULL);
}

namespace {

GOOGLE_PROTOBUF_DECLARE_ONCE(protobuf_AssignDescriptors_once_);
void protobuf_AssignDescriptorsOnce() {
  ::google::protobuf::GoogleOnceInit(&protobuf_AssignDescriptors_once_,
                 &protobuf_AssignDesc_personalCenter_2fser_5fpersonal_5fcenter_2eproto);
}

void protobuf_RegisterTypes(const ::std::string&) GOOGLE_ATTRIBUTE_COLD;
void protobuf_RegisterTypes(const ::std::string&) {
  protobuf_AssignDescriptorsOnce();
}

}  // namespace

void protobuf_ShutdownFile_personalCenter_2fser_5fpersonal_5fcenter_2eproto() {
}

void protobuf_InitDefaults_personalCenter_2fser_5fpersonal_5fcenter_2eproto_impl() {
  GOOGLE_PROTOBUF_VERIFY_VERSION;

  ::personal::protobuf_InitDefaults_personalCenter_2fmsg_5flogin_2eproto();
  ::personal::protobuf_InitDefaults_personalCenter_2fmsg_5fregist_2eproto();
  ::personal::protobuf_InitDefaults_personalCenter_2fmsg_5fpassword_2eproto();
  ::personal::protobuf_InitDefaults_personalCenter_2fmsg_5fmy_5fwallet_2eproto();
  ::personal::protobuf_InitDefaults_personalCenter_2fmsg_5fcommon_2eproto();
  ::personal::protobuf_InitDefaults_personalCenter_2fmsg_5fupload_5favatar_2eproto();
  ::personal::protobuf_InitDefaults_personalCenter_2fmsg_5finterest_5fword_2eproto();
  ::personal::protobuf_InitDefaults_personalCenter_2fmsg_5fpersonInfo_2eproto();
  ::personal::protobuf_InitDefaults_personalCenter_2fmsg_5fcaptcha_2eproto();
}

GOOGLE_PROTOBUF_DECLARE_ONCE(protobuf_InitDefaults_personalCenter_2fser_5fpersonal_5fcenter_2eproto_once_);
void protobuf_InitDefaults_personalCenter_2fser_5fpersonal_5fcenter_2eproto() {
  ::google::protobuf::GoogleOnceInit(&protobuf_InitDefaults_personalCenter_2fser_5fpersonal_5fcenter_2eproto_once_,
                 &protobuf_InitDefaults_personalCenter_2fser_5fpersonal_5fcenter_2eproto_impl);
}
void protobuf_AddDesc_personalCenter_2fser_5fpersonal_5fcenter_2eproto_impl() {
  GOOGLE_PROTOBUF_VERIFY_VERSION;

  protobuf_InitDefaults_personalCenter_2fser_5fpersonal_5fcenter_2eproto();
  ::google::protobuf::DescriptorPool::InternalAddGeneratedFile(
    "\n(personalCenter/ser_personal_center.pro"
    "to\022\010personal\032\036personalCenter/msg_login.p"
    "roto\032\037personalCenter/msg_regist.proto\032!p"
    "ersonalCenter/msg_password.proto\032\"person"
    "alCenter/msg_my_wallet.proto\032\037personalCe"
    "nter/msg_common.proto\032&personalCenter/ms"
    "g_upload_avatar.proto\032&personalCenter/ms"
    "g_interest_word.proto\032#personalCenter/ms"
    "g_personInfo.proto\032 personalCenter/msg_c"
    "aptcha.proto2\260\017\n\025PersonalCenterService\022e"
    "\n\024CheckUserNameIsExist\022%.personal.CheckU"
    "serNameIsExistRequest\032&.personal.CheckUs"
    "erNameIsExistResponse\022\\\n\021CheckPhoneIsExi"
    "st\022\".personal.CheckPhoneIsExistRequest\032#"
    ".personal.CheckPhoneIsExistResponse\022U\n\014G"
    "etTradeList\022!.personal.UserGetTradeListR"
    "equest\032\".personal.UserGetTradeListRespon"
    "se\022O\n\nGetBalance\022\037.personal.UserGetBalen"
    "ceRequest\032 .personal.UserGetBalenceRespo"
    "nse\0228\n\005Login\022\026.personal.LoginRequest\032\027.p"
    "ersonal.LoginResponse\022A\n\010LoginOut\022\031.pers"
    "onal.LoginOutRequest\032\032.personal.LoginOut"
    "Response\022B\n\nquickLogin\022\033.personal.QuickL"
    "oginRequest\032\027.personal.LoginResponse\022L\n\017"
    "thirdPartyLogin\022 .personal.ThirdPartyLog"
    "inRequest\032\027.personal.LoginResponse\022S\n\016th"
    "irdPartyBind\022\037.personal.ThirdPartyBindRe"
    "quest\032 .personal.ThirdPartyBindResponse\022"
    ";\n\006Regist\022\027.personal.RegistRequest\032\030.per"
    "sonal.RegistResponse\022Y\n\022getPasswordByPho"
    "ne\022 .personal.PasswordByPhoneRequest\032!.p"
    "ersonal.PasswordByPhoneResponse\022S\n\016Passw"
    "ordVerify\022\037.personal.PasswordVerifyReque"
    "st\032 .personal.PasswordVerifyResponse\022S\n\016"
    "UpdatePassword\022\037.personal.PasswordUpdate"
    "Request\032 .personal.PasswordUpdateRespons"
    "e\022D\n\013GetMyWallet\022\031.personal.MyWalletRequ"
    "est\032\032.personal.MyWalletResponse\022V\n\017getPh"
    "oneCaptcha\022 .personal.GetPhoneCaptchaReq"
    "uest\032!.personal.GetPhoneCaptchaResponse\022"
    "\\\n\021checkPhoneCaptcha\022\".personal.CheckPho"
    "neCaptchaRequest\032#.personal.CheckPhoneCa"
    "ptchaResponse\022G\n\nUploadFile\022\033.personal.U"
    "ploadFileRequest\032\034.personal.UploadFileRe"
    "sponse\022M\n\014UploadAvatar\022\035.personal.Upload"
    "AvatarRequest\032\036.personal.UploadAvatarRes"
    "ponse\022Y\n\022GetInterestSubject\022 .personal.I"
    "nterestSubjectRequest\032!.personal.Interes"
    "tSubjectResponse\022@\n\013GetUserInfo\022\027.person"
    "al.MyInfoRequest\032\030.personal.MyInfoRespon"
    "se\022O\n\016UpdateUserInfo\022\035.personal.MyInfoUp"
    "dateRequest\032\036.personal.MyInfoUpdateRespo"
    "nse\022O\n\014GetRolesList\022\036.personal.UserRoles"
    "ListRequest\032\037.personal.UserRolesListResp"
    "onse\022b\n\025getEducationLevelList\022#.personal"
    ".EducationLevelListRequest\032$.personal.Ed"
    "ucationLevelListResponse\022M\n\016getSubjectLi"
    "st\022\034.personal.SubjectListRequest\032\035.perso"
    "nal.SubjectListResponseB\037\n\024com.wanfang.p"
    "ersonalP\001\242\002\004WFPRb\006proto3", 2384);
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedFile(
    "personalCenter/ser_personal_center.proto", &protobuf_RegisterTypes);
  ::personal::protobuf_AddDesc_personalCenter_2fmsg_5flogin_2eproto();
  ::personal::protobuf_AddDesc_personalCenter_2fmsg_5fregist_2eproto();
  ::personal::protobuf_AddDesc_personalCenter_2fmsg_5fpassword_2eproto();
  ::personal::protobuf_AddDesc_personalCenter_2fmsg_5fmy_5fwallet_2eproto();
  ::personal::protobuf_AddDesc_personalCenter_2fmsg_5fcommon_2eproto();
  ::personal::protobuf_AddDesc_personalCenter_2fmsg_5fupload_5favatar_2eproto();
  ::personal::protobuf_AddDesc_personalCenter_2fmsg_5finterest_5fword_2eproto();
  ::personal::protobuf_AddDesc_personalCenter_2fmsg_5fpersonInfo_2eproto();
  ::personal::protobuf_AddDesc_personalCenter_2fmsg_5fcaptcha_2eproto();
  ::google::protobuf::internal::OnShutdown(&protobuf_ShutdownFile_personalCenter_2fser_5fpersonal_5fcenter_2eproto);
}

GOOGLE_PROTOBUF_DECLARE_ONCE(protobuf_AddDesc_personalCenter_2fser_5fpersonal_5fcenter_2eproto_once_);
void protobuf_AddDesc_personalCenter_2fser_5fpersonal_5fcenter_2eproto() {
  ::google::protobuf::GoogleOnceInit(&protobuf_AddDesc_personalCenter_2fser_5fpersonal_5fcenter_2eproto_once_,
                 &protobuf_AddDesc_personalCenter_2fser_5fpersonal_5fcenter_2eproto_impl);
}
// Force AddDescriptors() to be called at static initialization time.
struct StaticDescriptorInitializer_personalCenter_2fser_5fpersonal_5fcenter_2eproto {
  StaticDescriptorInitializer_personalCenter_2fser_5fpersonal_5fcenter_2eproto() {
    protobuf_AddDesc_personalCenter_2fser_5fpersonal_5fcenter_2eproto();
  }
} static_descriptor_initializer_personalCenter_2fser_5fpersonal_5fcenter_2eproto_;

// @@protoc_insertion_point(namespace_scope)

}  // namespace personal

// @@protoc_insertion_point(global_scope)
