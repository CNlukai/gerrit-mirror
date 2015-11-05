/*
 * Copyright 2015 Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onosproject.bgp;

import org.junit.Test;
import org.onosproject.bgpio.types.IsIsPseudonode;

import com.google.common.testing.EqualsTester;

/**
 * Test for IsIsPseudonode Tlv.
 */
public class IsIsPseudonodeTest {
    private final byte[] value1 = new byte[] {0x01, 0x02, 0x01, 0x02, 0x01, 0x02};
    private final byte[] value2 = new byte[] {0x01, 0x02, 0x01, 0x02, 0x01, 0x03};
    private final IsIsPseudonode tlv1 = IsIsPseudonode.of(value1, (byte) 1);
    private final IsIsPseudonode sameAsTlv1 = IsIsPseudonode.of(value1, (byte) 1);
    private final IsIsPseudonode tlv2 = IsIsPseudonode.of(value2, (byte) 1);

    @Test
    public void testEquality() {
        new EqualsTester()
        .addEqualityGroup(tlv1, sameAsTlv1)
        .addEqualityGroup(tlv2)
        .testEquals();
    }
}