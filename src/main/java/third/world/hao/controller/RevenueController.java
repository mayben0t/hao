package third.world.hao.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;
import third.world.hao.dto.ResultTO;
import third.world.hao.model.Revenue;
import third.world.hao.service.Count;
import third.world.hao.service.RevenueService;

/**
 * @program: hao
 * @description:
 *
 * @create: 2019-04-10 23:37
 **/
@RestController
@RequestMapping("/revenue")
@Api("revenue(税收表)的相关接口")
public class RevenueController {
    @Autowired
    private RevenueService revenueService;
    @Autowired
    private Count count;

    @GetMapping("/getAll")
    public ResultTO getAll(String userId){
        return new ResultTO(revenueService.getAll(userId));
    }

    @PostMapping("/insert")
    @ApiOperation(value="税收信息插入", notes="插入",produces = "application/json")
    public ResultTO insert(@RequestBody Revenue revenue){
        revenueService.insert(revenue);
        return new ResultTO();
    }

    @PostMapping("/update")
    @ApiOperation(value="税收信息修改", notes="修改",produces = "application/json")
    public ResultTO update(@RequestBody Revenue revenue){
        revenueService.update(revenue);
        return new ResultTO();
    }

    @PostMapping("/delete")
    @ApiOperation(value="税收信息删除", notes="删除",produces = "application/json")
    public ResultTO delete(int id){
//        Assert
        revenueService.delete(id);
        return new ResultTO();
    }

    @GetMapping("/getInfo")
    @ApiOperation(value="税收信息 信息查询", notes="信息查询",produces = "application/json")
    public ResultTO getInfo(Integer month,Integer beforeSalary,Double sumSalary,Double fiveMoney,Double sumFive,Double zhuanMoney,Double sumZhuan,Double leiJiao){
       return new ResultTO(count.getData(month,beforeSalary,sumSalary,fiveMoney,sumFive,zhuanMoney,sumZhuan,leiJiao));
//        return null;
    }
}
