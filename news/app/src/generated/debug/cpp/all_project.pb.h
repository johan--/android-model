// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all_project.proto

#ifndef PROTOBUF_all_5fproject_2eproto__INCLUDED
#define PROTOBUF_all_5fproject_2eproto__INCLUDED

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
void protobuf_AddDesc_all_5fproject_2eproto();
void protobuf_InitDefaults_all_5fproject_2eproto();
void protobuf_AssignDesc_all_5fproject_2eproto();
void protobuf_ShutdownFile_all_5fproject_2eproto();

class Project;
class ProjectReply;
class ProjectRequest;

// ===================================================================

class ProjectRequest : public ::google::protobuf::Message /* @@protoc_insertion_point(class_definition:main.ProjectRequest) */ {
 public:
  ProjectRequest();
  virtual ~ProjectRequest();

  ProjectRequest(const ProjectRequest& from);

  inline ProjectRequest& operator=(const ProjectRequest& from) {
    CopyFrom(from);
    return *this;
  }

  static const ::google::protobuf::Descriptor* descriptor();
  static const ProjectRequest& default_instance();

  static const ProjectRequest* internal_default_instance();

  void Swap(ProjectRequest* other);

  // implements Message ----------------------------------------------

  inline ProjectRequest* New() const { return New(NULL); }

  ProjectRequest* New(::google::protobuf::Arena* arena) const;
  void CopyFrom(const ::google::protobuf::Message& from);
  void MergeFrom(const ::google::protobuf::Message& from);
  void CopyFrom(const ProjectRequest& from);
  void MergeFrom(const ProjectRequest& from);
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
  void InternalSwap(ProjectRequest* other);
  void UnsafeMergeFrom(const ProjectRequest& from);
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

  // @@protoc_insertion_point(class_scope:main.ProjectRequest)
 private:

  ::google::protobuf::internal::InternalMetadataWithArena _internal_metadata_;
  ::google::protobuf::internal::ArenaStringPtr page_number_;
  ::google::protobuf::internal::ArenaStringPtr page_size_;
  mutable int _cached_size_;
  friend void  protobuf_InitDefaults_all_5fproject_2eproto_impl();
  friend void  protobuf_AddDesc_all_5fproject_2eproto_impl();
  friend void protobuf_AssignDesc_all_5fproject_2eproto();
  friend void protobuf_ShutdownFile_all_5fproject_2eproto();

  void InitAsDefaultInstance();
};
extern ::google::protobuf::internal::ExplicitlyConstructed<ProjectRequest> ProjectRequest_default_instance_;

// -------------------------------------------------------------------

class ProjectReply : public ::google::protobuf::Message /* @@protoc_insertion_point(class_definition:main.ProjectReply) */ {
 public:
  ProjectReply();
  virtual ~ProjectReply();

  ProjectReply(const ProjectReply& from);

  inline ProjectReply& operator=(const ProjectReply& from) {
    CopyFrom(from);
    return *this;
  }

  static const ::google::protobuf::Descriptor* descriptor();
  static const ProjectReply& default_instance();

  static const ProjectReply* internal_default_instance();

  void Swap(ProjectReply* other);

  // implements Message ----------------------------------------------

  inline ProjectReply* New() const { return New(NULL); }

  ProjectReply* New(::google::protobuf::Arena* arena) const;
  void CopyFrom(const ::google::protobuf::Message& from);
  void MergeFrom(const ::google::protobuf::Message& from);
  void CopyFrom(const ProjectReply& from);
  void MergeFrom(const ProjectReply& from);
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
  void InternalSwap(ProjectReply* other);
  void UnsafeMergeFrom(const ProjectReply& from);
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

  // repeated .main.Project project = 1;
  int project_size() const;
  void clear_project();
  static const int kProjectFieldNumber = 1;
  const ::main::Project& project(int index) const;
  ::main::Project* mutable_project(int index);
  ::main::Project* add_project();
  ::google::protobuf::RepeatedPtrField< ::main::Project >*
      mutable_project();
  const ::google::protobuf::RepeatedPtrField< ::main::Project >&
      project() const;

  // @@protoc_insertion_point(class_scope:main.ProjectReply)
 private:

  ::google::protobuf::internal::InternalMetadataWithArena _internal_metadata_;
  ::google::protobuf::RepeatedPtrField< ::main::Project > project_;
  mutable int _cached_size_;
  friend void  protobuf_InitDefaults_all_5fproject_2eproto_impl();
  friend void  protobuf_AddDesc_all_5fproject_2eproto_impl();
  friend void protobuf_AssignDesc_all_5fproject_2eproto();
  friend void protobuf_ShutdownFile_all_5fproject_2eproto();

  void InitAsDefaultInstance();
};
extern ::google::protobuf::internal::ExplicitlyConstructed<ProjectReply> ProjectReply_default_instance_;

// -------------------------------------------------------------------

class Project : public ::google::protobuf::Message /* @@protoc_insertion_point(class_definition:main.Project) */ {
 public:
  Project();
  virtual ~Project();

  Project(const Project& from);

  inline Project& operator=(const Project& from) {
    CopyFrom(from);
    return *this;
  }

  static const ::google::protobuf::Descriptor* descriptor();
  static const Project& default_instance();

  static const Project* internal_default_instance();

  void Swap(Project* other);

  // implements Message ----------------------------------------------

  inline Project* New() const { return New(NULL); }

  Project* New(::google::protobuf::Arena* arena) const;
  void CopyFrom(const ::google::protobuf::Message& from);
  void MergeFrom(const ::google::protobuf::Message& from);
  void CopyFrom(const Project& from);
  void MergeFrom(const Project& from);
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
  void InternalSwap(Project* other);
  void UnsafeMergeFrom(const Project& from);
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

  // optional string project_link = 1;
  void clear_project_link();
  static const int kProjectLinkFieldNumber = 1;
  const ::std::string& project_link() const;
  void set_project_link(const ::std::string& value);
  void set_project_link(const char* value);
  void set_project_link(const char* value, size_t size);
  ::std::string* mutable_project_link();
  ::std::string* release_project_link();
  void set_allocated_project_link(::std::string* project_link);

  // optional string project_title = 2;
  void clear_project_title();
  static const int kProjectTitleFieldNumber = 2;
  const ::std::string& project_title() const;
  void set_project_title(const ::std::string& value);
  void set_project_title(const char* value);
  void set_project_title(const char* value, size_t size);
  ::std::string* mutable_project_title();
  ::std::string* release_project_title();
  void set_allocated_project_title(::std::string* project_title);

  // @@protoc_insertion_point(class_scope:main.Project)
 private:

  ::google::protobuf::internal::InternalMetadataWithArena _internal_metadata_;
  ::google::protobuf::internal::ArenaStringPtr project_link_;
  ::google::protobuf::internal::ArenaStringPtr project_title_;
  mutable int _cached_size_;
  friend void  protobuf_InitDefaults_all_5fproject_2eproto_impl();
  friend void  protobuf_AddDesc_all_5fproject_2eproto_impl();
  friend void protobuf_AssignDesc_all_5fproject_2eproto();
  friend void protobuf_ShutdownFile_all_5fproject_2eproto();

  void InitAsDefaultInstance();
};
extern ::google::protobuf::internal::ExplicitlyConstructed<Project> Project_default_instance_;

// ===================================================================


// ===================================================================

#if !PROTOBUF_INLINE_NOT_IN_HEADERS
// ProjectRequest

// optional string page_number = 1;
inline void ProjectRequest::clear_page_number() {
  page_number_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& ProjectRequest::page_number() const {
  // @@protoc_insertion_point(field_get:main.ProjectRequest.page_number)
  return page_number_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void ProjectRequest::set_page_number(const ::std::string& value) {
  
  page_number_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:main.ProjectRequest.page_number)
}
inline void ProjectRequest::set_page_number(const char* value) {
  
  page_number_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:main.ProjectRequest.page_number)
}
inline void ProjectRequest::set_page_number(const char* value, size_t size) {
  
  page_number_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:main.ProjectRequest.page_number)
}
inline ::std::string* ProjectRequest::mutable_page_number() {
  
  // @@protoc_insertion_point(field_mutable:main.ProjectRequest.page_number)
  return page_number_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* ProjectRequest::release_page_number() {
  // @@protoc_insertion_point(field_release:main.ProjectRequest.page_number)
  
  return page_number_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void ProjectRequest::set_allocated_page_number(::std::string* page_number) {
  if (page_number != NULL) {
    
  } else {
    
  }
  page_number_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), page_number);
  // @@protoc_insertion_point(field_set_allocated:main.ProjectRequest.page_number)
}

// optional string page_size = 2;
inline void ProjectRequest::clear_page_size() {
  page_size_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& ProjectRequest::page_size() const {
  // @@protoc_insertion_point(field_get:main.ProjectRequest.page_size)
  return page_size_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void ProjectRequest::set_page_size(const ::std::string& value) {
  
  page_size_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:main.ProjectRequest.page_size)
}
inline void ProjectRequest::set_page_size(const char* value) {
  
  page_size_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:main.ProjectRequest.page_size)
}
inline void ProjectRequest::set_page_size(const char* value, size_t size) {
  
  page_size_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:main.ProjectRequest.page_size)
}
inline ::std::string* ProjectRequest::mutable_page_size() {
  
  // @@protoc_insertion_point(field_mutable:main.ProjectRequest.page_size)
  return page_size_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* ProjectRequest::release_page_size() {
  // @@protoc_insertion_point(field_release:main.ProjectRequest.page_size)
  
  return page_size_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void ProjectRequest::set_allocated_page_size(::std::string* page_size) {
  if (page_size != NULL) {
    
  } else {
    
  }
  page_size_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), page_size);
  // @@protoc_insertion_point(field_set_allocated:main.ProjectRequest.page_size)
}

inline const ProjectRequest* ProjectRequest::internal_default_instance() {
  return &ProjectRequest_default_instance_.get();
}
// -------------------------------------------------------------------

// ProjectReply

// repeated .main.Project project = 1;
inline int ProjectReply::project_size() const {
  return project_.size();
}
inline void ProjectReply::clear_project() {
  project_.Clear();
}
inline const ::main::Project& ProjectReply::project(int index) const {
  // @@protoc_insertion_point(field_get:main.ProjectReply.project)
  return project_.Get(index);
}
inline ::main::Project* ProjectReply::mutable_project(int index) {
  // @@protoc_insertion_point(field_mutable:main.ProjectReply.project)
  return project_.Mutable(index);
}
inline ::main::Project* ProjectReply::add_project() {
  // @@protoc_insertion_point(field_add:main.ProjectReply.project)
  return project_.Add();
}
inline ::google::protobuf::RepeatedPtrField< ::main::Project >*
ProjectReply::mutable_project() {
  // @@protoc_insertion_point(field_mutable_list:main.ProjectReply.project)
  return &project_;
}
inline const ::google::protobuf::RepeatedPtrField< ::main::Project >&
ProjectReply::project() const {
  // @@protoc_insertion_point(field_list:main.ProjectReply.project)
  return project_;
}

inline const ProjectReply* ProjectReply::internal_default_instance() {
  return &ProjectReply_default_instance_.get();
}
// -------------------------------------------------------------------

// Project

// optional string project_link = 1;
inline void Project::clear_project_link() {
  project_link_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& Project::project_link() const {
  // @@protoc_insertion_point(field_get:main.Project.project_link)
  return project_link_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void Project::set_project_link(const ::std::string& value) {
  
  project_link_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:main.Project.project_link)
}
inline void Project::set_project_link(const char* value) {
  
  project_link_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:main.Project.project_link)
}
inline void Project::set_project_link(const char* value, size_t size) {
  
  project_link_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:main.Project.project_link)
}
inline ::std::string* Project::mutable_project_link() {
  
  // @@protoc_insertion_point(field_mutable:main.Project.project_link)
  return project_link_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* Project::release_project_link() {
  // @@protoc_insertion_point(field_release:main.Project.project_link)
  
  return project_link_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void Project::set_allocated_project_link(::std::string* project_link) {
  if (project_link != NULL) {
    
  } else {
    
  }
  project_link_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), project_link);
  // @@protoc_insertion_point(field_set_allocated:main.Project.project_link)
}

// optional string project_title = 2;
inline void Project::clear_project_title() {
  project_title_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline const ::std::string& Project::project_title() const {
  // @@protoc_insertion_point(field_get:main.Project.project_title)
  return project_title_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void Project::set_project_title(const ::std::string& value) {
  
  project_title_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:main.Project.project_title)
}
inline void Project::set_project_title(const char* value) {
  
  project_title_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:main.Project.project_title)
}
inline void Project::set_project_title(const char* value, size_t size) {
  
  project_title_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:main.Project.project_title)
}
inline ::std::string* Project::mutable_project_title() {
  
  // @@protoc_insertion_point(field_mutable:main.Project.project_title)
  return project_title_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline ::std::string* Project::release_project_title() {
  // @@protoc_insertion_point(field_release:main.Project.project_title)
  
  return project_title_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
inline void Project::set_allocated_project_title(::std::string* project_title) {
  if (project_title != NULL) {
    
  } else {
    
  }
  project_title_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), project_title);
  // @@protoc_insertion_point(field_set_allocated:main.Project.project_title)
}

inline const Project* Project::internal_default_instance() {
  return &Project_default_instance_.get();
}
#endif  // !PROTOBUF_INLINE_NOT_IN_HEADERS
// -------------------------------------------------------------------

// -------------------------------------------------------------------


// @@protoc_insertion_point(namespace_scope)

}  // namespace main

// @@protoc_insertion_point(global_scope)

#endif  // PROTOBUF_all_5fproject_2eproto__INCLUDED
