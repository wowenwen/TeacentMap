package com.vseadata.edu.commons.util;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class BeanUtil {

    public static <T, K, V> T map2Bean(Map<K, V> mp, Class<T> beanCls)
            throws Exception, IllegalArgumentException, InvocationTargetException {
        T t = null;
        try {

            BeanInfo beanInfo = Introspector.getBeanInfo(beanCls);
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();

            t = beanCls.newInstance();

            for (PropertyDescriptor property : propertyDescriptors) {
                String key = property.getName();

                if (mp.containsKey(key)) {
                    Object value = mp.get(key);
                    Method setter = property.getWriteMethod();
                    // getter/setter方法
                    setter.invoke(t, value);
                }
            }

        } catch (IntrospectionException e) {

            e.printStackTrace();
        }
        return t;
    }



    public static Map<String, Object> transBean2Map(Object obj) {

         if(obj == null){
                 return null;
             }
          Map<String, Object> map = new HashMap<String, Object>();
          try {
                  BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
                  PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
                    for (PropertyDescriptor property : propertyDescriptors) {
                     String key = property.getName();

                     // 过滤class属性
                     if (!key.equals("class")) {
                             // 得到property对应的getter方法
                             Method getter = property.getReadMethod();
                             Object value = getter.invoke(obj);

                             map.put(key, value);
                         }

                 }
                } catch (Exception e) {
                    System.out.println("transBean2Map Error " + e);
                }

            return map;

        }

}
