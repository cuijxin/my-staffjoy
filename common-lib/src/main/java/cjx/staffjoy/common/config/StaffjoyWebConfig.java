package cjx.staffjoy.common.config;

import cjx.staffjoy.common.aop.SentryClientAspect;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Use this common config for Web App
 */
@Configuration
@Import(value = {StaffjoyConfig.class, SentryClientAspect.class,})
public class StaffjoyWebConfig {
}
