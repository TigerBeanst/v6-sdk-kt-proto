// Code generated by Wire protocol buffer compiler, do not edit.
// Source: v6.services.pub.OfflineTaskDeleteRequest in public_user_offline.proto
@file:Suppress("DEPRECATION")

package v6.services.pub

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_3
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.immutableCopyOf
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
import kotlin.collections.List
import okio.ByteString

public class OfflineTaskDeleteRequest(
  identity: List<String> = emptyList(),
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "deleteFiles",
    schemaIndex = 1,
  )
  public val delete_files: Boolean = false,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<OfflineTaskDeleteRequest, Nothing>(ADAPTER, unknownFields) {
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.REPEATED,
    schemaIndex = 0,
  )
  public val identity: List<String> = immutableCopyOf("identity", identity)

  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is OfflineTaskDeleteRequest) return false
    if (unknownFields != other.unknownFields) return false
    if (identity != other.identity) return false
    if (delete_files != other.delete_files) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + identity.hashCode()
      result = result * 37 + delete_files.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (identity.isNotEmpty()) result += """identity=${sanitize(identity)}"""
    result += """delete_files=$delete_files"""
    return result.joinToString(prefix = "OfflineTaskDeleteRequest{", separator = ", ", postfix =
        "}")
  }

  public fun copy(
    identity: List<String> = this.identity,
    delete_files: Boolean = this.delete_files,
    unknownFields: ByteString = this.unknownFields,
  ): OfflineTaskDeleteRequest = OfflineTaskDeleteRequest(identity, delete_files, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<OfflineTaskDeleteRequest> = object :
        ProtoAdapter<OfflineTaskDeleteRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      OfflineTaskDeleteRequest::class, 
      "type.googleapis.com/v6.services.pub.OfflineTaskDeleteRequest", 
      PROTO_3, 
      null, 
      "public_user_offline.proto"
    ) {
      override fun encodedSize(`value`: OfflineTaskDeleteRequest): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, value.identity)
        if (value.delete_files != false) size += ProtoAdapter.BOOL.encodedSizeWithTag(2,
            value.delete_files)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: OfflineTaskDeleteRequest) {
        ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, value.identity)
        if (value.delete_files != false) ProtoAdapter.BOOL.encodeWithTag(writer, 2,
            value.delete_files)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: OfflineTaskDeleteRequest) {
        writer.writeBytes(value.unknownFields)
        if (value.delete_files != false) ProtoAdapter.BOOL.encodeWithTag(writer, 2,
            value.delete_files)
        ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, value.identity)
      }

      override fun decode(reader: ProtoReader): OfflineTaskDeleteRequest {
        val identity = mutableListOf<String>()
        var delete_files: Boolean = false
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> identity.add(ProtoAdapter.STRING.decode(reader))
            2 -> delete_files = ProtoAdapter.BOOL.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return OfflineTaskDeleteRequest(
          identity = identity,
          delete_files = delete_files,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: OfflineTaskDeleteRequest): OfflineTaskDeleteRequest = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
