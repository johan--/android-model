// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: personalCenter/msg_upload_avatar.proto

#ifndef PROTOBUF_personalCenter_2fmsg_5fupload_5favatar_2eproto__INCLUDED
#define PROTOBUF_personalCenter_2fmsg_5fupload_5favatar_2eproto__INCLUDED

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
#include <google/protobuf/unknown_field_set.h>
#include "grpcCommon/msg_error.pb.h"
// @@protoc_insertion_point(includes)

namespace personal {

// Internal implementation detail -- do not call these.
void protobuf_AddDesc_personalCenter_2fmsg_5fupload_5favatar_2eproto();
void protobuf_InitDefaults_personalCenter_2fmsg_5fupload_5favatar_2eproto();
void protobuf_AssignDesc_personalCenter_2fmsg_5fupload_5favatar_2eproto();
void protobuf_ShutdownFile_personalCenter_2fmsg_5fupload_5favatar_2eproto();

class UploadAvatarRequest;
class UploadAvatarResponse;

// ===================================================================

class UploadAvatarRequest : public ::google::protobuf::Message /* @@protoc_insertion_point(class_definition:personal.UploadAvatarRequest) */ {
 public:
  UploadAvatarRequest();
  virtual ~UploadAvatarRequest();

  UploadAvatarRequest(const UploadAvatarRequest& from);

  inline UploadAvatarRequest& operator=(const UploadAvatarRequest& from) {
    CopyFrom(from);
    return *this;
  }

  static const ::google::protobuf::Descriptor* descriptor();
  static const UploadAvatarRequest& default_instance();

  static const UploadAvatarRequest* internal_default_instance();

  void Swap(UploadAvatarRequest* other);

  // implements Message ----------------------------------------------

  inline UploadAvatarRequest* New() const { return New(NULL); }

  UploadAvatarRequest* New(::google::protobuf::Arena* arena) const;
  void CopyFrom(const ::google::protobuf::Message& from);
  void MergeFrom(const ::google::protobuf::Message& from);
  void CopyFrom(const UploadAvatarRequest& from);
  void MergeFrom(const UploadAvatarRequest& from);
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
  void InternalSwap(UploadAvatarRequest* other);
  void UnsafeMergeFrom(const UploadAvatarRequest& from);
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

  // optional string user_id = 1;
  void clear_user_id();
  static const int kUserIdFieldNumber = 1;
  const ::std::string& user_id() const;
  void set_user_id(const ::std::string& value);
  void set_user_id(const char* value);
  void set_user_id(const char* value, size_t size);
  ::std::string* mutable_user_id();
  ::std::string* release_user_id();
  void set_allocated_user_id(::std::string* user_id);

  // optional string avatar_url = 2;
  void clear_avatar_url();
  static const int kAvatarUrlFieldNumber = 2;
  const ::std::string& avatar_url() const;
  void set_avatar_url(const ::std::string& value);
  void set_avatar_url(const char* value);
  void set_avatar_url(const char* value, size_t size);
  ::std::string* mutable_avatar_url();
  ::std::string* release_avatar_url();
  void set_allocated_avatar_url(::std::string* avatar_url);

  // @@protoc_insertion_point(class_scope:personal.UploadAvatarRequest)
 private:

  ::google::protobuf::internal::InternalMetadataWithArena _internal_metadata_;
  ::google::protobuf::internal::ArenaStringPtr user_id_;
  ::google::protobuf::internal::ArenaStringPtr avatar_url_;
  mutable int _cached_size_;
  friend void  protobuf_InitDefaults_personalCenter_2fmsg_5fupload_5favatar_2eproto_impl();
  friend void  protobuf_AddDesc_personalCenter_2fmsg_5fupload_5favatar_2eproto_impl();
  friend void protobuf_AssignDesc_personalCenter_2fmsg_5fupload_5favatar_2eproto();
  friend void protobuf_ShutdownFile_personalCenter_2fmsg_5fupload_5favatar_2eproto();

  void InitAsDefaultInstance();
};
extern ::google::protobuf::internal::ExplicitlyConstructed<UploadAvatarRequest> UploadAvatarRequest_default_instance_;

// -------------------------------------------------------------------

class UploadAvatarResponse : public ::google::protobuf::Message /* @@protoc_insertion_point(class_definition:personal.UploadAvatarResponse) */ {
 public:
  UploadAvatarResponse();
  virtual ~UploadAvatarResponse();

  UploadAvatarResponse(const UploadAvatarResponse& from);

  inline UploadAvatarResponse& operator=(const UploadAvatarResponse& from) {
    CopyFrom(from);
    return *this;
  }

  static const ::google::protobuf::Descriptor* descriptor();
  static const UploadAvatarResponse& default_instance();

  static const UploadAvatarResponse* internal_default_instance();

  void Swap(UploadAvatarResponse* other);

  // implements Message ----------------------------------------------

  inline UploadAvatarResponse* New() const { return New(NULL); }

  UploadAvatarResponse* New(::google::protobuf::Arena* arena) const;
  void CopyFrom(const ::google::protobuf::Message& from);
  void MergeFrom(const ::google::protobuf::Message& from);
  void CopyFrom(const UploadAvatarResponse& from);
  void MergeFrom(const UploadAvatarResponse& from);
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
  void InternalSwap(UploadAvatarResponse* other);
  void UnsafeMergeFrom(const UploadAvatarResponse& from);
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

  // optional .grpcCommon.GrpcError error = 1;
  bool has_error() const;
  void clear_error();
  static const int kErrorFieldNumber = 1;
  const ::grpcCommon::GrpcError& error() const;
  ::grpcCommon::GrpcError* mutable_error();
  ::grpcCommon::GrpcError* release_error();
  void set_allocated_error(::grpcCommon::GrpcError* error);

  // @@protoc_insertion_point(class_scope:personal.UploadAvatarResponse)
 private:

  ::google::protobuf::internal::InternalMetadataWithArena _internal_metadata_;
  ::grpcCommon::GrpcError* error_;
  mutable int _cached_size_;
  friend void  protobuf_InitDefaults_personalCenter_2fmsg_5fupload_5favatar_2eproto_impl();
  friend void  protobuf_AddDesc_personalCenter_2fmsg_5fupload_5favatar_2eproto_impl();
  friend void protobuf_AssignDesc_personalCenter_2fmsg_5fupload_5favatar_2eproto();
  friend void protobuf_ShutdownFile_personalCenter_2fmsg_5fupload_5favatar_2eproto();

  void InitAsDefaultInstance();
};
extern ::google::protobuf::internal::ExplicitlyConstructed<UploadAvatarResponse> UploadAvatarResponse_default_instance_;

// ===================================================================


// ===================================================================

#if !PROTOBUF_INLINE_NOT_IN_HEADERS
// UploadAvatarRequest

// optional string user_id = 1;
inline void UploadAvatarRequest::clear_user_id() {
  user_id_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& UploadAvatarRequest::user_id() const {
  // @@protoc_insertion_point(field_get:personal.UploadAvatarRequest.user_id)
  return user_id_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void UploadAvatarRequest::set_user_id(const ::std::string& value) {
  
  user_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:personal.UploadAvatarRequest.user_id)
}
inline void UploadAvatarRequest::set_user_id(const char* value) {
  
  user_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:personal.UploadAvatarRequest.user_id)
}
inline void UploadAvatarRequest::set_user_id(const char* value, size_t size) {
  
  user_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:personal.UploadAvatarRequest.user_id)
}
inline ::std::string* UploadAvatarRequest::mutable_user_id() {
  
  // @@protoc_insertion_point(field_mutable:personal.UploadAvatarRequest.user_id)
  return user_id_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* UploadAvatarRequest::release_user_id() {
  // @@protoc_insertion_point(field_release:personal.UploadAvatarRequest.user_id)
  
  return user_id_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void UploadAvatarRequest::set_allocated_user_id(::std::string* user_id) {
  if (user_id != NULL) {
    
  } else {
    
  }
  user_id_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), user_id);
  // @@protoc_insertion_point(field_set_allocated:personal.UploadAvatarRequest.user_id)
}

// optional string avatar_url = 2;
inline void UploadAvatarRequest::clear_avatar_url() {
  avatar_url_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& UploadAvatarRequest::avatar_url() const {
  // @@protoc_insertion_point(field_get:personal.UploadAvatarRequest.avatar_url)
  return avatar_url_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void UploadAvatarRequest::set_avatar_url(const ::std::string& value) {
  
  avatar_url_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:personal.UploadAvatarRequest.avatar_url)
}
inline void UploadAvatarRequest::set_avatar_url(const char* value) {
  
  avatar_url_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:personal.UploadAvatarRequest.avatar_url)
}
inline void UploadAvatarRequest::set_avatar_url(const char* value, size_t size) {
  
  avatar_url_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:personal.UploadAvatarRequest.avatar_url)
}
inline ::std::string* UploadAvatarRequest::mutable_avatar_url() {
  
  // @@protoc_insertion_point(field_mutable:personal.UploadAvatarRequest.avatar_url)
  return avatar_url_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* UploadAvatarRequest::release_avatar_url() {
  // @@protoc_insertion_point(field_release:personal.UploadAvatarRequest.avatar_url)
  
  return avatar_url_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void UploadAvatarRequest::set_allocated_avatar_url(::std::string* avatar_url) {
  if (avatar_url != NULL) {
    
  } else {
    
  }
  avatar_url_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), avatar_url);
  // @@protoc_insertion_point(field_set_allocated:personal.UploadAvatarRequest.avatar_url)
}

inline const UploadAvatarRequest* UploadAvatarRequest::internal_default_instance() {
  return &UploadAvatarRequest_default_instance_.get();
}
// -------------------------------------------------------------------

// UploadAvatarResponse

// optional .grpcCommon.GrpcError error = 1;
inline bool UploadAvatarResponse::has_error() const {
  return this != internal_default_instance() && error_ != NULL;
}
inline void UploadAvatarResponse::clear_error() {
  if (GetArenaNoVirtual() == NULL && error_ != NULL) delete error_;
  error_ = NULL;
}
inline const ::grpcCommon::GrpcError& UploadAvatarResponse::error() const {
  // @@protoc_insertion_point(field_get:personal.UploadAvatarResponse.error)
  return error_ != NULL ? *error_
                         : *::grpcCommon::GrpcError::internal_default_instance();
}
inline ::grpcCommon::GrpcError* UploadAvatarResponse::mutable_error() {
  
  if (error_ == NULL) {
    error_ = new ::grpcCommon::GrpcError;
  }
  // @@protoc_insertion_point(field_mutable:personal.UploadAvatarResponse.error)
  return error_;
}
inline ::grpcCommon::GrpcError* UploadAvatarResponse::release_error() {
  // @@protoc_insertion_point(field_release:personal.UploadAvatarResponse.error)
  
  ::grpcCommon::GrpcError* temp = error_;
  error_ = NULL;
  return temp;
}
inline void UploadAvatarResponse::set_allocated_error(::grpcCommon::GrpcError* error) {
  delete error_;
  error_ = error;
  if (error) {
    
  } else {
    
  }
  // @@protoc_insertion_point(field_set_allocated:personal.UploadAvatarResponse.error)
}

inline const UploadAvatarResponse* UploadAvatarResponse::internal_default_instance() {
  return &UploadAvatarResponse_default_instance_.get();
}
#endif  // !PROTOBUF_INLINE_NOT_IN_HEADERS
// -------------------------------------------------------------------


// @@protoc_insertion_point(namespace_scope)

}  // namespace personal

// @@protoc_insertion_point(global_scope)

#endif  // PROTOBUF_personalCenter_2fmsg_5fupload_5favatar_2eproto__INCLUDED
