package com.redhat.simple.service;

import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeHelloQuarkusIT extends HelloQuarkusTest {

    // Execute the same tests but in native mode.
}