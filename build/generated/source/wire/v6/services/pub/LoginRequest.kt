// Code generated by Wire protocol buffer compiler, do not edit.
// Source: v6.services.pub.LoginRequest in user_svc.proto
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

public class LoginRequest(
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
    schemaIndex = 1,
  )
  public val password: String = "",
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 2,
  )
  public val addon: String = "",
  @field:WireField(
    tag = 4,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 3,
  )
  public val input: String = "",
  @field:WireField(
    tag = 5,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 4,
  )
  public val type: String = "",
  @field:WireField(
    tag = 6,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 5,
  )
  public val callback: String = "",
  @field:WireField(
    tag = 7,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "returnUrl",
    schemaIndex = 6,
  )
  public val return_url: String = "",
  @field:WireField(
    tag = 8,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "returnType",
    schemaIndex = 7,
  )
  public val return_type: Int = 0,
  @field:WireField(
    tag = 9,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 8,
  )
  public val captcha: String = "",
  @field:WireField(
    tag = 10,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 9,
  )
  public val state: String = "",
  @field:WireField(
    tag = 11,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "countryCode",
    schemaIndex = 10,
  )
  public val country_code: String = "",
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<LoginRequest, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is LoginRequest) return false
    if (unknownFields != other.unknownFields) return false
    if (identity != other.identity) return false
    if (password != other.password) return false
    if (addon != other.addon) return false
    if (input != other.input) return false
    if (type != other.type) return false
    if (callback != other.callback) return false
    if (return_url != other.return_url) return false
    if (return_type != other.return_type) return false
    if (captcha != other.captcha) return false
    if (state != other.state) return false
    if (country_code != other.country_code) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + identity.hashCode()
      result = result * 37 + password.hashCode()
      result = result * 37 + addon.hashCode()
      result = result * 37 + input.hashCode()
      result = result * 37 + type.hashCode()
      result = result * 37 + callback.hashCode()
      result = result * 37 + return_url.hashCode()
      result = result * 37 + return_type.hashCode()
      result = result * 37 + captcha.hashCode()
      result = result * 37 + state.hashCode()
      result = result * 37 + country_code.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """identity=${sanitize(identity)}"""
    result += """password=${sanitize(password)}"""
    result += """addon=${sanitize(addon)}"""
    result += """input=${sanitize(input)}"""
    result += """type=${sanitize(type)}"""
    result += """callback=${sanitize(callback)}"""
    result += """return_url=${sanitize(return_url)}"""
    result += """return_type=$return_type"""
    result += """captcha=${sanitize(captcha)}"""
    result += """state=${sanitize(state)}"""
    result += """country_code=${sanitize(country_code)}"""
    return result.joinToString(prefix = "LoginRequest{", separator = ", ", postfix = "}")
  }

  public fun copy(
    identity: String = this.identity,
    password: String = this.password,
    addon: String = this.addon,
    input: String = this.input,
    type: String = this.type,
    callback: String = this.callback,
    return_url: String = this.return_url,
    return_type: Int = this.return_type,
    captcha: String = this.captcha,
    state: String = this.state,
    country_code: String = this.country_code,
    unknownFields: ByteString = this.unknownFields,
  ): LoginRequest = LoginRequest(identity, password, addon, input, type, callback, return_url,
      return_type, captcha, state, country_code, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<LoginRequest> = object : ProtoAdapter<LoginRequest>(
      FieldEncoding.LENGTH_DELIMITED, 
      LoginRequest::class, 
      "type.googleapis.com/v6.services.pub.LoginRequest", 
      PROTO_3, 
      null, 
      "user_svc.proto"
    ) {
      override fun encodedSize(`value`: LoginRequest): Int {
        var size = value.unknownFields.size
        if (value.identity != "") size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.identity)
        if (value.password != "") size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.password)
        if (value.addon != "") size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.addon)
        if (value.input != "") size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.input)
        if (value.type != "") size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.type)
        if (value.callback != "") size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.callback)
        if (value.return_url != "") size += ProtoAdapter.STRING.encodedSizeWithTag(7,
            value.return_url)
        if (value.return_type != 0) size += ProtoAdapter.INT32.encodedSizeWithTag(8,
            value.return_type)
        if (value.captcha != "") size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.captcha)
        if (value.state != "") size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.state)
        if (value.country_code != "") size += ProtoAdapter.STRING.encodedSizeWithTag(11,
            value.country_code)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: LoginRequest) {
        if (value.identity != "") ProtoAdapter.STRING.encodeWithTag(writer, 1, value.identity)
        if (value.password != "") ProtoAdapter.STRING.encodeWithTag(writer, 2, value.password)
        if (value.addon != "") ProtoAdapter.STRING.encodeWithTag(writer, 3, value.addon)
        if (value.input != "") ProtoAdapter.STRING.encodeWithTag(writer, 4, value.input)
        if (value.type != "") ProtoAdapter.STRING.encodeWithTag(writer, 5, value.type)
        if (value.callback != "") ProtoAdapter.STRING.encodeWithTag(writer, 6, value.callback)
        if (value.return_url != "") ProtoAdapter.STRING.encodeWithTag(writer, 7, value.return_url)
        if (value.return_type != 0) ProtoAdapter.INT32.encodeWithTag(writer, 8, value.return_type)
        if (value.captcha != "") ProtoAdapter.STRING.encodeWithTag(writer, 9, value.captcha)
        if (value.state != "") ProtoAdapter.STRING.encodeWithTag(writer, 10, value.state)
        if (value.country_code != "") ProtoAdapter.STRING.encodeWithTag(writer, 11,
            value.country_code)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: LoginRequest) {
        writer.writeBytes(value.unknownFields)
        if (value.country_code != "") ProtoAdapter.STRING.encodeWithTag(writer, 11,
            value.country_code)
        if (value.state != "") ProtoAdapter.STRING.encodeWithTag(writer, 10, value.state)
        if (value.captcha != "") ProtoAdapter.STRING.encodeWithTag(writer, 9, value.captcha)
        if (value.return_type != 0) ProtoAdapter.INT32.encodeWithTag(writer, 8, value.return_type)
        if (value.return_url != "") ProtoAdapter.STRING.encodeWithTag(writer, 7, value.return_url)
        if (value.callback != "") ProtoAdapter.STRING.encodeWithTag(writer, 6, value.callback)
        if (value.type != "") ProtoAdapter.STRING.encodeWithTag(writer, 5, value.type)
        if (value.input != "") ProtoAdapter.STRING.encodeWithTag(writer, 4, value.input)
        if (value.addon != "") ProtoAdapter.STRING.encodeWithTag(writer, 3, value.addon)
        if (value.password != "") ProtoAdapter.STRING.encodeWithTag(writer, 2, value.password)
        if (value.identity != "") ProtoAdapter.STRING.encodeWithTag(writer, 1, value.identity)
      }

      override fun decode(reader: ProtoReader): LoginRequest {
        var identity: String = ""
        var password: String = ""
        var addon: String = ""
        var input: String = ""
        var type: String = ""
        var callback: String = ""
        var return_url: String = ""
        var return_type: Int = 0
        var captcha: String = ""
        var state: String = ""
        var country_code: String = ""
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> identity = ProtoAdapter.STRING.decode(reader)
            2 -> password = ProtoAdapter.STRING.decode(reader)
            3 -> addon = ProtoAdapter.STRING.decode(reader)
            4 -> input = ProtoAdapter.STRING.decode(reader)
            5 -> type = ProtoAdapter.STRING.decode(reader)
            6 -> callback = ProtoAdapter.STRING.decode(reader)
            7 -> return_url = ProtoAdapter.STRING.decode(reader)
            8 -> return_type = ProtoAdapter.INT32.decode(reader)
            9 -> captcha = ProtoAdapter.STRING.decode(reader)
            10 -> state = ProtoAdapter.STRING.decode(reader)
            11 -> country_code = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return LoginRequest(
          identity = identity,
          password = password,
          addon = addon,
          input = input,
          type = type,
          callback = callback,
          return_url = return_url,
          return_type = return_type,
          captcha = captcha,
          state = state,
          country_code = country_code,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: LoginRequest): LoginRequest = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
