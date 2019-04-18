package third.world.hao.controller;

import com.google.common.base.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import third.world.hao.constant.Info;
import third.world.hao.dto.AuthorityDTO;
import third.world.hao.dto.ResultTO;
import third.world.hao.exception.CommonException;
import third.world.hao.service.AuthorityService;

/**
 * @program: hao
 * @description:
 *
 * @create: 2019-04-14 01:06
 **/
@RestController
@RequestMapping("/Authority")
public class AuthorityController {
    @Autowired
    private AuthorityService authorityService;


    private void validatePolicy(AuthorityDTO AuthorityDTO){
        boolean res = AuthorityDTO==null||AuthorityDTO.getAuthority()==null?true:false;
        if(res) throw new CommonException("缺少参数");
    }

    private void validateAuth(AuthorityDTO AuthorityDTO){
        validatePolicy(AuthorityDTO);
        boolean res2 = Strings.isNullOrEmpty(AuthorityDTO.getUserId())||!AuthorityDTO.getUserId().equalsIgnoreCase(Info.ADMIN.getCode())?true:false;
        if(res2) throw new CommonException("请检查是否有管理员帐号权限");
    }

    @PostMapping("/insert")
    public ResultTO insert(@RequestBody AuthorityDTO AuthorityDTO){
        validateAuth(AuthorityDTO);
        authorityService.insert(AuthorityDTO.getAuthority());
        return new ResultTO();
    }

    @PostMapping("/delete")
    public ResultTO delete(@RequestBody AuthorityDTO AuthorityDTO){
        validateAuth(AuthorityDTO);
        authorityService.delete(AuthorityDTO.getAuthority().getId());
        return new ResultTO();
    }

    @PostMapping("/update")
    public ResultTO update(@RequestBody AuthorityDTO authorityDTO){
        validateAuth(authorityDTO);
        authorityService.update(authorityDTO.getAuthority(),authorityDTO.getAuthority().getId());
        return new ResultTO();
    }

    @GetMapping("/selectById")
    public ResultTO selectById(Integer id){
//        validatePolicy(AuthorityDTO);
//        validateAuth(AuthorityDTO);
        if(id==null) throw new CommonException("请检查参数");

        return new ResultTO(authorityService.get(id));
    }

    @GetMapping("/getAll")
    public ResultTO getAll(){
        return new ResultTO(authorityService.getAll());
    }
}
