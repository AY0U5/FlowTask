package com.backend.ws.converter.chat;

import com.backend.bean.chat.Chat;
import com.backend.ws.dto.chat.ChatDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ChatConverter {

    public Chat toBean(ChatDto dto){
        if (dto == null) {
            return null;
        }
        Chat bean = new Chat();
        BeanUtils.copyProperties(dto,bean);
        return bean;
    }

    public ChatDto toDto(Chat bean){
        if (bean == null) {
            return null;
        }
        ChatDto dto = new ChatDto();
        BeanUtils.copyProperties(bean,dto);
        return dto;
    }
}
