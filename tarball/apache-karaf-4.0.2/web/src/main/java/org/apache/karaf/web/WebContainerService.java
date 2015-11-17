/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.karaf.web;

import java.util.List;

/**
 * Describe the WebContainer service.
 */
public interface WebContainerService {

    /**
     * List of web bundles deployed in the web container.
     *
     * @return the list of web bundles.
     * @throws Exception in case of listing failure.
     */
    List<WebBundle> list() throws Exception;

    /**
     * Get a string representation of the web state of a bundle (identified by id).
     *
     * @param bundleId the bundle ID.
     * @return the string representation of the bundle web state.
     * @throws Exception in case of "mapping" failure.
     */
    String state(long bundleId) throws Exception;

    /**
     * Start the web context of given bundles (identified by an ID).
     *
     * @param bundleIds the list of bundle IDs (TODO use a BundleSelector service).
     * @throws Exception in case of deploy failure.
     */
    void start(List<Long> bundleIds) throws Exception;

    /**
     * Stop the web context of given bundles (identified by an ID).
     *
     * @param bundleIds the list of bundle IDs (TODO use a BundleSelector service).
     * @throws Exception in case of undeploy failure.
     */
    void stop(List<Long> bundleIds) throws Exception;

    /**
     * Retrieves the Web-ContextPath of the corresponding bundle
     * 
     * @param id of the bundle. 
     * @return 
     */
	String getWebContextPath(Long id);

}
