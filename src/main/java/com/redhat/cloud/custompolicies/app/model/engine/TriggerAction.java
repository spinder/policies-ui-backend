/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.redhat.cloud.custompolicies.app.model.engine;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author hrupp
 */
public class TriggerAction {
  public String actionId;
  public String actionPlugin;
  public Map<String, Object> properties = new HashMap<>();

  public TriggerAction() {
//    actionId = UUID.randomUUID().toString();
  }
}
