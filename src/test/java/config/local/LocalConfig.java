package config.local;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:local.properties")
public interface LocalConfig extends Config {

    @Key("device")
    String device();

    @Key("os_version")
    String os_version();

    @Config.Key("os_name")
    String os_name();

    @Config.Key("URL")
    String URL();

}