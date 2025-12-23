package com.backend.security.ws.converter;

import com.backend.security.bean.Token;
import com.backend.security.ws.dto.TokenDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class TokenConverter {

    private final UserConverter converter;

    public TokenConverter(UserConverter converter) {
        this.converter = converter;
    }

    public Token toBean(TokenDto dto){
        if (dto == null) {
            return null;
        }
        Token bean = new Token();
        BeanUtils.copyProperties(dto,bean);
        bean.setUser(converter.toBean(dto.getUser()));
        return bean;
    }

    public TokenDto toDto(Token bean){
        if (bean == null) {
            return null;
        }
        TokenDto dto = new TokenDto();
        BeanUtils.copyProperties(bean,dto);
        dto.setUser(converter.toDto(bean.getUser()));
        return dto;
    }
}
