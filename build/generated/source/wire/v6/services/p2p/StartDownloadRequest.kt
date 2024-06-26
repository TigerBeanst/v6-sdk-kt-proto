// Code generated by Wire protocol buffer compiler, do not edit.
// Source: v6.services.p2p.StartDownloadRequest in webrtc_manager.proto
@file:Suppress("DEPRECATION")

package v6.services.p2p

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_3
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.sanitize
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Long
import kotlin.Nothing
import kotlin.String
import kotlin.Suppress
import okio.ByteString

public class StartDownloadRequest(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "clientIdentity",
    schemaIndex = 0,
  )
  public val client_identity: String = "",
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "contentIdentity",
    schemaIndex = 1,
  )
  public val content_identity: String = "",
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#INT64",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "peerLimit",
    schemaIndex = 2,
  )
  public val peer_limit: Long = 0L,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<StartDownloadRequest, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is StartDownloadRequest) return false
    if (unknownFields != other.unknownFields) return false
    if (client_identity != other.client_identity) return false
    if (content_identity != other.content_identity) return false
    if (peer_limit != other.peer_limit) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + client_identity.hashCode()
      result = result * 37 + content_identity.hashCode()
      result = result * 37 + peer_limit.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """client_identity=${sanitize(client_identity)}"""
    result += """content_identity=${sanitize(content_identity)}"""
    result += """peer_limit=$peer_limit"""
    return result.joinToString(prefix = "StartDownloadRequest{", separator = ", ", postfix = "}")
  }

  public fun copy(
    client_identity: String = this.client_identity,
    content_identity: String = this.content_identity,
    peer_limit: Long = this.peer_limit,
    unknownFields: ByteString = this.unknownFields,
  ): StartDownloadRequest = StartDownloadRequest(client_identity, content_identity, peer_limit,
      unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<StartDownloadRequest> = object :
        ProtoAdapter<StartDownloadRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      StartDownloadRequest::class, 
      "type.googleapis.com/v6.services.p2p.StartDownloadRequest", 
      PROTO_3, 
      null, 
      "webrtc_manager.proto"
    ) {
      override fun encodedSize(`value`: StartDownloadRequest): Int {
        var size = value.unknownFields.size
        if (value.client_identity != "") size += ProtoAdapter.STRING.encodedSizeWithTag(1,
            value.client_identity)
        if (value.content_identity != "") size += ProtoAdapter.STRING.encodedSizeWithTag(2,
            value.content_identity)
        if (value.peer_limit != 0L) size += ProtoAdapter.INT64.encodedSizeWithTag(3,
            value.peer_limit)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: StartDownloadRequest) {
        if (value.client_identity != "") ProtoAdapter.STRING.encodeWithTag(writer, 1,
            value.client_identity)
        if (value.content_identity != "") ProtoAdapter.STRING.encodeWithTag(writer, 2,
            value.content_identity)
        if (value.peer_limit != 0L) ProtoAdapter.INT64.encodeWithTag(writer, 3, value.peer_limit)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: StartDownloadRequest) {
        writer.writeBytes(value.unknownFields)
        if (value.peer_limit != 0L) ProtoAdapter.INT64.encodeWithTag(writer, 3, value.peer_limit)
        if (value.content_identity != "") ProtoAdapter.STRING.encodeWithTag(writer, 2,
            value.content_identity)
        if (value.client_identity != "") ProtoAdapter.STRING.encodeWithTag(writer, 1,
            value.client_identity)
      }

      override fun decode(reader: ProtoReader): StartDownloadRequest {
        var client_identity: String = ""
        var content_identity: String = ""
        var peer_limit: Long = 0L
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> client_identity = ProtoAdapter.STRING.decode(reader)
            2 -> content_identity = ProtoAdapter.STRING.decode(reader)
            3 -> peer_limit = ProtoAdapter.INT64.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return StartDownloadRequest(
          client_identity = client_identity,
          content_identity = content_identity,
          peer_limit = peer_limit,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: StartDownloadRequest): StartDownloadRequest = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
