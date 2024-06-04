// Code generated by Wire protocol buffer compiler, do not edit.
// Source: v6.services.pub.ChangePasswordRequest in user_svc.proto
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

public class ChangePasswordRequest(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val identity: String = "",
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "oldPassword",
    schemaIndex = 1,
  )
  public val old_password: String = "",
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "newPassword",
    schemaIndex = 2,
  )
  public val new_password: String = "",
  @field:WireField(
    tag = 4,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 3,
  )
  public val addon: String = "",
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<ChangePasswordRequest, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is ChangePasswordRequest) return false
    if (unknownFields != other.unknownFields) return false
    if (identity != other.identity) return false
    if (old_password != other.old_password) return false
    if (new_password != other.new_password) return false
    if (addon != other.addon) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + identity.hashCode()
      result = result * 37 + old_password.hashCode()
      result = result * 37 + new_password.hashCode()
      result = result * 37 + addon.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """identity=${sanitize(identity)}"""
    result += """old_password=${sanitize(old_password)}"""
    result += """new_password=${sanitize(new_password)}"""
    result += """addon=${sanitize(addon)}"""
    return result.joinToString(prefix = "ChangePasswordRequest{", separator = ", ", postfix = "}")
  }

  public fun copy(
    identity: String = this.identity,
    old_password: String = this.old_password,
    new_password: String = this.new_password,
    addon: String = this.addon,
    unknownFields: ByteString = this.unknownFields,
  ): ChangePasswordRequest = ChangePasswordRequest(identity, old_password, new_password, addon,
      unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<ChangePasswordRequest> = object :
        ProtoAdapter<ChangePasswordRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      ChangePasswordRequest::class, 
      "type.googleapis.com/v6.services.pub.ChangePasswordRequest", 
      PROTO_3, 
      null, 
      "user_svc.proto"
    ) {
      override fun encodedSize(`value`: ChangePasswordRequest): Int {
        var size = value.unknownFields.size
        if (value.identity != "") size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.identity)
        if (value.old_password != "") size += ProtoAdapter.STRING.encodedSizeWithTag(2,
            value.old_password)
        if (value.new_password != "") size += ProtoAdapter.STRING.encodedSizeWithTag(3,
            value.new_password)
        if (value.addon != "") size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.addon)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: ChangePasswordRequest) {
        if (value.identity != "") ProtoAdapter.STRING.encodeWithTag(writer, 1, value.identity)
        if (value.old_password != "") ProtoAdapter.STRING.encodeWithTag(writer, 2,
            value.old_password)
        if (value.new_password != "") ProtoAdapter.STRING.encodeWithTag(writer, 3,
            value.new_password)
        if (value.addon != "") ProtoAdapter.STRING.encodeWithTag(writer, 4, value.addon)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: ChangePasswordRequest) {
        writer.writeBytes(value.unknownFields)
        if (value.addon != "") ProtoAdapter.STRING.encodeWithTag(writer, 4, value.addon)
        if (value.new_password != "") ProtoAdapter.STRING.encodeWithTag(writer, 3,
            value.new_password)
        if (value.old_password != "") ProtoAdapter.STRING.encodeWithTag(writer, 2,
            value.old_password)
        if (value.identity != "") ProtoAdapter.STRING.encodeWithTag(writer, 1, value.identity)
      }

      override fun decode(reader: ProtoReader): ChangePasswordRequest {
        var identity: String = ""
        var old_password: String = ""
        var new_password: String = ""
        var addon: String = ""
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> identity = ProtoAdapter.STRING.decode(reader)
            2 -> old_password = ProtoAdapter.STRING.decode(reader)
            3 -> new_password = ProtoAdapter.STRING.decode(reader)
            4 -> addon = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return ChangePasswordRequest(
          identity = identity,
          old_password = old_password,
          new_password = new_password,
          addon = addon,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: ChangePasswordRequest): ChangePasswordRequest = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
