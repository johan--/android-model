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
    "g_personInfo.proto2\327\013\n\025PersonalCenterSer"
    "vice\0228\n\005Login\022\026.personal.LoginRequest\032\027."
    "personal.LoginResponse\022A\n\010LoginOut\022\031.per"
    "sonal.LoginOutRequest\032\032.personal.LoginOu"
    "tResponse\022B\n\nQuickLogin\022\033.personal.Quick"
    "LoginRequest\032\027.personal.LoginResponse\022N\n"
    "\020BindExistAccount\022!.personal.BindExistAc"
    "countRequest\032\027.personal.LoginResponse\022I\n"
    "\rBindNewRegist\022\036.personal.BindNewRegistR"
    "equest\032\030.personal.RegistResponse\022;\n\006Regi"
    "st\022\027.personal.RegistRequest\032\030.personal.R"
    "egistResponse\022Y\n\022GetPasswordByPhone\022 .pe"
    "rsonal.PasswordByPhoneRequest\032!.personal"
    ".PasswordByPhoneResponse\022S\n\016PasswordVeri"
    "fy\022\037.personal.PasswordVerifyRequest\032 .pe"
    "rsonal.PasswordVerifyResponse\022S\n\016UpdateP"
    "assword\022\037.personal.PasswordUpdateRequest"
    "\032 .personal.PasswordUpdateResponse\022D\n\013Ge"
    "tMyWallet\022\031.personal.MyWalletRequest\032\032.p"
    "ersonal.MyWalletResponse\022P\n\017GetPhoneCapt"
    "cha\022\035.personal.PhoneCaptchaRequest\032\036.per"
    "sonal.PhoneCaptchaResponse\022G\n\nUploadFile"
    "\022\033.personal.UploadFileRequest\032\034.personal"
    ".UploadFileResponse\022M\n\014UploadAvatar\022\035.pe"
    "rsonal.UploadAvatarRequest\032\036.personal.Up"
    "loadAvatarResponse\022Y\n\022GetInterestSubject"
    "\022 .personal.InterestSubjectRequest\032!.per"
    "sonal.InterestSubjectResponse\022@\n\013GetUser"
    "Info\022\027.personal.MyInfoRequest\032\030.personal"
    ".MyInfoResponse\022O\n\016UpdateUserInfo\022\035.pers"
    "onal.MyInfoUpdateRequest\032\036.personal.MyIn"
    "foUpdateResponse\022O\n\014GetRolesList\022\036.perso"
    "nal.UserRolesListRequest\032\037.personal.User"
    "RolesListResponse\022b\n\025getEducationLevelLi"
    "st\022#.personal.EducationLevelListRequest\032"
    "$.personal.EducationLevelListResponse\022M\n"
    "\016getSubjectList\022\034.personal.SubjectListRe"
    "quest\032\035.personal.SubjectListResponseB\037\n\024"
    "com.wanfang.personalP\001\242\002\004WFPRb\006proto3", 1877);
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
