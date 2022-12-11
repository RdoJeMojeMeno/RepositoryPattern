// Code generated by moshi-kotlin-codegen. Do not edit.
package com.example.android.devbyteviewer.network

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.internal.Util
import java.lang.NullPointerException
import kotlin.String
import kotlin.Suppress
import kotlin.collections.emptySet
import kotlin.text.buildString

@Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION")
class NetworkVideoJsonAdapter(
  moshi: Moshi
) : JsonAdapter<NetworkVideo>() {
  private val options: JsonReader.Options = JsonReader.Options.of("title", "description", "url",
      "updated", "thumbnail", "closedCaptions")

  private val stringAdapter: JsonAdapter<String> = moshi.adapter(String::class.java, emptySet(),
      "title")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "closedCaptions")

  override fun toString(): String = buildString(34) {
      append("GeneratedJsonAdapter(").append("NetworkVideo").append(')') }

  override fun fromJson(reader: JsonReader): NetworkVideo {
    var title: String? = null
    var description: String? = null
    var url: String? = null
    var updated: String? = null
    var thumbnail: String? = null
    var closedCaptions: String? = null
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> title = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("title", "title",
            reader)
        1 -> description = stringAdapter.fromJson(reader) ?:
            throw Util.unexpectedNull("description", "description", reader)
        2 -> url = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("url", "url", reader)
        3 -> updated = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("updated",
            "updated", reader)
        4 -> thumbnail = stringAdapter.fromJson(reader) ?: throw Util.unexpectedNull("thumbnail",
            "thumbnail", reader)
        5 -> closedCaptions = nullableStringAdapter.fromJson(reader)
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    return NetworkVideo(
        title = title ?: throw Util.missingProperty("title", "title", reader),
        description = description ?: throw Util.missingProperty("description", "description",
            reader),
        url = url ?: throw Util.missingProperty("url", "url", reader),
        updated = updated ?: throw Util.missingProperty("updated", "updated", reader),
        thumbnail = thumbnail ?: throw Util.missingProperty("thumbnail", "thumbnail", reader),
        closedCaptions = closedCaptions
    )
  }

  override fun toJson(writer: JsonWriter, value: NetworkVideo?) {
    if (value == null) {
      throw NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("title")
    stringAdapter.toJson(writer, value.title)
    writer.name("description")
    stringAdapter.toJson(writer, value.description)
    writer.name("url")
    stringAdapter.toJson(writer, value.url)
    writer.name("updated")
    stringAdapter.toJson(writer, value.updated)
    writer.name("thumbnail")
    stringAdapter.toJson(writer, value.thumbnail)
    writer.name("closedCaptions")
    nullableStringAdapter.toJson(writer, value.closedCaptions)
    writer.endObject()
  }
}
