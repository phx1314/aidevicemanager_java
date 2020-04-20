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
@TableName("oa_user")
public class OaUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * dia
     */
    private String id;

    /**
     * 电话
     */
    private String phone;

    /**
     * 密码
     */
    private String password;


}
