/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.compute.v1.it;

import static com.google.common.truth.Truth.assertThat;

import com.google.cloud.compute.v1.InterconnectLocation;
import com.google.cloud.compute.v1.InterconnectLocationClient;
import com.google.cloud.compute.v1.InterconnectLocationSettings;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ITInterconnectLocationTest extends BaseTest {

  private static InterconnectLocationClient interconnectLocationClient;

  @BeforeClass
  public static void setUp() throws IOException {
    InterconnectLocationSettings interconnectLocationSettings =
        InterconnectLocationSettings.newBuilder()
            .setCredentialsProvider(credentialsProvider)
            .build();
    interconnectLocationClient = InterconnectLocationClient.create(interconnectLocationSettings);
  }

  @AfterClass
  public static void tearDown() {
    interconnectLocationClient.close();
  }

  @Test
  public void listInterconnectLocationsTest() {
    List<InterconnectLocation> locations =
        Lists.newArrayList(
            interconnectLocationClient.listInterconnectLocations(PROJECT_NAME).iterateAll());
    assertThat(locations).isNotNull();
    assertThat(locations.size()).isGreaterThan(0);
    assertThat(locations.contains(null)).isFalse();
  }
}
