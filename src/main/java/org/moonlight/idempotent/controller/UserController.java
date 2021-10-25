package org.moonlight.idempotent.controller;

import org.moonlight.idempotent.annotation.Idempotent;
import org.moonlight.idempotent.entity.User;
import org.moonlight.idempotent.entity.vo.ResultVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Moonlight
 */
@RestController
public class UserController {

    @Idempotent
    @PostMapping("/save")
    public ResultVo save(@RequestBody User user) {
        System.out.println("save user " + user);
        return ResultVo.ok().put("msg", "save user success").put("info", user);
    }

}
