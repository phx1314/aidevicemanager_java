package com.deepblue.aidevicemanager.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author df
 * @since 2020-04-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("oa_device")
public class OaDevice implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 状态
     */
    private String status;

    private String deviceName;

    /**
     * 速度
     */
    private String speed;

    /**
     * 方向
     */
    private String direction;

    /**
     * 是否连接
     */
    private String isconnected;

    private String wifi;

    private String yidong;

    private String quantitiy;

    private String lat;

    private String lng;


}
