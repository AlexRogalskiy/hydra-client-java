/*
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: v1.10.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.hydra.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import sh.ory.hydra.model.PluginConfigArgs;
import sh.ory.hydra.model.PluginConfigInterface;
import sh.ory.hydra.model.PluginConfigLinux;
import sh.ory.hydra.model.PluginConfigNetwork;
import sh.ory.hydra.model.PluginConfigRootfs;
import sh.ory.hydra.model.PluginConfigUser;
import sh.ory.hydra.model.PluginEnv;
import sh.ory.hydra.model.PluginMount;

/**
 * PluginConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-14T15:27:18.942684284Z[Etc/UTC]")
public class PluginConfig {
  public static final String SERIALIZED_NAME_ARGS = "Args";
  @SerializedName(SERIALIZED_NAME_ARGS)
  private PluginConfigArgs args;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DOCKER_VERSION = "DockerVersion";
  @SerializedName(SERIALIZED_NAME_DOCKER_VERSION)
  private String dockerVersion;

  public static final String SERIALIZED_NAME_DOCUMENTATION = "Documentation";
  @SerializedName(SERIALIZED_NAME_DOCUMENTATION)
  private String documentation;

  public static final String SERIALIZED_NAME_ENTRYPOINT = "Entrypoint";
  @SerializedName(SERIALIZED_NAME_ENTRYPOINT)
  private List<String> entrypoint = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENV = "Env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private List<PluginEnv> env = new ArrayList<>();

  public static final String SERIALIZED_NAME_INTERFACE = "Interface";
  @SerializedName(SERIALIZED_NAME_INTERFACE)
  private PluginConfigInterface _interface;

  public static final String SERIALIZED_NAME_IPC_HOST = "IpcHost";
  @SerializedName(SERIALIZED_NAME_IPC_HOST)
  private Boolean ipcHost;

  public static final String SERIALIZED_NAME_LINUX = "Linux";
  @SerializedName(SERIALIZED_NAME_LINUX)
  private PluginConfigLinux linux;

  public static final String SERIALIZED_NAME_MOUNTS = "Mounts";
  @SerializedName(SERIALIZED_NAME_MOUNTS)
  private List<PluginMount> mounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_NETWORK = "Network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private PluginConfigNetwork network;

  public static final String SERIALIZED_NAME_PID_HOST = "PidHost";
  @SerializedName(SERIALIZED_NAME_PID_HOST)
  private Boolean pidHost;

  public static final String SERIALIZED_NAME_PROPAGATED_MOUNT = "PropagatedMount";
  @SerializedName(SERIALIZED_NAME_PROPAGATED_MOUNT)
  private String propagatedMount;

  public static final String SERIALIZED_NAME_USER = "User";
  @SerializedName(SERIALIZED_NAME_USER)
  private PluginConfigUser user;

  public static final String SERIALIZED_NAME_WORK_DIR = "WorkDir";
  @SerializedName(SERIALIZED_NAME_WORK_DIR)
  private String workDir;

  public static final String SERIALIZED_NAME_ROOTFS = "rootfs";
  @SerializedName(SERIALIZED_NAME_ROOTFS)
  private PluginConfigRootfs rootfs;


  public PluginConfig args(PluginConfigArgs args) {
    
    this.args = args;
    return this;
  }

   /**
   * Get args
   * @return args
  **/
  @ApiModelProperty(required = true, value = "")

  public PluginConfigArgs getArgs() {
    return args;
  }


  public void setArgs(PluginConfigArgs args) {
    this.args = args;
  }


  public PluginConfig description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "description")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PluginConfig dockerVersion(String dockerVersion) {
    
    this.dockerVersion = dockerVersion;
    return this;
  }

   /**
   * Docker Version used to create the plugin
   * @return dockerVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Docker Version used to create the plugin")

  public String getDockerVersion() {
    return dockerVersion;
  }


  public void setDockerVersion(String dockerVersion) {
    this.dockerVersion = dockerVersion;
  }


  public PluginConfig documentation(String documentation) {
    
    this.documentation = documentation;
    return this;
  }

   /**
   * documentation
   * @return documentation
  **/
  @ApiModelProperty(required = true, value = "documentation")

  public String getDocumentation() {
    return documentation;
  }


  public void setDocumentation(String documentation) {
    this.documentation = documentation;
  }


  public PluginConfig entrypoint(List<String> entrypoint) {
    
    this.entrypoint = entrypoint;
    return this;
  }

  public PluginConfig addEntrypointItem(String entrypointItem) {
    this.entrypoint.add(entrypointItem);
    return this;
  }

   /**
   * entrypoint
   * @return entrypoint
  **/
  @ApiModelProperty(required = true, value = "entrypoint")

  public List<String> getEntrypoint() {
    return entrypoint;
  }


  public void setEntrypoint(List<String> entrypoint) {
    this.entrypoint = entrypoint;
  }


  public PluginConfig env(List<PluginEnv> env) {
    
    this.env = env;
    return this;
  }

  public PluginConfig addEnvItem(PluginEnv envItem) {
    this.env.add(envItem);
    return this;
  }

   /**
   * env
   * @return env
  **/
  @ApiModelProperty(required = true, value = "env")

  public List<PluginEnv> getEnv() {
    return env;
  }


  public void setEnv(List<PluginEnv> env) {
    this.env = env;
  }


  public PluginConfig _interface(PluginConfigInterface _interface) {
    
    this._interface = _interface;
    return this;
  }

   /**
   * Get _interface
   * @return _interface
  **/
  @ApiModelProperty(required = true, value = "")

  public PluginConfigInterface getInterface() {
    return _interface;
  }


  public void setInterface(PluginConfigInterface _interface) {
    this._interface = _interface;
  }


  public PluginConfig ipcHost(Boolean ipcHost) {
    
    this.ipcHost = ipcHost;
    return this;
  }

   /**
   * ipc host
   * @return ipcHost
  **/
  @ApiModelProperty(required = true, value = "ipc host")

  public Boolean getIpcHost() {
    return ipcHost;
  }


  public void setIpcHost(Boolean ipcHost) {
    this.ipcHost = ipcHost;
  }


  public PluginConfig linux(PluginConfigLinux linux) {
    
    this.linux = linux;
    return this;
  }

   /**
   * Get linux
   * @return linux
  **/
  @ApiModelProperty(required = true, value = "")

  public PluginConfigLinux getLinux() {
    return linux;
  }


  public void setLinux(PluginConfigLinux linux) {
    this.linux = linux;
  }


  public PluginConfig mounts(List<PluginMount> mounts) {
    
    this.mounts = mounts;
    return this;
  }

  public PluginConfig addMountsItem(PluginMount mountsItem) {
    this.mounts.add(mountsItem);
    return this;
  }

   /**
   * mounts
   * @return mounts
  **/
  @ApiModelProperty(required = true, value = "mounts")

  public List<PluginMount> getMounts() {
    return mounts;
  }


  public void setMounts(List<PluginMount> mounts) {
    this.mounts = mounts;
  }


  public PluginConfig network(PluginConfigNetwork network) {
    
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @ApiModelProperty(required = true, value = "")

  public PluginConfigNetwork getNetwork() {
    return network;
  }


  public void setNetwork(PluginConfigNetwork network) {
    this.network = network;
  }


  public PluginConfig pidHost(Boolean pidHost) {
    
    this.pidHost = pidHost;
    return this;
  }

   /**
   * pid host
   * @return pidHost
  **/
  @ApiModelProperty(required = true, value = "pid host")

  public Boolean getPidHost() {
    return pidHost;
  }


  public void setPidHost(Boolean pidHost) {
    this.pidHost = pidHost;
  }


  public PluginConfig propagatedMount(String propagatedMount) {
    
    this.propagatedMount = propagatedMount;
    return this;
  }

   /**
   * propagated mount
   * @return propagatedMount
  **/
  @ApiModelProperty(required = true, value = "propagated mount")

  public String getPropagatedMount() {
    return propagatedMount;
  }


  public void setPropagatedMount(String propagatedMount) {
    this.propagatedMount = propagatedMount;
  }


  public PluginConfig user(PluginConfigUser user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PluginConfigUser getUser() {
    return user;
  }


  public void setUser(PluginConfigUser user) {
    this.user = user;
  }


  public PluginConfig workDir(String workDir) {
    
    this.workDir = workDir;
    return this;
  }

   /**
   * work dir
   * @return workDir
  **/
  @ApiModelProperty(required = true, value = "work dir")

  public String getWorkDir() {
    return workDir;
  }


  public void setWorkDir(String workDir) {
    this.workDir = workDir;
  }


  public PluginConfig rootfs(PluginConfigRootfs rootfs) {
    
    this.rootfs = rootfs;
    return this;
  }

   /**
   * Get rootfs
   * @return rootfs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PluginConfigRootfs getRootfs() {
    return rootfs;
  }


  public void setRootfs(PluginConfigRootfs rootfs) {
    this.rootfs = rootfs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginConfig pluginConfig = (PluginConfig) o;
    return Objects.equals(this.args, pluginConfig.args) &&
        Objects.equals(this.description, pluginConfig.description) &&
        Objects.equals(this.dockerVersion, pluginConfig.dockerVersion) &&
        Objects.equals(this.documentation, pluginConfig.documentation) &&
        Objects.equals(this.entrypoint, pluginConfig.entrypoint) &&
        Objects.equals(this.env, pluginConfig.env) &&
        Objects.equals(this._interface, pluginConfig._interface) &&
        Objects.equals(this.ipcHost, pluginConfig.ipcHost) &&
        Objects.equals(this.linux, pluginConfig.linux) &&
        Objects.equals(this.mounts, pluginConfig.mounts) &&
        Objects.equals(this.network, pluginConfig.network) &&
        Objects.equals(this.pidHost, pluginConfig.pidHost) &&
        Objects.equals(this.propagatedMount, pluginConfig.propagatedMount) &&
        Objects.equals(this.user, pluginConfig.user) &&
        Objects.equals(this.workDir, pluginConfig.workDir) &&
        Objects.equals(this.rootfs, pluginConfig.rootfs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, description, dockerVersion, documentation, entrypoint, env, _interface, ipcHost, linux, mounts, network, pidHost, propagatedMount, user, workDir, rootfs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginConfig {\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dockerVersion: ").append(toIndentedString(dockerVersion)).append("\n");
    sb.append("    documentation: ").append(toIndentedString(documentation)).append("\n");
    sb.append("    entrypoint: ").append(toIndentedString(entrypoint)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    _interface: ").append(toIndentedString(_interface)).append("\n");
    sb.append("    ipcHost: ").append(toIndentedString(ipcHost)).append("\n");
    sb.append("    linux: ").append(toIndentedString(linux)).append("\n");
    sb.append("    mounts: ").append(toIndentedString(mounts)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    pidHost: ").append(toIndentedString(pidHost)).append("\n");
    sb.append("    propagatedMount: ").append(toIndentedString(propagatedMount)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    workDir: ").append(toIndentedString(workDir)).append("\n");
    sb.append("    rootfs: ").append(toIndentedString(rootfs)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

