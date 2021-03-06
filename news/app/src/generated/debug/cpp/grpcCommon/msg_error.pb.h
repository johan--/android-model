// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpcCommon/msg_error.proto

#ifndef PROTOBUF_grpcCommon_2fmsg_5ferror_2eproto__INCLUDED
#define PROTOBUF_grpcCommon_2fmsg_5ferror_2eproto__INCLUDED

#include <string>

#include <google/protobuf/stubs/common.h>

#if GOOGLE_PROTOBUF_VERSION < 3001000
#error This file was generated by a newer version of protoc which is
#error incompatible with your Protocol Buffer headers.  Please update
#error your headers.
#endif
#if 3001000 < GOOGLE_PROTOBUF_MIN_PROTOC_VERSION
#error This file was generated by an older version of protoc which is
#error incompatible with your Protocol Buffer headers.  Please
#error regenerate this file with a newer version of protoc.
#endif

#include <google/protobuf/arena.h>
#include <google/protobuf/arenastring.h>
#include <google/protobuf/generated_message_util.h>
#include <google/protobuf/metadata.h>
#include <google/protobuf/message.h>
#include <google/protobuf/repeated_field.h>
#include <google/protobuf/extension_set.h>
#include <google/protobuf/generated_enum_reflection.h>
#include <google/protobuf/unknown_field_set.h>
// @@protoc_insertion_point(includes)

namespace grpcCommon {

// Internal implementation detail -- do not call these.
void protobuf_AddDesc_grpcCommon_2fmsg_5ferror_2eproto();
void protobuf_InitDefaults_grpcCommon_2fmsg_5ferror_2eproto();
void protobuf_AssignDesc_grpcCommon_2fmsg_5ferror_2eproto();
void protobuf_ShutdownFile_grpcCommon_2fmsg_5ferror_2eproto();

class ErrorMessage;
class GrpcError;

enum ErrorCode {
  PASS_ERROR = 0,
  NO_REGIST = 1,
  USER_EXIST = 2,
  NEED_FIELD = 3,
  UNKNOWN_FILELD_TYPE = 4,
  RESULT_NULL = 5,
  COMMON_ERROR = 6,
  USER_IS_LOGIN = 7,
  IAP_PRICE_ERROR = 8,
  IAP_CREATEORDER_ERROR = 9,
  THIRD_PARTY_NOT_BINd = 10,
  TRADE_VALIDATE_FAIL = 11,
  PHONE_CAPTCHA_ERROR = 12,
  PHONE_NOT_REGISTER = 13,
  USER_IS_FREEZE = 14,
  GRUSER_MORE = 15,
  ALREADY_COLLECTED = 16,
  PHONE_IS_REGISTER = 17,
  EMAIL_IS_BIND = 18,
  ErrorCode_INT_MIN_SENTINEL_DO_NOT_USE_ = ::google::protobuf::kint32min,
  ErrorCode_INT_MAX_SENTINEL_DO_NOT_USE_ = ::google::protobuf::kint32max
};
bool ErrorCode_IsValid(int value);
const ErrorCode ErrorCode_MIN = PASS_ERROR;
const ErrorCode ErrorCode_MAX = EMAIL_IS_BIND;
const int ErrorCode_ARRAYSIZE = ErrorCode_MAX + 1;

const ::google::protobuf::EnumDescriptor* ErrorCode_descriptor();
inline const ::std::string& ErrorCode_Name(ErrorCode value) {
  return ::google::protobuf::internal::NameOfEnum(
    ErrorCode_descriptor(), value);
}
inline bool ErrorCode_Parse(
    const ::std::string& name, ErrorCode* value) {
  return ::google::protobuf::internal::ParseNamedEnum<ErrorCode>(
    ErrorCode_descriptor(), name, value);
}
// ===================================================================

class GrpcError : public ::google::protobuf::Message /* @@protoc_insertion_point(class_definition:grpcCommon.GrpcError) */ {
 public:
  GrpcError();
  virtual ~GrpcError();

  GrpcError(const GrpcError& from);

  inline GrpcError& operator=(const GrpcError& from) {
    CopyFrom(from);
    return *this;
  }

  static const ::google::protobuf::Descriptor* descriptor();
  static const GrpcError& default_instance();

  static const GrpcError* internal_default_instance();

  void Swap(GrpcError* other);

  // implements Message ----------------------------------------------

  inline GrpcError* New() const { return New(NULL); }

  GrpcError* New(::google::protobuf::Arena* arena) const;
  void CopyFrom(const ::google::protobuf::Message& from);
  void MergeFrom(const ::google::protobuf::Message& from);
  void CopyFrom(const GrpcError& from);
  void MergeFrom(const GrpcError& from);
  void Clear();
  bool IsInitialized() const;

  size_t ByteSizeLong() const;
  bool MergePartialFromCodedStream(
      ::google::protobuf::io::CodedInputStream* input);
  void SerializeWithCachedSizes(
      ::google::protobuf::io::CodedOutputStream* output) const;
  ::google::protobuf::uint8* InternalSerializeWithCachedSizesToArray(
      bool deterministic, ::google::protobuf::uint8* output) const;
  ::google::protobuf::uint8* SerializeWithCachedSizesToArray(::google::protobuf::uint8* output) const {
    return InternalSerializeWithCachedSizesToArray(false, output);
  }
  int GetCachedSize() const { return _cached_size_; }
  private:
  void SharedCtor();
  void SharedDtor();
  void SetCachedSize(int size) const;
  void InternalSwap(GrpcError* other);
  void UnsafeMergeFrom(const GrpcError& from);
  private:
  inline ::google::protobuf::Arena* GetArenaNoVirtual() const {
    return _internal_metadata_.arena();
  }
  inline void* MaybeArenaPtr() const {
    return _internal_metadata_.raw_arena_ptr();
  }
  public:

  ::google::protobuf::Metadata GetMetadata() const;

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // optional .grpcCommon.ErrorMessage error_message = 1;
  bool has_error_message() const;
  void clear_error_message();
  static const int kErrorMessageFieldNumber = 1;
  const ::grpcCommon::ErrorMessage& error_message() const;
  ::grpcCommon::ErrorMessage* mutable_error_message();
  ::grpcCommon::ErrorMessage* release_error_message();
  void set_allocated_error_message(::grpcCommon::ErrorMessage* error_message);

  // @@protoc_insertion_point(class_scope:grpcCommon.GrpcError)
 private:

  ::google::protobuf::internal::InternalMetadataWithArena _internal_metadata_;
  ::grpcCommon::ErrorMessage* error_message_;
  mutable int _cached_size_;
  friend void  protobuf_InitDefaults_grpcCommon_2fmsg_5ferror_2eproto_impl();
  friend void  protobuf_AddDesc_grpcCommon_2fmsg_5ferror_2eproto_impl();
  friend void protobuf_AssignDesc_grpcCommon_2fmsg_5ferror_2eproto();
  friend void protobuf_ShutdownFile_grpcCommon_2fmsg_5ferror_2eproto();

  void InitAsDefaultInstance();
};
extern ::google::protobuf::internal::ExplicitlyConstructed<GrpcError> GrpcError_default_instance_;

// -------------------------------------------------------------------

class ErrorMessage : public ::google::protobuf::Message /* @@protoc_insertion_point(class_definition:grpcCommon.ErrorMessage) */ {
 public:
  ErrorMessage();
  virtual ~ErrorMessage();

  ErrorMessage(const ErrorMessage& from);

  inline ErrorMessage& operator=(const ErrorMessage& from) {
    CopyFrom(from);
    return *this;
  }

  static const ::google::protobuf::Descriptor* descriptor();
  static const ErrorMessage& default_instance();

  static const ErrorMessage* internal_default_instance();

  void Swap(ErrorMessage* other);

  // implements Message ----------------------------------------------

  inline ErrorMessage* New() const { return New(NULL); }

  ErrorMessage* New(::google::protobuf::Arena* arena) const;
  void CopyFrom(const ::google::protobuf::Message& from);
  void MergeFrom(const ::google::protobuf::Message& from);
  void CopyFrom(const ErrorMessage& from);
  void MergeFrom(const ErrorMessage& from);
  void Clear();
  bool IsInitialized() const;

  size_t ByteSizeLong() const;
  bool MergePartialFromCodedStream(
      ::google::protobuf::io::CodedInputStream* input);
  void SerializeWithCachedSizes(
      ::google::protobuf::io::CodedOutputStream* output) const;
  ::google::protobuf::uint8* InternalSerializeWithCachedSizesToArray(
      bool deterministic, ::google::protobuf::uint8* output) const;
  ::google::protobuf::uint8* SerializeWithCachedSizesToArray(::google::protobuf::uint8* output) const {
    return InternalSerializeWithCachedSizesToArray(false, output);
  }
  int GetCachedSize() const { return _cached_size_; }
  private:
  void SharedCtor();
  void SharedDtor();
  void SetCachedSize(int size) const;
  void InternalSwap(ErrorMessage* other);
  void UnsafeMergeFrom(const ErrorMessage& from);
  private:
  inline ::google::protobuf::Arena* GetArenaNoVirtual() const {
    return _internal_metadata_.arena();
  }
  inline void* MaybeArenaPtr() const {
    return _internal_metadata_.raw_arena_ptr();
  }
  public:

  ::google::protobuf::Metadata GetMetadata() const;

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // optional .grpcCommon.ErrorCode error_code = 1;
  void clear_error_code();
  static const int kErrorCodeFieldNumber = 1;
  ::grpcCommon::ErrorCode error_code() const;
  void set_error_code(::grpcCommon::ErrorCode value);

  // optional string error_reason = 2;
  void clear_error_reason();
  static const int kErrorReasonFieldNumber = 2;
  const ::std::string& error_reason() const;
  void set_error_reason(const ::std::string& value);
  void set_error_reason(const char* value);
  void set_error_reason(const char* value, size_t size);
  ::std::string* mutable_error_reason();
  ::std::string* release_error_reason();
  void set_allocated_error_reason(::std::string* error_reason);

  // optional string error_description = 3;
  void clear_error_description();
  static const int kErrorDescriptionFieldNumber = 3;
  const ::std::string& error_description() const;
  void set_error_description(const ::std::string& value);
  void set_error_description(const char* value);
  void set_error_description(const char* value, size_t size);
  ::std::string* mutable_error_description();
  ::std::string* release_error_description();
  void set_allocated_error_description(::std::string* error_description);

  // @@protoc_insertion_point(class_scope:grpcCommon.ErrorMessage)
 private:

  ::google::protobuf::internal::InternalMetadataWithArena _internal_metadata_;
  ::google::protobuf::internal::ArenaStringPtr error_reason_;
  ::google::protobuf::internal::ArenaStringPtr error_description_;
  int error_code_;
  mutable int _cached_size_;
  friend void  protobuf_InitDefaults_grpcCommon_2fmsg_5ferror_2eproto_impl();
  friend void  protobuf_AddDesc_grpcCommon_2fmsg_5ferror_2eproto_impl();
  friend void protobuf_AssignDesc_grpcCommon_2fmsg_5ferror_2eproto();
  friend void protobuf_ShutdownFile_grpcCommon_2fmsg_5ferror_2eproto();

  void InitAsDefaultInstance();
};
extern ::google::protobuf::internal::ExplicitlyConstructed<ErrorMessage> ErrorMessage_default_instance_;

// ===================================================================


// ===================================================================

#if !PROTOBUF_INLINE_NOT_IN_HEADERS
// GrpcError

// optional .grpcCommon.ErrorMessage error_message = 1;
inline bool GrpcError::has_error_message() const {
  return this != internal_default_instance() && error_message_ != NULL;
}
inline void GrpcError::clear_error_message() {
  if (GetArenaNoVirtual() == NULL && error_message_ != NULL) delete error_message_;
  error_message_ = NULL;
}
inline const ::grpcCommon::ErrorMessage& GrpcError::error_message() const {
  // @@protoc_insertion_point(field_get:grpcCommon.GrpcError.error_message)
  return error_message_ != NULL ? *error_message_
                         : *::grpcCommon::ErrorMessage::internal_default_instance();
}
inline ::grpcCommon::ErrorMessage* GrpcError::mutable_error_message() {
  
  if (error_message_ == NULL) {
    error_message_ = new ::grpcCommon::ErrorMessage;
  }
  // @@protoc_insertion_point(field_mutable:grpcCommon.GrpcError.error_message)
  return error_message_;
}
inline ::grpcCommon::ErrorMessage* GrpcError::release_error_message() {
  // @@protoc_insertion_point(field_release:grpcCommon.GrpcError.error_message)
  
  ::grpcCommon::ErrorMessage* temp = error_message_;
  error_message_ = NULL;
  return temp;
}
inline void GrpcError::set_allocated_error_message(::grpcCommon::ErrorMessage* error_message) {
  delete error_message_;
  error_message_ = error_message;
  if (error_message) {
    
  } else {
    
  }
  // @@protoc_insertion_point(field_set_allocated:grpcCommon.GrpcError.error_message)
}

inline const GrpcError* GrpcError::internal_default_instance() {
  return &GrpcError_default_instance_.get();
}
// -------------------------------------------------------------------

// ErrorMessage

// optional .grpcCommon.ErrorCode error_code = 1;
inline void ErrorMessage::clear_error_code() {
  error_code_ = 0;
}
inline ::grpcCommon::ErrorCode ErrorMessage::error_code() const {
  // @@protoc_insertion_point(field_get:grpcCommon.ErrorMessage.error_code)
  return static_cast< ::grpcCommon::ErrorCode >(error_code_);
}
inline void ErrorMessage::set_error_code(::grpcCommon::ErrorCode value) {
  
  error_code_ = value;
  // @@protoc_insertion_point(field_set:grpcCommon.ErrorMessage.error_code)
}

// optional string error_reason = 2;
inline void ErrorMessage::clear_error_reason() {
  error_reason_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& ErrorMessage::error_reason() const {
  // @@protoc_insertion_point(field_get:grpcCommon.ErrorMessage.error_reason)
  return error_reason_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void ErrorMessage::set_error_reason(const ::std::string& value) {
  
  error_reason_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:grpcCommon.ErrorMessage.error_reason)
}
inline void ErrorMessage::set_error_reason(const char* value) {
  
  error_reason_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:grpcCommon.ErrorMessage.error_reason)
}
inline void ErrorMessage::set_error_reason(const char* value, size_t size) {
  
  error_reason_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:grpcCommon.ErrorMessage.error_reason)
}
inline ::std::string* ErrorMessage::mutable_error_reason() {
  
  // @@protoc_insertion_point(field_mutable:grpcCommon.ErrorMessage.error_reason)
  return error_reason_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* ErrorMessage::release_error_reason() {
  // @@protoc_insertion_point(field_release:grpcCommon.ErrorMessage.error_reason)
  
  return error_reason_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void ErrorMessage::set_allocated_error_reason(::std::string* error_reason) {
  if (error_reason != NULL) {
    
  } else {
    
  }
  error_reason_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), error_reason);
  // @@protoc_insertion_point(field_set_allocated:grpcCommon.ErrorMessage.error_reason)
}

// optional string error_description = 3;
inline void ErrorMessage::clear_error_description() {
  error_description_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& ErrorMessage::error_description() const {
  // @@protoc_insertion_point(field_get:grpcCommon.ErrorMessage.error_description)
  return error_description_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void ErrorMessage::set_error_description(const ::std::string& value) {
  
  error_description_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:grpcCommon.ErrorMessage.error_description)
}
inline void ErrorMessage::set_error_description(const char* value) {
  
  error_description_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:grpcCommon.ErrorMessage.error_description)
}
inline void ErrorMessage::set_error_description(const char* value, size_t size) {
  
  error_description_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:grpcCommon.ErrorMessage.error_description)
}
inline ::std::string* ErrorMessage::mutable_error_description() {
  
  // @@protoc_insertion_point(field_mutable:grpcCommon.ErrorMessage.error_description)
  return error_description_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* ErrorMessage::release_error_description() {
  // @@protoc_insertion_point(field_release:grpcCommon.ErrorMessage.error_description)
  
  return error_description_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void ErrorMessage::set_allocated_error_description(::std::string* error_description) {
  if (error_description != NULL) {
    
  } else {
    
  }
  error_description_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), error_description);
  // @@protoc_insertion_point(field_set_allocated:grpcCommon.ErrorMessage.error_description)
}

inline const ErrorMessage* ErrorMessage::internal_default_instance() {
  return &ErrorMessage_default_instance_.get();
}
#endif  // !PROTOBUF_INLINE_NOT_IN_HEADERS
// -------------------------------------------------------------------


// @@protoc_insertion_point(namespace_scope)

}  // namespace grpcCommon

#ifndef SWIG
namespace google {
namespace protobuf {

template <> struct is_proto_enum< ::grpcCommon::ErrorCode> : ::google::protobuf::internal::true_type {};
template <>
inline const EnumDescriptor* GetEnumDescriptor< ::grpcCommon::ErrorCode>() {
  return ::grpcCommon::ErrorCode_descriptor();
}

}  // namespace protobuf
}  // namespace google
#endif  // SWIG

// @@protoc_insertion_point(global_scope)

#endif  // PROTOBUF_grpcCommon_2fmsg_5ferror_2eproto__INCLUDED
