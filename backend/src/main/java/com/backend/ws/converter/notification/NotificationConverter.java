package com.backend.ws.converter.notification;

import com.backend.bean.notification.Notification;
import com.backend.ws.dto.notification.NotificationDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class NotificationConverter {

    public Notification toBean(NotificationDto dto){
        if (dto == null) {
            return null;
        }
        Notification bean = new Notification();
        BeanUtils.copyProperties(dto,bean);
        return bean;
    }

    public NotificationDto toDto(Notification bean){
        if (bean == null) {
            return null;
        }
        NotificationDto dto = new NotificationDto();
        BeanUtils.copyProperties(bean,dto);
        return dto;
    }
}
