package com.jay.springbootdeeplearn.custom.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;

/**
 * Created by xiang.wei on 2018/9/11
 *
 * @author xiang.wei
 */
public class OnSystemPropertyCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        MultiValueMap<String, Object> attrs = annotatedTypeMetadata.getAllAnnotationAttributes(ConditionalOnSystemProperty.class.getName());

        String system = String.valueOf(attrs.get("value"));
        String currentOs = System.getProperty("os.name");
        return currentOs.endsWith(system);
    }

}
