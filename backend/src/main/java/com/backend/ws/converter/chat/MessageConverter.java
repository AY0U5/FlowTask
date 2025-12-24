package com.backend.ws.converter.chat;

import com.backend.bean.chat.Message;
import com.backend.ws.dto.chat.MessageDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class MessageConverter {

    public Message toBean(MessageDto dto){
        if (dto == null) {
            return null;
        }
        Message bean = new Message();
        BeanUtils.copyProperties(dto,bean);
        return bean;
    }

    public MessageDto toDto(Message bean){
        if (bean == null) {
            return null;
        }
        MessageDto dto = new MessageDto();
        BeanUtils.copyProperties(bean,dto);
        return dto;
    }
}
