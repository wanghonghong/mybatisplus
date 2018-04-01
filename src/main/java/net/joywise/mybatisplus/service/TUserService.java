package net.joywise.mybatisplus.service;

import net.joywise.mybatisplus.mapper.TUserMapper;
import net.joywise.mybatisplus.model.TUser;
import com.baomidou.mybatisplus.service.IService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author K神带你飞
 * @since 2018-04-01
 */
public interface TUserService extends IService<TUser> {


    TUser getUser(Long userId);

    List<Map<String,Object>> selectList();

    Object getUser();

    Object update(String id);
}
