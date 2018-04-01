package net.joywise.mybatisplus.model;

import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.Version;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author K神带你飞
 * @since 2018-04-01
 */
@Data
@Accessors(chain = true)
public class TUser extends Model<TUser> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "userId", type = IdType.AUTO)
    private Long userId;
    /**
     * 生日
     */
    @TableField("birthDay")
    private Date birthDay;
    @TableField("createTime")
    private Date createTime;
    @TableField("detaUserName")
    private String detaUserName;
    private String did;
    /**
     * 邮箱
     */
    private String email;
    @TableField("errorCount")
    private Integer errorCount;
    @TableField("headImageUrl")
    private String headImageUrl;
    @TableField("idNumber")
    private String idNumber;
    @TableField("lastErrorTime")
    private Date lastErrorTime;
    @TableField("lastLoginTime")
    private Date lastLoginTime;
    @TableField("loginLock")
    private Boolean loginLock;
    @TableField(value = "modifyTime",update = "now()")
    private Date modifyTime;
    private String name;
    @TableField("originId")
    private Long originId;
    private String password;
    @TableField("powerCreateTime")
    private Date powerCreateTime;
    @TableField("powerModifyTime")
    private Date powerModifyTime;
    private Integer sex;
    private Integer status;
    @TableField("studyRole")
    private String studyRole;
    @TableField("telephoneNumber")
    private String telephoneNumber;
    @TableField("userName")
    private String userName;
    @TableField("userRole")
    private String userRole;
    @TableField("userType")
    private Integer userType;
    @TableField("createId")
    private Long createId;
    @TableField("modifyId")
    private Long modifyId;
    @TableField("powerCreateId")
    private Long powerCreateId;
    @TableField("powerModifyId")
    private Long powerModifyId;
    @TableField("schoolId")
    private Long schoolId;


    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

}
