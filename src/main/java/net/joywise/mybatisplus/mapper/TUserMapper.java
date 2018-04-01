package net.joywise.mybatisplus.mapper;

import net.joywise.mybatisplus.model.TUser;
import com.baomidou.mybatisplus.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author K神带你飞
 * @since 2018-04-01
 */
public interface TUserMapper extends BaseMapper<TUser> {

    List<Map<String,Object>> selectList();

    TUser getUser(Long userId);


}
