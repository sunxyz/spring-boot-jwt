package com.sj.commons.web.user;

import com.sj.commons.data.AbstractIdEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.Assert;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * User
 *
 * @author yangrd
 * @date 2019/05/13
 */
@Data
@EqualsAndHashCode(callSuper = true)

@Entity
@Table(name = "t_user")
public class User extends AbstractIdEntity implements UserDetails {


    @Column(unique = true)
    private String username;

    private String nickname;

    private String password;

    private String roles;

    private String avatar;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Objects.isNull(roles) ? Collections.emptyList() : (roles.contains(",") ? AuthorityUtils.createAuthorityList(roles.split(",")) : Collections.singletonList(new SimpleGrantedAuthority(roles)));
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
