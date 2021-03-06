package com.xxplus.params;

import org.apache.commons.beanutils.converters.AbstractConverter;

public class EnumConverter extends AbstractConverter {

    private final Class<?> enumClass;

    public EnumConverter(Class<?> enumClass) {
        this(enumClass, null);
    }

    public EnumConverter(Class<?> enumClass, Object defaultValue) {
        super(defaultValue);
        this.enumClass = enumClass;
    }

    @Override
    protected Class<?> getDefaultType() {
        return this.enumClass;
    }

    @Override
    protected Object convertToType(Class type, Object value) {
        String stringValue = value.toString().trim();
        return Enum.valueOf(type, stringValue);
    }

    @Override
    protected String convertToString(Object value) {
        return value.toString();
    }

}