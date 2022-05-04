package com.example.demospringboot

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.junit.jupiter.MockitoExtension

@ExtendWith(MockitoExtension::class)
internal class TestKotlinTest {

    @Test
    @DisplayName("Testing Test")
    fun testTest() {
        assert(1 == 1)
    }

}