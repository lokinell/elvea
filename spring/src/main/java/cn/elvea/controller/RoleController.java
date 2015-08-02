package cn.elvea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("role")
public class RoleController {
    /**
     * 角色列表
     *
     * @return
     */
    @RequestMapping("index")
    public String index() {
        return "role/index";
    }

    /**
     * 查看用户详情
     *
     * @return
     */
    @RequestMapping("view/{id}")
    public String view(@PathVariable("id") long id) {
        return "role/view";
    }

    /**
     * 修改用户信息
     *
     * @return
     */
    @RequestMapping("update/{id}")
    public String update(@PathVariable("id") long id) {
        return "role/update";
    }

    /**
     * 删除用户
     *
     * @return
     */
    @RequestMapping("delete/{id}")
    public String delete(@PathVariable("id") long id) {
        return "role/update";
    }
}
