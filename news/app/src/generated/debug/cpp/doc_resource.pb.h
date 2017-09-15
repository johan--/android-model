// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: doc_resource.proto

#ifndef PROTOBUF_doc_5fresource_2eproto__INCLUDED
#define PROTOBUF_doc_5fresource_2eproto__INCLUDED

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
// @@protoc_insertion_point(includes)

namespace main {

// Internal implementation detail -- do not call these.
void protobuf_AddDesc_doc_5fresource_2eproto();
void protobuf_InitDefaults_doc_5fresource_2eproto();
void protobuf_AssignDesc_doc_5fresource_2eproto();
void protobuf_ShutdownFile_doc_5fresource_2eproto();

class DocResourceReply;
class DocResourceRequest;

// ===================================================================

class DocResourceRequest : public ::google::protobuf::Message /* @@protoc_insertion_point(class_definition:main.DocResourceRequest) */ {
 public:
  DocResourceRequest();
  virtual ~DocResourceRequest();

  DocResourceRequest(const DocResourceRequest& from);

  inline DocResourceRequest& operator=(const DocResourceRequest& from) {
    CopyFrom(from);
    return *this;
  }

  static const ::google::protobuf::Descriptor* descriptor();
  static const DocResourceRequest& default_instance();

  static const DocResourceRequest* internal_default_instance();

  void Swap(DocResourceRequest* other);

  // implements Message ----------------------------------------------

  inline DocResourceRequest* New() const { return New(NULL); }

  DocResourceRequest* New(::google::protobuf::Arena* arena) const;
  void CopyFrom(const ::google::protobuf::Message& from);
  void MergeFrom(const ::google::protobuf::Message& from);
  void CopyFrom(const DocResourceRequest& from);
  void MergeFrom(const DocResourceRequest& from);
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
  void InternalSwap(DocResourceRequest* other);
  void UnsafeMergeFrom(const DocResourceRequest& from);
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

  // optional string doc_id = 1;
  void clear_doc_id();
  static const int kDocIdFieldNumber = 1;
  const ::std::string& doc_id() const;
  void set_doc_id(const ::std::string& value);
  void set_doc_id(const char* value);
  void set_doc_id(const char* value, size_t size);
  ::std::string* mutable_doc_id();
  ::std::string* release_doc_id();
  void set_allocated_doc_id(::std::string* doc_id);

  // optional string user_id = 2;
  void clear_user_id();
  static const int kUserIdFieldNumber = 2;
  const ::std::string& user_id() const;
  void set_user_id(const ::std::string& value);
  void set_user_id(const char* value);
  void set_user_id(const char* value, size_t size);
  ::std::string* mutable_user_id();
  ::std::string* release_user_id();
  void set_allocated_user_id(::std::string* user_id);

  // @@protoc_insertion_point(class_scope:main.DocResourceRequest)
 private:

  ::google::protobuf::internal::InternalMetadataWithArena _internal_metadata_;
  ::google::protobuf::internal::ArenaStringPtr doc_id_;
  ::google::protobuf::internal::ArenaStringPtr user_id_;
  mutable int _cached_size_;
  friend void  protobuf_InitDefaults_doc_5fresource_2eproto_impl();
  friend void  protobuf_AddDesc_doc_5fresource_2eproto_impl();
  friend void protobuf_AssignDesc_doc_5fresource_2eproto();
  friend void protobuf_ShutdownFile_doc_5fresource_2eproto();

  void InitAsDefaultInstance();
};
extern ::google::protobuf::internal::ExplicitlyConstructed<DocResourceRequest> DocResourceRequest_default_instance_;

// -------------------------------------------------------------------

class DocResourceReply : public ::google::protobuf::Message /* @@protoc_insertion_point(class_definition:main.DocResourceReply) */ {
 public:
  DocResourceReply();
  virtual ~DocResourceReply();

  DocResourceReply(const DocResourceReply& from);

  inline DocResourceReply& operator=(const DocResourceReply& from) {
    CopyFrom(from);
    return *this;
  }

  static const ::google::protobuf::Descriptor* descriptor();
  static const DocResourceReply& default_instance();

  static const DocResourceReply* internal_default_instance();

  void Swap(DocResourceReply* other);

  // implements Message ----------------------------------------------

  inline DocResourceReply* New() const { return New(NULL); }

  DocResourceReply* New(::google::protobuf::Arena* arena) const;
  void CopyFrom(const ::google::protobuf::Message& from);
  void MergeFrom(const ::google::protobuf::Message& from);
  void CopyFrom(const DocResourceReply& from);
  void MergeFrom(const DocResourceReply& from);
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
  void InternalSwap(DocResourceReply* other);
  void UnsafeMergeFrom(const DocResourceReply& from);
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

  // optional string resource_url = 1;
  void clear_resource_url();
  static const int kResourceUrlFieldNumber = 1;
  const ::std::string& resource_url() const;
  void set_resource_url(const ::std::string& value);
  void set_resource_url(const char* value);
  void set_resource_url(const char* value, size_t size);
  ::std::string* mutable_resource_url();
  ::std::string* release_resource_url();
  void set_allocated_resource_url(::std::string* resource_url);

  // @@protoc_insertion_point(class_scope:main.DocResourceReply)
 private:

  ::google::protobuf::internal::InternalMetadataWithArena _internal_metadata_;
  ::google::protobuf::internal::ArenaStringPtr resource_url_;
  mutable int _cached_size_;
  friend void  protobuf_InitDefaults_doc_5fresource_2eproto_impl();
  friend void  protobuf_AddDesc_doc_5fresource_2eproto_impl();
  friend void protobuf_AssignDesc_doc_5fresource_2eproto();
  friend void protobuf_ShutdownFile_doc_5fresource_2eproto();

  void InitAsDefaultInstance();
};
extern ::google::protobuf::internal::ExplicitlyConstructed<DocResourceReply> DocResourceReply_default_instance_;

// ===================================================================


// ===================================================================

#if !PROTOBUF_INLINE_NOT_IN_HEADERS
// DocResourceRequest

// optional string doc_id = 1;
inline void DocResourceRequest::clear_doc_id() {
  doc_id_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& DocResourceRequest::doc_id() const {
  // @@protoc_insertion_point(field_get:main.DocResourceRequest.doc_id)
  return doc_id_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void DocResourceRequest::set_doc_id(const ::std::string& value) {
  
  doc_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:main.DocResourceRequest.doc_id)
}
inline void DocResourceRequest::set_doc_id(const char* value) {
  
  doc_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:main.DocResourceRequest.doc_id)
}
inline void DocResourceRequest::set_doc_id(const char* value, size_t size) {
  
  doc_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:main.DocResourceRequest.doc_id)
}
inline ::std::string* DocResourceRequest::mutable_doc_id() {
  
  // @@protoc_insertion_point(field_mutable:main.DocResourceRequest.doc_id)
  return doc_id_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* DocResourceRequest::release_doc_id() {
  // @@protoc_insertion_point(field_release:main.DocResourceRequest.doc_id)
  
  return doc_id_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void DocResourceRequest::set_allocated_doc_id(::std::string* doc_id) {
  if (doc_id != NULL) {
    
  } else {
    
  }
  doc_id_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), doc_id);
  // @@protoc_insertion_point(field_set_allocated:main.DocResourceRequest.doc_id)
}

// optional string user_id = 2;
inline void DocResourceRequest::clear_user_id() {
  user_id_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& DocResourceRequest::user_id() const {
  // @@protoc_insertion_point(field_get:main.DocResourceRequest.user_id)
  return user_id_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void DocResourceRequest::set_user_id(const ::std::string& value) {
  
  user_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:main.DocResourceRequest.user_id)
}
inline void DocResourceRequest::set_user_id(const char* value) {
  
  user_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:main.DocResourceRequest.user_id)
}
inline void DocResourceRequest::set_user_id(const char* value, size_t size) {
  
  user_id_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:main.DocResourceRequest.user_id)
}
inline ::std::string* DocResourceRequest::mutable_user_id() {
  
  // @@protoc_insertion_point(field_mutable:main.DocResourceRequest.user_id)
  return user_id_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* DocResourceRequest::release_user_id() {
  // @@protoc_insertion_point(field_release:main.DocResourceRequest.user_id)
  
  return user_id_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void DocResourceRequest::set_allocated_user_id(::std::string* user_id) {
  if (user_id != NULL) {
    
  } else {
    
  }
  user_id_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), user_id);
  // @@protoc_insertion_point(field_set_allocated:main.DocResourceRequest.user_id)
}

inline const DocResourceRequest* DocResourceRequest::internal_default_instance() {
  return &DocResourceRequest_default_instance_.get();
}
// -------------------------------------------------------------------

// DocResourceReply

// optional string resource_url = 1;
inline void DocResourceReply::clear_resource_url() {
  resource_url_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& DocResourceReply::resource_url() const {
  // @@protoc_insertion_point(field_get:main.DocResourceReply.resource_url)
  return resource_url_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void DocResourceReply::set_resource_url(const ::std::string& value) {
  
  resource_url_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:main.DocResourceReply.resource_url)
}
inline void DocResourceReply::set_resource_url(const char* value) {
  
  resource_url_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:main.DocResourceReply.resource_url)
}
inline void DocResourceReply::set_resource_url(const char* value, size_t size) {
  
  resource_url_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:main.DocResourceReply.resource_url)
}
inline ::std::string* DocResourceReply::mutable_resource_url() {
  
  // @@protoc_insertion_point(field_mutable:main.DocResourceReply.resource_url)
  return resource_url_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* DocResourceReply::release_resource_url() {
  // @@protoc_insertion_point(field_release:main.DocResourceReply.resource_url)
  
  return resource_url_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void DocResourceReply::set_allocated_resource_url(::std::string* resource_url) {
  if (resource_url != NULL) {
    
  } else {
    
  }
  resource_url_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), resource_url);
  // @@protoc_insertion_point(field_set_allocated:main.DocResourceReply.resource_url)
}

inline const DocResourceReply* DocResourceReply::internal_default_instance() {
  return &DocResourceReply_default_instance_.get();
}
#endif  // !PROTOBUF_INLINE_NOT_IN_HEADERS
// -------------------------------------------------------------------


// @@protoc_insertion_point(namespace_scope)

}  // namespace main

// @@protoc_insertion_point(global_scope)

#endif  // PROTOBUF_doc_5fresource_2eproto__INCLUDED
