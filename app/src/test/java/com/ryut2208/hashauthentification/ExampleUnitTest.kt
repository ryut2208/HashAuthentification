package com.ryut2208.hashauthentification

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun sha256Test() {
        assertEquals(
            HashCalculator.calculate("hoge", Algorithm.MD5),
            "ea703e7aa1efda0064eaa507d9e8ab7e"
        )

        assertEquals(
            HashCalculator.calculate("hoge", Algorithm.SHA256),
            "ecb666d778725ec97307044d642bf4d160aabb76f56c0069c71ea25b1e926825"
        )
    }
}
