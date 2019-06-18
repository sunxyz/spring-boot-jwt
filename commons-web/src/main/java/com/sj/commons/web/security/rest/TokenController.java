package com.sj.commons.web.security.rest;

import com.sj.commons.web.user.UserRegisterService;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

/**
 * TokenController
 *
 * @author yangrd
 * @date 2019/04/24
 */
@AllArgsConstructor

@RestController
public class TokenController {

    private UserTokenService userTokenService;

    private UserRegisterService userRegisterService;

    @PostMapping("token/reg")
    public void register(String username,String password){
        userRegisterService.register(username,password);
    }

    @PostMapping("token/login")
    public String login(@RequestBody UserLoginDTO loginDTO) {
        return userTokenService.signIn(loginDTO.getUsername(), loginDTO.getPassword());
    }

    @GetMapping("/me")
    public UserDetails whoAmI(Principal principal) {
        return (UserDetails) ((UsernamePasswordAuthenticationToken) principal).getPrincipal();
    }

    @GetMapping("token/refresh")
    public String refresh(HttpServletRequest request) {
        return userTokenService.refresh(request.getRemoteUser());
    }

}
