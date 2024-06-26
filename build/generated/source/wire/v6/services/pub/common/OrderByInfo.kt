// Code generated by Wire protocol buffer compiler, do not edit.
// Source: v6.services.pub.common.OrderByInfo in common/pub_common.proto
@file:Suppress("DEPRECATION")

package v6.services.pub.common

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

public class OrderByInfo(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    declaredName = "field",
    schemaIndex = 0,
  )
  public val field_: String = "",
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 1,
  )
  public val asc: Boolean = false,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<OrderByInfo, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is OrderByInfo) return false
    if (unknownFields != other.unknownFields) return false
    if (field_ != other.field_) return false
    if (asc != other.asc) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + field_.hashCode()
      result = result * 37 + asc.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """field_=${sanitize(field_)}"""
    result += """asc=$asc"""
    return result.joinToString(prefix = "OrderByInfo{", separator = ", ", postfix = "}")
  }

  public fun copy(
    field_: String = this.field_,
    asc: Boolean = this.asc,
    unknownFields: ByteString = this.unknownFields,
  ): OrderByInfo = OrderByInfo(field_, asc, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<OrderByInfo> = object : ProtoAdapter<OrderByInfo>(
      FieldEncoding.LENGTH_DELIMITED, 
      OrderByInfo::class, 
      "type.googleapis.com/v6.services.pub.common.OrderByInfo", 
      PROTO_3, 
      null, 
      "common/pub_common.proto"
    ) {
      override fun encodedSize(`value`: OrderByInfo): Int {
        var size = value.unknownFields.size
        if (value.field_ != "") size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.field_)
        if (value.asc != false) size += ProtoAdapter.BOOL.encodedSizeWithTag(2, value.asc)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: OrderByInfo) {
        if (value.field_ != "") ProtoAdapter.STRING.encodeWithTag(writer, 1, value.field_)
        if (value.asc != false) ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.asc)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: OrderByInfo) {
        writer.writeBytes(value.unknownFields)
        if (value.asc != false) ProtoAdapter.BOOL.encodeWithTag(writer, 2, value.asc)
        if (value.field_ != "") ProtoAdapter.STRING.encodeWithTag(writer, 1, value.field_)
      }

      override fun decode(reader: ProtoReader): OrderByInfo {
        var field_: String = ""
        var asc: Boolean = false
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> field_ = ProtoAdapter.STRING.decode(reader)
            2 -> asc = ProtoAdapter.BOOL.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return OrderByInfo(
          field_ = field_,
          asc = asc,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: OrderByInfo): OrderByInfo = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
