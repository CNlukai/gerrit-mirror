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
package org.onosproject.sfc.installer.impl;

import org.onosproject.core.ApplicationId;
import org.onosproject.net.flowobjective.Objective.Operation;
import org.onosproject.sfc.installer.FlowClassifierInstaller;
import org.onosproject.vtnrsc.FlowClassifier;
import org.onosproject.vtnrsc.PortPair;

/**
 * Provides flow classifier installer.
 */
public class DefaultFlowClassifierInstaller implements FlowClassifierInstaller {

    /**
     * Default constructor.
     */
    public DefaultFlowClassifierInstaller() {
    }

    @Override
    public void install(FlowClassifier flowClassifier, PortPair portPair) {
        // TODO: Process flow-classifier for installation.
    }

    @Override
    public void programFlowClassification(FlowClassifier flowClassifier, PortPair portPair, ApplicationId appid,
            Operation type) {
        // TODO: program forwarding objective for flow-classifier installation.
    }
}
