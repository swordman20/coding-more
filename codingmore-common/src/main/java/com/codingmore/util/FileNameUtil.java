package com.codingmore.util;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.IdUtil;

/**
 * 微信搜索「沉默王二」，回复 Java
 *
 * @author 沉默王二
 * @date 4/22/22
 */
public class FileNameUtil {
    private static final String[] imageExtension = {".jpg", ".jpeg", ".png", ".gif"};

    public static String getFileName(String dirPrefix, String url) {
        String ext = "";
        for (String extItem : imageExtension) {
            if (url.indexOf(extItem) != -1) {
                ext = extItem;
                break;
            }
        }
        return dirPrefix + DateUtil.today() + "/" + IdUtil.randomUUID() + ext;
    }
}
