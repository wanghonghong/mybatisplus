package net.joywise.mybatisplus.service.impl;

import net.joywise.mybatisplus.model.TUser;
import net.joywise.mybatisplus.mapper.TUserMapper;
import net.joywise.mybatisplus.service.TUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author K神带你飞
 * @since 2018-04-01
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements TUserService {

    @Resource
    private TUserMapper tUserMapper;


    @Override
    public TUser getUser(Long userId) {
        TUser tUser = tUserMapper.getUser(userId);
        tUser.setDid("asdasd");
        tUser.selectById();
        return tUser;
    }

    @Override
    public List<Map<String, Object>> selectList() {
        return tUserMapper.selectList();
    }

    @Override
    public Object getUser() {
        TUser user = new TUser();
        user.setName("test");
        user.insert();
        return user;
    }

    @Override
    public Object update(String id) {
        TUser user = tUserMapper.selectById(id);
        user.setBirthDay(new Date());
        user.updateById();
        return user;
    }


}
