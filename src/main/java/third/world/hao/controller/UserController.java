package third.world.hao.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import third.world.hao.dto.ResultTO;
import third.world.hao.dto.UserDTO;
import third.world.hao.exception.CommonException;
import third.world.hao.model.User;
import third.world.hao.service.UserService;
import third.world.hao.util.StringUtils;

/**
 * @program: hao
 * @description:
 *
 * @create: 2019-04-10 23:13
 **/
@RestController
@RequestMapping("/user")
@Api("user的相关接口")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value="用户注册", notes="注册",produces = "application/json")
    @PostMapping("/register")
    public ResultTO register(@RequestBody User user) throws CommonException{
        if(user==null)       throw new CommonException("参数为空");
        if(StringUtils.notExists(user.getName())||StringUtils.notExists(user.getPassword())) throw new CommonException("用户名或密码为空");
        userService.register(user);
        return new ResultTO("恭喜你，注册成功");
    }

    @ApiOperation(value="用户登录", notes="登录",produces = "application/json")
    @PostMapping("/login")
    public ResultTO login(@RequestBody UserDTO userDTO) throws CommonException{
        if(userDTO==null)  throw new CommonException("对象为空");
        return new ResultTO(userService.login(userDTO.getName(),userDTO.getPassword()));
    }
}
