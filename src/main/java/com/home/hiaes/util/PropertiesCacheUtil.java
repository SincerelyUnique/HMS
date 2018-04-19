
package com.home.hiaes.util;

import lombok.extern.log4j.Log4j;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.util.HashMap;
import java.util.Properties;

/**
 * <p>
 * <code>PropertiesCacheUtil</code>
 * </p>
 * Description:读去属性文件
 *
 * @author Mcchu
 * @date 2017/12/22 9:51
 */
@Log4j
public class PropertiesCacheUtil {

    private static Properties props;

    private static HashMap<String,Properties> map;

    private static void loadProps(String fileName){
        if(props==null){
            props = new Properties();
        }
        if(map==null){
            map = new HashMap<String,Properties>();
        }
        try {
            props = PropertiesLoaderUtils.loadAllProperties(fileName);
            map.put(fileName,props);
        } catch (Exception e) {
            log.error(fileName+"文件未找到",e);
        }
    }

    public static String getProperty(String key,String fileName){
        if(map == null || map.get(fileName)==null){
            loadProps(fileName);
        }
        return map.get(fileName)==null? "" : map.get(fileName).getProperty(key);
    }
}
