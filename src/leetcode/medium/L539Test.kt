package leetcode.medium

import junit.framework.Assert.assertEquals
import org.junit.Test

class L539Test {
    @Test
    fun findMinDifferenceA() {
        assertEquals(findMinDifference(listOf("01:00", "23:59")), 61)
    }

    @Test
    fun findMinDifferenceB() {
        assertEquals(findMinDifference(listOf("01:01", "02:01")), 60)
    }

    @Test
    fun findMinDifferenceC() {
        assertEquals(findMinDifference(listOf("01:01", "02:02")), 61)
    }

    @Test
    fun findMinDifferenceD() {
        assertEquals(findMinDifference(listOf("02:00", "23:59")), 1)
    }

    @Test
    fun findMinDifferenceE() {
        assertEquals(findMinDifference(listOf("23:00", "00:00")), 60)
    }

    @Test
    fun findMinDifferenceF() {
        assertEquals(findMinDifference(listOf("00:00","23:00","00:00")), 0)
    }

    @Test
    fun findMinDifferenceG() {
        assertEquals(findMinDifference(listOf("02:00","23:00")), 180)
    }

    @Test
    fun findMinDifferenceH() {
        assertEquals(findMinDifference(listOf("02:00","23:59","22:00")), 119)
    }

    @Test
    fun findMinDifferenceI() {
        assertEquals(findMinDifference(listOf("13:00","23:59","22:00", "23:12")), 47)
    }

    @Test
    fun findMinDifferenceJ() {
        assertEquals(findMinDifference(listOf("11:00", "00:00")), 660)
    }

    @Test
    fun findMinDifferenceK() {
        assertEquals(findMinDifference(listOf("11:00", "00:00", "13:00", "03:00", "06:00")), 120)
    }
}