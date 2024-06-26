// Code generated by Wire protocol buffer compiler, do not edit.
// Source: v6.services.pub.PubFileShare in file_share.proto
@file:Suppress("DEPRECATION")

package v6.services.pub

import com.squareup.wire.GrpcCall
import com.squareup.wire.GrpcClient
import com.squareup.wire.GrpcMethod
import kotlin.Suppress

public class GrpcPubFileShareClient(
  private val client: GrpcClient,
) : PubFileShareClient {
  override fun Create(): GrpcCall<FileShare, FileShare> = client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubFileShare/Create",
      requestAdapter = FileShare.ADAPTER,
      responseAdapter = FileShare.ADAPTER
  ))

  override fun Get(): GrpcCall<FileShare, FileShare> = client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubFileShare/Get",
      requestAdapter = FileShare.ADAPTER,
      responseAdapter = FileShare.ADAPTER
  ))

  override fun Like(): GrpcCall<FileShare, FileShare> = client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubFileShare/Like",
      requestAdapter = FileShare.ADAPTER,
      responseAdapter = FileShare.ADAPTER
  ))

  override fun Dislike(): GrpcCall<FileShare, FileShare> = client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubFileShare/Dislike",
      requestAdapter = FileShare.ADAPTER,
      responseAdapter = FileShare.ADAPTER
  ))

  override fun ComplaintShare(): GrpcCall<Complaint, Complaint> = client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubFileShare/ComplaintShare",
      requestAdapter = Complaint.ADAPTER,
      responseAdapter = Complaint.ADAPTER
  ))

  override fun List(): GrpcCall<FileShareListRequest, FileShareListResponse> =
      client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubFileShare/List",
      requestAdapter = FileShareListRequest.ADAPTER,
      responseAdapter = FileShareListResponse.ADAPTER
  ))

  override fun ListComplaint(): GrpcCall<ComplaintListRequest, ComplaintListResponse> =
      client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubFileShare/ListComplaint",
      requestAdapter = ComplaintListRequest.ADAPTER,
      responseAdapter = ComplaintListResponse.ADAPTER
  ))

  override fun Delete(): GrpcCall<FileShareDeleteRequest, FileShareDeleteResponse> =
      client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubFileShare/Delete",
      requestAdapter = FileShareDeleteRequest.ADAPTER,
      responseAdapter = FileShareDeleteResponse.ADAPTER
  ))

  override fun DeleteComplaint(): GrpcCall<ComplaintDeleteRequest, ComplaintDeleteResponse> =
      client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubFileShare/DeleteComplaint",
      requestAdapter = ComplaintDeleteRequest.ADAPTER,
      responseAdapter = ComplaintDeleteResponse.ADAPTER
  ))

  override fun Save(): GrpcCall<FileShare, FileShare> = client.newCall(GrpcMethod(
      path = "/v6.services.pub.PubFileShare/Save",
      requestAdapter = FileShare.ADAPTER,
      responseAdapter = FileShare.ADAPTER
  ))
}
