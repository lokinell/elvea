package cn.elvea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    /**
     * 查看个人信息
     *
     * @return
     */
    @RequestMapping(value = "profile", method = RequestMethod.GET)
    public String profile() {
        return "user/profile";
    }

    /**
     * 修改个人信息
     *
     * @return
     */
    @RequestMapping(value = "account", method = RequestMethod.GET)
    public String account() {
        return "user/account";
    }

    /**
     * 修改个人密码
     *
     * @return
     */
    @RequestMapping(value = "password", method = RequestMethod.GET)
    public String password() {
        return "user/password";
    }

    /**
     * 用户列表
     *
     * @return
     */
    @RequestMapping("user/index")
    public String index() {
        return "user/index";
    }

    /**
     * 查看用户详情
     *
     * @return
     */
    @RequestMapping("user/view")
    public String view() {
        return "user/view";
    }

    /**
     * 修改用户信息
     *
     * @return
     */
    @RequestMapping("user/update/{id}")
    public String update(@PathVariable("id") long id) {
        return "user/update";
    }

    /**
     * 删除用户
     *
     * @return
     */
    @RequestMapping("user/delete/{id}")
    public String delete(@PathVariable("id") long id) {
        return "user/update";
    }

    /**
     * 修改用户密码
     *
     * @return
     */
    @RequestMapping("user/change/password/{id}")
    public String changePassword(@PathVariable("id") long id) {
        return "user/update";
    }
}
