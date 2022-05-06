package com.springboot.demo1.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "app")
public class AppConfig {
    public String address;
    public Integer port;
    public String name;
    public List<String> listStr;
    public Map<String, String> prop;
    public List<DependOnService> dependOn;

    public Map<String, String> getProp() {
        return prop;
    }

    public void setProp(Map<String, String> prop) {
        this.prop = prop;
    }

    public List<String> getListStr() {
        return listStr;
    }

    public void setListStr(List<String> listStr) {
        this.listStr = listStr;
    }

    public List<DependOnService> getDependOn() {
        return dependOn;
    }

    public void setDependOn(List<DependOnService> dependOn) {
        this.dependOn = dependOn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}