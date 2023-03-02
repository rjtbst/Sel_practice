package com.utils.owner;


import org.aeonbits.owner.Config;

@Config.Sources(value ="file:${user.dir}/src/test/resources/FrameworkConfig.properties")
public interface FrameworkConfig extends Config{
    String browser();
    String url();

    String rediffUrl();
}
