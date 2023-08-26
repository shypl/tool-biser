package org.shypl.tool.biser

import org.shypl.tool.io.ArrayByteBuffer
import org.shypl.tool.io.readArray
import kotlin.jvm.JvmName

inline fun encodeBiser(block: BiserWriter.() -> Unit): ByteArray {
	val buffer = ArrayByteBuffer()
	val writer = ByteBufferBiserWriter(buffer)
	writer.block()
	return buffer.readArray()
}

inline fun <T> decodeBiser(bytes: ByteArray, block: BiserReader.() -> T): T {
	val buffer = ArrayByteBuffer(bytes)
	val reader = ByteBufferBiserReader(buffer)
	return reader.block()
}


@JvmName("decodeBiserNullable")
inline fun <T> decodeBiser(bytes: ByteArray?, block: BiserReader.() -> T): T? {
	return if (bytes == null) null else decodeBiser(bytes, block)
}