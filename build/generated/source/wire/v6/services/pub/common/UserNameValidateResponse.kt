// Code generated by Wire protocol buffer compiler, do not edit.
// Source: v6.services.pub.common.UserNameValidateResponse in common/pub_common.proto
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

public class UserNameValidateResponse(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val code: Int = 0,
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 1,
  )
  public val message: String = "",
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 2,
  )
  public val valid: Boolean = false,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<UserNameValidateResponse, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is UserNameValidateResponse) return false
    if (unknownFields != other.unknownFields) return false
    if (code != other.code) return false
    if (message != other.message) return false
    if (valid != other.valid) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + code.hashCode()
      result = result * 37 + message.hashCode()
      result = result * 37 + valid.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """code=$code"""
    result += """message=${sanitize(message)}"""
    result += """valid=$valid"""
    return result.joinToString(prefix = "UserNameValidateResponse{", separator = ", ", postfix =
        "}")
  }

  public fun copy(
    code: Int = this.code,
    message: String = this.message,
    valid: Boolean = this.valid,
    unknownFields: ByteString = this.unknownFields,
  ): UserNameValidateResponse = UserNameValidateResponse(code, message, valid, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<UserNameValidateResponse> = object :
        ProtoAdapter<UserNameValidateResponse>(
      FieldEncoding.LENGTH_DELIMITED, 
      UserNameValidateResponse::class, 
      "type.googleapis.com/v6.services.pub.common.UserNameValidateResponse", 
      PROTO_3, 
      null, 
      "common/pub_common.proto"
    ) {
      override fun encodedSize(`value`: UserNameValidateResponse): Int {
        var size = value.unknownFields.size
        if (value.code != 0) size += ProtoAdapter.INT32.encodedSizeWithTag(1, value.code)
        if (value.message != "") size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.message)
        if (value.valid != false) size += ProtoAdapter.BOOL.encodedSizeWithTag(3, value.valid)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: UserNameValidateResponse) {
        if (value.code != 0) ProtoAdapter.INT32.encodeWithTag(writer, 1, value.code)
        if (value.message != "") ProtoAdapter.STRING.encodeWithTag(writer, 2, value.message)
        if (value.valid != false) ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.valid)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: UserNameValidateResponse) {
        writer.writeBytes(value.unknownFields)
        if (value.valid != false) ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.valid)
        if (value.message != "") ProtoAdapter.STRING.encodeWithTag(writer, 2, value.message)
        if (value.code != 0) ProtoAdapter.INT32.encodeWithTag(writer, 1, value.code)
      }

      override fun decode(reader: ProtoReader): UserNameValidateResponse {
        var code: Int = 0
        var message: String = ""
        var valid: Boolean = false
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> code = ProtoAdapter.INT32.decode(reader)
            2 -> message = ProtoAdapter.STRING.decode(reader)
            3 -> valid = ProtoAdapter.BOOL.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return UserNameValidateResponse(
          code = code,
          message = message,
          valid = valid,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: UserNameValidateResponse): UserNameValidateResponse = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
