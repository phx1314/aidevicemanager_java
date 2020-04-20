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
@TableName("oa_models")
public class OaModels implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    /**
     * 系列id
     */
    private String sid;

    private String name;


}
