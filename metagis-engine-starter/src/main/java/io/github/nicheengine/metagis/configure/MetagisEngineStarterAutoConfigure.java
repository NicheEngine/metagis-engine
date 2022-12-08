package io.github.nicheengine.metagis.configure;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>MetagisEngineStarterAutoConfigure</p>
 * @author Cyan (snow22314@outlook.com)
 * @version v1.0.0
 */
@Slf4j
@Configuration
@ComponentScan(basePackages = {"io.github.nicheengine.metagis"})
public class MetagisEngineStarterAutoConfigure {
    public MetagisEngineStarterAutoConfigure() {
        log.debug("================= metagis-engine-starter-auto-configure initiated ！ ===================");
    }
}
