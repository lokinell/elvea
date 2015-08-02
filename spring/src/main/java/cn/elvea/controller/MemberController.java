package cn.elvea.controller;

import cn.elvea.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/member")
public class MemberController {
    @RequestMapping(method = RequestMethod.GET, value = "login")
    public String index() {
        return "member/login";
    }

    @RequestMapping(method = RequestMethod.POST, value = "login")
    public String index(@ModelAttribute("member") Member member) {
        return "member/login";
    }
}
