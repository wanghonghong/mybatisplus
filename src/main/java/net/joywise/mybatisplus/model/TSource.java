package net.joywise.mybatisplus.model;

import com.baomidou.mybatisplus.annotations.KeySequence;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.Version;

import com.baomidou.mybatisplus.enums.IdType;
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
public class TSource extends Model<TSource> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;
    @TableField("sourceTitle")
    private String sourceTitle;
    @TableField("fileName")
    private String fileName;
    @TableField("fileUrl")
    private String fileUrl;
    /**
     * 1视频2音频3文档10图片11其他
     */
    @TableField("fileType")
    private Integer fileType;
    @TableField("fileFormat")
    private String fileFormat;
    @TableField("fileLength")
    private Long fileLength;
    @TableField("fileSize")
    private Long fileSize;
    /**
     * 
            -1转码失败  0--上传oss中  1--转码中  2转码完成
     */
    private Integer status;
    /**
     * -1--失败  0--正在上传 1--上传成功
     */
    @TableField("createTime")
    private Date createTime = new Date();
    @TableField("createrId")
    private Long createrId;
    /**
     * 浏览次数
     */
    @TableField("readCount")
    private Long readCount;
    /**
     * 关联基础平台机构ID
     */
    @TableField("appId")
    private Long appId;
    @TableField("failReason")
    private String failReason;
    /**
     * 1-阿里云oss 2-本地seaweed
     */
    @TableField("storeMode")
    private Integer storeMode;
    private String remark;
    /**
     * 1 转载 2 原创
     */
    private Integer origin;
    @TableField("dataSource")
    private Integer dataSource;
    @TableField(value = "updateTime",update = "now()")
    private Date updateTime;



    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
