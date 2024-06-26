// Code generated by Wire protocol buffer compiler, do not edit.
// Source: v6.services.pub.Slice in slice_svc.proto
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

public class Slice(
  /**
   * identity
   */
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val identity: String = "",
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 1,
  )
  public val type: Int = 0,
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 2,
  )
  public val status: Int = 0,
  @field:WireField(
    tag = 5,
    adapter = "com.squareup.wire.ProtoAdapter#INT64",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "updateTs",
    schemaIndex = 3,
  )
  public val update_ts: Long = 0L,
  @field:WireField(
    tag = 6,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 4,
  )
  public val peer: String = "",
  @field:WireField(
    tag = 7,
    adapter = "com.squareup.wire.ProtoAdapter#INT64",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "createTs",
    schemaIndex = 5,
  )
  public val create_ts: Long = 0L,
  @field:WireField(
    tag = 8,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 6,
  )
  public val server: String = "",
  @field:WireField(
    tag = 9,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "needData",
    schemaIndex = 7,
  )
  public val need_data: Boolean = false,
  @field:WireField(
    tag = 10,
    adapter = "com.squareup.wire.ProtoAdapter#BYTES",
    label = WireField.Label.OMIT_IDENTITY,
    declaredName = "data",
    schemaIndex = 8,
  )
  public val data_: ByteString = ByteString.EMPTY,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<Slice, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is Slice) return false
    if (unknownFields != other.unknownFields) return false
    if (identity != other.identity) return false
    if (type != other.type) return false
    if (status != other.status) return false
    if (update_ts != other.update_ts) return false
    if (peer != other.peer) return false
    if (create_ts != other.create_ts) return false
    if (server != other.server) return false
    if (need_data != other.need_data) return false
    if (data_ != other.data_) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + identity.hashCode()
      result = result * 37 + type.hashCode()
      result = result * 37 + status.hashCode()
      result = result * 37 + update_ts.hashCode()
      result = result * 37 + peer.hashCode()
      result = result * 37 + create_ts.hashCode()
      result = result * 37 + server.hashCode()
      result = result * 37 + need_data.hashCode()
      result = result * 37 + data_.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """identity=${sanitize(identity)}"""
    result += """type=$type"""
    result += """status=$status"""
    result += """update_ts=$update_ts"""
    result += """peer=${sanitize(peer)}"""
    result += """create_ts=$create_ts"""
    result += """server=${sanitize(server)}"""
    result += """need_data=$need_data"""
    result += """data_=$data_"""
    return result.joinToString(prefix = "Slice{", separator = ", ", postfix = "}")
  }

  public fun copy(
    identity: String = this.identity,
    type: Int = this.type,
    status: Int = this.status,
    update_ts: Long = this.update_ts,
    peer: String = this.peer,
    create_ts: Long = this.create_ts,
    server: String = this.server,
    need_data: Boolean = this.need_data,
    data_: ByteString = this.data_,
    unknownFields: ByteString = this.unknownFields,
  ): Slice = Slice(identity, type, status, update_ts, peer, create_ts, server, need_data, data_,
      unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<Slice> = object : ProtoAdapter<Slice>(
      FieldEncoding.LENGTH_DELIMITED, 
      Slice::class, 
      "type.googleapis.com/v6.services.pub.Slice", 
      PROTO_3, 
      null, 
      "slice_svc.proto"
    ) {
      override fun encodedSize(`value`: Slice): Int {
        var size = value.unknownFields.size
        if (value.identity != "") size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.identity)
        if (value.type != 0) size += ProtoAdapter.INT32.encodedSizeWithTag(2, value.type)
        if (value.status != 0) size += ProtoAdapter.INT32.encodedSizeWithTag(3, value.status)
        if (value.update_ts != 0L) size += ProtoAdapter.INT64.encodedSizeWithTag(5, value.update_ts)
        if (value.peer != "") size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.peer)
        if (value.create_ts != 0L) size += ProtoAdapter.INT64.encodedSizeWithTag(7, value.create_ts)
        if (value.server != "") size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.server)
        if (value.need_data != false) size += ProtoAdapter.BOOL.encodedSizeWithTag(9,
            value.need_data)
        if (value.data_ != ByteString.EMPTY) size += ProtoAdapter.BYTES.encodedSizeWithTag(10,
            value.data_)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: Slice) {
        if (value.identity != "") ProtoAdapter.STRING.encodeWithTag(writer, 1, value.identity)
        if (value.type != 0) ProtoAdapter.INT32.encodeWithTag(writer, 2, value.type)
        if (value.status != 0) ProtoAdapter.INT32.encodeWithTag(writer, 3, value.status)
        if (value.update_ts != 0L) ProtoAdapter.INT64.encodeWithTag(writer, 5, value.update_ts)
        if (value.peer != "") ProtoAdapter.STRING.encodeWithTag(writer, 6, value.peer)
        if (value.create_ts != 0L) ProtoAdapter.INT64.encodeWithTag(writer, 7, value.create_ts)
        if (value.server != "") ProtoAdapter.STRING.encodeWithTag(writer, 8, value.server)
        if (value.need_data != false) ProtoAdapter.BOOL.encodeWithTag(writer, 9, value.need_data)
        if (value.data_ != ByteString.EMPTY) ProtoAdapter.BYTES.encodeWithTag(writer, 10,
            value.data_)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: Slice) {
        writer.writeBytes(value.unknownFields)
        if (value.data_ != ByteString.EMPTY) ProtoAdapter.BYTES.encodeWithTag(writer, 10,
            value.data_)
        if (value.need_data != false) ProtoAdapter.BOOL.encodeWithTag(writer, 9, value.need_data)
        if (value.server != "") ProtoAdapter.STRING.encodeWithTag(writer, 8, value.server)
        if (value.create_ts != 0L) ProtoAdapter.INT64.encodeWithTag(writer, 7, value.create_ts)
        if (value.peer != "") ProtoAdapter.STRING.encodeWithTag(writer, 6, value.peer)
        if (value.update_ts != 0L) ProtoAdapter.INT64.encodeWithTag(writer, 5, value.update_ts)
        if (value.status != 0) ProtoAdapter.INT32.encodeWithTag(writer, 3, value.status)
        if (value.type != 0) ProtoAdapter.INT32.encodeWithTag(writer, 2, value.type)
        if (value.identity != "") ProtoAdapter.STRING.encodeWithTag(writer, 1, value.identity)
      }

      override fun decode(reader: ProtoReader): Slice {
        var identity: String = ""
        var type: Int = 0
        var status: Int = 0
        var update_ts: Long = 0L
        var peer: String = ""
        var create_ts: Long = 0L
        var server: String = ""
        var need_data: Boolean = false
        var data_: ByteString = ByteString.EMPTY
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> identity = ProtoAdapter.STRING.decode(reader)
            2 -> type = ProtoAdapter.INT32.decode(reader)
            3 -> status = ProtoAdapter.INT32.decode(reader)
            5 -> update_ts = ProtoAdapter.INT64.decode(reader)
            6 -> peer = ProtoAdapter.STRING.decode(reader)
            7 -> create_ts = ProtoAdapter.INT64.decode(reader)
            8 -> server = ProtoAdapter.STRING.decode(reader)
            9 -> need_data = ProtoAdapter.BOOL.decode(reader)
            10 -> data_ = ProtoAdapter.BYTES.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return Slice(
          identity = identity,
          type = type,
          status = status,
          update_ts = update_ts,
          peer = peer,
          create_ts = create_ts,
          server = server,
          need_data = need_data,
          data_ = data_,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: Slice): Slice = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
