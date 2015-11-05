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
import org.onosproject.bgpio.types.OSPFRouteTypeTlv;

import com.google.common.testing.EqualsTester;

/**
 * Test for OSPFRouteType Tlv.
 */
public class OspfRouteTypeTest {
    private final byte value1 = 5;
    private final byte value2 = 4;
    private final OSPFRouteTypeTlv tlv1 = OSPFRouteTypeTlv.of(value1);
    private final OSPFRouteTypeTlv sameAsTlv1 = OSPFRouteTypeTlv.of(value1);
    private final OSPFRouteTypeTlv tlv2 = OSPFRouteTypeTlv.of(value2);

    @Test
    public void testEquality() {
        new EqualsTester()
        .addEqualityGroup(tlv1, sameAsTlv1)
        .addEqualityGroup(tlv2)
        .testEquals();
    }
}