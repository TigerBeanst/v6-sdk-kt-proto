// Code generated by Wire protocol buffer compiler, do not edit.
// Source: v6.services.pub.SftpConfig in public_sftp.proto
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

public class SftpConfig(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "userIdentity",
    schemaIndex = 0,
  )
  public val user_identity: String = "",
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "enableFlag",
    schemaIndex = 1,
  )
  public val enable_flag: Int = 0,
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 2,
  )
  public val root: String = "",
  @field:WireField(
    tag = 4,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "writeFlag",
    schemaIndex = 3,
  )
  public val write_flag: Int = 0,
  @field:WireField(
    tag = 5,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "lockFlag",
    schemaIndex = 4,
  )
  public val lock_flag: Int = 0,
  @field:WireField(
    tag = 6,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "chunkedFlag",
    schemaIndex = 5,
  )
  public val chunked_flag: Int = 0,
  @field:WireField(
    tag = 7,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "pathStyle",
    schemaIndex = 6,
  )
  public val path_style: Int = 0,
  @field:WireField(
    tag = 8,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 7,
  )
  public val status: Int = 0,
  @field:WireField(
    tag = 9,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 8,
  )
  public val prefix: String = "",
  @field:WireField(
    tag = 10,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 9,
  )
  public val code: Int = 0,
  @field:WireField(
    tag = 11,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 10,
  )
  public val message: String = "",
  @field:WireField(
    tag = 12,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 11,
  )
  public val username: String = "",
  @field:WireField(
    tag = 13,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 12,
  )
  public val password: String = "",
  @field:WireField(
    tag = 14,
    adapter = "com.squareup.wire.ProtoAdapter#INT64",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "updateTs",
    schemaIndex = 13,
  )
  public val update_ts: Long = 0L,
  @field:WireField(
    tag = 15,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "sshKey",
    schemaIndex = 14,
  )
  public val ssh_key: String = "",
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<SftpConfig, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is SftpConfig) return false
    if (unknownFields != other.unknownFields) return false
    if (user_identity != other.user_identity) return false
    if (enable_flag != other.enable_flag) return false
    if (root != other.root) return false
    if (write_flag != other.write_flag) return false
    if (lock_flag != other.lock_flag) return false
    if (chunked_flag != other.chunked_flag) return false
    if (path_style != other.path_style) return false
    if (status != other.status) return false
    if (prefix != other.prefix) return false
    if (code != other.code) return false
    if (message != other.message) return false
    if (username != other.username) return false
    if (password != other.password) return false
    if (update_ts != other.update_ts) return false
    if (ssh_key != other.ssh_key) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + user_identity.hashCode()
      result = result * 37 + enable_flag.hashCode()
      result = result * 37 + root.hashCode()
      result = result * 37 + write_flag.hashCode()
      result = result * 37 + lock_flag.hashCode()
      result = result * 37 + chunked_flag.hashCode()
      result = result * 37 + path_style.hashCode()
      result = result * 37 + status.hashCode()
      result = result * 37 + prefix.hashCode()
      result = result * 37 + code.hashCode()
      result = result * 37 + message.hashCode()
      result = result * 37 + username.hashCode()
      result = result * 37 + password.hashCode()
      result = result * 37 + update_ts.hashCode()
      result = result * 37 + ssh_key.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """user_identity=${sanitize(user_identity)}"""
    result += """enable_flag=$enable_flag"""
    result += """root=${sanitize(root)}"""
    result += """write_flag=$write_flag"""
    result += """lock_flag=$lock_flag"""
    result += """chunked_flag=$chunked_flag"""
    result += """path_style=$path_style"""
    result += """status=$status"""
    result += """prefix=${sanitize(prefix)}"""
    result += """code=$code"""
    result += """message=${sanitize(message)}"""
    result += """username=${sanitize(username)}"""
    result += """password=${sanitize(password)}"""
    result += """update_ts=$update_ts"""
    result += """ssh_key=${sanitize(ssh_key)}"""
    return result.joinToString(prefix = "SftpConfig{", separator = ", ", postfix = "}")
  }

  public fun copy(
    user_identity: String = this.user_identity,
    enable_flag: Int = this.enable_flag,
    root: String = this.root,
    write_flag: Int = this.write_flag,
    lock_flag: Int = this.lock_flag,
    chunked_flag: Int = this.chunked_flag,
    path_style: Int = this.path_style,
    status: Int = this.status,
    prefix: String = this.prefix,
    code: Int = this.code,
    message: String = this.message,
    username: String = this.username,
    password: String = this.password,
    update_ts: Long = this.update_ts,
    ssh_key: String = this.ssh_key,
    unknownFields: ByteString = this.unknownFields,
  ): SftpConfig = SftpConfig(user_identity, enable_flag, root, write_flag, lock_flag, chunked_flag,
      path_style, status, prefix, code, message, username, password, update_ts, ssh_key,
      unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<SftpConfig> = object : ProtoAdapter<SftpConfig>(
      FieldEncoding.LENGTH_DELIMITED, 
      SftpConfig::class, 
      "type.googleapis.com/v6.services.pub.SftpConfig", 
      PROTO_3, 
      null, 
      "public_sftp.proto"
    ) {
      override fun encodedSize(`value`: SftpConfig): Int {
        var size = value.unknownFields.size
        if (value.user_identity != "") size += ProtoAdapter.STRING.encodedSizeWithTag(1,
            value.user_identity)
        if (value.enable_flag != 0) size += ProtoAdapter.INT32.encodedSizeWithTag(2,
            value.enable_flag)
        if (value.root != "") size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.root)
        if (value.write_flag != 0) size += ProtoAdapter.INT32.encodedSizeWithTag(4,
            value.write_flag)
        if (value.lock_flag != 0) size += ProtoAdapter.INT32.encodedSizeWithTag(5, value.lock_flag)
        if (value.chunked_flag != 0) size += ProtoAdapter.INT32.encodedSizeWithTag(6,
            value.chunked_flag)
        if (value.path_style != 0) size += ProtoAdapter.INT32.encodedSizeWithTag(7,
            value.path_style)
        if (value.status != 0) size += ProtoAdapter.INT32.encodedSizeWithTag(8, value.status)
        if (value.prefix != "") size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.prefix)
        if (value.code != 0) size += ProtoAdapter.INT32.encodedSizeWithTag(10, value.code)
        if (value.message != "") size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.message)
        if (value.username != "") size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.username)
        if (value.password != "") size += ProtoAdapter.STRING.encodedSizeWithTag(13, value.password)
        if (value.update_ts != 0L) size += ProtoAdapter.INT64.encodedSizeWithTag(14,
            value.update_ts)
        if (value.ssh_key != "") size += ProtoAdapter.STRING.encodedSizeWithTag(15, value.ssh_key)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: SftpConfig) {
        if (value.user_identity != "") ProtoAdapter.STRING.encodeWithTag(writer, 1,
            value.user_identity)
        if (value.enable_flag != 0) ProtoAdapter.INT32.encodeWithTag(writer, 2, value.enable_flag)
        if (value.root != "") ProtoAdapter.STRING.encodeWithTag(writer, 3, value.root)
        if (value.write_flag != 0) ProtoAdapter.INT32.encodeWithTag(writer, 4, value.write_flag)
        if (value.lock_flag != 0) ProtoAdapter.INT32.encodeWithTag(writer, 5, value.lock_flag)
        if (value.chunked_flag != 0) ProtoAdapter.INT32.encodeWithTag(writer, 6, value.chunked_flag)
        if (value.path_style != 0) ProtoAdapter.INT32.encodeWithTag(writer, 7, value.path_style)
        if (value.status != 0) ProtoAdapter.INT32.encodeWithTag(writer, 8, value.status)
        if (value.prefix != "") ProtoAdapter.STRING.encodeWithTag(writer, 9, value.prefix)
        if (value.code != 0) ProtoAdapter.INT32.encodeWithTag(writer, 10, value.code)
        if (value.message != "") ProtoAdapter.STRING.encodeWithTag(writer, 11, value.message)
        if (value.username != "") ProtoAdapter.STRING.encodeWithTag(writer, 12, value.username)
        if (value.password != "") ProtoAdapter.STRING.encodeWithTag(writer, 13, value.password)
        if (value.update_ts != 0L) ProtoAdapter.INT64.encodeWithTag(writer, 14, value.update_ts)
        if (value.ssh_key != "") ProtoAdapter.STRING.encodeWithTag(writer, 15, value.ssh_key)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: SftpConfig) {
        writer.writeBytes(value.unknownFields)
        if (value.ssh_key != "") ProtoAdapter.STRING.encodeWithTag(writer, 15, value.ssh_key)
        if (value.update_ts != 0L) ProtoAdapter.INT64.encodeWithTag(writer, 14, value.update_ts)
        if (value.password != "") ProtoAdapter.STRING.encodeWithTag(writer, 13, value.password)
        if (value.username != "") ProtoAdapter.STRING.encodeWithTag(writer, 12, value.username)
        if (value.message != "") ProtoAdapter.STRING.encodeWithTag(writer, 11, value.message)
        if (value.code != 0) ProtoAdapter.INT32.encodeWithTag(writer, 10, value.code)
        if (value.prefix != "") ProtoAdapter.STRING.encodeWithTag(writer, 9, value.prefix)
        if (value.status != 0) ProtoAdapter.INT32.encodeWithTag(writer, 8, value.status)
        if (value.path_style != 0) ProtoAdapter.INT32.encodeWithTag(writer, 7, value.path_style)
        if (value.chunked_flag != 0) ProtoAdapter.INT32.encodeWithTag(writer, 6, value.chunked_flag)
        if (value.lock_flag != 0) ProtoAdapter.INT32.encodeWithTag(writer, 5, value.lock_flag)
        if (value.write_flag != 0) ProtoAdapter.INT32.encodeWithTag(writer, 4, value.write_flag)
        if (value.root != "") ProtoAdapter.STRING.encodeWithTag(writer, 3, value.root)
        if (value.enable_flag != 0) ProtoAdapter.INT32.encodeWithTag(writer, 2, value.enable_flag)
        if (value.user_identity != "") ProtoAdapter.STRING.encodeWithTag(writer, 1,
            value.user_identity)
      }

      override fun decode(reader: ProtoReader): SftpConfig {
        var user_identity: String = ""
        var enable_flag: Int = 0
        var root: String = ""
        var write_flag: Int = 0
        var lock_flag: Int = 0
        var chunked_flag: Int = 0
        var path_style: Int = 0
        var status: Int = 0
        var prefix: String = ""
        var code: Int = 0
        var message: String = ""
        var username: String = ""
        var password: String = ""
        var update_ts: Long = 0L
        var ssh_key: String = ""
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> user_identity = ProtoAdapter.STRING.decode(reader)
            2 -> enable_flag = ProtoAdapter.INT32.decode(reader)
            3 -> root = ProtoAdapter.STRING.decode(reader)
            4 -> write_flag = ProtoAdapter.INT32.decode(reader)
            5 -> lock_flag = ProtoAdapter.INT32.decode(reader)
            6 -> chunked_flag = ProtoAdapter.INT32.decode(reader)
            7 -> path_style = ProtoAdapter.INT32.decode(reader)
            8 -> status = ProtoAdapter.INT32.decode(reader)
            9 -> prefix = ProtoAdapter.STRING.decode(reader)
            10 -> code = ProtoAdapter.INT32.decode(reader)
            11 -> message = ProtoAdapter.STRING.decode(reader)
            12 -> username = ProtoAdapter.STRING.decode(reader)
            13 -> password = ProtoAdapter.STRING.decode(reader)
            14 -> update_ts = ProtoAdapter.INT64.decode(reader)
            15 -> ssh_key = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return SftpConfig(
          user_identity = user_identity,
          enable_flag = enable_flag,
          root = root,
          write_flag = write_flag,
          lock_flag = lock_flag,
          chunked_flag = chunked_flag,
          path_style = path_style,
          status = status,
          prefix = prefix,
          code = code,
          message = message,
          username = username,
          password = password,
          update_ts = update_ts,
          ssh_key = ssh_key,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: SftpConfig): SftpConfig = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
