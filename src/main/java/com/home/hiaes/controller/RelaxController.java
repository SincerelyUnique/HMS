/**
 * Copyright (C) 2017 IFlyTek. All rights reserved.
 */
package com.home.hiaes.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 * <code>RelaxController</code>
 * </p>
 * Description:
 *
 * @author Mcchu
 * @date 2018/2/2 11:08
 */
@RequestMapping("relax")
@Controller
@Log4j
public class RelaxController {

    @GetMapping("rose")
    public String index(){
        return "relax/rose";
    }
}
