// Code generated by Wire protocol buffer compiler, do not edit.
// Source: v6.services.pub.PubFileShare in file_share.proto
@file:Suppress("DEPRECATION")

package v6.services.pub

import com.squareup.wire.GrpcCall
import com.squareup.wire.Service
import kotlin.Suppress

public interface PubFileShareClient : Service {
  public fun Create(): GrpcCall<FileShare, FileShare>

  public fun Get(): GrpcCall<FileShare, FileShare>

  public fun Like(): GrpcCall<FileShare, FileShare>

  public fun Dislike(): GrpcCall<FileShare, FileShare>

  public fun ComplaintShare(): GrpcCall<Complaint, Complaint>

  public fun List(): GrpcCall<FileShareListRequest, FileShareListResponse>

  public fun ListComplaint(): GrpcCall<ComplaintListRequest, ComplaintListResponse>

  public fun Delete(): GrpcCall<FileShareDeleteRequest, FileShareDeleteResponse>

  public fun DeleteComplaint(): GrpcCall<ComplaintDeleteRequest, ComplaintDeleteResponse>

  public fun Save(): GrpcCall<FileShare, FileShare>
}
