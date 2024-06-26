// Code generated by Wire protocol buffer compiler, do not edit.
// Source: v6.services.pub.BatchOperationResponse in public_user_file.proto
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

public class BatchOperationResponse(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val task: String = "",
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 1,
  )
  public val status: Int = 0,
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#INT64",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 2,
  )
  public val affected: Long = 0L,
  @field:WireField(
    tag = 4,
    adapter = "com.squareup.wire.ProtoAdapter#INT64",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "createTs",
    schemaIndex = 3,
  )
  public val create_ts: Long = 0L,
  @field:WireField(
    tag = 5,
    adapter = "com.squareup.wire.ProtoAdapter#INT64",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 4,
  )
  public val progress: Long = 0L,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<BatchOperationResponse, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is BatchOperationResponse) return false
    if (unknownFields != other.unknownFields) return false
    if (task != other.task) return false
    if (status != other.status) return false
    if (affected != other.affected) return false
    if (create_ts != other.create_ts) return false
    if (progress != other.progress) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + task.hashCode()
      result = result * 37 + status.hashCode()
      result = result * 37 + affected.hashCode()
      result = result * 37 + create_ts.hashCode()
      result = result * 37 + progress.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """task=${sanitize(task)}"""
    result += """status=$status"""
    result += """affected=$affected"""
    result += """create_ts=$create_ts"""
    result += """progress=$progress"""
    return result.joinToString(prefix = "BatchOperationResponse{", separator = ", ", postfix = "}")
  }

  public fun copy(
    task: String = this.task,
    status: Int = this.status,
    affected: Long = this.affected,
    create_ts: Long = this.create_ts,
    progress: Long = this.progress,
    unknownFields: ByteString = this.unknownFields,
  ): BatchOperationResponse = BatchOperationResponse(task, status, affected, create_ts, progress,
      unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<BatchOperationResponse> = object :
        ProtoAdapter<BatchOperationResponse>(
      FieldEncoding.LENGTH_DELIMITED, 
      BatchOperationResponse::class, 
      "type.googleapis.com/v6.services.pub.BatchOperationResponse", 
      PROTO_3, 
      null, 
      "public_user_file.proto"
    ) {
      override fun encodedSize(`value`: BatchOperationResponse): Int {
        var size = value.unknownFields.size
        if (value.task != "") size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.task)
        if (value.status != 0) size += ProtoAdapter.INT32.encodedSizeWithTag(2, value.status)
        if (value.affected != 0L) size += ProtoAdapter.INT64.encodedSizeWithTag(3, value.affected)
        if (value.create_ts != 0L) size += ProtoAdapter.INT64.encodedSizeWithTag(4, value.create_ts)
        if (value.progress != 0L) size += ProtoAdapter.INT64.encodedSizeWithTag(5, value.progress)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: BatchOperationResponse) {
        if (value.task != "") ProtoAdapter.STRING.encodeWithTag(writer, 1, value.task)
        if (value.status != 0) ProtoAdapter.INT32.encodeWithTag(writer, 2, value.status)
        if (value.affected != 0L) ProtoAdapter.INT64.encodeWithTag(writer, 3, value.affected)
        if (value.create_ts != 0L) ProtoAdapter.INT64.encodeWithTag(writer, 4, value.create_ts)
        if (value.progress != 0L) ProtoAdapter.INT64.encodeWithTag(writer, 5, value.progress)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: BatchOperationResponse) {
        writer.writeBytes(value.unknownFields)
        if (value.progress != 0L) ProtoAdapter.INT64.encodeWithTag(writer, 5, value.progress)
        if (value.create_ts != 0L) ProtoAdapter.INT64.encodeWithTag(writer, 4, value.create_ts)
        if (value.affected != 0L) ProtoAdapter.INT64.encodeWithTag(writer, 3, value.affected)
        if (value.status != 0) ProtoAdapter.INT32.encodeWithTag(writer, 2, value.status)
        if (value.task != "") ProtoAdapter.STRING.encodeWithTag(writer, 1, value.task)
      }

      override fun decode(reader: ProtoReader): BatchOperationResponse {
        var task: String = ""
        var status: Int = 0
        var affected: Long = 0L
        var create_ts: Long = 0L
        var progress: Long = 0L
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> task = ProtoAdapter.STRING.decode(reader)
            2 -> status = ProtoAdapter.INT32.decode(reader)
            3 -> affected = ProtoAdapter.INT64.decode(reader)
            4 -> create_ts = ProtoAdapter.INT64.decode(reader)
            5 -> progress = ProtoAdapter.INT64.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return BatchOperationResponse(
          task = task,
          status = status,
          affected = affected,
          create_ts = create_ts,
          progress = progress,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: BatchOperationResponse): BatchOperationResponse = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
