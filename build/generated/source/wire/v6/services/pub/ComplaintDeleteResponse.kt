// Code generated by Wire protocol buffer compiler, do not edit.
// Source: v6.services.pub.ComplaintDeleteResponse in file_share.proto
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

public class ComplaintDeleteResponse(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#INT64",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val count: Long = 0L,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<ComplaintDeleteResponse, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is ComplaintDeleteResponse) return false
    if (unknownFields != other.unknownFields) return false
    if (count != other.count) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + count.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """count=$count"""
    return result.joinToString(prefix = "ComplaintDeleteResponse{", separator = ", ", postfix = "}")
  }

  public fun copy(count: Long = this.count, unknownFields: ByteString = this.unknownFields):
      ComplaintDeleteResponse = ComplaintDeleteResponse(count, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<ComplaintDeleteResponse> = object :
        ProtoAdapter<ComplaintDeleteResponse>(
      FieldEncoding.LENGTH_DELIMITED, 
      ComplaintDeleteResponse::class, 
      "type.googleapis.com/v6.services.pub.ComplaintDeleteResponse", 
      PROTO_3, 
      null, 
      "file_share.proto"
    ) {
      override fun encodedSize(`value`: ComplaintDeleteResponse): Int {
        var size = value.unknownFields.size
        if (value.count != 0L) size += ProtoAdapter.INT64.encodedSizeWithTag(1, value.count)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: ComplaintDeleteResponse) {
        if (value.count != 0L) ProtoAdapter.INT64.encodeWithTag(writer, 1, value.count)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: ComplaintDeleteResponse) {
        writer.writeBytes(value.unknownFields)
        if (value.count != 0L) ProtoAdapter.INT64.encodeWithTag(writer, 1, value.count)
      }

      override fun decode(reader: ProtoReader): ComplaintDeleteResponse {
        var count: Long = 0L
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> count = ProtoAdapter.INT64.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return ComplaintDeleteResponse(
          count = count,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: ComplaintDeleteResponse): ComplaintDeleteResponse = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
