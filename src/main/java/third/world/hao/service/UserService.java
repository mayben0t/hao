package third.world.hao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import third.world.hao.exception.CommonException;
import third.world.hao.mapper.UserMapper;
import third.world.hao.model.User;
import third.world.hao.util.StringUtils;

/**
 * @program: hao
 * @description:
 *
 * @create: 2019-04-10 22:44
 **/
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    private User getUserByName(String name){
        if(StringUtils.notExists(name)) return null;
        return userMapper.getUserByName(name);
    }

    public void register(User user) throws CommonException{
        user.setId(null);
        if(getUserByName(user.getName())!=null){ throw new CommonException("用户名重复");}
        userMapper.insertSelective(user);
    }

    public boolean login(String name,String password){
        if(StringUtils.notExists(name)){ return false;}
        User user = getUserByName(name);
        return StringUtils.equals(user.getPassword(),password);
    }
}
