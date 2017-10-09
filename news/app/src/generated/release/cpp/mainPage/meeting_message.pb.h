// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mainPage/meeting_message.proto

#ifndef PROTOBUF_mainPage_2fmeeting_5fmessage_2eproto__INCLUDED
#define PROTOBUF_mainPage_2fmeeting_5fmessage_2eproto__INCLUDED

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
void protobuf_AddDesc_mainPage_2fmeeting_5fmessage_2eproto();
void protobuf_InitDefaults_mainPage_2fmeeting_5fmessage_2eproto();
void protobuf_AssignDesc_mainPage_2fmeeting_5fmessage_2eproto();
void protobuf_ShutdownFile_mainPage_2fmeeting_5fmessage_2eproto();

class Meeting;
class MeetingReply;
class MeetingRequest;

// ===================================================================

class MeetingRequest : public ::google::protobuf::Message /* @@protoc_insertion_point(class_definition:main.MeetingRequest) */ {
 public:
  MeetingRequest();
  virtual ~MeetingRequest();

  MeetingRequest(const MeetingRequest& from);

  inline MeetingRequest& operator=(const MeetingRequest& from) {
    CopyFrom(from);
    return *this;
  }

  static const ::google::protobuf::Descriptor* descriptor();
  static const MeetingRequest& default_instance();

  static const MeetingRequest* internal_default_instance();

  void Swap(MeetingRequest* other);

  // implements Message ----------------------------------------------

  inline MeetingRequest* New() const { return New(NULL); }

  MeetingRequest* New(::google::protobuf::Arena* arena) const;
  void CopyFrom(const ::google::protobuf::Message& from);
  void MergeFrom(const ::google::protobuf::Message& from);
  void CopyFrom(const MeetingRequest& from);
  void MergeFrom(const MeetingRequest& from);
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
  void InternalSwap(MeetingRequest* other);
  void UnsafeMergeFrom(const MeetingRequest& from);
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

  // @@protoc_insertion_point(class_scope:main.MeetingRequest)
 private:

  ::google::protobuf::internal::InternalMetadataWithArena _internal_metadata_;
  ::google::protobuf::internal::ArenaStringPtr page_number_;
  ::google::protobuf::internal::ArenaStringPtr page_size_;
  mutable int _cached_size_;
  friend void  protobuf_InitDefaults_mainPage_2fmeeting_5fmessage_2eproto_impl();
  friend void  protobuf_AddDesc_mainPage_2fmeeting_5fmessage_2eproto_impl();
  friend void protobuf_AssignDesc_mainPage_2fmeeting_5fmessage_2eproto();
  friend void protobuf_ShutdownFile_mainPage_2fmeeting_5fmessage_2eproto();

  void InitAsDefaultInstance();
};
extern ::google::protobuf::internal::ExplicitlyConstructed<MeetingRequest> MeetingRequest_default_instance_;

// -------------------------------------------------------------------

class MeetingReply : public ::google::protobuf::Message /* @@protoc_insertion_point(class_definition:main.MeetingReply) */ {
 public:
  MeetingReply();
  virtual ~MeetingReply();

  MeetingReply(const MeetingReply& from);

  inline MeetingReply& operator=(const MeetingReply& from) {
    CopyFrom(from);
    return *this;
  }

  static const ::google::protobuf::Descriptor* descriptor();
  static const MeetingReply& default_instance();

  static const MeetingReply* internal_default_instance();

  void Swap(MeetingReply* other);

  // implements Message ----------------------------------------------

  inline MeetingReply* New() const { return New(NULL); }

  MeetingReply* New(::google::protobuf::Arena* arena) const;
  void CopyFrom(const ::google::protobuf::Message& from);
  void MergeFrom(const ::google::protobuf::Message& from);
  void CopyFrom(const MeetingReply& from);
  void MergeFrom(const MeetingReply& from);
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
  void InternalSwap(MeetingReply* other);
  void UnsafeMergeFrom(const MeetingReply& from);
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

  // repeated .main.Meeting meeting = 1;
  int meeting_size() const;
  void clear_meeting();
  static const int kMeetingFieldNumber = 1;
  const ::main::Meeting& meeting(int index) const;
  ::main::Meeting* mutable_meeting(int index);
  ::main::Meeting* add_meeting();
  ::google::protobuf::RepeatedPtrField< ::main::Meeting >*
      mutable_meeting();
  const ::google::protobuf::RepeatedPtrField< ::main::Meeting >&
      meeting() const;

  // @@protoc_insertion_point(class_scope:main.MeetingReply)
 private:

  ::google::protobuf::internal::InternalMetadataWithArena _internal_metadata_;
  ::google::protobuf::RepeatedPtrField< ::main::Meeting > meeting_;
  mutable int _cached_size_;
  friend void  protobuf_InitDefaults_mainPage_2fmeeting_5fmessage_2eproto_impl();
  friend void  protobuf_AddDesc_mainPage_2fmeeting_5fmessage_2eproto_impl();
  friend void protobuf_AssignDesc_mainPage_2fmeeting_5fmessage_2eproto();
  friend void protobuf_ShutdownFile_mainPage_2fmeeting_5fmessage_2eproto();

  void InitAsDefaultInstance();
};
extern ::google::protobuf::internal::ExplicitlyConstructed<MeetingReply> MeetingReply_default_instance_;

// -------------------------------------------------------------------

class Meeting : public ::google::protobuf::Message /* @@protoc_insertion_point(class_definition:main.Meeting) */ {
 public:
  Meeting();
  virtual ~Meeting();

  Meeting(const Meeting& from);

  inline Meeting& operator=(const Meeting& from) {
    CopyFrom(from);
    return *this;
  }

  static const ::google::protobuf::Descriptor* descriptor();
  static const Meeting& default_instance();

  static const Meeting* internal_default_instance();

  void Swap(Meeting* other);

  // implements Message ----------------------------------------------

  inline Meeting* New() const { return New(NULL); }

  Meeting* New(::google::protobuf::Arena* arena) const;
  void CopyFrom(const ::google::protobuf::Message& from);
  void MergeFrom(const ::google::protobuf::Message& from);
  void CopyFrom(const Meeting& from);
  void MergeFrom(const Meeting& from);
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
  void InternalSwap(Meeting* other);
  void UnsafeMergeFrom(const Meeting& from);
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

  // optional string meeting_link = 1;
  void clear_meeting_link();
  static const int kMeetingLinkFieldNumber = 1;
  const ::std::string& meeting_link() const;
  void set_meeting_link(const ::std::string& value);
  void set_meeting_link(const char* value);
  void set_meeting_link(const char* value, size_t size);
  ::std::string* mutable_meeting_link();
  ::std::string* release_meeting_link();
  void set_allocated_meeting_link(::std::string* meeting_link);

  // optional string meeting_title = 2;
  void clear_meeting_title();
  static const int kMeetingTitleFieldNumber = 2;
  const ::std::string& meeting_title() const;
  void set_meeting_title(const ::std::string& value);
  void set_meeting_title(const char* value);
  void set_meeting_title(const char* value, size_t size);
  ::std::string* mutable_meeting_title();
  ::std::string* release_meeting_title();
  void set_allocated_meeting_title(::std::string* meeting_title);

  // @@protoc_insertion_point(class_scope:main.Meeting)
 private:

  ::google::protobuf::internal::InternalMetadataWithArena _internal_metadata_;
  ::google::protobuf::internal::ArenaStringPtr meeting_link_;
  ::google::protobuf::internal::ArenaStringPtr meeting_title_;
  mutable int _cached_size_;
  friend void  protobuf_InitDefaults_mainPage_2fmeeting_5fmessage_2eproto_impl();
  friend void  protobuf_AddDesc_mainPage_2fmeeting_5fmessage_2eproto_impl();
  friend void protobuf_AssignDesc_mainPage_2fmeeting_5fmessage_2eproto();
  friend void protobuf_ShutdownFile_mainPage_2fmeeting_5fmessage_2eproto();

  void InitAsDefaultInstance();
};
extern ::google::protobuf::internal::ExplicitlyConstructed<Meeting> Meeting_default_instance_;

// ===================================================================


// ===================================================================

#if !PROTOBUF_INLINE_NOT_IN_HEADERS
// MeetingRequest

// optional string page_number = 1;
inline void MeetingRequest::clear_page_number() {
  page_number_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& MeetingRequest::page_number() const {
  // @@protoc_insertion_point(field_get:main.MeetingRequest.page_number)
  return page_number_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void MeetingRequest::set_page_number(const ::std::string& value) {
  
  page_number_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:main.MeetingRequest.page_number)
}
inline void MeetingRequest::set_page_number(const char* value) {
  
  page_number_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:main.MeetingRequest.page_number)
}
inline void MeetingRequest::set_page_number(const char* value, size_t size) {
  
  page_number_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:main.MeetingRequest.page_number)
}
inline ::std::string* MeetingRequest::mutable_page_number() {
  
  // @@protoc_insertion_point(field_mutable:main.MeetingRequest.page_number)
  return page_number_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* MeetingRequest::release_page_number() {
  // @@protoc_insertion_point(field_release:main.MeetingRequest.page_number)
  
  return page_number_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void MeetingRequest::set_allocated_page_number(::std::string* page_number) {
  if (page_number != NULL) {
    
  } else {
    
  }
  page_number_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), page_number);
  // @@protoc_insertion_point(field_set_allocated:main.MeetingRequest.page_number)
}

// optional string page_size = 2;
inline void MeetingRequest::clear_page_size() {
  page_size_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& MeetingRequest::page_size() const {
  // @@protoc_insertion_point(field_get:main.MeetingRequest.page_size)
  return page_size_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void MeetingRequest::set_page_size(const ::std::string& value) {
  
  page_size_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:main.MeetingRequest.page_size)
}
inline void MeetingRequest::set_page_size(const char* value) {
  
  page_size_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:main.MeetingRequest.page_size)
}
inline void MeetingRequest::set_page_size(const char* value, size_t size) {
  
  page_size_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:main.MeetingRequest.page_size)
}
inline ::std::string* MeetingRequest::mutable_page_size() {
  
  // @@protoc_insertion_point(field_mutable:main.MeetingRequest.page_size)
  return page_size_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* MeetingRequest::release_page_size() {
  // @@protoc_insertion_point(field_release:main.MeetingRequest.page_size)
  
  return page_size_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void MeetingRequest::set_allocated_page_size(::std::string* page_size) {
  if (page_size != NULL) {
    
  } else {
    
  }
  page_size_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), page_size);
  // @@protoc_insertion_point(field_set_allocated:main.MeetingRequest.page_size)
}

inline const MeetingRequest* MeetingRequest::internal_default_instance() {
  return &MeetingRequest_default_instance_.get();
}
// -------------------------------------------------------------------

// MeetingReply

// repeated .main.Meeting meeting = 1;
inline int MeetingReply::meeting_size() const {
  return meeting_.size();
}
inline void MeetingReply::clear_meeting() {
  meeting_.Clear();
}
inline const ::main::Meeting& MeetingReply::meeting(int index) const {
  // @@protoc_insertion_point(field_get:main.MeetingReply.meeting)
  return meeting_.Get(index);
}
inline ::main::Meeting* MeetingReply::mutable_meeting(int index) {
  // @@protoc_insertion_point(field_mutable:main.MeetingReply.meeting)
  return meeting_.Mutable(index);
}
inline ::main::Meeting* MeetingReply::add_meeting() {
  // @@protoc_insertion_point(field_add:main.MeetingReply.meeting)
  return meeting_.Add();
}
inline ::google::protobuf::RepeatedPtrField< ::main::Meeting >*
MeetingReply::mutable_meeting() {
  // @@protoc_insertion_point(field_mutable_list:main.MeetingReply.meeting)
  return &meeting_;
}
inline const ::google::protobuf::RepeatedPtrField< ::main::Meeting >&
MeetingReply::meeting() const {
  // @@protoc_insertion_point(field_list:main.MeetingReply.meeting)
  return meeting_;
}

inline const MeetingReply* MeetingReply::internal_default_instance() {
  return &MeetingReply_default_instance_.get();
}
// -------------------------------------------------------------------

// Meeting

// optional string meeting_link = 1;
inline void Meeting::clear_meeting_link() {
  meeting_link_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& Meeting::meeting_link() const {
  // @@protoc_insertion_point(field_get:main.Meeting.meeting_link)
  return meeting_link_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void Meeting::set_meeting_link(const ::std::string& value) {
  
  meeting_link_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:main.Meeting.meeting_link)
}
inline void Meeting::set_meeting_link(const char* value) {
  
  meeting_link_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:main.Meeting.meeting_link)
}
inline void Meeting::set_meeting_link(const char* value, size_t size) {
  
  meeting_link_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:main.Meeting.meeting_link)
}
inline ::std::string* Meeting::mutable_meeting_link() {
  
  // @@protoc_insertion_point(field_mutable:main.Meeting.meeting_link)
  return meeting_link_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* Meeting::release_meeting_link() {
  // @@protoc_insertion_point(field_release:main.Meeting.meeting_link)
  
  return meeting_link_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void Meeting::set_allocated_meeting_link(::std::string* meeting_link) {
  if (meeting_link != NULL) {
    
  } else {
    
  }
  meeting_link_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), meeting_link);
  // @@protoc_insertion_point(field_set_allocated:main.Meeting.meeting_link)
}

// optional string meeting_title = 2;
inline void Meeting::clear_meeting_title() {
  meeting_title_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& Meeting::meeting_title() const {
  // @@protoc_insertion_point(field_get:main.Meeting.meeting_title)
  return meeting_title_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void Meeting::set_meeting_title(const ::std::string& value) {
  
  meeting_title_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:main.Meeting.meeting_title)
}
inline void Meeting::set_meeting_title(const char* value) {
  
  meeting_title_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:main.Meeting.meeting_title)
}
inline void Meeting::set_meeting_title(const char* value, size_t size) {
  
  meeting_title_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:main.Meeting.meeting_title)
}
inline ::std::string* Meeting::mutable_meeting_title() {
  
  // @@protoc_insertion_point(field_mutable:main.Meeting.meeting_title)
  return meeting_title_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* Meeting::release_meeting_title() {
  // @@protoc_insertion_point(field_release:main.Meeting.meeting_title)
  
  return meeting_title_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void Meeting::set_allocated_meeting_title(::std::string* meeting_title) {
  if (meeting_title != NULL) {
    
  } else {
    
  }
  meeting_title_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), meeting_title);
  // @@protoc_insertion_point(field_set_allocated:main.Meeting.meeting_title)
}

inline const Meeting* Meeting::internal_default_instance() {
  return &Meeting_default_instance_.get();
}
#endif  // !PROTOBUF_INLINE_NOT_IN_HEADERS
// -------------------------------------------------------------------

// -------------------------------------------------------------------


// @@protoc_insertion_point(namespace_scope)

}  // namespace main

// @@protoc_insertion_point(global_scope)

#endif  // PROTOBUF_mainPage_2fmeeting_5fmessage_2eproto__INCLUDED