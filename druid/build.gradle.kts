/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

dependencies {
    api(platform(project(":bom")))

    api("org.apache.calcite.avatica:avatica-core")
    api(project(":core"))
    testImplementation(project(":core", "testClasses"))
    api(project(":linq4j"))
    api("org.apache.commons:commons-lang3")
    api("com.fasterxml.jackson.core:jackson-core")
    api("com.fasterxml.jackson.core:jackson-databind")
    api("com.google.code.findbugs:jsr305")
    api("com.google.guava:guava")
    api("joda-time:joda-time")
    api("org.slf4j:slf4j-api")
    testImplementation("org.slf4j:slf4j-log4j12")
    testImplementation("org.mockito:mockito-core")
}