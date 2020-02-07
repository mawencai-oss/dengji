package com.lzxs.dengji.controllor;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lzxs.dengji.config.AjaxResult;
import com.lzxs.dengji.domain.Registration;
import com.lzxs.dengji.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;
    @RequestMapping(value = "/registration",method = RequestMethod.POST)
    public AjaxResult registration(Registration registration){
        int i=registrationService.insert(registration);
        if(i>0)
            return AjaxResult.success();
        return AjaxResult.error();
    }
    @GetMapping("/findallreg")
    public AjaxResult findallreg(@RequestParam(value = "page",required = false,defaultValue = "1") Integer page){
        List<Registration> list=registrationService.selectAll();
        PageHelper.startPage(page,5);
        PageInfo pageInfo=new PageInfo(list);
        return AjaxResult.successData(0,pageInfo);
    }
    @GetMapping("/deleteregbyid")
    public AjaxResult deleteregbyid(Integer id){
        int i=registrationService.deleteregbyid(id);
        if(i>0)
            return AjaxResult.success();
        return AjaxResult.error();
    }
    @PostMapping("/findbyexample")
    public AjaxResult findbyexample(Registration registration){
        List<Registration> registrationList=registrationService.findbyexample(registration);
        return AjaxResult.successData(0,registrationList);
    }
}
