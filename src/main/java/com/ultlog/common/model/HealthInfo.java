package com.ultlog.common.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * @program: common
 * @link: github.com/ultlog/common
 * @author: will
 * @create: 2020-05-24
 **/
public class HealthInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    public HealthInfo() {
    }

    /**
     * ip of collector
     */
    private String ip;

    /**
     * port of collector
     */
    private String port;

    /**
     * name of project
     */
    private String project;

    /**
     * name of module
     */
    private String module;

    /**
     * uuid of instance(container)
     */
    private String uuid;

    /**
     * refresh time
     */
    private Long refreshTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HealthInfo that = (HealthInfo) o;
        return Objects.equals(ip, that.ip) &&
                Objects.equals(port, that.port) &&
                Objects.equals(project, that.project) &&
                Objects.equals(module, that.module) &&
                Objects.equals(uuid, that.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip, port, project, module, uuid);
    }

    /**
     * rank of logThreadPool
     */
    private Double logThreadPoolRank;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Double getLogThreadPoolRank() {
        return logThreadPoolRank;
    }

    public void setLogThreadPoolRank(Double logThreadPoolRank) {
        this.logThreadPoolRank = logThreadPoolRank;
    }

    public Long getRefreshTime() {
        return refreshTime;
    }

    public void setRefreshTime(Long refreshTime) {
        this.refreshTime = refreshTime;
    }
}
