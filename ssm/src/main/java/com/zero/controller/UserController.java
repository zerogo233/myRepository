package com.zero.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zero.pojo.User;
import com.zero.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService usersService;
	
	@RequestMapping("/show")
	public String showInfo(Model model){
		List<User> list = usersService.findUserAll();
		model.addAttribute("list", list);
		return "showUsers";
	}

	@RequestMapping(value = "/user/login", method = RequestMethod.POST)
    @ResponseBody
    private Map<String, Object> login(HttpServletRequest req, HttpServletResponse res) {
        // 表单
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User user = usersService.findUserByUsername(username);

        if (user != null) {
            if (user.getPassword().equals(password)) {
                req.getSession().setAttribute("user", user.getId());
                return JSONResult(0, "用户登录成功", user);
            } else {
                return JSONResult(1, "用户登录失败，密码错误", null);
            }

        } else {
            return JSONResult(1, "用户登录失败，用户名不存在", null);
        }
    }
	
	private Map<String, Object> JSONResult(int code, String message, Object data) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code", code);
        result.put("message", message);
        result.put("data", data);
        return result;
    }
}
