package third.world.hao.controller;

import com.google.common.base.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import third.world.hao.constant.Info;
import third.world.hao.dto.PolicyDTO;
import third.world.hao.dto.ResultTO;
import third.world.hao.exception.CommonException;
import third.world.hao.model.Policy;
import third.world.hao.service.PolicyService;

/**
 * @program: hao
 * @description:
 *
 * @create: 2019-04-14 01:06
 **/
@RestController
@RequestMapping("/policy")
public class PolicyController {
    @Autowired
    private PolicyService policyService;


    private void validatePolicy(PolicyDTO policyDTO){
        boolean res = policyDTO==null||policyDTO.getPolicy()==null?true:false;
        if(res) throw new CommonException("缺少参数");
    }

    private void validateAuth(PolicyDTO policyDTO){
        validatePolicy(policyDTO);
        boolean res2 = Strings.isNullOrEmpty(policyDTO.getUserId())||!policyDTO.getUserId().equalsIgnoreCase(Info.ADMIN.getCode())?true:false;
        if(res2) throw new CommonException("请检查是否有管理员帐号权限");
    }

    @PostMapping("/insert")
    public ResultTO insert(@RequestBody PolicyDTO policyDTO){
        validateAuth(policyDTO);
        policyService.insert(policyDTO.getPolicy(),policyDTO.getUserId());
        return new ResultTO();
    }

    @PostMapping("/delete")
    public ResultTO delete(@RequestBody PolicyDTO policyDTO){
        validateAuth(policyDTO);
        policyService.delete(policyDTO.getPolicy().getId());
        return new ResultTO();
    }

    @PostMapping("/update")
    public ResultTO update(@RequestBody PolicyDTO policyDTO){
        validateAuth(policyDTO);
        policyService.update(policyDTO.getPolicy());
        return new ResultTO();
    }

    @GetMapping("/selectById")
    public ResultTO selectById(Integer id){
//        validatePolicy(policyDTO);
//        validateAuth(policyDTO);
        if(id==null) throw new CommonException("请检查参数");

        return new ResultTO(policyService.selectById(id));
    }

    @GetMapping("/getAll")
    public ResultTO getAll(){
        return new ResultTO(policyService.selectAll());
    }
}
