package com.backend.ws.converter.task;

import com.backend.bean.task.Task;
import com.backend.ws.dto.task.TaskDto;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class TaskConverter {

    public Task toBean(TaskDto dto){
        if (dto == null) {
            return null;
        }
        Task bean = new Task();
        BeanUtils.copyProperties(dto,bean);
        return bean;
    }

    public TaskDto toDto(Task bean){
        if (bean == null) {
            return null;
        }
        TaskDto dto = new TaskDto();
        BeanUtils.copyProperties(bean,dto);
        return dto;
    }
}
