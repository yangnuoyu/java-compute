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
package com.google.cloud.compute.v1.stub;

import static com.google.cloud.compute.v1.RegionInstanceGroupManagerClient.ListErrorsRegionInstanceGroupManagersPagedResponse;
import static com.google.cloud.compute.v1.RegionInstanceGroupManagerClient.ListManagedInstancesRegionInstanceGroupManagersPagedResponse;
import static com.google.cloud.compute.v1.RegionInstanceGroupManagerClient.ListPerInstanceConfigsRegionInstanceGroupManagersPagedResponse;
import static com.google.cloud.compute.v1.RegionInstanceGroupManagerClient.ListRegionInstanceGroupManagersPagedResponse;

import com.google.api.client.http.HttpMethods;
import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMessageHttpRequestFormatter;
import com.google.api.gax.httpjson.ApiMessageHttpResponseParser;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.pathtemplate.PathTemplate;
import com.google.cloud.compute.v1.AbandonInstancesRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.ApplyUpdatesToInstancesRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.CreateInstancesRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.DeleteInstancesRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.DeletePerInstanceConfigsRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.DeleteRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.GetRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.InsertRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.InstanceGroupManager;
import com.google.cloud.compute.v1.ListErrorsRegionInstanceGroupManagersHttpRequest;
import com.google.cloud.compute.v1.ListManagedInstancesRegionInstanceGroupManagersHttpRequest;
import com.google.cloud.compute.v1.ListPerInstanceConfigsRegionInstanceGroupManagersHttpRequest;
import com.google.cloud.compute.v1.ListRegionInstanceGroupManagersHttpRequest;
import com.google.cloud.compute.v1.Operation;
import com.google.cloud.compute.v1.PatchPerInstanceConfigsRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.PatchRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName;
import com.google.cloud.compute.v1.ProjectRegionName;
import com.google.cloud.compute.v1.RecreateInstancesRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.RegionInstanceGroupManagerList;
import com.google.cloud.compute.v1.RegionInstanceGroupManagersListErrorsResponse;
import com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstanceConfigsResp;
import com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse;
import com.google.cloud.compute.v1.ResizeRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.SetInstanceTemplateRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.SetTargetPoolsRegionInstanceGroupManagerHttpRequest;
import com.google.cloud.compute.v1.UpdatePerInstanceConfigsRegionInstanceGroupManagerHttpRequest;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * HTTP stub implementation for compute.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public class HttpJsonRegionInstanceGroupManagerStub extends RegionInstanceGroupManagerStub {
  @InternalApi
  public static final ApiMethodDescriptor<
          AbandonInstancesRegionInstanceGroupManagerHttpRequest, Operation>
      abandonInstancesRegionInstanceGroupManagerMethodDescriptor =
          ApiMethodDescriptor
              .<AbandonInstancesRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.regionInstanceGroupManagers.abandonInstances")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter
                      .<AbandonInstancesRegionInstanceGroupManagerHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/regions/{region}/instanceGroupManagers/{instanceGroupManager}/abandonInstances"))
                      .setQueryParams(Sets.<String>newHashSet("requestId"))
                      .setResourceNameFactory(ProjectRegionInstanceGroupManagerName.newFactory())
                      .setResourceNameField("instanceGroupManager")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<
          ApplyUpdatesToInstancesRegionInstanceGroupManagerHttpRequest, Operation>
      applyUpdatesToInstancesRegionInstanceGroupManagerMethodDescriptor =
          ApiMethodDescriptor
              .<ApplyUpdatesToInstancesRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.regionInstanceGroupManagers.applyUpdatesToInstances")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter
                      .<ApplyUpdatesToInstancesRegionInstanceGroupManagerHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/regions/{region}/instanceGroupManagers/{instanceGroupManager}/applyUpdatesToInstances"))
                      .setQueryParams(Sets.<String>newHashSet())
                      .setResourceNameFactory(ProjectRegionInstanceGroupManagerName.newFactory())
                      .setResourceNameField("instanceGroupManager")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<
          CreateInstancesRegionInstanceGroupManagerHttpRequest, Operation>
      createInstancesRegionInstanceGroupManagerMethodDescriptor =
          ApiMethodDescriptor
              .<CreateInstancesRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.regionInstanceGroupManagers.createInstances")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter
                      .<CreateInstancesRegionInstanceGroupManagerHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/regions/{region}/instanceGroupManagers/{instanceGroupManager}/createInstances"))
                      .setQueryParams(Sets.<String>newHashSet("requestId"))
                      .setResourceNameFactory(ProjectRegionInstanceGroupManagerName.newFactory())
                      .setResourceNameField("instanceGroupManager")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<DeleteRegionInstanceGroupManagerHttpRequest, Operation>
      deleteRegionInstanceGroupManagerMethodDescriptor =
          ApiMethodDescriptor.<DeleteRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.regionInstanceGroupManagers.delete")
              .setHttpMethod(HttpMethods.DELETE)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter
                      .<DeleteRegionInstanceGroupManagerHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/regions/{region}/instanceGroupManagers/{instanceGroupManager}"))
                      .setQueryParams(Sets.<String>newHashSet("requestId"))
                      .setResourceNameFactory(ProjectRegionInstanceGroupManagerName.newFactory())
                      .setResourceNameField("instanceGroupManager")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<
          DeleteInstancesRegionInstanceGroupManagerHttpRequest, Operation>
      deleteInstancesRegionInstanceGroupManagerMethodDescriptor =
          ApiMethodDescriptor
              .<DeleteInstancesRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.regionInstanceGroupManagers.deleteInstances")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter
                      .<DeleteInstancesRegionInstanceGroupManagerHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/regions/{region}/instanceGroupManagers/{instanceGroupManager}/deleteInstances"))
                      .setQueryParams(Sets.<String>newHashSet("requestId"))
                      .setResourceNameFactory(ProjectRegionInstanceGroupManagerName.newFactory())
                      .setResourceNameField("instanceGroupManager")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<
          DeletePerInstanceConfigsRegionInstanceGroupManagerHttpRequest, Operation>
      deletePerInstanceConfigsRegionInstanceGroupManagerMethodDescriptor =
          ApiMethodDescriptor
              .<DeletePerInstanceConfigsRegionInstanceGroupManagerHttpRequest, Operation>
                  newBuilder()
              .setFullMethodName("compute.regionInstanceGroupManagers.deletePerInstanceConfigs")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter
                      .<DeletePerInstanceConfigsRegionInstanceGroupManagerHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/regions/{region}/instanceGroupManagers/{instanceGroupManager}/deletePerInstanceConfigs"))
                      .setQueryParams(Sets.<String>newHashSet())
                      .setResourceNameFactory(ProjectRegionInstanceGroupManagerName.newFactory())
                      .setResourceNameField("instanceGroupManager")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<
          GetRegionInstanceGroupManagerHttpRequest, InstanceGroupManager>
      getRegionInstanceGroupManagerMethodDescriptor =
          ApiMethodDescriptor
              .<GetRegionInstanceGroupManagerHttpRequest, InstanceGroupManager>newBuilder()
              .setFullMethodName("compute.regionInstanceGroupManagers.get")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter
                      .<GetRegionInstanceGroupManagerHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/regions/{region}/instanceGroupManagers/{instanceGroupManager}"))
                      .setQueryParams(Sets.<String>newHashSet())
                      .setResourceNameFactory(ProjectRegionInstanceGroupManagerName.newFactory())
                      .setResourceNameField("instanceGroupManager")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<InstanceGroupManager>newBuilder()
                      .setResponseInstance(InstanceGroupManager.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<InsertRegionInstanceGroupManagerHttpRequest, Operation>
      insertRegionInstanceGroupManagerMethodDescriptor =
          ApiMethodDescriptor.<InsertRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.regionInstanceGroupManagers.insert")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter
                      .<InsertRegionInstanceGroupManagerHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create("{project}/regions/{region}/instanceGroupManagers"))
                      .setQueryParams(Sets.<String>newHashSet("requestId"))
                      .setResourceNameFactory(ProjectRegionName.newFactory())
                      .setResourceNameField("region")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<
          ListRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagerList>
      listRegionInstanceGroupManagersMethodDescriptor =
          ApiMethodDescriptor
              .<ListRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagerList>
                  newBuilder()
              .setFullMethodName("compute.regionInstanceGroupManagers.list")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter
                      .<ListRegionInstanceGroupManagersHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create("{project}/regions/{region}/instanceGroupManagers"))
                      .setQueryParams(
                          Sets.<String>newHashSet("filter", "maxResults", "orderBy", "pageToken"))
                      .setResourceNameFactory(ProjectRegionName.newFactory())
                      .setResourceNameField("region")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<RegionInstanceGroupManagerList>newBuilder()
                      .setResponseInstance(RegionInstanceGroupManagerList.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<
          ListErrorsRegionInstanceGroupManagersHttpRequest,
          RegionInstanceGroupManagersListErrorsResponse>
      listErrorsRegionInstanceGroupManagersMethodDescriptor =
          ApiMethodDescriptor
              .<ListErrorsRegionInstanceGroupManagersHttpRequest,
                  RegionInstanceGroupManagersListErrorsResponse>
                  newBuilder()
              .setFullMethodName("compute.regionInstanceGroupManagers.listErrors")
              .setHttpMethod(HttpMethods.GET)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter
                      .<ListErrorsRegionInstanceGroupManagersHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/regions/{region}/instanceGroupManagers/{instanceGroupManager}/listErrors"))
                      .setQueryParams(
                          Sets.<String>newHashSet("filter", "maxResults", "orderBy", "pageToken"))
                      .setResourceNameFactory(ProjectRegionInstanceGroupManagerName.newFactory())
                      .setResourceNameField("instanceGroupManager")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser
                      .<RegionInstanceGroupManagersListErrorsResponse>newBuilder()
                      .setResponseInstance(
                          RegionInstanceGroupManagersListErrorsResponse.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<
          ListManagedInstancesRegionInstanceGroupManagersHttpRequest,
          RegionInstanceGroupManagersListInstancesResponse>
      listManagedInstancesRegionInstanceGroupManagersMethodDescriptor =
          ApiMethodDescriptor
              .<ListManagedInstancesRegionInstanceGroupManagersHttpRequest,
                  RegionInstanceGroupManagersListInstancesResponse>
                  newBuilder()
              .setFullMethodName("compute.regionInstanceGroupManagers.listManagedInstances")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter
                      .<ListManagedInstancesRegionInstanceGroupManagersHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/regions/{region}/instanceGroupManagers/{instanceGroupManager}/listManagedInstances"))
                      .setQueryParams(
                          Sets.<String>newHashSet("filter", "maxResults", "orderBy", "pageToken"))
                      .setResourceNameFactory(ProjectRegionInstanceGroupManagerName.newFactory())
                      .setResourceNameField("instanceGroupManager")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser
                      .<RegionInstanceGroupManagersListInstancesResponse>newBuilder()
                      .setResponseInstance(
                          RegionInstanceGroupManagersListInstancesResponse.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<
          ListPerInstanceConfigsRegionInstanceGroupManagersHttpRequest,
          RegionInstanceGroupManagersListInstanceConfigsResp>
      listPerInstanceConfigsRegionInstanceGroupManagersMethodDescriptor =
          ApiMethodDescriptor
              .<ListPerInstanceConfigsRegionInstanceGroupManagersHttpRequest,
                  RegionInstanceGroupManagersListInstanceConfigsResp>
                  newBuilder()
              .setFullMethodName("compute.regionInstanceGroupManagers.listPerInstanceConfigs")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter
                      .<ListPerInstanceConfigsRegionInstanceGroupManagersHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/regions/{region}/instanceGroupManagers/{instanceGroupManager}/listPerInstanceConfigs"))
                      .setQueryParams(
                          Sets.<String>newHashSet("filter", "maxResults", "orderBy", "pageToken"))
                      .setResourceNameFactory(ProjectRegionInstanceGroupManagerName.newFactory())
                      .setResourceNameField("instanceGroupManager")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser
                      .<RegionInstanceGroupManagersListInstanceConfigsResp>newBuilder()
                      .setResponseInstance(
                          RegionInstanceGroupManagersListInstanceConfigsResp.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<PatchRegionInstanceGroupManagerHttpRequest, Operation>
      patchRegionInstanceGroupManagerMethodDescriptor =
          ApiMethodDescriptor.<PatchRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.regionInstanceGroupManagers.patch")
              .setHttpMethod(HttpMethods.PATCH)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter
                      .<PatchRegionInstanceGroupManagerHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/regions/{region}/instanceGroupManagers/{instanceGroupManager}"))
                      .setQueryParams(Sets.<String>newHashSet("requestId"))
                      .setResourceNameFactory(ProjectRegionInstanceGroupManagerName.newFactory())
                      .setResourceNameField("instanceGroupManager")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<
          PatchPerInstanceConfigsRegionInstanceGroupManagerHttpRequest, Operation>
      patchPerInstanceConfigsRegionInstanceGroupManagerMethodDescriptor =
          ApiMethodDescriptor
              .<PatchPerInstanceConfigsRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.regionInstanceGroupManagers.patchPerInstanceConfigs")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter
                      .<PatchPerInstanceConfigsRegionInstanceGroupManagerHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/regions/{region}/instanceGroupManagers/{instanceGroupManager}/patchPerInstanceConfigs"))
                      .setQueryParams(Sets.<String>newHashSet("requestId"))
                      .setResourceNameFactory(ProjectRegionInstanceGroupManagerName.newFactory())
                      .setResourceNameField("instanceGroupManager")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<
          RecreateInstancesRegionInstanceGroupManagerHttpRequest, Operation>
      recreateInstancesRegionInstanceGroupManagerMethodDescriptor =
          ApiMethodDescriptor
              .<RecreateInstancesRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.regionInstanceGroupManagers.recreateInstances")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter
                      .<RecreateInstancesRegionInstanceGroupManagerHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/regions/{region}/instanceGroupManagers/{instanceGroupManager}/recreateInstances"))
                      .setQueryParams(Sets.<String>newHashSet("requestId"))
                      .setResourceNameFactory(ProjectRegionInstanceGroupManagerName.newFactory())
                      .setResourceNameField("instanceGroupManager")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<ResizeRegionInstanceGroupManagerHttpRequest, Operation>
      resizeRegionInstanceGroupManagerMethodDescriptor =
          ApiMethodDescriptor.<ResizeRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.regionInstanceGroupManagers.resize")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter
                      .<ResizeRegionInstanceGroupManagerHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/regions/{region}/instanceGroupManagers/{instanceGroupManager}/resize"))
                      .setQueryParams(Sets.<String>newHashSet("requestId", "size"))
                      .setResourceNameFactory(ProjectRegionInstanceGroupManagerName.newFactory())
                      .setResourceNameField("instanceGroupManager")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<
          SetInstanceTemplateRegionInstanceGroupManagerHttpRequest, Operation>
      setInstanceTemplateRegionInstanceGroupManagerMethodDescriptor =
          ApiMethodDescriptor
              .<SetInstanceTemplateRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.regionInstanceGroupManagers.setInstanceTemplate")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter
                      .<SetInstanceTemplateRegionInstanceGroupManagerHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/regions/{region}/instanceGroupManagers/{instanceGroupManager}/setInstanceTemplate"))
                      .setQueryParams(Sets.<String>newHashSet("requestId"))
                      .setResourceNameFactory(ProjectRegionInstanceGroupManagerName.newFactory())
                      .setResourceNameField("instanceGroupManager")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<
          SetTargetPoolsRegionInstanceGroupManagerHttpRequest, Operation>
      setTargetPoolsRegionInstanceGroupManagerMethodDescriptor =
          ApiMethodDescriptor
              .<SetTargetPoolsRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
              .setFullMethodName("compute.regionInstanceGroupManagers.setTargetPools")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter
                      .<SetTargetPoolsRegionInstanceGroupManagerHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/regions/{region}/instanceGroupManagers/{instanceGroupManager}/setTargetPools"))
                      .setQueryParams(Sets.<String>newHashSet("requestId"))
                      .setResourceNameFactory(ProjectRegionInstanceGroupManagerName.newFactory())
                      .setResourceNameField("instanceGroupManager")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  @InternalApi
  public static final ApiMethodDescriptor<
          UpdatePerInstanceConfigsRegionInstanceGroupManagerHttpRequest, Operation>
      updatePerInstanceConfigsRegionInstanceGroupManagerMethodDescriptor =
          ApiMethodDescriptor
              .<UpdatePerInstanceConfigsRegionInstanceGroupManagerHttpRequest, Operation>
                  newBuilder()
              .setFullMethodName("compute.regionInstanceGroupManagers.updatePerInstanceConfigs")
              .setHttpMethod(HttpMethods.POST)
              .setRequestFormatter(
                  ApiMessageHttpRequestFormatter
                      .<UpdatePerInstanceConfigsRegionInstanceGroupManagerHttpRequest>newBuilder()
                      .setPathTemplate(
                          PathTemplate.create(
                              "{project}/regions/{region}/instanceGroupManagers/{instanceGroupManager}/updatePerInstanceConfigs"))
                      .setQueryParams(Sets.<String>newHashSet("requestId"))
                      .setResourceNameFactory(ProjectRegionInstanceGroupManagerName.newFactory())
                      .setResourceNameField("instanceGroupManager")
                      .build())
              .setResponseParser(
                  ApiMessageHttpResponseParser.<Operation>newBuilder()
                      .setResponseInstance(Operation.getDefaultInstance())
                      .build())
              .build();

  private final BackgroundResource backgroundResources;

  private final UnaryCallable<AbandonInstancesRegionInstanceGroupManagerHttpRequest, Operation>
      abandonInstancesRegionInstanceGroupManagerCallable;
  private final UnaryCallable<
          ApplyUpdatesToInstancesRegionInstanceGroupManagerHttpRequest, Operation>
      applyUpdatesToInstancesRegionInstanceGroupManagerCallable;
  private final UnaryCallable<CreateInstancesRegionInstanceGroupManagerHttpRequest, Operation>
      createInstancesRegionInstanceGroupManagerCallable;
  private final UnaryCallable<DeleteRegionInstanceGroupManagerHttpRequest, Operation>
      deleteRegionInstanceGroupManagerCallable;
  private final UnaryCallable<DeleteInstancesRegionInstanceGroupManagerHttpRequest, Operation>
      deleteInstancesRegionInstanceGroupManagerCallable;
  private final UnaryCallable<
          DeletePerInstanceConfigsRegionInstanceGroupManagerHttpRequest, Operation>
      deletePerInstanceConfigsRegionInstanceGroupManagerCallable;
  private final UnaryCallable<GetRegionInstanceGroupManagerHttpRequest, InstanceGroupManager>
      getRegionInstanceGroupManagerCallable;
  private final UnaryCallable<InsertRegionInstanceGroupManagerHttpRequest, Operation>
      insertRegionInstanceGroupManagerCallable;
  private final UnaryCallable<
          ListRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagerList>
      listRegionInstanceGroupManagersCallable;
  private final UnaryCallable<
          ListRegionInstanceGroupManagersHttpRequest, ListRegionInstanceGroupManagersPagedResponse>
      listRegionInstanceGroupManagersPagedCallable;
  private final UnaryCallable<
          ListErrorsRegionInstanceGroupManagersHttpRequest,
          RegionInstanceGroupManagersListErrorsResponse>
      listErrorsRegionInstanceGroupManagersCallable;
  private final UnaryCallable<
          ListErrorsRegionInstanceGroupManagersHttpRequest,
          ListErrorsRegionInstanceGroupManagersPagedResponse>
      listErrorsRegionInstanceGroupManagersPagedCallable;
  private final UnaryCallable<
          ListManagedInstancesRegionInstanceGroupManagersHttpRequest,
          RegionInstanceGroupManagersListInstancesResponse>
      listManagedInstancesRegionInstanceGroupManagersCallable;
  private final UnaryCallable<
          ListManagedInstancesRegionInstanceGroupManagersHttpRequest,
          ListManagedInstancesRegionInstanceGroupManagersPagedResponse>
      listManagedInstancesRegionInstanceGroupManagersPagedCallable;
  private final UnaryCallable<
          ListPerInstanceConfigsRegionInstanceGroupManagersHttpRequest,
          RegionInstanceGroupManagersListInstanceConfigsResp>
      listPerInstanceConfigsRegionInstanceGroupManagersCallable;
  private final UnaryCallable<
          ListPerInstanceConfigsRegionInstanceGroupManagersHttpRequest,
          ListPerInstanceConfigsRegionInstanceGroupManagersPagedResponse>
      listPerInstanceConfigsRegionInstanceGroupManagersPagedCallable;
  private final UnaryCallable<PatchRegionInstanceGroupManagerHttpRequest, Operation>
      patchRegionInstanceGroupManagerCallable;
  private final UnaryCallable<
          PatchPerInstanceConfigsRegionInstanceGroupManagerHttpRequest, Operation>
      patchPerInstanceConfigsRegionInstanceGroupManagerCallable;
  private final UnaryCallable<RecreateInstancesRegionInstanceGroupManagerHttpRequest, Operation>
      recreateInstancesRegionInstanceGroupManagerCallable;
  private final UnaryCallable<ResizeRegionInstanceGroupManagerHttpRequest, Operation>
      resizeRegionInstanceGroupManagerCallable;
  private final UnaryCallable<SetInstanceTemplateRegionInstanceGroupManagerHttpRequest, Operation>
      setInstanceTemplateRegionInstanceGroupManagerCallable;
  private final UnaryCallable<SetTargetPoolsRegionInstanceGroupManagerHttpRequest, Operation>
      setTargetPoolsRegionInstanceGroupManagerCallable;
  private final UnaryCallable<
          UpdatePerInstanceConfigsRegionInstanceGroupManagerHttpRequest, Operation>
      updatePerInstanceConfigsRegionInstanceGroupManagerCallable;

  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonRegionInstanceGroupManagerStub create(
      RegionInstanceGroupManagerStubSettings settings) throws IOException {
    return new HttpJsonRegionInstanceGroupManagerStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonRegionInstanceGroupManagerStub create(ClientContext clientContext)
      throws IOException {
    return new HttpJsonRegionInstanceGroupManagerStub(
        RegionInstanceGroupManagerStubSettings.newBuilder().build(), clientContext);
  }

  public static final HttpJsonRegionInstanceGroupManagerStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonRegionInstanceGroupManagerStub(
        RegionInstanceGroupManagerStubSettings.newBuilder().build(),
        clientContext,
        callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonRegionInstanceGroupManagerStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected HttpJsonRegionInstanceGroupManagerStub(
      RegionInstanceGroupManagerStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new HttpJsonRegionInstanceGroupManagerCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonRegionInstanceGroupManagerStub, using the given settings.
   * This is protected so that it is easy to make a subclass, but otherwise, the static factory
   * methods should be preferred.
   */
  protected HttpJsonRegionInstanceGroupManagerStub(
      RegionInstanceGroupManagerStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<AbandonInstancesRegionInstanceGroupManagerHttpRequest, Operation>
        abandonInstancesRegionInstanceGroupManagerTransportSettings =
            HttpJsonCallSettings
                .<AbandonInstancesRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
                .setMethodDescriptor(abandonInstancesRegionInstanceGroupManagerMethodDescriptor)
                .build();
    HttpJsonCallSettings<ApplyUpdatesToInstancesRegionInstanceGroupManagerHttpRequest, Operation>
        applyUpdatesToInstancesRegionInstanceGroupManagerTransportSettings =
            HttpJsonCallSettings
                .<ApplyUpdatesToInstancesRegionInstanceGroupManagerHttpRequest, Operation>
                    newBuilder()
                .setMethodDescriptor(
                    applyUpdatesToInstancesRegionInstanceGroupManagerMethodDescriptor)
                .build();
    HttpJsonCallSettings<CreateInstancesRegionInstanceGroupManagerHttpRequest, Operation>
        createInstancesRegionInstanceGroupManagerTransportSettings =
            HttpJsonCallSettings
                .<CreateInstancesRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
                .setMethodDescriptor(createInstancesRegionInstanceGroupManagerMethodDescriptor)
                .build();
    HttpJsonCallSettings<DeleteRegionInstanceGroupManagerHttpRequest, Operation>
        deleteRegionInstanceGroupManagerTransportSettings =
            HttpJsonCallSettings
                .<DeleteRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
                .setMethodDescriptor(deleteRegionInstanceGroupManagerMethodDescriptor)
                .build();
    HttpJsonCallSettings<DeleteInstancesRegionInstanceGroupManagerHttpRequest, Operation>
        deleteInstancesRegionInstanceGroupManagerTransportSettings =
            HttpJsonCallSettings
                .<DeleteInstancesRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
                .setMethodDescriptor(deleteInstancesRegionInstanceGroupManagerMethodDescriptor)
                .build();
    HttpJsonCallSettings<DeletePerInstanceConfigsRegionInstanceGroupManagerHttpRequest, Operation>
        deletePerInstanceConfigsRegionInstanceGroupManagerTransportSettings =
            HttpJsonCallSettings
                .<DeletePerInstanceConfigsRegionInstanceGroupManagerHttpRequest, Operation>
                    newBuilder()
                .setMethodDescriptor(
                    deletePerInstanceConfigsRegionInstanceGroupManagerMethodDescriptor)
                .build();
    HttpJsonCallSettings<GetRegionInstanceGroupManagerHttpRequest, InstanceGroupManager>
        getRegionInstanceGroupManagerTransportSettings =
            HttpJsonCallSettings
                .<GetRegionInstanceGroupManagerHttpRequest, InstanceGroupManager>newBuilder()
                .setMethodDescriptor(getRegionInstanceGroupManagerMethodDescriptor)
                .build();
    HttpJsonCallSettings<InsertRegionInstanceGroupManagerHttpRequest, Operation>
        insertRegionInstanceGroupManagerTransportSettings =
            HttpJsonCallSettings
                .<InsertRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
                .setMethodDescriptor(insertRegionInstanceGroupManagerMethodDescriptor)
                .build();
    HttpJsonCallSettings<ListRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagerList>
        listRegionInstanceGroupManagersTransportSettings =
            HttpJsonCallSettings
                .<ListRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagerList>
                    newBuilder()
                .setMethodDescriptor(listRegionInstanceGroupManagersMethodDescriptor)
                .build();
    HttpJsonCallSettings<
            ListErrorsRegionInstanceGroupManagersHttpRequest,
            RegionInstanceGroupManagersListErrorsResponse>
        listErrorsRegionInstanceGroupManagersTransportSettings =
            HttpJsonCallSettings
                .<ListErrorsRegionInstanceGroupManagersHttpRequest,
                    RegionInstanceGroupManagersListErrorsResponse>
                    newBuilder()
                .setMethodDescriptor(listErrorsRegionInstanceGroupManagersMethodDescriptor)
                .build();
    HttpJsonCallSettings<
            ListManagedInstancesRegionInstanceGroupManagersHttpRequest,
            RegionInstanceGroupManagersListInstancesResponse>
        listManagedInstancesRegionInstanceGroupManagersTransportSettings =
            HttpJsonCallSettings
                .<ListManagedInstancesRegionInstanceGroupManagersHttpRequest,
                    RegionInstanceGroupManagersListInstancesResponse>
                    newBuilder()
                .setMethodDescriptor(
                    listManagedInstancesRegionInstanceGroupManagersMethodDescriptor)
                .build();
    HttpJsonCallSettings<
            ListPerInstanceConfigsRegionInstanceGroupManagersHttpRequest,
            RegionInstanceGroupManagersListInstanceConfigsResp>
        listPerInstanceConfigsRegionInstanceGroupManagersTransportSettings =
            HttpJsonCallSettings
                .<ListPerInstanceConfigsRegionInstanceGroupManagersHttpRequest,
                    RegionInstanceGroupManagersListInstanceConfigsResp>
                    newBuilder()
                .setMethodDescriptor(
                    listPerInstanceConfigsRegionInstanceGroupManagersMethodDescriptor)
                .build();
    HttpJsonCallSettings<PatchRegionInstanceGroupManagerHttpRequest, Operation>
        patchRegionInstanceGroupManagerTransportSettings =
            HttpJsonCallSettings.<PatchRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
                .setMethodDescriptor(patchRegionInstanceGroupManagerMethodDescriptor)
                .build();
    HttpJsonCallSettings<PatchPerInstanceConfigsRegionInstanceGroupManagerHttpRequest, Operation>
        patchPerInstanceConfigsRegionInstanceGroupManagerTransportSettings =
            HttpJsonCallSettings
                .<PatchPerInstanceConfigsRegionInstanceGroupManagerHttpRequest, Operation>
                    newBuilder()
                .setMethodDescriptor(
                    patchPerInstanceConfigsRegionInstanceGroupManagerMethodDescriptor)
                .build();
    HttpJsonCallSettings<RecreateInstancesRegionInstanceGroupManagerHttpRequest, Operation>
        recreateInstancesRegionInstanceGroupManagerTransportSettings =
            HttpJsonCallSettings
                .<RecreateInstancesRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
                .setMethodDescriptor(recreateInstancesRegionInstanceGroupManagerMethodDescriptor)
                .build();
    HttpJsonCallSettings<ResizeRegionInstanceGroupManagerHttpRequest, Operation>
        resizeRegionInstanceGroupManagerTransportSettings =
            HttpJsonCallSettings
                .<ResizeRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
                .setMethodDescriptor(resizeRegionInstanceGroupManagerMethodDescriptor)
                .build();
    HttpJsonCallSettings<SetInstanceTemplateRegionInstanceGroupManagerHttpRequest, Operation>
        setInstanceTemplateRegionInstanceGroupManagerTransportSettings =
            HttpJsonCallSettings
                .<SetInstanceTemplateRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
                .setMethodDescriptor(setInstanceTemplateRegionInstanceGroupManagerMethodDescriptor)
                .build();
    HttpJsonCallSettings<SetTargetPoolsRegionInstanceGroupManagerHttpRequest, Operation>
        setTargetPoolsRegionInstanceGroupManagerTransportSettings =
            HttpJsonCallSettings
                .<SetTargetPoolsRegionInstanceGroupManagerHttpRequest, Operation>newBuilder()
                .setMethodDescriptor(setTargetPoolsRegionInstanceGroupManagerMethodDescriptor)
                .build();
    HttpJsonCallSettings<UpdatePerInstanceConfigsRegionInstanceGroupManagerHttpRequest, Operation>
        updatePerInstanceConfigsRegionInstanceGroupManagerTransportSettings =
            HttpJsonCallSettings
                .<UpdatePerInstanceConfigsRegionInstanceGroupManagerHttpRequest, Operation>
                    newBuilder()
                .setMethodDescriptor(
                    updatePerInstanceConfigsRegionInstanceGroupManagerMethodDescriptor)
                .build();

    this.abandonInstancesRegionInstanceGroupManagerCallable =
        callableFactory.createUnaryCallable(
            abandonInstancesRegionInstanceGroupManagerTransportSettings,
            settings.abandonInstancesRegionInstanceGroupManagerSettings(),
            clientContext);
    this.applyUpdatesToInstancesRegionInstanceGroupManagerCallable =
        callableFactory.createUnaryCallable(
            applyUpdatesToInstancesRegionInstanceGroupManagerTransportSettings,
            settings.applyUpdatesToInstancesRegionInstanceGroupManagerSettings(),
            clientContext);
    this.createInstancesRegionInstanceGroupManagerCallable =
        callableFactory.createUnaryCallable(
            createInstancesRegionInstanceGroupManagerTransportSettings,
            settings.createInstancesRegionInstanceGroupManagerSettings(),
            clientContext);
    this.deleteRegionInstanceGroupManagerCallable =
        callableFactory.createUnaryCallable(
            deleteRegionInstanceGroupManagerTransportSettings,
            settings.deleteRegionInstanceGroupManagerSettings(),
            clientContext);
    this.deleteInstancesRegionInstanceGroupManagerCallable =
        callableFactory.createUnaryCallable(
            deleteInstancesRegionInstanceGroupManagerTransportSettings,
            settings.deleteInstancesRegionInstanceGroupManagerSettings(),
            clientContext);
    this.deletePerInstanceConfigsRegionInstanceGroupManagerCallable =
        callableFactory.createUnaryCallable(
            deletePerInstanceConfigsRegionInstanceGroupManagerTransportSettings,
            settings.deletePerInstanceConfigsRegionInstanceGroupManagerSettings(),
            clientContext);
    this.getRegionInstanceGroupManagerCallable =
        callableFactory.createUnaryCallable(
            getRegionInstanceGroupManagerTransportSettings,
            settings.getRegionInstanceGroupManagerSettings(),
            clientContext);
    this.insertRegionInstanceGroupManagerCallable =
        callableFactory.createUnaryCallable(
            insertRegionInstanceGroupManagerTransportSettings,
            settings.insertRegionInstanceGroupManagerSettings(),
            clientContext);
    this.listRegionInstanceGroupManagersCallable =
        callableFactory.createUnaryCallable(
            listRegionInstanceGroupManagersTransportSettings,
            settings.listRegionInstanceGroupManagersSettings(),
            clientContext);
    this.listRegionInstanceGroupManagersPagedCallable =
        callableFactory.createPagedCallable(
            listRegionInstanceGroupManagersTransportSettings,
            settings.listRegionInstanceGroupManagersSettings(),
            clientContext);
    this.listErrorsRegionInstanceGroupManagersCallable =
        callableFactory.createUnaryCallable(
            listErrorsRegionInstanceGroupManagersTransportSettings,
            settings.listErrorsRegionInstanceGroupManagersSettings(),
            clientContext);
    this.listErrorsRegionInstanceGroupManagersPagedCallable =
        callableFactory.createPagedCallable(
            listErrorsRegionInstanceGroupManagersTransportSettings,
            settings.listErrorsRegionInstanceGroupManagersSettings(),
            clientContext);
    this.listManagedInstancesRegionInstanceGroupManagersCallable =
        callableFactory.createUnaryCallable(
            listManagedInstancesRegionInstanceGroupManagersTransportSettings,
            settings.listManagedInstancesRegionInstanceGroupManagersSettings(),
            clientContext);
    this.listManagedInstancesRegionInstanceGroupManagersPagedCallable =
        callableFactory.createPagedCallable(
            listManagedInstancesRegionInstanceGroupManagersTransportSettings,
            settings.listManagedInstancesRegionInstanceGroupManagersSettings(),
            clientContext);
    this.listPerInstanceConfigsRegionInstanceGroupManagersCallable =
        callableFactory.createUnaryCallable(
            listPerInstanceConfigsRegionInstanceGroupManagersTransportSettings,
            settings.listPerInstanceConfigsRegionInstanceGroupManagersSettings(),
            clientContext);
    this.listPerInstanceConfigsRegionInstanceGroupManagersPagedCallable =
        callableFactory.createPagedCallable(
            listPerInstanceConfigsRegionInstanceGroupManagersTransportSettings,
            settings.listPerInstanceConfigsRegionInstanceGroupManagersSettings(),
            clientContext);
    this.patchRegionInstanceGroupManagerCallable =
        callableFactory.createUnaryCallable(
            patchRegionInstanceGroupManagerTransportSettings,
            settings.patchRegionInstanceGroupManagerSettings(),
            clientContext);
    this.patchPerInstanceConfigsRegionInstanceGroupManagerCallable =
        callableFactory.createUnaryCallable(
            patchPerInstanceConfigsRegionInstanceGroupManagerTransportSettings,
            settings.patchPerInstanceConfigsRegionInstanceGroupManagerSettings(),
            clientContext);
    this.recreateInstancesRegionInstanceGroupManagerCallable =
        callableFactory.createUnaryCallable(
            recreateInstancesRegionInstanceGroupManagerTransportSettings,
            settings.recreateInstancesRegionInstanceGroupManagerSettings(),
            clientContext);
    this.resizeRegionInstanceGroupManagerCallable =
        callableFactory.createUnaryCallable(
            resizeRegionInstanceGroupManagerTransportSettings,
            settings.resizeRegionInstanceGroupManagerSettings(),
            clientContext);
    this.setInstanceTemplateRegionInstanceGroupManagerCallable =
        callableFactory.createUnaryCallable(
            setInstanceTemplateRegionInstanceGroupManagerTransportSettings,
            settings.setInstanceTemplateRegionInstanceGroupManagerSettings(),
            clientContext);
    this.setTargetPoolsRegionInstanceGroupManagerCallable =
        callableFactory.createUnaryCallable(
            setTargetPoolsRegionInstanceGroupManagerTransportSettings,
            settings.setTargetPoolsRegionInstanceGroupManagerSettings(),
            clientContext);
    this.updatePerInstanceConfigsRegionInstanceGroupManagerCallable =
        callableFactory.createUnaryCallable(
            updatePerInstanceConfigsRegionInstanceGroupManagerTransportSettings,
            settings.updatePerInstanceConfigsRegionInstanceGroupManagerSettings(),
            clientContext);

    backgroundResources = new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @BetaApi
  public UnaryCallable<AbandonInstancesRegionInstanceGroupManagerHttpRequest, Operation>
      abandonInstancesRegionInstanceGroupManagerCallable() {
    return abandonInstancesRegionInstanceGroupManagerCallable;
  }

  @BetaApi
  public UnaryCallable<ApplyUpdatesToInstancesRegionInstanceGroupManagerHttpRequest, Operation>
      applyUpdatesToInstancesRegionInstanceGroupManagerCallable() {
    return applyUpdatesToInstancesRegionInstanceGroupManagerCallable;
  }

  @BetaApi
  public UnaryCallable<CreateInstancesRegionInstanceGroupManagerHttpRequest, Operation>
      createInstancesRegionInstanceGroupManagerCallable() {
    return createInstancesRegionInstanceGroupManagerCallable;
  }

  @BetaApi
  public UnaryCallable<DeleteRegionInstanceGroupManagerHttpRequest, Operation>
      deleteRegionInstanceGroupManagerCallable() {
    return deleteRegionInstanceGroupManagerCallable;
  }

  @BetaApi
  public UnaryCallable<DeleteInstancesRegionInstanceGroupManagerHttpRequest, Operation>
      deleteInstancesRegionInstanceGroupManagerCallable() {
    return deleteInstancesRegionInstanceGroupManagerCallable;
  }

  @BetaApi
  public UnaryCallable<DeletePerInstanceConfigsRegionInstanceGroupManagerHttpRequest, Operation>
      deletePerInstanceConfigsRegionInstanceGroupManagerCallable() {
    return deletePerInstanceConfigsRegionInstanceGroupManagerCallable;
  }

  @BetaApi
  public UnaryCallable<GetRegionInstanceGroupManagerHttpRequest, InstanceGroupManager>
      getRegionInstanceGroupManagerCallable() {
    return getRegionInstanceGroupManagerCallable;
  }

  @BetaApi
  public UnaryCallable<InsertRegionInstanceGroupManagerHttpRequest, Operation>
      insertRegionInstanceGroupManagerCallable() {
    return insertRegionInstanceGroupManagerCallable;
  }

  @BetaApi
  public UnaryCallable<
          ListRegionInstanceGroupManagersHttpRequest, ListRegionInstanceGroupManagersPagedResponse>
      listRegionInstanceGroupManagersPagedCallable() {
    return listRegionInstanceGroupManagersPagedCallable;
  }

  @BetaApi
  public UnaryCallable<ListRegionInstanceGroupManagersHttpRequest, RegionInstanceGroupManagerList>
      listRegionInstanceGroupManagersCallable() {
    return listRegionInstanceGroupManagersCallable;
  }

  @BetaApi
  public UnaryCallable<
          ListErrorsRegionInstanceGroupManagersHttpRequest,
          ListErrorsRegionInstanceGroupManagersPagedResponse>
      listErrorsRegionInstanceGroupManagersPagedCallable() {
    return listErrorsRegionInstanceGroupManagersPagedCallable;
  }

  @BetaApi
  public UnaryCallable<
          ListErrorsRegionInstanceGroupManagersHttpRequest,
          RegionInstanceGroupManagersListErrorsResponse>
      listErrorsRegionInstanceGroupManagersCallable() {
    return listErrorsRegionInstanceGroupManagersCallable;
  }

  @BetaApi
  public UnaryCallable<
          ListManagedInstancesRegionInstanceGroupManagersHttpRequest,
          ListManagedInstancesRegionInstanceGroupManagersPagedResponse>
      listManagedInstancesRegionInstanceGroupManagersPagedCallable() {
    return listManagedInstancesRegionInstanceGroupManagersPagedCallable;
  }

  @BetaApi
  public UnaryCallable<
          ListManagedInstancesRegionInstanceGroupManagersHttpRequest,
          RegionInstanceGroupManagersListInstancesResponse>
      listManagedInstancesRegionInstanceGroupManagersCallable() {
    return listManagedInstancesRegionInstanceGroupManagersCallable;
  }

  @BetaApi
  public UnaryCallable<
          ListPerInstanceConfigsRegionInstanceGroupManagersHttpRequest,
          ListPerInstanceConfigsRegionInstanceGroupManagersPagedResponse>
      listPerInstanceConfigsRegionInstanceGroupManagersPagedCallable() {
    return listPerInstanceConfigsRegionInstanceGroupManagersPagedCallable;
  }

  @BetaApi
  public UnaryCallable<
          ListPerInstanceConfigsRegionInstanceGroupManagersHttpRequest,
          RegionInstanceGroupManagersListInstanceConfigsResp>
      listPerInstanceConfigsRegionInstanceGroupManagersCallable() {
    return listPerInstanceConfigsRegionInstanceGroupManagersCallable;
  }

  @BetaApi
  public UnaryCallable<PatchRegionInstanceGroupManagerHttpRequest, Operation>
      patchRegionInstanceGroupManagerCallable() {
    return patchRegionInstanceGroupManagerCallable;
  }

  @BetaApi
  public UnaryCallable<PatchPerInstanceConfigsRegionInstanceGroupManagerHttpRequest, Operation>
      patchPerInstanceConfigsRegionInstanceGroupManagerCallable() {
    return patchPerInstanceConfigsRegionInstanceGroupManagerCallable;
  }

  @BetaApi
  public UnaryCallable<RecreateInstancesRegionInstanceGroupManagerHttpRequest, Operation>
      recreateInstancesRegionInstanceGroupManagerCallable() {
    return recreateInstancesRegionInstanceGroupManagerCallable;
  }

  @BetaApi
  public UnaryCallable<ResizeRegionInstanceGroupManagerHttpRequest, Operation>
      resizeRegionInstanceGroupManagerCallable() {
    return resizeRegionInstanceGroupManagerCallable;
  }

  @BetaApi
  public UnaryCallable<SetInstanceTemplateRegionInstanceGroupManagerHttpRequest, Operation>
      setInstanceTemplateRegionInstanceGroupManagerCallable() {
    return setInstanceTemplateRegionInstanceGroupManagerCallable;
  }

  @BetaApi
  public UnaryCallable<SetTargetPoolsRegionInstanceGroupManagerHttpRequest, Operation>
      setTargetPoolsRegionInstanceGroupManagerCallable() {
    return setTargetPoolsRegionInstanceGroupManagerCallable;
  }

  @BetaApi
  public UnaryCallable<UpdatePerInstanceConfigsRegionInstanceGroupManagerHttpRequest, Operation>
      updatePerInstanceConfigsRegionInstanceGroupManagerCallable() {
    return updatePerInstanceConfigsRegionInstanceGroupManagerCallable;
  }

  @Override
  public final void close() {
    shutdown();
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
