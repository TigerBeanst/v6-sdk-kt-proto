// Code generated by Wire protocol buffer compiler, do not edit.
// Source: v6.services.pub.FileListResponse in public_user_file.proto
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
import com.squareup.wire.`internal`.redactElements
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
import v6.services.pub.common.ScanListRequest

public class FileListResponse(
  files: List<File> = emptyList(),
  @field:WireField(
    tag = 2,
    adapter = "v6.services.pub.common.ScanListRequest#ADAPTER",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "listInfo",
    schemaIndex = 1,
  )
  public val list_info: ScanListRequest? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<FileListResponse, Nothing>(ADAPTER, unknownFields) {
  @field:WireField(
    tag = 1,
    adapter = "v6.services.pub.File#ADAPTER",
    label = WireField.Label.REPEATED,
    schemaIndex = 0,
  )
  public val files: List<File> = immutableCopyOf("files", files)

  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is FileListResponse) return false
    if (unknownFields != other.unknownFields) return false
    if (files != other.files) return false
    if (list_info != other.list_info) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + files.hashCode()
      result = result * 37 + (list_info?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (files.isNotEmpty()) result += """files=$files"""
    if (list_info != null) result += """list_info=$list_info"""
    return result.joinToString(prefix = "FileListResponse{", separator = ", ", postfix = "}")
  }

  public fun copy(
    files: List<File> = this.files,
    list_info: ScanListRequest? = this.list_info,
    unknownFields: ByteString = this.unknownFields,
  ): FileListResponse = FileListResponse(files, list_info, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<FileListResponse> = object : ProtoAdapter<FileListResponse>(
      FieldEncoding.LENGTH_DELIMITED, 
      FileListResponse::class, 
      "type.googleapis.com/v6.services.pub.FileListResponse", 
      PROTO_3, 
      null, 
      "public_user_file.proto"
    ) {
      override fun encodedSize(`value`: FileListResponse): Int {
        var size = value.unknownFields.size
        size += File.ADAPTER.asRepeated().encodedSizeWithTag(1, value.files)
        if (value.list_info != null) size += ScanListRequest.ADAPTER.encodedSizeWithTag(2,
            value.list_info)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: FileListResponse) {
        File.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.files)
        if (value.list_info != null) ScanListRequest.ADAPTER.encodeWithTag(writer, 2,
            value.list_info)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: FileListResponse) {
        writer.writeBytes(value.unknownFields)
        if (value.list_info != null) ScanListRequest.ADAPTER.encodeWithTag(writer, 2,
            value.list_info)
        File.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.files)
      }

      override fun decode(reader: ProtoReader): FileListResponse {
        val files = mutableListOf<File>()
        var list_info: ScanListRequest? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> files.add(File.ADAPTER.decode(reader))
            2 -> list_info = ScanListRequest.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return FileListResponse(
          files = files,
          list_info = list_info,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: FileListResponse): FileListResponse = value.copy(
        files = value.files.redactElements(File.ADAPTER),
        list_info = value.list_info?.let(ScanListRequest.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}