package com.sy.common.converter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;


import java.io.IOException;

/**
 * Created by Administrator on 2016/3/28.
 * wangwanbin
 * 解决NULL转换为""
 */
public class NullDataConverter extends ObjectMapper{
    private static final long serialVersionUID = 1L;
    public NullDataConverter() {
        super();
        // 空值处理为空串
        this.getSerializerProvider().setNullValueSerializer(new JsonSerializer<Object>() {
            @Override
            public void serialize(Object value, JsonGenerator jg, SerializerProvider sp) throws IOException, JsonProcessingException {
                jg.writeString("");
            }
        });
    }
}
