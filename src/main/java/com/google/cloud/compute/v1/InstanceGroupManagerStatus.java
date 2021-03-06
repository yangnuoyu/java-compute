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
package com.google.cloud.compute.v1;

import com.google.api.core.BetaApi;
import com.google.api.gax.httpjson.ApiMessage;
import java.util.List;
import java.util.Objects;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("by GAPIC")
@BetaApi
public final class InstanceGroupManagerStatus implements ApiMessage {
  private final String autoscaler;
  private final Boolean isStable;
  private final InstanceGroupManagerStatusStateful stateful;
  private final InstanceGroupManagerStatusVersionTarget versionTarget;

  private InstanceGroupManagerStatus() {
    this.autoscaler = null;
    this.isStable = null;
    this.stateful = null;
    this.versionTarget = null;
  }

  private InstanceGroupManagerStatus(
      String autoscaler,
      Boolean isStable,
      InstanceGroupManagerStatusStateful stateful,
      InstanceGroupManagerStatusVersionTarget versionTarget) {
    this.autoscaler = autoscaler;
    this.isStable = isStable;
    this.stateful = stateful;
    this.versionTarget = versionTarget;
  }

  @Override
  public Object getFieldValue(String fieldName) {
    if ("autoscaler".equals(fieldName)) {
      return autoscaler;
    }
    if ("isStable".equals(fieldName)) {
      return isStable;
    }
    if ("stateful".equals(fieldName)) {
      return stateful;
    }
    if ("versionTarget".equals(fieldName)) {
      return versionTarget;
    }
    return null;
  }

  @Nullable
  @Override
  public ApiMessage getApiMessageRequestBody() {
    return null;
  }

  @Nullable
  @Override
  /**
   * The fields that should be serialized (even if they have empty values). If the containing
   * message object has a non-null fieldmask, then all the fields in the field mask (and only those
   * fields in the field mask) will be serialized. If the containing object does not have a
   * fieldmask, then only non-empty fields will be serialized.
   */
  public List<String> getFieldMask() {
    return null;
  }

  /** [Output Only] The URL of the Autoscaler that targets this instance group manager. */
  public String getAutoscaler() {
    return autoscaler;
  }

  /**
   * [Output Only] A bit indicating whether the managed instance group is in a stable state. A
   * stable state means that: none of the instances in the managed instance group is currently
   * undergoing any type of change (for example, creation, restart, or deletion); no future changes
   * are scheduled for instances in the managed instance group; and the managed instance group
   * itself is not being modified.
   */
  public Boolean getIsStable() {
    return isStable;
  }

  /** [Output Only] Stateful status of the given Instance Group Manager. */
  public InstanceGroupManagerStatusStateful getStateful() {
    return stateful;
  }

  /**
   * [Output Only] A status of consistency of Instances' versions with their target version
   * specified by version field on Instance Group Manager.
   */
  public InstanceGroupManagerStatusVersionTarget getVersionTarget() {
    return versionTarget;
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(InstanceGroupManagerStatus prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  public static InstanceGroupManagerStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final InstanceGroupManagerStatus DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new InstanceGroupManagerStatus();
  }

  public static class Builder {
    private String autoscaler;
    private Boolean isStable;
    private InstanceGroupManagerStatusStateful stateful;
    private InstanceGroupManagerStatusVersionTarget versionTarget;

    Builder() {}

    public Builder mergeFrom(InstanceGroupManagerStatus other) {
      if (other == InstanceGroupManagerStatus.getDefaultInstance()) return this;
      if (other.getAutoscaler() != null) {
        this.autoscaler = other.autoscaler;
      }
      if (other.getIsStable() != null) {
        this.isStable = other.isStable;
      }
      if (other.getStateful() != null) {
        this.stateful = other.stateful;
      }
      if (other.getVersionTarget() != null) {
        this.versionTarget = other.versionTarget;
      }
      return this;
    }

    Builder(InstanceGroupManagerStatus source) {
      this.autoscaler = source.autoscaler;
      this.isStable = source.isStable;
      this.stateful = source.stateful;
      this.versionTarget = source.versionTarget;
    }

    /** [Output Only] The URL of the Autoscaler that targets this instance group manager. */
    public String getAutoscaler() {
      return autoscaler;
    }

    /** [Output Only] The URL of the Autoscaler that targets this instance group manager. */
    public Builder setAutoscaler(String autoscaler) {
      this.autoscaler = autoscaler;
      return this;
    }

    /**
     * [Output Only] A bit indicating whether the managed instance group is in a stable state. A
     * stable state means that: none of the instances in the managed instance group is currently
     * undergoing any type of change (for example, creation, restart, or deletion); no future
     * changes are scheduled for instances in the managed instance group; and the managed instance
     * group itself is not being modified.
     */
    public Boolean getIsStable() {
      return isStable;
    }

    /**
     * [Output Only] A bit indicating whether the managed instance group is in a stable state. A
     * stable state means that: none of the instances in the managed instance group is currently
     * undergoing any type of change (for example, creation, restart, or deletion); no future
     * changes are scheduled for instances in the managed instance group; and the managed instance
     * group itself is not being modified.
     */
    public Builder setIsStable(Boolean isStable) {
      this.isStable = isStable;
      return this;
    }

    /** [Output Only] Stateful status of the given Instance Group Manager. */
    public InstanceGroupManagerStatusStateful getStateful() {
      return stateful;
    }

    /** [Output Only] Stateful status of the given Instance Group Manager. */
    public Builder setStateful(InstanceGroupManagerStatusStateful stateful) {
      this.stateful = stateful;
      return this;
    }

    /**
     * [Output Only] A status of consistency of Instances' versions with their target version
     * specified by version field on Instance Group Manager.
     */
    public InstanceGroupManagerStatusVersionTarget getVersionTarget() {
      return versionTarget;
    }

    /**
     * [Output Only] A status of consistency of Instances' versions with their target version
     * specified by version field on Instance Group Manager.
     */
    public Builder setVersionTarget(InstanceGroupManagerStatusVersionTarget versionTarget) {
      this.versionTarget = versionTarget;
      return this;
    }

    public InstanceGroupManagerStatus build() {

      return new InstanceGroupManagerStatus(autoscaler, isStable, stateful, versionTarget);
    }

    public Builder clone() {
      Builder newBuilder = new Builder();
      newBuilder.setAutoscaler(this.autoscaler);
      newBuilder.setIsStable(this.isStable);
      newBuilder.setStateful(this.stateful);
      newBuilder.setVersionTarget(this.versionTarget);
      return newBuilder;
    }
  }

  @Override
  public String toString() {
    return "InstanceGroupManagerStatus{"
        + "autoscaler="
        + autoscaler
        + ", "
        + "isStable="
        + isStable
        + ", "
        + "stateful="
        + stateful
        + ", "
        + "versionTarget="
        + versionTarget
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof InstanceGroupManagerStatus) {
      InstanceGroupManagerStatus that = (InstanceGroupManagerStatus) o;
      return Objects.equals(this.autoscaler, that.getAutoscaler())
          && Objects.equals(this.isStable, that.getIsStable())
          && Objects.equals(this.stateful, that.getStateful())
          && Objects.equals(this.versionTarget, that.getVersionTarget());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoscaler, isStable, stateful, versionTarget);
  }
}
