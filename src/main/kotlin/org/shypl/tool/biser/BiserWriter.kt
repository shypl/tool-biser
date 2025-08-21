package org.shypl.tool.biser

import java.time.LocalDate
import java.time.LocalDateTime

interface BiserWriter {
	fun writeBoolean(value: Boolean)
	
	fun writeByte(value: Byte)
	
	fun writeInt(value: Int)
	
	fun writeLong(value: Long)
	
	fun writeDouble(value: Double)
	
	
	fun writeBooleanArray(value: BooleanArray, offset: Int = 0, size: Int = value.size)
	
	fun writeByteArray(value: ByteArray, offset: Int = 0, size: Int = value.size)
	
	fun writeIntArray(value: IntArray, offset: Int = 0, size: Int = value.size)
	
	fun writeLongArray(value: LongArray, offset: Int = 0, size: Int = value.size)
	
	fun writeDoubleArray(value: DoubleArray, offset: Int = 0, size: Int = value.size)
	
	
	fun writeString(value: String)
	
	fun writeStringNullable(value: String?)
	
	fun writeDate(value: LocalDate)
	
	fun writeDateNullable(value: LocalDate?)
	
	fun writeDateTime(value: LocalDateTime)
	
	fun writeDateTimeNullable(value: LocalDateTime?)
	
	
	fun <E> writeList(value: Collection<E>, encoder: Encoder<E>)
	
	fun <E> writeList(value: Array<E>, encoder: Encoder<E>)
	
	fun <K, V> writeMap(value: Map<K, V>, keyEncoder: Encoder<K>, valueEncoder: Encoder<V>)
	
	fun <T> write(value: T, encoder: Encoder<T>)
}