package third.world.hao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import third.world.hao.dto.ResultTO;
import third.world.hao.model.QuanWei;
import third.world.hao.service.QuanweiService;

import java.util.List;

@Controller
@ResponseBody
public class QuanWeiController {
    @Autowired
    private QuanweiService quanweiService;

    @RequestMapping(value = "/Authority/insert3",method = RequestMethod.POST)
    ResultTO insert(QuanWei quanWei){
        quanweiService.insert(quanWei);
        return new ResultTO();
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String helloWorld(){
        return "hello，接口";
    }


//
//    ResultTO delete(int id);
//
//    ResultTO update(QuanWei quanWei);
//
//    ResultTO getAll();


}
