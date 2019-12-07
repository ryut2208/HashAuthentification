package com.ryut2208.hashauthentification

import java.security.MessageDigest

enum class Algorithm(val string: String) {
    MD2("MD2"),
    MD5("MD5"),
    SHA1("SHA-1"),
    SHA256("SHA-256"),
    SHA384("SHA-384"),
    SHA512("SHA-512");
}

class HashCalculator {
    companion object {
        fun calculate(target: String, with: Algorithm): String {
            val digest = MessageDigest.getInstance(with.string)
            digest.update(target.toByteArray())
            val bytes = digest.digest()
            return toHex(bytes)
        }

        private fun toHex(bytes: ByteArray): String {
            val sb = StringBuilder(2 * bytes.size)
            for (byte: Byte in bytes) {
                sb.append(String.format("%02x", byte))
            }
            return sb.toString()
        }
    }

}