package com.zlx.wiki.utils;

import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;


public class CopyTools {
    /**
     * 拷贝单个对象属性值
     * @param source 源对象
     * @param targetCLass 目标对象
     * @param <T> 泛型
     * @return target
     */
    public static <T> T copyClass(Object source,Class<T> targetCLass){
        T obj = null;
        try{
           obj =  targetCLass.newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (InstantiationException e) {
            e.printStackTrace();
            return null;
        }
        BeanUtils.copyProperties(source,obj);
        return obj;
    }

    /**
     * 返回列表每个元素的属性值
     * @param sourceList 源列表
     * @param targetClass 拷贝属性的列表
     * @param <T> 泛型
     * @return 拷贝属性的列表
     */
    public static <T> List<T> copyList(List sourceList,Class<T> targetClass){
        T obj;
        List<T> list = new ArrayList<>();
        if(!CollectionUtils.isEmpty(sourceList)) {
            for (Object source : sourceList) {
                obj = copyClass(source, targetClass);
                list.add(obj);
            }
        }
        return list;
    }
}
