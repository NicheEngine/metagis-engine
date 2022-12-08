package io.github.nicheengine.metagis.configure;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * <p>MetagisEngineTestWebAutoConfigure</p>
 * @author Cyan (snow22314@outlook.com)
 * @version v1.0.0
 */
@Slf4j
@Configuration
@MapperScan(basePackages = {"io.github.nicheengine.metagis.mapper"})
@ComponentScan(basePackages = {"io.github.nicheengine.metagis"})
@ImportAutoConfiguration(value = {MetagisEngineDatasourceAutoConfigure.class})
public class MetagisEngineTestWebAutoConfigure {
    public MetagisEngineTestWebAutoConfigure() {
        log.debug("================= metagis-engine-test-web-auto-configure initiated ！ ===================");
    }
}
