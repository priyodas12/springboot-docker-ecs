package learn.aws.springbootdockerecs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.UUID;

@RestController
@RequestMapping("/docker")
public class ECSController {

    @GetMapping("/{name}")
    public String fromDockerImage(@PathParam("name") String name){
        return "Welcome to AWS ECS instance::"+ UUID.randomUUID()+" saying hello to >> "+name;
    }
}
