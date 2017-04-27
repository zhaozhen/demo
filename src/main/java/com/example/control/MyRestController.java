package com.example.control;


import com.example.server.ActivitiService;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 2017/4/26.RestController
 */
@RestController
public class MyRestController {
    @Autowired
    private ActivitiService myservice;

    //开启流程实例
    @RequestMapping(value = "/processes/{personId}/{compId}", method = RequestMethod.GET)
    public void startProcessInstance(@PathVariable Long personId, @PathVariable Long compId) {
        myservice.startProcess(personId, compId);
    }

    @RequestMapping(value = "/tasks", method = RequestMethod.GET)
    public List<TaskRepresentation> getTasks(@RequestParam String assignee) {
        List<Task> tasks = myservice.getTasks(assignee);
        List<TaskRepresentation> dtos = new ArrayList<TaskRepresentation>();
        for (Task task : tasks) {
            dtos.add(new TaskRepresentation(task.getId(), task.getName()));
        }
        return dtos;
    }

    //完成任务
    @RequestMapping(value = "/complete/{joinApproved}/{taskId}", method = RequestMethod.GET)
    public String complete(@PathVariable Boolean joinApproved, @PathVariable String taskId) {
        myservice.completeTasks(joinApproved, taskId);
        return "ok";
    }

    static class TaskRepresentation {
        private String id;
        private String name;

        public TaskRepresentation(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
}
