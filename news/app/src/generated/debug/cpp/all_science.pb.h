// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all_science.proto

#ifndef PROTOBUF_all_5fscience_2eproto__INCLUDED
#define PROTOBUF_all_5fscience_2eproto__INCLUDED

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
void protobuf_AddDesc_all_5fscience_2eproto();
void protobuf_InitDefaults_all_5fscience_2eproto();
void protobuf_AssignDesc_all_5fscience_2eproto();
void protobuf_ShutdownFile_all_5fscience_2eproto();

class AllScienceReply;
class AllScienceRequest;
class Science;

// ===================================================================

class AllScienceRequest : public ::google::protobuf::Message /* @@protoc_insertion_point(class_definition:main.AllScienceRequest) */ {
 public:
  AllScienceRequest();
  virtual ~AllScienceRequest();

  AllScienceRequest(const AllScienceRequest& from);

  inline AllScienceRequest& operator=(const AllScienceRequest& from) {
    CopyFrom(from);
    return *this;
  }

  static const ::google::protobuf::Descriptor* descriptor();
  static const AllScienceRequest& default_instance();

  static const AllScienceRequest* internal_default_instance();

  void Swap(AllScienceRequest* other);

  // implements Message ----------------------------------------------

  inline AllScienceRequest* New() const { return New(NULL); }

  AllScienceRequest* New(::google::protobuf::Arena* arena) const;
  void CopyFrom(const ::google::protobuf::Message& from);
  void MergeFrom(const ::google::protobuf::Message& from);
  void CopyFrom(const AllScienceRequest& from);
  void MergeFrom(const AllScienceRequest& from);
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
  void InternalSwap(AllScienceRequest* other);
  void UnsafeMergeFrom(const AllScienceRequest& from);
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

  // optional string page_number = 1;
  void clear_page_number();
  static const int kPageNumberFieldNumber = 1;
  const ::std::string& page_number() const;
  void set_page_number(const ::std::string& value);
  void set_page_number(const char* value);
  void set_page_number(const char* value, size_t size);
  ::std::string* mutable_page_number();
  ::std::string* release_page_number();
  void set_allocated_page_number(::std::string* page_number);

  // optional string page_size = 2;
  void clear_page_size();
  static const int kPageSizeFieldNumber = 2;
  const ::std::string& page_size() const;
  void set_page_size(const ::std::string& value);
  void set_page_size(const char* value);
  void set_page_size(const char* value, size_t size);
  ::std::string* mutable_page_size();
  ::std::string* release_page_size();
  void set_allocated_page_size(::std::string* page_size);

  // @@protoc_insertion_point(class_scope:main.AllScienceRequest)
 private:

  ::google::protobuf::internal::InternalMetadataWithArena _internal_metadata_;
  ::google::protobuf::internal::ArenaStringPtr page_number_;
  ::google::protobuf::internal::ArenaStringPtr page_size_;
  mutable int _cached_size_;
  friend void  protobuf_InitDefaults_all_5fscience_2eproto_impl();
  friend void  protobuf_AddDesc_all_5fscience_2eproto_impl();
  friend void protobuf_AssignDesc_all_5fscience_2eproto();
  friend void protobuf_ShutdownFile_all_5fscience_2eproto();

  void InitAsDefaultInstance();
};
extern ::google::protobuf::internal::ExplicitlyConstructed<AllScienceRequest> AllScienceRequest_default_instance_;

// -------------------------------------------------------------------

class AllScienceReply : public ::google::protobuf::Message /* @@protoc_insertion_point(class_definition:main.AllScienceReply) */ {
 public:
  AllScienceReply();
  virtual ~AllScienceReply();

  AllScienceReply(const AllScienceReply& from);

  inline AllScienceReply& operator=(const AllScienceReply& from) {
    CopyFrom(from);
    return *this;
  }

  static const ::google::protobuf::Descriptor* descriptor();
  static const AllScienceReply& default_instance();

  static const AllScienceReply* internal_default_instance();

  void Swap(AllScienceReply* other);

  // implements Message ----------------------------------------------

  inline AllScienceReply* New() const { return New(NULL); }

  AllScienceReply* New(::google::protobuf::Arena* arena) const;
  void CopyFrom(const ::google::protobuf::Message& from);
  void MergeFrom(const ::google::protobuf::Message& from);
  void CopyFrom(const AllScienceReply& from);
  void MergeFrom(const AllScienceReply& from);
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
  void InternalSwap(AllScienceReply* other);
  void UnsafeMergeFrom(const AllScienceReply& from);
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

  // repeated .main.Science science = 1;
  int science_size() const;
  void clear_science();
  static const int kScienceFieldNumber = 1;
  const ::main::Science& science(int index) const;
  ::main::Science* mutable_science(int index);
  ::main::Science* add_science();
  ::google::protobuf::RepeatedPtrField< ::main::Science >*
      mutable_science();
  const ::google::protobuf::RepeatedPtrField< ::main::Science >&
      science() const;

  // @@protoc_insertion_point(class_scope:main.AllScienceReply)
 private:

  ::google::protobuf::internal::InternalMetadataWithArena _internal_metadata_;
  ::google::protobuf::RepeatedPtrField< ::main::Science > science_;
  mutable int _cached_size_;
  friend void  protobuf_InitDefaults_all_5fscience_2eproto_impl();
  friend void  protobuf_AddDesc_all_5fscience_2eproto_impl();
  friend void protobuf_AssignDesc_all_5fscience_2eproto();
  friend void protobuf_ShutdownFile_all_5fscience_2eproto();

  void InitAsDefaultInstance();
};
extern ::google::protobuf::internal::ExplicitlyConstructed<AllScienceReply> AllScienceReply_default_instance_;

// -------------------------------------------------------------------

class Science : public ::google::protobuf::Message /* @@protoc_insertion_point(class_definition:main.Science) */ {
 public:
  Science();
  virtual ~Science();

  Science(const Science& from);

  inline Science& operator=(const Science& from) {
    CopyFrom(from);
    return *this;
  }

  static const ::google::protobuf::Descriptor* descriptor();
  static const Science& default_instance();

  static const Science* internal_default_instance();

  void Swap(Science* other);

  // implements Message ----------------------------------------------

  inline Science* New() const { return New(NULL); }

  Science* New(::google::protobuf::Arena* arena) const;
  void CopyFrom(const ::google::protobuf::Message& from);
  void MergeFrom(const ::google::protobuf::Message& from);
  void CopyFrom(const Science& from);
  void MergeFrom(const Science& from);
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
  void InternalSwap(Science* other);
  void UnsafeMergeFrom(const Science& from);
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

  // optional string science_link = 1;
  void clear_science_link();
  static const int kScienceLinkFieldNumber = 1;
  const ::std::string& science_link() const;
  void set_science_link(const ::std::string& value);
  void set_science_link(const char* value);
  void set_science_link(const char* value, size_t size);
  ::std::string* mutable_science_link();
  ::std::string* release_science_link();
  void set_allocated_science_link(::std::string* science_link);

  // optional string science_title = 2;
  void clear_science_title();
  static const int kScienceTitleFieldNumber = 2;
  const ::std::string& science_title() const;
  void set_science_title(const ::std::string& value);
  void set_science_title(const char* value);
  void set_science_title(const char* value, size_t size);
  ::std::string* mutable_science_title();
  ::std::string* release_science_title();
  void set_allocated_science_title(::std::string* science_title);

  // @@protoc_insertion_point(class_scope:main.Science)
 private:

  ::google::protobuf::internal::InternalMetadataWithArena _internal_metadata_;
  ::google::protobuf::internal::ArenaStringPtr science_link_;
  ::google::protobuf::internal::ArenaStringPtr science_title_;
  mutable int _cached_size_;
  friend void  protobuf_InitDefaults_all_5fscience_2eproto_impl();
  friend void  protobuf_AddDesc_all_5fscience_2eproto_impl();
  friend void protobuf_AssignDesc_all_5fscience_2eproto();
  friend void protobuf_ShutdownFile_all_5fscience_2eproto();

  void InitAsDefaultInstance();
};
extern ::google::protobuf::internal::ExplicitlyConstructed<Science> Science_default_instance_;

// ===================================================================


// ===================================================================

#if !PROTOBUF_INLINE_NOT_IN_HEADERS
// AllScienceRequest

// optional string page_number = 1;
inline void AllScienceRequest::clear_page_number() {
  page_number_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& AllScienceRequest::page_number() const {
  // @@protoc_insertion_point(field_get:main.AllScienceRequest.page_number)
  return page_number_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void AllScienceRequest::set_page_number(const ::std::string& value) {
  
  page_number_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:main.AllScienceRequest.page_number)
}
inline void AllScienceRequest::set_page_number(const char* value) {
  
  page_number_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:main.AllScienceRequest.page_number)
}
inline void AllScienceRequest::set_page_number(const char* value, size_t size) {
  
  page_number_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:main.AllScienceRequest.page_number)
}
inline ::std::string* AllScienceRequest::mutable_page_number() {
  
  // @@protoc_insertion_point(field_mutable:main.AllScienceRequest.page_number)
  return page_number_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* AllScienceRequest::release_page_number() {
  // @@protoc_insertion_point(field_release:main.AllScienceRequest.page_number)
  
  return page_number_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void AllScienceRequest::set_allocated_page_number(::std::string* page_number) {
  if (page_number != NULL) {
    
  } else {
    
  }
  page_number_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), page_number);
  // @@protoc_insertion_point(field_set_allocated:main.AllScienceRequest.page_number)
}

// optional string page_size = 2;
inline void AllScienceRequest::clear_page_size() {
  page_size_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& AllScienceRequest::page_size() const {
  // @@protoc_insertion_point(field_get:main.AllScienceRequest.page_size)
  return page_size_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void AllScienceRequest::set_page_size(const ::std::string& value) {
  
  page_size_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:main.AllScienceRequest.page_size)
}
inline void AllScienceRequest::set_page_size(const char* value) {
  
  page_size_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:main.AllScienceRequest.page_size)
}
inline void AllScienceRequest::set_page_size(const char* value, size_t size) {
  
  page_size_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:main.AllScienceRequest.page_size)
}
inline ::std::string* AllScienceRequest::mutable_page_size() {
  
  // @@protoc_insertion_point(field_mutable:main.AllScienceRequest.page_size)
  return page_size_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* AllScienceRequest::release_page_size() {
  // @@protoc_insertion_point(field_release:main.AllScienceRequest.page_size)
  
  return page_size_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void AllScienceRequest::set_allocated_page_size(::std::string* page_size) {
  if (page_size != NULL) {
    
  } else {
    
  }
  page_size_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), page_size);
  // @@protoc_insertion_point(field_set_allocated:main.AllScienceRequest.page_size)
}

inline const AllScienceRequest* AllScienceRequest::internal_default_instance() {
  return &AllScienceRequest_default_instance_.get();
}
// -------------------------------------------------------------------

// AllScienceReply

// repeated .main.Science science = 1;
inline int AllScienceReply::science_size() const {
  return science_.size();
}
inline void AllScienceReply::clear_science() {
  science_.Clear();
}
inline const ::main::Science& AllScienceReply::science(int index) const {
  // @@protoc_insertion_point(field_get:main.AllScienceReply.science)
  return science_.Get(index);
}
inline ::main::Science* AllScienceReply::mutable_science(int index) {
  // @@protoc_insertion_point(field_mutable:main.AllScienceReply.science)
  return science_.Mutable(index);
}
inline ::main::Science* AllScienceReply::add_science() {
  // @@protoc_insertion_point(field_add:main.AllScienceReply.science)
  return science_.Add();
}
inline ::google::protobuf::RepeatedPtrField< ::main::Science >*
AllScienceReply::mutable_science() {
  // @@protoc_insertion_point(field_mutable_list:main.AllScienceReply.science)
  return &science_;
}
inline const ::google::protobuf::RepeatedPtrField< ::main::Science >&
AllScienceReply::science() const {
  // @@protoc_insertion_point(field_list:main.AllScienceReply.science)
  return science_;
}

inline const AllScienceReply* AllScienceReply::internal_default_instance() {
  return &AllScienceReply_default_instance_.get();
}
// -------------------------------------------------------------------

// Science

// optional string science_link = 1;
inline void Science::clear_science_link() {
  science_link_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& Science::science_link() const {
  // @@protoc_insertion_point(field_get:main.Science.science_link)
  return science_link_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void Science::set_science_link(const ::std::string& value) {
  
  science_link_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:main.Science.science_link)
}
inline void Science::set_science_link(const char* value) {
  
  science_link_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:main.Science.science_link)
}
inline void Science::set_science_link(const char* value, size_t size) {
  
  science_link_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:main.Science.science_link)
}
inline ::std::string* Science::mutable_science_link() {
  
  // @@protoc_insertion_point(field_mutable:main.Science.science_link)
  return science_link_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* Science::release_science_link() {
  // @@protoc_insertion_point(field_release:main.Science.science_link)
  
  return science_link_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void Science::set_allocated_science_link(::std::string* science_link) {
  if (science_link != NULL) {
    
  } else {
    
  }
  science_link_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), science_link);
  // @@protoc_insertion_point(field_set_allocated:main.Science.science_link)
}

// optional string science_title = 2;
inline void Science::clear_science_title() {
  science_title_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& Science::science_title() const {
  // @@protoc_insertion_point(field_get:main.Science.science_title)
  return science_title_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void Science::set_science_title(const ::std::string& value) {
  
  science_title_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:main.Science.science_title)
}
inline void Science::set_science_title(const char* value) {
  
  science_title_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:main.Science.science_title)
}
inline void Science::set_science_title(const char* value, size_t size) {
  
  science_title_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:main.Science.science_title)
}
inline ::std::string* Science::mutable_science_title() {
  
  // @@protoc_insertion_point(field_mutable:main.Science.science_title)
  return science_title_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* Science::release_science_title() {
  // @@protoc_insertion_point(field_release:main.Science.science_title)
  
  return science_title_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void Science::set_allocated_science_title(::std::string* science_title) {
  if (science_title != NULL) {
    
  } else {
    
  }
  science_title_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), science_title);
  // @@protoc_insertion_point(field_set_allocated:main.Science.science_title)
}

inline const Science* Science::internal_default_instance() {
  return &Science_default_instance_.get();
}
#endif  // !PROTOBUF_INLINE_NOT_IN_HEADERS
// -------------------------------------------------------------------

// -------------------------------------------------------------------


// @@protoc_insertion_point(namespace_scope)

}  // namespace main

// @@protoc_insertion_point(global_scope)

#endif  // PROTOBUF_all_5fscience_2eproto__INCLUDED
